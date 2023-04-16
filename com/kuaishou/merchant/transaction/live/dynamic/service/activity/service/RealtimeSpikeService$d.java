package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$d;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vd4.b;

public final class RealtimeSpikeService$d implements Runnable	// class@0007ca
{
    public final RealtimeSpikeService b;

    public void RealtimeSpikeService$d(RealtimeSpikeService p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService$d.class, "1")) {
          return;
       }
       this.b.k9("RealtimeSpikeService: ¹ØÍ£·þÎñ");
       b.m9(this.b, "mt_purchase_panel_close_activity_state_service", null, 2, null);
       return;
    }
}
