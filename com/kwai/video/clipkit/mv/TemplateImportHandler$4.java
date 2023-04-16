package com.kwai.video.clipkit.mv.TemplateImportHandler$4;
import java.lang.Runnable;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TemplateImportHandler$4 implements Runnable	// class@001ad5
{
    public final TemplateImportHandler this$0;

    public void TemplateImportHandler$4(TemplateImportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler$4.class, "1")) {
          return;
       }
       this.this$0.notifyCancelCallbackInner();
       return;
    }
}
