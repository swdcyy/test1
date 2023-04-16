package com.swmansion.gesturehandler.PointerEventsConfig;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PointerEventsConfig extends Enum	// class@000c7f
{
    public static final PointerEventsConfig[] $VALUES;
    public static final PointerEventsConfig AUTO;
    public static final PointerEventsConfig BOX_NONE;
    public static final PointerEventsConfig BOX_ONLY;
    public static final PointerEventsConfig NONE;

    static {
       PointerEventsConfig pointerEvent = new PointerEventsConfig("NONE", 0);
       PointerEventsConfig.NONE = pointerEvent;
       PointerEventsConfig pointerEvent1 = new PointerEventsConfig("BOX_NONE", 1);
       PointerEventsConfig.BOX_NONE = pointerEvent1;
       PointerEventsConfig pointerEvent2 = new PointerEventsConfig("BOX_ONLY", 2);
       PointerEventsConfig.BOX_ONLY = pointerEvent2;
       PointerEventsConfig pointerEvent3 = new PointerEventsConfig("AUTO", 3);
       PointerEventsConfig.AUTO = pointerEvent3;
       PointerEventsConfig[] pointerEvent4 = new PointerEventsConfig[]{pointerEvent,pointerEvent1,pointerEvent2,pointerEvent3};
       PointerEventsConfig.$VALUES = pointerEvent4;
    }
    public void PointerEventsConfig(String p0,int p1){
       super(p0, p1);
    }
    public static PointerEventsConfig valueOf(String p0){
       return Enum.valueOf(PointerEventsConfig.class, p0);
    }
    public static PointerEventsConfig[] values(){
       return PointerEventsConfig.$VALUES.clone();
    }
}
