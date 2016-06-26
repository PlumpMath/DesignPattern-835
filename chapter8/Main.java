package chapter8;

import chapter8.factory.Factory;
import chapter8.factory.Link;
import chapter8.factory.Page;
import chapter8.factory.Tray;

public class Main {
	public static void main(String[] args) {
		if( args.length != 1 ) {
			System.out.println("Usage: java Main.class.name.of.ConcreateFactory");
			System.out.println("Example 1: java Main.listfactory.listFactory");
			System.out.println("Example 2: java Main.tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);

		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.com/");

		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");

		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite!", "http://www.yahoo.com/");
		Link google = factory.createLink("Google!", "http://www.yahoo.com/");

		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Tray trayyahoo = factory.createTray("Yahoo");
		traynews.add(us_yahoo);
		traynews.add(jp_yahoo);

		Tray traysearch = factory.createTray("サーチエンジン");
		traynews.add(trayyahoo);
		traynews.add(excite);
		traynews.add(google);

		Page page = factory.createPage("LinkPage", "結城 浩");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
