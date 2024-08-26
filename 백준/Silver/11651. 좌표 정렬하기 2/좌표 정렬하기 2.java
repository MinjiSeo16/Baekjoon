import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
     public static void main(String[] args) throws IOException{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());
         int arr[][] = new int[n][2];
         
         for(int i=0; i<n; i++){
             StringTokenizer st = new StringTokenizer(reader.readLine());
             arr[i][0] = Integer.parseInt(st.nextToken());
             arr[i][1] = Integer.parseInt(st.nextToken());
         }
         
         Arrays.sort(arr,(a,b)->{
             if(a[1]==b[1]){ //y가 같으면 
                 return a[0] - b[0]; //x값 비교
             }else{
                 return a[1] - b[1];
             }
         });
         
         for(int i=0; i<n; i++){
             System.out.println(arr[i][0] + " " + arr[i][1]);
         }
     }
}