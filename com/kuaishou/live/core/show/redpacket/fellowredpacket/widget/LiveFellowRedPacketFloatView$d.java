package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$d;
import lnc.o;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Boolean;

public class LiveFellowRedPacketFloatView$d extends o	// class@000ec2
{
    public final LiveFellowRedPacketFloatView b;

    public void LiveFellowRedPacketFloatView$d(LiveFellowRedPacketFloatView p0){
       this.b = p0;
       super();
    }
    public void a(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView$d.class, "2")) {
          return;
       }
       this.b.f.setScaleX(0x3f800000);
       this.b.f.setScaleY(0x3f800000);
       return;
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(LiveFellowRedPacketFloatView$d.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveFellowRedPacketFloatView$d.class, "1")) {
          return;
       }
       this.b.f.setScaleX(0x3f800000);
       this.b.f.setScaleY(0x3f800000);
       return;
    }
}
