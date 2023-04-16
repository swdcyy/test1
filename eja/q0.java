package eja.q0;
import java.lang.Runnable;
import eja.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eja.o0$b;
import eja.o0;
import y99.k;

public final class q0 implements Runnable	// class@0026ec
{
    public final r0 b;

    public void q0(r0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       o0.R8(this.b.b.b).a();
       return;
    }
}
