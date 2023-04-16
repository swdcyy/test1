package com.kwai.video.clipkit.mv.TemplateImportHandler$2;
import java.lang.Runnable;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class TemplateImportHandler$2 implements Runnable	// class@001ad3
{
    public final TemplateImportHandler this$0;
    public final String val$exportPath;

    public void TemplateImportHandler$2(TemplateImportHandler p0,String p1){
       this.this$0 = p0;
       this.val$exportPath = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler$2.class, "1")) {
          return;
       }
       this.this$0.notifySuccessCallbackInner(this.val$exportPath);
       return;
    }
}
