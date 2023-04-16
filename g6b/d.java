package g6b.d;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class d	// class@002a8d
{
    public final a a;

    public void d(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<@¡­entContainerAction Int>\(\)");
       this.a = uoa;
    }
    public final void a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       this.a.onNext(Integer.valueOf(p0));
       return;
    }
}
