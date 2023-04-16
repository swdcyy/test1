package com.kwai.performance.fluency.fps.monitor.FpsMonitor$stopSectionInternal$afterUpload$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import qe7.a;
import ye7.a;
import java.lang.Object;
import qrd.l1;
import kotlin.Result;
import ye7.b;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ve7.b;
import java.util.NoSuchElementException;
import java.lang.String;
import qe7.d;
import java.lang.Throwable;
import qrd.j0;
import pe7.f;
import qrd.i;
import kotlin.jvm.internal.a;
import yf7.h;

public final class FpsMonitor$stopSectionInternal$afterUpload$1 extends Lambda implements a	// class@001067
{
    public final a $callback;
    public final a $fpsEvent;

    public void FpsMonitor$stopSectionInternal$afterUpload$1(a p0,a p1){
       this.$callback = p0;
       this.$fpsEvent = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       b newFPS;
       FpsMonitor$stopSectionInternal$afterUpload$1 t$callback = this.$callback;
       if (t$callback == null) {
       }else {
          a b = t$callback.b;
          if (b != null) {
             t$callback = this.$fpsEvent;
             if (t$callback instanceof b) {
                newFPS = t$callback.newFPS;
             }else if(t$callback instanceof FpsEventV2){
                Iterator iterator = t$callback.e().iterator();
                while (true) {
                   if (!iterator.hasNext()) {
                      throw new NoSuchElementException("Collection contains no element matching the predicate.");
                   }
                   Object obj1 = iterator.next();
                   Object obj2 = (obj1.d() == -1)? 1: null;
                   if (obj2) {
                      newFPS = obj1.b();
                   }
                }
             }else {
                newFPS = null;
             }
             b.a(t$callback.endReason, (t$callback.endTime - t$callback.startTime), newFPS);
             Object obj = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(obj);
             if (throwable != null) {
                h.b(f.b("FpsMonitor"), a.C("afterUpload error: ", i.i(throwable)));
             }
             Result.box-impl(obj);
          }
       }
       return;
    }
}
