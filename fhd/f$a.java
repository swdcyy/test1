package fhd.f$a;
import jhc.h;
import fhd.f;
import java.lang.Object;
import jhc.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jhc.f;

public final class f$a implements h	// class@000e3f
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       a.p(p0, "creator");
       this.a.h(p0);
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       a.p(p0, "creator");
       this.a.g(p0);
       return;
    }
}
