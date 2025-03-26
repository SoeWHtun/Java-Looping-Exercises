package exercise.loop;

public class Ex2For {

	public static void main(String[] args) {
		char[] num = {'1','2','3','4','5'};
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=line-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print(num[i-1]);
			}
			System.out.println("");
		}
	}

}
