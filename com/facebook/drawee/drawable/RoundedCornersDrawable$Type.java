package com.facebook.drawee.drawable.RoundedCornersDrawable$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RoundedCornersDrawable$Type extends Enum	// class@00108b
{
    public static final RoundedCornersDrawable$Type[] $VALUES;
    public static final RoundedCornersDrawable$Type CLIPPING;
    public static final RoundedCornersDrawable$Type OVERLAY_COLOR;

    static {
       RoundedCornersDrawable$Type type = new RoundedCornersDrawable$Type("OVERLAY_COLOR", 0);
       RoundedCornersDrawable$Type.OVERLAY_COLOR = type;
       RoundedCornersDrawable$Type type1 = new RoundedCornersDrawable$Type("CLIPPING", 1);
       RoundedCornersDrawable$Type.CLIPPING = type1;
       RoundedCornersDrawable$Type[] typeArray = new RoundedCornersDrawable$Type[]{type,type1};
       RoundedCornersDrawable$Type.$VALUES = typeArray;
    }
    public void RoundedCornersDrawable$Type(String p0,int p1){
       super(p0, p1);
    }
    public static RoundedCornersDrawable$Type valueOf(String p0){
       return Enum.valueOf(RoundedCornersDrawable$Type.class, p0);
    }
    public static RoundedCornersDrawable$Type[] values(){
       return RoundedCornersDrawable$Type.$VALUES.clone();
    }
}
