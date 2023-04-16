package com.yxcorp.gifshow.camera.record.video.RecordFragment;
import oc9.b0;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.video.RecordFragment$c;
import com.yxcorp.gifshow.camera.record.video.RecordFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.System;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Long;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import com.yxcorp.gifshow.camera.record.base.b;
import yb9.b;
import java.util.Objects;
import qi9.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.models.Business;
import java.lang.Boolean;
import oh9.a;
import com.kwai.camerasdk.models.Page;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import oh9.t0;
import java.lang.Runnable;
import java.lang.Integer;
import java.lang.Float;
import kuaishou.perf.page.impl.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import qg9.a;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import yh9.j;
import w46.b;
import e17.i;
import java.lang.Number;
import oh9.o0;
import tkd.b;
import tkd.d;
import om6.r;
import oc9.a0;
import qi9.f;
import oh9.q0;
import com.yxcorp.gifshow.camerasdk.j$p;
import com.yxcorp.gifshow.camera.record.video.q;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.utility.AsyncTask$Status;
import com.yxcorp.utility.AsyncTask;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.media.model.CameraConfig;
import wd9.a;
import yi9.a;
import yi9.a$a;
import java.io.File;
import lnc.s6;
import com.kwai.framework.abtest.f;
import lq.i;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import maa.a;
import laa.m0;
import ce9.l;
import tg9.g;
import bh9.s;
import wc9.v;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ri9.a;
import android.os.SystemClock;
import qi9.q1;
import com.kwai.camerasdk.preprocess.CropAndFlipProcessor;
import com.kwai.camerasdk.models.GlProcessorGroup;
import l65.a;
import com.kwai.camerasdk.Daenerys;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import xi9.n;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import aj9.d;
import qr4.i;
import qr4.k$j;
import v16.b;
import v16.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j65.d;
import com.kwai.camerasdk.models.RecordMode;
import com.kwai.camerasdk.models.DaenerysCaptureConfig;
import java.lang.Math;
import com.kwai.sdk.switchconfig.a;
import j65.c;
import j65.g;
import j65.e;
import ui9.j;
import lnc.a1;
import java.lang.AssertionError;
import com.yxcorp.gifshow.camera.record.video.RecordFragment$b;
import com.yxcorp.gifshow.fragment.d;
import java.lang.Void;
import com.kwai.video.westeros.models.EffectDescription;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import r16.a;
import lnc.s;
import vf9.j0;
import qi9.b1;
import od9.c;
import ug9.c;
import android.content.Context;
import nh9.c;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.camera.record.video.r;
import java.util.concurrent.Callable;
import brd.t;
import brd.w;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import t45.d;
import brd.z;
import oh9.s0;
import com.yxcorp.gifshow.camera.record.video.o;
import erd.g;
import com.yxcorp.gifshow.camera.record.video.s;
import oh9.r0;
import com.yxcorp.gifshow.camera.record.video.p;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;

public abstract class RecordFragment extends CameraBaseFragment implements b0	// class@000f72
{
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public RecordFragment$c G;
    public boolean H;
    public b I;
    public AsyncTask J;
    public final f K;
    public static final int L;

    public void RecordFragment(){
       super();
       this.G = new RecordFragment$c(this);
       this.K = new RecordFragment$a(this);
    }
    public void A0(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "14")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "CameraBaseFragment";
       a.D().w(str, "onCaptureStop\(\)", objArray);
       if (this.q.isRecording()) {
          if (this.F != null) {
             objArray1 = new Object[i];
             a.D().w(str, "is stopping, return", objArray1);
             return;
          }else if(!this.wh()){
             objArray1 = new Object[i];
             a.D().w(str, "wait effectiveRecord, return", objArray1);
             return;
          }else {
             Object[] objArray2 = new Object[i];
             PostUtils.onEvent("RecordFragment", "record_pause", objArray2);
             boolean b = true;
             this.F = b;
             Object[] objArray3 = new Object[]{"encode_type",CameraLogger.c(this.q.P()),"cost",Long.valueOf((System.currentTimeMillis() - System.currentTimeMillis()))};
             PostUtils.onEvent("RecordFragment", "stop_recording", objArray3);
             Iterator iterator = this.za().iterator();
             long l = 0;
             while (iterator.hasNext()) {
                t ot = iterator.next();
                if (ot instanceof b0) {
                   ot.A0();
                   long l1 = ot.ie();
                   if (l1 > 0) {
                      l = l1;
                   }
                }
             }
             this.ih().h().a();
             RecordFragment tG = this.G;
             Objects.requireNonNull(tG);
             if (l > 0 && tG.a - l < 0) {
                i = 1;
             }
             if (i) {
                this.G.b = l;
             }else {
                this.q.stopRecording();
             }
          }
       }else {
          Iterator iterator1 = this.za().iterator();
          while (iterator1.hasNext()) {
             t ot1 = iterator1.next();
             if (ot1 instanceof b0) {
                ot1.A0();
             }
          }
       }
       return;
    }
    public final void Ah(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordFragment.class, "31")) {
          return;
       }
       CameraBaseFragment tq = this.q;
       if (tq != null) {
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoid(objArray, tq, j.class, "60") && tq.z == null) {
             tq.C = false;
             tq.M1(false, false);
          }
       }
       return;
    }
    public boolean Cd(){
       return this.E;
    }
    public void E0(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "20")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.E0();
          }
       }
       return;
    }
    public c E9(){
       c obj = PatchProxy.apply(null, this, RecordFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.E9();
       obj.l0 = Business.kVideoRecord;
       obj.m0 = 0;
       return obj;
    }
    public boolean H5(){
       return this.H;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onCaptureStart\(\)", objArray);
       this.gh();
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.I7();
          }
       }
       return;
    }
    public boolean Kc(){
       Object obj = PatchProxy.apply(null, this, RecordFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.q.R() && (!this.q.B() && !this.q.isRecording())) {
          a f = a.f;
          if (this.y.d(f).c != null && this.y.d(f).b != null) {
             obj = 1;
          label_004b :
             Iterator iterator = this.za().iterator();
             boolean b1 = false;
             while (iterator.hasNext()) {
                t ot = iterator.next();
                if (ot instanceof b0) {
                   b1 = ot.Kc();
                   if (b1) {
                      break ;
                   }
                }
             }
             if (!obj || !b1) {
                b = false;
             }
             return b;
          }
       }
       obj = 0;
       goto label_004b ;
    }
    public Page Nb(){
       Page kPhotoPage = (this.B == 5)? Page.kPhotoPage: Page.kRecordPage;
       return kPhotoPage;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "15")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "onCaptureReset\(\)", objArray);
       this.F = i;
       this.C = i;
       if (this.q != null && (this.getActivity() != null && (this.q.B() || this.q.isRecording()))) {
          Object[] objArray1 = new Object[i];
          PostUtils.onEvent("RecordFragment", "record_cancel", objArray1);
          this.q.E(true);
       }
    label_0047 :
       this.mh(new t0(this));
       this.ih().h().a();
       this.G.a();
       return;
    }
    public boolean R0(){
       CameraBaseFragment obj = PatchProxy.apply(null, this, RecordFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj != null && (!obj.M() || this.F != null)) {
          return true;
       }
       Iterator iterator = this.za().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          t ot = iterator.next();
          if (ot instanceof b0 && ot.R0()) {
             break ;
          }
       }
       return true;
    }
    public void T1(boolean p0){
       if (PatchProxy.isSupport(RecordFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordFragment.class, "21")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.T1(p0);
          }
       }
       return;
    }
    public void X7(int p0,float p1){
       if (PatchProxy.isSupport(RecordFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, RecordFragment.class, "13")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.X7(p0, p1);
          }
       }
       if (p1 - 0x3f800000 >= 0) {
          this.A0();
       }
       return;
    }
    public void d5(int p0){
       if (PatchProxy.isSupport(RecordFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordFragment.class, "6")) {
          return;
       }
       this.H = true;
       this.B = p0;
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.d5(p0);
          }
       }
       if (this.isResumed()) {
          this.P1();
       }
       this.H = false;
       return;
    }
    public void e2(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "16")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "onCaptureFinish\(\)", objArray);
       if (this.E != null) {
          objArray1 = new Object[i];
          a.D().w("CameraBaseFragment", "isFinishRecording return", objArray1);
          return;
       }else {
          d.d("postVideoToEditorMonitor").n();
          d.d("postVideoToEditorMonitor").g("captureFinishToPrepareData");
          PageMonitor.INSTANCE.onInit(VideoEditPreviewV3Fragment.class);
          boolean b = true;
          this.E = b;
          if (this.q.S() && (!a.a(this.y) && !this.y.d(a.d.a()).a())) {
             objArray = new Object[i];
             a.D().w("CameraBaseFragment", "isRecordFinish return", objArray);
             this.E = i;
             return;
          }else if(this.q.isRecording()){
             Object[] objArray2 = new Object[i];
             a.D().w("CameraBaseFragment", "recording, stop record first", objArray2);
             if (!this.wh()) {
                objArray = new Object[i];
                a.D().w("CameraBaseFragment", "isEffectiveRecord return", objArray);
                this.E = i;
                return;
             }else {
                this.A0();
             }
          }
          objArray = new Object[]{"encode_type",CameraLogger.c(this.q.P()),"cost",Long.valueOf((System.currentTimeMillis() - System.currentTimeMillis()))};
          PostUtils.onEvent("RecordFragment", "stop_recording", objArray);
          if (!this.q.B() && this.y.d(j.i).a - null <= 0) {
             objArray = new Object[i];
             a.D().t("CameraBaseFragment", "no record data found, error", objArray);
             this.P1();
             i.a(R.style.arg_RES_7f11066a, 0x7f10398c);
             this.E = i;
             return;
          }else {
             Iterator iterator = this.za().iterator();
             while (iterator.hasNext()) {
                t ot = iterator.next();
                if (ot instanceof b0) {
                   ot.e2();
                }
             }
             this.ih().h().a();
             this.Ah();
             objArray1 = new Object[i];
             a.D().w("CameraBaseFragment", "show loading dialog", objArray1);
             this.th();
             return;
          }
       }
    }
    public int getRecordDuration(){
       o0 obj = PatchProxy.apply(null, this, RecordFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y.d(o0.d).b;
       if (obj > 0) {
          int i = (int)obj;
          this.C = i;
          return i;
       }else {
          CameraBaseFragment tq = this.q;
          if (tq != null && tq.B()) {
             RecordFragment tC = this.C;
             if (tC > null) {
                return tC;
             }
          }
          int i1 = d.a(-831446984).uK(this.B);
          this.C = i1;
          return i1;
       }
    }
    public long ie(){
       return a0.a(this);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "5")) {
          return;
       }
       this.ph();
       this.q.I(this.K);
       super.onDestroyView();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "4")) {
          return;
       }
       if (this.q.isRecording() || this.I != null) {
          this.qh();
          this.A0();
       }
       super.onPause();
       this.q.f(new q0(this));
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "3")) {
          return;
       }
       super.onResume();
       this.mh(new q(this));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecordFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.q.G(this.K);
       return;
    }
    public final void ph(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "18")) {
          return;
       }
       RecordFragment tJ = this.J;
       if (tJ != null && (tJ.f() != AsyncTask$Status.FINISHED && !this.J.g())) {
          Object[] objArray = new Object[0];
          a.D().t("CameraBaseFragment", "cancel current build task!", objArray);
          this.J.a(true);
          this.J = null;
       }
    label_0036 :
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "22")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.q1();
          }
       }
       return;
    }
    public boolean q2(){
       Iterator obj = PatchProxy.apply(null, this, RecordFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.za().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          t ot = obj.next();
          if (ot instanceof b0 && !ot.q2()) {
             break ;
          }
       }
       return false;
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "9")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.qb();
          }
       }
       return;
    }
    public final void qh(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "38")) {
          return;
       }
       RecordFragment tI = this.I;
       if (tI != null) {
          if (!tI.isDisposed()) {
             this.I.dispose();
          }
          this.I = null;
       }
       return;
    }
    public void rh(int p0){
       if (PatchProxy.isSupport(RecordFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordFragment.class, "1")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f100dd7);
       this.P1();
       PostUtils.x("createmp4", "recorder error ="+p0);
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "19")) {
          return;
       }
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.s0();
          }
       }
       return;
    }
    public final void sh(int p0){
       a$a obj1;
       a uoa;
       String obj2;
       long l1;
       Object[] objArray1;
       d uod;
       Object obj4;
       boolean b2;
       b v;
       a j;
       Object[] objArray5;
       RecordFragment obj = this;
       boolean i = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(RecordFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, RecordFragment.class, "35")) {
          return;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.D().w("CameraBaseFragment", "doStartCapture:"+i, objArray);
       this.qh();
       long l = System.currentTimeMillis();
       c uoc = obj.q.n();
       int i2 = 1;
       boolean b = (this.Ve().mEnableStannis != null && (obj.y.d(a.f).b == null && this.ih().d(a.i).a == null))? true: false;
       uoc.D = b;
       CameraBaseFragment q = obj.q;
       String str = null;
       if (PatchProxy.isSupport(RecordFragment.class)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, RecordFragment.class, "36");
          if (obj1 != patchProxyRe) {
          label_0202 :
             Objects.requireNonNull(q);
             uoa = a.class;
             obj2 = PatchProxy.applyOneRefs(obj1, q, j.class, "47");
             if (obj2 != patchProxyRe) {
                i = obj2.booleanValue();
                l1 = l;
             }else {
                long l2 = SystemClock.uptimeMillis();
                str = "], duration = [";
                String str1 = "], speedRate = [";
                String str2 = "]";
                l1 = l;
                Object[] objArray2 = new Object[0];
                q1.C().w("CameraSDK", "startRecordingWithAudio, enableAudio = ["+obj1.g()+"], cacheDir = ["+obj1.a()+str+obj1.b()+str1+obj1.e()+"], rotation = ["+obj1.d()+"], startRecordDelayMs = ["+obj1.f()+str2, objArray2);
                if (q.z != null) {
                   i = false;
                }else {
                   a h = obj1.h;
                   boolean i3 = obj1.d();
                   if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(h), Integer.valueOf(i3), q, j.class, "140")) {
                      if (h == null && q.d0 == null) {
                         q.d0 = new CropAndFlipProcessor();
                         q.m.c(q.d0, GlProcessorGroup.kRecorderGroup);
                      }
                      q.c2(h, i3, q.d0);
                   }
                   q.M1(obj1.g(), true);
                   b uob = q.p1();
                   boolean b1 = uob.B();
                   j r = q.r;
                   String str3 = (r == null)? null: r.getFaceMagicEncodeProfile();
                   obj1.m = str3;
                   VideoContext videoContext = VideoContext.class;
                   obj2 = PatchProxy.applyOneRefs(obj1, uob, b.class, "2");
                   long l3 = l2;
                   if (obj2 != patchProxyRe) {
                      i3 = obj2.booleanValue();
                   }else {
                      Object[] objArray3 = new Object[0];
                      str1 = "RecorderHelper";
                      q1.C().w(str1, "startRecording\(\) called with: cacheDir = ["+obj1.a()+str+obj1.b()+str1+obj1.e()+str2, objArray3);
                      if (obj1.a() != null && (obj1.b() > 0 && obj1.e() - null > 0)) {
                         if (uob.l()) {
                            objArray3 = new Object[0];
                            q1.C().t(str1, "Last recording activity is not finished, busy.", objArray3);
                            i3 = false;
                         }else {
                            uob.n = true;
                            if (!uob.a) {
                               uob.n();
                               uob.a = System.currentTimeMillis();
                            }
                            uob.m(false);
                            uob.b = obj1.b();
                            if (uob.h == null) {
                               uob.h = new d();
                            }
                            i1 = uob.i.size();
                            b h2 = uob.h;
                            h2.a = i1;
                            h2.b = obj1.e();
                            v = uob.v;
                            uob.v = v + 1;
                            obj2 = obj1.a()+"/"+uob.a+"_"+i1+"_"+v;
                            uob.h.c = obj2+".mp4";
                            uob.h.k = obj1.d();
                            uob.h.j = obj1.l;
                            j = obj1.j;
                            uob.u = j;
                            if (j > null) {
                               uob.k();
                            }
                            if (!uob.i.isEmpty()) {
                               v = uob.i;
                               uod = v.get((v.size() - 1));
                               h2 = uob.h;
                               h2.d = uod.d;
                               h2.e = uod.e;
                               Object[] objArray4 = new Object[0];
                               q1.C().w(str1, "startRecording, last recorded duration: "+uob.h.e, objArray4);
                            }
                            uob.f = true;
                            v = uob.j;
                            Objects.requireNonNull(v);
                            if (PatchProxy.apply(null, v, videoContext, "124") != patchProxyRe) {
                            }else {
                               VideoContext.b();
                               i2 = v.a.c.c + 1;
                               if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Integer.valueOf(i2), v, videoContext, "123") != patchProxyRe) {
                               }else {
                                  VideoContext.b();
                                  v.a.c.c = i2;
                               }
                            }
                            if (!PatchProxy.applyVoid(null, null, b.class, "16")) {
                               a.l(true);
                            }
                            v = uob.j;
                            str1 = (uob.g != null)? "hardware_encode": "software_encode";
                            Objects.requireNonNull(v);
                            if (PatchProxy.applyOneRefs(str1, v, videoContext, "144") != patchProxyRe) {
                            }else {
                               VideoContext.b();
                               if (!TextUtils.x(str1)) {
                                  v.a.c.R = str1;
                               }
                            }
                            a m = obj1.m;
                            if (m != null) {
                               uob.w.add(m);
                            }
                            i3 = true;
                         }
                      }else {
                         throw new AssertionError();
                      }
                   }
                   if (i3) {
                      b h1 = uob.h;
                      uod = new d(h1.c, q.P());
                      if (!b1) {
                         uod.e = true;
                      }
                      uod.h(h1.b);
                      uod.g(obj1.d());
                      uod.e(obj1.k);
                      if (obj1.c() != null && obj1.c().length > 0) {
                         uod.m = obj1.c();
                      }
                      if (obj1.i != null || obj1.g()) {
                         uod.f(RecordMode.kDefault);
                      }else {
                         uod.f(RecordMode.kVideoOnly);
                      }
                      r = q.p;
                      if (r != null) {
                         Object obj3 = PatchProxy.apply(null, r, uoa, "6");
                         if (obj3 != patchProxyRe) {
                            i3 = obj3.intValue();
                         }else if(r.e != null){
                            i3 = 0xac44;
                         }else {
                            i3 = r.c.getSampleRate();
                         }
                         uod.k = i3;
                         r = q.p;
                         Objects.requireNonNull(r);
                         obj4 = PatchProxy.apply(null, r, uoa, "5");
                         if (obj4 != patchProxyRe) {
                            i = obj4.intValue();
                         }else if(r.e != null){
                            i = 2;
                         }else {
                            i = r.c.getChannelCount();
                         }
                         uod.l = i;
                      }
                      if (obj1.f() > 0) {
                         uod.g = Math.max(0, ((long)obj1.f() - (SystemClock.uptimeMillis() - l3)));
                      }
                      i = a.t().d("CameraSendAudioEmptyPacket", false);
                      if (i) {
                         uod.h = i;
                      }
                      obj4 = PatchProxy.applyTwoRefs(uod, uob, q, j.class, "187");
                      if (obj4 != patchProxyRe) {
                         b2 = obj4.booleanValue();
                      }else if(q.z == null && q.m.o().startRecordingWithConfig(uod, uob)){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (b2) {
                         q.r.J0(b1);
                      }
                      i = b2;
                   }else {
                      i = i3;
                   }
                }
             }
             if (!i) {
                i = 0;
                objArray1 = new Object[i];
                a.D().t("CameraBaseFragment", "startRecordingWithAudio failed !!!", objArray1);
             }else {
                i = 0;
             }
             obj = this;
             obj.G.a();
             objArray1 = new Object[]{"encode_type",CameraLogger.c(obj.q.P()),"cost",Long.valueOf(a1.o(l1))};
             PostUtils.onEvent("RecordFragment", "start_recording", objArray1);
             objArray1 = new Object[0];
             PostUtils.onEvent("RecordFragment", "record_start", objArray1);
             return;
          }
       }
       File uFile = PatchProxy.apply(str, obj, RecordFragment.class, "37");
       if (uFile != patchProxyRe) {
       }else if(!f.a("enableRecordInDraft")){
          objArray5 = new Object[i1];
          a.D().w("CameraBaseFragment", "getRecordPath using external dir", objArray5);
          uFile = PostUtils.n();
       }else {
          obj2 = "getRecordPath\(\) ";
          if (!i.h()) {
             PostUtils.D("CameraBaseFragment", obj2, new IllegalStateException("no post session for getting draft"));
             uFile = PostUtils.n();
          }else {
             Workspace$Type[] typeArray = new Workspace$Type[i2];
             typeArray[i1] = Workspace$Type.VIDEO;
             c uoc1 = i.m().x(typeArray);
             if (uoc1 == null) {
                objArray5 = new Object[i1];
                a.D().A("CameraBaseFragment", "getRecordPath no video draft ", objArray5);
                uFile = PostUtils.n();
             }else if(uoc1.T0() != Workspace$Source.CAPTURE){
                objArray5 = new Object[i1];
                a.D().w("CameraBaseFragment", "getRecordPath not Source.CAPTURE using external dir", objArray5);
                uFile = PostUtils.n();
             }else if(uoc1.o0() == null){
                PostUtils.D("CameraBaseFragment", obj2, new IllegalStateException("no assetDraft"));
                uFile = PostUtils.n();
             }else {
                File uFile1 = new File(uoc1.f0(), "asset");
                if (!uFile1.exists() && !uFile1.mkdirs()) {
                   PostUtils.D("CameraBaseFragment", obj2, new IllegalStateException("create asset dir failed "+uFile1));
                   uFile = PostUtils.n();
                }else {
                   Object[] objArray6 = new Object[i1];
                   a.D().w("CameraBaseFragment", "getRecordPath using draft "+uFile1, objArray6);
                   uFile = uFile1;
                }
             }
          }
       }
       obj1 = new a$a(uFile.getAbsolutePath());
       obj1.g = obj.y.d(a.f).c;
       obj1.f = obj.y.d(l.i).f;
       obj1.e = - obj.y.d(g.c).a;
       obj1.d = obj.y.d(s.c).a;
       obj1.l = obj.y.d(v.e).d;
       obj1.h = i;
       obj1.i = this.uh();
       obj1.c = this.getRecordDuration();
       obj1.k = PostExperimentUtils.c1();
       obj1.j = obj.y.d(a.i).b;
       obj1.b = obj.y.d(j.i).e;
       uoa = PatchProxy.apply(str, obj1, a$a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a(obj1);
       }
       obj1 = uoa;
       goto label_0202 ;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, RecordFragment.class, "17")) {
          return;
       }
       this.ph();
       RecordFragment$b uob = new RecordFragment$b(this, this.getActivity());
       uob.s(true);
       Void[] voidArray = new Void[0];
       this.J = uob.c(voidArray);
       return;
    }
    public boolean uh(){
       CameraBaseFragment obj = PatchProxy.apply(null, this, RecordFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj == null) {
          return false;
       }
       return obj.isFrontCamera();
    }
    public final int vh(){
       CameraBaseFragment obj = PatchProxy.apply(null, this, RecordFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.r;
       int i = (obj == null || obj.w0() == null)? 0: this.r.w0().getDelayRecordTime();
       return i;
    }
    public final boolean wh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CameraBaseFragment obj = PatchProxy.apply(objArray, this, RecordFragment.class, "32");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, j.class, "178");
       if (objArray1 != patchProxyRe) {
       }else if(obj.p1() != null){
          j q = obj.q;
          Objects.requireNonNull(q);
          Object obj1 = PatchProxy.apply(objArray, q, b.class, "26");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             b h = q.h;
             if (h == null) {
                if (!q.i.isEmpty()) {
                   h = q.i;
                   h = h.get((h.size() - 1));
                }
             }
             objArray = h;
          }
       }
       objArray1 = objArray;
       if (objArray1 != null && objArray1.c != null) {
          File uFile = new File(objArray1.c);
          if (uFile.exists() && (uFile.isFile() && uFile.length() > 0)) {
             b = true;
          }
       }
    label_0087 :
       return b;
    }
    public void xh(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordFragment.class, "29")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onBuildFinish "+p0, objArray);
       long l = a1.k();
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          iterator.next().L3(p0);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CameraBaseFragment", "onBuildFinishInMainThread cost:"+a1.o(l), objArray1);
       if (p0 == null && this.isAdded()) {
          Object[] objArray2 = new Object[0];
          a.D().t("CameraBaseFragment", "onBuildFinish error", objArray2);
          this.P1();
          this.q.resumePreview();
          this.zh();
          if (!d.a(0x14d6f666).isAvailable()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f100070);
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f100dd7);
          }
       }
       return;
    }
    public void y(){
       boolean b1;
       int i;
       c a;
       RecordFragment tI;
       Object[] objArray2;
       j0 oj0 = j0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordFragment.class, "10")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CameraBaseFragment", "startCapture\(\)", objArray1);
       CameraBaseFragment tq = this.q;
       Objects.requireNonNull(tq);
       CameraConfig obj = PatchProxy.apply(objArray, tq, j.class, "23");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): tq.u0.a();
       if (!b && this.q.R()) {
          long l = System.currentTimeMillis();
          a uoa = this.y.d(a.f);
          obj = (uoa.b != null && (uoa.c == null || this.y.d(c.b).a != null))? this.Ve().mStartRecordDelayAfterStartPlayMusic: 0;
          Object obj1 = PatchProxy.apply(objArray, this, RecordFragment.class, "11");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.vh() > 0 && (this.q.R() && (!this.q.B() && !this.q.isRecording()))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             i = Math.max(this.vh(), obj);
          }
          if (!this.q.B()) {
             this.D = - this.y.d(g.c).a;
          }
          a = this.y.d(c.c).a;
          boolean b2 = c.c(a1.c());
          if (uoa.b != null && (uoa.c != null && a == null)) {
             i = PostExperimentUtils.v0();
          }
       label_00e7 :
          if (this.Kc() && a == null) {
             tI = this.I;
             if (tI == null || tI.isDisposed()) {
                objArray2 = new Object[0];
                a.D().w("CameraBaseFragment", "startCapture£¬isNeedDelayCaptureAfterAudioRenderingStart£¬create mMusicRenderingStartDisposable", objArray2);
                this.I = this.ih().g(oj0).timeout(1000, TimeUnit.MILLISECONDS, t.fromCallable(r.b)).compose(this.ge()).observeOn(d.a).subscribe(new s0(this, l), o.b);
             }
             this.I7();
          }else if(a != null && b2){
             tI = this.I;
             if (tI == null || tI.isDisposed()) {
                objArray2 = new Object[0];
                a.D().w("CameraBaseFragment", "startCapture£¬isSameFrame in wiredHeadsetOn£¬create mMusicRenderingStartDisposable", objArray2);
                this.I = this.ih().g(oj0).timeout(1000, TimeUnit.MILLISECONDS, t.fromCallable(s.b)).compose(this.ge()).observeOn(d.a).subscribe(new r0(this, l), p.b);
             }
             this.I7();
          }else {
             this.I7();
             this.sh(i);
          }
          RxBus.f.b(new i());
       }
       return;
    }
    public a yh(){
       GifshowActivity obj = PatchProxy.apply(null, this, RecordFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "prepareDataForPreviewActivity\(\)", objArray);
       obj = this.getActivity();
       if (obj != null && (!obj.isFinishing() && (this.getView() != null && (this.isAdded() && (this.isRemoving() || this.isDetached()))))) {
          return null;
       }
       Object[] objArray1 = new Object[i];
       PostUtils.onEvent("RecordFragment", "record_finish", objArray1);
       a uoa = this.q.D();
       uoa.k = this.y.d(a.f).c;
       Object[] objArray2 = new Object[]{"encode_type",CameraLogger.c(this.q.P()),"cost",Long.valueOf((System.currentTimeMillis() - System.currentTimeMillis()))};
       PostUtils.onEvent("RecordFragment", "finish_recording", objArray2);
       return uoa;
    }
    public AnimCameraView z7(){
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, RecordFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getView() != null) {
          objArray = this.getView().findViewById(0x7f0a0631);
       }
       obj = this.getActivity();
       if (objArray == null && obj != null) {
          objArray = obj.findViewById(0x7f0a0631);
       }
       return objArray;
    }
    public void zh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordFragment.class, "30")) {
          return;
       }
       if (this.q != null) {
          if (this.y.d(a.f).c == null) {
             this.Ah();
          }else {
             CameraBaseFragment tq = this.q;
             Objects.requireNonNull(tq);
             if (!PatchProxy.applyVoid(objArray, tq, j.class, "59") && tq.z == null) {
                tq.C = true;
                tq.M1(true, false);
             }
          }
       }
       return;
    }
}
