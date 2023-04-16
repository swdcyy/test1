package com.kwai.emotionsdk.core.EmotionManagerDelegate$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.util.concurrent.atomic.AtomicInteger;
import qrd.p;

public final class EmotionManagerDelegate$a	// class@000d85
{

    public void EmotionManagerDelegate$a(){
       super();
    }
    public void EmotionManagerDelegate$a(u p0){
       super();
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (SystemClock.elapsedRealtime() - EmotionManagerDelegate.f);
    }
    public final AtomicInteger b(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EmotionManagerDelegate.e.getValue();
    }
}
