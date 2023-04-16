package com.yxcorp.utility.RadiusStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RadiusStyle extends Enum	// class@0009aa
{
    public int radiusId;
    public static final RadiusStyle[] $VALUES;
    public static final RadiusStyle LARGE_16DP;
    public static final RadiusStyle MID_12DP;
    public static final RadiusStyle MID_8DP;
    public static final RadiusStyle SEMI_CIRCLE;
    public static final RadiusStyle SMALL_2DP;
    public static final RadiusStyle SMALL_4DP;
    public static final RadiusStyle SMALL_6DP;

    static {
       RadiusStyle radiusStyle = new RadiusStyle("SEMI_CIRCLE", 0, 0x7f07042c);
       RadiusStyle.SEMI_CIRCLE = radiusStyle;
       RadiusStyle radiusStyle1 = new RadiusStyle("SMALL_2DP", 1, 0x7f070426);
       RadiusStyle.SMALL_2DP = radiusStyle1;
       RadiusStyle radiusStyle2 = new RadiusStyle("SMALL_4DP", 2, 0x7f070429);
       RadiusStyle.SMALL_4DP = radiusStyle2;
       RadiusStyle radiusStyle3 = new RadiusStyle("SMALL_6DP", 3, 0x7f07042a);
       RadiusStyle.SMALL_6DP = radiusStyle3;
       RadiusStyle radiusStyle4 = new RadiusStyle("MID_8DP", 4, 0x7f07042b);
       RadiusStyle.MID_8DP = radiusStyle4;
       RadiusStyle radiusStyle5 = new RadiusStyle("MID_12DP", 5, 0x7f070420);
       RadiusStyle.MID_12DP = radiusStyle5;
       RadiusStyle radiusStyle6 = new RadiusStyle("LARGE_16DP", 6, 0x7f070421);
       RadiusStyle.LARGE_16DP = radiusStyle6;
       RadiusStyle[] radiusStyleA = new RadiusStyle[]{radiusStyle,radiusStyle1,radiusStyle2,radiusStyle3,radiusStyle4,radiusStyle5,radiusStyle6};
       RadiusStyle.$VALUES = radiusStyleA;
    }
    public void RadiusStyle(String p0,int p1,int p2){
       super(p0, p1);
       this.radiusId = p2;
    }
    public static RadiusStyle valueOf(String p0){
       return Enum.valueOf(RadiusStyle.class, p0);
    }
    public static RadiusStyle[] values(){
       return RadiusStyle.$VALUES.clone();
    }
}
