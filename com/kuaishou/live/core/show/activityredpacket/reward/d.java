package com.kuaishou.live.core.show.activityredpacket.reward.d;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class d implements d$c	// class@000994
{
    public final LiveActivityRedPacketGrabButtonInfo a;
    public final LiveActivityRedPacketGrabButtonView b;

    public void d(LiveActivityRedPacketGrabButtonView p0,LiveActivityRedPacketGrabButtonInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.b.c.c(false, this.a.d(), this.a.c());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "get cached tip Drawable error");
       return;
    }
}
