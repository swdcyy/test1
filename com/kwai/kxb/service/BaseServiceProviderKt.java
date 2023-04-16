package com.kwai.kxb.service.BaseServiceProviderKt;
import com.kwai.kxb.service.BaseServiceProviderKt$KxbLog$2;
import msd.a;
import qrd.p;
import qrd.s;
import ru6.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseServiceProviderKt	// class@0007e2
{
    public static final p a;

    static {
       BaseServiceProviderKt.a = s.c(BaseServiceProviderKt$KxbLog$2.INSTANCE);
    }
    public static final o a(){
       Object obj = PatchProxy.apply(null, null, BaseServiceProviderKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseServiceProviderKt.a.getValue();
    }
}
