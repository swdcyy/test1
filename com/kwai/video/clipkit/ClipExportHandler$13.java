package com.kwai.video.clipkit.ClipExportHandler$13;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipExportHandler$13 implements Runnable	// class@001a0a
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$13(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$13.class, "1")) {
          return;
       }
       this.this$0.notifyCancelCallbackInner();
       return;
    }
}
