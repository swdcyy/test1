package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$b;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import vd4.n;
import vd4.n$a;

public final class RealtimeWelfareService$b implements Runnable	// class@0007d0
{
    public final WeakReference b;
    public final String c;

    public void RealtimeWelfareService$b(RealtimeWelfareService p0,String p1){
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RealtimeWelfareService$b.class, "1")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "realtimeActivityStateManager", "RealtimeWelfareService: refreshPageTask: invoked ");
       RealtimeWelfareService realtimeWelf = this.b.get();
       if (realtimeWelf != null) {
          realtimeWelf.E = false;
          n.z.b(this.c, 800, null, null);
       }
       return;
    }
}
