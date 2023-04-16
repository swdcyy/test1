package c31.d;
import k51.c;
import dk2.b;
import c31.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import oq5.c;
import jv1.b;
import tkd.b;
import tkd.d;
import ym5.a;
import rkd.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import qka.b;
import wkd.b;
import dk2.a;
import dk2.a$a;
import gq5.c;
import gq5.f;

public class d extends c	// class@00045f
{
    public a0 p;
    public final b q;
    public a$a r;
    public c s;
    public final c t;
    public static String sLivePresenterClassName = "LiveAudienceLandscapeTopStatusBarOptimizePresenter";

    public void d(){
       super();
       this.q = new b();
       this.t = new c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p.x.W0(this.t, true);
       if (d.a(0x4c5dd1b8).f2() && (b.e() && this.getActivity() != null)) {
          b.a(this.getActivity().getWindow());
       }
    label_003c :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.x.Q0(this.t);
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       if (this.r != null) {
          b.a(0x4bf3ccd7).f(this.r);
          this.r = null;
       }
       d ts = this.s;
       if (ts != null) {
          this.p.g2.l(ts);
          this.s = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
