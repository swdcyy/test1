package bc9.d;
import java.lang.Runnable;
import bc9.b;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class d implements Runnable	// class@0003e3
{
    public final b b;
    public final Animation c;

    public void d(b p0,Animation p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       b p = this.b.p;
       if (p != null) {
          p.startAnimation(this.c);
       }
       return;
    }
}
