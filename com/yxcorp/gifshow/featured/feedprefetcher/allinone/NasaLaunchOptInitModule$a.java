package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule$a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.lang.StringBuilder;
import pea.b;
import java.util.List;
import qrd.l1;

public final class NasaLaunchOptInitModule$a implements Callable	// class@000f9d
{
    public final NasaLaunchOptInitModule b;

    public void NasaLaunchOptInitModule$a(NasaLaunchOptInitModule p0){
       this.b = p0;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, NasaLaunchOptInitModule$a.class, "1")) {
       }else {
          boolean b = NasaLaunchOptManager.h();
          b.b(this.b.q, "onBackground isComplete:"+b);
          if (b) {
             this.b.o0();
          }
       }
       return l1.a;
    }
}
