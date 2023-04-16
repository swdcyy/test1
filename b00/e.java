package b00.e;
import erd.g;
import b00.f;
import oo8.o;
import java.lang.Object;
import retrofit2.p;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.network.TKNetResponse;
import okhttp3.Response;
import fg6.a;
import okhttp3.Headers;
import java.util.Map;
import com.google.gson.Gson;
import com.tachikoma.core.component.network.TKNetErrorInfo;
import java.lang.Throwable;

public final class e implements g	// class@00022c
{
    public final f b;
    public final o c;

    public void e(f p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidThreeRefs(p0, null, tc, tb, f.class, "12")) {
       }else {
          TKNetResponse tKNetRespons = new TKNetResponse();
          Response response = p0.g();
          if (response != null) {
             tKNetRespons.statusCode = response.code();
             tKNetRespons.headers = a.a.q(tb.r(response.headers()));
          }
          p0 = p0.a();
          if (p0 != null) {
             tKNetRespons.data = p0;
             tc.a(tKNetRespons, null);
          }else {
             tb.u(tc, -1000, null, "response body is null");
          }
       }
       return;
    }
}
