package com.yxcorp.login.logger.AccountLoggerInterceptor;
import okhttp3.Interceptor;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.d;
import okio.b;
import okhttp3.MediaType;
import java.lang.Boolean;
import java.lang.Character;
import okhttp3.HttpUrl;
import java.net.URL;
import com.yxcorp.login.logger.AccountLoggerInterceptor$ApiDetail;
import fg6.a;
import com.google.gson.Gson;
import o1d.g;
import k2b.u1;

public class AccountLoggerInterceptor implements Interceptor	// class@001390
{
    public final ImmutableList a;
    public static final Charset b;

    static {
       AccountLoggerInterceptor.b = Charset.forName("UTF-8");
    }
    public void AccountLoggerInterceptor(){
       super();
       String[] stringArray = new String[0];
       this.a = ImmutableList.of("/rest/n/user/login/preCheck", "/rest/n/user/login/mobile", "/rest/n/user/register/mobileV2", "/rest/n/user/password/reset", "/rest/user/thirdPlatformLogin", "/rest/n/user/login/token", "/rest/n/user/login/oldMobile", "/rest/n/user/login/oldEmail", "/rest/n/user/mobile/checker", "/rest/n/user/login/switchUser", "/rest/n/user/login/batchLogout", "/rest/n/user/login/switchUserLogout", stringArray);
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = this;
       Response obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AccountLoggerInterceptor uAccountLogg = AccountLoggerInterceptor.class;
       Request obj2 = PatchProxy.applyOneRefs(obj1, obj, uAccountLogg, "3");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = p0.request();
       obj1 = obj1.proceed(obj2);
       ResponseBody responseBody = obj1.body();
       long l = responseBody.contentLength();
       if (HttpHeaders.hasBody(obj1)) {
          d uod = responseBody.source();
          uod.request(Long.MAX_VALUE);
          b uob = uod.buffer();
          Charset b = AccountLoggerInterceptor.b;
          MediaType mediaType = responseBody.contentType();
          if (mediaType != null) {
             try{
                b = mediaType.charset(b);
             }catch(java.nio.charset.UnsupportedCharsetException e0){
                return obj1;
             }
          }
          try{
             String[] obj3 = PatchProxy.applyOneRefs(uob, null, uAccountLogg, "4");
             boolean b1 = false;
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else {
                b uob1 = new b();
                b uob2 = 64;
                long l1 = (uob.p() - uob2 < 0)? uob.p(): uob2;
                uob.f(uob1, 0, l1);
                uAccountLogg = null;
                while (true) {
                   if (uAccountLogg >= 16 || uob1.exhausted()) {
                      b1 = true;
                      break ;
                   }else {
                      int i = uob1.readUtf8CodePoint();
                      if (!Character.isISOControl(i) || Character.isWhitespace(i)) {
                         int i1 = uAccountLogg + 1;
                      }
                   }
                }
             }
             if (!b1) {
                return obj1;
             }else if(l - null){
                try{
                   String path = obj2.url().url().getPath();
                   if (obj.a.contains(path)) {
                      path = a.a.q(new AccountLoggerInterceptor$ApiDetail(obj, path, obj2.url().host(), uob.c().readString(b)));
                      obj3 = new String[]{"’ ∫≈»’÷æ"};
                      g.c(path, obj3);
                      u1.R("account_api_log", path, 13);
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }catch(java.io.EOFException e0){
          }
       }
    }
}
