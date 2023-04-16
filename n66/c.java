package n66.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c	// class@001f0c
{
    public static final ConcurrentHashMap a;
    public static final List b;
    public static final c c;

    static {
       c.c = new c();
       c.a = new ConcurrentHashMap();
       c.b = new ArrayList();
    }
    public void c(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "4")) {
          return;
       }
       a.p(p0, "scene");
       List b = c.b;
       if (!b.contains(p0)) {
          b.add(p0);
       }
       return;
    }
    public static final void b(String p0,String p1,Object p2){
       ConcurrentHashMap a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "1")) {
          return;
       }
       a.p(p0, "scene");
       a.p(p1, "key");
       a.p(p2, "value");
       a = c.a;
       ConcurrentHashMap uConcurrentH = a.get(p0);
       if (uConcurrentH == null) {
          uConcurrentH = new ConcurrentHashMap();
          uConcurrentH.put(p1, p2);
          a.put(p0, uConcurrentH);
       }else {
          uConcurrentH.put(p1, p2);
       }
       return;
    }
    public static final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "scene");
       return c.b.remove(p0);
    }
    public static final void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "3")) {
          return;
       }
       a.p(p0, "scene");
       a.p(p1, "key");
       ConcurrentHashMap uConcurrentH = c.a.get(p0);
       if (uConcurrentH != null) {
          uConcurrentH.remove(p1);
       }
       return;
    }
}
