package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1 extends Lambda implements l	// class@00080d
{
    public final MtPurchasePanelCommoditySpikeSignalProcPresenter this$0;

    public void MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1(MtPurchasePanelCommoditySpikeSignalProcPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveShopMessages$LiveShopAction[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtPurchasePanelCommoditySpikeSignalProcPresenter$mCloseListener$1.class, "1")) {
          return;
       }
       this.this$0.b9(p0, true);
       return;
    }
}
