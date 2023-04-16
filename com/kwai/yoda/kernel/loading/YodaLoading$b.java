package com.kwai.yoda.kernel.loading.YodaLoading$b;
import erd.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;

public final class YodaLoading$b implements g	// class@0012a7
{
    public static final YodaLoading$b b;

    static {
       YodaLoading$b.b = new YodaLoading$b();
    }
    public void YodaLoading$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading$b.class, "1")) {
       }else {
          b.b.g("Clear loading package");
       }
       return;
    }
}
