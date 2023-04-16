package com.tachikoma.component.scroll.TKHorizontalScrollView$b;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import eo8.b;
import android.widget.HorizontalScrollView;

public class TKHorizontalScrollView$b implements Runnable	// class@000d19
{
    public boolean b;
    public final TKHorizontalScrollView c;

    public void TKHorizontalScrollView$b(TKHorizontalScrollView p0){
       this.c = p0;
       super();
       this.b = false;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKHorizontalScrollView$b.class, "1")) {
          return;
       }
       TKHorizontalScrollView$b tc = this.c;
       TKHorizontalScrollView tKHorizontal = 50;
       boolean b = true;
       if (tc.c != null) {
          if (tc.j != null && this.b == null) {
             this.b = b;
             tc.l(0);
             b = false;
          }
          if (b) {
             tc = this.c;
             tc.s.i(tc, tc.n, tc.o);
             this.c.setScrollState(0);
          }else {
             this.c.postOnAnimationDelayed(this, tKHorizontal);
          }
       }else {
          tc.c = b;
          tc.postOnAnimationDelayed(this, tKHorizontal);
       }
       return;
    }
}
