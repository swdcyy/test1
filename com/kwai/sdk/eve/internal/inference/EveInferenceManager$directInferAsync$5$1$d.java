package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$d;
import erd.g;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$4$1;
import msd.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import java.util.Objects;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import java.util.Map;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import en7.j;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import en7.v;
import sm7.l;
import wn7.a;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public final class EveInferenceManager$directInferAsync$5$1$d implements g	// class@001551
{
    public final EveInferenceManager$directInferAsync$5$1 b;
    public final a c;

    public void EveInferenceManager$directInferAsync$5$1$d(EveInferenceManager$directInferAsync$5$1 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$directInferAsync$5$1$d.class, "1")) {
       }else {
          EveLog.INSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$4$1(this));
          EveInferenceManager$directInferAsync$5$1 b = this.b.b;
          EveInferenceManager$directInferAsync$5 b1 = b.b;
          EveInferenceManager$directInferAsync$5 c = b.c;
          EveInferenceManager$directInferAsync$5$1$d tc = this.c;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidTwoRefs(c, tc, b1, EveInferenceManager.class, "9")) {
             Map map = EveInferenceManagerKt.c(c);
             _monitor_enter(map);
             a uoa = EveInferenceManagerKt.c(c).remove(tc.h());
             _monitor_exit(map);
             c.q("EveInferenceManager");
          }
          this.c.j().d("t_releaseTask");
          this.b.b.b.c.g(this.c, p0.getFirst(), p0.getSecond());
          LuaNativeUtil.freeInferenceStopWatch(this.b.b.c.n(), this.b.b.h);
          LuaNativeUtil.freeMemoryByInferenceId(this.b.b.c.n(), this.b.b.h);
       }
       return;
    }
}
