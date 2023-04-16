package com.kwai.video.clipkit.ClipExportHandler$11;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipExportHandler$11 implements Runnable	// class@001a08
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$11(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$11.class, "1")) {
          return;
       }
       this.this$0.notifyFinishCallbackInner();
       return;
    }
}
