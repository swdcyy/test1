package du1.b;
import du1.a;
import ps1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.line.model.LiveMultiPkStartPkExtraInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import du1.d;
import java.lang.Boolean;
import java.lang.Number;

public final class b implements a	// class@002022
{
    public final e a;

    public void b(e p0){
       a.p(p0, "pkDelegate");
       super();
       this.a = p0;
    }
    public void F(LiveMultiPkStartPkExtraInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "startPkExtraInfo");
       this.a.F(p0);
       return;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.e();
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public long j(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.j();
    }
}
