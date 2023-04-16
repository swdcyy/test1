package ed1.d;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ed1.e;
import lp3.c;
import lp3.e;
import brd.t;
import ed1.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d extends c	// class@0020e9
{
    public int p;
    public long q;
    public e r;
    public e s;
    public static String sLivePresenterClassName = "LiveAudiencePayBulletNoticePresenter";

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       e uoe = this.r.a(e.class);
       this.s = uoe;
       uoe.ji().subscribe(new b(this));
       return;
    }
    public void J8(){
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
