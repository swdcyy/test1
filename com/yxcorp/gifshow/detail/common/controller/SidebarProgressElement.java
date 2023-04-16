package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import fq7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mPlayerStateChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mOnInfoListener$2;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$e;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$b;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$a;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$c;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d;
import v6a.m0;
import java.lang.String;
import kotlin.jvm.internal.a;
import ok.x;
import de5.a;
import com.kwai.component.photo.detail.core.helper.VideoPlayProgressHelper;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import qp7.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jf5.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uw9.l0;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import kq7.k;
import kq7.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import m9a.y;
import androidx.fragment.app.Fragment;
import uw9.q;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import p5a.e;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$f;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$g;
import io.reactivex.internal.functions.Functions;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import de5.c;
import com.kwai.framework.player.core.b$b;
import qp7.c;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$h;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$i;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$j;
import qp7.x0;
import qp7.d;
import kq7.a;
import pp7.b;
import bf5.r;
import com.kwai.framework.player.core.b;
import p5a.b;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;

public final class SidebarProgressElement extends DispatchBaseElement	// class@0013d3
{
    public VideoPlayProgressHelper A;
    public u B;
    public SlidePlayViewModel C;
    public PublishSubject D;
    public x E;
    public PublishSubject F;
    public t G;
    public long H;
    public boolean I;
    public long J;
    public boolean K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final p P;
    public final p Q;
    public final SidebarProgressElement$e R;
    public final AwesomeCacheCallback S;
    public final IMediaPlayer$OnBufferingUpdateListener T;
    public final f U;
    public final SidebarProgressElement$d V;
    public QPhoto t;
    public a u;
    public c v;
    public PhotoDetailParam w;
    public Fragment x;
    public m0 y;
    public a z;

    public void SidebarProgressElement(a p0){
       super(d.a, p0);
       this.P = s.c(new SidebarProgressElement$mPlayerStateChangedListener$2(this));
       this.Q = s.c(new SidebarProgressElement$mOnInfoListener$2(this));
       this.R = new SidebarProgressElement$e(this);
       this.S = new SidebarProgressElement$b(this);
       this.T = new SidebarProgressElement$a(this);
       this.U = new SidebarProgressElement$c(this);
       this.V = new SidebarProgressElement$d(this);
    }
    public static final m0 n0(SidebarProgressElement p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mCallerContext");
       }
       return p0;
    }
    public static final x o0(SidebarProgressElement p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("mLogger");
       }
       return p0;
    }
    public static final a p0(SidebarProgressElement p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public static final VideoPlayProgressHelper q0(SidebarProgressElement p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("mProgressHelper");
       }
       return p0;
    }
    public static final SlidePlayViewModel r0(SidebarProgressElement p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public static final u s0(SidebarProgressElement p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SidebarProgressElement.class, "3")) {
       }else {
          a.p(p0, "callerContext");
          a r = p0.v.R;
          a.o(r, "callerContext.mPhotoDeta¡­wipeToProfileFeedMovement");
          this.B = r;
          m0 r1 = p0.r;
          a.o(r1, "callerContext.mScreenCleanStatusCombination");
          this.z = r1;
          r = p0.b;
          a.o(r, "callerContext.mFragment");
          this.x = r;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          r1 = p0.j;
          a.o(r1, "callerContext.mPlayModule");
          this.u = r1;
          r1 = p0.k;
          a.o(r1, "callerContext.mPlayInfoListenerBundle");
          this.v = r1;
          r = p0.c;
          a.o(r, "callerContext.mPhotoDetailParam");
          this.w = r;
          r = p0.d;
          a.o(r, "callerContext.mProgressPublisher");
          this.D = r;
          r1 = p0.p;
          a.o(r1, "callerContext.mLogger");
          this.E = r1;
          this.y = p0;
          this.F = this.H().R1;
          l0 p2 = p0.v.p2;
          a.o(p2, "callerContext.mPhotoDeta¡­ttomBlackHeightObservable");
          this.G = p2;
          PatchProxy.onMethodExit(SidebarProgressElement.class, "3");
       }
       return;
    }
    public a f0(a p0){
       k ok = PatchProxy.applyOneRefs(p0, this, SidebarProgressElement.class, "19");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(p0);
       }
       return ok;
    }
    public void j0(boolean p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       SidebarProgressElement sidebarProgr = SidebarProgressElement.class;
       if (PatchProxy.isSupport(sidebarProgr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, sidebarProgr, "4")) {
          return;
       }
       SidebarProgressElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       if (!y.a(tt)) {
          this.b0();
          return;
       }else {
          tt = this.x;
          if (tt == null) {
             a.S("mFragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tt.getParentFragment());
          a.m(slidePlayVie);
          this.C = slidePlayVie;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          this.M = q.c(tt);
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          this.N = w.P(tt.getEntity());
          if (!this.w0()) {
             this.b0();
          }
          SidebarProgressElement tu = this.u;
          if (tu == null) {
             a.S("mPlayModule");
          }
          e player = tu.getPlayer();
          SidebarProgressElement tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          this.A = new VideoPlayProgressHelper(player, tt1, 3);
          this.i(this.V);
          tt = this.F;
          if (tt == null) {
             a.S("mCoronaPayPanelSubject");
          }
          b uob = tt.subscribe(new SidebarProgressElement$f(this));
          a.o(uob, "mCoronaPayPanelSubject.s¡­naPayPanelShow = it\n    }");
          this.j(uob);
          tt = this.D;
          if (tt == null) {
             a.S("mProgressPublisher");
          }
          g e = Functions.e;
          uob = tt.subscribe(new SidebarProgressElement$g(this), e);
          a.o(uob, "mProgressPublisher.subsc¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
          tt = this.v;
          String str1 = "mPlayerListenerBundle";
          if (tt == null) {
             a.S(str1);
          }
          tt.b(this.t0());
          tt = this.v;
          if (tt == null) {
             a.S(str1);
          }
          tt.c(this.u0());
          j oj1 = this.A();
          SidebarProgressElement$h oh = new SidebarProgressElement$h(this);
          g og = Functions.d();
          String str2 = "Functions.emptyConsumer\(\)";
          a.o(og, str2);
          Objects.requireNonNull(oj1);
          b uob1 = PatchProxy.applyTwoRefs(oh, og, oj1, oj, "7");
          if (uob1 != patchProxyRe) {
          }else {
             a.p(oh, "consumer");
             a.p(og, "error");
             uob1 = oj1.b.subscribe(oh, og);
             a.o(uob1, "sidebarProgressCreateSub¡­ubscribe\(consumer, error\)");
          }
          this.j(uob1);
          oj1 = this.A();
          SidebarProgressElement$i oi = new SidebarProgressElement$i(this);
          og = Functions.d();
          a.o(og, str2);
          Objects.requireNonNull(oj1);
          b uob2 = PatchProxy.applyTwoRefs(oi, og, oj1, oj, "1");
          if (uob2 != patchProxyRe) {
          }else {
             a.p(oi, "consumer");
             a.p(og, "error");
             uob2 = oj1.d.subscribe(oi, og);
             a.o(uob2, "sidePauseViewClickSubjec¡­ubscribe\(consumer, error\)");
          }
          this.j(uob2);
          tt = this.G;
          if (tt == null) {
             a.S("mProfileSideBottomBlackHeightObservable");
          }
          uob = tt.subscribe(new SidebarProgressElement$j(this), e);
          a.o(uob, "mProfileSideBottomBlackH¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
          k ok = this.E();
          tu = this.t;
          if (tu == null) {
             a.S(str);
          }
          ok.h(0, tu.getVideoDuration());
          return;
       }
    }
    public void m0(boolean p0){
       SidebarProgressElement sidebarProgr = SidebarProgressElement.class;
       if (PatchProxy.isSupport(sidebarProgr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, sidebarProgr, "5")) {
          return;
       }
       if (!this.w0()) {
          return;
       }
       SidebarProgressElement tA = this.A;
       if (tA != null) {
          if (tA == null) {
             a.S("mProgressHelper");
          }
          tA.clear();
       }
       tA = this.v;
       String str = "mPlayerListenerBundle";
       if (tA == null) {
          a.S(str);
       }
       tA.g(this.u0());
       tA = this.v;
       if (tA == null) {
          a.S(str);
       }
       tA.f(this.t0());
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, SidebarProgressElement.class, "21");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public c r(){
       j oj = PatchProxy.apply(null, this, SidebarProgressElement.class, "20");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public final IMediaPlayer$OnInfoListener t0(){
       Object obj = PatchProxy.apply(null, this, SidebarProgressElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Q.getValue();
    }
    public final b$b u0(){
       Object obj = PatchProxy.apply(null, this, SidebarProgressElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.getValue();
    }
    public final boolean v0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, SidebarProgressElement.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.E();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, k.class, "4");
       if (obj1 == patchProxyRe) {
          obj1 = obj.h.a();
          a.o(obj1, "sidePauseViewPlayState.value");
       }
       return (obj1.booleanValue() ^ 0x01);
    }
    public final boolean w0(){
       boolean b;
       SidebarProgressElement obj = PatchProxy.apply(null, this, SidebarProgressElement.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       if (obj == null) {
          a.S("mFragment");
       }
       if (obj.getParentFragment() instanceof r) {
          obj = this.u;
          if (obj == null) {
             a.S("mPlayModule");
          }
          e player = obj.getPlayer();
          a.o(player, "mPlayModule.player");
          if (player.isPaused() && this.O == null) {
             b = true;
          label_0044 :
             return b;
          }
       }
    label_0043 :
       b = false;
       goto label_0044 ;
    }
    public final void x0(){
       if (PatchProxy.applyVoid(null, this, SidebarProgressElement.class, "8")) {
          return;
       }
       SidebarProgressElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       if (tt.isVideoType()) {
          tt = this.u;
          if (tt == null) {
             a.S("mPlayModule");
          }
          if (tt.getPlayer() != null) {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             if (b.i(tt)) {
                tt = this.u;
                if (tt == null) {
                   a.S("mPlayModule");
                }
                tt.getPlayer().removeAwesomeCallBack(this.S);
             }else {
                tt = this.u;
                if (tt == null) {
                   a.S("mPlayModule");
                }
                tt.getPlayer().removeOnBufferingUpdateListener(this.T);
             }
          }
       }
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, SidebarProgressElement.class, "10")) {
          return;
       }
       SidebarProgressElement tu = this.u;
       String str = "mPlayModule";
       if (tu == null) {
          a.S(str);
       }
       e player = tu.getPlayer();
       String str1 = "mPlayModule.player";
       a.o(player, str1);
       long currentPosit = player.getCurrentPosition();
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       player = tu.getPlayer();
       a.o(player, str1);
       long duration = player.getDuration();
       if (!currentPosit || (duration && this.m != null)) {
          this.L = duration;
          this.E().h(currentPosit, this.L);
       }
    label_0050 :
       return;
    }
}
