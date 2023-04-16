package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$a;
import java.lang.Runnable;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.lang.Object;

public class PagerSlidingTabStrip$a implements Runnable	// class@000a8a
{
    public final PagerSlidingTabStrip b;

    public void PagerSlidingTabStrip$a(PagerSlidingTabStrip p0){
       this.b = p0;
       super();
    }
    public void run(){
       PagerSlidingTabStrip$a tb = this.b;
       if (tb.Y0 != null) {
          tb.t(tb.l, 0);
       }
       return;
    }
}
