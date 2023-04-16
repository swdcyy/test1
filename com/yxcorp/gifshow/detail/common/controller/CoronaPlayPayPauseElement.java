package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import tr7.b;
import rp7.a;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$onPreparedListener$1;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import de5.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qp7.b;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uw9.l0;
import jf5.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import nx6.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import hq7.h;
import hq7.g;
import java.lang.Boolean;
import gm5.b;
import p5a.e;
import com.kwai.framework.player.core.b;
import rx9.c;
import msd.l;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$onBind$1;
import rx9.d;
import brd.t;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import bm5.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$c;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$d;
import qp7.c;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$e;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$f;
import vy6.a;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$g;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import qp7.x0;
import java.lang.Float;
import pp7.b;
import qp7.d;
import hq7.f;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ul5.g;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import ul5.f;
import ul5.h;
import nsd.u;
import tkd.b;
import tkd.d;
import cm5.a;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$h;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cm5.b;

public final class CoronaPlayPayPauseElement extends DispatchBaseElement	// class@0013b6
{
    public PublishSubject A;
    public QPhoto B;
    public PublishSubject C;
    public a D;
    public DetailPlayConfig E;
    public Activity F;
    public boolean G;
    public final Handler H;
    public boolean I;
    public l J;
    public final a K;
    public a t;
    public boolean u;
    public boolean v;
    public PublishSubject w;
    public PublishSubject x;
    public SlidePlayViewModel y;
    public BaseFragment z;

    public void CoronaPlayPayPauseElement(a p0){
       super(b.i, p0);
       this.G = true;
       this.H = new Handler(Looper.getMainLooper());
       this.J = new CoronaPlayPayPauseElement$onPreparedListener$1(this);
       this.K = new CoronaPlayPayPauseElement$a(this);
    }
    public static final QPhoto n0(CoronaPlayPayPauseElement p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final a o0(CoronaPlayPayPauseElement p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public void P(a p0){
       b playerKitCon;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CoronaPlayPayPauseElement.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.z = b;
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.F = b;
          m0 j = p0.j;
          a.o(j, "callerContext.mPlayModule");
          this.D = j;
          b = p0.d;
          a.o(b, "callerContext.mProgressPublisher");
          this.C = b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.B = mPhoto;
          b = p0.c;
          a.o(b, "callerContext.mPhotoDetailParam");
          DetailPlayConfig detailPlayCo = b.getDetailPlayConfig();
          a.o(detailPlayCo, "callerContext.mPhotoDetailParam.detailPlayConfig");
          this.E = detailPlayCo;
          this.A = this.H().R1;
          this.G = true;
          m0 v = p0.v;
          if (v != null) {
             this.w = v.U1;
             this.x = v.X.D;
          }
          CoronaPlayPayPauseElement tz = this.z;
          if (tz == null) {
             a.S("mFragment");
          }
          View view = tz.getView();
          if (view != null) {
             KwaiPlayerKitView kwaiPlayerKi = view.findViewById(R.id.slide_playerkit_view);
             if (kwaiPlayerKi != null) {
                playerKitCon = kwaiPlayerKi.getPlayerKitContext();
                if (playerKitCon != null) {
                   playerKitCon = playerKitCon.e(a.class);
                label_009c :
                   this.t = playerKitCon;
                   PatchProxy.onMethodExit(CoronaPlayPayPauseElement.class, "1");
                }
             }
          }
          playerKitCon = null;
          goto label_009c ;
       }
       return;
    }
    public a f0(a p0){
       h oh = PatchProxy.applyOneRefs(p0, this, CoronaPlayPayPauseElement.class, "13");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(p0);
       }
       return oh;
    }
    public void j0(boolean p0){
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       CoronaPlayPayPauseElement uCoronaPlayP = CoronaPlayPayPauseElement.class;
       if (PatchProxy.isSupport(uCoronaPlayP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCoronaPlayP, "2")) {
          return;
       }
       this.b0();
       CoronaPlayPayPauseElement tB = this.B;
       if (tB == null) {
          a.S("mPhoto");
       }
       if (!b.t(tB)) {
          return;
       }else if(!PatchProxy.applyVoid(null, this, uCoronaPlayP, "3") && !b.r()){
          tB = this.D;
          String str = "mPlayModule";
          if (tB == null) {
             a.S(str);
          }
          e player = tB.getPlayer();
          a.o(player, "mPlayModule.player");
          if (player.isPrepared()) {
             this.s0();
          }else {
             this.I = false;
             tB = this.D;
             if (tB == null) {
                a.S(str);
             }
             player = tB.getPlayer();
             uCoronaPlayP = this.J;
             if (uCoronaPlayP != null) {
                uoc = new c(uCoronaPlayP);
             }
             player.addOnPreparedListener(uoc);
          }
       }
       this.j(b.c(null, null, 0, 0, 11, null));
       b uob = this.H().D1.subscribe(new d(new CoronaPlayPayPauseElement$onBind$1(this)));
       a.o(uob, "pageConfig.slidePlayerCo¡­::changeVerticalLocation\)");
       this.j(uob);
       tB = this.w;
       if (tB != null) {
          a.m(tB);
          uob = tB.subscribe(new CoronaPlayPayPauseElement$b(this));
          a.o(uob, "mSmallWindowProgressObse¡­ progress != 1.0f\n      }");
          this.j(uob);
       }
       tB = this.z;
       if (tB == null) {
          a.S("mFragment");
       }
       this.y = SlidePlayViewModel.B0(tB.requireParentFragment());
       uob = RxBus.f.f(a.class).observeOn(d.a).subscribe(new CoronaPlayPayPauseElement$c(this));
       a.o(uob, "RxBus.INSTANCE.toObserva¡­        }, 100\)\n        }");
       this.j(uob);
       tB = this.C;
       if (tB == null) {
          a.S("mProgressPublisher");
       }
       uob = tB.subscribe(new CoronaPlayPayPauseElement$d(this));
       a.o(uob, "mProgressPublisher.subsc¡­er.currentPosition\)\n    }");
       this.j(uob);
       g og1 = this.A();
       CoronaPlayPayPauseElement$e uoe = new CoronaPlayPayPauseElement$e(this);
       Objects.requireNonNull(og1);
       b uob1 = PatchProxy.applyOneRefs(uoe, og1, og, "1");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uoe, "consumer");
          uob1 = og1.a.subscribe(uoe);
          a.o(uob1, "mPlayClickSubject.subscribe\(consumer\)");
       }
       this.j(uob1);
       og1 = this.A();
       CoronaPlayPayPauseElement$f uof = new CoronaPlayPayPauseElement$f(this);
       Objects.requireNonNull(og1);
       b uob2 = PatchProxy.applyOneRefs(uof, og1, og, "2");
       if (uob2 != patchProxyRe) {
       }else {
          a.p(uof, "consumer");
          uob2 = og1.b.subscribe(uof);
          a.o(uob2, "mPurchaseBtnClickSubject.subscribe\(consumer\)");
       }
       this.j(uob2);
       tB = this.y;
       if (tB != null) {
          CoronaPlayPayPauseElement tz = this.z;
          if (tz == null) {
             a.S("mFragment");
          }
          tB.P(tz, this.K);
       }
       this.j(b.v(new CoronaPlayPayPauseElement$g(this)));
       return;
    }
    public void m0(boolean p0){
       CoronaPlayPayPauseElement uCoronaPlayP = CoronaPlayPayPauseElement.class;
       if (PatchProxy.isSupport(uCoronaPlayP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCoronaPlayP, "6")) {
          return;
       }
       CoronaPlayPayPauseElement ty = this.y;
       if (ty != null) {
          uCoronaPlayP = this.z;
          if (uCoronaPlayP == null) {
             a.S("mFragment");
          }
          ty.D(uCoronaPlayP, this.K);
       }
       return;
    }
    public final void p0(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement.class, "5")) {
          return;
       }
       if (p0 == null || (p0.length >= 4 && this.u == null)) {
          CoronaPlayPayPauseElement tB = this.B;
          if (tB == null) {
             a.S("mPhoto");
          }
          PhotoDisplayLocationInfo photoDisplay = tB.getPhotoDisplayLocationInfo();
          PhotoDisplayLocationInfo photoDisplay1 = 0x3f000000;
          if (photoDisplay != null && photoDisplay.isLongVideoValid()) {
             photoDisplay1 = photoDisplay.mTopRatio + (photoDisplay.mHeightRatio / (float)2);
          }
          h oh = this.E();
          float f = (photoDisplay1 * (float)p0[3]) + (float)p0[1];
          Objects.requireNonNull(oh);
          h oh1 = h.class;
          if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), oh, oh1, "2")) {
             oh.d.f(Float.valueOf(f));
          }
       }
    label_0067 :
       return;
    }
    public d q(){
       f uof = PatchProxy.apply(null, this, CoronaPlayPayPauseElement.class, "12");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, CoronaPlayPayPauseElement.class, "9")) {
          return;
       }
       CoronaPlayPayPauseElement tD = this.D;
       if (tD == null) {
          a.S("mPlayModule");
       }
       e player = tD.getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPaused()) {
          tD = this.z;
          if (tD == null) {
             a.S("mFragment");
          }
          if (tD.Vg().c()) {
             a uoa = a.d();
             CoronaPlayPayPauseElement tB = this.B;
             if (tB == null) {
                a.S("mPhoto");
             }
             uoa.k(new PlayEvent(tB, PlayEvent$Status.RESUME, 521));
          }
       }
       this.b0();
       tD = this.A;
       if (tD == null) {
          a.S("mCoronaPayPanelSubject");
       }
       tD.onNext(Boolean.FALSE);
       return;
    }
    public c r(){
       g og = PatchProxy.apply(null, this, CoronaPlayPayPauseElement.class, "14");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public final void r0(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaPlayPayPauseElement.class, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "COPYRIGHT_CONTENT_VIP_MASK";
       i3 oi3 = i3.f();
       oi3.d("show_pos", "PORTRAIT");
       oi3.d("button_type", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.mEntity);
       CoronaPlayPayPauseElement tz = this.z;
       if (tz == null) {
          a.S("mFragment");
       }
       u1.M("3029360", tz, 6, uElementPack, uContentPack, null);
       return;
    }
    public final void s0(){
       if (PatchProxy.applyVoid(null, this, CoronaPlayPayPauseElement.class, "4")) {
          return;
       }
       CoronaPlayPayPauseElement tB = this.B;
       if (tB == null) {
          a.S("mPhoto");
       }
       CoronaPlayPayPauseElement tD = this.D;
       String str = "mPlayModule";
       if (tD == null) {
          a.S(str);
       }
       e player = tD.getPlayer();
       a.o(player, "mPlayModule.player");
       long l = b.k(tB, player.getCurrentPosition());
       CoronaPlayPayPauseElement tD1 = this.D;
       if (tD1 == null) {
          a.S(str);
       }
       tD1.getPlayer().seekTo(l);
       return;
    }
    public final void t0(boolean p0){
       CoronaPlayPayPauseElement uCoronaPlayP = CoronaPlayPayPauseElement.class;
       if (PatchProxy.isSupport(uCoronaPlayP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCoronaPlayP, "11")) {
          return;
       }
       String str = (p0)? "LANDSCAPE_PLAYER": "CORONA_DETAIL_PLAYER";
       String str1 = str;
       CoronaPlayPayPauseElement tz = this.z;
       if (tz == null) {
          a.S("mFragment");
       }
       CoronaPlayPayPauseElement tB = this.B;
       if (tB == null) {
          a.S("mPhoto");
       }
       g og = new g(str1, tz, tB, null, null, null, null, null, 248, null);
       a uoa = d.a(0x5f78d73);
       CoronaPlayPayPauseElement tF = this.F;
       if (tF == null) {
          a.S("mActivity");
       }
       uoa.fQ(tF, str, new CoronaPlayPayPauseElement$h(this));
       return;
    }
    public final void u0(){
       CoronaPlayPayPauseElement uCoronaPlayP = CoronaPlayPayPauseElement.class;
       if (PatchProxy.applyVoid(null, this, uCoronaPlayP, "8")) {
          return;
       }
       String str = "mPhoto";
       if (!this.I().a().booleanValue()) {
          CoronaPlayPayPauseElement tB = this.B;
          if (tB == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidOneRefs(tB, this, uCoronaPlayP, "16") && this.G != null) {
             this.G = false;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COPYRIGHT_CONTENT_VIP_MASK";
             i3 oi3 = i3.f();
             oi3.d("show_pos", "PORTRAIT");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tB.mEntity);
             CoronaPlayPayPauseElement tz = this.z;
             if (tz == null) {
                a.S("mFragment");
             }
             u1.D0("3029360", tz, 6, uElementPack, uContentPack, null);
          }
       }
    label_006d :
       uCoronaPlayP = this.D;
       if (uCoronaPlayP == null) {
          a.S("mPlayModule");
       }
       e player = uCoronaPlayP.getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPlaying()) {
          a uoa = a.d();
          CoronaPlayPayPauseElement tB1 = this.B;
          if (tB1 == null) {
             a.S(str);
          }
          uoa.k(new PlayEvent(tB1, PlayEvent$Status.PAUSE, 521));
       }
       uCoronaPlayP = this.t;
       if (uCoronaPlayP != null) {
          int[] ointArray = uCoronaPlayP.k();
          if (ointArray != null) {
             this.p0(ointArray);
          }
       }
       this.c0();
       uCoronaPlayP = this.A;
       if (uCoronaPlayP == null) {
          a.S("mCoronaPayPanelSubject");
       }
       uCoronaPlayP.onNext(Boolean.TRUE);
       return;
    }
}
