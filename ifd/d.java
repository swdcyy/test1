package ifd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ifd.b;
import ifd.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s99.d;
import v99.a;
import com.yxcorp.plugin.search.b;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import brd.t;
import xl8.b;
import ifd.c;
import erd.g;
import crd.b;
import com.yxcorp.plugin.search.b$a;

public class d extends PresenterV2	// class@001004
{
    public a p;
    public SearchResultFragment q;
    public final d r;
    public final b$a s;

    public void d(){
       super();
       this.r = new b(this);
       this.s = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p.b(this.r);
       b uob = this.q.Sh();
       if (uob != null) {
          this.X7(uob.f.observable().subscribe(new c(this)));
       }
       this.q.tb(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.o(this.r);
       this.q.ki(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("AUTO_PLAY_MANAGER");
       this.q = this.r8("FRAGMENT");
       return;
    }
}
