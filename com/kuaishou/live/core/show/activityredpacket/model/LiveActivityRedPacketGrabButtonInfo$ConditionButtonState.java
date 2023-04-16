package com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo$ConditionButtonState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActivityRedPacketGrabButtonInfo$ConditionButtonState extends Enum	// class@00095b
{
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState[] $VALUES;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState FOLLOWED;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState FOLLOWED_RESERVED;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState FOLLOWED_UNRESERVED;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState RESERVE_UNKNOWN;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState UNFOLLOWED;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState UNFOLLOWED_RESERVED;
    public static final LiveActivityRedPacketGrabButtonInfo$ConditionButtonState UNFOLLOWED_UNRESERVED;

    static {
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("FOLLOWED", 0);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.FOLLOWED = uConditionBu;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu1 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("UNFOLLOWED", 1);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED = uConditionBu1;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu2 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("RESERVE_UNKNOWN", 2);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.RESERVE_UNKNOWN = uConditionBu2;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu3 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("FOLLOWED_UNRESERVED", 3);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.FOLLOWED_UNRESERVED = uConditionBu3;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu4 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("UNFOLLOWED_RESERVED", 4);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED_RESERVED = uConditionBu4;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu5 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("FOLLOWED_RESERVED", 5);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.FOLLOWED_RESERVED = uConditionBu5;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState uConditionBu6 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState("UNFOLLOWED_UNRESERVED", 6);
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED_UNRESERVED = uConditionBu6;
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState[] uConditionBu7 = new LiveActivityRedPacketGrabButtonInfo$ConditionButtonState[]{uConditionBu,uConditionBu1,uConditionBu2,uConditionBu3,uConditionBu4,uConditionBu5,uConditionBu6};
       LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.$VALUES = uConditionBu7;
    }
    public void LiveActivityRedPacketGrabButtonInfo$ConditionButtonState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveActivityRedPacketGrabButtonInfo$ConditionButtonState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.class, p0);
    }
    public static LiveActivityRedPacketGrabButtonInfo$ConditionButtonState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.$VALUES.clone();
    }
}
