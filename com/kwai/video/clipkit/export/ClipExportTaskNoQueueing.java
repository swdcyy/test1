package com.kwai.video.clipkit.export.ClipExportTaskNoQueueing;
import com.kwai.video.editorsdk2.ExportEventListenerV2;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.SystemClock;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import com.kwai.video.editorsdk2.ExportedPipelineTempFilesState;
import jv7.g;
import java.lang.Double;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import com.kwai.video.clipkit.ClipKitUtils$ProjectTranscodeResult;

public class ClipExportTaskNoQueueing extends ExportTaskNoQueueing implements ExportEventListenerV2	// class@001a7f
{
    public ClipEditExportLog mExportLog;
    public ExportEventListener mInnerExportEventListener;
    public String mSessionId;

    public void ClipExportTaskNoQueueing(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3){
       super(p0, p1, p2, p3);
       this.init(p0, p1, p3);
    }
    public void ClipExportTaskNoQueueing(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3,long p4){
       super(p0, p1, p2, p3, p4);
       this.init(p0, p1, p3);
    }
    public final void init(Context p0,EditorSdk2V2$VideoEditorProject p1,EditorSdk2$ExportOptions p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ClipExportTaskNoQueueing.class, "1")) {
          return;
       }
       ClipEditExportLog uClipEditExp = new ClipEditExportLog();
       this.mExportLog = uClipEditExp;
       uClipEditExp.context = p0.getApplicationContext();
       p0.project = p1;
       super.setExportEventListener(this);
       if (p2 != null) {
          p2.setSkipTranscodeConfig(new EditorSdk2$ProtoSkipTranscodeConfig());
          p2.skipTranscodeConfig().setEnabled(false);
       }
       return;
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportTaskNoQueueing.class, "6")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          this.mExportLog.encodeEndTime = SystemClock.elapsedRealtime();
          ClipEditLogger.reportExportLog(9, this.mSessionId, this.mExportLog);
       }
       ClipExportTaskNoQueueing tmInnerExpor = this.mInnerExportEventListener;
       if (tmInnerExpor != null) {
          tmInnerExpor.onCancelled(p0);
       }
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportTaskNoQueueing.class, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          this.mExportLog.setEncodeQos(p0.getExportTaskStats());
          this.mExportLog.encodeEndTime = SystemClock.elapsedRealtime();
          this.mExportLog.exportException = new ClipExportException(p0.getError().type(), p0.getError().code(), p0.getError().message());
          ClipEditLogger.reportExportLog(8, this.mSessionId, this.mExportLog);
       }
       ClipExportTaskNoQueueing tmInnerExpor = this.mInnerExportEventListener;
       if (tmInnerExpor != null) {
          tmInnerExpor.onError(p0);
       }
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportTaskNoQueueing.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          this.mExportLog.setEncodeQos(p0.getExportTaskStats());
          this.mExportLog.encodeEndTime = SystemClock.elapsedRealtime();
          ClipEditLogger.reportExportLog(7, this.mSessionId, this.mExportLog);
       }
       ClipExportTaskNoQueueing tmInnerExpor = this.mInnerExportEventListener;
       if (tmInnerExpor != null) {
          tmInnerExpor.onFinished(p0, p1);
       }
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onPipelineTemporaryFileParsed(ExportTask p0,ExportedPipelineTempFilesState p1){
       g.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       ClipExportTaskNoQueueing uClipExportT = ClipExportTaskNoQueueing.class;
       if (PatchProxy.isSupport(uClipExportT) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uClipExportT, "4")) {
          return;
       }
       uClipExportT = this.mInnerExportEventListener;
       if (uClipExportT != null) {
          uClipExportT.onProgress(p0, p1);
       }
       return;
    }
    public void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportTaskNoQueueing.class, "7")) {
          return;
       }
       ClipExportTaskNoQueueing tmInnerExpor = this.mInnerExportEventListener;
       if (tmInnerExpor != null && tmInnerExpor instanceof ExportEventListenerV2) {
          tmInnerExpor.onSegmentEncoded(p0, p1);
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportTaskNoQueueing.class, "2")) {
          return;
       }
       super.run();
       this.mExportLog.encodeStartTime = SystemClock.elapsedRealtime();
       if (!TextUtils.isEmpty(this.mSessionId)) {
          ClipEditLogger.reportExportLog(1, this.mSessionId, this.mExportLog);
       }
       return;
    }
    public void setExportEventListener(ExportEventListener p0){
       this.mInnerExportEventListener = p0;
    }
    public void setSessionId(String p0,ClipEditExtraInfo p1,ClipKitUtils$ProjectTranscodeResult p2){
       this.mSessionId = p0;
       ClipExportTaskNoQueueing tmExportLog = this.mExportLog;
       tmExportLog.extraInfo = p1;
       tmExportLog.skipTranscode = 1;
       tmExportLog.transcodeReason = p2.reason;
    }
}
