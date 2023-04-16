package xa7.a;
import brd.y;
import java.lang.Object;
import com.kwai.middleware.leia.response.LeiaApiError;
import wb7.a;
import java.lang.Throwable;
import crd.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import retrofit2.HttpException;
import com.google.gson.JsonObject;
import nsd.u;
import xa7.c;
import xa7.b;

public abstract class a implements y	// class@003ca4
{
    public b b;

    public void a(){
       super();
    }
    public final void a(LeiaApiError p0){
       this.c(p0);
       return;
    }
    public final b b(){
       a tb = this.b;
       if (tb == null) {
          a.S("disposable");
       }
       return tb;
    }
    public abstract void c(LeiaApiError p0);
    public void d(){
    }
    public abstract void e(Object p0);
    public final void onComplete(){
       this.d();
       return;
    }
    public final void onError(Throwable p0){
       a.q(p0, "e");
       if (p0 instanceof HttpException) {
          String str = p0.message();
          a.h(str, "e.message\(\)");
          LeiaApiError leiaApiError = new LeiaApiError("HTTP", p0.code(), str, 0, null, null, null, 120, null);
          this.a(v0);
       }else if(p0 instanceof LeiaApiError){
          this.a(p0);
       }else {
          LeiaApiError leiaApiError1 = new LeiaApiError("REQUEST", 0, null, 0, null, null, p0, 62, null);
          this.a(v10);
       }
       return;
    }
    public void onNext(Object p0){
       a.q(p0, "result");
       p0 = p0.data;
       if (p0 == null) {
          p0 = new b();
       }
       this.e(p0);
       return;
    }
    public void onSubscribe(b p0){
       a.q(p0, "d");
       this.b = p0;
    }
}
