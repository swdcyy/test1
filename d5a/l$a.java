package d5a.l$a;
import java.lang.Runnable;
import d5a.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq9.a;

public final class l$a implements Runnable	// class@001e85
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "1")) {
          return;
       }
       a.e(this.b.c, "animationTime");
       a.e(this.b.c, "switchScreenCost");
       return;
    }
}
