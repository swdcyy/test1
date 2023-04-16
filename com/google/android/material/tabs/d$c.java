package com.google.android.material.tabs.d$c;
import androidx.viewpager2.widget.ViewPager2$h;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;

public class d$c extends ViewPager2$h	// class@0016db
{
    public final WeakReference a;
    public int b;
    public int c;

    public void d$c(TabLayout p0){
       super();
       this.a = new WeakReference(p0);
       this.d();
    }
    public void a(int p0){
       this.b = this.c;
       this.c = p0;
    }
    public void b(int p0,float p1,int p2){
       TabLayout tabLayout = this.a.get();
       if (tabLayout != null) {
          d$c tc = this.c;
          boolean b = false;
          boolean b1 = (tc != 2 || this.b == 1)? true: false;
          if (tc != 2 || this.b != null) {
             b = true;
          }
          tabLayout.G(p0, p1, b1, b);
       }
       return;
    }
    public void c(int p0){
       TabLayout tabLayout = this.a.get();
       if (tabLayout != null && (tabLayout.getSelectedTabPosition() != p0 && p0 < tabLayout.getTabCount())) {
          d$c tc = this.c;
          boolean b = (tc == null || (tc == 2 && this.b == null))? true: false;
          tabLayout.D(tabLayout.v(p0), b);
       }
    label_002c :
       return;
    }
    public void d(){
       this.c = 0;
       this.b = 0;
    }
}
