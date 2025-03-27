package exercise.loop;

public class Ex7While {

	public static void main(String[] args) {
		int line=4;
		int i=1;
		while(i<=line) {
			int j=1;
			while(j<=i-1) {
				System.out.print(" ");
				j++;
			}
			int k=7;
			while(k>=(i*2)-1) {
				System.out.print("*");
				k--;
			}
			System.out.println("");
			i++;
		}
		int x=1;
		while(x<=line-1) {
			int y=1;
			while(y<=(line-x)-1) {
				System.out.print(" ");
				y++;
			}
			int z=1;
			while(z<=(x*2)+1) {
				System.out.print("*");
				z++;
			}
			System.out.println("");
			x++;
		}
	}

}
