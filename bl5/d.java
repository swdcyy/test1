package bl5.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bl5.g;
import java.lang.Object;
import bl5.f;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class d implements ViewTreeObserver$OnGlobalLayoutListener	// class@0004cf
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void onGlobalLayout(){
       d tb = this.b;
       tb.t.post(new f(tb));
    }
}
