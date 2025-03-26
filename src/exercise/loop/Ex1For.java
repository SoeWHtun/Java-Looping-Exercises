package exercise.loop;

public class Ex1For {

	public static void main(String[] args) {
		char[] apb = {'A','B','C','D','E'};
		int line=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=line-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i-1;k++) {
				System.out.print(apb[k]+" ");
			}
			System.out.println("");
		}
	}
}
