package com.kwai.emotionsdk.core.EmotionManagerDelegate$Companion$retryCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EmotionManagerDelegate$Companion$retryCount$2 extends Lambda implements a	// class@000d84
{
    public static final EmotionManagerDelegate$Companion$retryCount$2 INSTANCE;

    static {
       EmotionManagerDelegate$Companion$retryCount$2.INSTANCE = new EmotionManagerDelegate$Companion$retryCount$2();
    }
    public void EmotionManagerDelegate$Companion$retryCount$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final AtomicInteger invoke(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate$Companion$retryCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AtomicInteger();
    }
}
