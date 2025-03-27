package exercise.loop;

public class Ex4For {

	public static void main(String[] args) {
		int line=5;
		char[] num = {'1', '2', '3', '4', '5'};
		for(int i=1;i<=line;i++) {
			for(int j=0;j<=line-i;j++) {
				System.out.print(num[j]+" ");
			}
			System.out.println("");
		}
		for(int u=1;u<=line-1;u++) {
			for(int v=0;v<=u;v++) {
				System.out.print(num[v]+" ");
			}
			System.out.println();
		}
	}

}
