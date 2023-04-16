package goa.g;
import java.lang.Runnable;
import goa.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements Runnable	// class@002b43
{
    public final d b;

    public void g(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
}
