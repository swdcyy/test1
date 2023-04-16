package com.kwai.video.clipkit.ClipImportHandler$1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.clipkit.ClipImportHandler;
import android.content.Context;
import com.kwai.video.clipkit.ClipImportHandler$RebuildTaskInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipImportException;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import com.kwai.video.clipkit.ClipKitUtils;
import java.io.File;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import java.lang.Double;

public class ClipImportHandler$1 implements ExportEventListener	// class@001a1f
{
    public final ClipImportHandler this$0;
    public final Context val$context;
    public final EditorSdk2V2$VideoEditorProject val$project;
    public final ClipImportHandler$RebuildTaskInfo val$taskInfo;

    public void ClipImportHandler$1(ClipImportHandler p0,Context p1,ClipImportHandler$RebuildTaskInfo p2,EditorSdk2V2$VideoEditorProject p3){
       this.this$0 = p0;
       this.val$context = p1;
       this.val$taskInfo = p2;
       this.val$project = p3;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler$1.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback();
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler$1.class, "3")) {
          return;
       }
       ClipDPHardwareConfigManager instance = ClipDPHardwareConfigManager.getInstance();
       ClipImportHandler$1 tval$context = this.val$context;
       ClipImportHandler$1 tval$project = this.val$project;
       int i = -1;
       int i1 = (p0.getError() != null)? p0.getError().code(): -1;
       if (instance.fallBackDecoderConfig(tval$context, tval$project, i1)) {
          this.this$0.run(this.val$context, this.val$taskInfo);
          return;
       }else {
          instance = ClipDPHardwareConfigManager.getInstance();
          if (p0.getError() != null) {
             i = p0.getError().code();
          }
          if (instance.isEncodeFallbackErrorCode(i)) {
             ClipImportHandler$1 tthis$0 = this.this$0;
             tthis$0.mDisableHwEncode = true;
             tthis$0.run(this.val$context, this.val$taskInfo);
             return;
          }else {
             String str = "ClipImportHandler";
             KSClipLog.e(str, "rebuild failed, because ExportTask error:"+p0.getError());
             ClipImportException uClipImportE = new ClipImportException(p0.getError(), this.val$taskInfo.importPath);
             tval$project = this.this$0;
             ClipImportHandler$RebuildTaskInfo index = this.val$taskInfo.index;
             tval$project.mClipImportResult.importExceptions[index] = uClipImportE;
             tval$project.notifyFailedCallback(index, uClipImportE);
             if (this.this$0.mRebuildCachePath != null) {
                ClipImportHandler$RebuildTaskInfo exportPath = this.val$taskInfo.exportPath;
                if (exportPath != null && ClipKitUtils.fileExists(exportPath)) {
                   new File(this.val$taskInfo.exportPath).delete();
                   KSClipLog.e(str, "rebuild failed, delete export file "+this.val$taskInfo.exportPath);
                }
             }
             this.this$0.continueRunNext(this.val$context, this.val$taskInfo, false, p0);
             return;
          }
       }
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipImportHandler$1.class, "1")) {
          return;
       }
       this.this$0.exportTaskSuccess(this.val$context, this.val$taskInfo);
       ClipImportHandler$1 tval$taskInf = this.val$taskInfo;
       this.this$0.notifySuccessCallback(tval$taskInf.index, tval$taskInf.exportPath);
       ClipImportHandler$1 tthis$0 = this.this$0;
       ClipImportHandler$1 tval$taskInf1 = this.val$taskInfo;
       tthis$0.mClipImportResult.importExceptions[tval$taskInf1.index] = null;
       tthis$0.continueRunNext(this.val$context, tval$taskInf1, true, p0);
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       ClipImportHandler$1 u1 = ClipImportHandler$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u1, "2")) {
          return;
       }
       ClipImportHandler$1 tval$taskInf = this.val$taskInfo;
       this.this$0.notifyProgressCallback(tval$taskInf.index, tval$taskInf.progressPercent, p1);
       return;
    }
}
