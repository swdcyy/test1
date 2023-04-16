package gg0.g;
import java.lang.Runnable;
import gg0.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements Runnable	// class@0024d7
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       tb.j = tb.j + 1;
       tb.q(tb.h());
       return;
    }
}
