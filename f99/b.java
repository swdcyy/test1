package f99.b;
import rf5.e;
import f99.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f99.a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ge5.d;
import joc.o;
import joc.l;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import xf6.d;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.app.Activity;
import lnc.w9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;

public class b extends e	// class@0022e2
{
    public NormalDetailBizParam N;
    public t O;
    public d P;
    public l Q;
    public boolean R;
    public SwipeLayout S;
    public final o T;

    public void b(){
       super();
       this.T = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.E8();
       this.X7(this.O.subscribe(new a(this)));
       d e = this.P.e;
       this.Q = e;
       if (e != null) {
          e.g(this.T);
       }
       if (this.S != null) {
          b tN = this.N;
          if (tN != null && (tN.mFromSlidePlayPhotoClick != null && (this.u.isAtlasPhotos() || this.u.isLongPhotos()))) {
             this.S.setDirectionTriggerSensitivity(d.u());
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.F8();
       this.S = w9.c(this.G);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tQ = this.Q;
       if (tQ != null) {
          tQ.l(this.T);
       }
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(-1188553266).VA(this.G.U2(), this.u.getUserId());
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.N.mToProfilePlan.isSmooth();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.q8(NormalDetailBizParam.class);
       this.O = this.r8("DETAIL_ADJUST_EVENT");
       this.P = this.r8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
