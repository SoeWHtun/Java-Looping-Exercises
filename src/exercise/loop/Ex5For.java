package exercise.loop;

public class Ex5For {

	public static void main(String[] args) {
		int line = 5;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=(line-i)*2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=line+2;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
