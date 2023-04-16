package com.yxcorp.gifshow.log.timemachine.context.TMContext$properties$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TMContext$properties$2 extends Lambda implements a	// class@001b4c
{
    public static final TMContext$properties$2 INSTANCE;

    static {
       TMContext$properties$2.INSTANCE = new TMContext$properties$2();
    }
    public void TMContext$properties$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, TMContext$properties$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
