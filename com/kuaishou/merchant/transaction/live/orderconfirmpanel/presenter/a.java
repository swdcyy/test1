package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.ProgressBarInfo;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import xe4.d;
import brd.t;
import t45.d;
import brd.z;
import nk4.a;
import erd.g;
import crd.b;
import xe4.c;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import java.lang.Boolean;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.model.commodity.ButtonRelateInfo;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import z1.k;
import qk4.d;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import kk4.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qk4.e;
import y8c.g;

public class a extends PresenterV2	// class@000817
{
    public MerchantLivePurchasePanelResponse p;
    public OrderConfirmCommodity q;
    public c r;
    public g s;
    public k t;
    public DefaultObservable u;
    public e v;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          OrderConfirmCommodity mSpikeInfo = this.q.mSpikeInfo;
          if (mSpikeInfo != null) {
             this.r.j(this.V8(mSpikeInfo));
             this.S8(true);
          }
       }
       this.X7(RxBus.f.f(d.class).observeOn(d.a).subscribe(new a(this)));
       return;
    }
    public final void P8(ProgressBarInfo p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "6")) {
          return;
       }
       RxBus.f.b(new c(p0));
       int i = 1;
       boolean b = (p0.mSoldStatus == i)? true: false;
       this.X8((this.V8(p0) ^ i));
       this.W8(b, null);
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "19")) {
          if (!b && (this.q.getExtraInfo().mSaleType != 3 || TextUtils.x(this.q.mSpikeInfo.mPrompt))) {
             this.u.notifyChanged("");
          }else {
             this.u.notifyChanged(this.q.mSpikeInfo.mPrompt);
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.S8(false);
       return;
    }
    public final void S8(boolean p0){
       MerchantLivePurchasePanelResponse mSoldOutButt;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       OrderConfirmCommodity mSpikeInfo = this.q.mSpikeInfo;
       if (mSpikeInfo == null) {
          return;
       }
       if (mSpikeInfo.isBargainEnd()) {
          if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(mSpikeInfo, Boolean.valueOf(p0), this, uoa, "13") && !p0)) {
             RxBus.f.b(new c(mSpikeInfo));
             this.a1();
          }
       }else if(mSpikeInfo.isBargainActive()){
          if (!PatchProxy.applyVoidOneRefs(mSpikeInfo, this, uoa, "8")) {
             int progressPerc = mSpikeInfo.getProgressPercent();
             if (progressPerc == -1) {
                this.P8(mSpikeInfo);
             }else {
                BuyButton uBuyButton = null;
                boolean b = false;
                if (mSpikeInfo.isFakeSoldOut()) {
                   if (!PatchProxy.applyVoidOneRefs(mSpikeInfo, this, uoa, "10")) {
                      RxBus.f.b(new c(mSpikeInfo));
                      this.X8(b);
                      this.W8(b, uBuyButton);
                      this.Y8(mSpikeInfo.mPrompt);
                   }
                }else if(mSpikeInfo.isRealSoldOut()){
                   if (!PatchProxy.applyVoidOneRefs(mSpikeInfo, this, uoa, "11")) {
                      RxBus.f.b(new c(mSpikeInfo));
                      this.X8(b);
                      mSoldOutButt = this.p.mSoldOutButton;
                      if (mSoldOutButt != null) {
                         uBuyButton = mSoldOutButt.mBuyButton;
                      }
                      this.W8(b, uBuyButton);
                      this.Y8(mSpikeInfo.mSoldOutPrompt);
                   }
                }else if(PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(mSpikeInfo, Integer.valueOf(progressPerc), this, uoa, "9")){
                   if (progressPerc >= 1000) {
                      b = true;
                   }
                   RxBus.f.b(new c(mSpikeInfo));
                   this.X8(true);
                   mSoldOutButt = (b)? this.p.mProgressFullButton: this.p.mButtonRelateInfo;
                   if (mSoldOutButt != null) {
                      uBuyButton = mSoldOutButt.mBuyButton;
                   }
                   this.W8(true, uBuyButton);
                   this.Y8("");
                }
             }
          }
       }else {
          this.P8(mSpikeInfo);
       }
       return;
    }
    public final boolean V8(ProgressBarInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.mSoldStatus != 2 && (p0.isFakeSoldOut() || p0.isRealSoldOut()))? true: false;
       return b;
    }
    public final void W8(boolean p0,BuyButton p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "16")) {
          return;
       }
       if (this.t.get() == null) {
          return;
       }
       this.t.get().e(3, p0, p1);
       return;
    }
    public final void X8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "15")) {
          return;
       }
       int i = p0 ^ 0x01;
       if (this.r.e() != i) {
          this.r.j(i);
          if (!PatchProxy.applyVoid(null, this, uoa, "17")) {
             List list = this.s.Q0();
             if (!q.f(list)) {
                int i1 = 0;
                while (true) {
                   if (i1 < list.size()) {
                      if (list.get(i1).a == 3) {
                      label_0053 :
                         if (i1 != -1) {
                            this.s.p0(i1, (i1 + 1));
                            break ;
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      i1 = -1;
                      goto label_0053 ;
                   }
                }
             }
          }
       }
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       if (p0 == null) {
          this.u.notifyChanged("");
       }else {
          this.u.notifyChanged(p0);
       }
       return;
    }
    public void a1(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.Y8("");
       this.v.c();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(MerchantLivePurchasePanelResponse.class);
       this.q = this.q8(g.class).b;
       this.r = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.s = this.r8("ADAPTER");
       this.t = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.u = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_BOTTOM_ACTIVITY_TIP");
       this.v = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       return;
    }
}
