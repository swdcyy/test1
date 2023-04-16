package ej2.o;
import k51.c;
import java.lang.Object;
import ej2.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ej2.o$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import ej2.p;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import lf3.g;
import mq5.h;
import mq5.b;
import ekd.k1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class o extends c	// class@002736
{
    public final Object p;
    public m q;
    public a0 r;
    public LiveActivityPopupDialog s;
    public g t;
    public final h u;
    public static String sLivePresenterClassName = "LiveScoreRankAudiencePopupPresenter";

    public void o(){
       super();
       this.p = new Object();
       this.u = new m(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       o tr = this.r;
       if (tr != null && tr.h != null) {
          tr.y2.P4(new o$a(this));
       }else {
          this.R8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "6")) {
          return;
       }
       this.S8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       x.E(this.s);
       this.s = null;
       return;
    }
    public void R8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "5")) {
          if (this.t == null) {
             this.t = new p(this);
          }
          this.q.u().u0(510, SCActionSignal.class, this.t);
       }
       this.r.D2.Km(this.u);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       this.P8();
       this.q.u().o(510, this.t);
       this.r.D2.le(this.u);
       k1.n(this.p);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, o.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.q8(a0.class);
       return;
    }
}
