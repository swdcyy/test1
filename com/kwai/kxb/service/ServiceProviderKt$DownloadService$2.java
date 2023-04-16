package com.kwai.kxb.service.ServiceProviderKt$DownloadService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ru6.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.KxbManager;
import gu6.k;

public final class ServiceProviderKt$DownloadService$2 extends Lambda implements a	// class@0007ea
{
    public static final ServiceProviderKt$DownloadService$2 INSTANCE;

    static {
       ServiceProviderKt$DownloadService$2.INSTANCE = new ServiceProviderKt$DownloadService$2();
    }
    public void ServiceProviderKt$DownloadService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final n invoke(){
       Object obj = PatchProxy.apply(null, this, ServiceProviderKt$DownloadService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbManager.g.d().e;
    }
}
