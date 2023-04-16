package a2c.h;
import java.lang.Runnable;
import gx5.h;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h implements Runnable	// class@000043
{
    public final h b;
    public final Throwable c;

    public void h(h p0,Throwable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "1")) {
          return;
       }
       this.b.e(this.c);
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
}
