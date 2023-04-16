package com.kwai.yoda.kernel.loading.YodaLoading$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;

public final class YodaLoading$c implements g	// class@0012a8
{
    public static final YodaLoading$c b;

    static {
       YodaLoading$c.b = new YodaLoading$c();
    }
    public void YodaLoading$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading$c.class, "1")) {
       }else {
          b.b.f(p0);
       }
       return;
    }
}
