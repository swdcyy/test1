package com.kwai.kxb.service.ServiceProviderKt$StatService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ru6.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.KxbManager;
import gu6.k;

public final class ServiceProviderKt$StatService$2 extends Lambda implements a	// class@0007eb
{
    public static final ServiceProviderKt$StatService$2 INSTANCE;

    static {
       ServiceProviderKt$StatService$2.INSTANCE = new ServiceProviderKt$StatService$2();
    }
    public void ServiceProviderKt$StatService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final s invoke(){
       Object obj = PatchProxy.apply(null, this, ServiceProviderKt$StatService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbManager.g.d().g;
    }
}
