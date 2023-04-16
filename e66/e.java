package e66.e;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class e	// class@001515
{
    public static final SharedPreferences a;

    static {
       e.a = b.b("LocationPreferenceHelper");
    }
    public static boolean a(){
       return e.a.getBoolean("alwaysRejectLocationPermission", false);
    }
    public static ConcurrentHashMap b(Type p0){
       String str = e.a.getString("featureDialogKeyMap", "{}");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void c(boolean p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("alwaysRejectLocationPermission", p0);
       g.a(uEditor);
    }
    public static void d(ConcurrentHashMap p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("featureDialogKeyMap", b.e(p0));
       g.a(uEditor);
    }
    public static void e(String[] p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("last_migrate_info_array", b.e(p0));
       g.a(uEditor);
    }
}
