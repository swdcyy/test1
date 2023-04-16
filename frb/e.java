package frb.e;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.HashMap;

public final class e	// class@0029da
{
    public static final SharedPreferences a;

    static {
       e.a = b.b("NearbyLocationPreferenceHelper");
    }
    public static void a(String p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("city_map_version", p0);
       g.a(uEditor);
    }
    public static void b(HashMap p0){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putString("city_name_map", b.e(p0));
       g.a(uEditor);
    }
}
