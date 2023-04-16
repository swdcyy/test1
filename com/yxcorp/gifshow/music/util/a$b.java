package com.yxcorp.gifshow.music.util.a$b;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import jqb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.k;
import q87.c;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.CommonException;
import java.lang.Exception;
import w46.b;

public class a$b implements Mp4RemuxerEventListener	// class@002083
{
    public boolean a;
    public CountDownLatch b;
    public Exception c;

    public void a$b(){
       super();
       this.a = false;
       this.b = new CountDownLatch(1);
    }
    public void a$b(b p0){
       super();
       this.a = false;
       this.b = new CountDownLatch(1);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "4")) {
          return;
       }
       this.b.countDown();
       return;
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().A("ClipMusicRunner", "cancelled", objArray);
       this.a();
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().t("ClipMusicRunner", "error = "+p0.retcode+", "+p0.type+", "+p0.getMessage(), objArray);
       this.c = p0;
       this.a();
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().s("ClipMusicRunner", "remux finished", objArray);
       this.a = true;
       this.a();
       return;
    }
    public void onProgress(double p0){
    }
}
