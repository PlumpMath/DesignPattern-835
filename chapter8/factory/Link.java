package chapter8.factory;

public abstract class Link extends Item {
	protected String url;
	public Link(String caption, String url) {
		//super:親クラスのコンストラクタにアクセス
		super(caption);
		this.url = url;
	}
}
