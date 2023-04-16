package a2c.i;
import java.lang.Runnable;
import gx5.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements Runnable	// class@000044
{
    public final h b;

    public void i(h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.b.f();
       return;
    }
}
