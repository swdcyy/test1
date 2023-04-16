package haa.d;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class d	// class@0025f1
{
    public static final SharedPreferences a;

    static {
       d.a = b.b("EditDraftPreference");
    }
    public static List a(Type p0){
       String str = d.a.getString("matched_workspace_list", "[]");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static long b(){
       return d.a.getLong("user_local_album_count", 0);
    }
    public static void c(long p0){
       SharedPreferences$Editor uEditor = d.a.edit();
       uEditor.putLong("user_local_album_count", p0);
       g.a(uEditor);
    }
}
