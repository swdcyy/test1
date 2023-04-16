package com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.LiveMerchantAncSkyFallPendentView;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveAnchorSkyFallPendentModel;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

public final class LiveMerchantAncSkyFallPendentView extends KwaiFixedScreenWidthFrameLayout	// class@001b64
{
    public TextView c;
    public MerchantLottieAnimationView d;
    public LiveAnchorSkyFallPendentModel e;
    public HashMap f;

    public void LiveMerchantAncSkyFallPendentView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantAncSkyFallPendentView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantAncSkyFallPendentView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.b(p0, R.layout.arg_RES_7f0d00c2, this);
       if (PatchProxy.applyVoidOneRefs(this, this, LiveMerchantAncSkyFallPendentView.class, "2")) {
       }else {
          this.c = m1.f(this, 0x7f0a0202);
          this.d = m1.f(this, 0x7f0a0201);
       }
       return;
    }
    public void LiveMerchantAncSkyFallPendentView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void n(LiveAnchorSkyFallPendentModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAncSkyFallPendentView.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.e = p0;
       LiveMerchantAncSkyFallPendentView tc = this.c;
       if (tc == null) {
          a.S("mPendantStatusView");
       }
       LiveMerchantAncSkyFallPendentView te = this.e;
       LiveAnchorSkyFallPendentModel mPendantActi = (te != null)? te.mPendantActivityStatusName: null;
       tc.setText(mPendantActi);
       this.o();
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAncSkyFallPendentView.class, "4")) {
          return;
       }
       LiveMerchantAncSkyFallPendentView te = this.e;
       if (te != null) {
          boolean b = true;
          if (te.mPendantActivityStatus == b) {
             te = this.d;
             if (te == null) {
                a.S("mAnimationView");
             }
             if (te.p()) {
                return;
             }else {
                te = this.d;
                if (te == null) {
                   a.S("mAnimationView");
                }
                te.setVisibility(0);
                te = this.d;
                if (te == null) {
                   a.S("mAnimationView");
                }
                te.q(b);
                te = this.d;
                if (te == null) {
                   a.S("mAnimationView");
                }
                te.s();
             }
          }else {
             te = this.d;
             if (te == null) {
                a.S("mAnimationView");
             }
             te.setVisibility(8);
             te = this.d;
             if (te == null) {
                a.S("mAnimationView");
             }
             te.f();
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAncSkyFallPendentView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.o();
       return;
    }
}
