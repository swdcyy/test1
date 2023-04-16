package com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$b;
import ekd.k1;

public class AdvHorizontalScroller$a implements Runnable	// class@0019d7
{
    public final AdvHorizontalScroller b;

    public void AdvHorizontalScroller$a(AdvHorizontalScroller p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AdvHorizontalScroller$a.class, "1")) {
          return;
       }
       AdvHorizontalScroller$a tb = this.b;
       AdvHorizontalScroller f = tb.f;
       tb.f = tb.getScrollX();
       tb = this.b;
       if (f == tb.f) {
          AdvHorizontalScroller e = tb.e;
          if (e != null) {
             e.b();
          }
          this.b.b = false;
       }else {
          k1.r(this, 20);
       }
       return;
    }
}
