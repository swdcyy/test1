package com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightButtonTextView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;

public final class LiveTopBroadcastMessageRightController$mRightButtonTextView$2 extends Lambda implements a	// class@0011d6
{
    public final LiveTopBroadcastMessageRightController this$0;

    public void LiveTopBroadcastMessageRightController$mRightButtonTextView$2(LiveTopBroadcastMessageRightController p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextView invoke(){
       View obj = PatchProxy.apply(null, this, LiveTopBroadcastMessageRightController$mRightButtonTextView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.c().findViewById(R.id.live_top_broadcast_message_right_button_text);
       a.o(obj, "mRightButtonLayout.findV¡­essage_right_button_text\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
