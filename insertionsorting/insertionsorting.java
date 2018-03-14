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
		// ******************Insertion_Sorting******************
		for (i = 1; i < N; i++) {
			min = iValue[i];
			j = i - 1;
			while ((j >= 0) && (iValue[j] > min)) {
				iValue[j + 1] = iValue[j];
				j--;
			}
			iValue[j + 1] = min;
		}
		for (i = 0; i < iValue.length; i++) {
			bw.write(iValue[i] + " ");
		}
		bw.write('\n');
		bw.flush();
	}
}
