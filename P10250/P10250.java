import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int T, H, W, N;
		int i, j, k;
		i = j = k = 0;
		StringTokenizer stn;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.print("Input: ");
		T = Integer.parseInt(br.readLine());

		for (i = 0; i < T; i++) {
			stn = new StringTokenizer(br.readLine());
			H = Integer.parseInt(stn.nextToken());
			W = Integer.parseInt(stn.nextToken());
			N = Integer.parseInt(stn.nextToken());

			for (j = 1; j <= W; j++) {
				for (k = 1; k <= H; k++) {
					N--;
					if (N==0)
						break;
				}
				if (N==0)
					break;
			}

			if (j < 10)
				bw.write(k + "0" + j + "\n");
			else
				bw.write(k + "" + j + "\n");
		}
		bw.flush();
	}
}
