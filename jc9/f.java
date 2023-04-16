package jc9.f;
import erd.g;
import jc9.j;
import java.lang.Object;
import lm6.j;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@00293e
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j q = this.b.q;
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidOneRefs(p0, q, b0.class, "7")) {
       }else {
          q.c();
       }
       return;
    }
}
