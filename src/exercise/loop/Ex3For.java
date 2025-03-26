package exercise.loop;

public class Ex3For {

	public static void main(String[] args) {
		int line=7;
		for(int i=1;i<=line;i++) {
			for(int j=0;j<=line-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
