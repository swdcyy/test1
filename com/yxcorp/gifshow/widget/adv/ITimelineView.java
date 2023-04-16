package com.yxcorp.gifshow.widget.adv.ITimelineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import android.graphics.Rect;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;

public interface abstract ITimelineView	// class@00190c
{

    ITimelineView E();
    boolean a();
    void b();
    ITimelineView c(ITimelineView$IRangeView$a p0);
    ITimelineView d(ITimelineView$IRangeView$a p0);
    void e(ITimelineView$d p0);
    ITimelineView f(ITimelineView$IRangeView$a p0,int p1);
    ITimelineView g(ITimelineView$IRangeView$a p0);
    double getCurrentViewTime();
    Rect[] getLeftRightEdgesOnScreen();
    int getPixelsForSecond();
    List getViewModels();
    ITimelineView h(ITimelineView$IRangeView$a p0);
    void i();
    void j(double p0,boolean p1);
    ITimelineView k(List p0);
    void setTimelineListener(ITimelineView$e p0);
}
