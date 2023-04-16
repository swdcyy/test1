package com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$CurrentInfoState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketConditionRedPackInfoWrapper$CurrentInfoState extends Enum	// class@000e70
{
    public static final RedPacketConditionRedPackInfoWrapper$CurrentInfoState[] $VALUES;
    public static final RedPacketConditionRedPackInfoWrapper$CurrentInfoState Error;
    public static final RedPacketConditionRedPackInfoWrapper$CurrentInfoState Loading;
    public static final RedPacketConditionRedPackInfoWrapper$CurrentInfoState Normal;

    static {
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState uCurrentInfo = new RedPacketConditionRedPackInfoWrapper$CurrentInfoState("Normal", 0);
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState.Normal = uCurrentInfo;
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState uCurrentInfo1 = new RedPacketConditionRedPackInfoWrapper$CurrentInfoState("Loading", 1);
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState.Loading = uCurrentInfo1;
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState uCurrentInfo2 = new RedPacketConditionRedPackInfoWrapper$CurrentInfoState("Error", 2);
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState.Error = uCurrentInfo2;
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState[] uCurrentInfo3 = new RedPacketConditionRedPackInfoWrapper$CurrentInfoState[]{uCurrentInfo,uCurrentInfo1,uCurrentInfo2};
       RedPacketConditionRedPackInfoWrapper$CurrentInfoState.$VALUES = uCurrentInfo3;
    }
    public void RedPacketConditionRedPackInfoWrapper$CurrentInfoState(String p0,int p1){
       super(p0, p1);
    }
    public static RedPacketConditionRedPackInfoWrapper$CurrentInfoState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketConditionRedPackInfoWrapper$CurrentInfoState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketConditionRedPackInfoWrapper$CurrentInfoState.class, p0);
    }
    public static RedPacketConditionRedPackInfoWrapper$CurrentInfoState[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketConditionRedPackInfoWrapper$CurrentInfoState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketConditionRedPackInfoWrapper$CurrentInfoState.$VALUES.clone();
    }
}
