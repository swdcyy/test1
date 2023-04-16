package je0.c;
import java.lang.Runnable;
import je0.a;
import java.lang.Object;
import android.widget.Scroller;
import android.view.View;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c implements Runnable	// class@002b45
{
    public final Scroller b;
    public final a c;
    public int d;
    public int e;
    public int f;

    public void c(a p0){
       super();
       this.d = 250;
       this.c = p0;
       this.b = new Scroller(p0.getView().getContext(), new LinearInterpolator());
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (this.b.computeScrollOffset()) {
          int currX = this.b.getCurrX();
          int currY = this.b.getCurrY();
          this.c.h(this.e, this.f, currX, currY);
          this.c.getView().post(this);
          this.e = currX;
          this.f = currY;
       }else {
          this.c.getView().removeCallbacks(this);
          this.c.a();
       }
       return;
    }
}
