package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$c;
import erd.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import java.lang.Object;
import p14.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter$c implements g	// class@00080b
{
    public final MtPurchasePanelCommoditySpikeSignalProcPresenter b;

    public void MtPurchasePanelCommoditySpikeSignalProcPresenter$c(MtPurchasePanelCommoditySpikeSignalProcPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtPurchasePanelCommoditySpikeSignalProcPresenter$c.class, "1")) {
       }else {
          MtPurchasePanelCommoditySpikeSignalProcPresenter$c tb = this.b;
          p0 = p0.a;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MtPurchasePanelCommoditySpikeSignalProcPresenter.class, "7")) {
             LiveExtraMessages$LiveCommonAbstractSignal payloadType = p0.action.payloadType;
             if (payloadType != null) {
                int i = payloadType.hashCode();
                if (i != 0x4cb3ac09) {
                   if (i == 0x63d3ee7c && payloadType.equals("seckillProgress")) {
                      tb.Z8(p0, false);
                   }
                }else if(payloadType.equals("seckillClose")){
                   LiveShopMessages$LiveShopAction[] liveShopActi = new LiveShopMessages$LiveShopAction[]{p0};
                   tb.b9(liveShopActi, false);
                }
             }
          }
       }
       return;
    }
}
