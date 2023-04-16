package ata.d$d;
import java.lang.Runnable;
import ata.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$d implements Runnable	// class@0002fa
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$d.class, "1")) {
          return;
       }
       this.b.d();
       return;
    }
}
