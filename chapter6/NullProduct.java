package chapter6;

import chapter6.framework.Product;

public class NullProduct implements Product {

	private static Product nullProduct = new NullProduct();

	private NullProduct() {
		// 何もしない
	}

	@Override
	public void use(String s) {
		return;
	}

	@Override
	public Product createClone() {
		return nullProduct;
	}

	public static Product getInstance() {
		return nullProduct;
	}
}
