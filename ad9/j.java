package ad9.j;
import ekd.f$j;
import ad9.i;
import java.lang.Runnable;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j extends f$j	// class@0000a6
{
    public final boolean a;
    public final Runnable b;
    public final long c;
    public final i d;

    public void j(i p0,boolean p1,Runnable p2,long p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.d.i(this.b, this.c);
       }
       return;
    }
}
