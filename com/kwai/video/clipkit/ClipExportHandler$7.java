package com.kwai.video.clipkit.ClipExportHandler$7;
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

public class ClipExportHandler$7 implements Mp4RemuxerEventListener	// class@001a12
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$7(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$7.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("Mp4Remuxer");
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$7.class, "2")) {
          return;
       }
       this.this$0.notifyErrorCallback("ConcatCover", new ClipExportException(p0.type, p0.retcode, p0.getMessage()));
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$7.class, "3")) {
          return;
       }
       ClipExportHandler$7 tthis$0 = this.this$0;
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("ConcatCover");
          return;
       }else if(tthis$0.mExportFlag <= 2){
          tthis$0.notifyFinishCallback("ConcatCover");
          return;
       }else {
          tthis$0.mCurrentProgress = 0x3ff0000000000000;
          tthis$0.notifyProgressCallback("ConcatCover", 0x3ff0000000000000);
          this.this$0.notifyFinishCallback("ConcatCover");
          return;
       }
    }
    public void onProgress(double p0){
       ClipExportHandler$7 u7 = ClipExportHandler$7.class;
       if (PatchProxy.isSupport(u7) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u7, "1")) {
          return;
       }
       u7 = this.this$0;
       u7.notifyProgressCallback("ConcatCover", u7.getCallBackProgress(4, p0));
       return;
    }
}
