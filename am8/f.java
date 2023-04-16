package am8.f;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import am8.e;
import am8.b;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.lang.StringBuilder;
import dm8.c;
import cm8.c;
import dm8.d;

public class f	// class@0000f8
{
    public static Map a;
    public static Object b;

    static {
       f.a = new ConcurrentHashMap();
       f.b = new Object();
    }
    public static e a(String p0,int p1){
       Object b;
       e uoe = null;
       if (p1 <= 0) {
          if (!b.b) {
             return uoe;
          }
          throw new IllegalArgumentException("can\'t accept a negative fixedNum");
       }else if(TextUtils.isEmpty(p0)){
          if (!b.b) {
             return uoe;
          }
          throw new IllegalArgumentException("can\'t accept an empty executor name ");
       }else {
          b = f.b;
          _monitor_enter(b);
          if (f.a.containsKey(p0)) {
             if (b.b) {
                throw new IllegalArgumentException("executor name "+p0+" already inited");
             }
             _monitor_exit(b);
             return f.a.get(p0);
          }else {
             e uoe1 = new e(p0, p1);
             c.d().g.a(p0);
             c.d().h.a(p0, p1);
             f.a.put(p0, uoe1);
             _monitor_exit(b);
             return uoe1;
          }
       }
    }
}
