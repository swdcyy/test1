package hb2.g;
import im8.g;
import k51.c;
import hb2.c;
import hb2.g$a;
import hb2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.kuaishou.live.core.basic.utils.e;
import xj2.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import f12.d;
import android.view.View;
import va1.n0;
import im8.a;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import gq5.c;
import gq5.f;
import hb2.a;
import oq5.c;
import jv1.b;
import java.lang.Integer;
import pb1.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import f12.c;
import hb2.d;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import hb2.e;
import java.lang.Runnable;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import hb2.p;
import hb2.n;
import ekd.m1;
import hb2.j;
import java.util.Map;
import java.util.HashMap;

public class g extends c implements g	// class@002d48
{
    public boolean A;
    public boolean B;
    public a C;
    public g$b D;
    public final c E;
    public boolean p;
    public a0 q;
    public c r;
    public a s;
    public b t;
    public View u;
    public View v;
    public View w;
    public c x;
    public View y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveBaseSideBarPendantPresenter";

    public void g(boolean p0){
       super();
       this.x = new c(this);
       this.z = true;
       this.A = true;
       this.B = false;
       this.D = new g$a(this);
       this.E = new b(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (!this.getActivity() instanceof LivePlayActivity && !e.s(this.getActivity())) {
          return;
       }
       a d = this.s.d;
       if (d != null) {
          LiveStreamFeed mLiveSideBar = d.mLiveSideBarModel;
          if (mLiveSideBar != null) {
             LiveStreamFeed$LiveSideBarModel mLiveSideTyp = mLiveSideBar.mLiveSideType;
             if (e.s(this.getActivity())) {
                this.y = this.R8().R(mLiveSideTyp);
             }else if(mLiveSideTyp == 2){
                this.y = this.getActivity().findViewById(0x7f0a303c);
             }else if(mLiveSideTyp == 5){
                this.y = this.getActivity().findViewById(0x7f0a25ba);
                View view = this.getActivity().findViewById(R.id.live_slide_square_side_bar_container_layout);
                if (view != null) {
                   view.setVisibility(0);
                }
                this.y.setTranslationX((float)n0.f());
             }
          }
       }
       if (this.y == null) {
          return;
       }else {
          this.S8();
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.W7(this.C);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       this.q.N().yj(AudienceBizRelation.FOLLOW_USER_PHOTO_FEED_PENDANT);
       this.B = false;
       this.q.g2.l(this.E);
       this.C.B();
       this.w.setVisibility(false);
       this.P8(false);
       this.t.Q0(this.x);
       return;
    }
    public final void P8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "12")) {
          return;
       }
       this.r.b(p0);
       return;
    }
    public final d R8(){
       Activity obj = PatchProxy.apply(null, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       Objects.requireNonNull(obj);
       return c.b(obj);
    }
    public void S8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "8")) {
          return;
       }
       this.t.H6(this.x);
       this.q.g2.k(this.E);
       this.q.w1.Ci(new d(this), AudienceQuitLiveCheckOrder.LIVE_SQUARE);
       this.q.N().Pj(AudienceBizRelation.FOLLOW_USER_PHOTO_FEED_PENDANT);
       if (this.B == null || (this.q.l() && !PatchProxy.applyVoid(objArray, this, og, "7"))) {
          this.v.postDelayed(new e(this), 1000);
       }
    label_0056 :
       return;
    }
    public void V8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "6")) {
          return;
       }
       if (p0) {
          this.w.setVisibility(0);
          if (this.B == null) {
             if (this.z != null) {
                this.C.y();
             }else {
                this.C.B();
             }
          }
          this.P8(0);
       }else {
          this.w.setVisibility(8);
          this.C.B();
          this.P8(8);
       }
       return;
    }
    public final void W8(float p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, og, "11")) {
          return;
       }
       View view = this.getActivity().findViewById(R.id.live_slide_square_side_bar_layout);
       if (view != null) {
          view.setTranslationX(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       g tp = this.p;
       n on = (b.d(this) || tp != null)? new n(p0): new p(p0);
       this.C = on;
       this.v = on.i();
       this.u = this.C.i();
       this.w = m1.f(p0, 0x7f0a1a23);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new j());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.r8("AUDIENCE_WATER_MARK");
       this.s = this.q8(a.class);
       this.t = this.q8(b.class);
       return;
    }
}
