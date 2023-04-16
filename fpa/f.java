package fpa.f;
import java.lang.Runnable;
import fpa.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fpa.d;
import com.kwai.library.widget.popup.common.c;

public final class f implements Runnable	// class@0029b5
{
    public final h b;

    public void f(h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       d e = this.b.b.e;
       if (e != null) {
          e.o();
       }
       return;
    }
}
