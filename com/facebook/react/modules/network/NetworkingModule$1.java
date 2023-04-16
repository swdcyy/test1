package com.facebook.react.modules.network.NetworkingModule$1;
import okhttp3.Interceptor;
import com.facebook.react.modules.network.NetworkingModule;
import java.lang.String;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import qe.g;
import okhttp3.ResponseBody;
import com.facebook.react.modules.network.NetworkingModule$1$a;
import qe.f;
import okhttp3.Response$Builder;

public class NetworkingModule$1 implements Interceptor	// class@0012c4
{
    public final String a;
    public final DeviceEventManagerModule$RCTDeviceEventEmitter b;
    public final int c;
    public final NetworkingModule d;

    public void NetworkingModule$1(NetworkingModule p0,String p1,DeviceEventManagerModule$RCTDeviceEventEmitter p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NetworkingModule$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Response response = p0.proceed(p0.request());
       return response.newBuilder().body(new g(response.body(), new NetworkingModule$1$a(this))).build();
    }
}
