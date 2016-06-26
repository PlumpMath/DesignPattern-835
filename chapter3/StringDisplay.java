package chapter3;

import java.io.UnsupportedEncodingException;

public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;
	private boolean isUnCorrectEncodeType = false;
	public StringDisplay(String string) {
		this.string = string;
		try {
			this.width = string.getBytes("SJIS").length;
		} catch(UnsupportedEncodingException uee) {
			System.out.println("不正な文字コードが指定されました。");
			isUnCorrectEncodeType = true;
		}

	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		if(isUnCorrectEncodeType) return;
		System.out.println( "|" + string + "|" );
	}

	@Override
	public void close() {
		printLine();
	}
	private void printLine() {
		if(isUnCorrectEncodeType) return;
		System.out.print("+");
		for ( int i = 0; i < width; i++ ) {
			System.out.print("-");
		}
		System.out.println("+");

	}

}
