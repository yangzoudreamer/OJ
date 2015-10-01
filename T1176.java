import java.util.Scanner;
import java.lang.Math;

class T1176{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int high = 0;
			int n = in.nextInt();
			int d;
			int tree[] = new int[1000];
			
			for(int i = 0; i < 1000; i++){
				tree[i] = 0;
			}
			
			for(int i = 0; i < n; i++){
				tree[i] = in.nextInt();
			}
			d = in.nextInt();
			int tmp = n;
			while(tmp != 0){
				tmp /= 2;
				high++;
			}
			
			if(high == 0){
				System.out.print("EMPTY");
			}
			
			if(d > high){
				System.out.print("EMPTY");
			}
			else if(d == high){
				for(int i = (int)Math.pow(2,d-1); i <= n; i++){
					if(i == n){
						System.out.println(tree[i-1]);
					}
					else{
						System.out.print(tree[i-1] + " ");
					}
				}
			}
			else{
				for(int i = (int)Math.pow(2,d-1); i < (int)Math.pow(2,d); i++){
					if(i == (int)Math.pow(2,d)-1){
						System.out.println(tree[i-1]);
					}
					else{
						System.out.print(tree[i-1] + " ");
					}
				}
			}
			
		}
		
	}
}