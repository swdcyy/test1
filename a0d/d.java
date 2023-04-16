package a0d.d;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import jb6.b;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import yid.e;
import a0d.c;
import com.yxcorp.retrofit.c$a;
import a0d.e;

public class d extends g	// class@000009
{
    public RouteType a;

    public void d(RouteType p0,z p1){
       super(p0, p1);
       this.a = p0;
    }
    public String buildBaseUrl(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(this.a)+"/";
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createOkHttpClientBuilder(10).build();
    }
    public e buildCommonParams(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public c$a buildParams(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
