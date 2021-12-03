package data_structure_td1;

public class Fraction {
	public int num;
    public int den;
    
    public Fraction(final int num, final int den) {
        this.num = num;
        this.den = den;
    }
    
    public Fraction multiply(final Fraction other) {
        final Fraction newfract = new Fraction(this.num * other.num, this.den * other.den);
        return newfract;
    }
    
    public Fraction add(final Fraction other) {
        final int a = this.num;
        final int b = this.den;
        final int c = other.num;
        final int d = other.den;
        final Fraction newfract = new Fraction(a * d + b * c, b * d);
        return newfract;
    }
    
    public Fraction simplify() {
        final int div = PGCD.pgcd(this.num, this.den);
        final int new_num = this.num / div;
        final int new_den = this.den / div;
        final Fraction newfract = new Fraction(new_num, new_den);
        return newfract;
    }
    
    public void show() {
        final String a = String.valueOf(this.num);
        final String b = String.valueOf(this.den);
        System.out.println(String.valueOf(a) + "/" + b);
    }
}



