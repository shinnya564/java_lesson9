package lesson9;

public class Heikin1 {
	public static void main(String[] args) {
		int ten[];
		double heikin;

		ten = new int[3];
		ten[0] = 63;
		ten[1] = 90;
		ten[2] = 75;
		heikin = (ten[0] + ten[1] + ten[2]) / 3;
		System.out.println("国語は" + ten[0]+ "点");
		System.out.println("国語は" + ten[1] + "点");
		System.out.println("国語は" + ten[2] + "点");
		System.out.println("平均点は" + heikin + "点");
	}
}
