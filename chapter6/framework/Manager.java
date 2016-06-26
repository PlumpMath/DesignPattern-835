package chapter6.framework;
import java.util.HashMap;

import chapter6.NullProduct;

public class Manager {
	private HashMap <String, Product> showcase = new HashMap<String, Product>();
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	public Product create(String protoname) {
		if(!showcase.containsKey(protoname)) {
			System.out.println("存在しないプロダクト名です。");
			return NullProduct.getInstance();
		}
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
