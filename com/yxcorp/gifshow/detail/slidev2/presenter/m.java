package com.yxcorp.gifshow.detail.slidev2.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import b8a.u0;
import com.yxcorp.gifshow.detail.slidev2.presenter.m$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.m$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.m$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.view.View;
import ekd.m1;
import b8a.w0;
import java.lang.Runnable;
import b8a.v0;
import erd.g;
import crd.b;
import xx9.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import java.lang.Float;
import sz9.w;
import androidx.fragment.app.FragmentActivity;
import sz9.w$b;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import rf5.u;
import com.kwai.library.slide.base.widget.SlidePlayRefreshView;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9a.f;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import hn5.c;
import oo5.a;
import ro5.a;
import ib5.q;
import joc.z;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import ge5.d;
import joc.a0;
import im8.f;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import lnc.ja;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import android.widget.ImageView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import rd5.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import w85.a;
import r7a.f;

public class m extends PresenterV2	// class@0019c7
{
    public f A;
    public f B;
    public SlidePlayViewModel C;
    public a D;
    public float E;
    public int F;
    public final BitSet G;
    public final e H;
    public final c I;
    public final q J;
    public final a K;
    public SwipeLayout p;
    public View q;
    public KwaiLottieAnimationView r;
    public f s;
    public TextView t;
    public View u;
    public BaseFragment v;
    public QPhoto w;
    public a x;
    public a y;
    public u z;

    public void m(){
       super();
       this.E = 0x3f800000;
       this.G = new BitSet();
       this.H = new u0(this);
       this.I = new m$a(this);
       this.J = new m$b(this);
       this.K = new m$c(this);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
       this.C = slidePlayVie;
       slidePlayVie.P(this.v, this.K);
       if (!PatchProxy.applyVoid(objArray, this, om, "5") && this.v.getParentFragment() != null) {
          View view = this.v.getParentFragment().getView();
          if (view != null) {
             this.u = m1.f(view, 0x7f0a3537);
             view.post(new w0(this, view));
          }
       }
       this.X7(this.y.h(new v0(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.getActivity().findViewById(0x7f0a3c34);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "14")) {
          return;
       }
       this.C.D(this.v, this.K);
       return;
    }
    public final void P8(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "7")) {
          return;
       }
       w.i.a(this.getActivity()).updateSpeed(p0);
       if (this.x.getPlayer() != null && (this.x.getPlayer().getIKwaiMediaPlayer() != null && this.x.getPlayer().getIKwaiMediaPlayer().getSpeed(0x3f800000) - p0)) {
          this.x.getPlayer().setSpeed(p0);
       }
    label_0055 :
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, m.class, "11")) {
          return;
       }
       int i = 1;
       if (this.z.v()) {
          this.G.clear(i);
       }else {
          this.G.set(i);
       }
       m tu = this.u;
       if (tu instanceof SlidePlayRefreshView && tu.u()) {
          this.G.set(2);
       }else {
          this.G.clear(2);
       }
       tu = this.s;
       if (this.G.cardinality() > 0) {
          i = false;
       }
       tu.v2(i);
       return;
    }
    public void S8(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "12")) {
          return;
       }
       boolean i = 2;
       if (p0) {
          this.G.set(i);
       }else {
          this.G.clear(i);
       }
       m ts = this.s;
       i = (this.G.cardinality() <= 0)? true: false;
       ts.v2(i);
       return;
    }
    public final View V8(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v.getParentFragment() == null) {
          return objArray;
       }
       obj = this.v.getParentFragment().getView();
       if (obj == null) {
          return objArray;
       }
       return obj.findViewById(0x7f0a3711);
    }
    public void W8(boolean p0){
       m tq;
       View view;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "6")) {
          return;
       }
       int i = p0 ^ 0x01;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), this, om, "9")) {
          if (this.getActivity() instanceof c) {
             a.i(this.v, i, 18);
             a.o(this.v, i, 18);
             q.p0(this.getActivity()).w0(i, 24);
          }
          om = this.p;
          int i3 = 28;
          if (om != null) {
             om.n(i, i3);
             if (this.p.getTouchDetector() != null) {
                if (i) {
                   this.p.getTouchDetector().g(i3);
                }else {
                   this.p.getTouchDetector().a(i3);
                }
             }
          }
          this.z.F(i, 25);
          this.C.d(i, i3);
          Activity activity = this.getActivity();
          if (activity != null && (!activity.isFinishing() && activity instanceof PhotoDetailActivity)) {
             d uod = activity.p();
             if (uod != null) {
                if (i) {
                   uod.b().g(i3);
                }else {
                   uod.b().a(i3);
                }
             }
          }
       }
    label_00aa :
       this.B.set(Boolean.valueOf(p0));
       int i1 = 8;
       i = 1;
       if (p0) {
          int i2 = 0;
          Object[] objArray = new Object[i2];
          o.C().w("NasaSpeedPlayPresenter", "触发长按倍速"+this.w.getUserName(), objArray);
          tq = this.q;
          if (tq != null) {
             tq.setVisibility(i2);
          }
          ja.a();
          if (!this.y.c()) {
             this.y.d(new ChangeScreenVisibleEvent(this.w, ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED));
             a.b(this.v, i2);
          }
          if (this.w.isVideoType() || this.w.isSinglePhoto()) {
             if (this.r != null) {
                this.t.setText(a1.p(R.string.arg_RES_7f103e09));
                this.r.setVisibility(i2);
                this.r.s();
             }
             if (this.x.getPlayer() != null && this.x.getPlayer().getIKwaiMediaPlayer() != null) {
                this.E = this.x.getPlayer().getIKwaiMediaPlayer().getSpeed(0x3f800000);
                if (this.x.getPlayer().isPrepared() && this.x.getPlayer().isPaused()) {
                   a.d().k(new PlayEvent(this.w, PlayEvent$Status.RESUME, i, "LongPressing"));
                }
             }
             this.P8(ExperimentUtils.e());
          }else {
             tq = this.r;
             if (tq != null) {
                tq.setVisibility(i1);
                this.t.setText(a1.p(R.string.arg_RES_7f103e08));
             }
          }
          view = this.V8();
          if (view != null) {
             this.F = view.getVisibility();
             view.setVisibility(i1);
          }
       }else {
          view = this.V8();
          if (view != null) {
             view.setVisibility(this.F);
          }
          tq = this.r;
          if (tq != null) {
             tq.f();
             this.q.setVisibility(i1);
          }
          if (this.y.c() && this.y.b() != null) {
             ChangeScreenVisibilityCause pRESS_CONTRO = ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED;
             if (this.y.b().a == pRESS_CONTRO) {
                this.y.d(new ChangeScreenVisibleEvent(this.w, pRESS_CONTRO));
                a.b(this.v, i);
             }
          }
          if (this.w.isVideoType() || this.w.isSinglePhoto()) {
             this.P8(this.E);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3698);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.v = this.r8("DETAIL_FRAGMENT");
       this.w = this.q8(QPhoto.class);
       this.x = this.q8(a.class);
       this.y = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.z = this.q8(u.class);
       this.D = this.q8(a.class);
       this.A = this.r8("NASA_SIDEBAR_STATUS");
       this.B = this.x8("NASA_PRESS_CONTROL_SPEED_EVENT");
       return;
    }
}
