package com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable$a;
import erd.g;
import java.lang.String;
import v19.d;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class AdLiveConversionObservable$a implements g	// class@0015a1
{
    public final String b;
    public final d c;

    public void AdLiveConversionObservable$a(String p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdLiveConversionObservable$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          p0.o = this.b;
          p0.o0 = this.c.c;
       }
       return;
    }
}
