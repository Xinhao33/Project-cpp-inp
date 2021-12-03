package data_structure_td1;

public class PGCD {
	public static int pgcd(int a, int b) {
        for (int r = a; r != 0; r = a % b, a = b, b = r) {}
        return Math.abs(a);
    }

}
