package data_structure_td1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Fraction f1 = new Fraction(4, 5);
        final Fraction f2 = new Fraction(2, 3);
        final Fraction f3 = f2.multiply(f1);
        final Fraction f4 = new Fraction(4, 8);
        final Fraction f5 = f4.simplify();
        f5.show();
	}

}
