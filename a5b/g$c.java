package a5b.g$c;
import java.lang.Runnable;
import a5b.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import j8c.b;
import brd.t;
import a5b.a;
import t45.d;
import brd.z;
import a5b.g$c$a;
import a5b.g$c$b;
import erd.g;
import crd.b;

public final class g$c implements Runnable	// class@000051
{
    public final g b;
    public final String c;

    public void g$c(g p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "1")) {
          return;
       }
       b.d("MagicSearchDataManager", "real start search "+this.c);
       g$c tb = this.b;
       tb.d = tb.e.a(this.c, 0).observeOn(d.a).subscribe(new g$c$a(this), new g$c$b(this));
       return;
    }
}
