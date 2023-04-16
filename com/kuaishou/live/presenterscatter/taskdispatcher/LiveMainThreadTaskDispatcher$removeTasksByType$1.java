package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$removeTasksByType$1;
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

public final class LiveMainThreadTaskDispatcher$removeTasksByType$1 extends Lambda implements l	// class@000d75
{
    public final int $type;

    public void LiveMainThreadTaskDispatcher$removeTasksByType$1(int p0){
       this.$type = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMainThreadTaskDispatcher$removeTasksByType$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (p0.c() == this.$type)? true: false;
       return b;
    }
}
