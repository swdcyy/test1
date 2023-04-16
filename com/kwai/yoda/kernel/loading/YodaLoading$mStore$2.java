package com.kwai.yoda.kernel.loading.YodaLoading$mStore$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import yy7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.kernel.YodaV2;
import java.util.Objects;

public final class YodaLoading$mStore$2 extends Lambda implements a	// class@0012a9
{
    public static final YodaLoading$mStore$2 INSTANCE;

    static {
       YodaLoading$mStore$2.INSTANCE = new YodaLoading$mStore$2();
    }
    public void YodaLoading$mStore$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, YodaLoading$mStore$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(YodaV2.f);
       return YodaV2.e;
    }
}
