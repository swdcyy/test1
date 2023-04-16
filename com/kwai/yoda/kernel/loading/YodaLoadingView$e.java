package com.kwai.yoda.kernel.loading.YodaLoadingView$e;
import erd.g;
import java.lang.Object;
import xa7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;

public final class YodaLoadingView$e implements g	// class@0012af
{
    public static final YodaLoadingView$e b;

    static {
       YodaLoadingView$e.b = new YodaLoadingView$e();
    }
    public void YodaLoadingView$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView$e.class, "1")) {
       }else {
          b.b.g("Yoda show loading success - none");
       }
       return;
    }
}
