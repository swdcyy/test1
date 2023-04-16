package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$b;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
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

public final class RealtimeSpikeService$b implements Runnable	// class@0007c8
{
    public final WeakReference b;
    public final String c;

    public void RealtimeSpikeService$b(Fragment p0,String p1){
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService$b.class, "1")) {
          return;
       }
       if (this.b.get() != null) {
          a.s(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "realtimeActivityStateManager", "RealtimeSpikeService: refreshPageTask: invoked ");
          n.z.b(this.c, 800, null, null);
       }
       return;
    }
}
