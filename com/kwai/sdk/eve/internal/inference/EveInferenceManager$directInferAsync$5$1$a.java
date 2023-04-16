package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$a;
import erd.g;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import en7.j;
import en7.v;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import wn7.a;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$1$1;
import msd.a;
import java.util.Objects;
import zn7.a;
import java.util.Map;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import qrd.l1;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.models.ConflictInferenceId;

public final class EveInferenceManager$directInferAsync$5$1$a implements g	// class@00154e
{
    public final EveInferenceManager$directInferAsync$5$1 b;
    public final a c;

    public void EveInferenceManager$directInferAsync$5$1$a(EveInferenceManager$directInferAsync$5$1 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$directInferAsync$5$1$a.class, "1")) {
       }else {
          this.c.j().e();
          this.b.b.b.c.e(this.c);
          this.c.j().d("t_monitor_onStart");
          EveLog.INSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$1$1(this));
          p0 = this.b.b;
          EveInferenceManager$directInferAsync$5 b = p0.b;
          p0 = p0.c;
          EveInferenceManager$directInferAsync$5$1$a tc = this.c;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(p0, tc, b, EveInferenceManager.class, "10")) {
             p0.r("EveInferenceManager");
             Map map = EveInferenceManagerKt.c(p0);
             _monitor_enter(map);
             if (!EveInferenceManagerKt.c(p0).containsKey(tc.h())) {
                EveInferenceManagerKt.c(p0).put(tc.h(), tc);
                _monitor_exit(map);
             }else {
                EveLog.i$default("EveInferenceManager#buildInference conflict id "+tc.h(), false, 2, null);
                throw new ConflictInferenceId(tc.h());
             }
          }
          this.c.j().d("t_retainTask");
       }
       return;
    }
}
