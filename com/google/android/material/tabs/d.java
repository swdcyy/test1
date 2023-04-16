package com.google.android.material.tabs.d;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.d$b;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.google.android.material.tabs.d$c;
import androidx.viewpager2.widget.ViewPager2$h;
import com.google.android.material.tabs.d$d;
import com.google.android.material.tabs.TabLayout$c;
import com.google.android.material.tabs.d$a;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.IllegalStateException;
import java.lang.String;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Math;

public final class d	// class@0016dd
{
    public final TabLayout a;
    public final ViewPager2 b;
    public final boolean c;
    public final d$b d;
    public RecyclerView$Adapter e;
    public boolean f;
    public d$c g;
    public TabLayout$d h;
    public RecyclerView$i i;

    public void d(TabLayout p0,ViewPager2 p1,d$b p2){
       super(p0, p1, true, p2);
    }
    public void d(TabLayout p0,ViewPager2 p1,boolean p2,d$b p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(){
       if (this.f != null) {
          throw new IllegalStateException("TabLayoutMediator is already attached");
       }
       RecyclerView$Adapter adapter = this.b.getAdapter();
       this.e = adapter;
       if (adapter == null) {
          throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
       }
       this.f = true;
       d$c uoc = new d$c(this.a);
       this.g = uoc;
       this.b.j(uoc);
       d$d uod = new d$d(this.b);
       this.h = uod;
       this.a.a(uod);
       if (this.c != null) {
          d$a uoa = new d$a(this);
          this.i = uoa;
          this.e.F0(uoa);
       }
       this.b();
       this.a.F(this.b.getCurrentItem(), 0, true);
       return;
    }
    public void b(){
       this.a.z();
       d te = this.e;
       if (te != null) {
          int itemCount = te.getItemCount();
          boolean b = false;
          for (int i = 0; i < itemCount; i = i + 1) {
             TabLayout$f uof = this.a.w();
             this.d.a(uof, i);
             this.a.e(uof, b);
          }
          if (itemCount > 0) {
             itemCount = Math.min(this.b.getCurrentItem(), (this.a.getTabCount() - 1));
             if (itemCount != this.a.getSelectedTabPosition()) {
                d ta = this.a;
                ta.selectTab(ta.v(itemCount));
             }
          }
       }
       return;
    }
}
