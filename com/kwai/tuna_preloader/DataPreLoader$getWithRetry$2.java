package com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2;
import io.reactivex.g;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$1;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2$2;
import msd.l;

public final class DataPreLoader$getWithRetry$2 implements g	// class@001966
{
    public final DataPreLoader b;
    public final boolean c;
    public final DataPreLoader$LoadController d;

    public void DataPreLoader$getWithRetry$2(DataPreLoader p0,boolean p1,DataPreLoader$LoadController p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getWithRetry$2.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.h(this.c, new DataPreLoader$getWithRetry$2$1(this, p0), new DataPreLoader$getWithRetry$2$2(this, p0));
       return;
    }
}
