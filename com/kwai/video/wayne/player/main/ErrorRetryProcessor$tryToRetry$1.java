package com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ErrorRetryProcessor$tryToRetry$1 implements Runnable	// class@000d5a
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$tryToRetry$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor$tryToRetry$1.class, "1")) {
          return;
       }
       this.this$0.doRetry();
       return;
    }
}
