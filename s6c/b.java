package s6c.b;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s7.b;
import u7.a;
import o6c.b;
import o56.a;
import android.content.Context;

public final class b implements Interceptor	// class@0023e9
{

    public void b(){
       super();
    }
    public void intercept(Chain p0){
       Application b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "chain");
          b = a.B;
          a.o(b, "AppEnv.APP");
          b.f(b, b.a(b.b));
          p0.proceed();
       }
       return;
    }
    public int supportProcess(){
       return 3;
    }
}
