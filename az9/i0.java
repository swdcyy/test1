package az9.i0;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import ds7.c;
import rp7.a;
import java.util.ArrayList;
import crd.a;
import az9.b;
import az9.i0$a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import uw9.l0;
import brd.t;
import m3a.d;
import id5.p;
import ge5.d;
import sz9.b;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.negative.feedback.content.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import es7.z;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import bf5.r;
import bf5.d;
import xy5.j;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import gx5.b;
import com.kwai.component.photo.reduce.d;
import az9.b0;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import erd.g;
import az9.e0;
import az9.p;
import az9.d0;
import az9.i0$b;
import qp7.b1;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.q;
import qvb.j;
import az9.g;
import az9.u;
import az9.t;
import az9.k;
import az9.c;
import az9.r;
import az9.i;
import az9.f;
import az9.d;
import az9.l;
import az9.n;
import az9.w;
import az9.o;
import az9.s;
import az9.e;
import az9.h;
import az9.j;
import az9.q;
import az9.f0;
import az9.g0;
import bz9.h;
import az9.c0;
import sz9.u;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import sz9.w;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import sz9.v;
import sz9.c;
import sz9.d;
import sz9.e;
import sz9.f;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b;
import sz9.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.a;
import brd.z;
import io.reactivex.android.schedulers.a;
import sz9.j;
import bz9.j;
import sz9.k;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import android.content.Context;
import ekd.l1;
import com.yxcorp.utility.n;
import az9.m;
import lnc.c3$a;
import lnc.c3;
import qp7.x0;
import com.kwai.slide.play.detail.negative.feedback.content.g$a;
import com.kwai.slide.play.detail.negative.feedback.content.FeedbackAnim;
import qrd.l1;
import pp7.b;
import rf5.u;
import rf5.m;
import ro5.a;
import uo5.a;
import joc.q;
import com.kuaishou.android.model.mix.PhotoMeta;
import ekd.j;
import qp7.d;
import com.kwai.slide.play.detail.negative.feedback.content.f;
import qp7.c;

public class i0 extends DispatchBaseElement	// class@00032c
{
    public m A;
    public a B;
    public PublishSubject C;
    public t D;
    public a E;
    public t F;
    public l G;
    public j H;
    public d I;
    public d J;
    public x K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public final List Q;
    public SwipeLayout R;
    public View S;
    public View T;
    public View U;
    public boolean U0;
    public b V;
    public final a V0;
    public SlidePlayViewModel W;
    public final a W0;
    public m0 X;
    public final q X0;
    public h Y;
    public b Z;
    public boolean t;
    public QPhoto u;
    public final GifshowActivity v;
    public PhotoDetailParam w;
    public BaseFragment x;
    public e y;
    public u z;
    public static final int Y0;

    static {
       i0.Y0 = a1.d(0x7f070313);
    }
    public void i0(GifshowActivity p0,a p1){
       super(c.a, p1);
       this.t = false;
       this.P = true;
       this.Q = new ArrayList();
       this.U0 = false;
       this.V0 = new a();
       this.W0 = new b(this);
       this.X0 = new i0$a(this);
       this.v = p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i0.class, "1")) {
       }else {
          this.X = p0;
          a c = p0.c;
          this.u = c.mPhoto;
          this.w = c;
          this.x = p0.b;
          this.y = p0.t;
          m0 v = p0.v;
          this.z = v.R;
          this.A = v.P1;
          this.B = p0.r;
          this.C = p0.Y;
          this.D = p0.l0;
          this.E = v.r2;
          l0 e2 = v.E2;
          if (e2 != null) {
             this.F = e2.a();
          }
          this.K = p0.p;
          p b = p0.v.U0.b;
          if (b != null) {
             this.G = b.e;
          }
          this.Z = new b(p0, this.H());
          PatchProxy.onMethodExit(i0.class, "1");
       }
       return;
    }
    public boolean e0(){
       return false;
    }
    public a f0(a p0){
       g og = PatchProxy.applyOneRefs(p0, this, i0.class, "30");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(p0);
       }
       return og;
    }
    public void j0(boolean p0){
       boolean b;
       SlidePlayViewModel slidePlayVie = this;
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       b uob = b.class;
       i0 oi0 = i0.class;
       z oz = z.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), slidePlayVie, oi0, str)) {
          return;
       }
       slidePlayVie.W = SlidePlayViewModel.B0(slidePlayVie.x.getParentFragment());
       slidePlayVie.t = false;
       this.b0();
       i0 x = slidePlayVie.x;
       if (x != null && x.getParentFragment() instanceof r) {
          slidePlayVie.J = slidePlayVie.x.getParentFragment().j6();
       }
       slidePlayVie.H = new j(slidePlayVie.u);
       d.a(0x3673894c).Vk(slidePlayVie.H, slidePlayVie.w.getSource(), slidePlayVie.w.getBizType());
       slidePlayVie.I = new d(slidePlayVie.u, slidePlayVie.v);
       b i = slidePlayVie.i;
       b0 uob0 = new b0(slidePlayVie);
       g e = Functions.e;
       Objects.requireNonNull(i);
       b uob1 = PatchProxy.applyTwoRefs(uob0, e, i, oz, "16");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uob0, "onNext");
          a.p(e, "onError");
          uob1 = i.h.subscribe(uob0, e);
          a.o(uob1, "feedbackEmptyClickSubjec¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob1);
       i = slidePlayVie.i;
       e0 uoe0 = new e0(slidePlayVie);
       Objects.requireNonNull(i);
       uob1 = PatchProxy.applyTwoRefs(uoe0, e, i, oz, "14");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uoe0, "onNext");
          a.p(e, "onError");
          uob1 = i.g.subscribe(uoe0, e);
          a.o(uob1, "feedbackAnimFinishedSubj¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob1);
       slidePlayVie.j(slidePlayVie.C.subscribe(new p(slidePlayVie), e));
       slidePlayVie.j(slidePlayVie.D.subscribe(new d0(slidePlayVie), e));
       slidePlayVie.i(new i0$b(slidePlayVie));
       i = b.e(slidePlayVie.w.mSlidePlayId);
       slidePlayVie.V = i;
       if (i != null) {
          i.q().h(slidePlayVie.X0);
       }
       i = slidePlayVie.i;
       g og = new g(slidePlayVie);
       Objects.requireNonNull(i);
       uob1 = PatchProxy.applyTwoRefs(og, e, i, oz, "2");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(og, "onNext");
          a.p(e, "onError");
          uob1 = i.a.subscribe(og, e);
          a.o(uob1, "collectionClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob1);
       i = slidePlayVie.i;
       u ou = new u(slidePlayVie);
       Objects.requireNonNull(i);
       String str1 = "4";
       b uob2 = PatchProxy.applyTwoRefs(ou, e, i, oz, str1);
       if (uob2 != patchProxyRe) {
       }else {
          a.p(ou, "onNext");
          a.p(e, "onError");
          uob2 = i.b.subscribe(ou, e);
          a.o(uob2, "dislikeClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob2);
       i = slidePlayVie.i;
       t ot = new t(slidePlayVie);
       Objects.requireNonNull(i);
       uob2 = PatchProxy.applyTwoRefs(ot, e, i, oz, "6");
       if (uob2 != patchProxyRe) {
       }else {
          a.p(ot, "onNext");
          a.p(e, "onError");
          uob2 = i.c.subscribe(ot, e);
          a.o(uob2, "friendsReduceClickSubjec¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob2);
       i = slidePlayVie.i;
       k ok = new k(slidePlayVie);
       Objects.requireNonNull(i);
       String str2 = "8";
       b uob3 = PatchProxy.applyTwoRefs(ok, e, i, oz, str2);
       if (uob3 != patchProxyRe) {
       }else {
          a.p(ok, "onNext");
          a.p(e, "onError");
          uob3 = i.d.subscribe(ok, e);
          a.o(uob3, "friendsReduceShowSubject¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob3);
       i = slidePlayVie.i;
       c uoc = new c(slidePlayVie);
       Objects.requireNonNull(i);
       b uob4 = PatchProxy.applyTwoRefs(uoc, e, i, oz, "10");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(uoc, "onNext");
          a.p(e, "onError");
          uob4 = i.e.subscribe(uoc, e);
          a.o(uob4, "downloadClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       r or = new r(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(or, e, i, oz, "12");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(or, "onNext");
          a.p(e, "onError");
          uob4 = i.f.subscribe(or, e);
          a.o(uob4, "ocrExtractClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       i oi = new i(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(oi, e, i, oz, "18");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(oi, "onNext");
          a.p(e, "onError");
          uob4 = i.i.subscribe(oi, e);
          a.o(uob4, "feedbackClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       f uof = new f(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(uof, e, i, oz, "20");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(uof, "onNext");
          a.p(e, "onError");
          uob4 = i.j.subscribe(uof, e);
          a.o(uob4, "reportClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       d uod = new d(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(uod, e, i, oz, "22");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(uod, "onNext");
          a.p(e, "onError");
          uob4 = i.k.subscribe(uod, e);
          a.o(uob4, "extractTextClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       l ol = new l(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(ol, e, i, oz, "24");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(ol, "onNext");
          a.p(e, "onError");
          uob4 = i.l.subscribe(ol, e);
          a.o(uob4, "logItemShowSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       n on = new n(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(on, e, i, oz, "26");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(on, "onNext");
          a.p(e, "onError");
          uob4 = i.m.subscribe(on, e);
          a.o(uob4, "logItemClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       w ow = new w(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(ow, e, i, oz, "30");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(ow, "onNext");
          a.p(e, "onError");
          uob4 = i.o.subscribe(ow, e);
          a.o(uob4, "danmakuSwitchShow.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       o oo = new o(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(oo, e, i, oz, "28");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(oo, "onNext");
          a.p(e, "onError");
          uob4 = i.n.subscribe(oo, e);
          a.o(uob4, "danmakuSwitch.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       s os = new s(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(os, e, i, oz, "32");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(os, "onNext");
          a.p(e, "onError");
          uob4 = i.p.subscribe(os, e);
          a.o(uob4, "danmakuDisableToastSubje¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       e uoe = new e(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(uoe, e, i, oz, "34");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(uoe, "onNext");
          a.p(e, "onError");
          uob4 = i.q.subscribe(uoe, e);
          a.o(uob4, "screenClearSwitch.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       h oh = new h(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(oh, e, i, oz, "36");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(oh, "onNext");
          a.p(e, "onError");
          uob4 = i.r.subscribe(oh, e);
          a.o(uob4, "unFollowClickSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       j oj = new j(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(oj, e, i, oz, "38");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(oj, "onNext");
          a.p(e, "onError");
          uob4 = i.s.subscribe(oj, e);
          a.o(uob4, "coronaWatchLaterSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       q oq = new q(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(oq, e, i, oz, "39");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(oq, "onNext");
          a.p(e, "onError");
          uob4 = i.t.subscribe(oq, e);
          a.o(uob4, "watchLaterShowSubject.subscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       f0 uof0 = new f0(slidePlayVie);
       Objects.requireNonNull(i);
       uob4 = PatchProxy.applyTwoRefs(uof0, e, i, oz, "43");
       if (uob4 != patchProxyRe) {
       }else {
          a.p(uof0, "onNext");
          a.p(e, "onError");
          uob4 = i.u.subscribe(uof0, e);
          a.o(uob4, "messageForwardClickSubje¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob4);
       i = slidePlayVie.i;
       g0 og0 = new g0(slidePlayVie);
       Objects.requireNonNull(i);
       b uob5 = PatchProxy.applyTwoRefs(og0, e, i, oz, "45");
       if (uob5 != patchProxyRe) {
       }else {
          a.p(og0, "onNext");
          a.p(e, "onError");
          uob5 = i.v.subscribe(og0, e);
          a.o(uob5, "messageLocateClickSubjec¡­ubscribe\(onNext, onError\)");
       }
       slidePlayVie.j(uob5);
       slidePlayVie.Y = new h(slidePlayVie.X, this.H());
       i0 f = slidePlayVie.F;
       if (f != null) {
          slidePlayVie.j(f.subscribe(new c0(slidePlayVie), e));
       }
       f = slidePlayVie.Z;
       if (f != null) {
          Objects.requireNonNull(f);
          Object obj = PatchProxy.apply(null, f, uob, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             uob5 = f.k;
             Objects.requireNonNull(uob5);
             SlidePlayerPanelManager obj1 = PatchProxy.apply(null, uob5, slidePlayerP, str1);
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                obj1 = uob5.r;
                Objects.requireNonNull(obj1);
                Object obj2 = PatchProxy.apply(null, obj1, u.class, "1");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(obj1.b.isEnable() && obj1.m()){
                   b = true;
                }else {
                   b = false;
                }
                if (b && (!uob5.r.g() && (!uob5.r.b() && (uob5.r.h() || uob5.r.k())))) {
                   b = true;
                }else {
                   b = false;
                }
             }
          }
          if (b) {
             oi0 = slidePlayVie.Z;
             Objects.requireNonNull(oi0);
             w ow1 = w.class;
             if (!PatchProxy.applyVoid(null, oi0, uob, str)) {
                b c = oi0.c;
                a.o(c, "mFragment");
                oi0.l = new FragmentCompositeLifecycleState(c);
                uob = oi0.a;
                v ov = oi0.k.o();
                c uoc1 = new c(oi0);
                a.o(e, "Functions.ERROR_CONSUMER");
                Objects.requireNonNull(ov);
                uob2 = PatchProxy.applyTwoRefs(uoc1, e, ov, ow1, str2);
                if (uob2 != patchProxyRe) {
                }else {
                   a.p(uoc1, "onNext");
                   a.p(e, "onError");
                   uob2 = ov.c.subscribe(uoc1, e);
                   a.o(uob2, "mSpeedSubject.subscribe\(onNext, onError\)");
                }
                uob.c(uob2);
                uob = oi0.a;
                ov = oi0.k.o();
                d uod1 = new d(oi0);
                a.o(e, "Functions.ERROR_CONSUMER");
                Objects.requireNonNull(ov);
                uob2 = PatchProxy.applyTwoRefs(uod1, e, ov, ow1, "9");
                if (uob2 != patchProxyRe) {
                }else {
                   a.p(uod1, "onNext");
                   a.p(e, "onError");
                   uob2 = ov.b.subscribe(uod1, e);
                   a.o(uob2, "mVppFiltersSubject.subscribe\(onNext, onError\)");
                }
                uob.c(uob2);
                uob = oi0.a;
                ov = oi0.k.o();
                e uoe1 = new e(oi0);
                a.o(e, "Functions.ERROR_CONSUMER");
                Objects.requireNonNull(ov);
                uob2 = PatchProxy.applyTwoRefs(uoe1, e, ov, ow1, "10");
                if (uob2 != patchProxyRe) {
                }else {
                   a.p(uoe1, "onNext");
                   a.p(e, "onError");
                   uob2 = ov.d.subscribe(uoe1, e);
                   a.o(uob2, "mQualitySubject.subscribe\(onNext, onError\)");
                }
                uob.c(uob2);
                uob = oi0.a;
                ov = oi0.k.o();
                f uof1 = new f(oi0);
                a.o(e, "Functions.ERROR_CONSUMER");
                Objects.requireNonNull(ov);
                uob5 = PatchProxy.applyTwoRefs(uof1, e, ov, ow1, "11");
                if (uob5 != patchProxyRe) {
                }else {
                   a.p(uof1, "onNext");
                   a.p(e, "onError");
                   uob5 = ov.e.subscribe(uof1, e);
                   a.o(uob5, "mSoundEffectClickEvent.subscribe\(onNext, onError\)");
                }
                uob.c(uob5);
                uob = oi0.e;
                a.o(uob, "mPlayModule");
                e player = uob.getPlayer();
                if (player != null) {
                   player.addOnPreparedListener(oi0.n);
                }
                oi0.a.c(oi0.m.subscribe(new g(oi0), e));
                uob = oi0.k;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoid(null, uob, slidePlayerP, "5")) {
                   RxBus f1 = RxBus.f;
                   b uob6 = f1.f(a.class).observeOn(a.c()).subscribe(new j(uob));
                   a.o(uob6, "RxBus.INSTANCE.toObserva¡­Panel\(\)\n        }\n      }");
                   uob.b(uob6);
                   b uob7 = f1.f(j.class).observeOn(a.c()).subscribe(new k(uob));
                   a.o(uob7, "RxBus.INSTANCE.toObserva¡­IsOpen\)\n        }\n      }");
                   uob.b(uob7);
                }
             }
          }
       }
    label_0659 :
       return;
    }
    public void k0(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "2")) {
          return;
       }
       this.R = w9.c(this.v);
       this.S = this.v.findViewById(0x7f0a007f);
       this.T = this.v.findViewById(0x7f0a048f);
       this.U = this.v.findViewById(0x7f0a3023);
       int i = (l1.a(this.v))? 0: n.A(this.v);
       this.L = i;
       return;
    }
    public void m0(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "8")) {
          return;
       }
       i0 tV = this.V;
       if (tV != null) {
          tV.q().f(this.X0);
       }
       tV = this.Z;
       if (tV != null) {
          Objects.requireNonNull(tV);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tV, b.class, "4")) {
             tV.l = objArray;
             tV.a.dispose();
             tV.k.e();
             b e = tV.e;
             a.o(e, "mPlayModule");
             e player = e.getPlayer();
             if (player != null) {
                player.removeOnPreparedListener(tV.n);
             }
          }
       }
       return;
    }
    public final void n0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "27")) {
          return;
       }
       this.o0();
       c3.c(this.H.a(this.v, p0), new m(this));
       return;
    }
    public void o0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0.class, "13")) {
          return;
       }
       g og = this.E();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoid(objArray, og, g.class, "2")) {
          g$a uoa = new g$a();
          uoa.l = FeedbackAnim.HIDE;
          og.d.f(uoa);
       }
       i0 tU = this.U;
       if (tU != null) {
          tU.setAlpha(0x3f800000);
       }
       this.W.d(true, 4);
       int i = 5;
       this.z.F(true, i);
       this.A.a(false, i);
       a.o(this.x, true, i);
       tU = this.R;
       if (tU != null) {
          tU.n(true, 6);
       }
       a.c(this.v, true, 2);
       tU = this.G;
       if (tU != null) {
          tU.e(2);
       }
       return;
    }
    public final boolean p0(){
       Object obj = PatchProxy.apply(null, this, i0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u.isAtlasPhotos() || (this.u.isLongPhotos() && (this.u.getPhotoMeta() != null && !j.h(this.u.getPhotoMeta().mTtlasOcrResult))))? true: false;
       return b;
    }
    public d q(){
       f uof = PatchProxy.apply(null, this, i0.class, "32");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
    public c r(){
       z oz = PatchProxy.apply(null, this, i0.class, "31");
       if (oz != PatchProxyResult.class) {
       }else {
          oz = new z();
       }
       return oz;
    }
}
