package com.kwai.video.ksuploaderkit.KSUploaderKit$7;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;

public class KSUploaderKit$7 implements Runnable	// class@000966
{
    public final KSUploaderKit this$0;
    public final KSUploaderKitSegmentInfo val$segmentInfo;

    public void KSUploaderKit$7(KSUploaderKit p0,KSUploaderKitSegmentInfo p1){
       this.this$0 = p0;
       this.val$segmentInfo = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$7.class, "1")) {
          return;
       }
       this.this$0.mFragmentList.add(this.val$segmentInfo);
       KSUploaderKit mUploader = this.this$0.mUploader;
       if (mUploader != null) {
          mUploader.uploadSegment(this.val$segmentInfo);
       }
       UploaderKitExceptionLogger.getInstance().sendFragment(this.this$0.mConfig.getTaskID());
       return;
    }
}
