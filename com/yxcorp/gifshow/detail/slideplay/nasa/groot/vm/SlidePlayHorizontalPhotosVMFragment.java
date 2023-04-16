package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import aw6.c;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.feature.api.danmaku.c;
import pd5.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment$b;
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
import uw9.o;
import java.lang.StringBuilder;
import v6a.z7;
import q87.c;
import qp7.t0;
import com.kwai.robust.PatchProxyResult;
import v6a.o0;
import uy6.h;
import uy6.a;
import uw9.v3;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.l0;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import m9a.f;
import de5.a;
import q3a.a;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import vy6.a;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import al9.b;
import e1a.e;
import com.kwai.slide.play.detail.base.BasePage;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.widget.RelativeLayout;
import as7.b;
import java.lang.System;
import java.io.PrintStream;
import java.lang.Boolean;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist;
import ih5.d;
import h6a.d2;
import eh5.v;
import java.lang.Runnable;
import java.util.Objects;
import je5.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import jf5.a;
import jf5.l;
import k2b.e0;
import x1a.a$a;
import ih5.u;
import h6a.e2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ih5.f;
import ih5.w;
import h6a.c2;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import kp.r1;
import com.yxcorp.gifshow.action.c;
import h6a.b2;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import p5a.e;
import com.kwai.framework.player.core.b;
import android.content.Intent;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import h6a.z1;
import z1.a;
import uw9.p3;
import java.util.Locale;
import java.lang.Integer;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import gc6.k;
import com.kwai.framework.player.core.b$b;
import de5.c;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import zv6.t;
import android.os.Bundle;
import le5.f;
import com.kwai.component.photo.detail.slide.presenter.b;
import jh5.a;
import ih5.c0;
import hd5.d;
import ed5.e;
import h6a.g2;
import h6a.f2;
import vl8.b;
import com.smile.gifshow.annotation.provider.v2.a;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import o56.a;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import android.content.res.Configuration;
import rd5.c;
import brd.t;
import t45.d;
import brd.z;
import h6a.a2;
import erd.g;
import crd.b;
import ix6.c;
import d6a.r;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import p5a.b;

public abstract class SlidePlayHorizontalPhotosVMFragment extends DetailSlidePlayFragment implements c	// class@00172c
{
    public BasePage F;
    public PresenterV2 G;
    public MainThreadScatterPresenterGroup H;
    public PhotoDetailParam I;
    public o0 J;
    public z7 K;
    public PhotoDetailLogger L;
    public QPhoto M;
    public b N;
    public c O;
    public a P;
    public boolean Q;
    public int R;
    public final d S;
    public final b0 T;

    public void SlidePlayHorizontalPhotosVMFragment(){
       super();
       this.O = new c();
       this.P = new a();
       this.S = new SlidePlayHorizontalPhotosVMFragment$a(this);
       this.T = new SlidePlayHorizontalPhotosVMFragment$b(this);
    }
    private void Jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "39")) {
          return;
       }
       SlidePlayHorizontalPhotosVMFragment tL = this.L;
       SlidePlayHorizontalPhotosVMFragment tM = this.M;
       if (tM != null) {
          objArray = tM.mEntity;
       }
       tL.setBaseFeed(objArray).setReferUrlPackage(u1.p());
       this.L.buildUrlPackage(this);
       this.L.setCurrentPlaySoundVolume(this.getActivity());
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "39");
       return;
    }
    private void Kh(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "47")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = "";
       SlidePlayHorizontalPhotosVMFragment tM = this.M;
       String str1 = "null";
       String str2 = (tM == null)? str1: tM.getUserName();
       str = str+str2+" ";
       tM = this.M;
       str2 = (tM == null)? str1: tM.getPhotoId();
       str = str+str2+" fragment: "+this+" playModule: ";
       tM = this.K;
       if (tM != null) {
          z7 b = tM.b;
          if (b != null) {
             str1 = b.toString();
          }
       }
       Object[] objArray = new Object[0];
       oo.w("SlidePlayHorizontalPhotosVMFragment", str+str1+"  "+p0, objArray);
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "47");
       return;
    }
    public abstract t0 Ah();
    public void Bh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "17")) {
          return;
       }
       String str = "15";
       SlidePlayHorizontalPhotosVMFragment slidePlayHor = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str);
       if (slidePlayHor != patchProxyRe) {
       }else if(h.c.a != null){
          slidePlayHor = this.J;
          if (slidePlayHor != null) {
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str);
          }
       }
       slidePlayHor = new o0();
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str);
       this.J = slidePlayHor;
       slidePlayHor.i = this.P;
       slidePlayHor.W2 = this.O;
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          slidePlayHor.E = ty.M0();
       }
       this.J.f = this;
       str = "16";
       slidePlayHor = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str);
       if (slidePlayHor != patchProxyRe) {
       }else if(h.c.a != null){
          slidePlayHor = this.K;
          if (slidePlayHor != null) {
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str);
          }
       }
       z7 oz7 = new z7();
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str);
       this.K = slidePlayHor;
       slidePlayHor.d = this.L;
       this.Jh();
       this.I.getDetailPlayConfig().setUsePlayerKitPlay(f.a(this.I));
       SlidePlayHorizontalPhotosVMFragment tI = this.I;
       a uoa = a.a(this, tI.mPhoto, tI.getDetailPlayConfig(), this.I.enableSlidePlay(), this.I.isThanos());
       uoa.r(this.J.E.r);
       uoa.t(this.L);
       if (this instanceof NasaGrootHorizontalDetailVMFragment) {
          DetailSlidePlayFragment ty1 = this.y;
          if (ty1 != null) {
             ty1.r0(this, uoa);
          }
       }
       this.K.b = uoa;
       this.Kh("createCallerContext after create playModule");
       tI = this.J;
       tI.e = this.S;
       tI.g = this.hh();
       tI = this.J;
       tI.G1 = tI.E.s2;
       tI.Q = this.T;
       tI.L = b.a(this.M, this.x.getDetailCommonParam().getComment(), this.Eh());
       this.J.s1 = new e();
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "17");
       return;
    }
    public abstract void Ch();
    public abstract BasePage Dh();
    public abstract CommentPageListConfig Eh();
    public abstract PresenterV2 Fh();
    public abstract RelativeLayout Gh(View p0);
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "23")) {
          return;
       }
       String str = "SlidePlayHorizontalPhotosVMFragment";
       b.c(str, "didAppear", "start");
       System.out.println("slideFlushBind---didAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayHorizontalPhotosVMFragment tJ = this.J;
          if (tJ != null) {
             tD.i(false, tJ.Z3.booleanValue());
          }
       }
       this.mh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(d.a, new d2(this), this.getClass().getName()+" attached")) {
             this.F.k();
          }
          Objects.requireNonNull(this.D);
       }else {
          this.F.k();
       }
       b.c(str, "didAppear", "end");
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "23");
       return;
    }
    public void Hh(){
       SlidePlayHorizontalPhotosVMFragment tM;
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "7")) {
          return;
       }
       if (this.hh()) {
          tM = this.M;
          tM.setExpTag(d.a(tM.getExpTag()));
       }else {
          tM = this.M;
          tM.setExpTag(d.c(tM.getExpTag()));
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "7");
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       SlidePlayHorizontalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "5");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "5");
          return obj.buildExpTagTrans();
       }
    }
    public abstract View Ih(LayoutInflater p0,ViewGroup p1);
    public final void Lh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "40")) {
          return;
       }
       if (this.M != null && (this.L.hasStartLog() && this.L.getEnterTime() - null > 0)) {
          this.L.setHasUsedEarphone(this.J.x).setProfileFeedOn(this.ih());
          SlidePlayHorizontalPhotosVMFragment tJ = this.J;
          if (tJ != null) {
             o0 e = tJ.E;
             if (e != null) {
                this.L.setConsumeIndex(e.W.b);
             }
          }
          this.K.b.n(this.getUrl(), u1.r(this));
       }
    label_0055 :
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "40");
       return;
    }
    public int M(){
       return 4;
    }
    public void Mh(a$a p0){
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "24")) {
          return;
       }
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.o();
       }
       this.ph();
       tD = this.D;
       if (tD != null) {
          if (!tD.t(d.a) && !this.D.e(u.a, new e2(this), this.getClass().getName()+" detached")) {
             this.F.t();
          }
          this.D.q();
       }else {
          this.F.t();
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "24");
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object[] objArray = null;
       SlidePlayHorizontalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "4");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "4");
          return obj.buildContentPackage();
       }
    }
    public final void Nh(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "43")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().t("HorizontalDetailFragment", "recreate player when "+p0, objArray);
       this.Q = false;
       this.K.b.j();
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "43");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "22")) {
          return;
       }
       String str = "SlidePlayHorizontalPhotosVMFragment";
       b.c(str, "willDisappear", "start");
       if (this.L.hasStartLog()) {
          this.L.exitStayForComments();
       }
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.p();
       }
       this.oh();
       tD = this.D;
       if (tD != null) {
          if (!tD.t(f.a) && !this.D.e(w.a, new c2(this), this.getClass().getName()+" becomesDetached")) {
             this.F.n();
          }
       }else {
          this.F.n();
       }
       tD = this.D;
       if (tD != null) {
          tD.s();
       }
       this.L.fulfillUrlPackage();
       this.Lh();
       c uoc = new c(this.M.getEntity(), this.L.getActualPlayDuration(), this.L.getCommentStayDuration());
       RxBus.f.b(v10);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mActualPlayDuration = this.L.getActualPlayDuration();
       uExtParams.mHyperTagRecoLogInfo = r1.V0(this.M.mEntity);
       c.e(this.o(), 7, this.M.mEntity, uExtParams);
       uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mCommentStayDuration = this.L.getCommentStayDuration();
       c.e(this.o(), 5, this.M.mEntity, uExtParams);
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(this, this.I);
       this.L = photoDetailL;
       this.K.d = photoDetailL;
       this.K.b.t(photoDetailL);
       this.Jh();
       b.c(str, "willDisappear", "end");
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "22");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "21")) {
          return;
       }
       String str = "SlidePlayHorizontalPhotosVMFragment";
       b.c(str, "willAppear", "start");
       System.out.println("slideFlushBind---willAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayHorizontalPhotosVMFragment tJ = this.J;
          if (tJ != null) {
             tD.i(true, tJ.Z3.booleanValue());
          }
       }
       this.nh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(f.a, new b2(this), this.getClass().getName()+" becomesAttached")) {
             this.F.m();
          }
       }else {
          this.F.m();
       }
       this.Hh();
       this.L.startLog().logEnterTime().buildPhotoConsumePage(this.getContext());
       tD = this.D;
       if (tD != null) {
          Objects.requireNonNull(tD);
       }
       b.c(str, "willAppear", "end");
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "21");
       return;
    }
    public ClientContent$ContentPackage Q3(){
       Object[] objArray = null;
       SlidePlayHorizontalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "3");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "3");
          return obj.buildContentPackage();
       }
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "36")) {
          return;
       }
       SlidePlayHorizontalPhotosVMFragment tL = this.L;
       if (tL != null) {
          tL.fulfillUrlPackage();
       }
       tL = this.J;
       if (tL != null) {
          tL.M.onNext(Boolean.TRUE);
       }
       tL = this.I;
       if (tL != null && (tL.getDetailPlayConfig().isSharePlayer() && (this.L.isEventStatLogEnable() && this.getActivity() != null))) {
          FragmentActivity activity = this.getActivity();
          SlidePlayHorizontalPhotosVMFragment tL1 = this.L;
          SlidePlayHorizontalPhotosVMFragment tK = this.K;
          if (tK != null) {
             objArray = tK.b.getPlayer();
          }
          activity.setResult(-1, tL1.buildIntentForSharePlayer(this, objArray));
       }
    label_0052 :
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "36");
       return;
    }
    public SlidePlayLogger d1(){
       return this.L;
    }
    public void f0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "35")) {
          return;
       }
       super.f0();
       SlidePlayHorizontalPhotosVMFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
       }
       tG = this.H;
       if (tG != null) {
          tG.k();
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "35");
       return;
    }
    public int getPage(){
       return 7;
    }
    public String getPageParams(){
       Object[] objArray = null;
       SlidePlayHorizontalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       boolean b = this.ih();
       SlidePlayHorizontalPhotosVMFragment tJ = this.J;
       if (tJ != null) {
          objArray = tJ.E;
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "38");
       return p3.b(obj, b, objArray, new z1(this));
    }
    public String getUrl(){
       SlidePlayHorizontalPhotosVMFragment obj = PatchProxy.applyWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "37");
          return "ks://photo";
       }else {
          Object[] objArray = new Object[]{obj.getUserId(),this.M.getPhotoId(),Integer.valueOf(this.M.getType()),this.M.getExpTag()};
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "37");
          return String.format(Locale.US, "ks://photo/%s/%s/%d/%s", objArray);
       }
    }
    public boolean gh(){
       Object obj = PatchProxy.applyWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.M != null && (this.J != null && this.getActivity() != null))? true: false;
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "29");
       return b;
    }
    public void lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "32")) {
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
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "10")) {
          String str1 = "14";
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str1)) {
             SlidePlayHorizontalPhotosVMFragment tK = this.K;
             if (tK != null) {
                z7 b2 = tK.b;
                if (b2 != null) {
                   e player = b2.getPlayer();
                   o0 b3 = this.J.b;
                   if (b3 != null) {
                      player.removeOnInfoListener(b3);
                      player.f(b3);
                      player.O(b3);
                      b3.e();
                   }
                }
             }
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str1);
          }
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "12")) {
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                SlidePlayHorizontalPhotosVMFragment tJ = this.J;
                if (tJ != null) {
                   o0 c = tJ.c;
                   if (c != null) {
                      activity.getLifecycle().removeObserver(c);
                      c.c();
                   }
                }
             }
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "12");
          }
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "10");
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "32");
       return;
    }
    public void mh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "26")) {
          return;
       }
       this.y.t1().l(this);
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "26");
       return;
    }
    public void nh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "25")) {
          return;
       }
       this.y.t1().p(this, "SlidePlayHorizontalPhotosVMFragment.AttachListenersTag");
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "25");
       return;
    }
    public void oh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "27")) {
          return;
       }
       this.y.t1().t(this, "SlidePlayHorizontalPhotosVMFragment.DetachListenersTag");
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "27");
       return;
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       Object[] objArray2;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "8")) {
          return;
       }
       b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "start");
       super.onActivityCreated(p0);
       SlidePlayHorizontalPhotosVMFragment tI = this.I;
       if (tI == null || tI.mPhoto == null) {
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "8");
          return;
       }else {
          this.Ch();
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "createCallerContext");
          b = true;
          this.wh("createCallerContext", b);
          this.Bh();
          boolean b1 = false;
          this.wh("createCallerContext", b1);
          String str = "createCorePresenter";
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", str);
          this.wh(str, b);
          String str1 = "18";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str1)) {
             if (this.G != null) {
                PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str1);
             }else {
                this.G = this.Fh();
                if (f.n()) {
                   this.G.U7(new b());
                }
                this.G.f(this.getView());
                PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str1);
             }
          }
          this.wh(str, b1);
          if (this.H == null) {
             str = "createPresenter";
             b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", str);
             this.wh(str, b);
             str1 = "19";
             if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str1)) {
                MainThreadScatterPresenterGroup mainThreadSc = new MainThreadScatterPresenterGroup(this.sh());
                this.H = mainThreadSc;
                DetailSlidePlayFragment tD1 = this.D;
                if (tD1 != null) {
                   tD1.a(mainThreadSc);
                }
                this.A.a().f(this.H);
                this.H.c(new g2(this));
                this.H.e(new f2(this));
                this.A.a().e(this.H);
                this.H.j(this.getView());
                PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str1);
             }
             this.wh(str, b1);
          }
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "mCorePresenter.bind");
          str = "corePresenterBind";
          this.wh(str, b);
          int i = 4;
          int i1 = 3;
          int i2 = 5;
          if (h.c.b != null) {
             Object[] objArray1 = new Object[i2];
             objArray1[b1] = this.x;
             objArray1[b] = this.J;
             objArray1[2] = this.K;
             objArray1[i1] = this;
             objArray1[i] = this.getActivity();
             objArray2 = new Object[b];
             objArray2[b1] = new b(this, PresenterV2.class).a(objArray1);
          }else {
             Object[] objArray3 = new Object[i2];
             objArray3[b1] = this.x;
             objArray3[b] = this.J;
             objArray3[2] = this.K;
             objArray3[i1] = this;
             objArray3[i] = this.getActivity();
             objArray2 = objArray3;
          }
          this.G.i(objArray2);
          this.wh(str, b1);
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "mMainThreadScatterPresenterGroup.bind");
          this.wh("scatterPresenterGroupBind", b);
          this.H.i(objArray2);
          this.wh("scatterPresenterGroupBind", b1);
          this.zh();
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "mSlidePage.bind start");
          this.wh("slidePageBind", b);
          this.F.p();
          this.wh("slidePageBind", b1);
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "mSlidePage.bind end");
          a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.SlidePlayHorizontalPhotosVMFragment));
          this.qh();
          DetailSlidePlayFragment tD = this.D;
          if (tD != null) {
             tD.j();
          }
          if (a.d()) {
             SlideDispatchHelper.a(this, this.sh());
          }
          b.c("SlidePlayHorizontalPhotosVMFragment", "onActivityCreated", "end");
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "8");
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "45")) {
          return;
       }
       super.onConfigurationChanged(p0);
       SlidePlayHorizontalPhotosVMFragment tJ = this.J;
       if (tJ != null && this.l != null) {
          boolean b = (p0 != null && p0.orientation == 2)? true: false;
          tJ.V.onNext(Boolean.valueOf(b));
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "45");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.D = this.th(this.y);
       BasePage uBasePage = this.Dh();
       this.F = uBasePage;
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.a(uBasePage);
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, SlidePlayHorizontalPhotosVMFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sh();
       if (obj != null) {
          if (this.E != null) {
             obj.g(false);
             this.E = false;
          }else {
             obj.g(true);
          }
       }
       b.c("SlidePlayHorizontalPhotosVMFragment", "onCreateView", "start");
       super.onCreateView(p0, p1, p2);
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       if (this.N == null) {
          this.N = RxBus.f.f(c.class).observeOn(d.a).subscribe(new a2(this));
       }
       this.I = this.rh();
       if (this.j == null) {
          b.c("SlidePlayHorizontalPhotosVMFragment", "onCreateView", "inflateContentView");
          this.wh("inflateContentView", true);
          View view = this.Ih(p0, p1);
          this.j = view;
          c.e(view);
          this.wh("inflateContentView", false);
          this.F.P0(this.Ah());
          RelativeLayout relativeLayo = this.Gh(this.j);
          r.a(relativeLayo);
          this.F.Q0(relativeLayo);
          this.F.O0(this.getActivity().findViewById(0x1020002));
          this.F.q(this.getContext());
       }
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.I);
       this.L = photoDetailL;
       photoDetailL.logEnterTime();
       SlidePlayHorizontalPhotosVMFragment tI = this.I;
       if (tI != null) {
          PhotoDetailParam mPhoto = tI.mPhoto;
          if (mPhoto != null) {
             this.M = mPhoto;
             mPhoto.startSyncWithFragment(this.m());
             this.Hh();
          }
       }
       tI = this.I;
       if (tI == null || tI.mPhoto == null) {
          this.getActivity().finish();
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "2");
          return this.j;
       }else {
          b.c("SlidePlayHorizontalPhotosVMFragment", "onCreateView", "end");
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "2");
          return this.j;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "34")) {
          return;
       }
       this.F.s();
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.r();
       }
       super.onDestroy();
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "34");
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "33")) {
          return;
       }
       b.c("SlidePlayHorizontalPhotosVMFragment", "onDestroyView", "");
       super.onDestroyView();
       a.d().t(this);
       SlidePlayHorizontalPhotosVMFragment tN = this.N;
       if (tN != null) {
          tN.dispose();
          this.N = objArray;
       }
       this.Lh();
       tN = this.J;
       if (tN != null) {
          tN.b();
       }
       tN = this.K;
       if (tN != null) {
          tN.a();
       }
       this.Kh("onDestroyView player released");
       tN = this.M;
       if (tN != null) {
          tN.setExpTag(d.c(tN.getExpTag()));
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "33");
       return;
    }
    public void onEventMainThread(PlayerVolumeEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayHorizontalPhotosVMFragment.class, "41")) {
          return;
       }
       if (p0 != null && this.J != null) {
          SlidePlayHorizontalPhotosVMFragment tK = this.K;
          if (tK != null) {
             z7 b = tK.b;
             if (b != null) {
                p0 = p0.a;
                if (p0 == PlayerVolumeEvent$Status.MUTE) {
                   b.getPlayer().setVolume(0, 0);
                }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                   this.K.b.getPlayer().setVolume(b.c(this.M), b.c(this.M));
                }
             }
          }
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "41");
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport2(SlidePlayHorizontalPhotosVMFragment.class, "46") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlidePlayHorizontalPhotosVMFragment.class, "46")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       SlidePlayHorizontalPhotosVMFragment tJ = this.J;
       if (tJ != null && this.l != null) {
          tJ.W.onNext(Boolean.valueOf(p0));
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "46");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "30")) {
          return;
       }
       if (this.J != null) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && activity.isFinishing()) {
             this.J.a(this.M, activity);
          }
       }
       super.onPause();
       if (this.L.hasStartLog()) {
          this.L.enterBackground();
          this.L.exitStayForComments();
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "30");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "31")) {
          return;
       }
       super.onResume();
       if (this.L.hasStartLog()) {
          this.L.exitBackground();
       }
       if (this.Q != null && this.J != null) {
          this.Nh("resume");
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "31");
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayHorizontalPhotosVMFragment.class, "28")) {
          return;
       }
       this.y.t1().w(this);
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "28");
       return;
    }
    public abstract void xh(MainThreadScatterPresenterGroup p0);
    public abstract void yh(MainThreadScatterPresenterGroup p0);
    public void zh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "9")) {
          return;
       }
       String str = "13";
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, str)) {
          SlidePlayHorizontalPhotosVMFragment tK = this.K;
          if (tK != null) {
             z7 b = tK.b;
             if (b != null) {
                e player = b.getPlayer();
                o0 b1 = this.J.b;
                if (b1 != null) {
                   player.addOnInfoListener(b1);
                   player.c(b1);
                   player.w(b1);
                }
             }
          }
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, str);
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayHorizontalPhotosVMFragment.class, "11")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && this.J != null) {
             activity.getLifecycle().addObserver(this.J.c);
          }
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "11");
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "9");
       return;
    }
}
