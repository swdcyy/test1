package com.kwai.framework.network.keyconfig.degrade.DegradeConfigDecryptInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wkd.b;
import pb6.i;

public final class DegradeConfigDecryptInterceptor implements Interceptor	// class@0017f2
{

    public void DegradeConfigDecryptInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DegradeConfigDecryptInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       return b.a(0x267abf37).a(p0);
    }
}
