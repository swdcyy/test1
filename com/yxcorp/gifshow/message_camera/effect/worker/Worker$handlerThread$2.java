package com.yxcorp.gifshow.message_camera.effect.worker.Worker$handlerThread$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.worker.Worker;
import android.os.HandlerThread;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Worker$handlerThread$2 extends Lambda implements a	// class@001dd4
{
    public final Worker this$0;

    public void Worker$handlerThread$2(Worker p0){
       this.this$0 = p0;
       super(0);
    }
    public final HandlerThread invoke(){
       Object obj = PatchProxy.apply(null, this, Worker$handlerThread$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HandlerThread(this.this$0.d);
    }
    public Object invoke(){
       return this.invoke();
    }
}
