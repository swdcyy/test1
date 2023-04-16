package com.yxcorp.gifshow.nearby.common.NearbyRequestLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import mrb.b;
import java.util.List;
import mrb.a;
import kotlin.jvm.internal.a;
import q87.c;
import java.lang.Throwable;

public class NearbyRequestLogInterceptor implements Interceptor	// class@0020e0
{

    public void NearbyRequestLogInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, NearbyRequestLogInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       Response response = p0.proceed(obj);
       String path = obj.url().url().getPath();
       if (b.a.contains(path) && !PatchProxy.applyVoidOneRefs(path, null, b.class, "2")) {
          Object[] objArray = new Object[0];
          a.C().t("nearby_request_net", a.C(path, "_success"), objArray);
       }
    label_005a :
       return response;
    }
}
