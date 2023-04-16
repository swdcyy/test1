package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.util.SparseIntArray;
import j99.r;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import foc.t;
import foc.y;
import foc.q;

public class d$b implements ViewPager$i	// class@001bc3
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       d y;
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.b;
       uob.z = uob.z + 1;
       this.b.x.put(p0, (uob.x.get(p0) + 1));
       uob = this.b;
       if (uob.C == null) {
          y = uob.y;
          if (y != null) {
             this.b.y.put(p0, (y.get(p0) + 1));
          }
       }
       if ((p0 + 1) != this.b.v.j()) {
          k1.m(this.b.B);
          this.b.q.setVisibility(4);
       }
       uob = this.b;
       if (uob.C == null) {
          t ot = y.a(uob.u.getDetailCommonParam().getUnserializableBundleId());
          if (ot instanceof q) {
             ot.a(p0);
          }
       }
       return;
    }
}
