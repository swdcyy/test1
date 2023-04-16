package com.kds.headertabscrollview.viewmanager.ViewPagerViewManager$c;
import java.lang.Runnable;
import com.kds.headertabscrollview.viewmanager.ViewPagerViewManager;
import com.kds.headertabscrollview.layout.FlingViewPager;
import java.lang.Object;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Integer;

public final class ViewPagerViewManager$c implements Runnable	// class@00073e
{
    public final ViewPagerViewManager b;
    public final FlingViewPager c;
    public final int d;

    public void ViewPagerViewManager$c(ViewPagerViewManager p0,FlingViewPager p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       this.b.setCurrentItem(this.c.getViewPager(), this.d, false);
       this.c.setInitialIndex(Integer.valueOf(this.d));
    }
}
