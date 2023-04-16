package com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$c;
import java.lang.Exception;
import brd.g;

public final class DataPreLoader$getWithRetry$2$2$2 extends Lambda implements l	// class@001964
{
    public final DataPreLoader$getWithRetry$2$2 this$0;

    public void DataPreLoader$getWithRetry$2$2$2(DataPreLoader$getWithRetry$2$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getWithRetry$2$2$2.class, "1")) {
          return;
       }
       DataPreLoader e = this.this$0.this$0.b.e;
       if (e != null) {
          e.g(true, p0);
       }
       DataPreLoader$getWithRetry$2$2$2 tthis$0 = this.this$0;
       DataPreLoader$getWithRetry$2$2 $emitter = tthis$0.$emitter;
       if (p0 == null) {
          Exception uException = tthis$0.this$0.b.g();
       }
       $emitter.onError(p0);
       return;
    }
}
