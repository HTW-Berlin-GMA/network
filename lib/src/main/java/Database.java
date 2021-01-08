import com.google.gson.Gson;
import database.DbCred;
import database.JDBCAccess;
import mode.ModelType;
import org.checkerframework.checker.units.qual.A;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

public class Database implements IDatabase {
    private JDBCAccess db;
    private ModelType mt;
    private File json;
    private Gson gson = new Gson();

    @Override
    public boolean connect() {
        this.db = new JDBCAccess(DbCred.url,DbCred.user,DbCred.password);
        return true;
    }

    @Override
    public boolean disconnect() {
        this.db.close_database();
        return true;
    }

    @Override
    public boolean save(Object model) {
        if (model instanceof A)
        String jsonString = gson.toJson(model);
        File file = new File("gma.json");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream pw = new PrintStream(fos);
            //pw.print(jsonString);

            db.executeQuery("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Desktop.getDesktop().open(file);
        return true;
    }

    @Override
    public File load(String address) {

        return null;
    }
}
