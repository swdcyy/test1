package com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketBaseViewModel$State extends Enum	// class@000f36
{
    public static final RedPacketBaseViewModel$State[] $VALUES;
    public static final RedPacketBaseViewModel$State Error;
    public static final RedPacketBaseViewModel$State Loading;
    public static final RedPacketBaseViewModel$State Normal;

    static {
       RedPacketBaseViewModel$State state = new RedPacketBaseViewModel$State("Normal", 0);
       RedPacketBaseViewModel$State.Normal = state;
       RedPacketBaseViewModel$State state1 = new RedPacketBaseViewModel$State("Loading", 1);
       RedPacketBaseViewModel$State.Loading = state1;
       RedPacketBaseViewModel$State state2 = new RedPacketBaseViewModel$State("Error", 2);
       RedPacketBaseViewModel$State.Error = state2;
       RedPacketBaseViewModel$State[] stateArray = new RedPacketBaseViewModel$State[]{state,state1,state2};
       RedPacketBaseViewModel$State.$VALUES = stateArray;
    }
    public void RedPacketBaseViewModel$State(String p0,int p1){
       super(p0, p1);
    }
    public static RedPacketBaseViewModel$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketBaseViewModel$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketBaseViewModel$State.class, p0);
    }
    public static RedPacketBaseViewModel$State[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketBaseViewModel$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketBaseViewModel$State.$VALUES.clone();
    }
}
