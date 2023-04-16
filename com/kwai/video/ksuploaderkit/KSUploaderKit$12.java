package com.kwai.video.ksuploaderkit.KSUploaderKit$12;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import android.os.Handler;

public class KSUploaderKit$12 implements Runnable	// class@00095b
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$12(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$12.class, "1")) {
          return;
       }
       KSUploaderKit mThreadHandl = this.this$0.mThreadHandler;
       if (mThreadHandl != null) {
          mThreadHandl.getLooper().quitSafely();
          this.this$0.mThreadHandler = null;
       }
       return;
    }
}
