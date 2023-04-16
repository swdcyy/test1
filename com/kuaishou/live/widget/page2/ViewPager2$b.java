package com.kuaishou.live.widget.page2.ViewPager2$b;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import com.kuaishou.live.widget.page2.ViewPager2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.widget.page2.ViewPager2$d;

public class ViewPager2$b extends ViewPager2$g	// class@00102d
{
    public final ViewPager2 a;

    public void ViewPager2$b(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       ViewPager2$b uob = ViewPager2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!p0) {
          this.a.h();
       }
       return;
    }
    public void c(int p0){
       ViewPager2$b uob = ViewPager2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       if (uob.e != p0) {
          uob.e = p0;
          uob.u.n();
       }
       return;
    }
}
