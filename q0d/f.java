package q0d.f;
import q0d.h;
import com.yxcorp.image.network.c;
import java.lang.Object;
import okhttp3.OkHttpClient;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.network.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient$Builder;
import com.yxcorp.image.network.CookieAppendInterceptor;
import java.util.Set;
import com.yxcorp.image.network.CronetParameterInterceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import java.util.concurrent.TimeUnit;
import okhttp3.EventListener$Factory;
import com.yxcorp.image.network.b;

public class f implements h	// class@00221a
{
    public final Set a;
    public final int b;
    public final int c;
    public final int d;
    public final OkHttpClient$Builder e;
    public final boolean f;
    public OkHttpClient g;

    public void f(c p0,boolean p1){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p1;
    }
    public synchronized OkHttpClient get(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       f obj = PatchProxy.apply(null, this, uof, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.g == null) {
          this.e.addInterceptor(new ConvertToIOExceptionInterceptor());
          this.e.addInterceptor(new CookieAppendInterceptor(this.a));
          if (this.f != null) {
             this.e.addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor());
          }
          obj = this.b;
          if (obj > null) {
             this.e.connectTimeout((long)obj, TimeUnit.MILLISECONDS);
          }
          obj = this.c;
          if (obj > null) {
             this.e.readTimeout((long)obj, TimeUnit.MILLISECONDS);
          }
          obj = this.d;
          if (obj > null) {
             this.e.writeTimeout((long)obj, TimeUnit.MILLISECONDS);
          }
          obj = this.e;
          b uob = PatchProxy.apply(null, null, uof, "2");
          if (uob != patchProxyRe) {
          }else {
             uob = b.a;
          }
          obj.eventListenerFactory(uob);
          this.g = this.e.build();
       }
       return this.g;
    }
}
