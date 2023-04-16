package fpa.g;
import java.lang.Runnable;
import fpa.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fpa.d;
import com.kwai.library.widget.popup.common.c;
import u07.t;

public final class g implements Runnable	// class@0029b6
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       d e = this.b.b.e;
       if (e != null) {
          e.Z();
       }
       return;
    }
}
