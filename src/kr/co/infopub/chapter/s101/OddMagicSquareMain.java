package kr.co.infopub.chapter.s101;
import java.util.Scanner;
public class OddMagicSquareMain {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("Ȧ�� ������ �Է��ϼ���.");
		int n=scann.nextInt();
		OddMagicSquare odd=new OddMagicSquare(n);
		odd.make();
		odd.print();
	}
}