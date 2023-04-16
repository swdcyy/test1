package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$a;
import android.os.Handler;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw1.f;

public class LiveFellowRedPacketFloatView$a extends Handler	// class@000ebf
{
    public final LiveFellowRedPacketFloatView a;

    public void LiveFellowRedPacketFloatView$a(LiveFellowRedPacketFloatView p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 1001) {
          LiveFellowRedPacketFloatView$a ta = this.a;
          ta.g(f.a(), ta.i);
       }
       return;
    }
}
