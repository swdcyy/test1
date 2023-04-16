package c66.a;
import com.kwai.framework.config.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import la0.f;
import c66.n;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import c66.r;
import com.kwai.framework.logger.config.e;
import of6.d;
import glb.d;
import com.yxcorp.gifshow.startup.d;

public class a	// class@000651
{
    public static b a;

    static {
       a.a = new b();
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          f.d();
          if (!PatchProxy.applyVoid(null, null, n.class, "1")) {
             a.a(new n());
          }
          if (!PatchProxy.applyVoid(null, null, r.class, "1")) {
             a.a(new r());
          }
          if (!PatchProxy.applyVoid(null, null, e.class, "1")) {
             a.a(new e());
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.a(new d());
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.a(new d());
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.a(new d());
          }
       }
    }
    public void a(){
       super();
    }
    public static void a(ConfigAutoParseJsonConsumer p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       a.a.a(p0);
       return;
    }
}
