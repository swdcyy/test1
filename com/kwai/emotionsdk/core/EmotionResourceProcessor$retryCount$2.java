package com.kwai.emotionsdk.core.EmotionResourceProcessor$retryCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EmotionResourceProcessor$retryCount$2 extends Lambda implements a	// class@000d8d
{
    public static final EmotionResourceProcessor$retryCount$2 INSTANCE;

    static {
       EmotionResourceProcessor$retryCount$2.INSTANCE = new EmotionResourceProcessor$retryCount$2();
    }
    public void EmotionResourceProcessor$retryCount$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final AtomicInteger invoke(){
       Object obj = PatchProxy.apply(null, this, EmotionResourceProcessor$retryCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AtomicInteger();
    }
}