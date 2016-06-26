package chapter6;
import chapter6.framework.Manager;
import chapter6.framework.Product;

public class Main {
	public static void main(String[] args) {
		//準備
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		//生成
		Product p1 = manager.create("strong message");
		p1.use("Hello, world.");
		Product p2 = manager.create("warning box");
		p2.use("Hello, world.");
		Product p3 = manager.create("slash box");
		p3.use("Hello, world.");

		Product p4 = new MessageBox('*');
		p4.use("Hello, world.");

		if(p4.equals(p2)) {
			System.out.println("same");
		}


		if(p1 == p2 && p2 == p3 && p1 == p3) {
			System.out.println("全部同じ");
		}
	}

}
