package v97.a;
import xa7.a;
import com.kwai.middleware.leia.response.LeiaApiError;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.net.response.AzerothApiError;
import com.kwai.middleware.azeroth.net.response.AzerothApiError$a;
import crd.b;

public abstract class a extends a	// class@003a6f
{

    public void a(){
       super();
    }
    public final void c(LeiaApiError p0){
       a.q(p0, "e");
       this.f(AzerothApiError.Companion.a(p0));
    }
    public final void d(){
    }
    public final void e(Object p0){
       this.h(p0);
    }
    public abstract void f(AzerothApiError p0);
    public void g(b p0){
       a.q(p0, "d");
    }
    public abstract void h(Object p0);
    public final void onSubscribe(b p0){
       a.q(p0, "d");
       super.onSubscribe(p0);
       this.g(p0);
    }
}
