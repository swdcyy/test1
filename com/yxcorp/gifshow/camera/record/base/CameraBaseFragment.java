package com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import mm6.c;
import oc9.w;
import qi9.f1;
import ml8.d;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import java.util.ArrayList;
import oc9.c0;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import java.util.HashMap;
import java.util.LinkedList;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import oc9.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.models.Page;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.video.api.camera.CameraResolutionParameters;
import oc9.r;
import x8c.a;
import q87.c;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import java.lang.Math;
import mm6.b;
import java.util.Iterator;
import java.util.List;
import oc9.t;
import com.yxcorp.gifshow.camerasdk.q;
import qi9.e1;
import com.yxcorp.gifshow.camera.bubble.c;
import qi9.v1;
import java.util.Map;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import oc9.e;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import android.view.View;
import ui9.k;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.prettify.PrettifyPlugin;
import l0c.c;
import com.kwai.video.westeros.models.BeautifyVersion;
import ui9.k$a;
import java.util.Queue;
import java.lang.Runnable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Handler;
import oc9.j;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Exception;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Context;
import e17.i;
import android.graphics.drawable.Drawable;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import tg9.f;
import tc9.c;
import ekd.k1;
import java.util.Collection;
import java.util.Objects;
import gxc.f;
import oc9.u;
import va9.a;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import java.lang.Integer;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import k2b.u1;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.camera.record.base.CallerContext$1;
import androidx.lifecycle.LifecycleObserver;
import qb9.w;
import nh9.f;
import com.yxcorp.gifshow.camerasdk.j$r;
import si9.c;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import q46.b;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.yxcorp.gifshow.camera.record.base.f;
import oc9.l;
import oc9.g;
import oc9.f;
import com.kwai.framework.activitycontext.ActivityContext;
import xi9.n;
import oc9.y;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import m65.f;
import oc9.d;
import com.yxcorp.gifshow.camerasdk.j$p;
import com.yxcorp.gifshow.camera.record.base.c;
import oc9.i;
import oc9.h;

public abstract class CameraBaseFragment extends FlyWheelBaseFragment implements c, w, f1, d	// class@000da2
{
    public AnimCameraView n;
    public final List o;
    public final c0 p;
    public j q;
    public j r;
    public final EncodeConfig s;
    public final Map t;
    public final Map u;
    public boolean v;
    public final Queue w;
    public boolean x;
    public final b y;
    public String z;
    public static final int A;

    public void CameraBaseFragment(){
       super();
       this.o = new ArrayList();
       this.p = new c0(this);
       this.s = b.c();
       this.t = new HashMap();
       this.u = new HashMap();
       this.w = new LinkedList();
       this.y = new b(this, this);
    }
    public void A0(){
       v.s(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "19")) {
          return;
       }
       this.p.B();
       return;
    }
    public boolean Cd(){
       return v.j(this);
    }
    public void E0(){
       v.x(this);
    }
    public c E9(){
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Page obj = PatchProxy.apply(objArray, this, CameraBaseFragment.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Nb();
       CameraConfig uCameraConfi = this.Ve();
       CameraBaseFragment ts = this.s;
       CameraPageConfig uCameraPageC = this.jh();
       CameraResolutionParameters uCameraResol = this.kh();
       if (PatchProxy.isSupport(r.class)) {
          Object[] objArray1 = new Object[]{obj,uCameraConfi,ts,uCameraPageC,uCameraResol};
          uoc = PatchProxy.apply(objArray1, objArray, r.class, "1");
          if (uoc != patchProxyRe) {
          label_0116 :
             return uoc;
          }
       }
       Object[] objArray2 = new Object[0];
       a.D().w("CameraParameterUtils", "getOpenCameraParameter", objArray2);
       int width = ts.getWidth();
       int height = ts.getHeight();
       boolean b = ts.isUseHardwareEncode();
       c uoc1 = new c(obj, uCameraConfi);
       Object obj1 = PatchProxy.apply(objArray, objArray, r.class, "2");
       int b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("post_perf_report", 0);
       uoc1.S = b1;
       objArray = new Object[0];
       a.D().w("CameraParameterUtils", "EnablePostPerfReport "+uoc1.S, objArray);
       uoc1.p(uCameraPageC);
       uoc1.j = uCameraResol.mTaskId;
       uoc1.a = uCameraResol.mIsFront;
       CameraResolutionParameters mPreviewWidt = uCameraResol.mPreviewWidth;
       if (mPreviewWidt > null && uCameraResol.mPreviewHeight > null) {
          uoc1.s(mPreviewWidt);
          uoc1.q(uCameraResol.mPreviewHeight);
          uoc1.r(Math.max(uCameraResol.mPreviewMaxSize, Math.max(uCameraResol.mPreviewWidth, uCameraResol.mPreviewHeight)));
       }
       uoc1.b = b;
       uoc1.c = ts.getHardwareRecordFps();
       uoc1.u(ts.getSoftwareRecordFps());
       b1 = ts.getHardwareRecordMaxSize();
       int i = Integer.MAX_VALUE;
       int i1 = (b)? width * height: Integer.MAX_VALUE;
       uoc1.e = Math.min(b1, i1);
       if (ts.isForceDisableConfigFallback()) {
          b1 = ts.getSoftwareRecordMaxSize();
          if (!b) {
             i = width * height;
          }
          uoc1.t(Math.min(b1, i));
       }else if(!b){
          i = width * height;
       }
       uoc1.t(i);
       uoc1.g = uCameraConfi.mDisableAdaptiveResolution ^ 1;
       uoc1.h = ts.isForceDisableOpenglSync();
       uoc = uoc1;
       goto label_0116 ;
    }
    public int Ff(){
       return b.c(this);
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "16")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().G();
       }
       return;
    }
    public q G2(){
       return this.q;
    }
    public boolean H5(){
       return v.k(this);
    }
    public void N(long p0,long p1){
       e1.a(this, p0, p1);
    }
    public Page Nb(){
       return v.h(this);
    }
    public void P1(){
       v.r(this);
    }
    public void Q5(boolean p0,boolean p1){
       v.u(this, p0, p1);
    }
    public boolean R0(){
       return v.l(this);
    }
    public int S5(){
       return b.d(this);
    }
    public void T1(boolean p0){
       v.v(this, p0);
    }
    public c V7(){
       return v.f(this);
    }
    public CameraConfig Ve(){
       CameraConfig uCameraConfi;
       Page obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "33");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Nb();
       if (patchProxyRe.a) {
          uCameraConfi = this.u.get(obj);
          if (uCameraConfi == null) {
             uCameraConfi = b.a(obj);
             this.u.put(obj, uCameraConfi);
          }
          return uCameraConfi;
       }else {
          uCameraConfi = this.t.get(obj);
          if (uCameraConfi == null) {
             uCameraConfi = b.a(obj);
             this.t.put(obj, uCameraConfi);
          }
          return uCameraConfi;
       }
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o();
    }
    public boolean a4(){
       return b.b(this);
    }
    public abstract List ch();
    public void dg(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraBaseFragment.class, "23")) {
          return;
       }
       String[] stringArray = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
       PermissionUtils.k(p0, stringArray).subscribe(new e(this), Functions.e);
       return;
    }
    public List dh(){
       Object obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public void doBindView(View p0){
    }
    public void e2(){
       v.p(this);
    }
    public k eh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, CameraBaseFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x76e9c37c;
       if (d.a(i).isAvailable()) {
          objArray = d.a(i).i40().a();
       }
       if (objArray == null) {
          objArray = BeautifyVersion.kBeautifyVersionDefault;
       }
       return new k$a().b(objArray.getNumber()).a();
    }
    public boolean f9(){
       return b.f(this);
    }
    public void fh(boolean p0){
       if (PatchProxy.isSupport(CameraBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraBaseFragment.class, "24")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().E1(p0);
       }
       return;
    }
    public void g1(){
       v.A(this);
    }
    public int getRecordDuration(){
       return v.g(this);
    }
    public String getTaskId(){
       return "";
    }
    public final void gh(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "29")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "excuteAllDelayInitTask", objArray);
       while (!this.w.isEmpty()) {
          Runnable runnable = this.w.poll();
          if (runnable != null) {
             runnable.run();
          }
       }
       return;
    }
    public final void hh(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "30")) {
          return;
       }
       Runnable runnable = this.w.poll();
       if (runnable != null) {
          runnable.run();
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             activity.V2().post(new j(this));
          }
       }
       return;
    }
    public void i1(ErrorCode$Result p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraBaseFragment.class, "15")) {
          return;
       }
       this.n.b();
       boolean b = true;
       CameraBaseFragment tq = this.q;
       if (tq != null) {
          b = tq.isFrontCamera();
       }
       PostUtils.x("opencamera"+b, Log.getStackTraceString(p1));
       b = PermissionUtils.a(this.getActivity(), "android.permission.CAMERA");
       if (PermissionUtils.a(this.getActivity(), "android.permission.RECORD_AUDIO") && b) {
          i.a(R.style.arg_RES_7f110668, 0x7f10048f);
       }
       return;
    }
    public Drawable i9(){
       return b.i(this);
    }
    public b ih(){
       return this.y;
    }
    public CameraPageConfig jh(){
       Object obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Ve().getRecordPageConfig();
    }
    public CameraResolutionParameters kh(){
       CameraResolutionParameters obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CameraResolutionParameters();
       CameraPageConfig uCameraPageC = this.jh();
       obj.mPreviewWidth = uCameraPageC.mPreviewWidth;
       obj.mPreviewHeight = uCameraPageC.mPreviewHeight;
       obj.mPreviewMaxSize = uCameraPageC.mPreviewMaxEdgeSize;
       return obj;
    }
    public boolean lf(){
       return b.h(this);
    }
    public abstract CameraPageType lh();
    public void mh(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraBaseFragment.class, "28")) {
          return;
       }
       if (!this.oh() || (this.v != null && this.w.isEmpty())) {
          Object[] objArray = new Object[0];
          a.D().w("CameraBaseFragment", "excute DelayInitTask "+p0, objArray);
          p0.run();
       }else {
          this.w.offer(p0);
       }
       return;
    }
    public final void nh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraBaseFragment.class, "31")) {
          return;
       }
       if (!this.o.isEmpty()) {
          return;
       }
       this.o.add(new f(this.lh(), this.y));
       this.o.add(new c(this.lh(), this.y));
       long l = k1.i();
       this.o.addAll(this.ch());
       this.o.addAll(this.dh());
       CameraBaseFragment tp = this.p;
       Objects.requireNonNull(tp);
       c0 uoc0 = c0.class;
       if (!PatchProxy.applyVoid(objArray, tp, uoc0, "18")) {
          tp.c.clear();
          List list = tp.b.za();
          if (!PatchProxy.applyVoidOneRefs(list, tp, uoc0, "19")) {
             LinkedList linkedList = new LinkedList(list);
             while (!linkedList.isEmpty()) {
                int i = 0;
                t ot1 = linkedList.get(i);
                if (ot1 instanceof f) {
                   tp.c.add(ot1);
                }
                if (ot1 instanceof u) {
                   linkedList.addAll(i, ot1.getChildren());
                }
                linkedList.remove(ot1);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, CameraBaseFragment.class, "5")) {
          this.y.e = true;
       }
       a.c(this.getActivity(), "fragment buildControllers", l);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          ot.w1(this.getActivity().getIntent());
          a.d(ot.getClass().getSimpleName()+" onCreate", k1.i());
       }
       return;
    }
    public boolean oh(){
       return this instanceof StandardCameraFragment;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(CameraBaseFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CameraBaseFragment.class, "13")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       a.D().w("CameraBaseFragment", String.format("onActivityResult requestCode:%d resultCode:%d", objArray), objArray1);
       if (this.getActivity() != null) {
          Iterator iterator = this.za().iterator();
          while (iterator.hasNext()) {
             iterator.next().onActivityCallback(p0, p1, p2);
          }
       }
       return;
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraBaseFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       String str = "photo_task_id";
       String str1 = j0.f(p0.getIntent(), str);
       if (!TextUtils.x(str1)) {
          this.z = str1;
       }
       if (this.getArguments() != null) {
          str1 = this.getArguments().getString(str);
       }
       if (!TextUtils.x(str1)) {
          this.z = str1;
       }
       if (TextUtils.x(this.z)) {
          this.z = u1.f();
       }
       a.f.a().g(PostCommonBiz.RECORD, "CameraBaseFragment", "onAttach TaskId:"+this.z+"/ extra:"+this.z);
       return;
    }
    public boolean onBackPressed(){
       Runnable obj = PatchProxy.apply(null, this, CameraBaseFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       while (!this.w.isEmpty()) {
          obj = this.w.poll();
          if (obj != null) {
             obj.run();
          }
       }
       Iterator iterator = this.o.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().onBackPressed()) {
             break ;
          }
       }
       return true;
    }
    public void onCreate(Bundle p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraBaseFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "onCreate", objArray);
       CameraBaseFragment ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(null, ty, b.class, "1")) {
          if (ty.g == null) {
             ty.g = ty.f.getActivity();
          }
          Intent intent = ty.g.getIntent();
          boolean b1 = (!j0.g(intent, "magic_face") && (j0.g(intent, "magicFaceId") || j0.g(intent, "music")))? true: false;
          ty.d = b1;
          ty.e = i;
          ty.f.getLifecycle().addObserver(new CallerContext$1(ty));
       }
       this.o.clear();
       b = this.getActivity() instanceof w;
       this.x = b;
       this.q = (b)? this.getActivity().k(): new j(this.getActivity(), this, f.e(), "camera_sdk");
       ty = this.q;
       CameraBaseFragment tz = this.z;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoidOneRefs(tz, ty, j.class, "233")) {
          j h0 = ty.H0;
          Objects.requireNonNull(h0);
          if (!PatchProxy.applyVoidOneRefs(tz, h0, c.class, "5")) {
             h0.c = tz;
             h0.a(i);
          }
       }
       if (!this.oh()) {
          this.nh();
       }
       PageMonitor.INSTANCE.registerPageInfo(this, this.o(), b.a(this.getActivity()));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "11")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onDestroy", objArray);
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onDestroyView", objArray);
       if (this.n != null) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().onDestroyView();
          }
       }
       CameraBaseFragment tq = this.q;
       if (tq != null && this.x == null) {
          tq.j1();
       }
       this.v = false;
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       Iterator obj;
       if (PatchProxy.isSupport(CameraBaseFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, CameraBaseFragment.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.o.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onKeyDown(p0, p1)) {
             break ;
          }
       }
       return true;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "8")) {
          return;
       }
       while (!this.w.isEmpty()) {
          Runnable runnable = this.w.poll();
          if (runnable != null) {
             runnable.run();
          }
       }
       super.onPause();
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onPause", objArray);
       if (this.n != null) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPause();
          }
       }
       this.q.stopRecording();
       if (this.x == null) {
          this.q.W();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "7")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onResume", objArray);
       this.p6();
       if (this.y.d(f.c).b == null) {
          this.q.X();
       }
       if (this.n != null) {
          this.mh(new l(this));
       }
       if (this.v == null) {
          this.v = true;
          if (!this.w.isEmpty()) {
             this.hh();
             k1.r(new g(this), 1000);
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "6")) {
          return;
       }
       super.onStart();
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onStart", objArray);
       this.mh(new f(this));
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "9")) {
          return;
       }
       super.onStop();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "onStop", objArray);
       if (this.n != null) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().onStop();
          }
       }
       int i1 = 1;
       Iterator iterator1 = this.o.iterator();
       while (iterator1.hasNext()) {
          i1 = i1 & iterator1.next().pc();
       }
       Activity uActivity = ActivityContext.g().e();
       if (this.r != null && (uActivity != this.getActivity() && (i1 && !this.r.y0()))) {
          Object[] objArray1 = new Object[i];
          a.D().w("CameraBaseFragment", "onStop, closeCameraAndStoreStatus, current activity is "+uActivity, objArray1);
          this.q.m();
       }
    label_008b :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraBaseFragment.class, "4")) {
          return;
       }
       if (this.oh()) {
          this.nh();
       }
       Iterator iterator = this.y.e(y.class).iterator();
       while (iterator.hasNext()) {
          iterator.next().Q(p0);
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onViewCreated", objArray);
       this.doBindView(p0);
       AnimCameraView uAnimCameraV = this.z7();
       this.n = uAnimCameraV;
       if (uAnimCameraV != null) {
          Iterator iterator1 = this.o.iterator();
          while (iterator1.hasNext()) {
             t ot = iterator1.next();
             ot.k(p0);
             a.d(ot.getClass().getSimpleName()+" onViewCreated", k1.i());
          }
       }
       try{
          b = SystemUtil.D(a.a().a());
       }catch(java.lang.Exception e7){
          PostUtils.D("CameraBaseFragment", "hasCameraHardware error", e7);
       }
       if (!b) {
          i.a(R.style.arg_RES_7f110668, 0x7f105033);
          this.getActivity().finish();
       }
       this.dg(this.getActivity());
       return;
    }
    public void p6(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "26")) {
          return;
       }
       if (this.y.d(f.c).b != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "openCamera", objArray);
       this.n.getCameraView().getSurfaceView().resume();
       this.q.f(new d(this, this.E9()));
       this.q.f(new c(this));
       return;
    }
    public void q1(){
       v.q(this);
    }
    public boolean q2(){
       return v.n(this);
    }
    public boolean re(){
       return b.g(this);
    }
    public void s0(){
       v.w(this);
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "17")) {
          return;
       }
       if (this.isDetached()) {
          return;
       }
       this.mh(new i(this));
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, CameraBaseFragment.class, "14")) {
          return;
       }
       if (this.isDetached()) {
          return;
       }
       this.mh(new h(this));
       return;
    }
    public boolean x2(){
       return true;
    }
    public void y(){
       v.z(this);
    }
    public abstract AnimCameraView z7();
    public List za(){
       return this.o;
    }
}
