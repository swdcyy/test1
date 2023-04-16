package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;

public class PlayFailedRetryElement$b implements Runnable	// class@001404
{
    public final PlayFailedRetryElement b;

    public void PlayFailedRetryElement$b(PlayFailedRetryElement p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, PlayFailedRetryElement$b.class, "1")) {
          return;
       }
       PlayFailedRetryElement$b tb = this.b;
       if (tb.L == null) {
          tb.t0();
       }
       tb = this.b;
       if (tb.y != null && (tb.C != null && tb.F != null)) {
          tb.r0("run retryPlay...");
          this.b.u0(true);
          tb = this.b;
          tb.y.z(tb.C);
       }
    label_0037 :
       return;
    }
}
