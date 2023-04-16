package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType extends Enum	// class@00097e
{
    public static final LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType[] $VALUES;
    public static final LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType FOLLOW;
    public static final LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType FOLLOW_AND_RESERVE;
    public static final LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType NONE;

    static {
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType uConditionBu = new LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType("NONE", 0);
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.NONE = uConditionBu;
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType uConditionBu1 = new LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType("FOLLOW", 1);
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW = uConditionBu1;
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType uConditionBu2 = new LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType("FOLLOW_AND_RESERVE", 2);
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.FOLLOW_AND_RESERVE = uConditionBu2;
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType[] uConditionBu3 = new LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType[]{uConditionBu,uConditionBu1,uConditionBu2};
       LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.$VALUES = uConditionBu3;
    }
    public void LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.class, p0);
    }
    public static LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.$VALUES.clone();
    }
}
