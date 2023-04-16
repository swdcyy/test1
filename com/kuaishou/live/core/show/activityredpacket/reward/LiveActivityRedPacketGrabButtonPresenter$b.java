package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType;
import k22.c$a;
import k22.a;
import k22.b$a;
import java.lang.Boolean;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager;
import java.lang.Long;

public class LiveActivityRedPacketGrabButtonPresenter$b implements LiveActivityRedPacketGrabButtonTipView$b	// class@000980
{
    public final LiveActivityRedPacketGrabButtonPresenter a;

    public void LiveActivityRedPacketGrabButtonPresenter$b(LiveActivityRedPacketGrabButtonPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketGrabButtonPresenter$b.class, "1")) {
          return;
       }
       LiveActivityRedPacketGrabButtonPresenter$b ta = this.a;
       LiveActivityRedPacketGrabButtonPresenter a = ta.A;
       if (a == null) {
          return;
       }
       LiveActivityRedPacketGrabButtonPresenter z = ta.z;
       if (z == LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW) {
          c$a uoa = a.d(c$a.class);
          if (uoa != null && !uoa.a()) {
             this.a.W8();
          }
       }else if(z == LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW_AND_RESERVE){
          b$a uoa1 = a.d(b$a.class);
          LiveActivityRedPacketGrabButtonPresenter$b uob = 1;
          LiveActivityRedPacketGrabButtonPresenter liveActivity = (uoa1 != null && uoa1.a())? 1: null;
          if (uoa1 == null || !Boolean.TRUE.equals(uoa1.b())) {
             uob = null;
          }
          if (!liveActivity) {
             this.a.W8();
          }
          if (!uob) {
             uob = this.a;
             LiveActivityRedPacketReserveQualificationManager.d.d(uob.x, "32", Long.valueOf(uob.y));
          }
       }
       return;
    }
}
