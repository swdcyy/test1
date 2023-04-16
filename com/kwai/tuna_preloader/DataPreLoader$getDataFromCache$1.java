package com.kwai.tuna_preloader.DataPreLoader$getDataFromCache$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class DataPreLoader$getDataFromCache$1 extends Lambda implements l	// class@00195d
{
    public final boolean $invalidateCache;
    public final l $successCallback;
    public final DataPreLoader this$0;

    public void DataPreLoader$getDataFromCache$1(DataPreLoader p0,l p1,boolean p2){
       this.this$0 = p0;
       this.$successCallback = p1;
       this.$invalidateCache = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$getDataFromCache$1.class, "1")) {
          return;
       }
       a.p(p0, "resultWrapper");
       p0.setFromCache(true);
       this.$successCallback.invoke(p0);
       if (this.$invalidateCache != null) {
          this.this$0.dispose();
       }
       return;
    }
}
