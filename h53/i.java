package h53.i;
import oq5.c;
import h53.c;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import h53.i$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class i implements c	// class@002c65
{
    public final c b;

    public void i(c p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       i tb = this.b;
       c b = tb.B;
       if (b != null && p0.orientation == 1) {
          tb.X7(t.just(b).delaySubscription(500, TimeUnit.MILLISECONDS, d.a).subscribe(new i$a(this)));
       }
       return;
    }
}
