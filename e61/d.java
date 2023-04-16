package e61.d;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Type;
import e61.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.Map;
import e61.g;
import java.lang.Integer;
import e61.e;

public class d	// class@0020a9
{
    public static File a;
    public static Map b;
    public static Map c;

    static {
       d.a = b.a(-1504323719).j("live_disk_cache");
       d.b = new ConcurrentHashMap();
       d.c = new ConcurrentHashMap();
    }
    public void d(){
       super();
    }
    public static f a(String p0,long p1,Type p2){
       f obj;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, null, d.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uod)) {
          obj1 = PatchProxy.applyFourRefs(p0, null, Long.valueOf(p1), p2, null, d.class, "4");
          if (obj1 != patchProxyRe) {
          label_005e :
             return obj1;
          }
       }
       Map c = d.c;
       _monitor_enter(c);
       if (!d.c.containsKey(p0)) {
          obj = new f(p0, d.a, p2, p1);
          d.c.put(p0, v8);
       }
       obj1 = d.c.get(p0);
       _monitor_exit(c);
       goto label_005e ;
    }
    public static g b(String p0,int p1){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uod)) {
          obj1 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), null, null, d.class, "2");
          if (obj1 != patchProxyRe) {
          label_0053 :
             return obj1;
          }
       }
       Map b = d.b;
       _monitor_enter(b);
       if (!d.b.containsKey(p0)) {
          d.b.put(p0, new g(p1, null));
       }
       obj1 = d.b.get(p0);
       _monitor_exit(b);
       goto label_0053 ;
    }
}
