package exercise.loop;

public class Ex6For {

	public static void main(String[] args) {
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=9;k>=(i*2)-1;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
