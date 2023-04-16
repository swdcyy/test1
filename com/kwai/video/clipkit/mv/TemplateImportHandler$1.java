package com.kwai.video.clipkit.mv.TemplateImportHandler$1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.ClipImportException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import java.lang.Double;

public class TemplateImportHandler$1 implements ExportEventListener	// class@001ad2
{
    public final TemplateImportHandler this$0;
    public final String val$exportPath;

    public void TemplateImportHandler$1(TemplateImportHandler p0,String p1){
       this.this$0 = p0;
       this.val$exportPath = p1;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler$1.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback();
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler$1.class, "3")) {
          return;
       }
       this.this$0.notifyFailedCallback(new ClipImportException(p0.getError(), this.this$0.mMediaPath));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TemplateImportHandler$1.class, "1")) {
          return;
       }
       this.this$0.notifySuccessCallback(this.val$exportPath);
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       if (PatchProxy.isSupport(TemplateImportHandler$1.class) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, TemplateImportHandler$1.class, "2")) {
          return;
       }
       this.this$0.notifyProgressCallback(p1);
       return;
    }
}
