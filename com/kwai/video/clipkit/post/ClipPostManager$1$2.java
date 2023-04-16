package com.kwai.video.clipkit.post.ClipPostManager$1$2;
import java.lang.Runnable;
import com.kwai.video.clipkit.post.ClipPostManager$1;
import java.lang.String;
import com.kwai.video.clipkit.post.ClipPostStatus;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipPostException;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.post.ClipPostListener;

public class ClipPostManager$1$2 implements Runnable	// class@001ae4
{
    public final ClipPostManager$1 this$1;
    public final ClipPostException val$exception;
    public final ClipPostResult val$result;
    public final String val$sessionId;
    public final ClipPostStatus val$status;

    public void ClipPostManager$1$2(ClipPostManager$1 p0,String p1,ClipPostStatus p2,ClipPostResult p3,ClipPostException p4){
       this.this$1 = p0;
       this.val$sessionId = p1;
       this.val$status = p2;
       this.val$result = p3;
       this.val$exception = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipPostManager$1$2.class, "1")) {
          return;
       }
       ClipPostManager$1 val$postList = this.this$1.val$postListener;
       if (val$postList != null) {
          val$postList.onStatusChange(this.val$sessionId, this.val$status, this.val$result, this.val$exception);
       }
       return;
    }
}
