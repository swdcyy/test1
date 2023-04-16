package d32.v;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import crd.b;
import lnc.b9;
import yb7.p;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.t;
import ry1.b;
import d32.t;
import erd.g;

public class v extends f	// class@00243d
{
    public a0 K;
    public long L;
    public b M;
    public static long N = 0x1388;
    public static String sLivePresenterClassName = "LiveAudienceAnnounceInsertPresenter";

    public void v(){
       super();
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, v.class, "3")) {
          return;
       }
       b9.a(this.M);
       p.c(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "2")) {
          return;
       }
       this.M = this.K.b3.W().subscribe(new t(this));
       return;
    }
}
