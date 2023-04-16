package dy9.b$e;
import erd.g;
import dy9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import crd.b;
import lnc.b9;
import qp7.d;
import qp7.b;
import br7.b;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import dy9.c;

public final class b$e implements g	// class@001ffa
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       b$e uoe = b$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "1")) {
          b9.a(this.b.x);
          if (b) {
             b = this.b.C();
             b = (b != null)? b.p(): null;
             c.c(b, 8, 250);
          }else {
             b.x = t.timer(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(this));
             b = this.b;
             b x = b.x;
             if (x != null) {
                b.j(x);
             }
          }
       }
       return;
    }
}
