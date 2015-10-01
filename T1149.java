import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

class T1149{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			String ss = in.next();
			String sub ;
			Map <String,Integer> map = new TreeMap<String, Integer>();
			
			for(int i = 0; i < ss.length(); i++){
				for(int j = i+1 ; j <= ss.length() ; j++){
					sub = ss.substring(i,j);
					if(map.get(sub) == null){
						map.put(sub,1);
					}
					else{
						int value = map.get(sub);
						map.put(sub,++value);
					}
				}
			}
			
			for(Map.Entry<String,Integer> entry: map.entrySet()){
				if(entry.getValue() > 1){
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			}
			
		}
	}
}