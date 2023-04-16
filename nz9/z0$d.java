package nz9.z0$d;
import nz9.u1$c;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import os7.a;
import java.lang.Boolean;
import java.util.Objects;
import pp7.b;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public class z0$d implements u1$c	// class@00325b
{
    public final z0 a;

    public void z0$d(z0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, z0$d.class, "1")) {
          return;
       }
       a uoa = this.a.E();
       Boolean tRUE = Boolean.TRUE;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(tRUE, uoa, a.class, "26")) {
          uoa.m.f(tRUE);
       }
       return;
    }
    public View b(){
       Object obj = PatchProxy.apply(null, this, z0$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.z();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, z0$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.o0();
    }
}
