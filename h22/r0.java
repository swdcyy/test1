package h22.r0;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.a0;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o22.g;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class r0 implements d$c	// class@002c0b
{
    public final LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo a;
    public final a0 b;

    public void r0(a0 p0,LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "1")) {
          return;
       }
       r0 tb = this.b;
       tb.M.c(false, tb.P.a(), this.a.mButtonText);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, r0.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "get cached action Drawable error");
       return;
    }
}
