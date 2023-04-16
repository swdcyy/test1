package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$queryLiveStatus$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.playeradapter.response.LiveStreamStatusResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class LiveAutoPlayModule$queryLiveStatus$1 extends FunctionReferenceImpl implements l	// class@001c09
{

    public void LiveAutoPlayModule$queryLiveStatus$1(LiveAutoPlayModule p0){
       super(1, p0, LiveAutoPlayModule.class, "onQueryLiveStatusSuccess", "onQueryLiveStatusSuccess\(Lcom/kuaishou/live/playeradapter/response/LiveStreamStatusResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveStreamStatusResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$queryLiveStatus$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.Z(p0);
       return;
    }
}
