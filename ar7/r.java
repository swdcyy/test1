package ar7.r;
import rq7.a;
import jh5.a;
import pp7.a;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pp7.b;

public final class r extends a	// class@00035c
{
    public final a d;

    public void r(){
       super(null);
    }
    public void r(a p0){
       super();
       this.d = new a(p0);
    }
    public final void g(CoCreateInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       a.p(p0, "info");
       this.d.f(p0);
       return;
    }
}
