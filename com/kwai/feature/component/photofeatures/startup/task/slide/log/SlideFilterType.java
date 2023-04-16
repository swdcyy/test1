package com.kwai.feature.component.photofeatures.startup.task.slide.log.SlideFilterType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlideFilterType extends Enum	// class@001279
{
    public static final SlideFilterType[] $VALUES;
    public static final SlideFilterType NORMAL;
    public static final SlideFilterType PRECHECK;

    static {
       SlideFilterType slideFilterT = new SlideFilterType("NORMAL", 0);
       SlideFilterType.NORMAL = slideFilterT;
       SlideFilterType slideFilterT1 = new SlideFilterType("PRECHECK", 1);
       SlideFilterType.PRECHECK = slideFilterT1;
       SlideFilterType[] slideFilterT2 = new SlideFilterType[]{slideFilterT,slideFilterT1};
       SlideFilterType.$VALUES = slideFilterT2;
    }
    public void SlideFilterType(String p0,int p1){
       super(p0, p1);
    }
    public static SlideFilterType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlideFilterType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SlideFilterType.class, p0);
    }
    public static SlideFilterType[] values(){
       Object obj = PatchProxy.apply(null, null, SlideFilterType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlideFilterType.$VALUES.clone();
    }
}
