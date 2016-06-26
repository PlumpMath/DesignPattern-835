package chapter6.framework;

public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
	boolean equals(Product p);
	public char getDecorator();
	public void NullProduct();
}
