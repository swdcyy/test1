package com.google.android.material.tabs.TabLayout$g;
import androidx.viewpager.widget.ViewPager$i;
import com.google.android.material.tabs.TabLayout;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.google.android.material.tabs.TabLayout$f;

public class TabLayout$g implements ViewPager$i	// class@0016cf
{
    public final WeakReference b;
    public int c;
    public int d;

    public void TabLayout$g(TabLayout p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void a(){
       this.d = 0;
       this.c = 0;
    }
    public void onPageScrollStateChanged(int p0){
       this.c = this.d;
       this.d = p0;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       TabLayout tabLayout = this.b.get();
       if (tabLayout != null) {
          TabLayout$g td = this.d;
          boolean b = false;
          boolean b1 = (td != 2 || this.c == 1)? true: false;
          if (td != 2 || this.c != null) {
             b = true;
          }
          tabLayout.G(p0, p1, b1, b);
       }
       return;
    }
    public void onPageSelected(int p0){
       TabLayout tabLayout = this.b.get();
       if (tabLayout != null && (tabLayout.getSelectedTabPosition() != p0 && p0 < tabLayout.getTabCount())) {
          TabLayout$g td = this.d;
          boolean b = (td == null || (td == 2 && this.c == null))? true: false;
          tabLayout.D(tabLayout.v(p0), b);
       }
    label_002c :
       return;
    }
}
