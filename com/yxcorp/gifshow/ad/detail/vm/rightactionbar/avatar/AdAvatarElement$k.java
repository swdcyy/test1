package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$k;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import d29.c;
import w19.d;
import d29.b;
import crd.b;
import ok.h;
import lnc.b9;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import qp7.x0;
import qp7.b;
import os7.a;

public final class AdAvatarElement$k implements Observer	// class@001719
{
    public final AdAvatarElement b;

    public void AdAvatarElement$k(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       AvatarInfoResponse mPhoto;
       DynamicEffectMarker mIcon;
       DynamicEffectMarker mIsBlocked;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAvatarElement$k.class, "1")) {
       }else {
          k1.r(new a(this), 0);
          AdAvatarElement$k tb = this.b;
          Objects.requireNonNull(tb);
          AdAvatarElement uAdAvatarEle = AdAvatarElement.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uAdAvatarEle, "20")) {
             tb.F = true;
             if (p0 == null) {
                tb.v0();
             }else {
                tb.w0(p0);
                AdAvatarElement t = tb.t;
                if (t == null) {
                   a.S("mPhoto");
                }
                AdAvatarElement j = tb.J;
                mPhoto = (j != null)? j.mPhoto: null;
                s.G(t, mPhoto);
                if (tb.r0()) {
                   AvatarInfoResponse mDynamicEffe = p0.mDynamicEffectMarker;
                   if (mDynamicEffe != null) {
                      mIcon = mDynamicEffe.mIcon;
                      mIsBlocked = mDynamicEffe.mIsBlocked;
                   }else {
                      mIcon = null;
                      mIsBlocked = null;
                   }
                   p0 = p0.mPhoto;
                   if (p0 != null) {
                      AdAvatarElement t1 = tb.t;
                      if (t1 == null) {
                         a.S("mPhoto");
                      }
                      r1.q5(t1.mEntity, true);
                      tb.C = new c(p0, tb);
                      p0 = tb.w;
                      if (p0 == null) {
                         a.S("mCallerContext");
                      }
                      p0.n = tb.C;
                   }
                   if (!PatchProxy.applyVoid(null, tb, uAdAvatarEle, "24")) {
                      p0 = tb.L;
                      if (p0 == null) {
                         tb.L = b9.c(p0, new b(tb));
                      }
                   }
                   boolean b = (tb.r0() && mIsBlocked == null)? true: false;
                   tb.u0(b, mIcon);
                   b = tb.t;
                   if (b == null) {
                      a.S("mPhoto");
                   }
                   if (b.isAd()) {
                      b = tb.t;
                      if (b == null) {
                         a.S("mPhoto");
                      }
                      b = k.B(b);
                      if (b != null) {
                         b.mIsInLiving = true;
                      }
                   }
                }else {
                   tb.u0(false, null);
                   tb.C = null;
                }
                if (tb.K != 3 && tb.p0()) {
                   tb.E().k(false, null, null);
                }
                tb.v0();
             }
          }
       }
       return;
    }
}
