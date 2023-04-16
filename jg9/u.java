package jg9.u;
import java.lang.Runnable;
import jg9.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class u implements Runnable	// class@002ab9
{
    public final s b;

    public void u(s p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.b.r();
       return;
    }
}
