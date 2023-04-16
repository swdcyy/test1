package com.kwai.video.clipkit.ClipExportHandler$5;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import java.lang.Double;

public class ClipExportHandler$5 implements ExportEventListener	// class@001a10
{
    public final ClipExportHandler this$0;
    public final String val$audioExportPath;

    public void ClipExportHandler$5(ClipExportHandler p0,String p1){
       this.this$0 = p0;
       this.val$audioExportPath = p1;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$5.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("transcodeAudio");
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$5.class, "3")) {
          return;
       }
       this.this$0.notifyErrorCallback("transcodeAudio", new ClipExportException(p0.getError().type(), p0.getError().code(), p0.getError().message()));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler$5.class, "1")) {
          return;
       }
       ClipExportHandler mRenderRange = this.this$0.mRenderRangeLock;
       _monitor_enter(mRenderRange);
       ClipExportHandler$5 tthis$0 = this.this$0;
       tthis$0.mRenderRanges = p1;
       _monitor_exit(mRenderRange);
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("transcodeAudio");
          return;
       }else {
          ClipExportHandler mLock = tthis$0.mLock;
          _monitor_enter(mLock);
          ClipExportHandler$5 tthis$01 = this.this$0;
          tthis$0 = this.val$audioExportPath;
          tthis$01.mTranscodeAudioTempPath = tthis$0;
          tthis$01.combineVideoAndAudio(tthis$01.mConcatVideoTempPath, tthis$0, tthis$01.mExportPath);
          _monitor_exit(mLock);
          return;
       }
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       ClipExportHandler$5 u5 = ClipExportHandler$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u5, "2")) {
          return;
       }
       ClipExportHandler$5 tthis$0 = this.this$0;
       tthis$0.notifyProgressCallback("transcodeAudio", tthis$0.getCallBackProgress(2, p1));
       return;
    }
}
