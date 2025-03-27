package exercise.loop;

public class Ex7For {

	public static void main(String[] args) {
		int line=4;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=7;k>=(i*2)-1;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int x=1;x<=line-1;x++) {
			for(int y=1;y<=(line-x)-1;y++) {
				System.out.print(" ");
			}
			for(int z=1;z<=(x*2)+1;z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
