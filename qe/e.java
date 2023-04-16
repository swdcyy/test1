package qe.e;
import java.lang.Object;
import android.content.Context;
import okhttp3.OkHttpClient;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qe.d;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import qe.i;
import okhttp3.CookieJar;
import java.security.Provider;
import java.security.Security;
import java.lang.Integer;
import java.io.File;
import okhttp3.Cache;

public class e	// class@0029c9
{
    public static OkHttpClient a;
    public static d b;

    public void e(){
       super();
    }
    public static OkHttpClient a(Context p0){
       d obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b;
       if (obj != null) {
          return obj.a();
       }
       return e.c(p0).build();
    }
    public static OkHttpClient$Builder b(){
       Object obj2;
       OkHttpClient$Builder obj = PatchProxy.apply(null, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       long l = 0;
       obj = new OkHttpClient$Builder().connectTimeout(l, mILLISECONDS).readTimeout(l, mILLISECONDS).writeTimeout(l, mILLISECONDS);
       obj = obj.cookieJar(new i());
       try{
          Security.insertProviderAt(Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
          return obj;
       }catch(java.lang.Exception e0){
          Object obj1 = PatchProxy.applyOneRefs(obj, v2, v1, "8");
          if (obj1 != e0) {
             obj2 = obj1;
          }
          return obj2;
       }
    }
    public static OkHttpClient$Builder c(Context p0){
       OkHttpClient$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoe, "6");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (PatchProxy.isSupport(uoe)) {
          uBuilder = PatchProxy.applyTwoRefs(p0, Integer.valueOf(0xa00000), obj, uoe, "7");
          if (uBuilder != patchProxyRe) {
          label_0040 :
             return uBuilder;
          }
       }
       uBuilder = e.b().cache(new Cache(new File(p0.getCacheDir(), "http-cache"), (long)0xa00000));
       goto label_0040 ;
    }
    public static OkHttpClient$Builder d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.c(p0);
    }
}
