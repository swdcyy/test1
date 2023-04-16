package com.kwai.tuna_preloader.DataPreLoader$a;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.tuna_preloader.DataPreLoader$b;
import com.kwai.tuna_preloader.DataPreLoader$c;

public final class DataPreLoader$a	// class@001955
{
    public DataPreLoader$b a;
    public DataPreLoader$c b;
    public final DataPreLoader$LoadController c;

    public void DataPreLoader$a(DataPreLoader$LoadController p0){
       a.p(p0, "mLoadController");
       super();
       this.c = p0;
    }
    public final DataPreLoader a(){
       Object obj = PatchProxy.apply(null, this, DataPreLoader$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DataPreLoader(this);
    }
    public final DataPreLoader$a b(DataPreLoader$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DataPreLoader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cacheController");
       this.a = p0;
       return this;
    }
    public final DataPreLoader$a c(DataPreLoader$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DataPreLoader$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "callbackController");
       this.b = p0;
       return this;
    }
}
