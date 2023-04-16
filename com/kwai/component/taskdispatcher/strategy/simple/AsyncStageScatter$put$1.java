package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$put$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import java.lang.Object;
import eh5.q;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Message;
import trd.j;
import qrd.l1;

public final class AsyncStageScatter$put$1 extends Lambda implements l	// class@000bb7
{
    public final AsyncStageScatter this$0;

    public void AsyncStageScatter$put$1(AsyncStageScatter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AsyncStageScatter$put$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = this.this$0.n().sendMessage(this.this$0.q(p0));
       if (b) {
          j oj = this.this$0.o();
          _monitor_enter(oj);
          this.this$0.o().addLast(p0);
          _monitor_exit(oj);
       }
       return b;
    }
}
