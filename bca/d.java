package bca.d;
import erd.a;
import bca.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class d implements a	// class@000467
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       tb.g = null;
       tb.f = null;
       tb.i.clear();
       return;
    }
}
