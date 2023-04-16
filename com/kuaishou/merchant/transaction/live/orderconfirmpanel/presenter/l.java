package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$a;
import nk4.q0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemTradeRollingInfo;
import java.util.Collection;
import ekd.q;
import android.widget.AdapterViewFlipper;
import lnc.a1;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import lnc.da;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper;
import android.widget.Adapter;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper$a;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class l extends PresenterV2	// class@000833
{
    public MerchantLivePurchasePanelResponse p;
    public AdapterViewFlipper q;
    public l$b r;
    public AdapterViewFlipper$a s;

    public void l(){
       super();
       this.r = new l$b(null);
       this.s = new q0(this);
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       MerchantLivePurchasePanelResponse mItemTradeRo = this.p.mItemTradeRollingInfo;
       if (mItemTradeRo == null || q.f(mItemTradeRo.mRollingInfos)) {
          this.q.setVisibility(8);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, ol, "6")){
          if (this.q.isFlipping()) {
             this.q.stopFlipping();
          }
          this.q.setVisibility(0);
          float[] uofloatArray = new float[]{(float)a1.d(0x7f07032c),0};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("y", uofloatArray),PropertyValuesHolder.ofFloat("alpha", new float[2]{0,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.q, propertyValu).setDuration(500);
          objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          float[] uofloatArray1 = new float[]{0,(float)(- a1.d(0x7f07032c))};
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("y", uofloatArray1),PropertyValuesHolder.ofFloat("alpha", new float[2]{0x3f800000,0})};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.q, propertyValu1).setDuration(500);
          objectAnimat1.setInterpolator(new AccelerateDecelerateInterpolator());
          MerchantLivePurchasePanelResponse mItemTradeRo1 = this.p.mItemTradeRollingInfo;
          this.r.b = mItemTradeRo1.mRollingInfos;
          this.q.setFlipInterval((int)da.a(mItemTradeRo1.mRollingTime));
          this.q.setInAnimation(objectAnimat);
          this.q.setOutAnimation(objectAnimat1);
          this.q.setAutoStop(0);
          this.q.setAdapter(this.r);
          this.q.setOnViewFlipperListener(this.s);
          this.q.startFlipping();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l tq = this.q;
       if (tq != null) {
          if (tq.isFlipping()) {
             this.q.stopFlipping();
          }
          if (this.q.getInAnimation() != null) {
             this.q.getInAnimation().cancel();
          }
          if (this.q.getOutAnimation() != null) {
             this.q.getOutAnimation().cancel();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       FrameLayout uFrameLayout = m1.f(p0, R.id.live_audience_shop_top_view);
       if (uFrameLayout != null) {
          uFrameLayout.removeAllViews();
          this.q = new AdapterViewFlipper(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -1);
          layoutParams.gravity = 17;
          this.q.setLayoutParams(layoutParams);
          uFrameLayout.addView(this.q);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(MerchantLivePurchasePanelResponse.class);
       return;
    }
}
