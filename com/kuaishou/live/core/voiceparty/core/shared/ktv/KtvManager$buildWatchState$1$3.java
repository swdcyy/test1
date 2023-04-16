package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1;
import java.lang.Object;
import com.kwai.statechart.StateChart$SubChartBuilder;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3$2;
import com.kwai.statechart.a;
import msd.p;
import ut7.c;
import java.util.Set;
import trd.d1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$RefreshWatch;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3$a;
import com.kwai.robust.PatchProxyResult;
import ut7.o;
import com.kwai.statechart.StateChart$a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3$b;

public final class KtvManager$buildWatchState$1$3 extends Lambda implements l	// class@001424
{
    public final KtvManager$buildWatchState$1 this$0;

    public void KtvManager$buildWatchState$1$3(KtvManager$buildWatchState$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(StateChart$SubChartBuilder p0){
       KtvManager$buildWatchState$1$3$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$buildWatchState$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(KtvManager$buildWatchState$1$3$1.INSTANCE);
       p0.b(this.this$0.this$0.n, KtvManager$buildWatchState$1$3$2.INSTANCE);
       p0.c(this.this$0.this$0.n);
       p0.c(this.this$0.this$0.o);
       String str = "refresh_watch";
       int i = 2;
       c[] uocArray = new c[i];
       KtvManager$buildWatchState$1 this$0 = this.this$0.this$0;
       int i1 = 0;
       uocArray[i1] = this$0.n;
       int i2 = 1;
       uocArray[i2] = this$0.o;
       Set set = d1.u(uocArray);
       KtvManager o = this.this$0.this$0.o;
       a = KtvManager$buildWatchState$1$3$a.a;
       StateChart$SubChartBuilder subChartBuil = StateChart$SubChartBuilder.class;
       if (PatchProxy.isSupport(subChartBuil)) {
          Object[] objArray = new Object[]{str,set,o,KtvManager$RefreshWatch.class,a};
          if (PatchProxy.apply(objArray, p0, subChartBuil, "7") != PatchProxyResult.class) {
          label_0098 :
             KtvManager$buildWatchState$1 this$01 = this.this$0.this$0;
             p0.d("refresh_prepare_done", this$01.o, this$01.n, KtvManager$KtvWatchPrepareSuccess.class, KtvManager$buildWatchState$1$3$b.a);
             return;
          }
       }
       a.p(str, "name");
       a.p(set, "from");
       a.p(o, "to");
       a.p(KtvManager$RefreshWatch.class, "event");
       a.p(a, "condition");
       p0.d.l(str, set, o, KtvManager$RefreshWatch.class, a);
       goto label_0098 ;
    }
}
