package com.yxcorp.gifshow.featured.detail.featured.presenter.n$f;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import lnc.z3;

public class n$f implements ViewPager$i	// class@000f88
{
    public boolean b;
    public final n c;

    public void n$f(n p0,boolean p1){
       this.c = p0;
       super();
       this.b = false;
       this.b = p1;
    }
    public void a(boolean p0){
       this.b = p0;
    }
    public void onPageScrollStateChanged(int p0){
       n$f uof = n$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (this.b != null) {
          int i = 1;
          if (p0 == i) {
             boolean b = false;
             this.b = b;
             this.c.H.w1();
             n$f tc = this.c;
             if (tc.L != null) {
                tc.N.a("lazyThirdFragment");
                int[] ointArray = new int[i];
                ointArray[b] = 2;
                this.c.H.Q1(i, ointArray);
             }else {
                tc.H.P1(b);
             }
             n$f tc1 = this.c;
             tc1.H.g(tc1.M);
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
