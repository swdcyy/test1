package com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.MicSeatAnchorMutedController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.videochat.pendants.AnchorMutedPendantViewController;
import ts2.f;
import brd.t;

public final class MicSeatAnchorMutedController$onCreate$1 extends Lambda implements l	// class@0018eb
{
    public final MicSeatAnchorMutedController this$0;

    public void MicSeatAnchorMutedController$onCreate$1(MicSeatAnchorMutedController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatAnchorMutedController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatAnchorMutedController$onCreate$1 tthis$0 = this.this$0;
       return new AnchorMutedPendantViewController(tthis$0.k, tthis$0.n, p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
