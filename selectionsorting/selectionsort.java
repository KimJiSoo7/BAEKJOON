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
		// Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(br.readLine());
		int[] iValue = new int[N];
		int min, i, j;

		for (i = 0; i < N; i++) {
			iValue[i] = Integer.parseInt(br.readLine());
		}

		// ******************오름차순 정렬******************
		// ******************Selection_Sorting******************
		for ( i = 0; i < (N - 1); i++) {
			min = i;
			for (j = i + 1; j < N; j++) {
				if (iValue[min] > iValue[j])
					min = j;
			}
			int temp = iValue[i];
			iValue[i] = iValue[min];
			iValue[min] = temp;
		}
		for (i = 0; i < iValue.length; i++) {
			bw.write(iValue[i] + " ");
		}
		bw.write('\n');
		bw.flush();
	}
}
