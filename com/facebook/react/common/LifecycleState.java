package com.facebook.react.common.LifecycleState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LifecycleState extends Enum	// class@00125a
{
    public static final LifecycleState[] $VALUES;
    public static final LifecycleState BEFORE_CREATE;
    public static final LifecycleState BEFORE_RESUME;
    public static final LifecycleState RESUMED;

    static {
       LifecycleState lifecycleSta = new LifecycleState("BEFORE_CREATE", 0);
       LifecycleState.BEFORE_CREATE = lifecycleSta;
       LifecycleState lifecycleSta1 = new LifecycleState("BEFORE_RESUME", 1);
       LifecycleState.BEFORE_RESUME = lifecycleSta1;
       LifecycleState lifecycleSta2 = new LifecycleState("RESUMED", 2);
       LifecycleState.RESUMED = lifecycleSta2;
       LifecycleState[] lifecycleSta3 = new LifecycleState[]{lifecycleSta,lifecycleSta1,lifecycleSta2};
       LifecycleState.$VALUES = lifecycleSta3;
    }
    public void LifecycleState(String p0,int p1){
       super(p0, p1);
    }
    public static LifecycleState valueOf(String p0){
       return Enum.valueOf(LifecycleState.class, p0);
    }
    public static LifecycleState[] values(){
       return LifecycleState.$VALUES.clone();
    }
}
