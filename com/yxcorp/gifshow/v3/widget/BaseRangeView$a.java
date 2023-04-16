package com.yxcorp.gifshow.v3.widget.BaseRangeView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.BaseRangeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$b;
import android.os.Handler;

public class BaseRangeView$a implements Runnable	// class@001629
{
    public final BaseRangeView b;

    public void BaseRangeView$a(BaseRangeView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BaseRangeView$a.class, "1")) {
          return;
       }
       if (this.b.o != null) {
          BaseRangeView v = this.b.v;
          if (v != null && (v.n() && !this.b.v.a())) {
             BaseRangeView$a tb = this.b;
             BaseRangeView w = tb.w;
             if (w != null) {
                BaseRangeView$a tb1 = this.b;
                if (w.f(tb.v.f(), tb1, tb1.o)) {
                   tb = this.b;
                   tb.j = tb.j + tb.o;
                   tb = this.b;
                   tb.k = tb.k + tb.o;
                }
             }
          }
       }
       this.b.q.postDelayed(this, 25);
       return;
    }
}
