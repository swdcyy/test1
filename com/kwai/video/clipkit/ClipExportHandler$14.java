package com.kwai.video.clipkit.ClipExportHandler$14;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListener;

public class ClipExportHandler$14 implements Runnable	// class@001a0b
{
    public final ClipExportHandler this$0;
    public final double val$progress;

    public void ClipExportHandler$14(ClipExportHandler p0,double p1){
       this.this$0 = p0;
       this.val$progress = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$14.class, "1")) {
          return;
       }
       ClipExportHandler mClipExportL = this.this$0.mClipExportListener;
       if (mClipExportL != null) {
          mClipExportL.onProgress(this.val$progress);
       }
       return;
    }
}
