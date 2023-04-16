package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter$c;
import erd.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommodityWelfareSignalProcPresenter;
import java.lang.Object;
import p14.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import kotlin.jvm.internal.a;

public final class MtPurchasePanelCommodityWelfareSignalProcPresenter$c implements g	// class@000813
{
    public final MtPurchasePanelCommodityWelfareSignalProcPresenter b;

    public void MtPurchasePanelCommodityWelfareSignalProcPresenter$c(MtPurchasePanelCommodityWelfareSignalProcPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtPurchasePanelCommodityWelfareSignalProcPresenter$c.class, "1")) {
       }else {
          MtPurchasePanelCommodityWelfareSignalProcPresenter$c tb = this.b;
          p0 = p0.a;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MtPurchasePanelCommodityWelfareSignalProcPresenter.class, "6") && a.g(p0.action.payloadType, "welfareItemStockProgress")) {
             tb.P8(p0, false);
          }
       }
       return;
    }
}
