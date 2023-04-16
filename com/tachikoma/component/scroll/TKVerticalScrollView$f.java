package com.tachikoma.component.scroll.TKVerticalScrollView$f;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ScrollView;

public class TKVerticalScrollView$f implements Runnable	// class@000d25
{
    public final TKVerticalScrollView b;

    public void TKVerticalScrollView$f(TKVerticalScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKVerticalScrollView$f.class, "1")) {
          return;
       }
       if (this.b.u != null) {
          return;
       }
       TKVerticalScrollView$f tb = this.b;
       if (tb.b == null && tb.l == null) {
          tb.setScrollState(0);
       }else {
          tb.l = false;
          tb.postOnAnimationDelayed(this, 60);
       }
       return;
    }
}
