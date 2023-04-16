package nz9.p;
import erd.g;
import nz9.z0;
import java.lang.Object;
import d0a.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nz9.u1;
import android.view.View;
import qp7.b;

public final class p implements g	// class@00323d
{
    public final z0 b;

    public void p(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "47")) {
       }else if(p0.a == tb.u && (tb.B == null || (!tb.o0() || (!tb.D0() || tb.B.c())))){
          tb.B.d();
          tb.B.e(tb.z());
       }
       return;
    }
}
