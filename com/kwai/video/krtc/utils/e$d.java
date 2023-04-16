package com.kwai.video.krtc.utils.e$d;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalStateException;

public class e$d	// class@0008ca
{
    public Thread a;

    public void e$d(){
       super();
       this.a = Thread.currentThread();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = Thread.currentThread();
       }
       if (Thread.currentThread() == this.a) {
          return;
       }else {
          throw new IllegalStateException("Wrong thread");
       }
    }
}
