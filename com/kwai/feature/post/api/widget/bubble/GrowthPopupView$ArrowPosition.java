package com.kwai.feature.post.api.widget.bubble.GrowthPopupView$ArrowPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthPopupView$ArrowPosition extends Enum	// class@001494
{
    public static final GrowthPopupView$ArrowPosition[] $VALUES;
    public static final GrowthPopupView$ArrowPosition BOTTOM;
    public static final GrowthPopupView$ArrowPosition LEFT;
    public static final GrowthPopupView$ArrowPosition RIGHT;
    public static final GrowthPopupView$ArrowPosition TOP;

    static {
       GrowthPopupView$ArrowPosition uArrowPositi = new GrowthPopupView$ArrowPosition("TOP", 0);
       GrowthPopupView$ArrowPosition.TOP = uArrowPositi;
       GrowthPopupView$ArrowPosition uArrowPositi1 = new GrowthPopupView$ArrowPosition("BOTTOM", 1);
       GrowthPopupView$ArrowPosition.BOTTOM = uArrowPositi1;
       GrowthPopupView$ArrowPosition uArrowPositi2 = new GrowthPopupView$ArrowPosition("LEFT", 2);
       GrowthPopupView$ArrowPosition.LEFT = uArrowPositi2;
       GrowthPopupView$ArrowPosition uArrowPositi3 = new GrowthPopupView$ArrowPosition("RIGHT", 3);
       GrowthPopupView$ArrowPosition.RIGHT = uArrowPositi3;
       GrowthPopupView$ArrowPosition[] uArrowPositi4 = new GrowthPopupView$ArrowPosition[]{uArrowPositi,uArrowPositi1,uArrowPositi2,uArrowPositi3};
       GrowthPopupView$ArrowPosition.$VALUES = uArrowPositi4;
    }
    public void GrowthPopupView$ArrowPosition(String p0,int p1){
       super(p0, p1);
    }
    public static GrowthPopupView$ArrowPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthPopupView$ArrowPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthPopupView$ArrowPosition.class, p0);
    }
    public static GrowthPopupView$ArrowPosition[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthPopupView$ArrowPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthPopupView$ArrowPosition.$VALUES.clone();
    }
}
