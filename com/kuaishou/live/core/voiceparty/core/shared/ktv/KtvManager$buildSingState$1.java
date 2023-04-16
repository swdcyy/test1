package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1;
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
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$2;
import com.kwai.statechart.a;
import msd.p;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvSingPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$a;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMineMusicOrder;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$c;

public final class KtvManager$buildSingState$1 extends Lambda implements l	// class@00141b
{
    public final KtvManager this$0;

    public void KtvManager$buildSingState$1(KtvManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(StateChart$SubChartBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$buildSingState$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(KtvManager$buildSingState$1$1.INSTANCE);
       p0.b(this.this$0.i, KtvManager$buildSingState$1$2.INSTANCE);
       p0.c(this.this$0.i);
       p0.c(this.this$0.j);
       KtvManager$buildSingState$1 tthis$0 = this.this$0;
       StateChart$SubChartBuilder subChartBuil = p0;
       subChartBuil.d("start_sing", tthis$0.i, tthis$0.j, KtvManager$KtvSingPrepareSuccess.class, KtvManager$buildSingState$1$a.a);
       KtvManager i = this.this$0.i;
       subChartBuil.d("continue_sing_when_prepare", i, i, KtvManager$NextMineMusicOrder.class, KtvManager$buildSingState$1$b.a);
       tthis$0 = this.this$0;
       subChartBuil.d("continue_sing", tthis$0.j, tthis$0.i, KtvManager$NextMineMusicOrder.class, KtvManager$buildSingState$1$c.a);
       return;
    }
}
