
public class TestSwap {
	public static void swap(char[] shuzi ,int a, int b){
		char c;
		c = shuzi[a];
		shuzi[a] = shuzi[b];
		shuzi[b] = c;
	}
	public static void main(String[] args) {
		
		//char �ǻ������� ͨ��ֵ���ݣ��������ô��ݣ�ֻ�Ǵ�ֵ�������㣬���ı䴫��Ĳ���ԭʼֵ��
		
		int a = 1;
		int b = 2;
		char[] shuzi = {'A','B'};
		
		swap(shuzi,0,1);
		System.out.println(shuzi[0]+" "+shuzi[1]);
	}
}
