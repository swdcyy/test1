package com.kwai.video.kstmf.support.KSTMFFirstFrame$1;
import java.lang.Runnable;
import com.kwai.video.kstmf.support.KSTMFFirstFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KSTMFFirstFrame$1 implements Runnable	// class@000944
{
    public final KSTMFFirstFrame this$0;

    public void KSTMFFirstFrame$1(KSTMFFirstFrame p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame$1.class, "1")) {
          return;
       }
       this.this$0.internalCancel(true, true);
       return;
    }
}
