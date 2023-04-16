package com.yxcorp.gifshow.growth.test.network.GrowthTestPathRouterInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import vma.b;
import okhttp3.HttpUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import yqa.a;
import kotlin.jvm.internal.a;
import okhttp3.Request$Builder;

public class GrowthTestPathRouterInterceptor implements Interceptor	// class@0011a6
{
    public final String a;
    public final String b;
    public final String c;

    public void GrowthTestPathRouterInterceptor(){
       super();
       this.a = "/rest/n/user/login/email";
       this.b = "/rest/nebula/user/login/email";
       this.c = "http://user-inner.test.gifshow.com/rest/inner/loginByEmail";
    }
    public Response intercept(Interceptor$Chain p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthTestPathRouterInterceptor growthTestPa = GrowthTestPathRouterInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, growthTestPa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = p0.request();
          if (b.b) {
             String obj1 = PatchProxy.applyOneRefs(obj, this, growthTestPa, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                Object obj2 = null;
                if (obj == null) {
                   obj = obj2;
                }else {
                   obj1 = obj.url().encodedPath();
                   if (!TextUtils.x(obj1) && (obj1.contains("/rest/n/user/login/email") || obj1.contains("/rest/nebula/user/login/email"))) {
                      obj1 = obj.url().toString();
                      int i = obj1.indexOf("?");
                      String str = "http://user-inner.test.gifshow.com/rest/inner/loginByEmail";
                      if (i > 0) {
                         str = obj1.replace(obj1.substring(0, i), str);
                      }
                      obj1 = "#replaceUrl : "+obj1+"\n==> "+str;
                      if (!PatchProxy.applyVoidOneRefs(obj1, obj2, a.class, "1")) {
                         a.p(obj1, "msg");
                      }
                      obj = obj.newBuilder().url(str).build();
                   }
                }
             }
          }
          return p0.proceed(obj);
       }catch(java.lang.Exception e0){
       }
    }
}
