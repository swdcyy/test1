package gc9.c;
import java.lang.Runnable;
import gc9.d;
import android.graphics.drawable.Animatable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc.a;
import gc9.c$a;
import hc.b;

public final class c implements Runnable	// class@002473
{
    public final d b;
    public final Animatable c;

    public void c(d p0,Animatable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "1")) {
          return;
       }
       this.c.start();
       this.c.l(new c$a(this));
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
