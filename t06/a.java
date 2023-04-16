package t06.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class a	// class@002455
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static long a(){
       return a.a.getLong("apmLaunchCount", 0);
    }
    public static int b(){
       return a.a.getInt("ColdLaunchCountVersionCode", 100);
    }
    public static boolean c(){
       return a.a.getBoolean("isTrace", false);
    }
}
