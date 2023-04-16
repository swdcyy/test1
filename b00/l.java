package b00.l;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient$Builder;
import yid.e;
import b00.j;
import za6.b;
import com.yxcorp.retrofit.c$a;
import b00.k;
import ta6.e;

public class l extends g	// class@000233
{
    public boolean a;
    public int b;

    public void l(RouteType p0,z p1,boolean p2){
       super(p0, p1, p2, 10);
    }
    public void l(RouteType p0,z p1,boolean p2,int p3){
       super(p0, p1);
       this.a = true;
       this.b = 10;
       this.a = p2;
       this.b = p3;
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createOkHttpClientBuilderWithInterceptors(new ArrayList(), this.b).build();
    }
    public e buildCommonParams(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return new j();
       }
       return new b();
    }
    public c$a buildParams(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return new k();
       }
       return new e();
    }
}
