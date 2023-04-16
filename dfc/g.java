package dfc.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import dfc.e;
import erd.g;
import crd.b;
import lnc.b9;
import mrd.c;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class g extends PresenterV2	// class@0021a4
{
    public f p;
    public c q;
    public c r;
    public PublishSubject s;
    public b t;
    public b u;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.X7(this.q.observeOn(d.a).subscribe(new e(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       g tu = this.u;
       if (tu != null) {
          tu.dispose();
          this.u = null;
       }
       b9.a(this.t);
       this.t = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.r8("NEWS_ENTRANCE_ACTION");
       this.r = this.r8("NEWS_ENTRANCE_RESPONSE");
       this.p = this.x8("NEWS_ENTRANCE_CAN_SHOW_RED_DOT");
       this.s = this.r8("REMINDER_CAN_SHOW_LATEST_TIPS_SUBJECT");
       return;
    }
}
