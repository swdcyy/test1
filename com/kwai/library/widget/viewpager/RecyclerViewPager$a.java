package com.kwai.library.widget.viewpager.RecyclerViewPager$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;

public class RecyclerViewPager$a extends RecyclerViewPager$b	// class@000a6f
{
    public final RecyclerViewPager a;

    public void RecyclerViewPager$a(RecyclerViewPager p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       Iterator iterator = this.a.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrollStateChanged(p0);
       }
       return;
    }
    public void b(int p0,float p1,int p2){
       Iterator iterator = this.a.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void c(int p0){
       RecyclerViewPager$a ta = this.a;
       ta.f = p0;
       RecyclerViewPager g = ta.g;
       Iterator iterator = ta.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, g);
       }
       RecyclerViewPager$a ta1 = this.a;
       ta1.g = ta1.f;
       return;
    }
}
