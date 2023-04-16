package bn.c;
import brd.t;
import android.view.View;
import brd.y;
import an.a;
import bn.c$a;
import crd.b;
import android.view.View$OnClickListener;

public final class c extends t	// class@00029a
{
    public final View b;

    public void c(View p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       if (!a.a(p0)) {
          return;
       }
       c$a uoa = new c$a(this.b, p0);
       p0.onSubscribe(uoa);
       this.b.setOnClickListener(uoa);
       return;
    }
}
