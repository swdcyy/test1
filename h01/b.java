package h01.b;
import u07.u;
import java.lang.Runnable;
import java.lang.Object;
import u07.t;
import android.view.View;

public final class b implements u	// class@0025e3
{
    public final Runnable b;

    public void b(Runnable p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
