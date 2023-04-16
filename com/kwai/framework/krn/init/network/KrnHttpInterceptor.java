package com.kwai.framework.krn.init.network.KrnHttpInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import y86.s;
import com.kwai.framework.krn.init.network.tcpproxy.b;
import c96.a;
import java.lang.StringBuilder;
import java.lang.StackTraceElement;
import java.lang.Exception;
import java.util.Arrays;
import q87.c;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Call;

public class KrnHttpInterceptor implements Interceptor	// class@0015e3
{

    public void KrnHttpInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Response response;
       Request obj = PatchProxy.applyOneRefs(p0, this, KrnHttpInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = s.f(p0.request());
       try{
          response = b.e().m(obj, p0);
       }catch(java.lang.Exception e1){
          Object[] objArray = new Object[0];
          a.D().t("KrnNetwork", "intercept Exception: "+Arrays.toString(e1.getStackTrace()), objArray);
          response = null;
       }
       if (response == null) {
          return p0.proceed(obj);
       }
       if (p0 instanceof RealInterceptorChain) {
          EventListener uEventListen = p0.eventListener();
          if (uEventListen != null) {
             uEventListen.callEnd(new OkHttpClient().newCall(obj));
          }
       }
       return response;
    }
}
