package exercise.loop;

public class Ex8For {

	public static void main(String[] args) {
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=line-i;j++) {
			System.out.print(" ");	
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int x=1;x<=line-1;x++) {
			for(int y=1;y<=x;y++) {
			System.out.print(" ");	
			}
			for(int z=1;z<=((line-x)*2)-1;z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
