package kr.co.infopub.chapter.s095;
public class CardCaseMain {
	public static void main(String[] args) {
		CardCase cc=new CardCase();
		cc.make();
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // ī�� ����
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // ī�� ����
		cc.print();
		System.out.println("--------------------------");
		cc.sort();
		cc.print();
		System.out.println("--------------------------");
		cc.rsort();
		cc.print();
		System.out.println("--------------------------");
		cc.rambdasort();
		cc.print();
		System.out.println("--------------------------");
		cc.rambdarsort();
		cc.print();
	}
}
