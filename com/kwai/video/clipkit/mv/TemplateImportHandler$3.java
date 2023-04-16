package com.kwai.video.clipkit.mv.TemplateImportHandler$3;
import java.lang.Runnable;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import com.kwai.video.clipkit.ClipImportException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TemplateImportHandler$3 implements Runnable	// class@001ad4
{
    public final TemplateImportHandler this$0;
    public final ClipImportException val$exception;

    public void TemplateImportHandler$3(TemplateImportHandler p0,ClipImportException p1){
       this.this$0 = p0;
       this.val$exception = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler$3.class, "1")) {
          return;
       }
       this.this$0.notifyFailedCallbackInner(this.val$exception);
       return;
    }
}
