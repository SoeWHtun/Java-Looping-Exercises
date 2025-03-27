package exercise.loop;

public class Ex4While {

	public static void main(String[] args) {
		int line=5;
		char[] num = {'1', '2', '3', '4', '5'};
		int i=1;
		while(i<=line) {
			int j=0;
			while(j<=line-i) {
				System.out.print(num[j]+" ");
				j++;
			}
			System.out.println("");
			i++;
		}
		int u=1;
		while(u<=line-1) {
			int v=0;
			while(v<=u) {
				System.out.print(num[v]+" ");
				v++;
			}
			System.out.println();
			u++;
		}
	}

}
