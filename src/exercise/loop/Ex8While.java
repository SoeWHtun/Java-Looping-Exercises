package exercise.loop;

public class Ex8While {

	public static void main(String[] args) {
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
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
		int x=1;
		while(x<=line-1) {
			int y=1;
			while(y<=x) {
			System.out.print(" ");
			y++;
			}
			int z=1;
			while(z<=((line-x)*2)-1) {
				System.out.print("*");
				z++;
			}
			System.out.println("");
			x++;
		}
	}

}
