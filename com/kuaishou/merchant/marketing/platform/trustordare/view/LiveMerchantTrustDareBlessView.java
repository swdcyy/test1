package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBlessView;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareBlessInfo;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBlessView$a;
import android.view.View$OnClickListener;

public final class LiveMerchantTrustDareBlessView extends LiveMerchantTrustDareBaseView	// class@001b71
{
    public KwaiImageView D;
    public TextView E;
    public TextView F;
    public HashMap G;

    public void LiveMerchantTrustDareBlessView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareBlessView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareBlessView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.f(this, R.layout.arg_RES_7f0d163a, true);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTrustDareBlessView.class, "1")) {
       }else {
          this.D = m1.f(this, 0x7f0a4083);
          this.E = m1.f(this, 0x7f0a4084);
          this.F = m1.f(this, 0x7f0a4085);
       }
       return;
    }
    public void LiveMerchantTrustDareBlessView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(LiveMerchantTrustDareBlessInfo p0){
       LiveMerchantTrustDareBlessView tD;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareBlessView.class, "2")) {
          return;
       }
       String str = "mBlessJumpBtn";
       if (p0 != null) {
          tD = this.D;
          if (tD == null) {
             a.S("mBlessBgView");
          }
          tD.P(p0.getMBlessBgUrls());
          tD = this.E;
          if (tD == null) {
             a.S("mBlessDesTv");
          }
          tD.setText(p0.getMBlessDes());
          tD = this.F;
          if (tD == null) {
             a.S(str);
          }
          tD.setText(p0.getMButtonTitle());
       }
       String mJumpUrl = (p0 != null)? p0.getMJumpUrl(): null;
       if (TextUtils.x(mJumpUrl)) {
          tD = this.F;
          if (tD == null) {
             a.S(str);
          }
          if (tD != null) {
             tD.setVisibility(4);
          }
       }
       tD = this.F;
       if (tD == null) {
          a.S(str);
       }
       if (tD != null) {
          tD.setOnClickListener(new LiveMerchantTrustDareBlessView$a(this, p0));
       }
       return;
    }
}
