package n80.c;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class c	// class@0026cd
{
    public static final SharedPreferences a;

    static {
       c.a = b.b("ShareRecordPreferenceHelper");
    }
    public static List a(Type p0){
       String str = c.a.getString(b.d("user")+"imSharedTimesRecord", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static long b(){
       return c.a.getLong(b.d("user")+"lastImSharedTime", 0);
    }
    public static String c(){
       return c.a.getString(b.d("user")+"lastShareGuidePlatform", "");
    }
    public static void d(String p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"lastShareGuidePlatform", p0);
       g.a(uEditor);
    }
}
