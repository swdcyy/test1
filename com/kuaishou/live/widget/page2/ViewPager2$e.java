package com.kuaishou.live.widget.page2.ViewPager2$e;
import com.kuaishou.live.widget.page2.ViewPager2$d;
import com.kuaishou.live.widget.page2.ViewPager2;
import com.kuaishou.live.widget.page2.ViewPager2$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b2.d;
import b2.d$a;
import java.lang.IllegalStateException;
import java.lang.CharSequence;

public class ViewPager2$e extends ViewPager2$d	// class@001030
{
    public final ViewPager2 b;

    public void ViewPager2$e(ViewPager2 p0){
       this.b = p0;
       super(p0, null);
    }
    public boolean a(int p0){
       ViewPager2$e uoe = ViewPager2$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 == 8192 || (p0 == 4096 && !this.b.d()))? true: false;
       return b;
    }
    public void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$e.class, "3")) {
          return;
       }
       if (!this.b.d()) {
          p0.R(d$a.r);
          p0.R(d$a.q);
          p0.w0(false);
       }
       return;
    }
    public boolean i(int p0){
       ViewPager2$e uoe = ViewPager2$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a(p0)) {
          return false;
       }else {
          throw new IllegalStateException();
       }
    }
    public CharSequence l(){
       Object obj = PatchProxy.apply(null, this, ViewPager2$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "androidx.viewpager.widget.ViewPager";
    }
}
