package com.kuaishou.merchant.live.cart.onsale.widget.MarketingTaskView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.basic.widget.MerchantCDNImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.model.TaskStep;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;

public final class MarketingTaskView extends ConstraintLayout	// class@0019c1
{
    public MerchantCDNImageView B;
    public MerchantCDNImageView C;
    public KwaiImageView D;
    public TextView E;
    public TextView F;
    public KwaiImageView G;
    public KwaiImageView H;
    public Animatable I;
    public Animatable J;
    public TaskStep K;
    public boolean L;
    public HashMap M;

    public void MarketingTaskView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void MarketingTaskView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void MarketingTaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, MarketingTaskView.class, "6")) {
       }else {
          this.setClipChildren(false);
          this.setClipToPadding(false);
          a.b(this.getContext(), R.layout.arg_RES_7f0d0811, this);
          this.B = this.findViewById(0x7f0a3b2a);
          this.C = this.findViewById(0x7f0a0d44);
          this.D = this.findViewById(0x7f0a3c23);
          this.E = this.findViewById(0x7f0a3201);
          this.F = this.findViewById(0x7f0a320f);
          this.G = this.findViewById(0x7f0a320e);
          this.H = this.findViewById(0x7f0a3210);
       }
       return;
    }
    public void MarketingTaskView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, MarketingTaskView.class, "5")) {
          return;
       }
       MarketingTaskView tB = this.B;
       if (tB != null) {
          tB.i0();
       }
       tB = this.C;
       if (tB != null) {
          tB.i0();
       }
       tB = this.C;
       if (tB != null) {
          tB.setVisibility(0);
       }
       tB = this.B;
       if (tB != null) {
          tB.setVisibility(8);
       }
       tB = this.G;
       if (tB != null) {
          tB.clearAnimation();
       }
       tB = this.G;
       if (tB != null) {
          tB.setAlpha(0x3f800000);
       }
       tB = this.E;
       float f = 0;
       if (tB != null) {
          tB.setAlpha(f);
       }
       tB = this.H;
       if (tB != null) {
          tB.setAlpha(f);
       }
       tB = this.K;
       if (tB != null) {
          List couponDoneUr = tB.getCouponDoneUrl();
          if (couponDoneUr != null) {
             MarketingTaskView tC = this.C;
             if (tC != null) {
                tC.P(couponDoneUr);
             }
          }
       }
       return;
    }
    public final void M(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MarketingTaskView.class, "7")) {
          return;
       }
       MarketingTaskView tK = this.K;
       if (tK != null) {
          objArray = tK.getStepIndex();
       }
       if (objArray != null && (!objArray.intValue() || (objArray != null && (objArray.intValue() == 1 || (objArray != null && objArray.intValue() == 2))))) {
          MarketingTaskView tB1 = this.B;
          if (tB1 != null) {
             KwaiCDNImageView.q0(tB1, R.string.arg_RES_7f103362, 0, null, 6, null);
          }
          MarketingTaskView tC1 = this.C;
          if (tC1 != null) {
             KwaiCDNImageView.q0(tC1, R.string.arg_RES_7f103362, 0, null, 6, null);
          }
       }else if(objArray != null && objArray.intValue() == 3){
          MarketingTaskView tB = this.B;
          if (tB != null) {
             KwaiCDNImageView.q0(tB, R.string.arg_RES_7f103361, 0, null, 6, null);
          }
          MarketingTaskView tC = this.C;
          if (tC != null) {
             KwaiCDNImageView.q0(tC, R.string.arg_RES_7f103361, 0, null, 6, null);
          }
       }
    label_0076 :
       return;
    }
}
