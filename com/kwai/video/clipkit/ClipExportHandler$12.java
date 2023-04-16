package com.kwai.video.clipkit.ClipExportHandler$12;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipExportHandler;
import com.kwai.video.clipkit.ClipExportException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipExportHandler$12 implements Runnable	// class@001a09
{
    public final ClipExportHandler this$0;
    public final ClipExportException val$error;

    public void ClipExportHandler$12(ClipExportHandler p0,ClipExportException p1){
       this.this$0 = p0;
       this.val$error = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$12.class, "1")) {
          return;
       }
       this.this$0.notifyErrorCallbackInner(this.val$error);
       return;
    }
}
