package com.kwai.video.clipkit.ClipExportHandler$6;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import jv7.f;
import java.lang.Double;
import java.lang.StringBuilder;

public class ClipExportHandler$6 implements ExportEventListener	// class@001a11
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$6(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$6.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("TranscodeCover");
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$6.class, "3")) {
          return;
       }
       KSClipLog.e("ClipExportHandler", "transcode cover error");
       this.this$0.notifyErrorCallback("TranscodeCover", new ClipExportException(p0.getError().type(), p0.getError().code(), p0.getError().message()));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler$6.class, "1")) {
          return;
       }
       KSClipLog.d("ClipExportHandler", "transcode cover  finished");
       ClipExportHandler mRenderRange = this.this$0.mRenderRangeLock;
       _monitor_enter(mRenderRange);
       ClipExportHandler$6 tthis$0 = this.this$0;
       tthis$0.mRenderRanges = p1;
       _monitor_exit(mRenderRange);
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("TranscodeCover");
          return;
       }else {
          ClipExportHandler mLock = tthis$0.mLock;
          _monitor_enter(mLock);
          this.this$0.mExportTaskStatsInfo = p0.getExportTaskStats();
          ClipExportHandler$6 tthis$01 = this.this$0;
          ClipExportHandler mExportLog = tthis$01.mExportLog;
          if (mExportLog != null) {
             mExportLog.setEncodeQos(tthis$01.mExportTaskStatsInfo);
          }
          this.this$0.mTranscodeCoverTempPath = p0.getFilePath();
          ClipExportHandler$6 tthis$02 = this.this$0;
          tthis$02.concatCover(tthis$02.mExportPath, tthis$02.mIsEnableConcatMode);
          _monitor_exit(mLock);
          return;
       }
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       ClipExportHandler$6 u6 = ClipExportHandler$6.class;
       if (PatchProxy.isSupport(u6) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u6, "2")) {
          return;
       }
       KSClipLog.d("ClipExportHandler", "transcode cover "+p1);
       return;
    }
}
