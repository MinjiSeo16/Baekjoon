import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sortedArr[i] = arr[i];
        }
        
        Arrays.sort(sortedArr);
      
        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for(int i=0; i<N; i++){
            if(!map.containsKey(sortedArr[i])){
                map.put(sortedArr[i], k);
                k++;
            }
        }
       
        for(int i=0; i<N; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}
