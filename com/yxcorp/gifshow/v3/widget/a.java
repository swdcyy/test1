package com.yxcorp.gifshow.v3.widget.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;

public final class a implements Comparator	// class@001660
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i = Integer.MAX_VALUE;
       int i1 = (p0.getBindData().s())? Integer.MAX_VALUE: p0.getBindData().e();
       if (!p1.getBindData().s()) {
          i = p1.getBindData().e();
       }
       return (i - i1);
    }
}
