package kr.co.infopub.chapter.s096;
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
		cc.rambdasort3();
		cc.print();
		System.out.println("--------------------------");
		cc.rambdarsort3();
		cc.print();
	}
}
