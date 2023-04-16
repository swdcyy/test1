package bu7.i;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class i	// class@00048c
{
    public static final SharedPreferences a;

    static {
       i.a = b.b("DefaultPreferenceHelper");
    }
    public static long a(){
       return i.a.getLong("firstColdStartTimeMs", 0);
    }
}
