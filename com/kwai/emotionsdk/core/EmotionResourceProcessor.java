package com.kwai.emotionsdk.core.EmotionResourceProcessor;
import com.kwai.emotionsdk.core.EmotionResourceProcessor$seqId$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.emotionsdk.core.EmotionResourceProcessor$retryCount$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.core.EmotionResourceProcessor$a;
import ok5.a;
import jk5.b;
import java.lang.Integer;
import jk5.e;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

public final class EmotionResourceProcessor	// class@000d8f
{
    public static final p a;
    public static EmotionResourceProcessor$a b;
    public static long c;
    public static final p d;
    public static boolean e;
    public static final EmotionResourceProcessor f;

    static {
       EmotionResourceProcessor.f = new EmotionResourceProcessor();
       EmotionResourceProcessor.a = s.c(EmotionResourceProcessor$seqId$2.INSTANCE);
       EmotionResourceProcessor.d = s.c(EmotionResourceProcessor$retryCount$2.INSTANCE);
    }
    public void EmotionResourceProcessor(){
       super();
    }
    public static final boolean a(EmotionResourceProcessor p0){
       return EmotionResourceProcessor.e;
    }
    public static final void e(){
       e a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, EmotionResourceProcessor.class, "4")) {
          return;
       }
       EmotionResourceProcessor$a b = EmotionResourceProcessor.b;
       boolean b1 = true;
       if (b != null) {
          if (b.a() != -1 && b.b == null) {
             a.a("EmotionResourceProcessor", "tryToStartImmediately 2");
             EmotionResourceProcessor$a b2 = EmotionResourceProcessor.b;
             if (b2 != null) {
                b2.b = b1;
             }
             int i = b.a();
             if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), objArray, b.class, "3")) {
                a = b.a;
                if (a != null) {
                   a.startImmediately(i);
                }
             }
          }
       }else {
          EmotionResourceProcessor.e = b1;
          l1 a1 = l1.a;
       }
       return;
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, EmotionResourceProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (SystemClock.elapsedRealtime() - EmotionResourceProcessor.c);
    }
    public final AtomicInteger c(){
       Object obj = PatchProxy.apply(null, this, EmotionResourceProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EmotionResourceProcessor.d.getValue();
    }
    public final void d(){
       EmotionResourceProcessor.b = null;
    }
}
