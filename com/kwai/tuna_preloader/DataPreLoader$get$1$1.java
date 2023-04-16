package com.kwai.tuna_preloader.DataPreLoader$get$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$get$1;
import brd.v;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$c;
import brd.g;

public final class DataPreLoader$get$1$1 extends Lambda implements l	// class@00195a
{
    public final v $emitter;
    public final DataPreLoader$get$1 this$0;

    public void DataPreLoader$get$1$1(DataPreLoader$get$1 p0,v p1){
       this.this$0 = p0;
       this.$emitter = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$get$1$1.class, "1")) {
          return;
       }
       a.p(p0, "resultWrapper");
       DataPreLoader e = this.this$0.b.e;
       if (e != null) {
          e.h(false, p0);
       }
       p0.setFromCache(true);
       this.$emitter.onNext(p0);
       this.$emitter.onComplete();
       return;
    }
}
