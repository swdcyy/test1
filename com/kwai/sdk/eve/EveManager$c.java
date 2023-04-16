package com.kwai.sdk.eve.EveManager$c;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$a;
import kn7.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class EveManager$c implements EveInferenceManager$a	// class@001438
{
    public final b a;

    public void EveManager$c(b p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveManager$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       EveManager$c ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyTwoRefs(p1, p0, ta, b.class, "12");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p1, "version");
          a.p(p0, "taskId");
          b = (!ta.i().disableList.contains(p1) && (ta.c.contains(p1) && (ta.i().e().contains(p1) || (ta.i().c().contains(p0) && (ta.i().a().contains(p1) || (ta.b.contains(p1) && (!ta.i().e().contains(p1) && !ta.i().c().contains(p0))))))))? 1: 0;
       }
       return (b ^ 1);
    }
}
