import java.util.Scanner;

class T1170{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int Xmin, Ymin;
			Xmin = in.nextInt();
			Ymin = in.nextInt();
			int nextX, nextY;
			for(int i = 0; i < n - 1 ; i++){
				nextX = in.nextInt();
				nextY = in.nextInt();
				if(Xmin >= nextX){
					Xmin = nextX;
					if(Ymin >= nextY){
						Ymin = nextY;
					}
				}
			}
			System.out.println(Xmin + " " + Ymin);
		}
		
	}
}