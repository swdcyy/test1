package com.kwai.video.clipkit.mv.TemplateImportHandler$5;
import java.lang.Runnable;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TemplateImportHandler$5 implements Runnable	// class@001ad6
{
    public final TemplateImportHandler this$0;
    public final double val$progress;

    public void TemplateImportHandler$5(TemplateImportHandler p0,double p1){
       this.this$0 = p0;
       this.val$progress = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler$5.class, "1")) {
          return;
       }
       this.this$0.notifyProgressCallbackInner(this.val$progress);
       return;
    }
}
