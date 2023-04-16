package ekd.e0;
import com.yxcorp.utility.h;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import skd.b;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.io.File;

public class e0	// class@001555
{
    public static boolean a;
    public static Context b;
    public static File c;
    public static String d;
    public static int e;
    public static b f;

    static {
       e0.f = h.a;
    }
    public static SharedPreferences a(Context p0,String p1,int p2){
       return e0.f.a(p0, p1, p2);
    }
    public static void b(Context p0){
       e0.b = p0;
       b.t(p0);
    }
    public static void c(boolean p0){
       e0.a = p0;
    }
    public static void d(File p0){
       e0.c = p0;
    }
}
