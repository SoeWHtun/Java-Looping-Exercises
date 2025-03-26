package exercise.loop;

public class Ex3While {

	public static void main(String[] args) {
		int line=7;
		int i=1;
		while(i<=line) {
			int j=0;
			while(j<=line-i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
