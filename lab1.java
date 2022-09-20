import static java.lang.Math.*;
public class lab1 {
    public static void main(String[] args) {
        int a[]=new int[9];
        int b=20;
        System.out.println("Массив а:");
        for (int k=0; k<9; k=k+1) {
            a[k]=b;
            b=b-2;

            System.out.print(a[k]+ "   ");
        }

        System.out.println(" ");
        System.out.println("Массив x:");
        double x[]=new double[18];
        for (int k=0;k<18; k=k+1) {
           x[k]=-13 + random()*20;

            System.out.print(x[k]+"   ");
        }
        System.out.println("  ");
        System.out.println("Массив h:");
        double h[][]=new double[9][18];
        for (int i=0; i<9; i++ ) {
            for (int j=0; j<18;j++) {
                if (a[i] == 4) {
                    h[i][j] = pow(pow(log(abs(x[j])) / 2, 3) / 2, asin(pow(E, -abs(x[j]))));
                } else if ((a[i] == 8) || (a[i] == 12) || (a[i] == 18) || (a[i] == 20)) {
                    h[i][j] = pow(PI / (0.5 + pow((double) 1 / 4 * pow(x[j] / 3, 2), 3)), 2);
                } else {
                    h[i][j] = pow((atan(cos(pow(((pow(E, x[j]) - 1) / (tan(x[j]))), 2)))) / (pow(E, asin((x[j] - 3) / 2 * E + 1)) - (double) 2 / 3), pow((E * cbrt(x[j]) - 1) / (cbrt(log(abs(x[j])))), pow(cbrt(x[j]) / 3 / 4, 3)));
                }
                    System.out.printf("%13.5f", h[i][j]);
            }
            System.out.println("   ");
        }

    }

}
