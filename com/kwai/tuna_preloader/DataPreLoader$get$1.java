package com.kwai.tuna_preloader.DataPreLoader$get$1;
import io.reactivex.g;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader$get$1$1;
import com.kwai.tuna_preloader.DataPreLoader$get$1$2;
import msd.l;

public final class DataPreLoader$get$1 implements g	// class@00195c
{
    public final DataPreLoader b;
    public final boolean c;

    public void DataPreLoader$get$1(DataPreLoader p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$get$1.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.h(this.c, new DataPreLoader$get$1$1(this, p0), new DataPreLoader$get$1$2(this, p0));
       return;
    }
}
