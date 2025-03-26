package exercise.loop;

public class Ex6While {

	public static void main(String[] args) {
		int line = 5;
		int i=1;
		while(i<=line) {
			int j=1;
			while(j<=i-1){
				System.out.print(" ");
				j++;
			}
			int k=9;
			while(k>=(i*2)-1) {
				System.out.print("*");
				k--;
			}
			System.out.println();
			i++;
		}
	}

}
