package com.kwai.video.clipkit.ClipImportHandler$5;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipImportHandler$5 implements Runnable	// class@001a23
{
    public final ClipImportHandler this$0;

    public void ClipImportHandler$5(ClipImportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler$5.class, "1")) {
          return;
       }
       this.this$0.notifyCancelCallbackInner();
       return;
    }
}
