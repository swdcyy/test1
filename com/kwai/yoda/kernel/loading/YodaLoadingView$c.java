package com.kwai.yoda.kernel.loading.YodaLoadingView$c;
import java.util.concurrent.Callable;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wy7.c;
import qrd.l1;

public final class YodaLoadingView$c implements Callable	// class@0012ad
{
    public final YodaLoadingView b;

    public void YodaLoadingView$c(YodaLoadingView p0){
       this.b = p0;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, YodaLoadingView$c.class, "1")) {
       }else {
          this.b.b(null);
          this.b.setLoadingBgColor(null);
          this.b.a(null, 40);
          this.b.d();
       }
       return l1.a;
    }
}
