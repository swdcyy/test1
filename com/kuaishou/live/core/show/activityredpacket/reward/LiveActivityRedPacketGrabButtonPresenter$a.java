package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$d;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType;
import com.kuaishou.live.core.show.activityredpacket.reward.b;
import z0.a;
import com.kuaishou.live.core.show.activityredpacket.reward.a;

public class LiveActivityRedPacketGrabButtonPresenter$a implements LiveActivityRedPacketGrabButtonPresenter$d	// class@00097f
{
    public final LiveActivityRedPacketGrabButtonPresenter a;

    public void LiveActivityRedPacketGrabButtonPresenter$a(LiveActivityRedPacketGrabButtonPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveActivityRedPacketGrabButtonView p0,LiveActivityRedPacketGrabButtonInfo p1,UserInfo p2){
       LiveActivityRedPacketGrabButtonPresenter$a ta1;
       LiveActivityRedPacketGrabButtonPresenter liveActivity = LiveActivityRedPacketGrabButtonPresenter.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveActivityRedPacketGrabButtonPresenter$a.class, "1")) {
          return;
       }
       LiveActivityRedPacketGrabButtonPresenter$a ta = this.a;
       ta.u = p0;
       ta.w = p2;
       ta.v = p1;
       ta.x = p1.b();
       p0.y = p1.A;
       if (p1.b != null && p1.f()) {
          ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.applyVoidTwoRefs(p2, p1, ta1, liveActivity, "3")) {
             ta1.z = LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW_AND_RESERVE;
             ta1.V8(p2.mId, new b(ta1, p1));
          }
       }else if(p1.f()){
          ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.applyVoidTwoRefs(p2, p1, ta1, liveActivity, "2")) {
             ta1.z = LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW;
             ta1.V8(p2.mId, new a(ta1, p1));
          }
       }else {
          p0.z = LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.NONE;
          p1.h(true);
          this.a.X8(p1);
       }
       return;
    }
}
