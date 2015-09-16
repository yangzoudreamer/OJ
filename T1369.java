import java.util.Scanner;

/*字符串的全排列，按字典序排列，同时不能因为有重复的字符而出现重复的排列序列
 使用递归，将其递归不断分成第一个字符，和其后的一段字符串。其后字符串先排序再全排列（为了方便字典序），
 最后与头字符拼接，即成新的排列序列*/

public class T1369 {

	public static void main(String[] args) {

		char[] arr = new char[10];
		int length;
		int i;
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			arr = in.next().toCharArray();
			length = arr.length;
			bubbleSort(arr, 0, length);
			Permuration(arr, 0, length);
		}
	}

	public static void Permuration(char[] arrays, int k, int length) {

		System.out.println("进入一层递归，当前指针在 " + k);
		System.out.println("指针在 " + k + " 的位置上，对第 " + k + " 个字符之后的字符串全排列");

		int j;
		if (k == length) {
			for (j = 0; j < length; j++) {
				System.out.print(arrays[j]);
			}
			System.out.println("---------------");
		} else {
			for (j = k; j < length; j++) {
				if (k != j && arrays[j] == arrays[k]) {
					continue;
				}
				swap(arrays, k, j);
				System.out.println("交换第 " + k + " 个字符与第 " + j
						+ "个字符，然后再对其后所有字符全排列");
				// printArray(arrays);System.out.println();
				bubbleSort(arrays, k + 1, length);
				// printArray(arrays);System.out.println();
				Permuration(arrays, k + 1, length);
				bubbleSort(arrays, k + 1, length);
			}
		}
		System.out.println("跳出一层递归，当前指针回到 " + k + " 位置");
	}

	public static void bubbleSort(char[] arrays, int begin, int length) {

		for (int i = begin; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arrays[i] > arrays[j]) {
					swap(arrays, i, j);
				}
			}
		}

	}

	public static void swap(char[] tmp, int a, int b) {
		char c;
		c = tmp[a];
		tmp[a] = tmp[b];
		tmp[b] = c;
	}

	public static void printArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
