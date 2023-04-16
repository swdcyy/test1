package frb.g;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import com.yxcorp.gifshow.nearby.common.NearbyRequestLogInterceptor;

public class g extends g	// class@0029dd
{

    public void g(RouteType p0,z p1){
       super(p0, p1);
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createOkHttpClientBuilder(10).build();
    }
    public Interceptor getLoggingInterceptor(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NearbyRequestLogInterceptor();
    }
}
