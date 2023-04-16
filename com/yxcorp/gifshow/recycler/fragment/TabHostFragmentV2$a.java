package com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;

public class TabHostFragmentV2$a implements ViewPager$i	// class@0017ad
{
    public boolean b;
    public boolean c;
    public boolean d;
    public final TabHostFragmentV2 e;

    public void TabHostFragmentV2$a(TabHostFragmentV2 p0){
       this.e = p0;
       super();
       this.b = true;
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport2(TabHostFragmentV2$a.class, "3") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragmentV2$a.class, "3")) {
          return;
       }
       if (this.e.gh()) {
          if (!p0 && (this.d != null && this.c != null)) {
             TabHostFragmentV2$a te = this.e;
             te.ih(te.dh());
             this.c = false;
             this.d = false;
          }else if(p0 == 2){
             this.c = true;
          }
       }
       PatchProxy.onMethodExit(TabHostFragmentV2$a.class, "3");
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport2(TabHostFragmentV2$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, TabHostFragmentV2$a.class, "1")) {
          return;
       }
       this.c = true;
       if (this.b != null && (!p0 && (!p1 && !p2))) {
          this.e.ih(0);
          this.b = false;
       }
    label_003a :
       PatchProxy.onMethodExit(TabHostFragmentV2$a.class, "1");
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport2(TabHostFragmentV2$a.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragmentV2$a.class, "2")) {
          return;
       }
       this.d = true;
       if (this.c == null || !this.e.gh()) {
          this.e.ih(p0);
       }
       PatchProxy.onMethodExit(TabHostFragmentV2$a.class, "2");
       return;
    }
}
