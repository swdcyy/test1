package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView$a;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveActivityRedPacketSnatchView$a implements d$c	// class@00098e
{
    public final LiveActivityRedPacketSnatchView a;

    public void LiveActivityRedPacketSnatchView$a(LiveActivityRedPacketSnatchView p0){
       this.a = p0;
       super();
    }
    public void a(Animatable p0){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketSnatchView$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "get Cached snatch Drawable error");
       return;
    }
}
