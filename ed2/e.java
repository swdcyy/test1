package ed2.e;
import xq5.c;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ed2.r;
import wg3.a;
import brd.t;
import ed2.b;
import erd.a;
import ed2.c;
import ed2.d;
import erd.g;
import crd.b;
import ed2.a;
import tj3.o;
import tj3.e;
import lnc.b9;
import xq5.b;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class e extends c implements c	// class@0026ff
{
    public e p;
    public LiveSlidePlayService q;
    public boolean r;
    public r s;
    public String t;
    public o u;
    public b v;
    public static String sLivePresenterClassName = "LiveAudienceFrameMetricsPresenter";

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       if (this.r != null) {
          e tq = this.q;
          if (tq != null) {
             tq.P4(this);
          label_001b :
             return;
          }
       }
       this.P8();
       goto label_001b ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (this.r != null) {
          e tq = this.q;
          if (tq != null) {
             tq.d5(this);
          label_001b :
             return;
          }
       }
       this.R8();
       goto label_001b ;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.R8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       if (this.getActivity() != null && r.d()) {
          this.s = new r(this.getActivity());
          this.v = this.s.e(a.f()).doFinally(new b(this)).subscribe(new c(this), d.b);
          a uoa = new a(this);
          this.u = uoa;
          this.p.c(uoa);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       b9.a(this.v);
       e tu = this.u;
       if (tu != null) {
          this.p.B(tu);
       }
       this.s = null;
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_LOG_REPORTER");
       this.q = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.r = this.r8("LIVE_IS_SLIDE_AVAILABLE").booleanValue();
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
