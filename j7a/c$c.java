package j7a.c$c;
import java.lang.Runnable;
import j7a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$c implements Runnable	// class@002928
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
