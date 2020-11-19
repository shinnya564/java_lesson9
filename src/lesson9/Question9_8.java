package lesson9;

public class Question9_8 {
	public static void main(String[] args) {
		int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
		System.out.println("並び替える前");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");

		System.out.println("並び替える後");
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				int min_data = data[i];
				if(min_data > data[j]) {
					min_data = data[i];
					data[i] = data[j];
					data[j] = min_data;
				}
			}
			System.out.print(data[i] + " ");
		}
	}
}
