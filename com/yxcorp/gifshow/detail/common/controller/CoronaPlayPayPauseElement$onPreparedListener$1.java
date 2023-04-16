package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$onPreparedListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CoronaPlayPayPauseElement$onPreparedListener$1 extends Lambda implements l	// class@0013b5
{
    public final CoronaPlayPayPauseElement this$0;

    public void CoronaPlayPayPauseElement$onPreparedListener$1(CoronaPlayPayPauseElement p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$onPreparedListener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       CoronaPlayPayPauseElement$onPreparedListener$1 tthis$0 = this.this$0;
       if (tthis$0.I == null) {
          tthis$0.I = true;
          tthis$0.s0();
       }
       return;
    }
}
