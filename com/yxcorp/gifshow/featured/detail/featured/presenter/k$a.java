package com.yxcorp.gifshow.featured.detail.featured.presenter.k$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;

public class k$a extends ViewPager$l	// class@000f7a
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       boolean b = (p0)? true: false;
       uoa.x = b;
       if (b) {
          k v = uoa.v;
          if (v != null) {
             v.o();
          }
       }
       return;
    }
}
