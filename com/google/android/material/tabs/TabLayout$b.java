package com.google.android.material.tabs.TabLayout$b;
import androidx.viewpager.widget.ViewPager$h;
import com.google.android.material.tabs.TabLayout;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager;
import h3.a;

public class TabLayout$b implements ViewPager$h	// class@0016ca
{
    public boolean b;
    public final TabLayout c;

    public void TabLayout$b(TabLayout p0){
       this.c = p0;
       super();
    }
    public void a(ViewPager p0,a p1,a p2){
       TabLayout$b tc = this.c;
       if (tc.viewPager == p0) {
          tc.E(p2, this.b);
       }
       return;
    }
    public void b(boolean p0){
       this.b = p0;
    }
}
