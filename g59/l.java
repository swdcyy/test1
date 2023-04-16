package g59.l;
import ekd.e0;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class l	// class@00240c
{
    public static SharedPreferences a;

    static {
       l.a = b.c(e0.b, "commercial_store", 4);
    }
    public void l(){
       super();
    }
    public static long a(Context p0,String p1,long p2){
       if (PatchProxy.isSupport(l.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, l.class, "11");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       return l.a.getLong(p1, p2);
    }
    public static String b(Context p0,String p1,String p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, l.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return l.a.getString(p1, p2);
    }
    public static void c(Context p0,String p1,long p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, l.class, "10")) {
          return;
       }
       g.a(l.a.edit().putLong(p1, p2));
       return;
    }
    public static void d(Context p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, l.class, "3")) {
          return;
       }
       g.a(l.a.edit().putString(p1, p2));
       return;
    }
}
