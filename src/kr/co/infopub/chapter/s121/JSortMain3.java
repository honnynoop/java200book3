package kr.co.infopub.chapter.s121;
import kr.co.infopub.chapter.s120.Lotto6Num;
public class JSortMain3 {
	public static void main(String[] args) {
		Lotto6Num lot=new Lotto6Num(1000,100);
		lot.randomMake();        //���ľȵ� ���� 100���� ������ �迭 �����
    	int [] m=lot.getLots();  //���ľȵ� ���� 100���� ������ �迭 ���
    	int []n=new int[m.length];
		System.arraycopy(m, 0, n, 0, m.length);
		JSort.print(n);
		long a=System.nanoTime();
		JSort.InsertSort(n);
		long b =System.nanoTime();
		System.out.println((b-a)+"nano sec");  // 10�� -9��
		JSort.print(n);
	}
}
