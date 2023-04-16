package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.Object;
import com.kwai.statechart.StateChart$SubChartBuilder;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$2;
import com.kwai.statechart.a;
import msd.p;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3;
import com.kwai.robust.PatchProxyResult;
import msd.a;
import ut7.a;
import com.kwai.statechart.b;
import com.kwai.statechart.StateChart$a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$a;
import ut7.o;

public final class KtvManager$buildWatchState$1 extends Lambda implements l	// class@001426
{
    public final KtvManager this$0;

    public void KtvManager$buildWatchState$1(KtvManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(StateChart$SubChartBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$buildWatchState$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(KtvManager$buildWatchState$1$1.INSTANCE);
       p0.b(this.this$0.l, KtvManager$buildWatchState$1$2.INSTANCE);
       p0.c(this.this$0.l);
       KtvManager m = this.this$0.m;
       KtvManager$buildWatchState$1$3 uobuildWatch = new KtvManager$buildWatchState$1$3(this);
       if (PatchProxy.applyTwoRefs(m, uobuildWatch, p0, StateChart$SubChartBuilder.class, "5") != PatchProxyResult.class) {
       }else {
          a.p(m, "state");
          a.p(uobuildWatch, "block");
          p0.d.j(p0.a, p0.b, p0.c, m, uobuildWatch);
       }
       KtvManager$buildWatchState$1 tthis$0 = this.this$0;
       p0.d("start_watch", tthis$0.l, tthis$0.m, KtvManager$KtvWatchPrepareSuccess.class, KtvManager$buildWatchState$1$a.a);
       return;
    }
}
