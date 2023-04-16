package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$b;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.lang.Object;
import fna.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fna.j$e;

public final class GrowthCleanerService$b implements g	// class@001337
{
    public final GrowthCleanerService b;

    public void GrowthCleanerService$b(GrowthCleanerService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerService$b.class, "1")) {
       }else {
          RxBus.f.b(p0);
          if (p0 instanceof j$e) {
             p0.d = false;
          }
       }
       return;
    }
}
