package c2c.h$b;
import java.lang.Runnable;
import c2c.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h$b implements Runnable	// class@00050f
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
