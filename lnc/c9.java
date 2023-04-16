package lnc.c9;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.lang.Object;

public class c9	// class@001dbc
{

    public static String a(){
       return Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator;
    }
    public static boolean b(){
       return (Environment.getExternalStorageState()).equals("mounted");
    }
}
