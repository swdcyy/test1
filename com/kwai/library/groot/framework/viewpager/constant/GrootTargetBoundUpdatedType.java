package com.kwai.library.groot.framework.viewpager.constant.GrootTargetBoundUpdatedType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GrootTargetBoundUpdatedType extends Enum	// class@000839
{
    public static final GrootTargetBoundUpdatedType[] $VALUES;
    public static final GrootTargetBoundUpdatedType ON_MOVE_TO_NEXT;
    public static final GrootTargetBoundUpdatedType ON_MOVE_TO_PRE;
    public static final GrootTargetBoundUpdatedType ON_SCROLL_END;
    public static final GrootTargetBoundUpdatedType RESET;

    static {
       GrootTargetBoundUpdatedType grootTargetB = new GrootTargetBoundUpdatedType("ON_SCROLL_END", 0);
       GrootTargetBoundUpdatedType.ON_SCROLL_END = grootTargetB;
       GrootTargetBoundUpdatedType grootTargetB1 = new GrootTargetBoundUpdatedType("ON_MOVE_TO_NEXT", 1);
       GrootTargetBoundUpdatedType.ON_MOVE_TO_NEXT = grootTargetB1;
       GrootTargetBoundUpdatedType grootTargetB2 = new GrootTargetBoundUpdatedType("ON_MOVE_TO_PRE", 2);
       GrootTargetBoundUpdatedType.ON_MOVE_TO_PRE = grootTargetB2;
       GrootTargetBoundUpdatedType grootTargetB3 = new GrootTargetBoundUpdatedType("RESET", 3);
       GrootTargetBoundUpdatedType.RESET = grootTargetB3;
       GrootTargetBoundUpdatedType[] grootTargetB4 = new GrootTargetBoundUpdatedType[]{grootTargetB,grootTargetB1,grootTargetB2,grootTargetB3};
       GrootTargetBoundUpdatedType.$VALUES = grootTargetB4;
    }
    public void GrootTargetBoundUpdatedType(String p0,int p1){
       super(p0, p1);
    }
    public static GrootTargetBoundUpdatedType valueOf(String p0){
       return Enum.valueOf(GrootTargetBoundUpdatedType.class, p0);
    }
    public static GrootTargetBoundUpdatedType[] values(){
       return GrootTargetBoundUpdatedType.$VALUES.clone();
    }
}
