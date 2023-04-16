package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter$d;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.MtPurchasePanelCommoditySpikeSignalProcPresenter;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.ProgressBarInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.a;

public final class MtPurchasePanelCommoditySpikeSignalProcPresenter$d implements Runnable	// class@00080c
{
    public final MtPurchasePanelCommoditySpikeSignalProcPresenter b;
    public final ProgressBarInfo c;
    public final boolean d;

    public void MtPurchasePanelCommoditySpikeSignalProcPresenter$d(MtPurchasePanelCommoditySpikeSignalProcPresenter p0,ProgressBarInfo p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, MtPurchasePanelCommoditySpikeSignalProcPresenter$d.class, "1")) {
          return;
       }
       if (this.d != null) {
          this.b.c9();
       }else {
          this.b.a1();
       }
       PatchProxy.onMethodExit(MtPurchasePanelCommoditySpikeSignalProcPresenter$d.class, "1");
       return;
    }
}
