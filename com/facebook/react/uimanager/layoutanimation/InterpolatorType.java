package com.facebook.react.uimanager.layoutanimation.InterpolatorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class InterpolatorType extends Enum	// class@001376
{
    public static final InterpolatorType[] $VALUES;
    public static final InterpolatorType EASE_IN;
    public static final InterpolatorType EASE_IN_EASE_OUT;
    public static final InterpolatorType EASE_OUT;
    public static final InterpolatorType LINEAR;
    public static final InterpolatorType SPRING;

    static {
       InterpolatorType interpolator = new InterpolatorType("LINEAR", 0);
       InterpolatorType.LINEAR = interpolator;
       InterpolatorType interpolator1 = new InterpolatorType("EASE_IN", 1);
       InterpolatorType.EASE_IN = interpolator1;
       InterpolatorType interpolator2 = new InterpolatorType("EASE_OUT", 2);
       InterpolatorType.EASE_OUT = interpolator2;
       InterpolatorType interpolator3 = new InterpolatorType("EASE_IN_EASE_OUT", 3);
       InterpolatorType.EASE_IN_EASE_OUT = interpolator3;
       InterpolatorType interpolator4 = new InterpolatorType("SPRING", 4);
       InterpolatorType.SPRING = interpolator4;
       InterpolatorType[] interpolator5 = new InterpolatorType[]{interpolator,interpolator1,interpolator2,interpolator3,interpolator4};
       InterpolatorType.$VALUES = interpolator5;
    }
    public void InterpolatorType(String p0,int p1){
       super(p0, p1);
    }
    public static InterpolatorType fromString(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, InterpolatorType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.toLowerCase(Locale.US);
       Objects.requireNonNull(obj);
       int i = -1;
       switch (obj.hashCode()){
           case 0x8adf9ca0:
             if (obj.equals("easeout")) {
                i = 0;
             }
             break;
           case 0xb1e62d93:
             if (obj.equals("easein")) {
                i = 1;
             }
             break;
           case 0xbe468f25:
             if (obj.equals("linear")) {
                i = 2;
             }
             break;
           case 0xca9d020d:
             if (obj.equals("spring")) {
                i = 3;
             }
             break;
           case 0x456993ad:
             if (obj.equals("easeineaseout")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return InterpolatorType.EASE_OUT;
           case 1:
             return InterpolatorType.EASE_IN;
           case 2:
             return InterpolatorType.LINEAR;
           case 3:
             return InterpolatorType.SPRING;
           case 4:
             return InterpolatorType.EASE_IN_EASE_OUT;
           default:
             throw new IllegalArgumentException("Unsupported interpolation type : "+p0);
       }
    }
    public static InterpolatorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InterpolatorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InterpolatorType.class, p0);
    }
    public static InterpolatorType[] values(){
       Object obj = PatchProxy.apply(null, null, InterpolatorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InterpolatorType.$VALUES.clone();
    }
}
