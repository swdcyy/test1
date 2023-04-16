package com.kwai.video.clipkit.post.ClipPostManager$1;
import com.kwai.video.clipkit.post.ClipPostListener;
import com.kwai.video.clipkit.post.ClipPostManager;
import com.kwai.video.clipkit.post.ClipPostTask;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import java.util.List;
import com.kwai.video.clipkit.post.ClipPostManager$1$3;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Double;
import com.kwai.video.clipkit.post.ClipPostManager$1$1;
import com.kwai.video.clipkit.post.ClipPostStatus;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipPostException;
import com.kwai.video.clipkit.post.ClipPostManager$1$2;

public class ClipPostManager$1 implements ClipPostListener	// class@001ae6
{
    public final ClipPostManager this$0;
    public final ClipPostTask val$clipPostTask;
    public final ClipPostListener val$postListener;

    public void ClipPostManager$1(ClipPostManager p0,ClipPostListener p1,ClipPostTask p2){
       this.this$0 = p0;
       this.val$postListener = p1;
       this.val$clipPostTask = p2;
       super();
    }
    public void onCancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostManager$1.class, "3")) {
          return;
       }
       KSClipLog.d("ClipPostManager", "id:"+p0+" cancel");
       ClipPostManager mLock = this.this$0.mLock;
       _monitor_enter(mLock);
       this.this$0.mClipPostTasks.remove(this.val$clipPostTask);
       ClipPostManager$1 tthis$0 = this.this$0;
       tthis$0.mProcessSessionId = null;
       tthis$0.startPostTaskIfNeed();
       _monitor_exit(mLock);
       this.this$0.mMainHandler.post(new ClipPostManager$1$3(this, p0));
       return;
    }
    public void onProgress(String p0,double p1,double p2,double p3){
       if (PatchProxy.isSupport(ClipPostManager$1.class) && PatchProxy.applyVoidFourRefs(p0, Double.valueOf(p1), Double.valueOf(p2), Double.valueOf(p3), this, ClipPostManager$1.class, "1")) {
          return;
       }
       ClipPostManager$1$1 u1$1 = new ClipPostManager$1$1(this, p0, p1, p2, p3);
       this.this$0.mMainHandler.post(v11);
       return;
    }
    public void onStatusChange(String p0,ClipPostStatus p1,ClipPostResult p2,ClipPostException p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ClipPostManager$1.class, "2")) {
          return;
       }
       KSClipLog.d("ClipPostManager", "id:"+p0+",onStatusChangeCallback. "+p1.toString());
       ClipPostManager$1$2 u1$2 = new ClipPostManager$1$2(this, p0, p1, p2, p3);
       this.this$0.mMainHandler.post(v7);
       ClipPostManager mLock = this.this$0.mLock;
       _monitor_enter(mLock);
       if (this.val$clipPostTask.isStatusContinue()) {
          ClipPostManager$1 tthis$0 = this.this$0;
          tthis$0.mProcessSessionId = null;
          tthis$0.startPostTaskIfNeed();
       }
       _monitor_exit(mLock);
       return;
    }
}
