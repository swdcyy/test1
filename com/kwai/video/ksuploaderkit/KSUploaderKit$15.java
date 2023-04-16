package com.kwai.video.ksuploaderkit.KSUploaderKit$15;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;

public class KSUploaderKit$15 implements Runnable	// class@00095e
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$15(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$15.class, "1")) {
          return;
       }
       KSUploaderKit$15 tthis$0 = this.this$0;
       tthis$0.mKitEventListener.onProgress(tthis$0.mTotalPercent);
       return;
    }
}
