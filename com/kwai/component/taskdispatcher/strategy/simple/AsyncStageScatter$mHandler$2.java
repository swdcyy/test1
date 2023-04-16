package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$mHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$mHandler$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.HandlerThread;
import android.os.Looper;

public final class AsyncStageScatter$mHandler$2 extends Lambda implements a	// class@000bb6
{
    public final AsyncStageScatter this$0;

    public void AsyncStageScatter$mHandler$2(AsyncStageScatter p0){
       this.this$0 = p0;
       super(0);
    }
    public final AsyncStageScatter$mHandler$2$a invoke(){
       HandlerThread obj = PatchProxy.apply(null, this, AsyncStageScatter$mHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HandlerThread("PageThread");
       obj.start();
       return new AsyncStageScatter$mHandler$2$a(this, obj, obj.getLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
