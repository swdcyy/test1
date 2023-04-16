package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$removeTasksByTag$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import xj3.d;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveMainThreadTaskDispatcher$removeTasksByTag$1 extends Lambda implements l	// class@000d74
{
    public final Object $tag;

    public void LiveMainThreadTaskDispatcher$removeTasksByTag$1(Object p0){
       this.$tag = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMainThreadTaskDispatcher$removeTasksByTag$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return a.g(p0.b(), this.$tag);
    }
}
