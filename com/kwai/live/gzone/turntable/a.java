package com.kwai.live.gzone.turntable.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import com.kwai.live.gzone.turntable.a$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.a$a;
import y43.a;
import k67.b;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.ScrollView;
import android.widget.RelativeLayout$LayoutParams;
import com.facebook.drawee.generic.RoundingParams;
import android.app.Activity;
import d61.y;
import lnc.a1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import io.reactivex.subjects.PublishSubject;
import n77.d;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import com.kwai.live.gzone.turntable.presenters.f;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import n77.n;
import com.kwai.live.gzone.turntable.a$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import brd.t;
import c77.p;
import n77.b;
import erd.g;
import crd.b;
import com.kwai.live.gzone.turntable.a$c;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import n77.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import n77.c;
import brd.y;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.live.gzone.widget.e;

public class a extends PresenterV2	// class@000e2e
{
    public c A;
    public c B;
    public a$a C;
    public c D;
    public c E;
    public c F;
    public c G;
    public c H;
    public final c I;
    public a J;
    public PresenterV2 p;
    public ScrollViewEx q;
    public FrameLayout r;
    public View s;
    public KwaiImageView t;
    public View u;
    public e v;
    public a w;
    public a x;
    public PagerSlidingTabStrip$d y;
    public LiveGzoneTurntableLogger z;

    public void a(){
       super();
       this.I = a.h(Boolean.FALSE);
       this.J = new a$d(this);
    }
    public void E8(){
       a tp;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       this.z = new a$a(this);
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          tp = this.w.d;
          if (tp != null && tp.S2()) {
             this.r.setVisibility(8);
             this.q.getLayoutParams().topMargin = i;
          }else {
             RoundingParams roundingPara = new RoundingParams();
             float f = 0;
             if (!y.d(this.getActivity())) {
                roundingPara.m((float)a1.e(16.00f), (float)a1.e(16.00f), f, f);
             }else {
                roundingPara.m(f, f, f, f);
             }
             this.t.getHierarchy().L(roundingPara);
             d0.c(this.t, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_old_style_title_background.webp", 1);
          }
       }
       this.D = PublishSubject.g();
       this.E = PublishSubject.g();
       this.A = PublishSubject.g();
       this.B = PublishSubject.g();
       this.F = PublishSubject.g();
       this.G = PublishSubject.g();
       this.H = PublishSubject.g();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          this.q.setScrollViewListener(new d(this));
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.p = presenterV2;
       presenterV2.U7(new f());
       this.p.U7(new LiveGzoneTurntableTaskPresenter());
       this.p.U7(new LiveGzoneAudienceTurntableWelfareTaskPresenter());
       this.p.U7(new LiveGzoneTurntableWinnerListPresenter());
       this.p.f(this.m8());
       tp = this.p;
       Object[] objArray1 = new Object[1];
       n on = PatchProxy.apply(objArray, this, uoa, "8");
       if (on == PatchProxyResult.class) {
          on = new n();
          on.c = this.w;
          on.b = this.v;
          on.d = this.J;
          on.e = this.z;
          on.h = this.D;
          on.i = this.E;
          on.f = this.A;
          on.j = this.F;
          on.k = this.I;
          on.g = this.B;
          on.l = this.G;
          on.m = this.H;
       }
       objArray1[i] = on;
       tp.i(objArray1);
       if (this.x != null) {
          tp = this.y;
          if (tp != null) {
             a$b uob = new a$b(this, tp.c());
             this.C = uob;
             this.x.e(uob);
          label_014b :
             tp = this.w.p;
             if (tp != null) {
                this.X7(tp.Ja().subscribe(new b(this)));
             }
             this.X7(this.B.subscribe(new a$c(this)));
             if (!QCurrentUser.me().isLogined() && !PatchProxy.applyVoid(objArray, this, uoa, "4")) {
                View view = c.h(this.s, b.g);
                view.setClickable(1);
                KwaiEmptyStateView$a uoa1 = KwaiEmptyStateView.e();
                uoa1.b();
                uoa1.k(R.drawable.arg_RES_7f080609);
                uoa1.j(2);
                uoa1.h(R.string.arg_RES_7f1030ae);
                uoa1.e(R.string.arg_RES_7f103059);
                uoa1.p(new a(this));
                uoa1.a(view);
             }
             this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new c(this)));
             return;
          }
       }
       this.z.n();
       goto label_014b ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       a tA = this.A;
       if (tA != null) {
          tA.onNext(new Object());
       }
       tA = this.C;
       if (tA != null) {
          a tx = this.x;
          if (tx != null) {
             tx.d(tA);
          }
       }
       tA = this.p;
       if (tA != null) {
          tA.destroy();
          this.p = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a40cc);
       this.t = m1.f(p0, 0x7f0a1e86);
       this.u = m1.f(p0, 0x7f0a1e82);
       this.r = m1.f(p0, 0x7f0a1e87);
       this.s = m1.f(p0, 0x7f0a1e85);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.v = this.t8("GZONE_ACTIVITY_POPUP");
       this.w = this.q8(a.class);
       this.x = this.s8(a.class);
       this.y = this.t8("LIVE_GZONE_TAB");
       return;
    }
}
