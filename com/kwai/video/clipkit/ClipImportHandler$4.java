package com.kwai.video.clipkit.ClipImportHandler$4;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler;
import com.kwai.video.clipkit.ClipImportException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipImportHandler$4 implements Runnable	// class@001a22
{
    public final ClipImportHandler this$0;
    public final ClipImportException val$exception;
    public final int val$index;

    public void ClipImportHandler$4(ClipImportHandler p0,int p1,ClipImportException p2){
       this.this$0 = p0;
       this.val$index = p1;
       this.val$exception = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler$4.class, "1")) {
          return;
       }
       this.this$0.notifyFailedCallbackInner(this.val$index, this.val$exception);
       return;
    }
}
