package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareRedPacketView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveMerchantTrustDareRedPacketView extends ConstraintLayout	// class@001b77
{
    public KwaiImageView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public HashMap E;

    public void LiveMerchantTrustDareRedPacketView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareRedPacketView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareRedPacketView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.f(this, R.layout.arg_RES_7f0d163e, true);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTrustDareRedPacketView.class, "1")) {
       }else {
          this.B = m1.f(this, 0x7f0a4088);
          this.C = m1.f(this, 0x7f0a4087);
          this.D = m1.f(this, 0x7f0a4086);
       }
       return;
    }
    public void LiveMerchantTrustDareRedPacketView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(LiveMerchantTrustDareRedPacketStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareRedPacketView.class, "2")) {
          return;
       }
       if (p0 != null) {
          LiveMerchantTrustDareRedPacketView tB = this.B;
          if (tB == null) {
             a.S("mRedPacketMiddleBgView");
          }
          tB.P(p0.getMMiddleBgUrls());
          tB = this.C;
          if (tB == null) {
             a.S("mRedPacketContentBgView");
          }
          tB.P(p0.getMContentBgUrls());
          tB = this.D;
          if (tB == null) {
             a.S("mRedPacketBottomBgView");
          }
          tB.P(p0.getMBottomBgUrls());
       }
       return;
    }
}
