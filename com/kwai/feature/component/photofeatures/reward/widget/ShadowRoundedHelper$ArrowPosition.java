package com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$ArrowPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ShadowRoundedHelper$ArrowPosition extends Enum	// class@001270
{
    public static final ShadowRoundedHelper$ArrowPosition[] $VALUES;
    public static final ShadowRoundedHelper$ArrowPosition BOTTOM;
    public static final ShadowRoundedHelper$ArrowPosition END;
    public static final ShadowRoundedHelper$ArrowPosition NONE;
    public static final ShadowRoundedHelper$ArrowPosition START;
    public static final ShadowRoundedHelper$ArrowPosition TOP;

    static {
       ShadowRoundedHelper$ArrowPosition uArrowPositi1;
       ShadowRoundedHelper$ArrowPosition[] uArrowPositi = new ShadowRoundedHelper$ArrowPosition[]{uArrowPositi1,uArrowPositi1,uArrowPositi1,uArrowPositi1,uArrowPositi1};
       uArrowPositi1 = new ShadowRoundedHelper$ArrowPosition("NONE", 0);
       ShadowRoundedHelper$ArrowPosition.NONE = uArrowPositi1;
       uArrowPositi1 = new ShadowRoundedHelper$ArrowPosition("TOP", 1);
       ShadowRoundedHelper$ArrowPosition.TOP = uArrowPositi1;
       uArrowPositi1 = new ShadowRoundedHelper$ArrowPosition("START", 2);
       ShadowRoundedHelper$ArrowPosition.START = uArrowPositi1;
       uArrowPositi1 = new ShadowRoundedHelper$ArrowPosition("END", 3);
       ShadowRoundedHelper$ArrowPosition.END = uArrowPositi1;
       uArrowPositi1 = new ShadowRoundedHelper$ArrowPosition("BOTTOM", 4);
       ShadowRoundedHelper$ArrowPosition.BOTTOM = uArrowPositi1;
       ShadowRoundedHelper$ArrowPosition.$VALUES = uArrowPositi;
    }
    public void ShadowRoundedHelper$ArrowPosition(String p0,int p1){
       super(p0, p1);
    }
    public static ShadowRoundedHelper$ArrowPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ShadowRoundedHelper$ArrowPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ShadowRoundedHelper$ArrowPosition.class, p0);
    }
    public static ShadowRoundedHelper$ArrowPosition[] values(){
       Object obj = PatchProxy.apply(null, null, ShadowRoundedHelper$ArrowPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ShadowRoundedHelper$ArrowPosition.$VALUES.clone();
    }
}
