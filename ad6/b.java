package ad6.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@00004f
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("DefaultPreferenceHelper");
    }
    public static String a(){
       return b.a.getString("LastAppVersionName", "");
    }
    public static int b(){
       return b.a.getInt("switch_dex2oat_failed_count", 0);
    }
    public static int c(){
       return b.a.getInt("trigger_dex2oat_failed_count", 0);
    }
    public static void d(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("switch_dex2oat_failed_count", p0);
       g.a(uEditor);
    }
    public static void e(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("trigger_dex2oat_failed_count", p0);
       g.a(uEditor);
    }
    public static void f(String p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("warmUpCacheInfo", p0);
       g.a(uEditor);
    }
}
