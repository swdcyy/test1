package com.kwai.kxb.service.ServiceProviderKt;
import com.kwai.kxb.service.ServiceProviderKt$DownloadService$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kxb.service.ServiceProviderKt$UpdateApiService$2;
import com.kwai.kxb.service.ServiceProviderKt$StatService$2;
import ru6.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ServiceProviderKt	// class@0007ed
{
    public static final p a;
    public static final p b;
    public static final p c;

    static {
       ServiceProviderKt.a = s.c(ServiceProviderKt$DownloadService$2.INSTANCE);
       ServiceProviderKt.b = s.c(ServiceProviderKt$UpdateApiService$2.INSTANCE);
       ServiceProviderKt.c = s.c(ServiceProviderKt$StatService$2.INSTANCE);
    }
    public static final s a(){
       Object obj = PatchProxy.apply(null, null, ServiceProviderKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceProviderKt.c.getValue();
    }
}
