package com.yxcorp.gifshow.log.v$c;
import android.os.Handler;
import com.yxcorp.gifshow.log.v;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;

public class v$c extends Handler	// class@001b59
{
    public final v a;

    public void v$c(v p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$c.class, "1")) {
          return;
       }
       if (p0.what == 1) {
          this.a.e.run();
       }
       return;
    }
}
