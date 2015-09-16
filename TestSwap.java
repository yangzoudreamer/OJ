
public class TestSwap {
	public static void swap(char[] shuzi ,int a, int b){
		char c;
		c = shuzi[a];
		shuzi[a] = shuzi[b];
		shuzi[b] = c;
	}
	public static void main(String[] args) {
		
		//char 是基本类型 通过值传递，不是引用传递；只是传值进行运算，不改变传入的参数原始值；
		
		int a = 1;
		int b = 2;
		char[] shuzi = {'A','B'};
		
		swap(shuzi,0,1);
		System.out.println(shuzi[0]+" "+shuzi[1]);
	}
}
