package com.kwai.video.clipkit.ClipImportHandler$2;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class ClipImportHandler$2 implements Runnable	// class@001a20
{
    public final ClipImportHandler this$0;
    public final String val$exportPath;
    public final int val$index;

    public void ClipImportHandler$2(ClipImportHandler p0,int p1,String p2){
       this.this$0 = p0;
       this.val$index = p1;
       this.val$exportPath = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler$2.class, "1")) {
          return;
       }
       this.this$0.notifySuccessCallbackInner(this.val$index, this.val$exportPath);
       return;
    }
}
