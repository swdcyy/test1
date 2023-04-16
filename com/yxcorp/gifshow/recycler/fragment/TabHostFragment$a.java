package com.yxcorp.gifshow.recycler.fragment.TabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;

public class TabHostFragment$a implements ViewPager$i	// class@0017ab
{
    public boolean b;
    public boolean c;
    public final TabHostFragment d;

    public void TabHostFragment$a(TabHostFragment p0){
       this.d = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport2(TabHostFragment$a.class, "3") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragment$a.class, "3")) {
          return;
       }
       if (this.d.Dh()) {
          if (!p0 && (this.c != null && this.b != null)) {
             TabHostFragment$a td = this.d;
             td.Fh(td.ph());
             boolean b = false;
             this.b = b;
             this.c = b;
          }else if(p0 == 2){
             this.b = true;
          }
       }
       TabHostFragment a = this.d.A;
       if (a != null) {
          a.onPageScrollStateChanged(p0);
       }
       PatchProxy.onMethodExit(TabHostFragment$a.class, "3");
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport2(TabHostFragment$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, TabHostFragment$a.class, "1")) {
          return;
       }
       TabHostFragment a = this.d.A;
       if (a != null) {
          a.onPageScrolled(p0, p1, p2);
       }
       this.b = true;
       PatchProxy.onMethodExit(TabHostFragment$a.class, "1");
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport2(TabHostFragment$a.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragment$a.class, "2")) {
          return;
       }
       this.c = true;
       if (this.b == null || !this.d.Dh()) {
          this.d.Fh(p0);
       }
       TabHostFragment a = this.d.A;
       if (a != null) {
          a.onPageSelected(p0);
       }
       PatchProxy.onMethodExit(TabHostFragment$a.class, "2");
       return;
    }
}
