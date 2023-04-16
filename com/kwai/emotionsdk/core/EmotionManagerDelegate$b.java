package com.kwai.emotionsdk.core.EmotionManagerDelegate$b;
import erd.o;
import java.lang.Object;
import bk5.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.e0;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Thread;
import ok5.a;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import brd.a0;
import android.os.SystemClock;
import ck5.n;
import io.reactivex.i;
import ck5.o;
import erd.g;
import ck5.p;

public final class EmotionManagerDelegate$b implements o	// class@000d86
{
    public static final EmotionManagerDelegate$b b;

    static {
       EmotionManagerDelegate$b.b = new EmotionManagerDelegate$b();
    }
    public void EmotionManagerDelegate$b(){
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EmotionResourceProcessor obj = PatchProxy.applyOneRefs(p0, this, EmotionManagerDelegate$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          a.a("EmotionManagerDelegate", "initEmotionDataInternal 4, "+thread.getName());
          obj = EmotionResourceProcessor.class;
          Object obj1 = PatchProxy.applyOneRefs(p0, null, obj, "3");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             a.p(p0, "emotionResponseWrapper");
             EmotionResourceProcessor f = EmotionResourceProcessor.f;
             f.d();
             if (!PatchProxy.applyVoid(null, f, obj, "6")) {
                EmotionResourceProcessor.c = SystemClock.elapsedRealtime();
             }
             p0 = a0.k(new n(p0)).p(o.b).r(p.b);
             a.o(p0, "Single.create<EmotionRes¡­\(\), costRecord\(\)\)\n      }");
             obj = p0;
          }
       }
       return obj;
    }
}
