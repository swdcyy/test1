package nz9.k;
import erd.g;
import nz9.z0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf5.u;
import qp7.x0;
import qp7.b;
import os7.a;
import java.lang.Boolean;
import pp7.b;

public final class k implements g	// class@00322e
{
    public final z0 b;

    public void k(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "32")) {
       }else if(tb.T.v()){
          p0 = tb.E();
          Boolean uBoolean = Boolean.valueOf(tb.F0());
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uBoolean, p0, a.class, "22")) {
             p0.A.f(uBoolean);
          }
       }
       return;
    }
}
