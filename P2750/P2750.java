import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] iValue = new int[N];
		int min, i, j;

		for (i = 0; i < N; i++) {
			iValue[i] = Integer.parseInt(br.readLine());
		}
        
        for (i = 0; i < N - 1; i++) {
			for (j = 0; j < N - 1; j++) {
				if (iValue[j] > iValue[j + 1]) {
					int temp = iValue[j];
					iValue[j] = iValue[j + 1];
					iValue[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < iValue.length; i++) {
			bw.write(iValue[i] + " ");
		}
		bw.write('\n');
		bw.flush();
    }
}