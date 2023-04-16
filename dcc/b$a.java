package dcc.b$a;
import java.lang.Object;
import nsd.u;
import java.lang.Runnable;
import dcc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import z1.a;

public final class b$a	// class@002169
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final b a(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "callback");
       b uob = new b(null, p0, null, null, null, 29, null);
       return obj;
    }
    public final b b(Runnable p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clickCallback");
       a.p(p1, "createCallback");
       b uob = new b(null, p0, null, null, p1, 13, null);
       return obj;
    }
    public final b c(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "callback");
       b uob = new b(null, null, p0, null, null, 27, null);
       return obj;
    }
    public final b d(Runnable p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clickCallback");
       a.p(p1, "createCallback");
       b uob = new b(null, null, p0, null, p1, 11, null);
       return obj;
    }
    public final b e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "switchCallback");
       b uob = new b(null, null, null, p0, null, 23, null);
       return obj;
    }
    public final b f(a p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "switchCallback");
       a.p(p1, "createCallback");
       b uob = new b(null, null, null, p0, p1, 7, null);
       return obj;
    }
}
