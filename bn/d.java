package bn.d;
import brd.t;
import android.view.View;
import brd.y;
import an.a;
import bn.d$a;
import crd.b;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class d extends t	// class@00029c
{
    public final View b;

    public void d(View p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       if (!a.a(p0)) {
          return;
       }
       d$a uoa = new d$a(this.b, p0);
       p0.onSubscribe(uoa);
       this.b.getViewTreeObserver().addOnGlobalLayoutListener(uoa);
       return;
    }
}
