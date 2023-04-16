package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView$b;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveActivityRedPacketSnatchView$b implements d$c	// class@00098f
{
    public final LiveActivityRedPacketSnatchView a;

    public void LiveActivityRedPacketSnatchView$b(LiveActivityRedPacketSnatchView p0){
       this.a = p0;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketSnatchView$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.start();
          this.a.k = p0;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketSnatchView$b.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "get cached snatch animation file  error");
       return;
    }
}
