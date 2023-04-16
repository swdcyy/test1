package com.kwai.tuna_preloader.DataPreLoader$getWithRetry$1;
import io.reactivex.g;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$1$1;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$1$2;
import msd.l;

public final class DataPreLoader$getWithRetry$1 implements g	// class@001961
{
    public final DataPreLoader b;
    public final DataPreLoader$LoadController c;

    public void DataPreLoader$getWithRetry$1(DataPreLoader p0,DataPreLoader$LoadController p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getWithRetry$1.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.c.c(new DataPreLoader$getWithRetry$1$1(this, p0), new DataPreLoader$getWithRetry$1$2(this, p0));
       return;
    }
}
