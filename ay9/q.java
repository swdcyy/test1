package ay9.q;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import xq7.d;
import rp7.a;
import java.util.ArrayList;
import rd5.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import tkd.b;
import tkd.d;
import vt5.e;
import st5.b$j;
import android.app.Activity;
import st5.b;
import kzc.c;
import cg6.b;
import com.yxcorp.gifshow.widget.popup.c;
import kzc.e;
import java.util.List;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import uw9.l0;
import brd.t;
import m3a.d;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.l;
import com.kwai.slide.play.detail.information.caption.k;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import qp7.b;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import ay9.k;
import erd.g;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import ay9.l;
import ay9.m;
import com.yxcorp.gifshow.util.rx.RxBus;
import gya.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import ay9.d;
import ay9.f;
import ay9.q$a;
import qp7.b1;
import ay9.e;
import lq.f;
import xl8.b;
import ay9.j;
import qp7.g;
import xq7.e;
import ay9.p;
import ay9.i;
import xx9.a;
import ay9.n;
import ay9.o;
import ay9.c;
import tyc.s4$a;
import ay9.q$b;
import e8a.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import qp7.c;
import b8a.k1;
import mxb.h0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import java.util.Collection;
import ekd.q;
import java.util.HashMap;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.android.model.mix.AtUserItem;
import uy6.h;
import uy6.b;
import ay9.g;
import java.util.Map;
import java.lang.Runnable;
import k2b.n;
import androidx.fragment.app.KwaiDialogFragment;
import qp7.x0;
import rf5.u;

public abstract class q extends DispatchBaseElement	// class@000308
{
    public SlidePlayViewModel A;
    public y B;
    public a$c C;
    public b D;
    public t E;
    public PublishSubject F;
    public a G;
    public b H;
    public u I;
    public CaptionDialogFragment J;
    public boolean K;
    public boolean t;
    public final GifshowActivity u;
    public QPhoto v;
    public BaseFragment w;
    public TagPackageListHelper x;
    public List y;
    public a z;

    public void q(GifshowActivity p0,a p1){
       super(d.l, p1);
       this.y = new ArrayList();
       this.u = p0;
    }
    public static void n0(q p0,j p1){
       p0.t0(p1);
    }
    private void t0(j p0){
       if (this.v.equals(this.A.getCurrentPhoto()) && p0.a == ChangeScreenVisibilityCause.CAPTION_DIALOG) {
          int i = -1094279325;
          if (p0.b != null) {
             d.a(i).zb(this.u, b$j.b);
             b.a().v(6);
             b.b().v(6);
          }else {
             d.a(i).j40(this.u, b$j.b);
             List list = b.a().l(this.u);
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa.K()) {
                      uoa.o();
                   }
                }
             }
             b.a().u(6);
             b.b().u(6);
          }
       }
       return;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "1")) {
       }else {
          this.v = p0.c.mPhoto;
          this.w = p0.b;
          this.x = p0.s;
          this.z = p0.o;
          this.G = p0.r;
          this.B = p0.c0;
          m0 v = p0.v;
          this.D = v.X.o;
          this.E = v.E2.a();
          this.I = p0.v.R;
          this.F = p0.z0;
          PatchProxy.onMethodExit(q.class, "1");
       }
       return;
    }
    public a f0(a p0){
       l ol = PatchProxy.applyOneRefs(p0, this, q.class, "16");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l(p0);
       }
       return ol;
    }
    public void j0(boolean p0){
       b ti;
       g og;
       q oq = q.class;
       k ok = k.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "2")) {
          return;
       }
       this.A = SlidePlayViewModel.B0(this.w.getParentFragment());
       if (this.r0(this.q0())) {
          this.b0();
       }
       this.s0();
       if (this.H().e()) {
          ti = this.i;
          k ok1 = new k(this);
          og = Functions.d();
          Objects.requireNonNull(ti);
          b uob = PatchProxy.applyTwoRefs(ok1, og, ti, ok, "8");
          if (uob != PatchProxyResult.class) {
          }else {
             a.p(ok1, "onNext");
             a.p(og, "onError");
             uob = ti.d.subscribe(ok1, og);
             a.o(uob, "unfoldClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob);
          ti = this.i;
          l ol = new l(this);
          og = Functions.d();
          Objects.requireNonNull(ti);
          uob = PatchProxy.applyTwoRefs(ol, og, ti, ok, "6");
          if (uob != PatchProxyResult.class) {
          }else {
             a.p(ol, "onNext");
             a.p(og, "onError");
             uob = ti.c.subscribe(ol, og);
             a.o(uob, "foldClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob);
          ti = this.i;
          m om = new m(this);
          og = Functions.e;
          Objects.requireNonNull(ti);
          uob = PatchProxy.applyTwoRefs(om, og, ti, ok, "4");
          if (uob != PatchProxyResult.class) {
          }else {
             a.p(om, "onNext");
             a.p(og, "onError");
             uob = ti.e.subscribe(om, og);
             a.o(uob, "foldProgressSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob);
       }
       this.j(RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new d(this)));
       this.j(this.i.g(new f(this), Functions.d()));
       this.i(new q$a(this));
       this.j(this.v.observePostChange().subscribe(new e(this), f.b));
       this.j(this.D.b().subscribe(new j(this), f.b));
       og = Functions.e;
       this.j(this.D().t(new p(this), og));
       this.j(this.G.h(new i(this)));
       this.j(this.E.subscribe(new n(this)));
       this.j(this.F.subscribe(new o(this)));
       ti = this.i;
       c uoc = new c(this);
       Objects.requireNonNull(ti);
       b uob1 = PatchProxy.applyTwoRefs(uoc, og, ti, ok, "11");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(uoc, "onNext");
          a.p(og, "onError");
          uob1 = ti.f.subscribe(uoc, og);
          a.o(uob1, "showCaptionDialogSubject¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob1);
       return;
    }
    public s4$a o0(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q$b(this);
    }
    public abstract d p0();
    public final String q0(){
       Object obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.H().i() && (!TextUtils.x(this.v.getCaptionTitle()) && (!TextUtils.x((this.v.getCaptionTitle()).trim()) && this.v.isImageType()))) {
          return this.v.getCaptionTitle()+" "+this.v.getCaption();
       }
       return this.v.getCaption();
    }
    public c r(){
       k ok = PatchProxy.apply(null, this, q.class, "17");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k();
       }
       return ok;
    }
    public final boolean r0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (k1.a(p0) && (!h0.g(this.v) && !h0.i(this.v)))? true: false;
       return b;
    }
    public abstract void s0();
    public final void u0(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "13")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DESCRIPTION_TEXT";
       i3 oi3 = i3.f();
       String str = (p0)? "FOLD": "UNFOLD";
       oi3.d("click_type", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.v.getEntity());
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setElementPackage(uElementPack).setContentPackage(uContentPack);
       u1.B(uClickMetaDa);
       return;
    }
    public final void v0(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "3")) {
          return;
       }
       if (!this.G.c() || (p0 || (!this.G.c() && !p0))) {
          return;
       }
       if (p0) {
          this.u0(false);
       }
       this.G.d(new ChangeScreenVisibleEvent(this.v, ChangeScreenVisibilityCause.CAPTION_DIALOG));
       return;
    }
    public void w0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "11")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = w.M(this.v).iterator();
       while (iterator.hasNext()) {
          AtUserItem uAtUserItem = iterator.next();
          hashMap.put(uAtUserItem.userId, Boolean.valueOf(uAtUserItem.isCurrentLiving));
       }
       if (h.a.r == null) {
          n.a(this.w, new g(this, hashMap, p0));
       }
       return;
    }
    public abstract void x0();
    public abstract void y0();
    public void z0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "15")) {
          return;
       }
       if (this.H().e()) {
          q tJ = this.J;
          if (tJ != null) {
             tJ.dismiss();
             this.J = objArray;
          }
          this.E().n(true);
          this.I.F(true, 23);
       }
       return;
    }
}
