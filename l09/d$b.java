package l09.d$b;
import java.lang.Runnable;
import l09.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$b implements Runnable	// class@002c64
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
}
