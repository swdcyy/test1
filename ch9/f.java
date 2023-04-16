package ch9.f;
import erd.g;
import ch9.g;
import java.lang.Object;
import ue9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;

public final class f implements g	// class@0005ed
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "8")) {
       }else if(p0.a != tb.c || tb.r.a()){
          Object[] objArray = new Object[0];
          a.D().w("stability", "Makeup event "+p0.b, objArray);
          p0 = p0.b;
          g r = tb.r;
          Objects.requireNonNull(r);
          UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
          if (PatchProxy.isSupport(ultraWideAnd)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), r, ultraWideAnd, "13");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             label_006a :
                tb.h2(b, p0);
             }
          }
          b = r.j(p0, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAKEUP);
          goto label_006a ;
       }
       return;
    }
}
