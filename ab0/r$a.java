package ab0.r$a;
import com.yxcorp.gifshow.widget.m;
import ab0.r;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import ab0.r$a$a;
import ab0.s;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class r$a extends m	// class@000049
{
    public final r c;
    public final View d;

    public void r$a(r p0,View p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$a.class, "1")) {
          return;
       }
       r a = this.c.A;
       if (a != null && !a.isDisposed()) {
          PatchProxy.onMethodExit(r$a.class, "1");
          return;
       }else {
          a.A = d.a(-1188553266).jg("enable_local_intelligence_album", true).subscribe(new r$a$a(this), s.b);
          r$a tc = this.c;
          r a1 = tc.A;
          if (a1 != null) {
             tc.X7(a1);
          }
          PatchProxy.onMethodExit(r$a.class, "1");
          return;
       }
    }
}
