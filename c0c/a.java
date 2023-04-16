package c0c.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0004de
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static void a(Map p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("font_id_path_map", b.e(p0));
       g.a(uEditor);
    }
}
