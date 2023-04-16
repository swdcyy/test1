package com.kwai.component.taskdispatcher.strategy.simple.DefaultAsyncStrategy$put$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.strategy.simple.DefaultAsyncStrategy;
import eh5.q;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.z;
import qrd.p;
import java.lang.Runnable;
import crd.b;

public final class DefaultAsyncStrategy$put$1 extends Lambda implements l	// class@000bbb
{
    public final q $task;
    public final DefaultAsyncStrategy this$0;

    public void DefaultAsyncStrategy$put$1(DefaultAsyncStrategy p0,q p1){
       this.this$0 = p0;
       this.$task = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultAsyncStrategy$put$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       DefaultAsyncStrategy$put$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       obj = PatchProxy.apply(null, tthis$0, DefaultAsyncStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = tthis$0.b.getValue();
       }
       obj.d(this.$task);
       return true;
    }
}
