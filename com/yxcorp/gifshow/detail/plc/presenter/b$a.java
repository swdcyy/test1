package com.yxcorp.gifshow.detail.plc.presenter.b$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f4a.f;
import f4a.b0;

public class b$a implements ViewPager$i	// class@001698
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       b$a tb;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          tb = this.b;
          if (tb.W.d == null) {
             tb.R8(7);
          }
       }else {
          tb = this.b;
          b w = tb.W;
          if (w.d != null) {
             f a = w.a;
             f b = w.b;
             tb.R8(8);
             b w1 = this.b.w;
             if (w1 != null) {
                if (b != null) {
                   w1.v();
                }
                if (a != null) {
                   this.b.w.M();
                }
             }
          }
       }
       return;
    }
}
