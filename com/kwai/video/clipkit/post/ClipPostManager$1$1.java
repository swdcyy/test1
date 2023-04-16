package com.kwai.video.clipkit.post.ClipPostManager$1$1;
import java.lang.Runnable;
import com.kwai.video.clipkit.post.ClipPostManager$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.post.ClipPostListener;

public class ClipPostManager$1$1 implements Runnable	// class@001ae3
{
    public final ClipPostManager$1 this$1;
    public final double val$encodeProgress;
    public final String val$sessionId;
    public final double val$uploadProgress;
    public final double val$watermarkProgress;

    public void ClipPostManager$1$1(ClipPostManager$1 p0,String p1,double p2,double p3,double p4){
       this.this$1 = p0;
       this.val$sessionId = p1;
       this.val$encodeProgress = p2;
       this.val$uploadProgress = p3;
       this.val$watermarkProgress = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipPostManager$1$1.class, "1")) {
          return;
       }
       ClipPostManager$1 val$postList = this.this$1.val$postListener;
       if (val$postList != null) {
          val$postList.onProgress(this.val$sessionId, this.val$encodeProgress, this.val$uploadProgress, this.val$watermarkProgress);
       }
       return;
    }
}
