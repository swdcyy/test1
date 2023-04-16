package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$c;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fna.j$f;

public final class GrowthCleanerService$c implements g	// class@001338
{
    public final GrowthCleanerService b;

    public void GrowthCleanerService$c(GrowthCleanerService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerService$c.class, "1")) {
       }else {
          RxBus.f.b(new j$f(this.b, p0));
          p0.d = false;
       }
       return;
    }
}
