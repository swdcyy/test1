package com.kwai.emotionsdk.core.EmotionManagerDelegate$emotionInitListeners$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EmotionManagerDelegate$emotionInitListeners$2 extends Lambda implements a	// class@000d8a
{
    public static final EmotionManagerDelegate$emotionInitListeners$2 INSTANCE;

    static {
       EmotionManagerDelegate$emotionInitListeners$2.INSTANCE = new EmotionManagerDelegate$emotionInitListeners$2();
    }
    public void EmotionManagerDelegate$emotionInitListeners$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final CopyOnWriteArrayList invoke(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate$emotionInitListeners$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CopyOnWriteArrayList();
    }
}
