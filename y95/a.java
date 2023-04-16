package y95.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@002849
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static String a(){
       return a.a.getString("device_bit", "");
    }
    public static long b(){
       return a.a.getLong("user_reco_bit", 0);
    }
    public static void c(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("device_bit", p0);
       g.a(uEditor);
    }
    public static void d(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("user_reco_bit", p0);
       g.a(uEditor);
    }
}
