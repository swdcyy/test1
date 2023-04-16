package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$b;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$WelfareItemStockProgressMessage;
import com.kuaishou.merchant.api.core.model.Commodity;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.model.Commodity$CommodityActivityInfo;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import xe4.g;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import nk4.u1;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmGlobalConfig;
import java.lang.Long;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$pushRefreshTask$1;
import msd.a;
import jk4.a;
import jk4.d;
import qk4.e;

public final class MtPurchasePanelCommodityWelfareSignalProcPresenter$b implements Runnable	// class@000812
{
    public final MtPurchasePanelCommodityWelfareSignalProcPresenter b;
    public final LiveShopMessages$LiveShopAction c;
    public final boolean d;

    public void MtPurchasePanelCommodityWelfareSignalProcPresenter$b(MtPurchasePanelCommodityWelfareSignalProcPresenter p0,LiveShopMessages$LiveShopAction p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Long longx;
       MtPurchasePanelCommodityWelfareSignalProcPresenter q;
       Commodity$CommodityActivityInfo mTip1;
       MtPurchasePanelCommodityWelfareSignalProcPresenter mtPurchasePa = MtPurchasePanelCommodityWelfareSignalProcPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MtPurchasePanelCommodityWelfareSignalProcPresenter$b.class, "1")) {
          return;
       }
       MtPurchasePanelCommodityWelfareSignalProcPresenter$b tb = this.b;
       MtPurchasePanelCommodityWelfareSignalProcPresenter p = tb.p;
       if (p != null) {
          OrderConfirmCommodity mWelfareInfo = p.mWelfareInfo;
          if (mWelfareInfo != null) {
             LiveRoomSignalMessage$WelfareItemStockProgressMessage welfareItemS = tb.R8(this.c);
             if (welfareItemS != null) {
                MtPurchasePanelCommodityWelfareSignalProcPresenter p1 = this.b.p;
                Commodity mId = (p1 != null)? p1.mId: objArray;
                int i = 1;
                if (a.g(mId, welfareItemS.itemId) ^ i) {
                   return;
                }else {
                   mWelfareInfo.mSoldStock = (int)welfareItemS.soldStock;
                   mWelfareInfo.mTotalStock = (int)welfareItemS.originalStock;
                   mWelfareInfo.mSoldStatus = welfareItemS.soldStatus;
                   tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(mWelfareInfo, tb, mtPurchasePa, "10")) {
                      RxBus.f.b(new g(mWelfareInfo));
                      if (!PatchProxy.applyVoid(objArray, tb, mtPurchasePa, "11")) {
                         p1 = tb.p;
                         if (p1 != null) {
                            OrderConfirmCommodity mWelfareInfo1 = p1.mWelfareInfo;
                            if (mWelfareInfo1 != null && mWelfareInfo1.mSoldStatus == null) {
                               Commodity$CommodityActivityInfo mTip = mWelfareInfo1.mTip;
                               if (mTip != null && mTip.length()) {
                                  i = 0;
                               }
                               if (!i) {
                                  p1 = tb.q;
                                  if (p1 != null) {
                                     q = tb.p;
                                     if (q != null) {
                                        OrderConfirmCommodity mWelfareInfo2 = q.mWelfareInfo;
                                        if (mWelfareInfo2 != null) {
                                           mTip1 = mWelfareInfo2.mTip;
                                        label_008f :
                                           p1.notifyChanged(mTip1);
                                        }
                                     }
                                     mTip1 = objArray;
                                     goto label_008f ;
                                  }
                               }
                            }
                         }
                         q = tb.q;
                         if (q != null) {
                            q.notifyChanged("");
                         }
                      }
                   }
                   if (mWelfareInfo.mSoldStock == mWelfareInfo.mTotalStock) {
                      if (this.d != null) {
                         tb = this.b;
                         Objects.requireNonNull(tb);
                         if (!PatchProxy.applyVoid(objArray, tb, mtPurchasePa, "8")) {
                            mtPurchasePa = tb.t;
                            if (mtPurchasePa != null) {
                               p1 = tb.u;
                               if (p1 != null) {
                                  MerchantLivePurchasePanelResponse mGlobalConfi = p1.mGlobalConfig;
                                  if (mGlobalConfi != null) {
                                     longx = Long.valueOf(mGlobalConfi.mMinRequestDelayMs);
                                  label_00ca :
                                     MtPurchasePanelCommodityWelfareSignalProcPresenter u = tb.u;
                                     if (u != null) {
                                        MerchantLivePurchasePanelResponse mGlobalConfi1 = u.mGlobalConfig;
                                        if (mGlobalConfi1 != null) {
                                           objArray = Long.valueOf(mGlobalConfi1.mMaxRequestDelayMs);
                                        }
                                     }
                                     mtPurchasePa.a(new u1(longx, objArray, new MtPurchasePanelCommodityWelfareSignalProcPresenter$pushRefreshTask$1(tb)));
                                  }
                               }
                               longx = objArray;
                               goto label_00ca ;
                            }
                         }
                      }else {
                         mtPurchasePa = this.b.r;
                         if (mtPurchasePa != null) {
                            mtPurchasePa.c();
                         }
                      }
                   }
                }
             }
          }
       }
    label_00ed :
       return;
    }
}
