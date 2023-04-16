package com.swmansion.rnscreens.ScreenStackHeaderSubview$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ScreenStackHeaderSubview$Type extends Enum	// class@000cb6
{
    public static final ScreenStackHeaderSubview$Type[] $VALUES;
    public static final ScreenStackHeaderSubview$Type BACK;
    public static final ScreenStackHeaderSubview$Type CENTER;
    public static final ScreenStackHeaderSubview$Type LEFT;
    public static final ScreenStackHeaderSubview$Type RIGHT;

    static {
       ScreenStackHeaderSubview$Type type = new ScreenStackHeaderSubview$Type("LEFT", 0);
       ScreenStackHeaderSubview$Type.LEFT = type;
       ScreenStackHeaderSubview$Type type1 = new ScreenStackHeaderSubview$Type("CENTER", 1);
       ScreenStackHeaderSubview$Type.CENTER = type1;
       ScreenStackHeaderSubview$Type type2 = new ScreenStackHeaderSubview$Type("RIGHT", 2);
       ScreenStackHeaderSubview$Type.RIGHT = type2;
       ScreenStackHeaderSubview$Type type3 = new ScreenStackHeaderSubview$Type("BACK", 3);
       ScreenStackHeaderSubview$Type.BACK = type3;
       ScreenStackHeaderSubview$Type[] typeArray = new ScreenStackHeaderSubview$Type[]{type,type1,type2,type3};
       ScreenStackHeaderSubview$Type.$VALUES = typeArray;
    }
    public void ScreenStackHeaderSubview$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ScreenStackHeaderSubview$Type valueOf(String p0){
       return Enum.valueOf(ScreenStackHeaderSubview$Type.class, p0);
    }
    public static ScreenStackHeaderSubview$Type[] values(){
       return ScreenStackHeaderSubview$Type.$VALUES.clone();
    }
}
