package dja.a$c;
import java.lang.Runnable;
import dja.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$c implements Runnable	// class@0024b8
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.b.s0();
       this.b.q0();
       return;
    }
}
