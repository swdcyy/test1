package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$d;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.ad.response.CouponReceiveResponse;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Boolean;
import lnc.y0;
import e17.i;

public final class ThanosPlayMixLottieEndView$d implements g	// class@0015f7
{
    public final ThanosPlayMixLottieEndView b;
    public final int c;

    public void ThanosPlayMixLottieEndView$d(ThanosPlayMixLottieEndView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosPlayMixLottieEndView$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.c("ThanosPlayMixLottieEndView", "receive coupon interface failed: "+p0, objArray);
          Boolean uBoolean = null;
          if (!p0 instanceof KwaiException) {
             p0 = uBoolean;
          }
          if (p0 != null) {
             p0 = p0.mResponse;
             p0 = (p0 != null)? p0.a(): uBoolean;
             if (!p0 instanceof CouponReceiveResponse) {
                p0 = uBoolean;
             }
             if (p0 != null && p0.mResult == 0x1adb1) {
                CouponReceiveResponse mErrorMsg = p0.mErrorMsg;
                if (mErrorMsg != null) {
                   uBoolean = Boolean.valueOf((u.S1(mErrorMsg) ^ 0x01));
                }
                if (y0.p(uBoolean)) {
                   i.d(R.style.arg_RES_7f11066a, p0.mErrorMsg);
                }
             }
          }
       label_0066 :
          ThanosPlayMixLottieEndView.g(this.b, this.c);
       }
       return;
    }
}
