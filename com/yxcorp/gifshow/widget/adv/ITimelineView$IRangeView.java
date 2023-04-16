package com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$b;
import android.view.ViewGroup;
import android.graphics.Rect;

public interface abstract ITimelineView$IRangeView	// class@001906
{

    boolean a();
    ITimelineView$IRangeView b(ITimelineView$IRangeView$a p0);
    ITimelineView$IRangeView c(ITimeLineGestureProcessor p0,int p1);
    void d();
    void e(int p0);
    ITimelineView$IRangeView f(ITimelineView$IRangeView$b p0);
    ITimelineView$IRangeView g(ViewGroup p0);
    ITimelineView$IRangeView$a getBindData();
    int getHandlerWidth();
    Rect getTouchableRect();
}
