package com.facebook.drawee.generic.RoundingParams$RoundingMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RoundingParams$RoundingMethod extends Enum	// class@00108e
{
    public static final RoundingParams$RoundingMethod[] $VALUES;
    public static final RoundingParams$RoundingMethod BITMAP_ONLY;
    public static final RoundingParams$RoundingMethod OVERLAY_COLOR;

    static {
       RoundingParams$RoundingMethod roundingMeth = new RoundingParams$RoundingMethod("OVERLAY_COLOR", 0);
       RoundingParams$RoundingMethod.OVERLAY_COLOR = roundingMeth;
       RoundingParams$RoundingMethod roundingMeth1 = new RoundingParams$RoundingMethod("BITMAP_ONLY", 1);
       RoundingParams$RoundingMethod.BITMAP_ONLY = roundingMeth1;
       RoundingParams$RoundingMethod[] roundingMeth2 = new RoundingParams$RoundingMethod[]{roundingMeth,roundingMeth1};
       RoundingParams$RoundingMethod.$VALUES = roundingMeth2;
    }
    public void RoundingParams$RoundingMethod(String p0,int p1){
       super(p0, p1);
    }
    public static RoundingParams$RoundingMethod valueOf(String p0){
       return Enum.valueOf(RoundingParams$RoundingMethod.class, p0);
    }
    public static RoundingParams$RoundingMethod[] values(){
       return RoundingParams$RoundingMethod.$VALUES.clone();
    }
}
