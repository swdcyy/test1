package ta6.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import android.graphics.Point;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.retrofit.region.config.RegionInfo;

public final class a	// class@002488
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static String a(){
       return a.a.getString("AndroidOs", "");
    }
    public static float b(){
       return a.a.getFloat("api_success_log_ratio", 0.01f);
    }
    public static String c(){
       return a.a.getString("BoardPlatform", "");
    }
    public static boolean d(){
       return a.a.getBoolean("EnabledIpv6OnAllApi", false);
    }
    public static List e(Type p0){
       String str = a.a.getString("IdcIpList", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Point f(Type p0){
       String str = a.a.getString("ScreenSize", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static String g(){
       return a.a.getString("SocName", "");
    }
    public static long h(){
       return a.a.getLong("TotolMemoryMB", 0);
    }
    public static String i(){
       return a.a.getString("UQaTag", "");
    }
    public static void j(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("AndroidOs", p0);
       g.a(uEditor);
    }
    public static void k(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("ApiRetryTimes", p0);
       g.a(uEditor);
    }
    public static void l(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("BoardPlatform", p0);
       g.a(uEditor);
    }
    public static void m(RegionInfo p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("RegionInfo", b.e(p0));
       g.a(uEditor);
    }
    public static void n(Point p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("ScreenSize", b.e(p0));
       g.a(uEditor);
    }
    public static void o(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("SocName", p0);
       g.a(uEditor);
    }
    public static void p(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("TotolMemoryMB", p0);
       g.a(uEditor);
    }
}
