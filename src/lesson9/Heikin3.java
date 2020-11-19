package lesson9;

public class Heikin3 {
	public static void main(String[] args) {
		int[] ten;
		int sum = 0;
		double heikin;

		ten = new int[5];
		ten[0] = 63;
		ten[1] = 90;
		ten[2] = 75;
		ten[3] = 45;
		ten[4] = 80;
		for(int i = 0; i < ten.length; i++) {
			sum += ten[i];
		}
		heikin = sum / 5.0;

		System.out.println("国語は" + ten[0]+ "点");
		System.out.println("数学は" + ten[1] + "点");
		System.out.println("英語は" + ten[2] + "点");
		System.out.println("理科は" + ten[3] + "点");
		System.out.println("社会は" + ten[4] + "点");
		System.out.println("平均点は" + heikin + "点");
	}
}
