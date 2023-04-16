package com.yxcorp.gifshow.widget.PopupBackgroundView$ArrowPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PopupBackgroundView$ArrowPosition extends Enum	// class@001897
{
    public static final PopupBackgroundView$ArrowPosition[] $VALUES;
    public static final PopupBackgroundView$ArrowPosition BOTTOM;
    public static final PopupBackgroundView$ArrowPosition LEFT;
    public static final PopupBackgroundView$ArrowPosition RIGHT;
    public static final PopupBackgroundView$ArrowPosition TOP;

    static {
       PopupBackgroundView$ArrowPosition uArrowPositi = new PopupBackgroundView$ArrowPosition("TOP", 0);
       PopupBackgroundView$ArrowPosition.TOP = uArrowPositi;
       PopupBackgroundView$ArrowPosition uArrowPositi1 = new PopupBackgroundView$ArrowPosition("BOTTOM", 1);
       PopupBackgroundView$ArrowPosition.BOTTOM = uArrowPositi1;
       PopupBackgroundView$ArrowPosition uArrowPositi2 = new PopupBackgroundView$ArrowPosition("LEFT", 2);
       PopupBackgroundView$ArrowPosition.LEFT = uArrowPositi2;
       PopupBackgroundView$ArrowPosition uArrowPositi3 = new PopupBackgroundView$ArrowPosition("RIGHT", 3);
       PopupBackgroundView$ArrowPosition.RIGHT = uArrowPositi3;
       PopupBackgroundView$ArrowPosition[] uArrowPositi4 = new PopupBackgroundView$ArrowPosition[]{uArrowPositi,uArrowPositi1,uArrowPositi2,uArrowPositi3};
       PopupBackgroundView$ArrowPosition.$VALUES = uArrowPositi4;
    }
    public void PopupBackgroundView$ArrowPosition(String p0,int p1){
       super(p0, p1);
    }
    public static PopupBackgroundView$ArrowPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PopupBackgroundView$ArrowPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PopupBackgroundView$ArrowPosition.class, p0);
    }
    public static PopupBackgroundView$ArrowPosition[] values(){
       Object obj = PatchProxy.apply(null, null, PopupBackgroundView$ArrowPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PopupBackgroundView$ArrowPosition.$VALUES.clone();
    }
}
