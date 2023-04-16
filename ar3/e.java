package ar3.e;
import com.yxcorp.retrofit.a;
import brd.z;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er3.a;
import okhttp3.OkHttpClient$Builder;
import java.lang.Integer;
import com.kuaishou.liveclient.resourcemanager.apiservices.CommonInterceptor;
import okhttp3.Interceptor;

public class e extends a	// class@0002b5
{

    public void e(z p0){
       super(p0);
    }
    public String buildBaseUrl(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.b()) {
          return "http://zt.staging.kuaishou.com";
       }
       return "http://api.kuaishouzt.com";
    }
    public OkHttpClient$Builder createOkHttpClientBuilder(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       OkHttpClient$Builder uBuilder = super.createOkHttpClientBuilder(p0);
       uBuilder.addInterceptor(new CommonInterceptor());
       return uBuilder;
    }
    public Interceptor getLoggingInterceptor(){
       return null;
    }
}
