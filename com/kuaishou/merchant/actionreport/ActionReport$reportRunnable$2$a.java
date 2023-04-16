package com.kuaishou.merchant.actionreport.ActionReport$reportRunnable$2$a;
import java.lang.Runnable;
import com.kuaishou.merchant.actionreport.ActionReport$reportRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.actionreport.ActionReport;
import android.os.Handler;

public final class ActionReport$reportRunnable$2$a implements Runnable	// class@0014d3
{
    public final ActionReport$reportRunnable$2 b;

    public void ActionReport$reportRunnable$2$a(ActionReport$reportRunnable$2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ActionReport$reportRunnable$2$a.class, "1")) {
          return;
       }
       this.b.this$0.k();
       ActionReport$reportRunnable$2 this$0 = this.b.this$0;
       this$0.d.postDelayed(this, this$0.h());
       return;
    }
}
