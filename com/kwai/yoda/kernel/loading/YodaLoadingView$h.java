package com.kwai.yoda.kernel.loading.YodaLoadingView$h;
import erd.g;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;

public final class YodaLoadingView$h implements g	// class@0012b2
{
    public static final YodaLoadingView$h b;

    static {
       YodaLoadingView$h.b = new YodaLoadingView$h();
    }
    public void YodaLoadingView$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoadingView$h.class, "1")) {
       }else {
          b.b.g("Yoda start show custom loading - none");
       }
       return;
    }
}
