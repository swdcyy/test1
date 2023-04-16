package ay9.p;
import erd.g;
import ay9.q;
import java.lang.Object;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import qp7.d;
import qp7.b;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import uw9.o;
import java.lang.String;
import q87.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ay9.b;

public final class p implements g	// class@000305
{
    public final q b;

    public void p(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       b9.a(tb.H);
       if (p0.booleanValue() && tb.C() != null) {
          c.c(tb.C().f, 8, 250);
          Object[] objArray = new Object[0];
          o.C().w("MerchantCommentShow", "MerchantCommentShow hide caption", objArray);
       }else {
          p0 = t.timer(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(tb));
          tb.H = p0;
          tb.j(p0);
       }
       return;
    }
}
