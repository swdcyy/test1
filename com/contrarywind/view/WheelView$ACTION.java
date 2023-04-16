package com.contrarywind.view.WheelView$ACTION;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WheelView$ACTION extends Enum	// class@000f81
{
    public static final WheelView$ACTION[] $VALUES;
    public static final WheelView$ACTION CLICK;
    public static final WheelView$ACTION DAGGLE;
    public static final WheelView$ACTION FLING;

    static {
       WheelView$ACTION uACTION = new WheelView$ACTION("CLICK", 0);
       WheelView$ACTION.CLICK = uACTION;
       WheelView$ACTION uACTION1 = new WheelView$ACTION("FLING", 1);
       WheelView$ACTION.FLING = uACTION1;
       WheelView$ACTION uACTION2 = new WheelView$ACTION("DAGGLE", 2);
       WheelView$ACTION.DAGGLE = uACTION2;
       WheelView$ACTION[] uACTIONArray = new WheelView$ACTION[]{uACTION,uACTION1,uACTION2};
       WheelView$ACTION.$VALUES = uACTIONArray;
    }
    public void WheelView$ACTION(String p0,int p1){
       super(p0, p1);
    }
    public static WheelView$ACTION valueOf(String p0){
       return Enum.valueOf(WheelView$ACTION.class, p0);
    }
    public static WheelView$ACTION[] values(){
       return WheelView$ACTION.$VALUES.clone();
    }
}
