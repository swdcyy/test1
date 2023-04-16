package com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import nwc.c;
import ooc.r0;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$Companion$scoreCache$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import voc.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.lifecycle.MutableLiveData;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.f;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.content.res.Resources;
import cw9.c;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ooc.j0;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import android.view.View;
import t36.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Double;
import com.yxcorp.gifshow.v3.editor.cover.proportion.GetCoverScoreTask;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import tpc.a;
import java.lang.Throwable;
import w46.b;
import crd.b;
import java.util.List;
import java.lang.Number;
import lnc.q4;
import android.util.LruCache;
import java.lang.StringBuilder;
import java.lang.Iterable;
import brd.t;
import t45.d;
import brd.z;
import tpc.g;
import erd.o;
import tpc.h;
import tpc.i;
import tpc.j;
import java.util.concurrent.TimeUnit;
import brd.w;
import tpc.k;
import tpc.l;
import erd.g;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.lang.UnsatisfiedLinkError;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$prepareProject$1;
import tpc.m;
import msd.l;
import com.kwai.kve.VisionEngine$Handler;
import com.kwai.kve.VisionEngine;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.kve.SmartCoverTaskBuilder;
import java.lang.IllegalStateException;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.os.SystemClock;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$startTime$1;
import ooc.q0;
import nwc.b;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import nwc.n;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.os.Looper;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.NumberFormatException;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$b;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import laa.e;
import mba.m0;
import usd.k;
import usd.q;
import java.util.Iterator;
import trd.l0;

public final class RecommendCoverRepo implements VideoFrameChangeListener, c, r0	// class@000e93
{
    public boolean b;
    public long c;
    public EditorSdk2V2$VideoEditorProject d;
    public final List e;
    public final int f;
    public b g;
    public SmartCoverTaskBuilder h;
    public final MutableLiveData i;
    public double j;
    public final MutableLiveData k;
    public boolean l;
    public final EditorDelegate m;
    public final a n;
    public final c o;
    public final boolean p;
    public static final p q;
    public static final RecommendCoverRepo$a r;

    static {
       RecommendCoverRepo.r = new RecommendCoverRepo$a(null);
       RecommendCoverRepo.q = s.c(RecommendCoverRepo$Companion$scoreCache$2.INSTANCE);
    }
    public void RecommendCoverRepo(EditorDelegate p0,a p1,c p2,boolean p3,boolean p4){
       int i;
       int i1;
       a.p(p0, "editorDelegate");
       a.p(p2, "workspaceDraft");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       o oo = p0.x();
       a.o(oo, "editorDelegate.editorContext");
       this.d = oo.f();
       this.e = new CopyOnWriteArrayList();
       this.i = new MutableLiveData();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.k = mutableLiveD;
       Object[] objArray = new Object[0];
       a.D().w("RecommendCoverRepo", "init: ", objArray);
       String str = "AppEnv.get\(\)";
       if (f.v(p2)) {
          p2 = a.a();
          a.o(p2, str);
          i = (n.z(p2.a()) - a1.d(0x7f070313)) - a1.d(0x7f07028d);
          i1 = a1.d(R.dimen.arg_RES_7f0702a4);
       }else {
          p2 = a.a();
          a.o(p2, str);
          i = n.z(p2.a());
          i1 = a1.d(R.dimen.arg_RES_7f071066);
       }
       c uoc = a.a();
       a.o(uoc, str);
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       this.f = (int)Math.ceil(((double)((float)(i - (i1 * 2)) * 0x3f800000) / (double)c.b(uApplication.getResources(), 0x7f07017f)));
       mutableLiveD.postValue(STATE.INIT);
       this.E();
       Activity context = p0.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       ViewModel viewModel = ViewModelProviders.of(context).get(j0.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­ityViewModel::class.java\)");
       p0.z();
       viewModel.o0().d(this);
       RecommendCoverRepo.B(this, p4, 0, 2, null);
       return;
    }
    public static void B(RecommendCoverRepo p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = false;
       }
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.A(p1, p2);
       return;
    }
    public final void A(boolean p0,boolean p1){
       Object[] obj1;
       RecommendCoverRepo recommendCov;
       z a;
       RecommendCoverRepo recommendCov1;
       double d3;
       double d4;
       double d5;
       RenderPosDetail renderPosDet;
       String recommendTim;
       RecommendCoverRepo j;
       Object obj = this;
       if (PatchProxy.isSupport(RecommendCoverRepo.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, RecommendCoverRepo.class, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("RecommendCoverRepo", "load: ", objArray);
       double d = Double.MIN_VALUE;
       boolean b = (obj.d == null)? true: false;
       if (b) {
          return;
       }else {
          String str = "videoProject";
          String str1 = "";
          if (!p0) {
             if (PatchProxy.isSupport(RecommendCoverRepo.class)) {
                obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), obj, RecommendCoverRepo.class, "5");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else {
                label_0056 :
                   recommendCov = obj.n;
                   if (recommendCov != null) {
                      Cover uCover = recommendCov.v();
                      if (uCover != null) {
                         VideoCoverParam videoCoverPa = uCover.getVideoCoverParam();
                         if (videoCoverPa != null) {
                            recommendTim = videoCoverPa.getRecommendTimePoint();
                            if (recommendTim != null) {
                            label_0070 :
                               if (!TextUtils.x(recommendTim)) {
                                  try{
                                     double d8 = Double.parseDouble(recommendTim);
                                     this.E();
                                     j = obj.j;
                                     if (d8 - j < 0) {
                                        renderPosDet = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(obj.d, d8);
                                        a.o(renderPosDet, "EditorSdk2UtilsV2\n      ¡­erPos\(videoProject, time\)");
                                        RecommendCoverRepo d9 = obj.d;
                                        a.o(d9, str);
                                        GetCoverScoreTask getCoverScor1 = new GetCoverScoreTask(d8, (float)(d8 / j), renderPosDet, false, d9, 8, null);
                                        recommendTim.i = 0;
                                        if (p1) {
                                           obj.k.setValue(STATE.FINISHED);
                                           obj.i.setValue(recommendTim.e());
                                        }else {
                                           obj.k.postValue(STATE.FINISHED);
                                           obj.i.postValue(recommendTim.e());
                                        }
                                        b = false;
                                     }
                                  }catch(java.lang.NumberFormatException e0){
                                     a.D().e("RecommendCoverRepo", "recommendScoreString error", e0);
                                  }
                               }
                            }
                         }
                      }
                   }
                   recommendTim = str1;
                   goto label_0070 ;
                }
             }else {
                goto label_0056 ;
             }
             if (b) {
             label_00df :
                Object[] objArray1 = new Object[i];
                a.D().w("RecommendCoverRepo", "start load", objArray1);
                obj1 = null;
                if (!PatchProxy.applyVoid(obj1, obj, RecommendCoverRepo.class, "7")) {
                   Object[] objArray2 = new Object[i];
                   a.D().w("RecommendCoverRepo", "invokeLoad: ", objArray2);
                   obj.i.postValue(obj1);
                   obj.v(str1);
                   RecommendCoverRepo g = obj.g;
                   if (g != null) {
                      g.dispose();
                   }
                   obj.k.postValue(STATE.RUNNING);
                   recommendCov = PatchProxy.apply(obj1, obj, RecommendCoverRepo.class, "3");
                   if (recommendCov != PatchProxyResult.class) {
                   }else {
                      objArray = new Object[i];
                      a.D().w("RecommendCoverRepo", "getRenderPositionDetail: ", objArray);
                      obj.e.clear();
                      this.E();
                      recommendCov = obj.f;
                      int i1 = 0;
                      while (i1 < recommendCov) {
                         double d1 = (double)obj.f;
                         double d2 = (double)i1;
                         g = obj.j;
                         i = 3;
                         if (PatchProxy.isSupport(RecommendCoverRepo.class)) {
                            recommendCov1 = g;
                            d3 = d2;
                            d4 = d1;
                            a obj2 = PatchProxy.applyThreeRefs(Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(g), this, RecommendCoverRepo.class, "2");
                            if (obj2 != PatchProxyResult.class) {
                               d5 = obj2.doubleValue();
                            label_0186 :
                               double d6 = d5 / obj.j;
                               renderPosDet = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(obj.d, q4.c(i, d5));
                               a.o(renderPosDet, "EditorSdk2UtilsV2.render¡­til.doubleValue\(3, time\)\)");
                               RecommendCoverRepo d7 = obj.d;
                               String str2 = str;
                               a.o(d7, str2);
                               GetCoverScoreTask getCoverScor = new GetCoverScoreTask(d5, (float)d6, renderPosDet, false, d7, 8, null);
                               obj2 = RecommendCoverRepo.r.a().get(d2.c());
                               if (!PatchProxy.applyVoidOneRefs(obj2, d2, GetCoverScoreTask.class, "6") && obj2 != null) {
                                  d2.i = obj2.d;
                               }
                               obj.e.add(d2);
                               i1 = i1 + 1;
                               str = str2;
                               d = Double.MIN_VALUE;
                            }
                         }else {
                            recommendCov1 = g;
                            d3 = d2;
                            d4 = d1;
                         }
                         d1 = d4 - (double)d;
                         d2 = d3 / d1;
                         d2 = d2 * recommendCov1;
                         d5 = q4.c(i, d2);
                         goto label_0186 ;
                      }
                      objArray1 = new Object[0];
                      a.D().w("RecommendCoverRepo", "tasks : "+obj.e, objArray1);
                      recommendCov = obj.e;
                   }
                   a = d.a;
                   t ot = t.fromIterable(recommendCov).subscribeOn(a).observeOn(d.c).flatMap(new g(obj)).flatMap(new h(obj)).flatMap(new i(obj)).map(j.b).buffer(obj.f).timeout(8000, TimeUnit.MILLISECONDS, t.just(obj.e)).observeOn(a);
                   obj.g = ot.subscribe(new k(obj), new l(obj));
                }
             }
          }else {
             goto label_00df ;
          }
          return;
       }
    }
    public final void C(GetCoverScoreTask p0){
       RecommendCoverRepo recommendCov = RecommendCoverRepo.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recommendCov, "8")) {
          return;
       }
       a uoa = this.G();
       String str = "visionengine";
       if (!PatchProxy.applyVoidOneRefs(str, this, recommendCov, "6")) {
          PluginDownloadExtension k = PluginDownloadExtension.k;
          k.a(str);
          if (!Dva.instance().isLoaded(str)) {
             k.s(str, 40);
             Dva uDva = Dva.instance();
             a.o(uDva, "Dva.instance\(\)");
             uDva.getPluginInstallManager().j(str).c();
             Object[] objArray1 = new Object[0];
             a.D().w("RecommendCoverRepo", "load visionenginesuccess", objArray1);
          }
          if (!Dva.instance().isLoaded(str)) {
             Object[] objArray2 = new Object[0];
             a.D().t("RecommendCoverRepo", "rxStartAnalyzing: download lib visionengine failed", objArray2);
             throw new IllegalStateException("visionengine load failed");
          }
       }
       RecommendCoverRepo$prepareProject$1 iNSTANCE = RecommendCoverRepo$prepareProject$1.INSTANCE;
       if (iNSTANCE != null) {
          iNSTANCE = new m(iNSTANCE);
       }
       VisionEngine.setHandler(iNSTANCE);
       VisionEngine.init();
       EditorSdk2Utils.loadVisionEnginePlugin();
       recommendCov = this.h;
       if (recommendCov == null) {
          SmartCoverTaskBuilder smartCoverTa = VisionEngine.createSmartCoverTaskBuilder();
       }
       p0.j(recommendCov);
       Object[] objArray = new Object[0];
       a.D().w("RecommendCoverRepo", "prepareProject time coast"+uoa.invoke().longValue(), objArray);
       return;
    }
    public final void D(){
       String str;
       if (PatchProxy.applyVoid(null, this, RecommendCoverRepo.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecommendCoverRepo", "refresh: ", objArray);
       a value = this.i.getValue();
       if (value != null) {
          str = String.valueOf(value.b());
          if (str != null) {
          label_0031 :
             this.v(str);
             this.c = 0;
             this.F(0);
             o oo = this.m.x();
             a.o(oo, "editorDelegate.editorContext");
             this.d = oo.f();
             RecommendCoverRepo.B(this, true, 0, 2, null);
             return;
          }
       }
       str = "";
       goto label_0031 ;
    }
    public final void E(){
       double videoLength;
       if (PatchProxy.applyVoid(null, this, RecommendCoverRepo.class, "22")) {
          return;
       }
       if (this.m.z() instanceof VideoSDKPlayerView) {
          View view = this.m.z();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
          videoLength = view.getVideoLength();
       }else {
          videoLength = EditorSdk2UtilsV2.getComputedDuration(this.d);
       }
       this.j = videoLength;
       return;
    }
    public final void F(boolean p0){
       RecommendCoverRepo recommendCov = RecommendCoverRepo.class;
       if (PatchProxy.isSupport(recommendCov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recommendCov, "1")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          if (p0 && this.c - Long.MAX_VALUE) {
             this.c = SystemClock.elapsedRealtime();
          }
       }
       return;
    }
    public final a G(){
       Object obj = PatchProxy.apply(null, this, RecommendCoverRepo.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecommendCoverRepo$startTime$1(SystemClock.elapsedRealtime());
    }
    public void Z(){
       q0.q(this);
    }
    public void a(boolean p0){
       b.d(this, p0);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       q0.o(this, p0);
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       RecommendCoverRepo recommendCov = RecommendCoverRepo.class;
       if (PatchProxy.isSupport(recommendCov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recommendCov, "25")) {
          return;
       }
       q0.a(this, p0);
       Object[] objArray = new Object[0];
       a.D().w("RecommendCoverRepo", "beforeNextStep. cancel task", objArray);
       RecommendCoverRepo tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       this.k.postValue(STATE.FINISHED);
       return;
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void k(boolean p0){
       b.a(this, p0);
    }
    public void l(VideoFrameChangeListener$CHANGE_TYPE p0){
       n.b(this, p0);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       q0.n(this, p0, p1, p2, p3, p4);
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, RecommendCoverRepo.class, "23")) {
          return;
       }
       b.e(this);
       this.D();
       return;
    }
    public void o(){
       n.c(this);
    }
    public void onActivityDestroy(){
       q0.f(this);
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       q0.k(this, p0);
    }
    public void q(boolean p0,boolean p1){
       b.c(this, p0, p1);
    }
    public void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2){
       n.d(this, p0, p1, p2);
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void t(){
       b.b(this);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
    public final void v(String p0){
       GeneratedMessageLite$Builder uBuilder;
       VideoCoverParam$b uob;
       m0 om0;
       Boolean uBoolean;
       m0 om01;
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendCoverRepo.class, "11")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       int i = 1;
       if (a.g(Looper.myLooper(), Looper.getMainLooper()) ^ i) {
          PostUtils.D("RecommendCoverRepo", "execute on thered", new IllegalStateException("thread is sub thread"));
       }
       if (!TextUtils.x(p0)) {
          try{
             this.o.d1().n0(Double.parseDouble(p0));
          }catch(java.lang.NumberFormatException e0){
             e0.printStackTrace();
          }
       }else {
          this.o.d1().n0(0xbff0000000000000);
       }
    }
    public void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1){
       RecommendCoverRepo recommendCov = RecommendCoverRepo.class;
       if (PatchProxy.isSupport(recommendCov) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, recommendCov, "18")) {
          return;
       }
       if (p0 == VideoFrameChangeListener$CHANGE_TYPE.VIDEO_CHANGE && p1) {
          this.D();
       }
       return;
    }
    public final MutableLiveData x(){
       return this.k;
    }
    public final MutableLiveData y(){
       return this.i;
    }
    public final void z(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendCoverRepo.class, "10")) {
          return;
       }
       this.i.postValue(p0);
       String str = "";
       String str1 = String.valueOf(p0.b());
       if (str1 == null) {
          str1 = str;
       }
       this.v(str1);
       RecommendCoverRepo tn = this.n;
       if (tn == null || (tn.D() && this.n.p() > 0)) {
          Cover uCover = this.n.v();
          a.m(uCover);
          a.o(uCover, "coverDraft.firstMessage!!");
          VideoCoverParam videoCoverPa = uCover.getVideoCoverParam();
          int i = 0;
          if (videoCoverPa != null) {
             Iterator iterator = q.n1(i, this.n.p()).iterator();
             while (iterator.hasNext()) {
                Cover$b uob = this.n.n(iterator.b());
                VideoCoverParam$b uob1 = videoCoverPa.toBuilder();
                String str2 = String.valueOf(p0.b());
                if (str2 == null) {
                   str2 = str;
                }
                uob1.f(str2);
                uob.i(uob1);
             }
          }else {
             Object[] objArray = new Object[i];
             a.D().t("RecommendCoverRepo", "injectScoreResult: coverDraft.firstMessage.videoCoverParam is null", objArray);
          }
       }
       return;
    }
}
