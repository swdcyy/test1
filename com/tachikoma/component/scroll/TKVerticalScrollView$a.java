package com.tachikoma.component.scroll.TKVerticalScrollView$a;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo8.b;

public class TKVerticalScrollView$a implements Runnable	// class@000d20
{
    public final TKVerticalScrollView b;

    public void TKVerticalScrollView$a(TKVerticalScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKVerticalScrollView$a.class, "1")) {
          return;
       }
       if (this.b.u != null) {
          return;
       }
       TKVerticalScrollView$a tb = this.b;
       tb.s.g(tb.h, tb.i);
       return;
    }
}
