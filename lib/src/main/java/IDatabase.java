import java.io.File;

/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

public interface IDatabase {
    boolean connect();
    boolean disconnect();
    boolean save(Object model);
    File load(String address);
}
