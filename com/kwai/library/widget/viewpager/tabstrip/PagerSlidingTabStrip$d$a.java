package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import android.view.View;

public class PagerSlidingTabStrip$d$a implements View$OnClickListener	// class@000a8d
{
    public final ViewPager b;
    public final int c;
    public final PagerSlidingTabStrip$d d;

    public void PagerSlidingTabStrip$d$a(PagerSlidingTabStrip$d p0,ViewPager p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       PagerSlidingTabStrip$d h = this.d.h;
       if (h != null) {
          h.onClick(p0);
          if (this.d.g != null) {
             return;
          }
       }
       PagerSlidingTabStrip$d$a td = this.d;
       if (td.e != null) {
          return;
       }else if(td.f != null){
          this.b.setCurrentItem(this.c);
       }else {
          this.b.setCurrentItem(this.c, false);
       }
       return;
    }
}
