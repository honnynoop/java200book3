package kr.co.infopub.chapter.s094;

public class Recursion {
	
	public static void main(String[] args) {
		int count=pc(5,3);
		System.out.println(count);
	}
	//permutation
	public static int p(int n, int r){
		if(r==0){
			return 1;
		}else{
			return (n-r+1)*p(n,r-1);
		}
	}
	//combination
	public static int c(int n, int r){
		if(n==r || r==0){
			return 1;
		}else{
			return (n-r+1)*c(n,r-1)/r;
		}
	}
	//파스칼의 3각형이용
	public static int pc(int n, int r){
		if(n==r || r==0){
			return 1;
		}else{
			return pc(n-1,r-1)+pc(n-1,r);
		}
	}
}
