package be9.d$c;
import java.lang.Runnable;
import be9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$c implements Runnable	// class@00047b
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       this.b.h2();
       return;
    }
}
