import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1152 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 0;
		int i, j;
		String in = br.readLine();
		for (i = 0; i < in.length(); i++) {
			if (in.charAt(i) == ' ') {} 
			else {
				for (j = i; in.charAt(j) != ' '; j++) {
					if(i<in.length())
						i++;
					if((j+1) == in.length())
						break;
				}
				num++;
			}
		}
		System.out.println(num);
	}

}
