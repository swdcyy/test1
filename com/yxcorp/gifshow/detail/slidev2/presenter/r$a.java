package com.yxcorp.gifshow.detail.slidev2.presenter.r$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import tkd.b;
import tkd.d;
import gx5.d;
import com.kwai.framework.model.user.PhotoGuestConfig;
import lnc.a1;
import e17.i;
import java.lang.Runnable;
import ekd.k1;

public class r$a extends a	// class@0019d1
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, r$a.class, "1")) {
          return;
       }
       if (TextUtils.n(this.b.p.getNasaSlideParam().getViewedPhotoId(), this.b.s.getPhotoId())) {
          r$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, r.class, "4")) {
             PhotoGuestConfig photoGuestCo = d.a(-1188553266).Hj();
             if (photoGuestCo != null) {
                if (photoGuestCo.a(tb.s.created())) {
                   i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f104844, photoGuestCo.mTimeRangeDays));
                }else {
                   k1.r(tb.u, 200);
                }
             }
          }
          this.b.p.getNasaSlideParam().mViewedPhotoId = null;
       }
       return;
    }
}
