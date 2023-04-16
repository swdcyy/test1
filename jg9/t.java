package jg9.t;
import java.lang.Runnable;
import jg9.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class t implements Runnable	// class@002ab7
{
    public final s b;

    public void t(s p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.b.r();
       return;
    }
}
