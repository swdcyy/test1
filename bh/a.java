package bh.a;
import java.lang.Object;
import android.content.Context;
import com.gifshow.kanim.network.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh.a$a;
import eh.a;
import com.gifshow.kanim.network.f;
import com.gifshow.kanim.network.b;
import com.gifshow.kanim.network.d;

public class a	// class@000b2d
{
    public static boolean a;
    public static boolean b;
    public static String[] c;
    public static long[] d;
    public static int e;
    public static int f;
    public static d g;
    public static a h;
    public static f i;
    public static e j;

    public void a(){
       super();
    }
    public static e a(Context p0){
       e obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.j;
       if (obj == null) {
          _monitor_enter(e.class);
          obj = a.j;
          if (obj == null) {
             a h = a.h;
             if (h == null) {
                h = new a$a(p0);
             }
             obj = new e(h);
             a.j = obj;
          }
          _monitor_exit(e.class);
       }
       return obj;
    }
    public static f b(Context p0){
       f obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i;
       if (obj == null) {
          _monitor_enter(f.class);
          obj = a.i;
          if (obj == null) {
             e uoe = a.a(p0);
             d g = a.g;
             if (g == null) {
                g = new b();
             }
             obj = new f(uoe, g);
             a.i = obj;
          }
          _monitor_exit(f.class);
       }
       return obj;
    }
}
