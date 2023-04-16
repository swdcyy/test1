package com.kwai.eve.theadpool.EveSchedulers$gcThreadService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.kwai.eve.theadpool.EveSchedulers$gcThreadService$2$a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class EveSchedulers$gcThreadService$2 extends Lambda implements a	// class@000dd1
{
    public static final EveSchedulers$gcThreadService$2 INSTANCE;

    static {
       EveSchedulers$gcThreadService$2.INSTANCE = new EveSchedulers$gcThreadService$2();
    }
    public void EveSchedulers$gcThreadService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       Object obj = PatchProxy.apply(null, this, EveSchedulers$gcThreadService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new EveSchedulers$gcThreadService$2$a());
       return obj;
    }
}
