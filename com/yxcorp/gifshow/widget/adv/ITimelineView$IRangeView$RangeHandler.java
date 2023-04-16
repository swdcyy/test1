package com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ITimelineView$IRangeView$RangeHandler extends Enum	// class@001902
{
    public static final ITimelineView$IRangeView$RangeHandler[] $VALUES;
    public static final ITimelineView$IRangeView$RangeHandler LEFT;
    public static final ITimelineView$IRangeView$RangeHandler NONE;
    public static final ITimelineView$IRangeView$RangeHandler RIGHT;

    static {
       ITimelineView$IRangeView$RangeHandler iRangeView$R = new ITimelineView$IRangeView$RangeHandler("LEFT", 0);
       ITimelineView$IRangeView$RangeHandler.LEFT = iRangeView$R;
       ITimelineView$IRangeView$RangeHandler iRangeView$R1 = new ITimelineView$IRangeView$RangeHandler("RIGHT", 1);
       ITimelineView$IRangeView$RangeHandler.RIGHT = iRangeView$R1;
       ITimelineView$IRangeView$RangeHandler iRangeView$R2 = new ITimelineView$IRangeView$RangeHandler("NONE", 2);
       ITimelineView$IRangeView$RangeHandler.NONE = iRangeView$R2;
       ITimelineView$IRangeView$RangeHandler[] iRangeView$R3 = new ITimelineView$IRangeView$RangeHandler[]{iRangeView$R,iRangeView$R1,iRangeView$R2};
       ITimelineView$IRangeView$RangeHandler.$VALUES = iRangeView$R3;
    }
    public void ITimelineView$IRangeView$RangeHandler(String p0,int p1){
       super(p0, p1);
    }
    public static ITimelineView$IRangeView$RangeHandler valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ITimelineView$IRangeView$RangeHandler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ITimelineView$IRangeView$RangeHandler.class, p0);
    }
    public static ITimelineView$IRangeView$RangeHandler[] values(){
       Object obj = PatchProxy.apply(null, null, ITimelineView$IRangeView$RangeHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ITimelineView$IRangeView$RangeHandler.$VALUES.clone();
    }
}
