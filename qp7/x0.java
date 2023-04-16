package qp7.x0;
import java.lang.Object;
import qp7.t0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

public abstract class x0	// class@00346e
{
    public LifecycleOwner a;
    public Context b;
    public t0 c;

    public void x0(){
       super();
    }
    public final t0 a(){
       x0 obj = PatchProxy.apply(null, this, x0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("config");
       }
       return obj;
    }
    public final Context b(){
       x0 obj = PatchProxy.apply(null, this, x0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("context");
       }
       return obj;
    }
    public final LifecycleOwner c(){
       x0 obj = PatchProxy.apply(null, this, x0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("lifecycleOwner");
       }
       return obj;
    }
    public final void d(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void e(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void f(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
