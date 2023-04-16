package com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$BottomAreaStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketConditionRedPackInfoWrapper$BottomAreaStatus extends Enum	// class@000e6f
{
    public static final RedPacketConditionRedPackInfoWrapper$BottomAreaStatus[] $VALUES;
    public static final RedPacketConditionRedPackInfoWrapper$BottomAreaStatus ANIMATION_HIDE;
    public static final RedPacketConditionRedPackInfoWrapper$BottomAreaStatus ANIMATION_SHOW;
    public static final RedPacketConditionRedPackInfoWrapper$BottomAreaStatus HIDE;
    public static final RedPacketConditionRedPackInfoWrapper$BottomAreaStatus SHOW;

    static {
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus uBottomAreaS = new RedPacketConditionRedPackInfoWrapper$BottomAreaStatus("SHOW", 0);
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.SHOW = uBottomAreaS;
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus uBottomAreaS1 = new RedPacketConditionRedPackInfoWrapper$BottomAreaStatus("ANIMATION_SHOW", 1);
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.ANIMATION_SHOW = uBottomAreaS1;
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus uBottomAreaS2 = new RedPacketConditionRedPackInfoWrapper$BottomAreaStatus("HIDE", 2);
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.HIDE = uBottomAreaS2;
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus uBottomAreaS3 = new RedPacketConditionRedPackInfoWrapper$BottomAreaStatus("ANIMATION_HIDE", 3);
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.ANIMATION_HIDE = uBottomAreaS3;
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus[] uBottomAreaS4 = new RedPacketConditionRedPackInfoWrapper$BottomAreaStatus[]{uBottomAreaS,uBottomAreaS1,uBottomAreaS2,uBottomAreaS3};
       RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.$VALUES = uBottomAreaS4;
    }
    public void RedPacketConditionRedPackInfoWrapper$BottomAreaStatus(String p0,int p1){
       super(p0, p1);
    }
    public static RedPacketConditionRedPackInfoWrapper$BottomAreaStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.class, p0);
    }
    public static RedPacketConditionRedPackInfoWrapper$BottomAreaStatus[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketConditionRedPackInfoWrapper$BottomAreaStatus.$VALUES.clone();
    }
}
