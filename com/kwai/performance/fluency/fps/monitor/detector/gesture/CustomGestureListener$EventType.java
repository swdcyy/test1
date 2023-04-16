package com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CustomGestureListener$EventType extends Enum	// class@001071
{
    public static final CustomGestureListener$EventType[] $VALUES;
    public static final CustomGestureListener$EventType DOUBLE_EVENT;
    public static final CustomGestureListener$EventType DOUBLE_TAP;
    public static final CustomGestureListener$EventType DOWN;
    public static final CustomGestureListener$EventType FLING;
    public static final CustomGestureListener$EventType LONG_PRESS;
    public static final CustomGestureListener$EventType SCROLL;
    public static final CustomGestureListener$EventType SINGLE_TAP;

    public static final CustomGestureListener$EventType[] $values(){
       CustomGestureListener$EventType[] uEventTypeAr = new CustomGestureListener$EventType[]{CustomGestureListener$EventType.DOWN,CustomGestureListener$EventType.SINGLE_TAP,CustomGestureListener$EventType.LONG_PRESS,CustomGestureListener$EventType.DOUBLE_TAP,CustomGestureListener$EventType.DOUBLE_EVENT,CustomGestureListener$EventType.SCROLL,CustomGestureListener$EventType.FLING};
       return uEventTypeAr;
    }
    static {
       CustomGestureListener$EventType.DOWN = new CustomGestureListener$EventType("DOWN", 0);
       CustomGestureListener$EventType.SINGLE_TAP = new CustomGestureListener$EventType("SINGLE_TAP", 1);
       CustomGestureListener$EventType.LONG_PRESS = new CustomGestureListener$EventType("LONG_PRESS", 2);
       CustomGestureListener$EventType.DOUBLE_TAP = new CustomGestureListener$EventType("DOUBLE_TAP", 3);
       CustomGestureListener$EventType.DOUBLE_EVENT = new CustomGestureListener$EventType("DOUBLE_EVENT", 4);
       CustomGestureListener$EventType.SCROLL = new CustomGestureListener$EventType("SCROLL", 5);
       CustomGestureListener$EventType.FLING = new CustomGestureListener$EventType("FLING", 6);
       CustomGestureListener$EventType.$VALUES = CustomGestureListener$EventType.$values();
    }
    public void CustomGestureListener$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static CustomGestureListener$EventType valueOf(String p0){
       return Enum.valueOf(CustomGestureListener$EventType.class, p0);
    }
    public static CustomGestureListener$EventType[] values(){
       return CustomGestureListener$EventType.$VALUES.clone();
    }
}
