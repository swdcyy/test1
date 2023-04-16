package com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketConditionPopupViewModel$State extends Enum	// class@000ed7
{
    public static final RedPacketConditionPopupViewModel$State[] $VALUES;
    public static final RedPacketConditionPopupViewModel$State DEFAULT_STATE;
    public static final RedPacketConditionPopupViewModel$State PRE_STATE;
    public static final RedPacketConditionPopupViewModel$State RESULT_STATE;
    public static final RedPacketConditionPopupViewModel$State SCROLL_STATE;

    static {
       RedPacketConditionPopupViewModel$State state = new RedPacketConditionPopupViewModel$State("DEFAULT_STATE", 0);
       RedPacketConditionPopupViewModel$State.DEFAULT_STATE = state;
       RedPacketConditionPopupViewModel$State state1 = new RedPacketConditionPopupViewModel$State("PRE_STATE", 1);
       RedPacketConditionPopupViewModel$State.PRE_STATE = state1;
       RedPacketConditionPopupViewModel$State state2 = new RedPacketConditionPopupViewModel$State("SCROLL_STATE", 2);
       RedPacketConditionPopupViewModel$State.SCROLL_STATE = state2;
       RedPacketConditionPopupViewModel$State state3 = new RedPacketConditionPopupViewModel$State("RESULT_STATE", 3);
       RedPacketConditionPopupViewModel$State.RESULT_STATE = state3;
       RedPacketConditionPopupViewModel$State[] stateArray = new RedPacketConditionPopupViewModel$State[]{state,state1,state2,state3};
       RedPacketConditionPopupViewModel$State.$VALUES = stateArray;
    }
    public void RedPacketConditionPopupViewModel$State(String p0,int p1){
       super(p0, p1);
    }
    public static RedPacketConditionPopupViewModel$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketConditionPopupViewModel$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketConditionPopupViewModel$State.class, p0);
    }
    public static RedPacketConditionPopupViewModel$State[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketConditionPopupViewModel$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketConditionPopupViewModel$State.$VALUES.clone();
    }
}
