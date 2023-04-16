package com.kwai.eve.theadpool.EveSchedulers$gcThreadService$2$a;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class EveSchedulers$gcThreadService$2$a implements ThreadFactory	// class@000dd0
{
    public final AtomicInteger b;

    public void EveSchedulers$gcThreadService$2$a(){
       super();
       this.b = new AtomicInteger();
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveSchedulers$gcThreadService$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "r");
       return new Thread(p0, "eve_luaBaseObject_gc_"+this.b.incrementAndGet());
    }
}
