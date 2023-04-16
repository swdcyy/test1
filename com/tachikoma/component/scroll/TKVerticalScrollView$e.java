package com.tachikoma.component.scroll.TKVerticalScrollView$e;
import java.lang.Runnable;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKVerticalScrollView$e implements Runnable	// class@000d24
{
    public final TKVerticalScrollView b;

    public void TKVerticalScrollView$e(TKVerticalScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKVerticalScrollView$e.class, "1")) {
          return;
       }
       this.b.k();
       return;
    }
}
