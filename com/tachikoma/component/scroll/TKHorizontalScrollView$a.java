package com.tachikoma.component.scroll.TKHorizontalScrollView$a;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo8.b;

public class TKHorizontalScrollView$a implements Runnable	// class@000d18
{
    public final TKHorizontalScrollView b;

    public void TKHorizontalScrollView$a(TKHorizontalScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKHorizontalScrollView$a.class, "1")) {
          return;
       }
       if (this.b.u != null) {
          return;
       }
       TKHorizontalScrollView$a tb = this.b;
       tb.s.g(tb.h, tb.i);
       return;
    }
}
