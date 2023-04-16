package com.kwai.tuna_preloader.DataPreLoader$get$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$get$1;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$c;
import java.lang.Exception;
import brd.g;

public final class DataPreLoader$get$1$2 extends Lambda implements l	// class@00195b
{
    public final v $emitter;
    public final DataPreLoader$get$1 this$0;

    public void DataPreLoader$get$1$2(DataPreLoader$get$1 p0,v p1){
       this.this$0 = p0;
       this.$emitter = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$get$1$2.class, "1")) {
          return;
       }
       DataPreLoader e = this.this$0.b.e;
       if (e != null) {
          e.g(false, p0);
       }
       DataPreLoader$get$1$2 t$emitter = this.$emitter;
       if (p0 == null) {
          Exception uException = this.this$0.b.g();
       }
       t$emitter.onError(p0);
       return;
    }
}
