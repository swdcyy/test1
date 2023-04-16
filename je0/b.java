package je0.b;
import java.lang.Runnable;
import android.view.View;
import android.view.animation.Interpolator;
import msd.p;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.Scroller;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class b implements Runnable	// class@002b44
{
    public final Scroller b;
    public int c;
    public int d;
    public int e;
    public final View f;
    public final p g;
    public final a h;

    public void b(View p0,Interpolator p1,p p2,a p3){
       a.p(p0, "view");
       a.p(p1, "interpolator");
       a.p(p2, "onMove");
       a.p(p3, "onMoveDone");
       super();
       this.f = p0;
       this.g = p2;
       this.h = p3;
       this.b = new Scroller(p0.getContext(), p1);
       this.c = 250;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.b.computeScrollOffset()) {
          int currX = this.b.getCurrX();
          int currY = this.b.getCurrY();
          this.g.invoke(Integer.valueOf((currX - this.d)), Integer.valueOf((currY - this.e)));
          this.f.post(this);
          this.d = currX;
          this.e = currY;
       }else {
          this.f.removeCallbacks(this);
          this.h.invoke();
       }
       return;
    }
}
