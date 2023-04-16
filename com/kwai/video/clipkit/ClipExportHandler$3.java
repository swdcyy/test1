package com.kwai.video.clipkit.ClipExportHandler$3;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.CommonException;
import java.lang.Exception;
import java.lang.Double;

public class ClipExportHandler$3 implements Mp4RemuxerEventListener	// class@001a0e
{
    public final ClipExportHandler this$0;
    public final String val$outputPath;

    public void ClipExportHandler$3(ClipExportHandler p0,String p1){
       this.this$0 = p0;
       this.val$outputPath = p1;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$3.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("ConcatAudio");
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$3.class, "2")) {
          return;
       }
       this.this$0.notifyErrorCallback("ConcatAudio", new ClipExportException(p0.type, p0.retcode, p0.getMessage()));
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$3.class, "3")) {
          return;
       }
       ClipExportHandler$3 tthis$0 = this.this$0;
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("ConcatAudio");
          return;
       }else {
          ClipExportHandler mLock = tthis$0.mLock;
          _monitor_enter(mLock);
          ClipExportHandler$3 tthis$01 = this.this$0;
          ClipExportHandler$3 tval$outputP = this.val$outputPath;
          tthis$01.mConcatAudioTempPath = tval$outputP;
          tthis$01.combineVideoAndAudio(tthis$01.mConcatVideoTempPath, tval$outputP, tthis$01.mExportPath);
          _monitor_exit(mLock);
          return;
       }
    }
    public void onProgress(double p0){
       ClipExportHandler$3 u3 = ClipExportHandler$3.class;
       if (PatchProxy.isSupport(u3) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u3, "1")) {
          return;
       }
       u3 = this.this$0;
       u3.notifyProgressCallback("ConcatAudio", u3.getCallBackProgress(1, p0));
       return;
    }
}
