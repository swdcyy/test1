package k8a.c;
import java.lang.Runnable;
import k8a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements Runnable	// class@002c19
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}