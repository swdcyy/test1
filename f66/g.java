package f66.g;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class g	// class@0015d9
{
    public static final SharedPreferences a;

    static {
       g.a = b.b("DefaultPreferenceHelper");
    }
    public static boolean a(){
       return g.a.getBoolean("enable_debug_log_of_event", false);
    }
}
