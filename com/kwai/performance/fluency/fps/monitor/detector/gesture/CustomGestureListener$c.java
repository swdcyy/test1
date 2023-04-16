package com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$c;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$EventType;
import java.lang.Enum;

public final class CustomGestureListener$c	// class@001074
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CustomGestureListener$EventType.values().length];
       ointArray[CustomGestureListener$EventType.SINGLE_TAP.ordinal()] = 1;
       ointArray[CustomGestureListener$EventType.LONG_PRESS.ordinal()] = 2;
       ointArray[CustomGestureListener$EventType.DOUBLE_TAP.ordinal()] = 3;
       ointArray[CustomGestureListener$EventType.DOUBLE_EVENT.ordinal()] = 4;
       ointArray[CustomGestureListener$EventType.SCROLL.ordinal()] = 5;
       ointArray[CustomGestureListener$EventType.FLING.ordinal()] = 6;
       CustomGestureListener$c.a = ointArray;
    }
}
