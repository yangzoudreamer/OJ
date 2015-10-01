import java.util.Scanner;
class T1194{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		while(in.hasNext()){
			int input = in.nextInt();
			int remains =  0;
			int arrays[] = new int[6];
			int flag = 0;
			for(int i = 0; i < 6 ; i++){
				arrays[i] = 0;
			}
			if(input < 8){
				System.out.println(input);
			}
			else{
				while(input!= 0){
					remains = input % 8;
					arrays[flag] = remains;
					input = input / 8;
					flag++;
				}
			
				for(int j = flag-1;j > -1; j--){
					System.out.print(arrays[j]);
				}
				System.out.println();
			}
			
		}
	}
}