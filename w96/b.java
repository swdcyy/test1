package w96.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class b	// class@002728
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("DefaultPreferenceHelper");
    }
    public static long a(){
       return b.a.getLong("AppUsedSize", 0);
    }
    public static String b(){
       return b.a.getString("StyleTypeInfo", "");
    }
}
