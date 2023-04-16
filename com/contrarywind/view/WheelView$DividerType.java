package com.contrarywind.view.WheelView$DividerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WheelView$DividerType extends Enum	// class@000f82
{
    public static final WheelView$DividerType[] $VALUES;
    public static final WheelView$DividerType FILL;
    public static final WheelView$DividerType WRAP;

    static {
       WheelView$DividerType uDividerType = new WheelView$DividerType("FILL", 0);
       WheelView$DividerType.FILL = uDividerType;
       WheelView$DividerType uDividerType1 = new WheelView$DividerType("WRAP", 1);
       WheelView$DividerType.WRAP = uDividerType1;
       WheelView$DividerType[] uDividerType2 = new WheelView$DividerType[]{uDividerType,uDividerType1};
       WheelView$DividerType.$VALUES = uDividerType2;
    }
    public void WheelView$DividerType(String p0,int p1){
       super(p0, p1);
    }
    public static WheelView$DividerType valueOf(String p0){
       return Enum.valueOf(WheelView$DividerType.class, p0);
    }
    public static WheelView$DividerType[] values(){
       return WheelView$DividerType.$VALUES.clone();
    }
}
