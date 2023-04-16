package gg0.k;
import java.lang.Runnable;
import gg0.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k implements Runnable	// class@0024dd
{
    public final j b;

    public void k(j p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       k tb = this.b;
       tb.j = tb.j + 1;
       tb.q(tb.h());
       return;
    }
}
