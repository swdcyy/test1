package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import java.lang.Object;
import com.yxcorp.gifshow.ad.response.CouponReceiveResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.MixLottieCardData;
import lnc.y0;
import w4.r;
import com.yxcorp.gifshow.ad.response.CouponReceiveResponse$CouponReceiveData;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Boolean;
import e17.i;

public final class ThanosPlayMixLottieEndView$c implements g	// class@0015f6
{
    public final ThanosPlayMixLottieEndView b;
    public final int c;

    public void ThanosPlayMixLottieEndView$c(ThanosPlayMixLottieEndView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       HashMap hashMap;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosPlayMixLottieEndView$c.class, "1")) {
       }else if(p0.mResult == 1){
          ThanosPlayMixLottieEndView$c tb = this.b;
          int i = 2;
          Objects.requireNonNull(tb);
          Boolean uBoolean = null;
          if (!PatchProxy.isSupport(ThanosPlayMixLottieEndView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, ThanosPlayMixLottieEndView.class, "11")) {
             PhotoAdvertisement photoAdverti = k.B(tb.k);
             photoAdverti = (photoAdverti != null)? photoAdverti.mTKStatusDataMap: uBoolean;
             if (photoAdverti == null) {
                hashMap = new HashMap();
                PhotoAdvertisement photoAdverti1 = k.B(tb.k);
                if (photoAdverti1 != null) {
                   photoAdverti1.mTKStatusDataMap = hashMap;
                }
             }
             hashMap.put("receiveStatus", Integer.valueOf(i));
          }
          ThanosPlayMixLottieEndView j = this.b.j;
          if (j == null) {
             a.S("mTextDelegate");
          }
          ThanosPlayMixLottieEndView l = this.b.l;
          MixLottieCardData afterReceive = (l != null)? l.afterReceiveActionbar: uBoolean;
          j.a("actionBar", y0.q(afterReceive, 4));
          CouponReceiveResponse mData = p0.mData;
          if (mData != null) {
             CouponReceiveResponse$CouponReceiveData mMessage = mData.mMessage;
             if (mMessage != null) {
                uBoolean = Boolean.valueOf((u.S1(mMessage) ^ 1));
             }
          }
          if (y0.p(uBoolean)) {
             i.d(R.style.arg_RES_7f11066a, p0.mData.mMessage);
          }
       }
       ThanosPlayMixLottieEndView.g(this.b, this.c);
       return;
    }
}
