package com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2$1;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2$2;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;

public final class DataPreLoader$getWithRetry$2$2 extends Lambda implements l	// class@001965
{
    public final v $emitter;
    public final DataPreLoader$getWithRetry$2 this$0;

    public void DataPreLoader$getWithRetry$2$2(DataPreLoader$getWithRetry$2 p0,v p1){
       this.this$0 = p0;
       this.$emitter = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getWithRetry$2$2.class, "1")) {
          return;
       }
       this.this$0.d.c(new DataPreLoader$getWithRetry$2$2$1(this), new DataPreLoader$getWithRetry$2$2$2(this));
       return;
    }
}
