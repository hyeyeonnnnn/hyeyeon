import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		//우선순위 큐
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(br.readLine());
			if(value==0) {
				if(queue.isEmpty())
					sb.append(0+"\n");
				else
					sb.append(queue.poll()+"\n");
			}
			else
				queue.add(value);
		}
		
		System.out.println(sb);
	}
}
