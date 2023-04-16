package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$WelfareItemStockProgressMessage;
import com.kuaishou.merchant.api.core.model.Commodity;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.model.Commodity$CommodityActivityInfo;

public final class MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1 extends Lambda implements l	// class@000814
{
    public final MtPurchasePanelCommodityWelfareSignalProcPresenter this$0;

    public void MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1(MtPurchasePanelCommodityWelfareSignalProcPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveShopMessages$LiveShopAction[] p0){
       MtPurchasePanelCommodityWelfareSignalProcPresenter mtPurchasePa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1.class, "1")) {
          return;
       }
       MtPurchasePanelCommodityWelfareSignalProcPresenter$mSignalArrayListener$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       MtPurchasePanelCommodityWelfareSignalProcPresenter mtPurchasePa = MtPurchasePanelCommodityWelfareSignalProcPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, mtPurchasePa, "4")) {
          int i = 0;
          if (p0 != null) {
             int i1 = (!p0.length)? 1: 0;
             if (!i1) {
                mtPurchasePa1 = null;
             label_002c :
                if (!mtPurchasePa1) {
                   mtPurchasePa1 = tthis$0.p;
                   if (mtPurchasePa1 == null || (mtPurchasePa1.mWelfareInfo != null && !PatchProxy.applyVoidOneRefs(p0, tthis$0, mtPurchasePa, "5"))) {
                      mtPurchasePa = tthis$0.p;
                      if (mtPurchasePa != null) {
                         OrderConfirmCommodity mWelfareInfo = mtPurchasePa.mWelfareInfo;
                         if (mWelfareInfo != null) {
                            i1 = p0.length;
                            LiveShopMessages$LiveShopAction liveShopActi = null;
                            while (i < i1) {
                               object oobject = p0[i];
                               LiveRoomSignalMessage$WelfareItemStockProgressMessage welfareItemS = tthis$0.R8(oobject);
                               if (welfareItemS != null) {
                                  LiveRoomSignalMessage$WelfareItemStockProgressMessage itemId = welfareItemS.itemId;
                                  MtPurchasePanelCommodityWelfareSignalProcPresenter p = tthis$0.p;
                                  Commodity mId = (p != null)? p.mId: null;
                                  int i2 = a.g(itemId, mId) ^ 1;
                                  if (!i2) {
                                     if ((int)welfareItemS.soldStock == mWelfareInfo.mTotalStock) {
                                        liveShopActi = oobject;
                                        break ;
                                     }else {
                                        liveShopActi = oobject;
                                     }
                                  }
                               }
                               i = i + 1;
                            }
                            if (liveShopActi != null) {
                               tthis$0.P8(liveShopActi, 1);
                            }
                         }
                      }
                   }
                }
             }
          }
          mtPurchasePa1 = 1;
          goto label_002c ;
       }
    label_0079 :
       return;
    }
}
