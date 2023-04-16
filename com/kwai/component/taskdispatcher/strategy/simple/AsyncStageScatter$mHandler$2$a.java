package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$mHandler$2$a;
import android.os.Handler;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$mHandler$2;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import eh5.q;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;

public final class AsyncStageScatter$mHandler$2$a extends Handler	// class@000bb5
{
    public final AsyncStageScatter$mHandler$2 a;
    public final HandlerThread b;

    public void AsyncStageScatter$mHandler$2$a(AsyncStageScatter$mHandler$2 p0,HandlerThread p1,Looper p2){
       this.a = p0;
       this.b = p1;
       super(p2);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStageScatter$mHandler$2$a.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       p0 = p0.obj;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Task");
       this.a.this$0.p(p0);
       return;
    }
}
