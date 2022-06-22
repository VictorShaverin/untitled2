import com.viktor.ComplexNumber;

import java.util.Scanner;

public class LessThanTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number a :");
        int a = in.nextInt();
        System.out.println("enter the number b :");
        int b = in.nextInt();
        System.out.println("enter the number c :");
        int c = in.nextInt();
        int Q = 3 * b - a * a / 9;
        int R = 9 * a * b - 2 * a * a * a - 27 * c / 54;
        int S = Q * Q * Q + R * R;
        if (S < 0) {
            double f;
            f = 1 / 3 * Math.acos(R / Math.sqrt(-Q * -Q * -Q));
            double x1, x2, x3;
            x1 = 2 * Math.sqrt(-Q) * Math.cos(f) - a / 3;
            x2 = 2 * Math.sqrt(-Q) * Math.cos(f + 2 / 3 * 3.14) - a / 3;
            x3 = 2 * Math.sqrt(-Q) * Math.cos(f - 2 / 3 * 3.14) - a / 3;
            System.out.println("equation root :x1=" + x1 + ",x2=" + x2 + ",x3 =" + x3);
        } else if (S > 0) {
            if (Q > 0) {
                double f;
                f = 1 / 3 * Math.cosh(Math.abs(R) / Math.sqrt(Q * Q * Q));
                double x1;
                x1 = -2 * Math.signum(R) * Math.sqrt(Q) * f - a / 3;
                double realx2, imaginaryx2;
                realx2 = Math.signum(R) * Math.sqrt(Q) * f - a / 3;
                imaginaryx2 = Math.sqrt(3) * Math.sqrt(Q) * f;
                double x3;
                ComplexNumber x2 = new ComplexNumber(realx2, imaginaryx2);
                double realx3, imaginaryx3;
                realx3 = Math.signum(R) * Math.sqrt(Q) * f - a / 3;
                imaginaryx3 = Math.sqrt(3) * Math.sqrt(Q) * f;
                x3=realx3-imaginaryx3 ;
                System.out.println("equation root :x1=" + x1 + ",x2=" + x2 + ",x3 =" + x3);
            } else if (Q < 0) {
                double f;
                f = 1 / 3 * Math.asin(Math.abs(R) / Math.sqrt(Q * Q * Q));
                double x1;
                x1 = -2 * Math.signum(R) * Math.sqrt(Math.abs(Q)) * f - a / 3;
                double realx2, imaginaryx2;
                realx2 = Math.signum(R) * Math.sqrt(Math.abs(Q)) * f - a / 3;
                imaginaryx2 = Math.sqrt(3) * Math.sqrt(Math.abs(Q));
                double x3;
                ComplexNumber x2 = new ComplexNumber(realx2, imaginaryx2);
                double realx3, imaginaryx3;
                realx3 = Math.signum(R) * Math.sqrt(Math.abs(Q)) * f - a / 3;
                imaginaryx3 = Math.sqrt(3) * Math.sqrt(Math.abs(Q));
                x3=realx3-imaginaryx3 ;
                System.out.println("equation root :x1=" + x1 + ",x2=" + x2 + ",x3 =" + x3);
            } else if (Q == 0) {
                double x1;
                x1 = -Math.cbrt(c - (a * a * a) / 27) - a / 3;
                double realx2, imaginaryx2;
                realx2 = -a + x1 / 2;
                imaginaryx2 = 1 / 2 * Math.sqrt(Math.abs((a - 3 * x1) * (a + x1) - 4 * b));
                double x3;
                ComplexNumber x2 = new ComplexNumber(realx2, imaginaryx2);
                double realx3, imaginaryx3;
                realx3 =-a+x1/2;
                imaginaryx3 =1/2*Math.sqrt(Math.abs((a-3*x1)*(a+x1)-4*b));
                x3=realx3-imaginaryx3 ;
                System.out.println("equation root :x1=" + x1 + ",x2=" + x2 + ",x3 =" + x3);
            }
        } else {
            double x1, x2;
            x1 = -2 * Math.signum(R) * Math.sqrt(Q) - a / 3;
            x2 = Math.signum(R) * Math.sqrt(Q) - a / 3;
            System.out.println("equation root :x1=" + x1 + ",x2=" + x2);
        }
    }
}