package com.kuaishou.live.livestage.videopipe.source.RTCVideoSource$stopPoll$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.source.RTCVideoSource;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.livestage.utils.CommonUtil;
import xv4.i;
import je3.k;

public final class RTCVideoSource$stopPoll$1 extends Lambda implements a	// class@000c1b
{
    public final RTCVideoSource this$0;

    public void RTCVideoSource$stopPoll$1(RTCVideoSource p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, RTCVideoSource$stopPoll$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       CommonUtil.e.d("RTCVideoSource: unregisterMediaListener", objArray);
       RTCVideoSource$stopPoll$1 tthis$0 = this.this$0;
       tthis$0.f.Y2(tthis$0.e);
       return;
    }
}