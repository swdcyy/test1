package iy9.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import iy9.a$a;
import nsd.u;
import java.util.HashSet;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import iy9.f;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import iy9.a$b;
import erd.g;
import crd.b;
import qp7.x0;
import java.util.Objects;
import pp7.b;
import qp7.c;
import iy9.e;
import iy9.a$c;
import io.reactivex.internal.functions.Functions;
import iy9.a$d;
import qp7.b1;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import tkd.b;
import tkd.d;
import eyb.c;
import java.lang.Integer;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import androidx.fragment.app.Fragment;
import xa5.a;
import android.view.View;
import aoc.a;
import aoc.b;
import bo5.a;
import zq6.p;
import as6.a;
import qp7.d;
import iy9.d;

public final class a extends DispatchBaseElement	// class@0028bd
{
    public QPhoto t;
    public BaseFragment u;
    public int v;
    public a w;
    public final GifshowActivity x;
    public static final HashSet y;
    public static final a$a z;

    static {
       a.z = new a$a(null);
       a.y = new HashSet();
    }
    public void a(GifshowActivity p0,a p1){
       a.p(p0, "activity");
       super(d.p, p1);
       this.x = p0;
       this.v = -1;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          a c = p0.c;
          a.o(c, "callerContext.mPhotoDetailParam");
          this.t = c.getPhoto();
          this.v = p0.c.mPhotoIndexByLog;
          this.u = p0.b;
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
    public void S(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       a tt = this.t;
       String photoId = (tt != null)? tt.getPhotoId(): null;
       if (!PatchProxy.applyVoidOneRefs(photoId, this, uoa, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUIDE_LOGIN_POPUP";
          i3 oi3 = i3.f();
          oi3.d("photo_id", photoId);
          uElementPack.params = oi3.e();
          u1.C0("", this.u, 3, uElementPack, null);
       }
       return;
    }
    public a f0(a p0){
       f uof = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(p0);
       }
       return uof;
    }
    public void j0(boolean p0){
       a uoa = a.class;
       String str = "2";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, str)) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined() && (VisitorModeManager.f() || !this.n0())) {
          this.b0();
          return;
       }else {
          this.c0();
          b uob = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new a$b(this));
          a.o(uob, "RxBus.INSTANCE.toObserva¡­uideSet.clear\(\)\n        }");
          this.j(uob);
          f uof = this.E();
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoid(null, uof, f.class, "1")) {
             uof.d.f(Boolean.TRUE);
          }
          e uoe = this.A();
          a$c uoc = new a$c(this);
          g e = Functions.e;
          a.o(e, "Functions.ERROR_CONSUMER");
          Objects.requireNonNull(uoe);
          b uob1 = PatchProxy.applyTwoRefs(uoc, e, uoe, e.class, str);
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uoc, "onNext");
             a.p(e, "onError");
             uob1 = uoe.a.subscribe(uoc, e);
             a.o(uob1, "quickLoginClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob1);
          this.i(new a$d(this));
          return;
       }
    }
    public void m0(boolean p0){
    }
    public final boolean n0(){
       Object[] objArray = null;
       HashSet obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.y;
       a tt = this.t;
       if (tt != null) {
          objArray = tt.getPhotoId();
       }
       boolean b = (CollectionsKt___CollectionsKt.H1(obj, objArray) || d.a(0x7a941161).RJ(this.v))? true: false;
       return b;
    }
    public final void o0(int p0){
       p a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       if (this.H().j0()) {
          return;
       }
       uoa = this.u;
       if (uoa != null) {
          if (!a.h(uoa)) {
             Fragment parentFragme = uoa.getParentFragment();
             if (parentFragme != null) {
                View view = parentFragme.requireView();
                a.o(view, "parent.requireView\(\)");
                a uoa1 = b.a(view, R.id.featured_left_login);
                this.w = uoa1;
                if (uoa1 != null) {
                   uoa1.e(p0);
                }
             }
          }
          a = a.a;
          a.o(a, "HomeTopStateId.LOGIN_TEXT_BTN_VISIBILITY");
          a.a(uoa, a, Integer.valueOf(p0));
       }
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          this.o0(0);
       }
       return;
    }
    public d q(){
       d uod = PatchProxy.apply(null, this, a.class, "12");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public c r(){
       e uoe = PatchProxy.apply(null, this, a.class, "11");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
}
