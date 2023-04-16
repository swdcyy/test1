package com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$c;
import brd.g;

public final class DataPreLoader$getWithRetry$2$2$1 extends Lambda implements l	// class@001963
{
    public final DataPreLoader$getWithRetry$2$2 this$0;

    public void DataPreLoader$getWithRetry$2$2$1(DataPreLoader$getWithRetry$2$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getWithRetry$2$2$1.class, "1")) {
          return;
       }
       a.p(p0, "resultWrapper");
       DataPreLoader e = this.this$0.this$0.b.e;
       if (e != null) {
          e.h(true, p0);
       }
       p0.setFromCache(false);
       this.this$0.$emitter.onNext(p0);
       this.this$0.$emitter.onComplete();
       return;
    }
}
