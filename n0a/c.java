package n0a.c;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import java.lang.Integer;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.fragments.milano.commonfeedslide.network.CommonFeedSlideRequestLogInterceptor;
import java.util.List;

public class c extends g	// class@0030ae
{

    public void c(RouteType p0,z p1){
       super(p0, p1);
    }
    public String buildBaseUrl(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.buildBaseUrl();
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createOkHttpClientBuilder(10).build();
    }
    public OkHttpClient$Builder createOkHttpClientBuilder(int p0){
       ArrayList obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(new CommonFeedSlideRequestLogInterceptor());
       return super.createOkHttpClientBuilderWithInterceptors(obj, p0);
    }
}
