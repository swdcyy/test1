package com.kwai.kxb.preload.internal.ForcePreloadTaskScheduler$cancel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.kxb.PlatformType;
import java.lang.Object;
import pu6.b$a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pu6.i;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.Runnable;
import ekd.k1;

public final class ForcePreloadTaskScheduler$cancel$1 extends Lambda implements l	// class@0007de
{
    public final PlatformType $platformType;

    public void ForcePreloadTaskScheduler$cancel$1(PlatformType p0){
       this.$platformType = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(b$a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, ForcePreloadTaskScheduler$cancel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ForcePreloadTaskScheduler$cancel$1 t$platformTy = this.$platformType;
       if (t$platformTy == null || t$platformTy == p0.b) {
          i.b(i.a, t$platformTy, "remove preload task: "+p0, null, 4, null);
          k1.m(p0);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
