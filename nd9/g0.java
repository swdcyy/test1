package nd9.g0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import nd9.n0;
import java.lang.Runnable;
import java.lang.Object;

public final class g0 implements ViewTreeObserver$OnGlobalLayoutListener	// class@00313d
{
    public final n0 b;
    public final Runnable c;

    public void g0(n0 p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onGlobalLayout(){
       this.b.i2();
       this.c.run();
    }
}
