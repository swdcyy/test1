package bn.b;
import brd.t;
import android.view.View;
import brd.y;
import an.a;
import bn.b$a;
import crd.b;
import android.view.View$OnAttachStateChangeListener;

public final class b extends t	// class@000298
{
    public final boolean b;
    public final View c;

    public void b(View p0,boolean p1){
       super();
       this.c = p0;
       this.b = p1;
    }
    public void subscribeActual(y p0){
       if (!a.a(p0)) {
          return;
       }
       b$a uoa = new b$a(this.c, this.b, p0);
       p0.onSubscribe(uoa);
       this.c.addOnAttachStateChangeListener(uoa);
       return;
    }
}
