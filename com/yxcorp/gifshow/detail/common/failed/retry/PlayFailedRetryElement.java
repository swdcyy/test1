package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import tr7.b;
import rp7.a;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$a;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$b;
import wx9.a;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$c;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$d;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$5;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$e;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jf5.a;
import rq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ur7.h;
import ur7.g;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import ur7.a;
import brd.t;
import t45.d;
import brd.z;
import wx9.c;
import erd.g;
import crd.b;
import qp7.b;
import ub6.b;
import wx9.d;
import zca.j;
import wx9.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import de5.c;
import p5a.e;
import de5.a;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import java.util.Objects;
import java.util.Collection;
import qp7.b1;
import wx9.g;
import io.reactivex.internal.functions.Functions;
import kotlin.jvm.internal.a;
import wx9.f;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import jta.c;
import r7a.f;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import wx9.b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import org.greenrobot.eventbus.a;
import oc6.b;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ekd.p0;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import mrd.a;
import com.yxcorp.gifshow.detail.util.retrylog.a;
import com.kwai.framework.player.core.b;
import wkd.b;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog;
import java.util.UUID;
import java.util.ArrayList;
import java.lang.Long;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$PlayError;
import java.lang.Math;
import java.lang.System;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import com.kwai.video.hodor.Hodor;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$Retry;
import qp7.d;
import ur7.f;
import rn5.a;
import zq6.p;
import as6.a;
import hn5.b;
import qp7.c;
import uw9.o;
import q87.c;
import brd.y;

public class PlayFailedRetryElement extends DispatchBaseElement	// class@001408
{
    public ActivityLifeCircleBundle A;
    public BaseFragment B;
    public QPhoto C;
    public c D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public final BitSet I;
    public long J;
    public a K;
    public boolean L;
    public x M;
    public MilanoContainerEventBus N;
    public final Runnable O;
    public final IMediaPlayer$OnInfoListener P;
    public final b1 Q;
    public final e R;
    public final DefaultLifecycleObserver S;
    public final k T;
    public final int[] t;
    public f u;
    public final c v;
    public GifshowActivity w;
    public boolean x;
    public a y;
    public c z;

    public void PlayFailedRetryElement(a p0){
       super(b.a, p0);
       this.t = new int[3]{500,500,1000};
       this.v = new PlayFailedRetryElement$a(this);
       this.I = new BitSet();
       this.L = false;
       this.O = new PlayFailedRetryElement$b(this);
       this.P = new a(this);
       this.Q = new PlayFailedRetryElement$c(this);
       this.R = new PlayFailedRetryElement$d(this);
       this.S = new PlayFailedRetryElement$5(this);
       this.T = new PlayFailedRetryElement$e(this);
    }
    public void P(a p0){
       this.D = p0.D;
       this.C = p0.c.mPhoto;
       this.B = p0.b;
       this.y = p0.j;
       this.z = p0.k;
       this.A = p0.W;
       this.w = p0.a;
       this.x = p0.C;
       this.u = p0.H;
       this.K = p0.r0;
       this.M = p0.p;
       this.N = p0.v.X;
    }
    public a f0(a p0){
       h oh = PatchProxy.applyOneRefs(p0, this, PlayFailedRetryElement.class, "19");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(p0);
       }
       return oh;
    }
    public void j0(boolean p0){
       c d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.isSupport(playFailedRe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, playFailedRe, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.j(f.f(a.class).observeOn(a).subscribe(new c(this)));
       this.j(f.f(b.class).observeOn(a).subscribe(new d(this)));
       this.j(f.f(j.class).observeOn(a).subscribe(new e(this)));
       this.z.b(this.P);
       this.y.getPlayer().d(this.R);
       PlayFailedRetryElement tz = this.z;
       playFailedRe = this.T;
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoidOneRefs(playFailedRe, tz, c.class, "8")) {
          d = tz.d;
          _monitor_enter(d);
          if (playFailedRe != null && !tz.d.contains(playFailedRe)) {
             tz.d.add(playFailedRe);
          }
          _monitor_exit(d);
       }
       this.i(this.Q);
       b ti = this.i;
       g og1 = new g(this);
       g e = Functions.e;
       Objects.requireNonNull(ti);
       b uob = PatchProxy.applyTwoRefs(og1, e, ti, og, "2");
       if (uob != patchProxyRe) {
       }else {
          a.p(og1, "onNext");
          a.p(e, "onError");
          uob = ti.a.subscribe(og1, e);
          a.o(uob, "retryClickSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob);
       ti = this.i;
       f uof = new f(this);
       Objects.requireNonNull(ti);
       b uob1 = PatchProxy.applyTwoRefs(uof, e, ti, og, "4");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uof, "onNext");
          a.p(e, "onError");
          uob1 = ti.b.subscribe(uof, e);
          a.o(uob1, "seeTipsClickSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       this.A.a(this.S);
       this.u.a(this.v);
       this.j(this.N.W.subscribe(new b(this), e));
       this.b0();
       return;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(PlayFailedRetryElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PlayFailedRetryElement.class, "2")) {
          return;
       }
       this.G = false;
       this.L = false;
       k1.m(this.O);
       return;
    }
    public void m0(boolean p0){
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.isSupport(playFailedRe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, playFailedRe, "5")) {
          return;
       }
       this.y.getPlayer().e(this.R);
       this.z.f(this.P);
       PlayFailedRetryElement tz = this.z;
       playFailedRe = this.T;
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoidOneRefs(playFailedRe, tz, c.class, "9")) {
          c d = tz.d;
          _monitor_enter(d);
          if (playFailedRe != null) {
             tz.d.remove(playFailedRe);
          }
          _monitor_exit(d);
       }
       this.A.d(this.S);
       this.u.c(this.v);
       return;
    }
    public final void n0(int p0){
       String str1;
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.isSupport(playFailedRe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, playFailedRe, "10")) {
          return;
       }
       StringBuilder str = "doBackgroundRetry...";
       switch (p0){
           case 1:
             str1 = "RETRY_DEFAULT";
             break;
           case 2:
             str1 = "RETRY_BY_MANUAL";
             break;
           case 3:
             str1 = "RETRY_BY_LIFECYCLE";
             break;
           case 4:
             str1 = "RETRY_BY_ATTACHED";
             break;
           case 5:
             str1 = "RETRY_BY_NETWORK_CONNECT";
             break;
           case 6:
             str1 = "RETRY_BY_FIRST_ITEM";
             break;
           default:
             str1 = "";
       }
       this.r0(str+str1);
       this.q0();
       boolean b = true;
       this.u0(b);
       this.p0(0);
       if (this.F != null) {
          a.d().k(new PlayEvent(this.C, PlayEvent$Status.RESUME, b, "PlayFailedBackGroundRetry"));
       }
       return;
    }
    public void o0(b p0){
       boolean b;
       String photoId1;
       PlayFailedRetryLog obj1;
       boolean b1;
       PlayFailedRetryLog$Retry retry;
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, playFailedRe, "7")) {
          return;
       }
       this.H = 0;
       this.I.clear();
       Object[] objArray = null;
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, this, playFailedRe, "13")) {
          this.E = true;
          BaseFeed entity = this.C.getEntity();
          boolean b2 = p0.C(this.B.getContext());
          a uoa3 = a.class;
          if (!PatchProxy.isSupport(uoa3) || !PatchProxy.applyVoidTwoRefs(entity, Boolean.valueOf(b2), objArray, uoa3, str)) {
             JsonObject jsonObject = new JsonObject();
             String str1 = (b2)? "weak": "none";
             jsonObject.c0("net_type", str1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = "NET_JUDGE";
             uElementPack.action2 = "NET_JUDGE";
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (entity != null) {
                uContentPack.photoPackage = w1.f(entity);
             }
             u1.u0(6, uElementPack, uContentPack);
          }
          if (this.H().B()) {
             this.u0(1);
          }else {
             this.u0(0);
             this.c0();
          }
          this.K.onNext(Boolean.TRUE);
          this.r0("tryShow retry");
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(p0, this, playFailedRe, "8")) {
          long currentPosit = this.y.getPlayer().getCurrentPosition();
          int i = 0x5091ceb9;
          a uoa1 = b.a(i);
          String photoId = this.C.getPhotoId();
          Objects.requireNonNull(uoa1);
          a obj = PatchProxy.applyOneRefs(photoId, uoa1, uoa, str);
          b = (obj != patchProxyRe)? obj.booleanValue(): uoa1.a.containsKey(photoId);
          if (!b) {
             obj = b.a(i);
             photoId1 = this.C.getPhotoId();
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(photoId1, obj, uoa, "2") && a.b) {
                obj1 = new PlayFailedRetryLog();
                obj1.photoId = photoId1;
                obj1.logId = UUID.randomUUID().toString();
                obj1.playErrors = new ArrayList();
                obj.a.put(photoId1, obj1);
             }
          }
          obj = b.a(i);
          photoId1 = this.C.getPhotoId();
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(uoa)) {
             obj1 = PatchProxy.applyTwoRefs(photoId1, Long.valueOf(currentPosit), obj, uoa, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(obj.a.containsKey(photoId1)){
                PlayFailedRetryLog playFailedRe2 = obj.a.get(photoId1);
                if (playFailedRe2 != null && !q.f(playFailedRe2.playErrors)) {
                   Iterator iterator = playFailedRe2.playErrors.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         PlayFailedRetryLog$PlayError playError1 = iterator.next();
                         if (playError1 != null) {
                            long l = currentPosit - playError1.positionId;
                            if (Math.abs(l) - 1000 <= 0) {
                               b1 = true;
                            }
                         }
                      }
                   }
                }
             }
             b1 = false;
          }else {
             goto label_013c ;
          }
          if (!b1) {
             PlayFailedRetryLog$PlayError playError = new PlayFailedRetryLog$PlayError();
             playError.positionId = currentPosit;
             playError.showTime = System.currentTimeMillis();
             playError.showNetScore = NetworkQualityEstimator.b();
             playError.showCdnNetSpeed = Hodor.instance().getNetSpeedKbpsForPreload();
             playError.showPlayerErrorCode = p0.b;
             playError.showNetHodorCode = p0.c;
             playError.retrys = new ArrayList();
             a uoa2 = b.a(i);
             String photoId2 = this.C.getPhotoId();
             Objects.requireNonNull(uoa2);
             if (PatchProxy.isSupport(uoa) && (PatchProxy.applyVoidThreeRefs(photoId2, Long.valueOf(currentPosit), playError, uoa2, a.class, "4") || (a.b && uoa2.a.containsKey(photoId2)))) {
                PlayFailedRetryLog playFailedRe1 = uoa2.a.get(photoId2);
                if (playFailedRe1 != null) {
                   playFailedRe1 = playFailedRe1.playErrors;
                   if (playFailedRe1 != null) {
                      playError.index = playFailedRe1.size() + 1;
                      playFailedRe1.add(playError);
                   }
                }
             }
          }else {
             retry = new PlayFailedRetryLog$Retry();
             retry.isSuccess = false;
             retry.retryFailHodorErrorCode = p0.b;
             retry.retryFailPlayerErrorCode = p0.c;
             b.a(i).a(this.C.getPhotoId(), currentPosit, retry);
          }
       }
    label_0214 :
       this.L = false;
       return;
    }
    public void p0(long p0){
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.isSupport(playFailedRe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, playFailedRe, "12")) {
          return;
       }
       if (this.G != null) {
          this.r0("is doing retry...");
          return;
       }else {
          this.G = true;
          k1.r(this.O, p0);
          return;
       }
    }
    public d q(){
       f uof = PatchProxy.apply(null, this, PlayFailedRetryElement.class, "21");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, PlayFailedRetryElement.class, "14")) {
          return;
       }
       this.E = false;
       this.b0();
       Boolean fALSE = Boolean.FALSE;
       this.K.onNext(fALSE);
       a.a(this.B, a.g, fALSE);
       RxBus.f.b(new b(false));
       return;
    }
    public c r(){
       g og = PatchProxy.apply(null, this, PlayFailedRetryElement.class, "20");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public void r0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayFailedRetryElement.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("PlayFailedRetryElement", p0+" "+this.C.getUserName(), objArray);
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, PlayFailedRetryElement.class, "15")) {
          return;
       }
       this.q0();
       this.u0(false);
       this.G = false;
       this.H = 0;
       this.I.clear();
       this.J = 0;
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, PlayFailedRetryElement.class, "4")) {
          return;
       }
       long currentPosit = this.y.getPlayer().getCurrentPosition();
       PlayFailedRetryLog$Retry retry = new PlayFailedRetryLog$Retry();
       retry.isManual = this.L;
       retry.startRetryTime = System.currentTimeMillis();
       Object obj = b.a(0x5091ceb9);
       String photoId = this.C.getPhotoId();
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(a.class) && (PatchProxy.applyVoidThreeRefs(photoId, Long.valueOf(currentPosit), retry, obj, a.class, "5") || (a.b && obj.a.containsKey(photoId)))) {
          PlayFailedRetryLog playFailedRe = obj.a.get(photoId);
          if (playFailedRe != null) {
             playFailedRe = playFailedRe.playErrors;
             if (!q.f(playFailedRe)) {
                Iterator iterator = playFailedRe.iterator();
                while (iterator.hasNext()) {
                   PlayFailedRetryLog$PlayError playError = iterator.next();
                   if (playError != null) {
                      long l = playError.positionId - currentPosit;
                      if (Math.abs(l) - 1000 <= 0) {
                         playError.retrys.add(retry);
                         break ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void u0(boolean p0){
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       if (PatchProxy.isSupport(playFailedRe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, playFailedRe, "11")) {
          return;
       }
       if (p0) {
          a.a(this.B, a.g, Boolean.TRUE);
          RxBus.f.b(new b(true));
       }
       this.D.onNext(Boolean.valueOf(p0));
       return;
    }
}
