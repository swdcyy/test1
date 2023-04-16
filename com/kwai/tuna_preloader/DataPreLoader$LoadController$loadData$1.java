package com.kwai.tuna_preloader.DataPreLoader$LoadController$loadData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.System;

public final class DataPreLoader$LoadController$loadData$1 extends Lambda implements l	// class@001953
{
    public final long $requestNanoTime;
    public final long $requestWallTime;
    public final l $successCallback;

    public void DataPreLoader$LoadController$loadData$1(long p0,long p1,l p2){
       this.$requestWallTime = p0;
       this.$requestNanoTime = p1;
       this.$successCallback = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$LoadController$loadData$1.class, "1")) {
          return;
       }
       ResultWrapper resultWrappe = new ResultWrapper(p0);
       resultWrappe.setRequestWallTime(this.$requestWallTime);
       resultWrappe.setRequestNanoTime(this.$requestNanoTime);
       resultWrappe.setResponseWallTime(System.currentTimeMillis());
       resultWrappe.setResponseNanoTime(System.nanoTime());
       this.$successCallback.invoke(resultWrappe);
       return;
    }
}
