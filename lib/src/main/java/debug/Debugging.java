/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package debug;

public class Debugging {
    public static void main(String[] args) {
        m1(10);
        System.out.println("Ende");
    }

    public static void m1(int i) {
        int v = i;
        System.out.println(v);
    }
}
