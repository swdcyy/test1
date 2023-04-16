package com.kwai.video.clipkit.ClipImportHandler$6;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClipImportHandler$6 implements Runnable	// class@001a24
{
    public final ClipImportHandler this$0;
    public final int val$index;
    public final double val$percent;
    public final double val$progress;

    public void ClipImportHandler$6(ClipImportHandler p0,int p1,double p2,double p3){
       this.this$0 = p0;
       this.val$index = p1;
       this.val$percent = p2;
       this.val$progress = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler$6.class, "1")) {
          return;
       }
       this.this$0.notifyProgressCallbackInner(this.val$index, this.val$percent, this.val$progress);
       return;
    }
}
