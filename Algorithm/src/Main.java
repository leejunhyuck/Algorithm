import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
	
	

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			
			a[i] = Integer.parseInt(str.nextToken());
			
		}
		
		d[0]=0;
		a[0]=0;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				d[i]=Math.max(d[i], d[i-j]+a[j]);
			}
			
		}
		
		
		bw.write(d[n]+"\n");
		
		
		
		
			
			
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
			
		}

	}
	
	


