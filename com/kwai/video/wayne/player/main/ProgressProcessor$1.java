package com.kwai.video.wayne.player.main.ProgressProcessor$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.ProgressProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;

public class ProgressProcessor$1 implements Runnable	// class@000d8b
{
    public final ProgressProcessor this$0;

    public void ProgressProcessor$1(ProgressProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ProgressProcessor$1.class, "1")) {
          return;
       }
       this.this$0.dispatchProgressEvent();
       ProgressProcessor$1 tthis$0 = this.this$0;
       tthis$0.mProgressHandler.postDelayed(tthis$0.mProgressRunable, (long)ProgressProcessor.PROGRESS_INTERVAL);
       return;
    }
}
