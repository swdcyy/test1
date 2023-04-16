package com.kwai.page.component.ComponentStateGraph$ComponentState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ComponentStateGraph$ComponentState extends Enum	// class@001039
{
    public final int mIndex;
    public static final ComponentStateGraph$ComponentState[] $VALUES;
    public static final ComponentStateGraph$ComponentState BIND;
    public static final ComponentStateGraph$ComponentState CREATE;
    public static final ComponentStateGraph$ComponentState DESTROY;
    public static final ComponentStateGraph$ComponentState INIT;
    public static final ComponentStateGraph$ComponentState UNBIND;

    static {
       ComponentStateGraph$ComponentState uComponentSt = new ComponentStateGraph$ComponentState("INIT", 0, 0);
       ComponentStateGraph$ComponentState.INIT = uComponentSt;
       ComponentStateGraph$ComponentState uComponentSt1 = new ComponentStateGraph$ComponentState("CREATE", 1, 1);
       ComponentStateGraph$ComponentState.CREATE = uComponentSt1;
       ComponentStateGraph$ComponentState uComponentSt2 = new ComponentStateGraph$ComponentState("BIND", 2, 2);
       ComponentStateGraph$ComponentState.BIND = uComponentSt2;
       ComponentStateGraph$ComponentState uComponentSt3 = new ComponentStateGraph$ComponentState("UNBIND", 3, 3);
       ComponentStateGraph$ComponentState.UNBIND = uComponentSt3;
       ComponentStateGraph$ComponentState uComponentSt4 = new ComponentStateGraph$ComponentState("DESTROY", 4, 4);
       ComponentStateGraph$ComponentState.DESTROY = uComponentSt4;
       ComponentStateGraph$ComponentState[] uComponentSt5 = new ComponentStateGraph$ComponentState[]{uComponentSt,uComponentSt1,uComponentSt2,uComponentSt3,uComponentSt4};
       ComponentStateGraph$ComponentState.$VALUES = uComponentSt5;
    }
    public void ComponentStateGraph$ComponentState(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static ComponentStateGraph$ComponentState valueOf(String p0){
       return Enum.valueOf(ComponentStateGraph$ComponentState.class, p0);
    }
    public static ComponentStateGraph$ComponentState[] values(){
       return ComponentStateGraph$ComponentState.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
