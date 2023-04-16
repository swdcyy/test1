package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$e;
import gc6.k;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;
import oc6.b;
import java.lang.Throwable;

public class PlayFailedRetryElement$e implements k	// class@001407
{
    public final PlayFailedRetryElement b;

    public void PlayFailedRetryElement$e(PlayFailedRetryElement p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PlayFailedRetryElement$e.class, "1")) {
          return;
       }
       if (this.b.y.getPlayer().i() == 2) {
          this.b.o0(new b(new Throwable(), 1, 1));
       }
       return;
    }
}
