package com.kwai.tuna_preloader.DataPreLoader$LoadController;
import java.lang.Object;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.kwai.tuna_preloader.DataPreLoader$LoadController$loadData$1;

public abstract class DataPreLoader$LoadController	// class@001954
{

    public void DataPreLoader$LoadController(){
       super();
    }
    public abstract void a();
    public abstract void b(l p0,l p1);
    public void c(l p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DataPreLoader$LoadController.class, "1")) {
          return;
       }
       a.p(p0, "successCallback");
       a.p(p1, "failureCallback");
       DataPreLoader$LoadController$loadData$1 loadControll = new DataPreLoader$LoadController$loadData$1(System.currentTimeMillis(), System.nanoTime(), p0);
       this.b(v0, p1);
       return;
    }
    public abstract boolean d();
}
