package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController;
import ts2.f;
import bt2.e;
import msd.p;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatBubbleGuideController$onCreate$1 extends Lambda implements l	// class@00165b
{
    public final MicSeatBubbleGuideController this$0;

    public void MicSeatBubbleGuideController$onCreate$1(MicSeatBubbleGuideController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatBubbleGuideController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatBubbleGuideController$onCreate$1 tthis$0 = this.this$0;
       BubbleGuidePendantViewController uBubbleGuide = new BubbleGuidePendantViewController(tthis$0.k, tthis$0.o, tthis$0.p, tthis$0.q, tthis$0.n, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
