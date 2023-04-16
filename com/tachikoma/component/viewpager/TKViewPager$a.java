package com.tachikoma.component.viewpager.TKViewPager$a;
import java.lang.Runnable;
import com.tachikoma.component.viewpager.TKViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKViewPager$a implements Runnable	// class@000d2f
{
    public final TKViewPager b;

    public void TKViewPager$a(TKViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKViewPager$a.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
