package com.kwai.framework.imagebase.interceptor.CdnHostInterceptor;
import okhttp3.Interceptor;
import com.kwai.framework.imagebase.interceptor.CdnHostInterceptor$a;
import nsd.u;
import java.lang.Object;
import okhttp3.Request;
import bb6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bjd.a;
import java.lang.StringBuilder;
import mjd.a;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import bb6.d;
import java.util.Map;
import bb6.c;
import bjd.d;
import bb6.c$b;
import java.util.Set;
import java.util.Iterator;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import okhttp3.HttpUrl;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;

public final class CdnHostInterceptor implements Interceptor	// class@000b5e
{
    public static final CdnHostInterceptor$a a;

    static {
       CdnHostInterceptor.a = new CdnHostInterceptor$a(null);
    }
    public void CdnHostInterceptor(){
       super();
    }
    public final void a(Request p0,b p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CdnHostInterceptor.class, "2")) {
          return;
       }
       try{
          a uoa = p1.a();
          String str = 1;
          if (uoa.b != null) {
             a.c("CdnException", "Asked to switch host. "+uoa);
          }else {
             a = uoa.a;
             int i = (a != null)? a.intValue(): 0;
             if (i < 500) {
                str = uoa.b();
             }
          }
          if (str) {
             Log.g("CdnHostInterceptor", "switch cdn host. request: "+p0+", exceptionWrapper: "+uoa);
             d uod = c.b.a();
             Iterator iterator = d.b.a().keySet().iterator();
             while (iterator.hasNext()) {
                String str1 = p0.url().host();
                a.o(str1, "request.url\(\).host\(\)");
                uod.g(iterator.next().getTypeName(), str1);
             }
          }
       }catch(java.lang.Exception e6){
          Log.d("CdnHostInterceptor", "checkRequestResult failed. "+e6);
       }
       return;
    }
    public Response intercept(Interceptor$Chain p0){
       String str = "request";
       Request obj = PatchProxy.applyOneRefs(p0, this, CdnHostInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       obj = p0.request();
       try{
          Response response = p0.proceed(obj);
          a.o(obj, str);
          this.a(obj, new b(response.code()));
          a.o(response, "response");
          return response;
       }catch(java.lang.Exception e5){
          a.o(obj, str);
          this.a(obj, new b(e5));
          throw e5;
       }
    }
}
