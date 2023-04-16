package com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$1;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;

public class UploaderKitExceptionLogger$1 implements Runnable	// class@0009a9
{
    public final UploaderKitExceptionLogger this$0;

    public void UploaderKitExceptionLogger$1(UploaderKitExceptionLogger p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, UploaderKitExceptionLogger$1.class, "1")) {
          return;
       }
       if (this.this$0.mIsFinished == null) {
          this.this$0.writeInfoToLocalFile();
          this.this$0.mHandler.postDelayed(this, UploaderKitExceptionLogger.getExceptionCollectionIntervalMs());
       }
       return;
    }
}
