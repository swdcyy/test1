package com.kwai.sdk.eve.internal.statistics.CoverageStats$d;
import wn7.b;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zn7.a;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;
import sm7.l;
import com.kwai.sdk.eve.InferenceState;

public final class CoverageStats$d extends b	// class@0015ab
{
    public final CoverageStats a;

    public void CoverageStats$d(CoverageStats p0){
       this.a = p0;
       super();
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverageStats$d.class, "1")) {
          return;
       }
       a.p(p0, "inference");
       String str = p0.k().j();
       if (str != null) {
          this.a.b(p0.k().n(), str, ExecuteState.EVER_STARTED);
       }
       return;
    }
    public void g(a p0,l p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats$d.class, "2")) {
          return;
       }
       a.p(p0, "inference");
       a.p(p1, "result");
       p2 = p0.k().j();
       if (p2 != null) {
          CoverageStats$d ta = this.a;
          String str = p0.k().n();
          ExecuteState eVER_FAILED = (p1.g() == InferenceState.ERROR)? ExecuteState.EVER_FAILED: ExecuteState.EVER_SUCCEED;
          ta.b(str, p2, eVER_FAILED);
       }
       return;
    }
}
