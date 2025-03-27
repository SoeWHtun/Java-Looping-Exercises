package exercise.loop;

public class Ex1While {

	public static void main(String[] args) {
		char[] apb = {'A','B','C','D','E'};
		int line=5;
		int i=1;
		while(i<=line) {
			int j=1;
			while(j<=line-i) {
				System.out.print(" ");
				j++;
			}
			int k=0;
			while(k<=i-1) {
				System.out.print(apb[k]+" ");
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
