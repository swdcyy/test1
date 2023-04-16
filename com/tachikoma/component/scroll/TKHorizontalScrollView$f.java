package com.tachikoma.component.scroll.TKHorizontalScrollView$f;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;

public class TKHorizontalScrollView$f implements Runnable	// class@000d1d
{
    public final TKHorizontalScrollView b;

    public void TKHorizontalScrollView$f(TKHorizontalScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKHorizontalScrollView$f.class, "1")) {
          return;
       }
       if (this.b.u != null) {
          return;
       }
       TKHorizontalScrollView$f tb = this.b;
       if (tb.b == null && tb.l == null) {
          tb.setScrollState(0);
       }else {
          tb.l = false;
          tb.postOnAnimationDelayed(this, 60);
       }
       return;
    }
}
