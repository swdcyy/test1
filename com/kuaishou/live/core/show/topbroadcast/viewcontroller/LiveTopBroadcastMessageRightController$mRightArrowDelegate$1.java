package com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightArrowDelegate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import android.view.ViewStub;

public final class LiveTopBroadcastMessageRightController$mRightArrowDelegate$1 extends Lambda implements a	// class@0011d3
{
    public final LiveTopBroadcastMessageRightController this$0;

    public void LiveTopBroadcastMessageRightController$mRightArrowDelegate$1(LiveTopBroadcastMessageRightController p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, LiveTopBroadcastMessageRightController$mRightArrowDelegate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.g.findViewById(R.id.live_top_broadcast_message_view_stub_arrow);
       a.o(obj, "mRightContainer\n      .f¡­_message_view_stub_arrow\)");
       return obj.inflate();
    }
    public Object invoke(){
       return this.invoke();
    }
}
