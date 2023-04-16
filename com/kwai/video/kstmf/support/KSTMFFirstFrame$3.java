package com.kwai.video.kstmf.support.KSTMFFirstFrame$3;
import java.lang.Runnable;
import com.kwai.video.kstmf.support.KSTMFFirstFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$KSTMFFirstFrameState;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$OnFirstFrameListener;

public class KSTMFFirstFrame$3 implements Runnable	// class@000946
{
    public final KSTMFFirstFrame this$0;
    public final boolean val$callback;
    public final boolean val$timeout;

    public void KSTMFFirstFrame$3(KSTMFFirstFrame p0,boolean p1,boolean p2){
       this.this$0 = p0;
       this.val$callback = p1;
       this.val$timeout = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame$3.class, "1")) {
          return;
       }
       KSTMFFirstFrame$3 tthis$0 = this.this$0;
       if (tthis$0.nativeHandler > 0) {
          tthis$0.releaseNativeHandler();
       }
       if (this.val$callback != null) {
          tthis$0 = this.this$0;
          KSTMFFirstFrame onFirstFrame = tthis$0.onFirstFrameListener;
          if (onFirstFrame != null) {
             KSTMFFirstFrame firstFrameSt = tthis$0.firstFrameState;
             if (firstFrameSt == KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Running || firstFrameSt == KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Idle) {
                if (this.val$timeout != null) {
                   onFirstFrame.onFirstFrameParseTimeout();
                }else {
                   onFirstFrame.onFirstFrameParseCancel();
                }
             }
          }
       }
       this.this$0.firstFrameState = KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Cancel;
       return;
    }
}
