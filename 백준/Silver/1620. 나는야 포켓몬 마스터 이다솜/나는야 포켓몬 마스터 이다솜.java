import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer,String> map1 = new HashMap<>();
		HashMap<String,Integer> map2 = new HashMap<>();

		for(int i=0;i<N;i++) {
			String input = br.readLine();
			map1.put(i, input);
			map2.put(input, i);
			
		}
		for(int i=0;i<M;i++) {
			String value = br.readLine();
			if(isNum(value)) {
				int index = Integer.parseInt(value);
				sb.append(map1.get(index-1)+"\n");
			}
			else {
				sb.append(map2.get(value)+1+"\n");
			}
		}
		
		System.out.println(sb);

	}
	
	public static boolean isNum(String arr) {
		for(int i=0;i<arr.length();i++) {
			if(Character.isDigit(arr.charAt(i)))
					return true;
			}
		return false;
	}
}
