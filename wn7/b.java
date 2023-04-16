package wn7.b;
import wn7.a;
import java.lang.Object;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import cn7.f;
import java.lang.Throwable;
import sm7.l;

public class b implements a	// class@003c04
{

    public void b(){
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.p(p0, "inference");
       return;
    }
    public void b(a p0,EveExecutableAtomic p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "4")) {
          return;
       }
       a.p(p0, "inference");
       a.p(p1, "processor");
       a.p(p2, "schedulerInfo");
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "inference");
       return;
    }
    public void d(a p0,EveExecutableAtomic p1,Object p2,Throwable p3,f p4){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, b.class, "5")) {
             return;
          }
       }
       a.p(p0, "inference");
       a.p(p1, "processor");
       a.p(p4, "schedulerInfo");
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "inference");
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       a.p(p0, "inference");
       return;
    }
    public void g(a p0,l p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       a.p(p0, "inference");
       a.p(p1, "result");
       return;
    }
    public void h(a p0,EveExecutableAtomic p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p0, "inference");
       a.p(p1, "processor");
       a.p(p2, "schedulerInfo");
       return;
    }
}
