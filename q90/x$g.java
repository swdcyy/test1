package q90.x$g;
import java.lang.Runnable;
import q90.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class x$g implements Runnable	// class@0029b0
{
    public final x b;
    public final boolean c;

    public void x$g(x p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, x$g.class, "1")) {
          return;
       }
       this.b.R8(this.c);
       return;
    }
}
