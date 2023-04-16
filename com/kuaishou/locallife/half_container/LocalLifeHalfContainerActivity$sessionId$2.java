package com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$sessionId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;

public final class LocalLifeHalfContainerActivity$sessionId$2 extends Lambda implements a	// class@001493
{
    public static final LocalLifeHalfContainerActivity$sessionId$2 INSTANCE;

    static {
       LocalLifeHalfContainerActivity$sessionId$2.INSTANCE = new LocalLifeHalfContainerActivity$sessionId$2();
    }
    public void LocalLifeHalfContainerActivity$sessionId$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LocalLifeHalfContainerActivity$sessionId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString();
    }
}
