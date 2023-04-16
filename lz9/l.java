package lz9.l;
import e8a.e1;
import lz9.b0;
import java.lang.Object;
import qp7.x0;
import qp7.b;
import ks7.h0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import pp7.b;

public final class l implements e1	// class@002ee2
{
    public final b0 a;

    public void l(b0 p0){
       this.a = p0;
    }
    public final void a(float p0){
       h0 oh0 = this.a.E();
       Objects.requireNonNull(oh0);
       h0 oh01 = h0.class;
       if (!PatchProxy.isSupport(oh01) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), oh0, oh01, "17")) {
          oh0.k.f(Float.valueOf(p0));
       }
       return;
    }
}
