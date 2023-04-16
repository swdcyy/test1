package com.tachikoma.component.scroll.TKVerticalScrollView$b;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import eo8.b;
import android.widget.ScrollView;

public class TKVerticalScrollView$b implements Runnable	// class@000d21
{
    public boolean b;
    public final TKVerticalScrollView c;

    public void TKVerticalScrollView$b(TKVerticalScrollView p0){
       this.c = p0;
       super();
       this.b = false;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKVerticalScrollView$b.class, "1")) {
          return;
       }
       TKVerticalScrollView$b tc = this.c;
       TKVerticalScrollView tKVerticalSc = 50;
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
             this.c.postOnAnimationDelayed(this, tKVerticalSc);
          }
       }else {
          tc.c = b;
          tc.postOnAnimationDelayed(this, tKVerticalSc);
       }
       return;
    }
}
