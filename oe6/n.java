package oe6.n;
import java.lang.Object;
import android.content.SharedPreferences;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vid.b;
import o56.a;
import km8.b;

public final class n	// class@00201b
{
    public static SharedPreferences a;

    public void n(){
       super();
    }
    public static Set a(SharedPreferences p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0);
    }
    public static SharedPreferences b(){
       n on = n.class;
       Object obj = PatchProxy.apply(null, null, on, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (n.a == null) {
          _monitor_enter(on);
          if (n.a == null) {
             n.a = b.c(a.w, 4);
          }
          _monitor_exit(on);
       }
       return n.a;
    }
}
