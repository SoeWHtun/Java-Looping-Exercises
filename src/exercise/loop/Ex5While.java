package exercise.loop;

public class Ex5While {

	public static void main(String[] args) {
		int line = 5;
		int i=1;
		while(i<=line) {
			int j=1;
			while(j<=(line-i)*2) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=line+2) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
	}

}
