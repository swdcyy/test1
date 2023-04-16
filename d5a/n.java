package d5a.n;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.String;
import e5a.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Map;
import qrd.l1;
import vi5.h;
import lq9.a;
import uw9.o;
import q87.c;
import java.util.Objects;
import java.lang.Boolean;
import gi5.d;
import com.kwai.feature.api.corona.player.model.LandscapeParam;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.presenter.landscape.PlayerKitException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import wx6.d;
import p5a.c;
import f5a.a;
import com.kwai.robust.PatchProxyResult;
import bm5.g$a;
import bm5.g$a$a;
import w85.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import az6.a;
import k2b.e0;
import fm5.a;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.corona.CoronaApiExperimentUtil;
import z85.a;
import bm5.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bm5.g$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.k;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import uc6.c;
import android.graphics.Bitmap;
import java.lang.Integer;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import zl5.c;
import zl5.b;
import qvb.n0;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse;
import tkd.b;
import tkd.d;
import cm5.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bm5.h;
import com.yxcorp.gifshow.widget.SwipeLayout;
import joc.a0;
import ge5.d;
import joc.z;
import zca.j;
import vt5.c;
import io.reactivex.subjects.PublishSubject;
import d5a.j;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import crd.a;
import d5a.k;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class n implements PluginInstallerUIHandler$d	// class@001e88
{
    public final a b;
    public final LandscapeEntranceVMPresenter c;
    public final boolean d;
    public final long e;
    public final Ref$BooleanRef f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final a j;

    public void n(LandscapeEntranceVMPresenter p0,boolean p1,long p2,Ref$BooleanRef p3,String p4,boolean p5,boolean p6,a p7){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       super();
       this.b = p7;
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       linkedHashMa.put("isShowLoadingDialog", String.valueOf(this.f.element));
       LandscapeEntranceVMPresenter.c9(this.c, "onShowFailDialog", this.d, this.e, "UiLoad", null, 0, linkedHashMa, 16, null);
       return;
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       LandscapeEntranceVMPresenter landscapeEnt1;
       String str4;
       n on;
       c uoc;
       n on1;
       LandscapeEntranceVMPresenter t1;
       c uoc1;
       String str5;
       NasaSlideParam nasaSlidePar;
       NasaSlideSerialParam mCommercialA;
       Activity activity;
       boolean b2;
       LandscapeEntranceVMPresenter t2;
       LandscapeEntranceVMPresenter u1;
       a a;
       c obj1;
       boolean b3;
       n obj = this;
       String str = "2";
       if (PatchProxy.applyVoid(null, obj, n.class, str)) {
          return;
       }
       a.e(obj.g, "loadPluginTime");
       n c = obj.c;
       boolean i = 0;
       if (c.O == null) {
          Object[] objArray = new Object[i];
          o.C().w("LandscapeEntrancePresenter", "enter landScape fail: notAttach", objArray);
          return;
       }else {
          n h = obj.h;
          n i1 = obj.i;
          n b = obj.b;
          n g = obj.g;
          Objects.requireNonNull(c);
          LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
          if (PatchProxy.isSupport(landscapeEnt)) {
             landscapeEnt1 = landscapeEnt;
             if (PatchProxy.applyVoidFourRefs(Boolean.valueOf(h), Boolean.valueOf(i1), b, g, c, LandscapeEntranceVMPresenter.class, "13")) {
             label_063b :
                obj = this;
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                linkedHashMa.put("isShowLoadingDialog", String.valueOf(obj.f.element));
                LandscapeEntranceVMPresenter.c9(obj.c, "onSucceed", obj.d, obj.e, "UiLoad", null, 1, linkedHashMa, 16, null);
                return;
             }
          }else {
             landscapeEnt1 = landscapeEnt;
          }
          d uod = new d();
          LandscapeEntranceVMPresenter t = c.t;
          String str1 = "mPhoto";
          if (t == null) {
             a.S(str1);
          }
          LandscapeParam landscapePar = new LandscapeParam(t);
          t = c.u;
          if (t == null) {
             a.S("mPlayModule");
          }
          e player = t.getPlayer();
          String str2 = 1;
          boolean b1 = (player == null || player.isPaused() != str2)? true: false;
          landscapePar.setMSyncPlayState(b1);
          t = c.v;
          String str3 = "mPhotoDetailParam";
          if (t == null) {
             a.S(str3);
          }
          if (!t.getDetailPlayConfig().usePlayerKitPlayer()) {
             str4 = "No use playerkit !!,biztype: ";
             LandscapeEntranceVMPresenter v = c.v;
             if (v == null) {
                a.S(str3);
             }
             ExceptionHandler.handleCaughtException(new PlayerKitException(str4+v.getBizType()));
          }
          if (c.X8()) {
             LandscapeEntranceVMPresenter u = c.u;
             if (u == null) {
                a.S("mPlayModule");
             }
             uod = u.w();
             Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.components.playerkit.QPhotoSessionKeyGen");
             str4 = null;
          }else {
             t = c.u;
             if (t == null) {
                a.S("mPlayModule");
             }
             obj1 = t.d();
          }
          a uoa = a.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.applyVoidTwoRefs(b, uod, c, landscapeEnt1, "14")) {
             on = h;
             uoc = str4;
             on1 = g;
          }else {
             g$a uoa1 = g$a.R.a();
             a = a.a;
             u1 = c.x;
             on = h;
             t2 = c.t;
             if (t2 == null) {
                a.S(str1);
             }
             Objects.requireNonNull(a);
             uoc = str4;
             obj1 = PatchProxy.applyTwoRefs(u1, t2, a, uoa, "10");
             on1 = g;
             if (obj1 != patchProxyRe) {
                b3 = obj1.booleanValue();
             }else {
                a.p(t2, "qPhoto");
                b3 = (!a.c(t2, u1) && !t2.isPayCourse())? true: false;
             }
             uoa1.e(b3);
             g$a uoa2 = uoa1.l(uod);
             uoa2.O = c.X8();
             landscapeEnt1 = c.C;
             String str6 = "mFragment";
             if (landscapeEnt1 == null) {
                a.S(str6);
             }
             uoa2.w(landscapeEnt1.getPage());
             landscapeEnt1 = c.w;
             if (landscapeEnt1 != null) {
                nasaSlidePar = landscapeEnt1.getNasaSlideParam();
                if (nasaSlidePar != null) {
                   nasaSlidePar = nasaSlidePar.mSourcePage;
                   if (nasaSlidePar != null) {
                   label_0164 :
                      Activity obj2 = PatchProxy.applyOneRefs(nasaSlidePar, uoa2, g$a.class, str);
                      if (obj2 != patchProxyRe) {
                         uoa2 = obj2;
                      }else {
                         a.p(nasaSlidePar, "source");
                         uoa2.a = nasaSlidePar;
                      }
                      landscapeEnt1 = c.v;
                      if (landscapeEnt1 == null) {
                         a.S(str3);
                      }
                      uoa2.l = landscapeEnt1.mSource;
                      landscapeEnt1 = c.C;
                      if (landscapeEnt1 == null) {
                         a.S(str6);
                      }
                      uoa2.x(landscapeEnt1.o());
                      landscapeEnt1 = c.C;
                      if (landscapeEnt1 == null) {
                         a.S(str6);
                      }
                      uoa2.n(landscapeEnt1.M());
                      uoa2.f(false);
                      landscapeEnt1 = c.C;
                      if (landscapeEnt1 == null) {
                         a.S(str6);
                      }
                      uoa2.v(landscapeEnt1.h5());
                      uoa2.h = true;
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      Object obj3 = PatchProxy.applyTwoRefs(landscapeEnt1, t1, a, uoa, "4");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || t1.isPayCourse())? false: a.a(landscapeEnt1);
                      }
                      uoa2.q(b2);
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      obj3 = PatchProxy.applyTwoRefs(landscapeEnt1, t1, a, uoa, "1");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || t1.isPayCourse())? false: a.a(landscapeEnt1);
                      }
                      uoa2.c(b2);
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      a obj4 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "3");
                      if (obj4 != patchProxyRe) {
                         b2 = obj4.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         if (a.A(t1)) {
                            if (t2 != null) {
                               nasaSlidePar = t2.getNasaSlideParam();
                               if (nasaSlidePar != null) {
                                  nasaSlidePar = nasaSlidePar.mNasaSlideSerialParam;
                                  if (nasaSlidePar != null) {
                                     mCommercialA = nasaSlidePar.mCommercialActiveCallback;
                                  label_0252 :
                                     if (!TextUtils.isEmpty(mCommercialA) && CoronaApiExperimentUtil.d.a()) {
                                        b2 = true;
                                     }
                                  }
                               }
                            }
                            CharSequence uCharSequenc = null;
                            goto label_0252 ;
                         }
                      label_0262 :
                         b2 = false;
                      }
                      uoa2.y = b2;
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      Object obj5 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "5");
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || (t1.isPayCourse() || (!a.b(t2) && (a.a(landscapeEnt1) || a.d(t1)))))? true: false;
                      }
                      uoa2.r(b2);
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      obj5 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "2");
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || (!t1.isPayCourse() && (!a.b(t2) && (a.a(landscapeEnt1) || a.d(t1)))))? true: false;
                      }
                      uoa2.j(b2);
                      uoa2.g(true);
                      uoa2.i(true);
                      landscapeEnt1 = c.x;
                      obj2 = PatchProxy.applyOneRefs(landscapeEnt1, a, uoa, "15");
                      if (obj2 != patchProxyRe) {
                         b2 = obj2.booleanValue();
                      }else if(landscapeEnt1 != null){
                         obj4 = landscapeEnt1.i();
                         if (obj4 != null && obj4.i == 1) {
                            b2 = true;
                         }
                      }
                      b2 = false;
                      uoa2.h(b2);
                      landscapeEnt1 = c.x;
                      obj2 = PatchProxy.applyOneRefs(landscapeEnt1, a, uoa, "16");
                      if (obj2 != patchProxyRe) {
                         b2 = obj2.booleanValue();
                      }else if(landscapeEnt1 != null){
                         obj4 = landscapeEnt1.i();
                         if (obj4 != null && obj4.j == 1) {
                            b2 = true;
                         }
                      }
                      b2 = false;
                      uoa2.k(b2);
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      obj5 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "9");
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || (t1.isPayCourse() || a.b(t2)))? false: true;
                      }
                      uoa2.B = b2;
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      obj5 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "6");
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || (t1.isPayCourse() || (!a.b(t2) && (a.a(landscapeEnt1) || a.d(t1)))))? true: false;
                      }
                      uoa2.E = b2;
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      t2 = c.w;
                      obj5 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, t2, a, a.class, "7");
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || (t1.isPayCourse() || (!a.b(t2) && (a.a(landscapeEnt1) || a.d(t1)))))? true: false;
                      }
                      uoa2.C = b2;
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      obj3 = PatchProxy.applyTwoRefs(landscapeEnt1, t1, a, uoa, "8");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || t1.isPayCourse())? false: a.a(landscapeEnt1);
                      }
                      uoa2.J = b2;
                      landscapeEnt1 = c.t;
                      if (landscapeEnt1 == null) {
                         a.S(str1);
                      }
                      uoa2.k = landscapeEnt1.isPayCourse() ^ 1;
                      landscapeEnt1 = c.t;
                      if (landscapeEnt1 == null) {
                         a.S(str1);
                      }
                      uoa2.x = a.A(landscapeEnt1);
                      uoa2.z = c.b9(b);
                      landscapeEnt1 = c.x;
                      t1 = c.t;
                      if (t1 == null) {
                         a.S(str1);
                      }
                      obj3 = PatchProxy.applyThreeRefs(landscapeEnt1, t1, c.w, a, a.class, "11");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.booleanValue();
                      }else {
                         a.p(t1, "qPhoto");
                         b2 = (a.c(t1, landscapeEnt1) || t1.isPayCourse())? false: a.a(landscapeEnt1);
                      }
                      uoa2.p(b2);
                      obj2 = c.getActivity();
                      a.m(obj2);
                      a.o(obj2, "activity!!");
                      g.R.a(obj2, uoa2.a());
                   }
                }
             }
             str5 = "";
             goto label_0164 ;
          }
          RxBus f = RxBus.f;
          t1 = c.t;
          if (t1 == null) {
             a.S(str1);
          }
          f.b(new k(t1));
          landscapeEnt1 = c.u;
          if (landscapeEnt1 == null) {
             a.S("mPlayModule");
          }
          e player1 = landscapeEnt1.getPlayer();
          float f1 = 0x3f800000;
          if (player1 != null) {
             IKwaiMediaPlayer iKwaiMediaPl = player1.getIKwaiMediaPlayer();
             if (iKwaiMediaPl != null) {
                f1 = iKwaiMediaPl.getSpeed(f1);
             }
          }
          landscapePar.setMPlayerSpeed(f1);
          landscapePar.setMPanelIsShowed(true);
          if (CoronaExperimentUtilKt.q()) {
             uoc1 = c.Y8();
             Bitmap uBitmap = (uoc1 != null)? uoc1.a(): null;
             landscapePar.setMPlayerCover(uBitmap);
          }
          str5 = (i1 != null)? "BUTTON": "GRAVITY";
          landscapePar.setMEnterLandscapeMode(str5);
          landscapePar.setMPayCourseTrailFinishShow(c.W);
          landscapePar.setMPayCourseStartTime(c.X);
          uoc1 = c.Y8();
          Integer integer = (uoc1 != null)? Integer.valueOf(uoc1.d()): null;
          landscapePar.setMRenderType(integer);
          landscapePar.setMFullTimeSessionId(on1);
          landscapeEnt1 = c.w;
          if (landscapeEnt1 != null) {
             nasaSlidePar = landscapeEnt1.getNasaSlideParam();
             if (nasaSlidePar != null) {
                nasaSlidePar = nasaSlidePar.mNasaSlideSerialParam;
                if (nasaSlidePar != null) {
                   mCommercialA = nasaSlidePar.mCommercialActiveCallback;
                label_054e :
                   landscapePar.setMCommercialCallback(mCommercialA);
                   landscapeEnt1 = c.T;
                   i oi = (landscapeEnt1 != null)? landscapeEnt1.X0(): null;
                   landscapeEnt1 = c.t;
                   if (landscapeEnt1 == null) {
                      a.S(str1);
                   }
                   if (a.v(landscapeEnt1) && (c.b9(b) && oi instanceof c)) {
                      uoc1 = oi.D;
                      if (uoc1 instanceof b) {
                         landscapePar.setMClusterSerialFeed(uoc1.L0());
                      }
                   }
                   landscapePar.setMManualSharePlayer((c.X8() ^ 1));
                   activity = c.getActivity();
                   Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                   Activity uActivity = activity;
                   b2 = true;
                   c.V = d.a(-2032246691).bl(uActivity, landscapePar, uoc, on, oi);
                   t1 = c.K;
                   int i2 = 15;
                   if (t1 != null) {
                      t1.n(false, i2);
                   }
                   t1 = c.J;
                   if (t1 != null) {
                      a0 uoa0 = t1.b();
                      if (uoa0 != null) {
                         uoa0.a(i2);
                      }
                   }
                   c.Z8(b2);
                   t2 = c.t;
                   if (t2 == null) {
                      a.S(str1);
                   }
                   t = c.u;
                   if (t == null) {
                      a.S("mPlayModule");
                   }
                   player = t.getPlayer();
                   i = (player != null && player.isPlaying() == b2)? true: false;
                   f.b(new j(t2, b2, i));
                   c.P = d.a(0x2e5315fc).A00(c.getActivity());
                   u1 = c.U;
                   landscapeEnt1 = c.V;
                   PublishSubject publishSubje = (landscapeEnt1 != null)? landscapeEnt1.c(): null;
                   a.m(publishSubje);
                   g e = Functions.e;
                   u1.c(publishSubje.subscribe(new j(c), e));
                   u1 = c.U;
                   landscapeEnt1 = c.V;
                   publishSubje = (landscapeEnt1 != null)? landscapeEnt1.f(): null;
                   a.m(publishSubje);
                   u1.c(publishSubje.subscribe(new k(c), e));
                   goto label_063b ;
                }
             }
          }
          mCommercialA = null;
          goto label_054e ;
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       h.e(this);
       this.f.element = true;
       return;
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       h.g(this);
    }
    public void p(){
       h.c(this);
    }
}
