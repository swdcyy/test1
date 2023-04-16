package eja.s0;
import java.lang.Runnable;
import eja.o0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eja.o0;
import y99.k;

public final class s0 implements Runnable	// class@0026f3
{
    public final o0$b b;

    public void s0(o0$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, s0.class, "1")) {
          return;
       }
       o0.R8(this.b.b).a();
       return;
    }
}
