package com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1;
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

public final class AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1 extends Lambda implements l	// class@000bb4
{
    public final long $batchId$inlined;
    public final AsyncStageScatter this$0;

    public void AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1(AsyncStageScatter p0,long p1){
       this.this$0 = p0;
       this.$batchId$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (!p0.b() - this.$batchId$inlined)? true: false;
       if (b) {
          long l = p0.d();
          this.this$0.n().removeMessages((int)(l ^ (l >> 32)));
          p0.h();
       }
       PatchProxy.onMethodExit(AsyncStageScatter$cancelTaskByBatchId$$inlined$synchronized$lambda$1.class, "1");
       return b;
    }
}
