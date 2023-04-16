package c.t.m.g.eh;
import java.lang.String;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class eh	// class@000c6a
{
    public static Context a;

    public static int a(String p0,String p1,int p2){
       Context a = eh.a;
       if (a == null) {
          return p2;
       }
       return o.c(a, p0, 0).getInt(p1, p2);
    }
    public static long a(String p0,String p1,long p2){
       Context a = eh.a;
       if (a == null) {
          return p2;
       }
       return o.c(a, p0, 0).getLong(p1, p2);
    }
    public static String a(String p0,String p1,String p2){
       Context a = eh.a;
       if (a == null) {
          return p2;
       }
       return o.c(a, p0, 0).getString(p1, p2);
    }
    public static void a(Context p0){
       eh.a = p0;
    }
    public static void b(String p0,String p1,int p2){
       SharedPreferences$Editor uEditor = o.c(eh.a, p0, 0).edit();
       uEditor.putInt(p1, p2);
       g.a(uEditor);
    }
    public static void b(String p0,String p1,long p2){
       SharedPreferences$Editor uEditor = o.c(eh.a, p0, 0).edit();
       uEditor.putLong(p1, p2);
       g.a(uEditor);
    }
    public static void b(String p0,String p1,String p2){
       SharedPreferences$Editor uEditor = o.c(eh.a, p0, 0).edit();
       uEditor.putString(p1, p2);
       g.a(uEditor);
    }
}
