package com.kwai.video.clipkit.ClipImportHandler$3;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipImportHandler$3 implements Runnable	// class@001a21
{
    public final ClipImportHandler this$0;
    public final ClipImportHandler$ClipImportResult val$importResult;

    public void ClipImportHandler$3(ClipImportHandler p0,ClipImportHandler$ClipImportResult p1){
       this.this$0 = p0;
       this.val$importResult = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler$3.class, "1")) {
          return;
       }
       this.this$0.notifyFinishedCallbackInner(this.val$importResult);
       return;
    }
}
