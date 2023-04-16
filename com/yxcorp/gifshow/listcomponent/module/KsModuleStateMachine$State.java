package com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsModuleStateMachine$State extends Enum	// class@001a84
{
    public final int mIndex;
    public static final KsModuleStateMachine$State[] $VALUES;
    public static final KsModuleStateMachine$State BIND;
    public static final KsModuleStateMachine$State CREATE;
    public static final KsModuleStateMachine$State DESTROY;
    public static final KsModuleStateMachine$State INIT;
    public static final KsModuleStateMachine$State UNBIND;

    static {
       KsModuleStateMachine$State state = new KsModuleStateMachine$State("INIT", 0, 0);
       KsModuleStateMachine$State.INIT = state;
       KsModuleStateMachine$State state1 = new KsModuleStateMachine$State("CREATE", 1, 1);
       KsModuleStateMachine$State.CREATE = state1;
       KsModuleStateMachine$State state2 = new KsModuleStateMachine$State("BIND", 2, 2);
       KsModuleStateMachine$State.BIND = state2;
       KsModuleStateMachine$State state3 = new KsModuleStateMachine$State("UNBIND", 3, 3);
       KsModuleStateMachine$State.UNBIND = state3;
       KsModuleStateMachine$State state4 = new KsModuleStateMachine$State("DESTROY", 4, 4);
       KsModuleStateMachine$State.DESTROY = state4;
       KsModuleStateMachine$State[] stateArray = new KsModuleStateMachine$State[]{state,state1,state2,state3,state4};
       KsModuleStateMachine$State.$VALUES = stateArray;
    }
    public void KsModuleStateMachine$State(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static KsModuleStateMachine$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsModuleStateMachine$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsModuleStateMachine$State.class, p0);
    }
    public static KsModuleStateMachine$State[] values(){
       Object obj = PatchProxy.apply(null, null, KsModuleStateMachine$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsModuleStateMachine$State.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
