import java.util.Scanner;

class T1151{
	public static void main(String args[]){
	       Scanner in = new Scanner(System.in);
		   long n = in.nextInt();
		   long count = n;
		   
		   if(count <= 0 && count >= 300000){
				return;
		   }
		   
		   int[] a = new int[16];
		   int[] b = new int[16];
		   
		   boolean flag = false;
		   
		   
		   while(count>0){
		   
				
		   		a = formatArray(in.nextInt());
				b = formatArray(in.nextInt());
				
			//	for(int t = 0; t < 16; t++){
			//		System.out.print(a[t]);
			//	}
				
			//	System.out.println();
				
			//	for(int t = 0; t < 16; t++){
			//		System.out.print(b[t]);
					
			//	}
				
				//System.out.println();
				
				int[] tmp = new int[16];
				
				for(int i = 0; i < 16;i++)
				{
					for(int j = 0; j < i ; j++)
					{
						tmp[j] = a[j];
					}
					
					for(int m = 0; m < 16-i; m++){   //仅仅是需要移动的元素个数
						a[m] = a[m+i];
					}
					
					for(int k = 16-i ; k < 16; k++)
					{
						a[k] = tmp[i+k-16];
					}
					
				//	for(int t = 0; t < 16; t++){
				//		System.out.print(a[t]);
				//	}
				
				
				//	System.out.println();
					flag = compare(a,b);
					//System.out.println(flag);
					
					
					
					if(flag == true)
					{	
						System.out.println("YES");
						break;
					}
					else{
						continue;
					}
				}
				
				if(!flag)
					{	
						System.out.println("NO");
					}
				
				count--;
		   }
		   
		   in.close();
		   return;
	}
	
	
	public static int[] formatArray(int tmp){
		
		int remains;
		int div;
		div = tmp;
		int[] newArray = new int[16];
		for(int i = 15; i > -1; i--)
		{
			remains = div % 2;
			div = div / 2;
			newArray[i] = remains;	
		}
		
		return newArray;
	}
	
	
	
	public static boolean compare(int[] a, int[] b){
		boolean flag = true;
		int i = 0;
		
		while(i < 16){
			if(a[i] != b[i])
				{
					flag = false;
				}
			i++;
		}
		
		return flag;
	}
}