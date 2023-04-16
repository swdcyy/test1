package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import aw6.c;
import pw6.b;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.feature.api.danmaku.c;
import pd5.a;
import h6a.i2;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import jh5.a;
import ih5.c0;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist;
import hd5.d;
import ed5.e;
import h6a.q2;
import java.lang.Runnable;
import h6a.p2;
import uw9.o;
import java.lang.StringBuilder;
import v6a.z7;
import q87.c;
import de5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import p5a.e;
import v6a.o0;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import gc6.k;
import com.kwai.framework.player.core.b$b;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import qp7.t0;
import com.kwai.robust.PatchProxyResult;
import uy6.h;
import uy6.a;
import uw9.v3;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.l0;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import m9a.f;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.utility.Log;
import java.util.Set;
import q3a.a;
import java.util.BitSet;
import hn5.n;
import hn5.m;
import wkd.b;
import gb5.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import al9.b;
import h6a.a;
import vy6.a;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import e1a.e;
import com.kwai.slide.play.detail.base.BasePage;
import as7.b;
import java.lang.System;
import java.io.PrintStream;
import java.lang.Boolean;
import ih5.d;
import h6a.n2;
import eh5.v;
import java.util.Objects;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.RelativeLayout;
import d6a.r;
import com.yxcorp.utility.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rd5.c;
import android.os.Bundle;
import dw6.b;
import je5.d;
import ih5.u;
import h6a.o2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import le5.f;
import com.kwai.component.photo.detail.slide.presenter.b;
import android.os.SystemClock;
import lnc.c1;
import ih5.f;
import ih5.w;
import h6a.m2;
import java.util.Locale;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import kp.r1;
import com.yxcorp.gifshow.action.c;
import e0a.j;
import h6a.k2;
import ekd.k1;
import rh5.a;
import rh5.b;
import h6a.l2;
import android.content.Context;
import jf5.a;
import jf5.l;
import k2b.e0;
import x1a.a$a;
import io.reactivex.subjects.PublishSubject;
import android.content.Intent;
import h6a.h2;
import z1.a;
import uw9.p3;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import de5.c;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import zv6.t;
import vl8.b;
import com.smile.gifshow.annotation.provider.v2.a;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import o56.a;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import android.content.res.Configuration;
import t45.d;
import brd.z;
import h6a.j2;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.w;
import uv8.e1;
import com.yxcorp.gifshow.detail.helper.d;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;

public abstract class SlidePlayPhotoDetailVMFragment extends DetailSlidePlayFragment implements c, b	// class@00172e
{
    public BasePage F;
    public PresenterV2 G;
    public MainThreadScatterPresenterGroup H;
    public c I;
    public a J;
    public PhotoDetailParam K;
    public QPhoto L;
    public boolean M;
    public o0 N;
    public z7 O;
    public View P;
    public PhotoDetailLogger Q;
    public boolean R;
    public int S;
    public final d T;
    public final b0 U;
    public b V;
    public boolean W;
    public boolean X;
    public static final int Y;

    public void SlidePlayPhotoDetailVMFragment(){
       super();
       this.I = new c();
       this.J = new a();
       this.T = new i2(this);
       this.U = new SlidePlayPhotoDetailVMFragment$a(this);
       this.W = false;
       this.X = false;
    }
    private void Rh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "48")) {
          return;
       }
       SlidePlayPhotoDetailVMFragment tQ = this.Q;
       SlidePlayPhotoDetailVMFragment tL = this.L;
       if (tL != null) {
          objArray = tL.mEntity;
       }
       tQ.setBaseFeed(objArray).setReferUrlPackage(u1.p());
       this.Q.buildUrlPackage(this);
       this.Q.setCurrentPlaySoundVolume(this.getActivity());
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "48");
       return;
    }
    private void Sh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "22")) {
          return;
       }
       MainThreadScatterPresenterGroup mainThreadSc = new MainThreadScatterPresenterGroup(this.sh());
       this.H = mainThreadSc;
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.a(mainThreadSc);
       }
       this.A.a().f(this.H);
       this.H.c(new q2(this));
       this.H.e(new p2(this));
       this.A.a().e(this.H);
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "22");
       return;
    }
    private void Th(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "55")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = "";
       SlidePlayPhotoDetailVMFragment tL = this.L;
       String str1 = "null";
       String str2 = (tL == null)? str1: tL.getUserName();
       str = str+str2+" ";
       tL = this.L;
       str2 = (tL == null)? str1: tL.getPhotoId();
       str = str+str2+" fragment: "+this+" playModule: ";
       tL = this.O;
       if (tL != null) {
          z7 b = tL.b;
          if (b != null) {
             str1 = b.toString();
          }
       }
       Object[] objArray = new Object[0];
       oo.w("SlidePlayPhotoDetailVMFragment", str+str1+"  "+p0, objArray);
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "55");
       return;
    }
    private void Wh(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "52")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().t("PhotoDetailFragment", "recreate player when "+p0, objArray);
       this.R = false;
       this.O.b.j();
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "52");
       return;
    }
    public static void xh(SlidePlayPhotoDetailVMFragment p0){
       if (p0.X == null) {
          SlidePlayPhotoDetailVMFragment o = p0.O;
          if (o != null && o.b != null) {
             PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(p0, p0.K);
             p0.Q = photoDetailL;
             o.d = photoDetailL;
             p0.O.b.t(photoDetailL);
             p0.Rh();
          }
       }
       return;
    }
    public void Ah(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "10")) {
          return;
       }
       String str = "14";
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, str)) {
          SlidePlayPhotoDetailVMFragment tO = this.O;
          if (tO != null) {
             z7 b = tO.b;
             if (b != null) {
                e player = b.getPlayer();
                o0 b1 = this.N.b;
                if (b1 != null) {
                   player.addOnInfoListener(b1);
                   player.c(b1);
                   player.w(b1);
                }
             }
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "12")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && this.N != null) {
             activity.getLifecycle().addObserver(this.N.c);
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "12");
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "10");
       return;
    }
    public abstract void Bh();
    public abstract t0 Ch();
    public void Dh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "18")) {
          return;
       }
       if (this.K == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "18");
          return;
       }else {
          String str = "16";
          SlidePlayPhotoDetailVMFragment slidePlayPho = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, str);
          if (slidePlayPho != patchProxyRe) {
          }else if(h.c.a != null){
             slidePlayPho = this.N;
             if (slidePlayPho != null) {
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
             }
          }
          slidePlayPho = new o0();
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
          this.N = slidePlayPho;
          slidePlayPho.i = this.J;
          slidePlayPho.W2 = this.I;
          DetailSlidePlayFragment ty = this.y;
          if (ty != null) {
             slidePlayPho.E = ty.M0();
          }
          this.N.f = this;
          str = "17";
          slidePlayPho = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, str);
          if (slidePlayPho != patchProxyRe) {
          }else if(h.c.a != null){
             slidePlayPho = this.O;
             if (slidePlayPho != null) {
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
             }
          }
          z7 oz7 = new z7();
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str);
          this.O = slidePlayPho;
          slidePlayPho.d = this.Q;
          this.Rh();
          boolean b = true;
          this.X = b;
          this.K.getDetailPlayConfig().setUsePlayerKitPlay(f.a(this.K));
          String str1 = "SlidePlayPhotoDetailVMFragment";
          if (this.L.getCommonMeta() != null && this.L.getCommonMeta().mIsSmallWindowDismissPhoto != null) {
             Log.b(str1, this.L.getUserName()+" set enable continue play");
             this.K.getDetailPlayConfig().setContinuePlayStrategy(b);
          }
          if (this.L.getCommonMeta() != null && this.L.getCommonMeta().mInitPauseFlags != null) {
             Log.b(str1, this.L.getUserName()+" set init play status pause");
             this.K.getDetailPlayConfig().setInitPauseFlags(this.L.getCommonMeta().mInitPauseFlags);
          }
          SlidePlayPhotoDetailVMFragment tK = this.K;
          a uoa = a.a(this, tK.mPhoto, tK.getDetailPlayConfig(), this.K.enableSlidePlay(), this.K.isThanos());
          uoa.r(this.N.E.r);
          uoa.t(this.Q);
          this.O.b = uoa;
          this.Th("createCallerContext after create playModule");
          slidePlayPho = this.L;
          if (slidePlayPho != null && (!slidePlayPho.isImageType() && m.a().FG(this))) {
             b.a(0x8708467).B();
          }
       label_015e :
          this.N.L = b.a(this.L, this.K.getDetailCommonParam().getComment(), this.Ih());
          if (this instanceof a) {
             DetailSlidePlayFragment ty1 = this.y;
             if (ty1 != null) {
                ty1.r0(this, uoa);
             }
          }
          tK = this.N;
          tK.e = this.T;
          tK.g = this.hh();
          tK = this.N;
          tK.G1 = tK.E.s2;
          tK.Q = this.U;
          tK.b1 = this.K.getDetailCommonParam().isFromProfile();
          this.N.s1 = new e();
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "18");
          return;
       }
    }
    public abstract void Eh();
    public abstract BasePage Fh();
    public final void Gh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "4")) {
          return;
       }
       if (this.D == null) {
          this.D = this.th(this.y);
       }
       if (this.F == null) {
          BasePage uBasePage = this.Fh();
          this.F = uBasePage;
          DetailSlidePlayFragment tD = this.D;
          if (tD != null) {
             tD.a(uBasePage);
          }
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "4");
       return;
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "27")) {
          return;
       }
       String str = "SlidePlayPhotoDetailVMFragment";
       b.c(str, "didAppear", "start");
       this.wh("didAppear", true);
       System.out.println("slideFlushBind---didAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayPhotoDetailVMFragment tN = this.N;
          if (tN != null) {
             tD.i(false, tN.Z3.booleanValue());
          }
       }
       this.mh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(d.a, new n2(this), this.getClass().getName()+" attached")) {
             this.F.k();
          }
          Objects.requireNonNull(this.D);
       }else {
          this.F.k();
       }
       this.wh("didAppear", false);
       b.c(str, "didAppear", "end");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "27");
       return;
    }
    public void Hh(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, SlidePlayPhotoDetailVMFragment.class, "6")) {
          return;
       }
       if (this.j != null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "6");
          return;
       }else {
          b.c("SlidePlayPhotoDetailVMFragment", "onCreateView", "inflateContentView");
          this.wh("inflateContentView", true);
          this.j = this.Nh(p0, p1);
          this.wh("inflateContentView", false);
          this.F.P0(this.Ch());
          RelativeLayout relativeLayo = this.Kh(this.j);
          r.a(relativeLayo);
          this.F.Q0(relativeLayo);
          this.F.O0(n.d(this.j).findViewById(0x1020002));
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "6");
          return;
       }
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "45");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "45");
          return obj.buildExpTagTrans();
       }
    }
    public abstract CommentPageListConfig Ih();
    public abstract PresenterV2 Jh();
    public abstract RelativeLayout Kh(View p0);
    public void Lh(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "51")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && (this.N != null && (activity.isFinishing() || activity.hashCode() == p0.b))) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "51");
          return;
       }else {
          p0 = p0.a;
          this.S = (p0 != null)? this.S + 1: this.S - 1;
          if (p0 != null && (this.R == null && this.S >= 1)) {
             if (!PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "53")) {
                Object[] objArray = new Object[0];
                o.C().t("PhotoDetailFragment", "release when another detail create", objArray);
                this.R = true;
                this.O.b.u();
                this.Q.hasReleasePlayerBackground();
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "53");
             }
          }else if(p0 == null && (this.R != null && this.S < 1)){
             this.Wh("detail destroyed");
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "51");
          return;
       }
    }
    public int M(){
       return 4;
    }
    public String M2(){
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "56");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "56");
          return b.j(this.getArguments()).b(QPhoto.class).getPhotoId();
       }
    }
    public void Mh(){
       SlidePlayPhotoDetailVMFragment tL;
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "8")) {
          return;
       }
       if (this.hh()) {
          tL = this.L;
          tL.setExpTag(d.a(tL.getExpTag()));
       }else {
          tL = this.L;
          tL.setExpTag(d.c(tL.getExpTag()));
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "8");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "28")) {
          return;
       }
       String str = "SlidePlayPhotoDetailVMFragment";
       b.c(str, "didDisappear", "start");
       this.wh("didDisappear", true);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.o();
       }
       this.ph();
       tD = this.D;
       if (tD != null) {
          if (!tD.t(d.a) && !this.D.e(u.a, new o2(this), this.getClass().getName()+" detached")) {
             this.F.t();
          }
          this.D.q();
       }else {
          this.F.t();
       }
       this.wh("didDisappear", false);
       b.c(str, "didDisappear", "end");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "28");
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object[] objArray = null;
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "44");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "44");
          return obj.buildContentPackage();
       }
    }
    public abstract View Nh(LayoutInflater p0,ViewGroup p1);
    public final void Oh(LayoutInflater p0,ViewGroup p1,PhotoDetailParam p2,SlidePlayViewModel p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, SlidePlayPhotoDetailVMFragment.class, "1")) {
          return;
       }
       this.W = true;
       this.K = p2;
       this.y = p3;
       this.Eh();
       this.Gh();
       this.Hh(p0, p1);
       this.Ph();
       this.Sh();
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "1");
       return;
    }
    public final void Ph(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "20")) {
          return;
       }
       if (this.G != null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "20");
          return;
       }else {
          this.G = this.Jh();
          if (f.n()) {
             this.G.U7(new b());
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "20");
          return;
       }
    }
    public void Q0(){
       boolean b = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, b, SlidePlayPhotoDetailVMFragment.class, "26")) {
          return;
       }
       String str = "SlidePlayPhotoDetailVMFragment";
       b.c(str, "willDisappear", "start");
       boolean b1 = true;
       b.wh("willDisappear", b1);
       long l = SystemClock.currentThreadTimeMillis();
       if (b.Q.hasStartLog()) {
          b.Q.exitStayForComments();
       }
       c1 uoc1 = new c1("PhotoDetailFragment.becomesDetachedOnPageSelected", false);
       DetailSlidePlayFragment d = b.D;
       if (d != null) {
          d.p();
       }
       this.oh();
       d = b.D;
       if (d != null) {
          if (!d.t(f.a) && !b.D.e(w.a, new m2(b), this.getClass().getName()+" becomesDetached")) {
             b.F.n();
          }
       }else {
          b.F.n();
       }
       d = b.D;
       if (d != null) {
          d.s();
       }
       Object[] objArray1 = new Object[b1];
       objArray1[0] = Integer.valueOf(b.N.d.size());
       uoc1.a(String.format(Locale.US, "listener\(%d¸ö£©", objArray1));
       b.Q.fulfillUrlPackage();
       if (b.L.isSinglePhoto() || b.L.isKtvSong()) {
          b.Q.logAtlasCnt(b1, b1, b1);
       }
       b.Uh(false);
       c uoc = new c(b.L.getEntity(), b.Q.getActualPlayDuration(), b.Q.getCommentStayDuration());
       RxBus.f.b(d);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mActualPlayDuration = b.Q.getActualPlayDuration();
       uExtParams.mHyperTagRecoLogInfo = r1.V0(b.L.mEntity);
       c.e(this.o(), 7, b.L.mEntity, uExtParams);
       uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mCommentStayDuration = b.Q.getCommentStayDuration();
       c.e(this.o(), 5, b.L.mEntity, uExtParams);
       uoc1.c("logStatEvent");
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, j.class, "45");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = j.k;
       }
       if (uBoolean.booleanValue()) {
          b.X = false;
          k1.r(new k2(b), 0);
       }else {
          PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(b, b.K);
          b.Q = photoDetailL;
          b.O.d = photoDetailL;
          b.O.b.t(photoDetailL);
          this.Rh();
       }
       a uoa = new a();
       uoa.mFunctionName = "SlidePlayPhotoDetailVMFragment - willDisappear";
       uoa.mContainer = str;
       uoa.mStartTime = l;
       uoa.mEndTime = SystemClock.currentThreadTimeMillis();
       b.b("FEATURED_PAGE").a(uoa);
       b.wh("willDisappear", false);
       b.c(str, "willDisappear", "end");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "26");
       return;
    }
    public void Q1(){
       boolean b;
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "25")) {
          return;
       }
       String str = "SlidePlayPhotoDetailVMFragment";
       b.c(str, "willAppear", "start");
       b = true;
       this.wh("willAppear", b);
       System.out.println("slideFlushBind---willAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayPhotoDetailVMFragment tN = this.N;
          if (tN != null) {
             tD.i(b, tN.Z3.booleanValue());
          }
       }
       c1 uoc1 = new c1("PhotoDetailFragment.becomesAttachedOnPageSelected", false);
       this.nh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(f.a, new l2(this), this.getClass().getName()+" becomesAttached")) {
             this.F.m();
          }
       }else {
          this.F.m();
       }
       uoc1.c("listeners");
       this.Mh();
       this.Q.startLog().logEnterTime().buildPhotoConsumePage(this.getContext());
       DetailSlidePlayFragment tD1 = this.D;
       if (tD1 != null) {
          Objects.requireNonNull(tD1);
       }
       this.wh("willAppear", false);
       b.c(str, "willAppear", "end");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "25");
       return;
    }
    public ClientContent$ContentPackage Q3(){
       Object[] objArray = null;
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "43");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "43");
          return obj.buildContentPackage();
       }
    }
    public abstract boolean Qh();
    public final void Uh(boolean p0){
       z7 b;
       if (PatchProxy.isSupport2(SlidePlayPhotoDetailVMFragment.class, "49") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlidePlayPhotoDetailVMFragment.class, "49")) {
          return;
       }
       long l = SystemClock.currentThreadTimeMillis();
       SlidePlayPhotoDetailVMFragment tN = this.N;
       if (tN == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "49");
          return;
       }else {
          this.Q.setHasUsedEarphone(tN.x).setProfileFeedOn(this.ih());
          tN = this.N;
          if (tN != null) {
             o0 e = tN.E;
             if (e != null) {
                this.Q.setConsumeIndex(e.W.b);
             }
          }
          if (!p0 || !h.d) {
             b = this.O.b;
             if (b != null) {
                b.n(this.getUrl(), u1.r(this));
             }
          }
          a uoa = new a();
          uoa.mFunctionName = "SlidePlayPhotoDetailVMFragment - logStatEventAndReleaseAsync";
          uoa.mContainer = "SlidePlayPhotoDetailVMFragment";
          uoa.mStartTime = l;
          uoa.mEndTime = SystemClock.currentThreadTimeMillis();
          b.b("FEATURED_PAGE").a(uoa);
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "49");
          return;
       }
    }
    public void Vh(a$a p0){
    }
    public void d0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "24")) {
          return;
       }
       SlidePlayPhotoDetailVMFragment tQ = this.Q;
       if (tQ != null) {
          tQ.fulfillUrlPackage();
       }
       tQ = this.N;
       if (tQ != null) {
          tQ.M.onNext(Boolean.TRUE);
       }
       tQ = this.K;
       if (tQ != null && tQ.getDetailPlayConfig().isSharePlayer()) {
          tQ = this.Q;
          if (tQ != null && (tQ.isEventStatLogEnable() && (this.getActivity() != null && this.O != null))) {
             this.getActivity().setResult(-1, this.Q.buildIntentForSharePlayer(this, this.O.b.getPlayer()));
          }
       }
    label_0056 :
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "24");
       return;
    }
    public SlidePlayLogger d1(){
       return this.Q;
    }
    public void f0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "39")) {
          return;
       }
       super.f0();
       SlidePlayPhotoDetailVMFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
       }
       tG = this.H;
       if (tG != null) {
          tG.k();
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "39");
       return;
    }
    public int getPage(){
       return 7;
    }
    public String getPageParams(){
       Object[] objArray = null;
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       boolean b = this.ih();
       SlidePlayPhotoDetailVMFragment tN = this.N;
       if (tN != null) {
          objArray = tN.E;
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "46");
       return p3.b(obj, b, objArray, new h2(this));
    }
    public String getUrl(){
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "42");
          return "ks://photo";
       }else {
          Object[] objArray = new Object[]{obj.getUserId(),this.L.getPhotoId(),Integer.valueOf(this.L.getType()),this.L.getExpTag()};
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "42");
          return String.format(Locale.US, "ks://photo/%s/%s/%d/%s", objArray);
       }
    }
    public boolean gh(){
       Object obj = PatchProxy.applyWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.L != null && (this.N != null && this.getActivity() != null))? true: false;
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "33");
       return b;
    }
    public void lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "37")) {
          return;
       }
       if (this.G != null && SlidePerformanceExp.c()) {
          this.G.unbind();
       }
       boolean b = false;
       boolean b1 = true;
       if (this.H != null) {
          String str = "scatterPresenterGroupUnBind";
          this.wh(str, b1);
          this.H.n();
          this.wh(str, b);
       }
       this.wh("slidePageUnBind", b1);
       this.F.Y0();
       this.wh("slidePageUnBind", b);
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "11")) {
          String str1 = "15";
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, str1)) {
             if (this.N != null) {
                SlidePlayPhotoDetailVMFragment tO = this.O;
                if (tO != null) {
                   z7 b2 = tO.b;
                   if (b2 != null) {
                      e player = b2.getPlayer();
                      o0 b3 = this.N.b;
                      if (b3 != null) {
                         player.removeOnInfoListener(b3);
                         player.f(b3);
                         player.O(b3);
                         b3.e();
                      }
                   }
                }
             }
             PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str1);
          }
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "13")) {
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                SlidePlayPhotoDetailVMFragment tN = this.N;
                if (tN != null) {
                   o0 c = tN.c;
                   activity.getLifecycle().removeObserver(c);
                   c.c();
                }
             }
             PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "13");
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "11");
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "37");
       return;
    }
    public void mh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "30")) {
          return;
       }
       this.y.t1().l(this);
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "30");
       return;
    }
    public void nh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "29")) {
          return;
       }
       this.y.t1().p(this, "SlidePlayPhotoDetailVMFragment.AttachListenersTag");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "29");
       return;
    }
    public void oh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "31")) {
          return;
       }
       this.y.t1().t(this, "SlidePlayPhotoDetailVMFragment.DetachListenersTag");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "31");
       return;
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "9")) {
          return;
       }
       b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "start");
       super.onActivityCreated(p0);
       SlidePlayPhotoDetailVMFragment tK = this.K;
       if (tK == null || tK.mPhoto == null) {
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "9");
          return;
       }else {
          this.Eh();
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "createCallerContext");
          b = true;
          this.wh("createCallerContext", b);
          this.Dh();
          this.wh("createCallerContext", false);
          String str = "createCorePresenter";
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", str);
          this.wh(str, b);
          View view = this.getView();
          String str1 = "19";
          if (!PatchProxy.applyVoidOneRefsWithListener(view, this, SlidePlayPhotoDetailVMFragment.class, str1)) {
             this.Ph();
             if (!this.G.R1()) {
                this.G.f(view);
             }
             PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str1);
          }
          this.wh(str, false);
          View view1 = this.getView();
          String str2 = "21";
          if (!PatchProxy.applyVoidOneRefsWithListener(view1, this, SlidePlayPhotoDetailVMFragment.class, str2)) {
             if (this.H == null) {
                String str3 = "createPresenter";
                b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", str3);
                this.wh(str3, b);
                this.Sh();
                this.wh(str3, false);
             }
             SlidePlayPhotoDetailVMFragment tH = this.H;
             if (tH.c == null) {
                tH.j(view1);
             }
             PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, str2);
          }
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "mCorePresenter.bind");
          str = "corePresenterBind";
          this.wh(str, b);
          int i = 4;
          int i1 = 3;
          int i2 = 5;
          if (h.c.b != null) {
             Object[] objArray = new Object[i2];
             objArray[0] = this.K;
             objArray[b] = this.N;
             objArray[2] = this.O;
             objArray[i1] = this;
             objArray[i] = this.getActivity();
             objArray1 = new Object[b];
             objArray1[0] = new b(this, PresenterV2.class).a(objArray);
          }else {
             Object[] objArray2 = new Object[i2];
             objArray2[0] = this.K;
             objArray2[b] = this.N;
             objArray2[2] = this.O;
             objArray2[i1] = this;
             objArray2[i] = this.getActivity();
             objArray1 = objArray2;
          }
          this.G.i(objArray1);
          this.wh(str, false);
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "mMainThreadScatterPresenterGroup.bind");
          this.wh("scatterPresenterGroupBind", b);
          this.H.i(objArray1);
          this.wh("scatterPresenterGroupBind", false);
          this.Ah();
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "mSlidePage.bind start");
          this.wh("slidePageBind", b);
          this.F.p();
          this.wh("slidePageBind", false);
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "mSlidePage.bind end");
          a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.SlidePlayPhotoDetailVMFragment));
          this.K.mPhoto.mEntity.startSyncWithFragment(this.m());
          this.qh();
          DetailSlidePlayFragment tD = this.D;
          if (tD != null && this.M == null) {
             tD.j();
          }
          if (a.d()) {
             SlideDispatchHelper.a(this, this.sh());
          }
          this.vh("create", false);
          b.c("SlidePlayPhotoDetailVMFragment", "onActivityCreated", "end");
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "9");
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "36")) {
          return;
       }
       super.onConfigurationChanged(p0);
       SlidePlayPhotoDetailVMFragment tN = this.N;
       if (tN != null && this.l != null) {
          boolean b = (p0 != null && p0.orientation == 2)? true: false;
          tN.V.onNext(Boolean.valueOf(b));
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "36");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.Gh();
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "3");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, SlidePlayPhotoDetailVMFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sh();
       boolean b = true;
       if (obj != null) {
          if (this.E != null) {
             obj.g(false);
             this.E = false;
          }else {
             obj.g(b);
          }
       }
       b.c("SlidePlayPhotoDetailVMFragment", "onCreateView", "start");
       super.onCreateView(p0, p1, p2);
       this.vh("create", b);
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       if (this.V == null) {
          this.V = RxBus.f.f(c.class).observeOn(d.a).subscribe(new j2(this));
       }
       this.K = this.rh();
       this.Hh(p0, p1);
       if (this.F.f == null) {
          this.Bh();
          this.F.q(this.j.getContext());
       }
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.K);
       this.Q = photoDetailL;
       photoDetailL.logEnterTime();
       SlidePlayPhotoDetailVMFragment tK = this.K;
       if (tK != null) {
          PhotoDetailParam mPhoto = tK.mPhoto;
          if (mPhoto != null) {
             this.L = mPhoto;
             mPhoto.startSyncWithFragment(this.m());
             this.Mh();
          }
       }
       tK = this.K;
       if (tK == null || tK.mPhoto == null) {
          this.getActivity().finish();
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "5");
          return this.j;
       }else {
          b.c("SlidePlayPhotoDetailVMFragment", "onCreateView", "end");
          if (this.W != null) {
             this.W = false;
             b.a(-1343064608).z().u(this.K.mPhoto.getPosition());
             Log.g("LaunchOpt2022", "usePreCreatedDetailFragment");
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "5");
          return this.j;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "40")) {
          return;
       }
       b.a(-1917741477).e();
       this.F.s();
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.r();
       }
       super.onDestroy();
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "40");
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayPhotoDetailVMFragment.class, "38")) {
          return;
       }
       String str = "destroy";
       boolean b = true;
       this.vh(str, b);
       b.c("SlidePlayPhotoDetailVMFragment", "onDestroyView", "start");
       super.onDestroyView();
       a.d().t(this);
       SlidePlayPhotoDetailVMFragment tV = this.V;
       if (tV != null) {
          tV.dispose();
          this.V = objArray;
       }
       this.Uh(b);
       SlidePlayPhotoDetailVMFragment tN = this.N;
       if (tN != null) {
          tN.b();
       }
       tN = this.O;
       if (tN != null) {
          tN.a();
       }
       this.Th("onDestroyView player released");
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          ty.t1().d(this);
       }
       tN = this.L;
       if (tN != null) {
          tN.setExpTag(d.c(tN.getExpTag()));
       }
       this.vh(str, false);
       b.c("SlidePlayPhotoDetailVMFragment", "onDestroyView", "end");
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "38");
       return;
    }
    public void onEventMainThread(PlayerVolumeEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayPhotoDetailVMFragment.class, "50")) {
          return;
       }
       if (p0 != null) {
          SlidePlayPhotoDetailVMFragment tO = this.O;
          if (tO != null) {
             z7 b = tO.b;
             if (b != null && b.getPlayer() != null) {
                p0 = p0.a;
                if (p0 == PlayerVolumeEvent$Status.MUTE) {
                   this.O.b.getPlayer().setVolume(0, 0);
                }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                   this.O.b.getPlayer().setVolume(0x3f800000, 0x3f800000);
                }
             }
          }
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "50");
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport2(SlidePlayPhotoDetailVMFragment.class, "54") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlidePlayPhotoDetailVMFragment.class, "54")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       SlidePlayPhotoDetailVMFragment tN = this.N;
       if (tN != null && this.l != null) {
          tN.W.onNext(Boolean.valueOf(p0));
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "54");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "34")) {
          return;
       }
       super.onPause();
       if (this.Q.hasStartLog()) {
          this.Q.enterBackground();
          this.Q.exitStayForComments();
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "34");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "35")) {
          return;
       }
       super.onResume();
       if (this.Q.hasStartLog()) {
          this.Q.exitBackground();
       }
       if (this.R != null && this.N != null) {
          this.Wh("resume");
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "35");
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayPhotoDetailVMFragment.class, "32")) {
          return;
       }
       this.y.t1().w(this);
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "32");
       return;
    }
    public abstract void yh(MainThreadScatterPresenterGroup p0);
    public abstract void zh(MainThreadScatterPresenterGroup p0);
}
