package com.facebook.react.uimanager.layoutanimation.AnimatedPropertyType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class AnimatedPropertyType extends Enum	// class@001375
{
    public static final AnimatedPropertyType[] $VALUES;
    public static final AnimatedPropertyType OPACITY;
    public static final AnimatedPropertyType SCALE_X;
    public static final AnimatedPropertyType SCALE_XY;
    public static final AnimatedPropertyType SCALE_Y;

    static {
       AnimatedPropertyType uAnimatedPro = new AnimatedPropertyType("OPACITY", 0);
       AnimatedPropertyType.OPACITY = uAnimatedPro;
       AnimatedPropertyType uAnimatedPro1 = new AnimatedPropertyType("SCALE_X", 1);
       AnimatedPropertyType.SCALE_X = uAnimatedPro1;
       AnimatedPropertyType uAnimatedPro2 = new AnimatedPropertyType("SCALE_Y", 2);
       AnimatedPropertyType.SCALE_Y = uAnimatedPro2;
       AnimatedPropertyType uAnimatedPro3 = new AnimatedPropertyType("SCALE_XY", 3);
       AnimatedPropertyType.SCALE_XY = uAnimatedPro3;
       AnimatedPropertyType[] uAnimatedPro4 = new AnimatedPropertyType[]{uAnimatedPro,uAnimatedPro1,uAnimatedPro2,uAnimatedPro3};
       AnimatedPropertyType.$VALUES = uAnimatedPro4;
    }
    public void AnimatedPropertyType(String p0,int p1){
       super(p0, p1);
    }
    public static AnimatedPropertyType fromString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnimatedPropertyType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xb477f80b:
             if (p0.equals("opacity")) {
                i = 0;
             }
             break;
           case 0xc9de204e:
             if (p0.equals("scaleX")) {
                i = 1;
             }
             break;
           case 0xc9de204f:
             if (p0.equals("scaleY")) {
                i = 2;
             }
             break;
           case 0x71e5e9cb:
             if (p0.equals("scaleXY")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return AnimatedPropertyType.OPACITY;
           case 1:
             return AnimatedPropertyType.SCALE_X;
           case 2:
             return AnimatedPropertyType.SCALE_Y;
           case 3:
             return AnimatedPropertyType.SCALE_XY;
           default:
             throw new IllegalArgumentException("Unsupported animated property: "+p0);
       }
    }
    public static AnimatedPropertyType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnimatedPropertyType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnimatedPropertyType.class, p0);
    }
    public static AnimatedPropertyType[] values(){
       Object obj = PatchProxy.apply(null, null, AnimatedPropertyType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnimatedPropertyType.$VALUES.clone();
    }
}
