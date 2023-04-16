package com.kwai.video.clipkit.ClipExportHandler$9;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.CommonException;
import java.lang.Exception;
import java.lang.Double;

public class ClipExportHandler$9 implements Mp4RemuxerEventListener	// class@001a14
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$9(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$9.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("Transcode");
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$9.class, "2")) {
          return;
       }
       this.this$0.notifyErrorCallback("Transcode", new ClipExportException(p0.type, p0.retcode, p0.getMessage()));
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$9.class, "3")) {
          return;
       }
       ClipExportHandler$9 tthis$0 = this.this$0;
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("Transcode");
          return;
       }else {
          tthis$0.notifyFinishCallback("Transcode");
          return;
       }
    }
    public void onProgress(double p0){
       ClipExportHandler$9 u9 = ClipExportHandler$9.class;
       if (PatchProxy.isSupport(u9) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u9, "1")) {
          return;
       }
       this.this$0.notifyProgressCallback("Transcode", ((p0 * 0x3f947ae147ae1480) + 0x3fef5c28f5c28f5c));
       return;
    }
}
