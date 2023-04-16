package com.kwai.video.ksuploaderkit.KSUploaderKit$13;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.uploader.IUploader;

public class KSUploaderKit$13 implements Runnable	// class@00095c
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$13(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$13.class, "1")) {
          return;
       }
       this.this$0.mState = KitUtils$State.UploadCover;
       UploaderKitExceptionLogger.getInstance().startUploadCover(this.this$0.mConfig.getTaskID());
       KSUploaderKit$13 tthis$0 = this.this$0;
       tthis$0.mUploader.startCoverUpload(tthis$0.mConfig.getCoverPath());
       return;
    }
}
