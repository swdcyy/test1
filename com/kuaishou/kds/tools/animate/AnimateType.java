package com.kuaishou.kds.tools.animate.AnimateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnimateType extends Enum	// class@00079e
{
    public static final AnimateType[] $VALUES;
    public static final AnimateType bindingX;
    public static final AnimateType faceMagic;
    public static final AnimateType gCanvas;
    public static final AnimateType lottie;
    public static final AnimateType svg;
    public static final AnimateType video;

    static {
       AnimateType uAnimateType = new AnimateType("lottie", 0);
       AnimateType.lottie = uAnimateType;
       AnimateType uAnimateType1 = new AnimateType("video", 1);
       AnimateType.video = uAnimateType1;
       AnimateType uAnimateType2 = new AnimateType("svg", 2);
       AnimateType.svg = uAnimateType2;
       AnimateType uAnimateType3 = new AnimateType("bindingX", 3);
       AnimateType.bindingX = uAnimateType3;
       AnimateType uAnimateType4 = new AnimateType("faceMagic", 4);
       AnimateType.faceMagic = uAnimateType4;
       AnimateType uAnimateType5 = new AnimateType("gCanvas", 5);
       AnimateType.gCanvas = uAnimateType5;
       AnimateType[] uAnimateType6 = new AnimateType[]{uAnimateType,uAnimateType1,uAnimateType2,uAnimateType3,uAnimateType4,uAnimateType5};
       AnimateType.$VALUES = uAnimateType6;
    }
    public void AnimateType(String p0,int p1){
       super(p0, p1);
    }
    public static AnimateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnimateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnimateType.class, p0);
    }
    public static AnimateType[] values(){
       Object obj = PatchProxy.apply(null, null, AnimateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnimateType.$VALUES.clone();
    }
}
