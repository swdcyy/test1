package com.tachikoma.component.viewpager2.TKViewPager2$a;
import java.lang.Runnable;
import com.tachikoma.component.viewpager2.TKViewPager2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKViewPager2$a implements Runnable	// class@000d34
{
    public final TKViewPager2 b;

    public void TKViewPager2$a(TKViewPager2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2$a.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
