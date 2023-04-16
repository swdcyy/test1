package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g;
import java.lang.Object;

public class g$c implements ViewPager$i	// class@000f3a
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       g$c tb = this.b;
       boolean b = (p0)? true: false;
       tb.I = b;
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
