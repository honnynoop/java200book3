package kr.co.infopub.chapter.s124;
public class HanoiMain {
	public static void main(String[] args) {
		int tray=4;
		Hanoi ha=new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');
	}
}
