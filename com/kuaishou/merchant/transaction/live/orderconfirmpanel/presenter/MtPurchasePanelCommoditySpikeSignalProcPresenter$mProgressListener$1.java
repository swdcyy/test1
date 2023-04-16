package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.message.nano.SeckillMessages$SeckillProgressMessage;
import com.kuaishou.merchant.api.core.model.Commodity;
import kotlin.jvm.internal.a;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1 extends Lambda implements l	// class@00080e
{
    public final MtPurchasePanelCommoditySpikeSignalProcPresenter this$0;

    public void MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1(MtPurchasePanelCommoditySpikeSignalProcPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveShopMessages$LiveShopAction[] p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1.class, "1")) {
          return;
       }
       MtPurchasePanelCommoditySpikeSignalProcPresenter$mProgressListener$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       MtPurchasePanelCommoditySpikeSignalProcPresenter mtPurchasePa = MtPurchasePanelCommoditySpikeSignalProcPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, mtPurchasePa, "4")) {
          OrderConfirmCommodity mSpikeInfo = tthis$0.q.mSpikeInfo;
          if (mSpikeInfo != null && mSpikeInfo.mIsClosed == null) {
             int i = 0;
             if (p0 != null) {
                boolean i1 = (!p0.length)? 1: 0;
                if (!i1) {
                   str = null;
                label_0036 :
                   if (!str) {
                      object oobject = PatchProxy.applyOneRefs(p0, tthis$0, mtPurchasePa, "5");
                      if (oobject != PatchProxyResult.class) {
                      }else {
                         OrderConfirmCommodity mSpikeInfo1 = tthis$0.q.mSpikeInfo;
                         i1 = false;
                         if (mSpikeInfo1 != null) {
                            int len = p0.length;
                            while (true) {
                               if (i < len) {
                                  object oobject1 = p0[i];
                                  SeckillMessages$SeckillProgressMessage seckillProgr = tthis$0.d9(oobject1);
                                  if (seckillProgr != null) {
                                     int i2 = a.g(seckillProgr.itemId, tthis$0.q.mId) ^ true;
                                     if (!i2) {
                                        i2 = a.g(seckillProgr.seckillId, mSpikeInfo1.mId) ^ true;
                                        if (!i2) {
                                           if (tthis$0.a9(seckillProgr)) {
                                              oobject = oobject1;
                                           }else {
                                              object oobject2 = oobject1;
                                           }
                                        }
                                     }
                                  }
                                  i = i + 1;
                               }
                            }
                         }
                         oobject = i1;
                      }
                      if (oobject) {
                         tthis$0.Z8(oobject, true);
                      }
                   }
                }
             }
             str = 1;
             goto label_0036 ;
          }
       }
       return;
    }
}
