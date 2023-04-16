package com.kwai.video.ksuploaderkit.KSUploaderKit$5;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;

public class KSUploaderKit$5 implements Runnable	// class@000964
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$5(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$5.class, "1")) {
          return;
       }
       KSUploaderKit mKitEventLis = this.this$0.mKitEventListener;
       if (mKitEventLis != null) {
          mKitEventLis.onComplete(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.NO_AVAILABLE_NETWORK.value(), null);
       }
       return;
    }
}
