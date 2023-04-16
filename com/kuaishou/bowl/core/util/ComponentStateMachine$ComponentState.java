package com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ComponentStateMachine$ComponentState extends Enum	// class@0011b6
{
    public int mIndex;
    public static final ComponentStateMachine$ComponentState[] $VALUES;
    public static final ComponentStateMachine$ComponentState BIND;
    public static final ComponentStateMachine$ComponentState CREATE;
    public static final ComponentStateMachine$ComponentState DESTROY;
    public static final ComponentStateMachine$ComponentState INIT;
    public static final ComponentStateMachine$ComponentState UNBIND;

    static {
       ComponentStateMachine$ComponentState uComponentSt = new ComponentStateMachine$ComponentState("INIT", 0, 0);
       ComponentStateMachine$ComponentState.INIT = uComponentSt;
       ComponentStateMachine$ComponentState uComponentSt1 = new ComponentStateMachine$ComponentState("CREATE", 1, 1);
       ComponentStateMachine$ComponentState.CREATE = uComponentSt1;
       ComponentStateMachine$ComponentState uComponentSt2 = new ComponentStateMachine$ComponentState("BIND", 2, 2);
       ComponentStateMachine$ComponentState.BIND = uComponentSt2;
       ComponentStateMachine$ComponentState uComponentSt3 = new ComponentStateMachine$ComponentState("UNBIND", 3, 3);
       ComponentStateMachine$ComponentState.UNBIND = uComponentSt3;
       ComponentStateMachine$ComponentState uComponentSt4 = new ComponentStateMachine$ComponentState("DESTROY", 4, 4);
       ComponentStateMachine$ComponentState.DESTROY = uComponentSt4;
       ComponentStateMachine$ComponentState[] uComponentSt5 = new ComponentStateMachine$ComponentState[]{uComponentSt,uComponentSt1,uComponentSt2,uComponentSt3,uComponentSt4};
       ComponentStateMachine$ComponentState.$VALUES = uComponentSt5;
    }
    public void ComponentStateMachine$ComponentState(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static ComponentStateMachine$ComponentState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ComponentStateMachine$ComponentState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ComponentStateMachine$ComponentState.class, p0);
    }
    public static ComponentStateMachine$ComponentState[] values(){
       Object obj = PatchProxy.apply(null, null, ComponentStateMachine$ComponentState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ComponentStateMachine$ComponentState.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
