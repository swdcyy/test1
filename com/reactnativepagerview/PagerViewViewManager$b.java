package com.reactnativepagerview.PagerViewViewManager$b;
import java.lang.Runnable;
import com.reactnativepagerview.PagerViewViewManager;
import androidx.viewpager2.widget.ViewPager2;
import com.reactnativepagerview.NestedScrollableHost;
import java.lang.Object;
import com.reactnativepagerview.PagerViewViewManager$b$a;
import androidx.viewpager2.widget.ViewPager2$h;
import df.c;
import rk8.c;
import android.widget.FrameLayout;
import df.b;

public final class PagerViewViewManager$b implements Runnable	// class@000b6f
{
    public final PagerViewViewManager b;
    public final ViewPager2 c;
    public final NestedScrollableHost d;

    public void PagerViewViewManager$b(PagerViewViewManager p0,ViewPager2 p1,NestedScrollableHost p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       this.c.j(new PagerViewViewManager$b$a(this));
       PagerViewViewManager.access$getEventDispatcher$p(this.b).c(new c(this.d.getId(), this.c.getCurrentItem()));
    }
}
