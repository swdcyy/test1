package ekd.v0;
import java.lang.Object;
import rg.e;
import rg.d$d;
import rg.d;
import java.lang.String;
import ekd.e0;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.lang.CharSequence;
import java.util.Iterator;
import java.util.ArrayList;
import ekd.m0;

public class v0	// class@00156f
{
    public static ArrayList a;
    public static e b;

    public void v0(){
       super();
    }
    public static e a(){
       e b = v0.b;
       if (b == null) {
          b = v0.class;
          _monitor_enter(b);
          if (b.b == null) {
             b.b = d.b(null);
          }
          _monitor_exit(b);
       }
       return b.b;
    }
    public static void b(String p0){
       e0.b.c(p0, e0.b, String.valueOf(e0.e));
    }
    public static void c(String p0,Context p1,String p2){
       e uoe = v0.a();
       if (Build$VERSION.SDK_INT < 23 && !((Build.MANUFACTURER).toLowerCase(Locale.US)).contains("gionee")) {
          p2 = null;
       }
       uoe.c();
       uoe.b();
       uoe.i(p1, p0, p2);
       ArrayList a = uoe.a;
       if (a != null) {
          Iterator iterator = a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
}
