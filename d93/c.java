package d93.c;
import d93.b;
import d93.a;
import java.lang.Object;
import java.util.LinkedHashMap;
import gq3.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import d93.c$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.live.service.ServiceProvider;
import androidx.lifecycle.LifecycleOwner;
import ip3.a;
import java.util.Objects;
import java.lang.IllegalStateException;

public final class c implements b, a	// class@0024bf
{
    public final Map a;
    public final a b;

    public void c(){
       super();
       this.a = new LinkedHashMap();
       a uoa = new a();
       uoa.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       this.b = uoa;
    }
    public Object a(Class p0){
       c$a obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.a.get(p0);
       if (obj == null) {
          throw new IllegalArgumentException("inject unknown service ["+p0+']');
       }
       if (obj.b()) {
          throw new IllegalArgumentException('['+p0+"] registered as ServiceProvider, so can not call get"+" directly, user getHolder instead");
       }
       Object obj1 = obj.a();
       if (obj1 != null) {
          return obj1;
       }
       throw new IllegalArgumentException('['+p0+"] registered as ServiceProvider,"+" so can not call get directly, user getHolder instead");
    }
    public Object b(Class p0){
       c$a obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.a.get(p0);
       if (obj == null) {
          return null;
       }
       if (!obj.b()) {
          return obj.a();
       }
       throw new IllegalArgumentException('['+p0+"] registered as ServiceProvider, so can not call "+"getOptional directly, user getHolder instead");
    }
    public void c(Class p0,ServiceProvider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "clazz");
       a.p(p1, "provider");
       this.f(p0);
       c$a uoa = new c$a(null);
       uoa.c(p1);
       this.a.put(p0, uoa);
       return;
    }
    public void d(Class p0,Object p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       a.p(p0, "clazz");
       a.p(p1, "service");
       this.f(p0);
       c$a uoa = new c$a(p1);
       ServiceProvider serviceProvi = PatchProxy.applyOneRefs(p1, this, uoc, "4");
       if (serviceProvi != PatchProxyResult.class) {
       }else {
          serviceProvi = new ServiceProvider();
          serviceProvi.b(this.b, p1);
       }
       uoa.c(serviceProvi);
       this.a.put(p0, uoa);
       return;
    }
    public a e(Class p0){
       c$a obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.a.get(p0);
       if (obj == null) {
          throw new IllegalArgumentException("inject unknown service ["+p0+']');
       }
       c$a b = obj.b;
       Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.live.service.ServiceHolder<T>");
       return b;
    }
    public final void f(Class p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (!this.a.containsKey(p0)) {
          return;
       }
       throw new IllegalStateException("service ["+p0+"] already existed");
    }
}
