package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$b;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.message.nano.SeckillMessages$SeckillProgressMessage;
import com.kuaishou.merchant.api.core.model.Commodity;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.ProgressBarInfo;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.ArrayList;
import com.kuaishou.merchant.live.basic.common.LiveCommonLogBiz;
import p74.a;
import o74.a;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter$b implements Runnable	// class@00080a
{
    public final MtPurchasePanelCommoditySpikeSignalProcPresenter b;
    public final LiveShopMessages$LiveShopAction c;
    public final boolean d;

    public void MtPurchasePanelCommoditySpikeSignalProcPresenter$b(MtPurchasePanelCommoditySpikeSignalProcPresenter p0,LiveShopMessages$LiveShopAction p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       ArrayList uArrayList;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MtPurchasePanelCommoditySpikeSignalProcPresenter$b.class, "1")) {
          return;
       }
       MtPurchasePanelCommoditySpikeSignalProcPresenter$b tb = this.b;
       OrderConfirmCommodity mSpikeInfo = tb.q.mSpikeInfo;
       if (mSpikeInfo != null) {
          SeckillMessages$SeckillProgressMessage seckillProgr = tb.d9(this.c);
          if (seckillProgr != null) {
             SeckillMessages$SeckillProgressMessage itemId = seckillProgr.itemId;
             a q = this.b.q;
             if (q != null) {
                objArray = q.mId;
             }
             int i = 1;
             if (!(a.g(itemId, objArray) ^ i) && !(a.g(seckillProgr.seckillId, mSpikeInfo.mId) ^ i)) {
                MtPurchasePanelCommoditySpikeSignalProcPresenter$b tb1 = this.b;
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoidTwoRefs(mSpikeInfo, seckillProgr, tb1, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "9")) {
                   mSpikeInfo.mSoldStock = (int)seckillProgr.soldStock;
                   mSpikeInfo.mSpikeTotalStock = (int)seckillProgr.originalStock;
                   SeckillMessages$SeckillProgressMessage soldStatus = seckillProgr.soldStatus;
                   mSpikeInfo.mSoldStatus = soldStatus;
                   int i1 = 0;
                   if (soldStatus == 2) {
                      mSpikeInfo.mReserveStock = i1;
                   }
                   mSpikeInfo.mProgressStock = (int)seckillProgr.progressStock;
                   mSpikeInfo.mProgressPercent = seckillProgr.progressPercent;
                   mSpikeInfo.mActivityStatus = seckillProgr.activityStatus;
                   if ((seckillProgr.suffixDescPattern).length() > 0) {
                      i1 = 1;
                   }
                   if (i1) {
                      mSpikeInfo.mSuffixDescPattern = seckillProgr.suffixDescPattern;
                   }
                   soldStatus = seckillProgr.progressLeftDesc;
                   if (soldStatus != null) {
                      List list = ArraysKt___ArraysKt.uy(soldStatus);
                      if (list != null) {
                      label_008b :
                         mSpikeInfo.mProgressLeftDesc = list;
                         soldStatus = seckillProgr.progressRightDesc;
                         if (soldStatus != null) {
                            list = ArraysKt___ArraysKt.uy(soldStatus);
                            if (list != null) {
                            label_009d :
                               mSpikeInfo.mProgressRightDesc = list;
                               soldStatus = seckillProgr.progressPercentDesc;
                               if (soldStatus != null) {
                                  list = ArraysKt___ArraysKt.uy(soldStatus);
                                  if (list != null) {
                                  label_00af :
                                     mSpikeInfo.mProgressPercentDescList = list;
                                  }
                               }
                               uArrayList = new ArrayList();
                               goto label_00af ;
                            }
                         }
                         uArrayList = new ArrayList();
                         goto label_009d ;
                      }
                   }
                   uArrayList = new ArrayList();
                   goto label_008b ;
                }
                this.b.R8();
                if (this.b.a9(seckillProgr)) {
                   mSpikeInfo.mIsClosed = i;
                   if (this.d != null) {
                      this.b.c9();
                   }else {
                      this.b.a1();
                   }
                   a.u(LiveCommonLogBiz.SPIKE, "LiveBaseSpikeGoodsPresenter", "spike is over because of sold out", "itemId", this.b.q.mId, "spikeId", mSpikeInfo.mId);
                }
             }
          }
       }
    label_00e4 :
       return;
    }
}
