package com.kwai.sdk.eve.EveManager$b;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$c;
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

public final class EveManager$b implements EvePackageManager$c	// class@001437
{
    public final b a;

    public void EveManager$b(b p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveManager$b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       EveManager$b ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyTwoRefs(p1, p0, ta, b.class, "14");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p1, "version");
          a.p(p0, "taskId");
          b = (ta.i().a().contains(p1) || (ta.b.contains(p1) && (!ta.i().e().contains(p1) && !ta.i().c().contains(p0))))? true: false;
       }
       return b;
    }
    public boolean b(String p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveManager$b.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       EveManager$b ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyTwoRefs(p1, p0, ta, b.class, "13");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p1, "version");
          a.p(p0, "taskId");
          b = (ta.i().a().contains(p1) || (ta.b.contains(p1) && (!ta.i().e().contains(p1) && !ta.i().c().contains(p0))))? true: false;
       }
       return b;
    }
}
