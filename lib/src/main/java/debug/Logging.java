/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private static final Logger L = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        L.info("Start");
        m1(10);
        L.info("Ende");
    }

    public static void m1(int i) {
        L.info("Start");
        L.debug("i: " + i);
        int v = i;
        System.out.println(v);
        L.info("Ende");
    }
}
