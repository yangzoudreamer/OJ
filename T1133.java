import java.math.BigDecimal;
import java.util.Scanner;

class T1133{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int count = in.nextInt();
			int a[] = new int[10];
			int b[] = new int[10];
			int stuScore = 0;
			double sumScore = 0;
			int sumPoint = 0;
			
			for(int i = 0; i < 10; i++){
				a[i] = 0;
				b[i] = 0;
			}
			
			for(int i = 0; i < count; i++){
				a[i] = in.nextInt();
				sumPoint += a[i];
			}
			for(int i = 0; i < count; i++){
				b[i] = in.nextInt();
//				sumScore += getPoint(b[i]);
				sumScore += a[i] * getPoint(b[i]);
			}
			//对格式进行处理，处理考虑测试整数情况，发现小数位2个都是0，只会输出一个小数位，因此强制转为2个小数位的字符串格式
			BigDecimal bigDecimal = new BigDecimal(sumScore / sumPoint);
			
			double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			
			String resultString = String.valueOf(result);
			
			if(resultString.length() == 3){
				resultString = resultString + "0";
			} 
			
			System.out.println(resultString);
			
			
		}
	}
	
	public static double getPoint(int score){
		double point = 0;
		
		if(score < 60)
			point = 0;
		else if(60<= score && score <= 63){
			point = 1.0;
		}
		else if(64<= score && score<= 67){
			point = 1.5;
		}
		else if(68<= score && score<= 71){
			point = 2.0;
		}
		else if(72<= score && score<= 74){
			point = 2.3;
		}
		else if(75<= score && score<= 77){
			point = 2.7;
		}
		else if(78<= score && score<= 81){
			point = 3.0;
		}
		else if(82<= score && score<= 84){
			point = 3.3;
		}
		else if(85<= score && score<= 89){
			point = 3.7;
		}
		else if(90<= score && score<= 100){
			point = 4.0;
		}
		
		return point;
	}
}