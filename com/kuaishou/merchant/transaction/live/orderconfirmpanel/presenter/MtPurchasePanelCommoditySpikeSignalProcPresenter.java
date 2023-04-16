package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$a;
import nsd.u;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import msd.l;
import qk4.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.f;
import brd.t;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$b;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.message.nano.SeckillMessages$SeckillProgressMessage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.ProgressBarInfo;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import com.kuaishou.merchant.message.nano.SeckillMessages$SeckillCloseMessage;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import com.kuaishou.merchant.live.basic.common.LiveCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$d;
import nk4.u1;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmGlobalConfig;
import java.lang.Long;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$pushRefreshTask$1;
import msd.a;
import jk4.a;
import jk4.d;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter extends a	// class@000810
{
    public final boolean A;
    public d w;
    public c x;
    public final l y;
    public final l z;
    public static final MtPurchasePanelCommoditySpikeSignalProcPresenter$a B;

    static {
       MtPurchasePanelCommoditySpikeSignalProcPresenter.B = new MtPurchasePanelCommoditySpikeSignalProcPresenter$a(null);
    }
    public void MtPurchasePanelCommoditySpikeSignalProcPresenter(){
       super();
       this.y = new MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1(this);
       this.z = new MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1(this);
       boolean b = false;
       if (SystemUtil.I() || a.t().d("enablePurchasePanelSignalFilter", b)) {
          b = true;
       }
       this.A = b;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "2")) {
          return;
       }
       super.E8();
       a tq = this.q;
       if (tq != null) {
          Commodity$ExtraInfo extraInfo = tq.getExtraInfo();
          if (extraInfo != null && extraInfo.mSaleStatus == 1) {
             return;
          }
       }
       if (this.A != null) {
          MtPurchasePanelCommoditySpikeSignalProcPresenter tx = this.x;
          if (tx != null) {
             tx.a("seckillProgress", this.y);
          }
          tx = this.x;
          if (tx != null) {
             tx.a("seckillClose", this.z);
          }
       }else {
          this.X7(RxBus.f.f(f.class).subscribe(new MtPurchasePanelCommoditySpikeSignalProcPresenter$c(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "3")) {
          return;
       }
       MtPurchasePanelCommoditySpikeSignalProcPresenter tx = this.x;
       if (tx != null) {
          tx.b("seckillProgress", this.y);
       }
       tx = this.x;
       if (tx != null) {
          tx.b("seckillClose", this.z);
       }
       return;
    }
    public final void Z8(LiveShopMessages$LiveShopAction p0,boolean p1){
       MtPurchasePanelCommoditySpikeSignalProcPresenter mtPurchasePa = MtPurchasePanelCommoditySpikeSignalProcPresenter.class;
       if (PatchProxy.isSupport(mtPurchasePa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, mtPurchasePa, "8")) {
          return;
       }
       k1.o(new MtPurchasePanelCommoditySpikeSignalProcPresenter$b(this, p0, p1));
       return;
    }
    public final boolean a9(SeckillMessages$SeckillProgressMessage p0){
       OrderConfirmCommodity obj = PatchProxy.applyOneRefs(p0, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q.mSpikeInfo;
       boolean b = true;
       if (obj != null) {
          ProgressBarInfo mActivitySta = obj.mActivityStatus;
          mActivitySta = (mActivitySta == null || !mActivitySta.length())? 1: 0;
          if (mActivitySta && p0.soldStock - p0.originalStock >= 0) {
          label_0035 :
             return b;
          }
       }
    label_0034 :
       b = false;
       goto label_0035 ;
    }
    public final void b9(LiveShopMessages$LiveShopAction[] p0,boolean p1){
       int i1;
       SeckillMessages$SeckillCloseMessage seckillClose1;
       if (PatchProxy.isSupport(MtPurchasePanelCommoditySpikeSignalProcPresenter.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "10")) {
          return;
       }
       OrderConfirmCommodity mSpikeInfo = this.q.mSpikeInfo;
       if (mSpikeInfo != null && mSpikeInfo.mIsClosed == null) {
          int i = 0;
          if (p0 != null) {
             i1 = (!p0.length)? 1: 0;
             if (!i1) {
                i1 = 0;
             label_002f :
                if (!i1) {
                   i1 = p0.length;
                   for (; i < i1; i = i + 1) {
                      object oobject = p0[i];
                      SeckillMessages$SeckillCloseMessage seckillClose = PatchProxy.applyOneRefs(oobject, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "13");
                      if (seckillClose != PatchProxyResult.class) {
                      }else {
                         try{
                            seckillClose1 = SeckillMessages$SeckillCloseMessage.parseFrom(oobject.action.payload);
                         }catch(java.lang.Exception e5){
                            a.l(LiveCommonLogBiz.SPIKE, "LiveBaseSpikeGoodsPresenter", "parse SeckillCloseMessage failed", e5);
                            seckillClose1 = null;
                         }
                         seckillClose = seckillClose1;
                      }
                      if (seckillClose != null) {
                         int i2 = a.g(seckillClose.itemId, this.q.mId) ^ 1;
                         if (!i2) {
                            i2 = a.g(seckillClose.seckillId, mSpikeInfo.mId) ^ 1;
                            if (!i2) {
                               if (seckillClose.closeType == 2) {
                                  mSpikeInfo.mSoldStock = mSpikeInfo.mSpikeTotalStock;
                               }
                               mSpikeInfo.mIsClosed = true;
                               k1.o(new MtPurchasePanelCommoditySpikeSignalProcPresenter$d(this, mSpikeInfo, p1));
                            }
                         }
                      }
                   }
                }
             }
          }
          i1 = 1;
          goto label_002f ;
       }
    label_008a :
       return;
    }
    public final void c9(){
       Long longx;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "11")) {
          return;
       }
       MtPurchasePanelCommoditySpikeSignalProcPresenter tw = this.w;
       if (tw != null) {
          a tp = this.p;
          if (tp != null) {
             MerchantLivePurchasePanelResponse mGlobalConfi = tp.mGlobalConfig;
             if (mGlobalConfi != null) {
                longx = Long.valueOf(mGlobalConfi.mMinRequestDelayMs);
             label_0022 :
                a tp1 = this.p;
                if (tp1 != null) {
                   MerchantLivePurchasePanelResponse mGlobalConfi1 = tp1.mGlobalConfig;
                   if (mGlobalConfi1 != null) {
                      objArray = Long.valueOf(mGlobalConfi1.mMaxRequestDelayMs);
                   }
                }
                tw.a(new u1(longx, objArray, new MtPurchasePanelCommoditySpikeSignalProcPresenter$pushRefreshTask$1(this)));
             }
          }
          longx = objArray;
          goto label_0022 ;
       }
       return;
    }
    public final SeckillMessages$SeckillProgressMessage d9(LiveShopMessages$LiveShopAction p0){
       SeckillMessages$SeckillProgressMessage seckillProgr;
       Object obj = PatchProxy.applyOneRefs(p0, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          seckillProgr = SeckillMessages$SeckillProgressMessage.parseFrom(p0.action.payload);
       }catch(java.lang.Exception e4){
          a.l(LiveCommonLogBiz.SPIKE, "LiveBaseSpikeGoodsPresenter", "parse SeckillProgressMessage failed", e4);
          seckillProgr = null;
       }
       return seckillProgr;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.w = this.r8("REFRESH_PAGE_SINGLE_TASK_MANAGER");
       this.x = this.r8("ORDER_CONFIRM_SC_LIVE_SERVICE");
       return;
    }
}
