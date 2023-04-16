package bx.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0002c9
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static void a(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("lastRequestPermissionTime", p0);
       g.a(uEditor);
    }
}
