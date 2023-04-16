package com.yxcorp.gifshow.v3.widget.b;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Double;

public final class b implements Comparator	// class@001661
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Double.compare(p0.h(), p1.h());
    }
}
