package com.yxcorp.gateway.pay.debug.GatewayPayDebugInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import com.yxcorp.gateway.pay.api.PayManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import okhttp3.Request$Builder;

public class GatewayPayDebugInterceptor implements Interceptor	// class@001225
{

    public void GatewayPayDebugInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, GatewayPayDebugInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       if (PayManager.getInstance().isDebug() && !TextUtils.isEmpty(PayManager.getInstance().getDebugHost())) {
          obj = obj.newBuilder().url(p0.request().url().newBuilder().host(PayManager.getInstance().getDebugHost()).build()).build();
       }
       return p0.proceed(obj);
    }
}
