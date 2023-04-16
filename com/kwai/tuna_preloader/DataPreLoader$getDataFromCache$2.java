package com.kwai.tuna_preloader.DataPreLoader$getDataFromCache$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DataPreLoader$getDataFromCache$2 extends Lambda implements l	// class@00195e
{
    public final l $failureCallback;
    public final boolean $invalidateCache;
    public final DataPreLoader this$0;

    public void DataPreLoader$getDataFromCache$2(DataPreLoader p0,l p1,boolean p2){
       this.this$0 = p0;
       this.$failureCallback = p1;
       this.$invalidateCache = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getDataFromCache$2.class, "1")) {
          return;
       }
       this.$failureCallback.invoke(p0);
       if (this.$invalidateCache != null) {
          this.this$0.dispose();
       }
       return;
    }
}
