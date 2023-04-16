package com.reactnativepagerview.PagerViewViewManager$d;
import java.lang.Runnable;
import com.reactnativepagerview.PagerViewViewManager;
import androidx.viewpager2.widget.ViewPager2;
import com.reactnativepagerview.NestedScrollableHost;
import java.lang.Object;
import java.lang.Integer;

public final class PagerViewViewManager$d implements Runnable	// class@000b71
{
    public final PagerViewViewManager b;
    public final ViewPager2 c;
    public final int d;
    public final NestedScrollableHost e;

    public void PagerViewViewManager$d(PagerViewViewManager p0,ViewPager2 p1,int p2,NestedScrollableHost p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       this.b.setCurrentItem(this.c, this.d, false);
       this.e.setInitialIndex(Integer.valueOf(this.d));
    }
}
