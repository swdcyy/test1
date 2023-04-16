package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import aw6.c;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.util.HashMap;
import com.kwai.feature.api.danmaku.c;
import pd5.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment$a;
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
import v6a.o0;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import jf5.a;
import jf5.l;
import k2b.e0;
import de5.a;
import qp7.t0;
import com.kwai.robust.PatchProxyResult;
import uy6.h;
import uy6.a;
import uw9.v3;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.l0;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import m9a.f;
import q3a.a;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import vy6.a;
import v6a.f8;
import y8c.a;
import brd.y;
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
import h6a.v2;
import eh5.v;
import java.lang.Runnable;
import java.util.Objects;
import java.lang.Integer;
import rd5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import je5.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ih5.u;
import h6a.w2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import x1a.a$a;
import ih5.f;
import ih5.w;
import h6a.u2;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import kp.r1;
import com.yxcorp.gifshow.action.c;
import h6a.t2;
import android.content.Context;
import android.util.SparseIntArray;
import io.reactivex.subjects.PublishSubject;
import p5a.e;
import com.kwai.framework.player.core.b;
import android.content.Intent;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import h6a.r2;
import z1.a;
import uw9.p3;
import java.util.Locale;
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
import h6a.y2;
import h6a.x2;
import vl8.b;
import com.smile.gifshow.annotation.provider.v2.a;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import o56.a;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import brd.t;
import t45.d;
import brd.z;
import h6a.s2;
import erd.g;
import crd.b;
import ix6.c;
import androidx.recyclerview.widget.RecyclerView;
import d6a.r;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.Map;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import p5a.b;

public abstract class SlidePlayVerticalPhotosVMFragment extends DetailSlidePlayFragment implements c	// class@001730
{
    public BasePage F;
    public RecyclerView G;
    public b H;
    public PresenterV2 I;
    public MainThreadScatterPresenterGroup J;
    public PhotoDetailParam K;
    public o0 L;
    public z7 M;
    public PhotoDetailLogger N;
    public QPhoto O;
    public boolean P;
    public int Q;
    public c R;
    public a S;
    public final b0 T;
    public static final Map U;

    static {
       SlidePlayVerticalPhotosVMFragment.U = new HashMap();
    }
    public void SlidePlayVerticalPhotosVMFragment(){
       super();
       this.R = new c();
       this.S = new a();
       this.T = new SlidePlayVerticalPhotosVMFragment$a(this);
    }
    private void Kh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "40")) {
          return;
       }
       SlidePlayVerticalPhotosVMFragment tN = this.N;
       SlidePlayVerticalPhotosVMFragment tO = this.O;
       if (tO != null) {
          objArray = tO.mEntity;
       }
       tN.setBaseFeed(objArray).setReferUrlPackage(u1.p());
       this.N.buildUrlPackage(this);
       this.N.setCurrentPlaySoundVolume(this.getActivity());
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "40");
       return;
    }
    private void Lh(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "48")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = "";
       SlidePlayVerticalPhotosVMFragment tO = this.O;
       String str1 = "null";
       String str2 = (tO == null)? str1: tO.getUserName();
       str = str+str2+" ";
       tO = this.O;
       str2 = (tO == null)? str1: tO.getPhotoId();
       str = str+str2+" fragment: "+this+" playModule: ";
       tO = this.M;
       if (tO != null) {
          z7 b = tO.b;
          if (b != null) {
             str1 = b.toString();
          }
       }
       Object[] objArray = new Object[0];
       oo.w("SlidePlayVerticalPhotosVMFragment", str+str1+"  "+p0, objArray);
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "48");
       return;
    }
    private void Mh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "42")) {
          return;
       }
       if (this.O != null && (this.N.hasStartLog() && this.N.getEnterTime() - null > 0)) {
          this.N.logLeaveTime().setHasUsedEarphone(this.L.x).setProfileFeedOn(this.ih());
          SlidePlayVerticalPhotosVMFragment tL = this.L;
          if (tL != null) {
             o0 e = tL.E;
             if (e != null) {
                this.N.setConsumeIndex(e.W.b);
             }
          }
          this.M.b.n(this.getUrl(), u1.r(this));
       }
    label_0059 :
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "42");
       return;
    }
    private void Oh(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "45")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().t("VerticalDetailFragment", "recreate player when "+p0, objArray);
       this.P = false;
       this.M.b.j();
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "45");
       return;
    }
    public abstract t0 Ah();
    public void Bh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "12")) {
          return;
       }
       String str = "10";
       SlidePlayVerticalPhotosVMFragment slidePlayVer = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str);
       if (slidePlayVer != patchProxyRe) {
       }else if(h.c.a != null){
          slidePlayVer = this.L;
          if (slidePlayVer != null) {
             PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str);
          }
       }
       slidePlayVer = new o0();
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str);
       this.L = slidePlayVer;
       slidePlayVer.i = this.S;
       slidePlayVer.W2 = this.R;
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          slidePlayVer.E = ty.M0();
       }
       this.L.f = this;
       str = "11";
       slidePlayVer = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str);
       if (slidePlayVer != patchProxyRe) {
       }else if(h.c.a != null){
          slidePlayVer = this.M;
          if (slidePlayVer != null) {
             PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str);
          }
       }
       z7 oz7 = new z7();
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str);
       this.M = slidePlayVer;
       slidePlayVer.d = this.N;
       this.Kh();
       this.K.getDetailPlayConfig().setUsePlayerKitPlay(f.a(this.K));
       SlidePlayVerticalPhotosVMFragment tK = this.K;
       a uoa = a.a(this, tK.mPhoto, tK.getDetailPlayConfig(), this.K.enableSlidePlay(), this.K.isThanos());
       uoa.r(this.L.E.r);
       uoa.t(this.N);
       if (this instanceof NasaGrootVerticalDetailVMFragment) {
          DetailSlidePlayFragment ty1 = this.y;
          if (ty1 != null) {
             ty1.r0(this, uoa);
          }
       }
       this.M.b = uoa;
       this.Lh("createCallerContext after create playModule");
       this.L.g = this.hh();
       tK = this.L;
       tK.G1 = tK.E.s2;
       tK.Q = this.T;
       tK.o = this.G;
       tK.o2 = new f8(this.K, this, this.L.C1);
       this.L.L = b.a(this.O, this.K.getDetailCommonParam().getComment(), this.Eh());
       this.L.s1 = new e();
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "12");
       return;
    }
    public abstract void Ch();
    public abstract BasePage Dh();
    public abstract CommentPageListConfig Eh();
    public abstract PresenterV2 Fh();
    public abstract RelativeLayout Gh(View p0);
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "19")) {
          return;
       }
       String str = "SlidePlayVerticalPhotosVMFragment";
       String str1 = "didAppear";
       b.c(str, str1, "start");
       System.out.println("slideFlushBind---didAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayVerticalPhotosVMFragment tL = this.L;
          if (tL != null) {
             tD.i(false, tL.Z3.booleanValue());
          }
       }
       this.mh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(d.a, new v2(this), this.getClass().getName()+" attached")) {
             this.F.k();
          }
          Objects.requireNonNull(this.D);
       }else {
          this.F.k();
       }
       b.c(str, str1, "end");
       this.L.j3.onNext(Integer.valueOf(false));
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "19");
       return;
    }
    public void Hh(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "44")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && (this.L != null && (activity.isFinishing() || activity.hashCode() == p0.b))) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "44");
          return;
       }else {
          p0 = p0.a;
          this.Q = (p0 != null)? this.Q + 1: this.Q - 1;
          if (p0 != null && (this.P == null && this.Q >= 1)) {
             if (!PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "46")) {
                Object[] objArray = new Object[0];
                o.C().t("VerticalDetailFragment", "release when another detail create", objArray);
                this.P = true;
                this.M.b.u();
                this.N.hasReleasePlayerBackground();
                PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "46");
             }
          }else if(p0 == null && (this.P != null && this.Q < 1)){
             this.Oh("detail destroyed");
          }
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "44");
          return;
       }
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       SlidePlayVerticalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "36");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "36");
          return obj.buildExpTagTrans();
       }
    }
    public void Ih(){
       SlidePlayVerticalPhotosVMFragment tO;
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "39")) {
          return;
       }
       if (this.hh()) {
          tO = this.O;
          tO.setExpTag(d.a(tO.getExpTag()));
       }else {
          tO = this.O;
          tO.setExpTag(d.c(tO.getExpTag()));
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "39");
       return;
    }
    public abstract View Jh(LayoutInflater p0,ViewGroup p1);
    public int M(){
       return 4;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "20")) {
          return;
       }
       String str = "SlidePlayVerticalPhotosVMFragment";
       b.c(str, "didDisappear", "start");
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.o();
       }
       this.ph();
       tD = this.D;
       if (tD != null) {
          if (!tD.t(d.a) && !this.D.e(u.a, new w2(this), this.getClass().getName()+" detached")) {
             this.F.t();
          }
          this.D.q();
       }else {
          this.F.t();
       }
       b.c(str, "didDisappear", "end");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "20");
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object[] objArray = null;
       SlidePlayVerticalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "35");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "35");
          return obj.buildContentPackage();
       }
    }
    public void Nh(a$a p0){
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "17")) {
          return;
       }
       String str = "SlidePlayVerticalPhotosVMFragment";
       b.c(str, "willDisappear", "start");
       if (this.N.hasStartLog()) {
          this.N.exitStayForComments();
       }
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.p();
       }
       this.oh();
       tD = this.D;
       if (tD != null) {
          if (!tD.t(f.a) && !this.D.e(w.a, new u2(this), this.getClass().getName()+" becomesDetached")) {
             this.F.n();
          }
       }else {
          this.F.n();
       }
       tD = this.D;
       if (tD != null) {
          tD.s();
       }
       this.N.fulfillUrlPackage();
       this.Mh();
       c uoc = new c(this.O.getEntity(), this.N.getActualPlayDuration(), this.N.getCommentStayDuration());
       RxBus.f.b(v10);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mActualPlayDuration = this.N.getActualPlayDuration();
       uExtParams.mHyperTagRecoLogInfo = r1.V0(this.O.mEntity);
       c.e(this.o(), 7, this.O.mEntity, uExtParams);
       uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mCommentStayDuration = this.N.getCommentStayDuration();
       c.e(this.o(), 5, this.O.mEntity, uExtParams);
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(this, this.K);
       this.N = photoDetailL;
       this.M.d = photoDetailL;
       this.M.b.t(photoDetailL);
       this.Kh();
       b.c(str, "willDisappear", "end");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "17");
       return;
    }
    public void Q1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "16")) {
          return;
       }
       String str = "SlidePlayVerticalPhotosVMFragment";
       b.c(str, "willAppear", "start");
       System.out.println("slideFlushBind---willAppear, fag="+this);
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          SlidePlayVerticalPhotosVMFragment tL = this.L;
          if (tL != null) {
             tD.i(true, tL.Z3.booleanValue());
          }
       }
       this.nh();
       tD = this.D;
       if (tD != null) {
          if (!tD.e(f.a, new t2(this), this.getClass().getName()+" becomesAttached")) {
             this.F.m();
          }
       }else {
          this.F.m();
       }
       this.Ih();
       this.N.startLog().logEnterTime().buildPhotoConsumePage(this.getContext());
       o0 o2 = this.L.o2;
       Objects.requireNonNull(o2);
       if (!PatchProxy.applyVoidWithListener(objArray, o2, f8.class, "2")) {
          o2.A.clear();
          PatchProxy.onMethodExit(f8.class, "2");
       }
       DetailSlidePlayFragment tD1 = this.D;
       if (tD1 != null) {
          Objects.requireNonNull(tD1);
       }
       b.c(str, "willAppear", "end");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "16");
       return;
    }
    public ClientContent$ContentPackage Q3(){
       Object[] objArray = null;
       SlidePlayVerticalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "34");
          return objArray;
       }else {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "34");
          return obj.buildContentPackage();
       }
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "31")) {
          return;
       }
       SlidePlayVerticalPhotosVMFragment tN = this.N;
       if (tN != null) {
          tN.fulfillUrlPackage();
       }
       tN = this.L;
       if (tN != null) {
          tN.M.onNext(Boolean.TRUE);
       }
       tN = this.K;
       if (tN != null && (tN.getDetailPlayConfig().isSharePlayer() && (this.N.isEventStatLogEnable() && this.getActivity() != null))) {
          FragmentActivity activity = this.getActivity();
          SlidePlayVerticalPhotosVMFragment tN1 = this.N;
          SlidePlayVerticalPhotosVMFragment tM = this.M;
          if (tM != null) {
             objArray = tM.b.getPlayer();
          }
          activity.setResult(-1, tN1.buildIntentForSharePlayer(this, objArray));
       }
    label_0052 :
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "31");
       return;
    }
    public SlidePlayLogger d1(){
       return this.N;
    }
    public void f0(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "32")) {
          return;
       }
       super.f0();
       SlidePlayVerticalPhotosVMFragment tI = this.I;
       if (tI != null) {
          tI.destroy();
       }
       tI = this.J;
       if (tI != null) {
          tI.k();
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "32");
       return;
    }
    public int getPage(){
       return 7;
    }
    public String getPageParams(){
       Object[] objArray = null;
       SlidePlayVerticalPhotosVMFragment obj = PatchProxy.applyWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       boolean b = this.ih();
       SlidePlayVerticalPhotosVMFragment tL = this.L;
       if (tL != null) {
          objArray = tL.E;
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "37");
       return p3.b(obj, b, objArray, new r2(this));
    }
    public String getUrl(){
       SlidePlayVerticalPhotosVMFragment obj = PatchProxy.applyWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O;
       if (obj == null) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "18");
          return "ks://photo";
       }else {
          Object[] objArray = new Object[]{obj.getUserId(),this.O.getPhotoId(),Integer.valueOf(this.O.getType()),this.O.getExpTag()};
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "18");
          return String.format(Locale.US, "ks://photo/%s/%s/%d/%s", objArray);
       }
    }
    public boolean gh(){
       Object obj = PatchProxy.applyWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.O != null && (this.L != null && this.getActivity() != null))? true: false;
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "25");
       return b;
    }
    public void lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "28")) {
          return;
       }
       if (this.I != null && SlidePerformanceExp.c()) {
          this.I.unbind();
       }
       boolean b = false;
       boolean b1 = true;
       if (this.J != null) {
          String str = "scatterPresenterGroupUnBind";
          this.wh(str, b1);
          this.J.n();
          this.wh(str, b);
       }
       this.wh("slidePageUnBind", b1);
       this.F.Y0();
       this.wh("slidePageUnBind", b);
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "5")) {
          String str1 = "9";
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str1)) {
             if (this.L != null) {
                SlidePlayVerticalPhotosVMFragment tM = this.M;
                if (tM != null) {
                   z7 b2 = tM.b;
                   if (b2 != null) {
                      e player = b2.getPlayer();
                      o0 b3 = this.L.b;
                      if (b3 != null) {
                         player.removeOnInfoListener(b3);
                         player.f(b3);
                         player.O(b3);
                         b3.e();
                      }
                   }
                }
             }
             PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str1);
          }
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "7")) {
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                SlidePlayVerticalPhotosVMFragment tL = this.L;
                if (tL != null) {
                   o0 c = tL.c;
                   activity.getLifecycle().removeObserver(c);
                   c.c();
                }
             }
             PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "7");
          }
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "5");
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "28");
       return;
    }
    public void mh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "22")) {
          return;
       }
       this.y.t1().l(this);
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "22");
       return;
    }
    public void nh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "21")) {
          return;
       }
       this.y.t1().p(this, "SlidePlayHorizontalPhotosVMFragment.AttachListenersTag");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "21");
       return;
    }
    public void oh(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "23")) {
          return;
       }
       this.y.t1().t(this, "SlidePlayHorizontalPhotosVMFragment.DetachListenersTag");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "23");
       return;
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       Object[] objArray2;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "3")) {
          return;
       }
       b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "start");
       super.onActivityCreated(p0);
       SlidePlayVerticalPhotosVMFragment tK = this.K;
       if (tK == null || tK.mPhoto == null) {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "3");
          return;
       }else {
          this.Ch();
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "createCallerContext");
          b = true;
          this.wh("createCallerContext", b);
          this.Bh();
          boolean b1 = false;
          this.wh("createCallerContext", b1);
          String str = "createCorePresenter";
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", str);
          this.wh(str, b);
          String str1 = "13";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str1)) {
             if (this.I != null) {
                PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str1);
             }else {
                this.I = this.Fh();
                if (f.n()) {
                   this.I.U7(new b());
                }
                this.I.f(this.getView());
                PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str1);
             }
          }
          this.wh(str, b1);
          if (this.J == null) {
             str = "createPresenter";
             b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", str);
             this.wh(str, b);
             str1 = "14";
             if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str1)) {
                MainThreadScatterPresenterGroup mainThreadSc = new MainThreadScatterPresenterGroup(this.sh());
                this.J = mainThreadSc;
                DetailSlidePlayFragment tD1 = this.D;
                if (tD1 != null) {
                   tD1.a(mainThreadSc);
                }
                this.A.a().f(this.J);
                this.J.c(new y2(this));
                this.J.e(new x2(this));
                this.A.a().e(this.J);
                this.J.j(this.getView());
                PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str1);
             }
             this.wh(str, b1);
          }
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "mCorePresenter.bind");
          str = "corePresenterBind";
          this.wh(str, b);
          int i = 4;
          int i1 = 3;
          int i2 = 5;
          if (h.c.b != null) {
             Object[] objArray1 = new Object[i2];
             objArray1[b1] = this.K;
             objArray1[b] = this.L;
             objArray1[2] = this.M;
             objArray1[i1] = this;
             objArray1[i] = this.getActivity();
             objArray2 = new Object[b];
             objArray2[b1] = new b(this, PresenterV2.class).a(objArray1);
          }else {
             Object[] objArray3 = new Object[i2];
             objArray3[b1] = this.K;
             objArray3[b] = this.L;
             objArray3[2] = this.M;
             objArray3[i1] = this;
             objArray3[i] = this.getActivity();
             objArray2 = objArray3;
          }
          this.I.i(objArray2);
          this.wh(str, b1);
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "mMainThreadScatterPresenterGroup.bind");
          this.wh("scatterPresenterGroupBind", b);
          this.J.i(objArray2);
          this.wh("scatterPresenterGroupBind", b1);
          this.zh();
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "mSlidePage.bind start");
          this.wh("slidePageBind", b);
          this.F.p();
          this.wh("slidePageBind", b1);
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "mSlidePage.bind end");
          a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.SlidePlayVerticalPhotosVMFragment));
          this.qh();
          DetailSlidePlayFragment tD = this.D;
          if (tD != null) {
             tD.j();
          }
          if (a.d()) {
             SlideDispatchHelper.a(this, this.sh());
          }
          b.c("SlidePlayVerticalPhotosVMFragment", "onActivityCreated", "end");
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "3");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "1")) {
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
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, SlidePlayVerticalPhotosVMFragment.class, "2");
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
       b.c("SlidePlayVerticalPhotosVMFragment", "onCreateView", "start");
       super.onCreateView(p0, p1, p2);
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       if (this.H == null) {
          this.H = RxBus.f.f(c.class).observeOn(d.a).subscribe(new s2(this));
       }
       this.K = this.rh();
       if (this.j == null) {
          b.c("SlidePlayVerticalPhotosVMFragment", "onCreateView", "inflateContentView");
          this.wh("inflateContentView", true);
          View view = this.Jh(p0, p1);
          this.j = view;
          c.e(view);
          this.wh("inflateContentView", false);
          this.G = this.j.findViewById(0x7f0a0aeb);
          this.F.P0(this.Ah());
          RelativeLayout relativeLayo = this.Gh(this.j);
          r.a(relativeLayo);
          this.F.Q0(relativeLayo);
          this.F.O0(this.getActivity().findViewById(0x1020002));
          this.F.q(this.getContext());
       }
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.K);
       this.N = photoDetailL;
       photoDetailL.logEnterTime();
       SlidePlayVerticalPhotosVMFragment tK = this.K;
       if (tK != null) {
          PhotoDetailParam mPhoto = tK.mPhoto;
          if (mPhoto != null) {
             this.O = mPhoto;
             mPhoto.startSyncWithFragment(this.m());
             this.Ih();
          }
       }
       tK = this.K;
       if (tK == null || tK.mPhoto == null) {
          this.getActivity().finish();
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "2");
          return this.j;
       }else {
          b.c("SlidePlayVerticalPhotosVMFragment", "onCreateView", "end");
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "2");
          return this.j;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "30")) {
          return;
       }
       this.F.s();
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          tD.r();
       }
       super.onDestroy();
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "30");
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "29")) {
          return;
       }
       String str = "SlidePlayVerticalPhotosVMFragment";
       b.c(str, "onDestroyView", "start");
       super.onDestroyView();
       a.d().t(this);
       SlidePlayVerticalPhotosVMFragment tH = this.H;
       if (tH != null) {
          tH.dispose();
          this.H = objArray;
       }
       this.Mh();
       SlidePlayVerticalPhotosVMFragment tO = this.O;
       if (tO != null && this.L != null) {
          SlidePlayVerticalPhotosVMFragment.U.put(tO.getPhotoId(), this.L.n);
       }
       tO = this.L;
       if (tO != null) {
          tO.b();
       }
       tO = this.M;
       if (tO != null) {
          tO.a();
       }
       this.Lh("onDestroyView player released");
       tO = this.O;
       if (tO != null) {
          tO.setExpTag(d.c(tO.getExpTag()));
       }
       b.c(str, "onDestroyView", "end");
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "29");
       return;
    }
    public void onEventMainThread(PlayerVolumeEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayVerticalPhotosVMFragment.class, "43")) {
          return;
       }
       if (p0 != null) {
          SlidePlayVerticalPhotosVMFragment tM = this.M;
          if (tM != null) {
             z7 b = tM.b;
             if (b != null) {
                p0 = p0.a;
                if (p0 == PlayerVolumeEvent$Status.MUTE) {
                   b.getPlayer().setVolume(0, 0);
                }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                   this.M.b.getPlayer().setVolume(b.c(this.O), b.c(this.O));
                }
             }
          }
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "43");
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport2(SlidePlayVerticalPhotosVMFragment.class, "47") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlidePlayVerticalPhotosVMFragment.class, "47")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       SlidePlayVerticalPhotosVMFragment tL = this.L;
       if (tL != null && this.l != null) {
          tL.W.onNext(Boolean.valueOf(p0));
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "47");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "26")) {
          return;
       }
       if (this.L != null) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && activity.isFinishing()) {
             this.L.a(this.O, activity);
          }
       }
       super.onPause();
       if (this.N.hasStartLog()) {
          this.N.enterBackground();
          this.N.exitStayForComments();
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "26");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "27")) {
          return;
       }
       super.onResume();
       if (this.N.hasStartLog()) {
          this.N.exitBackground();
       }
       if (this.P != null && this.L != null) {
          this.Oh("resume");
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "27");
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoidWithListener(null, this, SlidePlayVerticalPhotosVMFragment.class, "24")) {
          return;
       }
       this.y.t1().w(this);
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "24");
       return;
    }
    public abstract void xh(MainThreadScatterPresenterGroup p0);
    public abstract void yh(MainThreadScatterPresenterGroup p0);
    public void zh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "4")) {
          return;
       }
       String str = "8";
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, str)) {
          SlidePlayVerticalPhotosVMFragment tM = this.M;
          if (tM != null) {
             z7 b = tM.b;
             if (b != null) {
                e player = b.getPlayer();
                o0 b1 = this.L.b;
                if (b1 != null) {
                   player.addOnInfoListener(b1);
                   player.c(b1);
                   player.w(b1);
                }
             }
          }
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, str);
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, SlidePlayVerticalPhotosVMFragment.class, "6")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && this.L != null) {
             activity.getLifecycle().addObserver(this.L.c);
          }
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "6");
       }
       PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "4");
       return;
    }
}
