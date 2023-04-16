package com.kwai.video.clipkit.post.ClipPostManager$1$3;
import java.lang.Runnable;
import com.kwai.video.clipkit.post.ClipPostManager$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.post.ClipPostListener;

public class ClipPostManager$1$3 implements Runnable	// class@001ae5
{
    public final ClipPostManager$1 this$1;
    public final String val$sessionId;

    public void ClipPostManager$1$3(ClipPostManager$1 p0,String p1){
       this.this$1 = p0;
       this.val$sessionId = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipPostManager$1$3.class, "1")) {
          return;
       }
       ClipPostManager$1 val$postList = this.this$1.val$postListener;
       if (val$postList != null) {
          val$postList.onCancel(this.val$sessionId);
       }
       return;
    }
}
