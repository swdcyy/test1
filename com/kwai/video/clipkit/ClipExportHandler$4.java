package com.kwai.video.clipkit.ClipExportHandler$4;
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

public class ClipExportHandler$4 implements Mp4RemuxerEventListener	// class@001a0f
{
    public final ClipExportHandler this$0;
    public final String val$tempOutputPath;

    public void ClipExportHandler$4(ClipExportHandler p0,String p1){
       this.this$0 = p0;
       this.val$tempOutputPath = p1;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$4.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("CombineVideoAndAudio");
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$4.class, "2")) {
          return;
       }
       this.this$0.notifyErrorCallback("CombineVideoAndAudio", new ClipExportException(p0.type, p0.retcode, p0.getMessage()));
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$4.class, "3")) {
          return;
       }
       ClipExportHandler$4 tthis$0 = this.this$0;
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("CombineVideoAndAudio");
          return;
       }else if(tthis$0.hasCover()){
          ClipExportHandler mLock = this.this$0.mLock;
          _monitor_enter(mLock);
          ClipExportHandler$4 tthis$01 = this.this$0;
          tthis$01.mTempForCoverPath = this.val$tempOutputPath;
          _monitor_exit(mLock);
          tthis$01.concatCover(tthis$01.mExportPath, tthis$01.mIsEnableConcatMode);
       }else {
          tthis$0 = this.this$0;
          tthis$0.mCurrentProgress = 0x3ff0000000000000;
          tthis$0.notifyProgressCallback("CombineVideoAndAudio", 0x3ff0000000000000);
          this.this$0.notifyFinishCallback("CombineVideoAndAudio");
       }
       return;
    }
    public void onProgress(double p0){
       ClipExportHandler$4 u4 = ClipExportHandler$4.class;
       if (PatchProxy.isSupport(u4) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u4, "1")) {
          return;
       }
       u4 = this.this$0;
       u4.notifyProgressCallback("CombineVideoAndAudio", u4.getCallBackProgress(3, p0));
       return;
    }
}
