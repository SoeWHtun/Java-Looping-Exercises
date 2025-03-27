package exercise.loop;

public class Ex2While {

	public static void main(String[] args) {
		char[] num = {'1','2','3','4','5'};
		int line=5;
		int i=1;
		while(i<=line) {
			int j=1;
			while(j<=line-i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=(i*2)-1) {
				System.out.print(num[i-1]);
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
