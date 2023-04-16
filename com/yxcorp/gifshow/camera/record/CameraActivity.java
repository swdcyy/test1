package com.yxcorp.gifshow.camera.record.CameraActivity;
import mm6.d;
import android.view.View$OnClickListener;
import qb9.w;
import com.yxcorp.gifshow.camera.record.e$a;
import mm6.a;
import ml8.d;
import c35.i;
import com.kuaishou.viewbinder.IBaseViewHost;
import je.a;
import ci9.a;
import q46.a;
import oq.a;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.CameraActivity$1;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import gd9.b;
import com.yxcorp.gifshow.camera.record.tab.c;
import com.yxcorp.gifshow.camera.record.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.CameraActivity$a;
import com.yxcorp.gifshow.camera.record.CameraActivity$b;
import crd.a;
import q46.e;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import oe6.a;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import qi9.g1;
import hi9.d;
import android.content.Intent;
import pi9.p;
import mm6.c;
import java.lang.StringBuilder;
import eh9.l;
import java.lang.Integer;
import eh9.n;
import java.util.List;
import eh9.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Boolean;
import android.app.Activity;
import java.util.Objects;
import android.view.View;
import w46.b;
import qb9.f;
import java.lang.Runnable;
import android.util.SparseArray;
import com.kwai.camerasdk.models.Page;
import com.yxcorp.gifshow.media.model.CameraConfig;
import cj9.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import com.kwai.camerasdk.models.CameraApiVersion;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.camerasdk.models.CaptureDeviceType;
import java.lang.Number;
import lq.i;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.d7;
import ekd.j0;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import java.lang.Throwable;
import gh9.i;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.camera.record.viewbinder.AbsCameraActivityViewBinder;
import android.net.Uri;
import android.os.SystemClock;
import qb9.u;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import zb9.p0;
import zb9.p0$a;
import jg9.a1;
import jg9.a1$a;
import java.lang.Float;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.util.Iterator;
import android.os.Parcelable;
import com.yxcorp.gifshow.camera.record.activity.HtmlCameraFragment;
import ekd.x0;
import android.net.Uri$Builder;
import sm6.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import yb7.b;
import com.kwai.yoda.model.LaunchModel;
import q46.t;
import c35.c;
import qxc.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import yh9.j;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import tkd.b;
import tkd.d;
import os5.g;
import wc9.v;
import com.yxcorp.gifshow.camerasdk.j;
import bq.a;
import com.yxcorp.gifshow.camera.record.CameraActivity$c;
import kq.b;
import com.yxcorp.gifshow.camera.record.CameraActivity$d;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.util.PostUtils;
import ekd.m1;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import lnc.a1;
import zm6.a;
import lnc.i3;
import k2b.u1;
import a0.l;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import qb9.y;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import qb9.x;
import ekd.k1;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import androidx.lifecycle.LifecycleOwner;
import hka.a;
import android.content.res.Configuration;
import com.kwai.feature.post.api.util.g;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import fd9.a;
import be9.a;
import kuaishou.perf.page.impl.d;
import com.kuaishou.ax2c.PreLoader;
import qi9.z0;
import java.lang.System;
import h80.h;
import h80.k;
import vc9.b;
import lnc.c7;
import android.view.Window;
import qh5.b;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import java.util.concurrent.atomic.AtomicBoolean;
import qb9.i;
import z1.a;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.camera.record.b;
import msd.l;
import oa0.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelRecordEnter$1;
import com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelRecordAb$1;
import lm6.a;
import com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelTaskId$1;
import j46.a;
import com.yxcorp.gifshow.activity.policy.PostPolicyAlbumActivity;
import g26.a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import pi9.c;
import g26.b;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.o;
import java.lang.IllegalStateException;
import lnc.i1;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import va9.a;
import m65.f;
import lnc.s6;
import xf6.l;
import oh9.p;
import pi9.m;
import com.kuaishou.ax2c.PreloadParam$Builder;
import pi9.l;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.kuaishou.ax2c.PreloadParam;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import zg9.j;
import pm6.k;
import oh9.e;
import crd.b;
import brd.z;
import xf6.g;
import qb9.g;
import fn6.a;
import qb9.r;
import eh9.u;
import ed9.g;
import qb9.q;
import erd.g;
import eoc.f;
import lm6.h;
import qb9.l;
import lm6.i;
import qb9.k;
import eda.w;
import qb9.m;
import r8c.h$a;
import qb9.p;
import lm6.e;
import qb9.o;
import lm6.f;
import qb9.n;
import lm6.d;
import qb9.j;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import u07.t$a;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import android.os.Build;
import qb9.h;
import com.kwai.library.widget.popup.common.f;
import k36.c;
import k36.d;
import java.lang.Long;
import lnc.b9;
import qh5.a;
import hka.d;
import j4b.d;
import qb9.a;
import com.yxcorp.gifshow.camera.record.a;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import qb9.c;
import qb9.d;
import qb9.e;

public class CameraActivity extends BasePostActivity implements d, View$OnClickListener, w, e$a, a, d, i, IBaseViewHost, a, a, a, a	// class@001c8a
{
    public List O;
    public final LifecycleObserver P;
    public View Q;
    public AnimCameraView R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean U0;
    public j V;
    public int V0;
    public c W;
    public final b W0;
    public CameraFragment X;
    public final a X0;
    public SparseArray Y;
    public final d Y0;
    public int Z;
    public boolean Z0;
    public float a1;
    public int b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public final d f1;
    public final d g1;
    public int h1;
    public int i1;
    public int j1;
    public String k1;
    public a l1;
    public Boolean m1;
    public Configuration n1;
    public boolean o1;
    public BubbleEnterPostParam p1;
    public boolean q1;
    public ProgressFragment r1;
    public View s1;
    public Boolean t1;
    public final e u1;
    public long v1;
    public boolean w1;
    public static final String[] x1;

    static {
       String[] stringArray = new String[]{"android:support:fragments","android:fragments"};
       CameraActivity.x1 = stringArray;
    }
    public void CameraActivity(){
       Object[] objArray1;
       super();
       this.O = new ArrayList();
       this.P = new CameraActivity$1(this);
       boolean b = true;
       this.S = b;
       this.X = new StandardCameraFragment();
       this.U0 = b;
       int i = 0;
       this.V0 = i;
       this.W0 = new b(this);
       this.X0 = new c();
       d uod = d.class;
       _monitor_enter(uod);
       Object obj = null;
       d uod1 = PatchProxy.applyOneRefs(this, obj, uod, "3");
       if (uod1 != PatchProxyResult.class) {
          _monitor_exit(uod);
       }else {
          d.f = b;
          if (d.g != null) {
             objArray1 = new Object[i];
             a.D().w("CameraManager", "use preload cameramanager", objArray1);
             uod1 = d.g;
             uod1.b = this;
             d.g = obj;
             _monitor_exit(uod);
          }else {
             objArray1 = new Object[i];
             a.D().w("CameraManager", "use new cameramanager", objArray1);
             uod1 = new d(this);
             _monitor_exit(uod);
          }
       }
       this.Y0 = uod1;
       this.Z0 = b;
       this.a1 = 0;
       this.f1 = new CameraActivity$a(this);
       this.g1 = new CameraActivity$b(this);
       this.h1 = 2;
       this.i1 = -1;
       this.j1 = -1;
       this.l1 = new a();
       this.m1 = obj;
       this.o1 = i;
       this.q1 = i;
       this.u1 = new e(this);
       Bundle arguments = this.X.getArguments();
       if (arguments == null) {
          arguments = new Bundle();
       }
       SerializableHook.putSerializable(arguments, "TakePictureType", TakePictureType.SHARE);
       this.X.setArguments(arguments);
       if (a.g()) {
          if (!PatchProxy.applyVoid(obj, this, CameraActivity.class, "7")) {
             this.X.Mh(this);
             arguments = this.X.getArguments();
             if (arguments == null) {
                arguments = new Bundle();
             }
             arguments.putBoolean("is_ultra_wide_camera_enable", this.K3());
             arguments.putBoolean("is_super_stability_enable", g1.k());
             this.X.setArguments(arguments);
          }
          if (!d.a() && p.e(obj)) {
             uod1.i(this.X);
          }
       }
    label_0105 :
       Object[] objArray = new Object[i];
       a.D().w("CameraActivity", "new CameraActivity "+this, objArray);
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "11")) {
          return;
       }
       int i = l.g();
       if (!PatchProxy.isSupport(CameraActivity.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, CameraActivity.class, "52")) {
          n on = l.d(i);
          if (on != null && this.X0.x().contains(on)) {
             this.X0.p(on.getTextViewId());
          }else {
             this.finish();
          }
       }
       return;
    }
    public String B3(){
       return "MAIN";
    }
    public String E7(){
       return "CameraPage";
    }
    public String G(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W;
       if (obj != null) {
          return obj.Xa();
       }
       return "";
    }
    public void G3(DefaultLifecycleObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "3")) {
          return;
       }
       if (this.O.contains(p0)) {
          return;
       }
       this.O.add(p0);
       return;
    }
    public void H0(int p0,c p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, CameraActivity.class, "66")) {
          return;
       }
       if (this.getIntent() != null) {
          this.getIntent().putExtra("record_mode", p0);
       }
       int i = 5;
       if (p0 != i && !p2) {
          this.h1 = p0;
       }
       CameraActivity tW0 = this.W0;
       Objects.requireNonNull(tW0);
       int i1 = 1;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p2), Boolean.valueOf(p3), tW0, b.class, "1")) {
          Object[] objArray = new Object[0];
          a.D().s("FlyWheel", "notifyTabChangeByRecordMode, recordMode: "+p0+" isSnapShotMode: "+p2+" isActivityMode: "+p3, objArray);
          if (p3) {
             i = 3;
          }else if(p0 == i){
             i = 1;
          }else if(p2){
             i = 2;
          }else {
             i = 0;
          }
          tW0.a(i);
       }
       i = (this.Z != p0)? 1: 0;
       this.Z = p0;
       if (p1 instanceof CameraFragment) {
          CameraFragment uCameraFragm = p1;
          if (!i) {
             if (p0) {
                i1 = 0;
             }
             i = i1;
          }
          if (i) {
             uCameraFragm.Ph(p2, p3);
             uCameraFragm.d5(p0);
             this.e4(p0, p1);
          }
       }
       return;
    }
    public final boolean H3(View p0){
       Object[] objArray;
       Object[] objArray1;
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 == null) {
          objArray = new Object[i];
          a.D().t("CameraActivity", "rootView is null", objArray);
          return i;
       }else {
          a uoa = 1;
          if (p0.findViewById(0x7f0a063e) == null) {
             objArray1 = new Object[i];
             a.D().t("CameraActivity", "camera_tab_scroll_group is null", objArray1);
             uoa = null;
          }
          if (p0.findViewById(0x7f0a0931) == null) {
             objArray1 = new Object[i];
             a.D().t("CameraActivity", "container_layout is null", objArray1);
             uoa = null;
          }
          if (p0.findViewById(0x7f0a369f) == null) {
             objArray = new Object[i];
             a.D().t("CameraActivity", "root_layout is null", objArray);
          }else {
             i = uoa;
          }
          return i;
       }
    }
    public final void I3(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "32")) {
          return;
       }
       if (this.isFinishing()) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "runOnceOnIdleHandler", objArray);
       this.N3();
       this.E3(new f(this));
       return;
    }
    public final c J3(int p0){
       if (PatchProxy.isSupport(CameraActivity.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "61");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.Y.get(this.b4(p0));
    }
    public final boolean K3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Application obj = PatchProxy.apply(objArray, this, CameraActivity.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.m1 == null) {
          obj = PatchProxy.apply(objArray, objArray, g1.class, "13");
          boolean b = true;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             CameraConfig uCameraConfi = b.a(Page.kCommonPage);
             if (uCameraConfi.mEnableUltraWideCamera != null) {
                obj = a.a().a();
                boolean b1 = PermissionUtils.a(obj, "android.permission.CAMERA");
                CameraConfig mCameraUnitC = uCameraConfi.mCameraUnitConfig;
                if (mCameraUnitC != null && mCameraUnitC.mEnable != null) {
                   if (!CameraController.supportApi(CameraApiVersion.kAndroidCameraUnit, obj) && b1) {
                   }
                }else if(uCameraConfi.mEnableCameraVivoApi != null){
                   CameraApiVersion kAndroidCame = CameraApiVersion.kAndroidCameraVivo;
                   if (CameraController.supportApi(kAndroidCame, a.a().a()) && (!CameraController.supportCaptureDeviceType(CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera, false, kAndroidCame, a.a().a()) && b1)) {
                   }
                }
             }
          }
       label_007f :
          this.m1 = Boolean.valueOf(b);
       }
       return this.m1.booleanValue();
    }
    public a L3(){
       return this.X0;
    }
    public int M(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.W;
       if (obj != null && obj == this.J3(2)) {
          return 5;
       }
       return 4;
    }
    public final void M3(){
       boolean b;
       String str = "CameraActivity";
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "23")) {
          return;
       }
       Intent intent = this.getIntent();
       int i = 1;
       if (i.h()) {
          Workspace$Type[] typeArray = new Workspace$Type[i];
          typeArray[0] = Workspace$Type.VIDEO;
          if (i.m().x(typeArray) == null) {
             b = true;
          label_002d :
             this.U0 = b;
             d7.a.h(intent);
             if (j0.a(intent, "forbidRecoverDraft", 0)) {
                this.o1 = i;
             }
             try{
                this.p1 = j0.e(intent, "key_post_entrance_draft_params");
             }catch(java.lang.ClassCastException e2){
                a.D().e(str, "get DraftParams error", e2);
             }
             Object[] objArray = new Object[0];
             a.D().w(str, "handleIntent is FromMusicTag: "+j0.g(intent, "music")+", camera page source:"+j0.b(intent, "camera_page_source", -1), objArray);
             if (!intent.hasExtra("frame_mode")) {
                intent.putExtra("frame_mode", 0);
             }
             return;
          }
       }
       b = false;
       goto label_002d ;
    }
    public final void N3(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraActivity.class, "59")) {
          return;
       }
       if (this.W == null) {
          boolean b = false;
          this.a4(b, b);
          int i = this.X0.g();
          boolean b1 = true;
          if (!i.a(this.getIntent()) && this.X0.j(i)) {
             i = 12;
             i1 = 1;
          }else {
             i1 = 0;
          }
          n on = l.d(i);
          CameraActivity tZ = this.Z;
          if (on != null) {
             this.X0.p(on.getTextViewId());
          }
          if (!PatchProxy.applyVoid(objArray, this, CameraActivity.class, "55")) {
             CameraActivity obj = PatchProxy.apply(objArray, this, CameraActivity.class, "54");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(this.getIntent() != null && j0.a(this.getIntent(), "panel_disabled", b)){
                b1 = false;
             }
             if (b1) {
                this.X0.f(8);
                Object[] objArray1 = new Object[b];
                a.D().w("CameraActivity", "updateCameraTabVisibility panel_disabled", objArray1);
             }else {
                obj = this.W;
                if (obj != null && obj.x2()) {
                   this.X0.f(b);
                }
             }
          }
       label_009b :
          this.X0.q();
          if (i1) {
             n on1 = l.d(this.X0.g());
             if (on1 != null) {
                this.X0.s(on1.getTextViewId(), tZ);
             }
          }
       }
    label_00b7 :
       return;
    }
    public IViewBinder O1(){
       return this.I;
    }
    public final void O3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraActivity.class, "22")) {
          return;
       }
       this.d1 = true;
       Intent intent = this.getIntent();
       if (intent == null) {
          return;
       }
       if (intent.getData() == null) {
          return;
       }
       if (!intent.getData().isHierarchical()) {
          intent.setData(objArray);
          return;
       }else {
          String str = "record_mode";
          if (!j0.g(intent, str)) {
             intent.putExtra(str, 0);
          }
          intent.putExtra("start_activity_time", SystemClock.uptimeMillis());
          u.b(intent);
          return;
       }
    }
    public int P2(){
       return 1;
    }
    public boolean P3(int p0){
       if (PatchProxy.isSupport(CameraActivity.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "64");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (l.l(p0)) {
          if (this.X0.n() != CameraTab.CAMERA_TAB_ACTIVITY.getTextViewId()) {
             b = false;
          }
          return b;
       }else if(p0 == 16){
          b = false;
       }
       return b;
    }
    public boolean R3(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.W;
       boolean b = true;
       boolean b1 = false;
       if (obj instanceof CameraFragment && obj.isAdded()) {
          if (this.W.ih().d(a.d.a()).b() || (!this.W.ih().d(p0.j.a()).c() || (!this.W.Gh() || this.W.ih().d(a1.j.a()).d != null))) {
             b1 = 1;
          }
       }else {
          obj = this.W;
          if (obj != null) {
             b1 = obj.f9();
          }
       }
       if (this.e1 == null) {
          b = b1;
       }
       return b;
    }
    public void S0(float p0){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CameraActivity.class, "10")) {
          return;
       }
       CameraActivity tX0 = this.X0;
       if (tX0 != null) {
          tX0.F(p0);
       }
       return;
    }
    public boolean S3(int p0){
       if (PatchProxy.isSupport(CameraActivity.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "65");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (i.a(this.getIntent())) {
          return false;
       }else if(p0 == 16){
          return true;
       }else {
          return l.l(p0);
       }
    }
    public void T3(int p0,MagicEmoji$MagicFace p1,n p2){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CameraActivity.class, "73")) {
          return;
       }
       CameraActivity tZ = this.Z;
       Intent intent = 1;
       if (p2 != null && p2.getTabId() == intent) {
          tZ = this.h1;
       }
       if (tZ == this.i1 && p0 == this.j1) {
          return;
       }else if(this.W instanceof BaseFragment){
          String str = (p2 != null && (p2.getTabId() == intent && (!i.a(this.getIntent()) && !this.S3(p0))))? "RECORD_MULTI_TAB": "SWITCH_TAB";
          CameraLogger.u(tZ, p0, p1, p2, this.W, str);
       }
       this.j1 = p0;
       this.i1 = tZ;
       return;
    }
    public final c U3(int p0){
       c uoc;
       Object obj2;
       String str2;
       int i2;
       n on;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(CameraActivity.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "74");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "CameraActivity";
       a.D().w(str, "newFragment: key:"+p0, objArray);
       int i1 = 1;
       if (p0 != i1 && p0 != 8) {
          if (p0 != 5) {
             if (p0 != 6) {
                l ol = l.class;
                Serializable obj1 = null;
                if (PatchProxy.isSupport(ol)) {
                   uoc = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj1, ol, "11");
                   if (uoc != patchProxyRe) {
                   }else {
                   label_005f :
                      Iterator iterator = l.c.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            on = iterator.next();
                            if (on.getTabId() != p0) {
                               continue ;
                            }
                         }else {
                            on = obj1;
                         }
                         iterator = l.d.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               n on1 = iterator.next();
                               if (on1.getTabId() == p0) {
                                  on = on1;
                               }else {
                                  continue ;
                               }
                            }
                            if (on != null) {
                               uoc = on.newFragment();
                            }else {
                               uoc = obj1;
                            }
                         }
                      }
                   }
                }else {
                   goto label_005f ;
                }
                if (!PatchProxy.isSupport(CameraActivity.class) || !PatchProxy.applyVoidTwoRefs(uoc, Integer.valueOf(p0), this, CameraActivity.class, "75")) {
                   Intent intent = this.getIntent();
                   if (p0 == 2 && (uoc instanceof Fragment && intent != null)) {
                      obj2 = uoc;
                      Bundle arguments = obj2.getArguments();
                      if (arguments == null) {
                         arguments = new Bundle();
                      }
                      arguments.putParcelable("key_live_uri", intent.getData());
                      arguments.putParcelable("key_live_theater_play_source", j0.d(intent, "key_live_theater_play_source"));
                      Object[] objArray1 = new Object[i];
                      a.D().w(str, "live prepareCameraItemFragmentArguments...", objArray1);
                      obj2.setArguments(arguments);
                   }else if(p0 == 17 && uoc instanceof HtmlCameraFragment){
                      obj2 = uoc;
                      if (!PatchProxy.applyVoidTwoRefs(this, obj2, obj1, HtmlCameraFragment.class, "1")) {
                         intent = this.getIntent();
                         String str1 = "needPollProduction";
                         boolean booleanExtra = (intent != null)? intent.getBooleanExtra(str1, i): false;
                         String k = l.k;
                         Uri uri = x0.f(k);
                         if (uri != null) {
                            try{
                               Uri$Builder uBuilder = uri.buildUpon().appendQueryParameter("postTopInset", String.valueOf(b.i(this)));
                               obj1 = PatchProxy.applyOneRefs(this, obj1, b.class, "29");
                               if (obj1 != patchProxyRe) {
                                  i2 = obj1.intValue();
                               }else if(b.t(this)){
                                  i2 = b.e(this);
                               }else {
                                  i2 = b.e;
                               }
                               uBuilder.appendQueryParameter("postBottomInset", String.valueOf((i2 + b.j(this))));
                               k = uBuilder.appendQueryParameter(str1, String.valueOf(booleanExtra)).build().toString();
                            }catch(java.lang.Exception e0){
                               a.D().e("HtmlCameraFragment", "h5 tab parse uri error", e0);
                            }
                         }
                      }
                   }
                }
                return uoc;
             }
          }else {
             return this.X;
          }
       }
       return this.X;
    }
    public void V0(int p0,boolean p1){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, CameraActivity.class, "9")) {
          return;
       }
       CameraActivity tX0 = this.X0;
       if (tX0 != null) {
          if (!p0) {
             this.a4(false, p1);
          }else {
             tX0.w(false, p1);
          }
       }
       return;
    }
    public void V3(DefaultLifecycleObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "4")) {
          return;
       }
       this.O.remove(p0);
       return;
    }
    public IViewBinder V5(int p0){
       AbsCameraActivityViewBinder uAbsCameraAc;
       if (PatchProxy.isSupport(CameraActivity.class)) {
          uAbsCameraAc = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "83");
          if (uAbsCameraAc != PatchProxyResult.class) {
          label_0027 :
             return uAbsCameraAc;
          }
       }
       uAbsCameraAc = c.a(t.c(this.getIntent()), AbsCameraActivityViewBinder.class, this);
       goto label_0027 ;
    }
    public e0 W0(){
       if (this.W != null) {
          return this.X;
       }
       return null;
    }
    public final void W3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "78")) {
          return;
       }
       if (p0 instanceof BaseFragment) {
          p0.getLifecycle().removeObserver(this.P);
       }
       return;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "87")) {
          return;
       }
       this.onBackPressed();
       return;
    }
    public boolean X2(){
       return true;
    }
    public final void X3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "77")) {
          return;
       }
       CameraActivity tW = this.W;
       if (tW == p0) {
          return;
       }
       this.W3(tW);
       if (!PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "79") && p0 instanceof BaseFragment) {
          p0.getLifecycle().addObserver(this.P);
       }
       this.W = p0;
       tW = this.X0;
       if (tW != null) {
          tW.m(p0);
       }
       return;
    }
    public final boolean Y3(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.W;
       boolean b = false;
       if (obj instanceof CameraFragment) {
          if (obj.ih().d(j.i).c()) {
             return b;
          }else if(this.W.ih().d(a.d.a()).b()){
             return b;
          }
       }
       String str = "live_anchor_plugin";
       if (g.e(str) || (Dva.instance().isLoaded(str) && d.a(0x3652a147).pD(this.W).booleanValue())) {
          Object[] objArray = new Object[b];
          a.D().w("CameraActivity", "LiveEntryPlugin, isTakePictureFragmentShowing...", objArray);
          return b;
       }else {
          obj = this.W;
          if (obj instanceof CameraBaseFragment) {
             b uob = obj.ih();
             if (uob.d(v.e).b == null && !CameraLogger.d(uob)) {
                b = true;
             }
             return b;
          }else {
             return true;
          }
       }
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "30")) {
          return;
       }
       super.Z();
       this.X0.Z();
       return;
    }
    public final void Z3(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "33")) {
          return;
       }
       if (!this.isFinishing() && !this.Y0.a().isRecording()) {
          boolean b = false;
          if (this.o1 != null) {
             this.U0 = b;
          }
          if (this.U0 != null) {
             this.q1 = true;
             this.U0 = b;
             int i = 0x7c418b06;
             if (this.p1 != null) {
                d.a(i).S10(this, 291, this.p1, new CameraActivity$c(this));
             }else {
                d.a(i).E50(this, 291, new CameraActivity$d(this));
             }
          }
       }
    label_0057 :
       return;
    }
    public final void a4(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CameraActivity.class, "80")) {
          return;
       }
       if (!this.Y3()) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "showTabPanelRadioGroup: ", objArray);
       this.X0.v(p0, p1);
       return;
    }
    public final int b4(int p0){
       if (PatchProxy.isSupport(CameraActivity.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "62");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 6 && (p0 != 8 && p0 != 1)) {
          if (p0 == 5) {
             x a = PostExperimentUtils.a;
          }else if(p0 == 12 || p0 == 16){
             return p0;
          }
       }
       return 1;
    }
    public final void d4(int p0,c p1){
       x a;
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, CameraActivity.class, "63")) {
          return;
       }
       int i = 2;
       int i1 = 16;
       int i2 = 12;
       int i3 = 8;
       int i4 = 6;
       int i5 = 0;
       if (p0 != i4 && (p0 != i3 && p0 != 1)) {
          if (p0 == 5) {
             a = PostExperimentUtils.a;
          }else if(p0 != i2 && p0 != i1){
             CameraActivity tW0 = this.W0;
             Objects.requireNonNull(tW0);
             b uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tW0, uob, "2")) {
                Object[] objArray1 = new Object[i5];
                a.D().s("FlyWheel", "notifyTabChangeByTabId: "+p0, objArray1);
                if (p0 != 1 && (p0 != i3 && p0 != i2)) {
                   if (p0 != 5) {
                      if (p0 != i4 && p0 != i1) {
                         i5 = (p0 != 17)? -1: 3;
                      }
                   }else {
                      i5 = 1;
                   }
                }
             label_007e :
                if (!i5 || i5 == 1) {
                   if (tW0.b.P3(p0)) {
                      i = 3;
                   }else if(tW0.b.S3(p0)){
                   label_0095 :
                      i = i5;
                   }
                }else {
                   goto label_0095 ;
                }
                tW0.a(i);
             }
             return;
          }
       }
       if (p0 != 1) {
          if (p0 != i3) {
             if (p0 != i2 && p0 != i1) {
                if (p0 == 5) {
                   i = 5;
                }
             }else {
                i = 0;
             }
          }else {
             i = 4;
          }
       }else {
          i = this.h1;
       }
       Object[] objArray = new Object[i5];
       a.D().w("CameraActivity", "updateRecordModeIfNeed, recordMode :"+i, objArray);
       this.H0(i, p1, this.S3(p0), this.P3(p0));
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraActivity.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.S == null) {
          return true;
       }
       return super.dispatchKeyEvent(p0);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       CameraActivity obj = PatchProxy.applyOneRefs(p0, this, CameraActivity.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V0 == null) {
          try{
             this.V0 = (n.t(this) - n.q(this)) - n.c(this, 50.00f);
          }catch(java.lang.Exception e0){
             a.D().e("CameraActivity", "dispatchTouchEvent", e0);
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "1")) {
          return;
       }
       this.R = m1.f(p0, 0x7f0a0631);
       this.Q = m1.f(p0, 0x7f0a2a96);
       p0 = m1.f(p0, R.id.root_layout);
       this.s1 = p0;
       if (p0 == null) {
          a uoa = a.D();
          StringBuilder str = "mRootView is null  ";
          boolean b = true;
          boolean b1 = (this.Q == null)? true: false;
          str = str+b1+" ";
          if (this.R != null) {
             b = false;
          }
          Object[] objArray = new Object[0];
          uoa.w("CameraActivity", str+b, objArray);
       }
       if (this.o1()) {
          this.s1.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       }
       return;
    }
    public void e4(int p0,c p1){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, CameraActivity.class, "67")) {
          return;
       }
       if (p1 instanceof CameraFragment) {
          this.X0.r(p0, p1);
       }
       return;
    }
    public void finish(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraActivity.class, "43")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "finish";
       a.D().w("CameraActivity", str, objArray1);
       boolean b = this.Y0.f();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(this, Boolean.valueOf(b), objArray, uoa, "5")) {
          String str1 = "PageInterface_BK";
          i1 = j0.b(this.getIntent(), str1, i);
          if (a.a(i1)) {
             i3 oi3 = i3.f();
             oi3.c("pageId", Integer.valueOf(i1));
             oi3.d("step", str);
             int i2 = 1;
             oi3.a("resumed", Boolean.valueOf((j0.g(this.getIntent(), "PageInterface") ^ i2)));
             oi3.a("isCameraEverOpened", Boolean.valueOf(b));
             if (!b && !PermissionUtils.a(a.a().a(), "android.permission.CAMERA")) {
                i2 = false;
             }
             oi3.a("hasCameraPermission", Boolean.valueOf(i2));
             u1.Q("PostEntranceLog", oi3.e());
             l.a(this.getIntent(), str1);
          }
       }
       this.u1.b(this);
       CameraActivity tW = this.W;
       if (tW != null && tW.a4()) {
          tW = this.R;
          if (tW != null) {
             tW.setVisibility(4);
          }
       }
       if (this.Y != null) {
          e uoe = this.getSupportFragmentManager().beginTransaction();
          i1 = 0;
          while (i1 < this.Y.size()) {
             c uoc = this.Y.valueAt(i1);
             CameraActivity tW1 = this.W;
             if (tW1 == uoc && (!tW1.a4() && (uoc instanceof Fragment && uoc.isAdded()))) {
                uoe.u(uoc);
             }
          label_00f3 :
             i1 = i1 + 1;
          }
          uoe.m();
          tW = this.X0;
          if (tW != null) {
             tW.w(i, i);
          }
       }
       super.finish();
       if (!PatchProxy.applyVoidOneRefs(this, objArray, y.class, "4")) {
          a.p(this, "activity");
          Intent intent = this.getIntent();
          if (intent != null) {
             if (!intent.getBooleanExtra("backToKuaishan", i)) {
                objArray = new Object[i];
                a.D().w("KuaishanJumpHandler", "backToKuaishanIfNeeded\(\) no need to back to kuaishan", objArray);
             }else {
                String stringExtra = intent.getStringExtra("kuaishan_template_id");
                if (stringExtra == null) {
                   objArray = new Object[i];
                   a.D().t("KuaishanJumpHandler", "backToKuaishanIfNeeded\(\) no templateId", objArray);
                }else if(i.h()){
                   i oi = i.m();
                   a.o(oi, "PostSession.current\(\)");
                   if (oi.C()) {
                      objArray = new Object[i];
                      a.D().w("KuaishanJumpHandler", "backToKuaishanIfNeeded\(\) normal finish no need to navigate to kuaishan", objArray);
                   }
                }
                MediaSceneLaunchParams mediaSceneLa = j0.e(intent, "mediaSceneLaunchParam");
                if (mediaSceneLa == null) {
                   objArray = new Object[i];
                   a.D().w("KuaishanJumpHandler", "backToKuaishanIfNeeded\(\) normal kuaishan", objArray);
                   this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("kwai://kuaishan?allowJumpToolbox=true&disableSliding=true&flashTemplateId="+stringExtra)));
                }else {
                   MediaSceneInitParams mediaSceneIn = new MediaSceneInitParams();
                   mediaSceneIn.mServerParams = objArray;
                   mediaSceneIn.mLaunchParams = mediaSceneLa;
                   k1.r(new x(this, mediaSceneIn), 0);
                }
             }
          }
       }
       this.overridePendingTransition(R.anim.arg_RES_7f010031, 0x7f0100e6);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CameraActivity.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Z;
       if (obj == 1) {
          return "ks://camera/long/video_record/fullscreen";
       }
       if (obj == 2) {
          return "ks://camera/longlong/video_record/fullscreen";
       }
       if (obj == 4) {
          return "ks://camera/verylong/video_record/fullscreen";
       }
       return "ks://camera/normal/video_record/fullscreen";
    }
    public Context host(){
       return this;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public j k(){
       Object obj = PatchProxy.apply(null, this, CameraActivity.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y0.a();
    }
    public LifecycleOwner lifecycleOwner(){
       return this;
    }
    public String m0(){
       Intent obj = PatchProxy.apply(null, this, CameraActivity.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          int intExtra = obj.getIntExtra("tag_source_tag_type", 0);
          if (intExtra != 1) {
             if (intExtra != 3) {
                if (intExtra == 4) {
                   return "MAGIC_TAG_PAGE";
                }
             }else {
                return "MUSIC_TAG_PAGE";
             }
          }else {
             return "TOPIC_TAG_PAGE";
          }
       }
       return null;
    }
    public CameraBaseFragment o0(){
       CameraActivity tW = this.W;
       if (tW == null || !tW instanceof CameraBaseFragment) {
          return null;
       }
       return tW;
    }
    public boolean o1(){
       CameraActivity obj = PatchProxy.apply(null, this, CameraActivity.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t1;
       if (obj != null) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getIntent() == null || (!j0.a(this.getIntent(), "disableLayoutArrangementOpt", b) && !d.a(0x3652a147).pD(this.W).booleanValue())) {
          b = b.d();
       }
       if (this.d1 != null) {
          this.t1 = Boolean.valueOf(b);
       }
       return b;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CameraActivity.class, "53")) {
          return;
       }
       if (p1 == -1 && i.m().D() == 2) {
          Object obj = i.m().A("fromRecordDraftTab", Boolean.FALSE);
          if (obj instanceof Boolean && obj.booleanValue()) {
             i.m().d0(0);
          }
       }
       super.onActivityResult(p0, p1, p2);
       this.X0.e(p0);
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "24")) {
          return;
       }
       CameraActivity tW = this.W;
       if (tW == null || !tW.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "39")) {
          return;
       }
       CameraActivity tW = this.W;
       if (tW == null) {
          return;
       }
       if (tW instanceof View$OnClickListener) {
          tW.onClick(p0);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "18")) {
          return;
       }
       super.onConfigurationChanged(p0);
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onConfigurationChanged...Configuration:"+p0, objArray);
       CameraActivity tn1 = this.n1;
       int i = (tn1 != null)? tn1.diff(p0): 0;
       if (!(i & 0x0800) && (!(i & 0x0400) && ((i & 0x0100) || (i & 0x0080)))) {
          Object[] objArray1 = new Object[0];
          a.D().w("CameraActivity", "onConfigurationChanged...Configuration post", objArray1);
          tn1 = this.X0;
          if (tn1 != null) {
             tn1.onConfigurationChanged(p0);
          }
          if (g.m(this) && this.n1.screenWidthDp != p0.screenWidthDp) {
             this.finish();
             i.a(R.style.arg_RES_7f11066a, 0x7f1036f6);
             this.a1 = CameraLogger.t(this, p0, true, this.a1);
          }else {
             RxBus.f.b(new a(p0));
             this.a1 = CameraLogger.t(this, p0, 0, this.a1);
          }
       }
       this.n1 = new Configuration(p0);
       return;
    }
    public void onCreate(Bundle p0){
       int len;
       SharedPreferences a;
       int i1;
       String str8;
       String str9;
       String str10;
       Intent intent1;
       int b2;
       Intent intent2;
       String str11;
       String str12;
       String str13;
       String str14;
       View view;
       CameraActivity y0;
       StringBuilder str16;
       Intent intent3;
       String obj2;
       boolean b3;
       a obj3;
       boolean b4;
       boolean i2;
       boolean b5;
       BaseViewBinder this;
       boolean len1;
       Object[] objArray5;
       String str18;
       Intent obj4;
       long l = this;
       RxBus obj = p0;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(obj, l, CameraActivity.class, "14")) {
          return;
       }
       a uoa1 = a.D();
       String str = "onCreate...savedInstanceState is null:";
       boolean b = true;
       boolean i = 0;
       int b1 = (obj == null)? true: false;
       Object[] objArray = new Object[i];
       String str1 = "CameraActivity";
       uoa1.w(str1, str+b1+" "+l, objArray);
       String str2 = "postCameraActivityCreateMonitor";
       d.d(str2).n();
       PreLoader.getInstance().clearAll();
       l.v1 = k1.i();
       Object[] objArray1 = null;
       String str3 = "1";
       if (!PatchProxy.applyVoid(objArray1, objArray1, z0.class, str3)) {
          z0.a = System.currentTimeMillis();
       }
       if (obj != null) {
          String[] x1 = CameraActivity.x1;
          len = x1.length;
          for (b1 = 0; b1 < len; b1 = b1 + 1) {
             obj.remove(x1[b1]);
          }
       }
       if (k.c() == null) {
          k.f(new b());
       }
       Intent intent = this.getIntent();
       if (p.e(intent)) {
          l.Y0.i(l.X);
       }
       if (intent != null && c7.a.b(intent)) {
          intent.putExtra("discard_current_post_session", b);
       }
       str = "16";
       if (!PatchProxy.applyVoid(objArray1, l, CameraActivity.class, str)) {
          if (c7.a.b(this.getIntent())) {
             obj4 = PatchProxy.apply(objArray1, l, CameraActivity.class, "92");
             if (obj4 != PatchProxyResult.class) {
                i2 = obj4.booleanValue();
             }else {
                obj4 = this.getIntent();
                i2 = (obj4 == null)? false: j0.a(obj4, "keyUsePageAnimationFromIntent", i);
             }
             if (!i2) {
                l.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
             }
          }
          obj4 = this.getIntent();
          if (obj4 != null) {
             b1 = j0.b(obj4, "start_enter_page_animation", i);
             i2 = j0.b(obj4, "start_exit_page_animation", i);
             if (b1 || i2) {
                l.overridePendingTransition(b1, i2);
             }
          }
       }
    label_00ff :
       this.getWindow().addFlags(128);
       super.onCreate(p0);
       String str4 = "3";
       if (!PatchProxy.applyVoidOneRefs(l, objArray1, a.class, str4)) {
          a.b(j0.b(this.getIntent(), "PageInterface", i), "onCreate");
       }
       if (this.isFinishing()) {
          return;
       }else {
          obj = RxBus.f;
          obj.b(new b());
          RecordPModuleRegister.f().a();
          AtomicBoolean uAtomicBoole = new AtomicBoolean(i);
          RecordPModuleRegister.f().e(new i(l, uAtomicBoole));
          if (uAtomicBoole.get()) {
             return;
          }else {
             String str5 = "key_camera_viewbinder_option";
             l.X.Qh(j0.f(this.getIntent(), str5));
             PostFunnelManager$a j = PostFunnelManager.j;
             j.a().d().l(b.b);
             a = a.a;
             String str6 = "last_version_enter_camera";
             if (!(a.m).equals(a.getString(str6, ""))) {
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putString(str6, a.m);
                g.a(uEditor);
                a.v1(1);
                i1 = 1;
             }else {
                i1 = a.getInt("present_version_enter_shoot_time", 0);
                a.v1((i1 + 1));
             }
             a a1 = a.a;
             Objects.requireNonNull(a1);
             String str7 = "5";
             if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), a1, uoa, str7)) {
                str8 = str2;
             }else {
                str8 = str2;
                j.a().d().l(new CameraFunnel$funnelRecordEnter$1(i1));
             }
             Objects.requireNonNull(a1);
             str6 = "6";
             if (!PatchProxy.applyVoid(null, a1, uoa, str6)) {
                j.a().d().l(CameraFunnel$funnelRecordAb$1.INSTANCE);
             }
             obj.b(new a());
             this.O3();
             str2 = "photo_task_id";
             if (PatchProxy.applyVoid(null, l, CameraActivity.class, "84")) {
             label_0201 :
                str9 = str5;
                str10 = str7;
             }else {
                Intent intent4 = this.getIntent();
                if (intent4 == null) {
                   goto label_0201 ;
                }else {
                   str18 = j0.f(this.getIntent(), str2);
                   if (TextUtils.x(str18)) {
                      str18 = u1.f();
                   }
                   str10 = str7;
                   str7 = j0.f(intent4, "TASK_ID_SUFFIX_KEY");
                   if (!TextUtils.x(str7)) {
                      str9 = str5;
                      str18 = str18+str7;
                   }else {
                      str9 = str5;
                   }
                   intent4.putExtra(str2, str18);
                   Objects.requireNonNull(a1);
                   if (!PatchProxy.applyVoidOneRefs(str18, a1, uoa, str3)) {
                      a.p(str18, "taskId");
                      j.a().d().l(new CameraFunnel$funnelTaskId$1(str18));
                   }
                }
             }
             if (a.a.b(l)) {
                PostPolicyAlbumActivity postPolicyAl = PostPolicyAlbumActivity.class;
                if (!PatchProxy.applyVoidOneRefs(l, null, postPolicyAl, str3)) {
                   intent1 = new Intent(l, postPolicyAl);
                   if (this.getIntent() != null) {
                      Bundle extras = this.getIntent().getExtras();
                      if (extras != null) {
                         intent1.putExtras(extras);
                      }
                      intent1.putExtra("source_intent", this.getIntent());
                   }
                   l.startActivity(intent1);
                   l.overridePendingTransition(0, 0);
                   this.finish();
                }
                return;
             }else {
                y oy = y.class;
                c obj1 = PatchProxy.applyOneRefs(l, null, oy, str3);
                if (obj1 != PatchProxyResult.class) {
                   b2 = obj1.booleanValue();
                   intent2 = intent;
                   str11 = str6;
                   str12 = str1;
                   str13 = str2;
                   str14 = str3;
                }else {
                   a.p(l, "activity");
                   intent1 = this.getIntent();
                   if (intent1 != null) {
                      len1 = false;
                      if (j0.a(intent1, "kuaishan_allow_to_jump", len1)) {
                         y a3 = y.a;
                         Objects.requireNonNull(a3);
                         str18 = "2";
                         if (PatchProxy.applyVoidTwoRefsWithListener(l, intent1, a3, oy, str18)) {
                            intent2 = intent;
                            str11 = str6;
                            str12 = str1;
                            str13 = str2;
                            str14 = str3;
                         }else {
                            objArray1 = new Object[len1];
                            str13 = str2;
                            a.D().w("KuaishanJumpHandler", "跳转快闪， 另起页面处理", objArray1);
                            obj3 = d.a(0x320e600c);
                            KuaishanPageParam$a uoa3 = KuaishanPageParam$a.class;
                            KuaishanPageParam kuaishanPage = PatchProxy.applyOneRefs(intent1, a3, oy, str4);
                            if (kuaishanPage != PatchProxyResult.class) {
                               intent2 = intent;
                               str11 = str6;
                               str12 = str1;
                               str14 = str3;
                            }else {
                               String str19 = j0.f(intent1, "kuaishan_group_id");
                               str2 = j0.f(intent1, "kuai_shan_template_source");
                               str14 = str3;
                               str11 = str6;
                               i = j0.a(intent1, "disableSliding", false);
                               intent2 = intent;
                               b3 = j0.a(intent1, "allowJumpToolbox", false);
                               str12 = str1;
                               KuaishanPageParam$a uoa4 = new KuaishanPageParam$a().k(c.b(intent1, true)).i(j0.f(intent1, "kuaishan_template_id")).g((j0.a(intent1, "returnToOriginalPage", false) ^ 0x01));
                               Objects.requireNonNull(uoa4);
                               if (PatchProxy.isSupport(uoa3)) {
                                  obj4 = PatchProxy.applyOneRefs(Boolean.valueOf(i), uoa4, uoa3, "15");
                                  if (obj4 != PatchProxyResult.class) {
                                     uoa4 = obj4;
                                  label_0375 :
                                     Objects.requireNonNull(uoa4);
                                     if (PatchProxy.isSupport(uoa3)) {
                                        obj4 = PatchProxy.applyOneRefs(Boolean.valueOf(b3), uoa4, uoa3, str);
                                        if (obj4 != PatchProxyResult.class) {
                                           uoa4 = obj4;
                                        label_038e :
                                           if (!TextUtils.x(str19)) {
                                              uoa4.h(str19);
                                           }
                                           if (!TextUtils.x(str2)) {
                                              Objects.requireNonNull(uoa4);
                                              if (PatchProxy.applyOneRefs(str2, uoa4, uoa3, "10") != PatchProxyResult.class) {
                                              }else {
                                                 uoa4.o = str2;
                                              }
                                           }
                                           kuaishanPage = uoa4.f();
                                           a.o(kuaishanPage, "builder.build\(\)");
                                        }
                                     }
                                     uoa4.x = b3;
                                     goto label_038e ;
                                  }
                               }
                               uoa4.w = i;
                               goto label_0375 ;
                            }
                            obj3.XF(l, kuaishanPage);
                            this.finish();
                            l.overridePendingTransition(R.anim.arg_RES_7f010109, 0);
                            PatchProxy.onMethodExit(oy, str18);
                         }
                         b2 = true;
                      }
                   }
                   intent2 = intent;
                   str11 = str6;
                   str12 = str1;
                   str13 = str2;
                   str14 = str3;
                   b2 = false;
                }
                if (b2) {
                   d7.a.h(this.getIntent());
                   Object[] objArray2 = new Object[0];
                   a.D().w(str12, "jump to kuaishan!", objArray2);
                   return;
                }else {
                   String str15 = str12;
                   if (!PatchProxy.applyVoid(null, l, CameraActivity.class, "76")) {
                      int[] ointArray = new int[6]{10,5,1,2,3,11};
                      l.Y = new SparseArray(6);
                      str16 = "";
                      i2 = 0;
                      while (i2 < 6) {
                         Fragment uFragment = this.getSupportFragmentManager().findFragmentByTag("camera_activity_fragment_tag_"+ointArray[i2]);
                         if (uFragment != null && uFragment instanceof c) {
                            if (!uFragment.isDetached()) {
                               l.X3(uFragment);
                            }
                            l.Y.put(ointArray[i2], uFragment);
                            str16 = str16+ointArray[i2]+",";
                            objArray5 = new Object[0];
                            a.D().w(str15, "initFragments: system="+uFragment.getClass().getName(), objArray5);
                         }
                         i2 = i2 + 1;
                      }
                      i2 = 1;
                      if (str16.length() > i2) {
                         PostUtils.x("camera_sys_fmt", str16.substring(0, (str16.length() - i2)));
                      }
                   }
                   long l1 = k1.i();
                   try{
                      view = BasePostActivity.C3(l, l.I.p());
                      if (view == null) {
                         objArray5 = new Object[0];
                         a.D().t(str15, "content view is null", objArray5);
                      label_04ac :
                         l.setContentView(view);
                         view = this.getWindow().getDecorView();
                         str = "empty_content_view";
                         if (view != null) {
                            l.I.v(l);
                            if (view.findViewById(0x7f0a369f) != null) {
                               if (view.findViewById(0x7f0a0931) != null) {
                                  if (view.findViewById(0x7f0a063e) == null) {
                                     objArray5 = new Object[0];
                                     a.D().t(str15, "Cannot find View tab", objArray5);
                                     PostUtils.x(str, "Cannot find View tab");
                                     throw new IllegalStateException("Cannot find View tab");
                                  }
                               }else {
                                  objArray5 = new Object[0];
                                  a.D().t(str15, "Cannot find View container", objArray5);
                                  PostUtils.x(str, "Cannot find View container");
                                  throw new IllegalStateException("Cannot find View container");
                               }
                            }else {
                               objArray5 = new Object[0];
                               a.D().t(str15, "Cannot find root_layout", objArray5);
                               PostUtils.x(str, "Cannot find root_layout");
                               throw new IllegalStateException("Cannot find root_layout");
                            }
                         }else {
                            objArray5 = new Object[0];
                            a.D().t(str15, "Cannot root View is null", objArray5);
                            PostUtils.x(str, "Cannot root View is null");
                            throw new IllegalStateException("Cannot root View is null");
                         }
                      }else {
                         goto label_04ac ;
                      }
                   }catch(java.lang.Exception e0){
                      i1.c(e0);
                      ExceptionHandler.handleCaughtException(e0);
                      a.D().e(str15, "onCreate: ", e0);
                      b2 = 0x7f0d016b;
                      l.setContentView(b2);
                      if (!l.H3(this.getWindow().getDecorView())) {
                         Object[] objArray3 = new Object[0];
                         a.D().t(str15, "onCreate: view is null, reset contentView", objArray3);
                         view = a.g(LayoutInflater.from(this), b2, null, 0);
                         objArray3 = new Object[0];
                         a.D().w(str15, "onCreate: view is null, reset contentView pre", objArray3);
                         l.H3(view);
                         l.setContentView(view);
                         objArray3 = new Object[0];
                         a.D().w(str15, "onCreate: view is null, reset contentView after", objArray3);
                         l.H3(this.getWindow().getDecorView());
                      }
                   }
                   l.u1.a(l);
                   a.c(l, "activity setContentView", l1);
                   if (p.e(intent2)) {
                      y0 = l.Y0;
                      Objects.requireNonNull(y0);
                      str1 = str11;
                      if (!PatchProxy.applyVoid(null, y0, d.class, str1)) {
                         y0.c.U0(y0.e());
                      }
                   }else {
                      str1 = str11;
                   }
                   l.X0.l(l);
                   l.doBindView(this.getWindow().getDecorView());
                   y0 = l.X;
                   str16 = j0.f(this.getIntent(), str9);
                   Objects.requireNonNull(y0);
                   if (PatchProxy.applyVoidTwoRefs(l, str16, y0, CameraFragment.class, "54")) {
                      intent3 = intent2;
                   }else if(y0.N == null && this.getWindow() != null){
                      y0.Qh(str16);
                      l1 = a1.k();
                      if (s6.G()) {
                         Boolean uBoolean = (a.a().c() && l.c("KEY_POST_CAMERA_STARTUP_OPT_DISABLE_FRAG_X2C", false))? 1: null;
                         if (!uBoolean) {
                            b5 = true;
                         label_061f :
                            p op = new p(y0, l1);
                            if (PatchProxy.isSupport(m.class)) {
                               intent3 = intent2;
                               this = PatchProxy.applyFourRefs(this, y0, Boolean.valueOf(b5), op, null, m.class, "1");
                               if (this != PatchProxyResult.class) {
                               label_067e :
                                  y0.N = this;
                               }
                            }else {
                               intent3 = intent2;
                            }
                            this = y0.V5(-1);
                            this.p();
                            PreLoader.getInstance().preload(new PreloadParam$Builder(l).addLayoutId(this.p()).setUseAx2c(b5).setForceUpgradeLimit(true).setInflateListener(new l(this.p(), this, l, op)).build());
                            goto label_067e ;
                         }
                      }
                      b5 = false;
                      goto label_061f ;
                   }else {
                      intent3 = intent2;
                   }
                   if (!PatchProxy.applyVoidOneRefs(l, null, g.class, str14) && g.I2()) {
                      l1 = System.currentTimeMillis();
                      PreloadParam$Builder uBuilder = new PreloadParam$Builder(l);
                      uBuilder.setUseMutableContext(true);
                      uBuilder.setUseAx2c(true);
                      int[] s = g.S;
                      uBuilder.setMaxCount(s.length);
                      len1 = s.length;
                      for (i1 = 0; i1 < len1; i1 = i1 + 1) {
                         uBuilder.addLayoutId(s[i1]);
                      }
                      uBuilder.setInflateListener(new j(l1));
                      PreLoader.getInstance().preload(uBuilder.build());
                   }
                   if (y0.Y0 == null) {
                      y0.Mh(l);
                      RecordPModuleRegister.f().a();
                      k.a.d(new e(y0, System.currentTimeMillis(), l));
                      y0.Y0 = true;
                   }
                   this.getWindow().setFormat(-3);
                   this.M3();
                   str16 = "record_mode";
                   if (!PatchProxy.applyVoid(null, l, CameraActivity.class, str10)) {
                      i2 = 0;
                      l.Z = j0.b(this.getIntent(), str16, i2);
                      objArray = new Object[i2];
                      a.D().w(str15, "initRecordModeFromIntent : "+l.Z, objArray);
                   }
                   if (!PatchProxy.applyVoid(null, l, CameraActivity.class, str1)) {
                      len = 0;
                      b2 = j0.b(this.getIntent(), "key_is_open_auto_gc", len);
                      str4 = 1;
                      if (b2 != str4) {
                         if (b2 == 2) {
                            g.p1(len);
                         }
                      }else {
                         g.p1(str4);
                      }
                   }
                   if (this.getIntent() != null) {
                      l.E3(new g(l));
                   }
                   if (!PatchProxy.applyVoid(null, l, CameraActivity.class, "57")) {
                      l.X0.a(R.color.arg_RES_7f061cf4);
                      l.X0.o(new r(l, a.d(this.getIntent())));
                   }
                   str4 = "camera_page_source";
                   if (PatchProxy.isSupport(CameraActivity.class)) {
                      obj2 = PatchProxy.applyOneRefs(Boolean.FALSE, l, CameraActivity.class, "58");
                      if (obj2 != PatchProxyResult.class) {
                         obj2.intValue();
                      }else {
                      label_07a0 :
                         b2 = l.X0.g();
                         len = l.b4(b2);
                         obj1 = l.Y.get(len);
                         if (obj1 == null) {
                            obj1 = l.U3(len);
                            if (obj1 != null) {
                               l.Y.put(len, obj1);
                               Object[] objArray4 = new Object[0];
                               a.D().w(str15, "createFragment: "+obj1.getClass().getName(), objArray4);
                            }
                         }
                         if (obj1 != null) {
                            c uoc = obj1;
                            Bundle arguments = uoc.getArguments();
                            if (arguments == null) {
                               arguments = new Bundle();
                            }
                            intent = (len != 1 && (len != 12 && (len == 5 || len == 16)))? 1: 0;
                            arguments.putBoolean("is_default_selected_page", true);
                            b = (this.K3() && intent)? true: false;
                            arguments.putBoolean("is_ultra_wide_camera_enable", b);
                            b3 = (g1.k() && intent)? true: false;
                            arguments.putBoolean("is_super_stability_enable", b3);
                            if (obj1.lf() && TextUtils.x(l.k1)) {
                               str15 = str13;
                               String str17 = j0.f(this.getIntent(), str15);
                               l.k1 = str17;
                               if (TextUtils.x(str17)) {
                                  l.k1 = u1.f();
                               }
                               arguments.putString(str15, l.k1);
                            }
                            uoc.setArguments(arguments);
                            l.Y0.i(obj1);
                            obj3 = PatchProxy.apply(null, l, CameraActivity.class, "60");
                            if (obj3 != PatchProxyResult.class) {
                               b4 = obj3.booleanValue();
                               i1 = 0;
                            }else {
                               i1 = 0;
                               b4 = (j0.b(this.getIntent(), str4, i1) == 11)? true: false;
                            }
                            if (b4 && j0.g(this.getIntent(), str16)) {
                               l.H0(j0.b(this.getIntent(), str16, i1), obj1, l.S3(len), l.P3(len));
                            }else if(b2 == 1){
                               len = 8;
                               if (l.X0.C() == len) {
                                  l.d4(len, obj1);
                               }else if(l.X0.C() == 6){
                                  l.d4(6, obj1);
                               }else {
                                  l.d4(b2, obj1);
                               }
                            }else {
                               l.d4(b2, obj1);
                            }
                         }
                      }
                   }else {
                      goto label_07a0 ;
                   }
                   l.l1.c(f.a(g.class, new q(l)));
                   l.l1.c(f.a(h.class, new l(l)));
                   l.l1.c(f.a(i.class, new k(l)));
                   l.l1.c(f.a(w.class, new m(l)));
                   l.l1.c(f.a(h$a.class, new p(l)));
                   l.l1.c(f.a(e.class, new o(l)));
                   l.l1.c(f.a(f.class, new n(l)));
                   l.l1.c(f.a(d.class, new j(l)));
                   if (!PatchProxy.applyVoid(null, l, CameraActivity.class, "19")) {
                      SharedPreferences a2 = a.a;
                      str16 = "has_show_hot_tip_dialog";
                      len = false;
                      if (!a2.getBoolean(str16, len) && j0.b(this.getIntent(), str4, len) == 1) {
                         t$a uoa2 = new t$a(l);
                         uoa2.W0(R.string.arg_RES_7f103d95);
                         uoa2.y0(R.string.arg_RES_7f103d94);
                         uoa2.S0(R.string.arg_RES_7f101812);
                         d.a(0x34dc9f9c).lV(uoa2, PostDialogPlugin$DialogScenario.UNKNOWN);
                         SharedPreferences$Editor uEditor1 = a2.edit();
                         uEditor1.putBoolean(str16, true);
                         g.a(uEditor1);
                      label_099c :
                         obj2 = PatchProxy.apply(null, l, CameraActivity.class, "82");
                         if (obj2 != PatchProxyResult.class) {
                            b2 = obj2.booleanValue();
                         }else {
                            obj2 = Build.MODEL;
                            str15 = (!TextUtils.n(obj2, "PACM00") && (TextUtils.n(obj2, "PBDM00") || TextUtils.n(obj2, "PBEM00")))? 1: 0;
                            b2 = str15;
                         }
                         l.U = b2;
                         l.n1 = new Configuration(this.getResources().getConfiguration());
                         if (l.R != null && p.e(intent3)) {
                            f.F(l.R, new h(l));
                         }
                         d.b("task_id", l.k1);
                         d.d(str8).c();
                         l.a1 = CameraLogger.t(l, l.n1, false, l.a1);
                         c.d().h("switchPostTab", l.g1);
                         c.d().h("updatePostBottomTabStatus", l.f1);
                         return;
                      }
                   }
                   str4 = 1;
                   goto label_099c ;
                }
             }
          }
       }
    }
    public void onDestroy(){
       int[] ointArray;
       boolean b = this;
       if (PatchProxy.applyVoid(null, b, CameraActivity.class, "29")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onDestroy "+b, objArray);
       c.d().i("switchPostTab", b.g1);
       c.d().i("updatePostBottomTabStatus", b.f1);
       d.d("postCameraActivityDestroyMonitor").n();
       long l = k1.t(b.v1);
       CameraActivity w1 = b.w1;
       boolean b1 = b.Y0.f();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(this, Long.valueOf(l), Boolean.valueOf(w1), Boolean.valueOf(b1), null, a.class, "6")) {
          i3 oi3 = i3.f();
          oi3.c("pageId", Integer.valueOf(j0.b(this.getIntent(), "PageInterface_BK", 0)));
          oi3.d("step", "destroy");
          oi3.c("lifeTime", Long.valueOf(l));
          oi3.a("resumed", Boolean.valueOf(w1));
          oi3.a("isCameraEverOpened", Boolean.valueOf(b1));
          boolean b2 = (b1 || PermissionUtils.a(a.a().a(), "android.permission.CAMERA"))? true: false;
          oi3.a("hasCameraPermission", Boolean.valueOf(b2));
          u1.Q("PostEntranceLog", oi3.e());
       }
       b.X0.onDestroy();
       b.Y0.b();
       CameraActivity w0 = b.W0;
       w0.a = -1;
       w0.c = null;
       b.e1 = false;
       super.onDestroy();
       b9.a(b.l1);
       if (RecordPModuleRegister.f().g()) {
          RecordPModuleRegister.f().d();
       }
       b.W3(b.W);
       if (b.I != null) {
          ointArray = new int[]{b.I.p()};
          PreLoader.getInstance().clear(ointArray);
       }
       ointArray = new int[]{0x7f0d016f};
       PreLoader.getInstance().clear(ointArray);
       d.d("postCameraActivityDestroyMonitor").c();
       RxBus.f.b(new a());
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       CameraActivity obj;
       if (PatchProxy.isSupport(CameraActivity.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, CameraActivity.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.W;
       if (obj != null && obj.onKeyDown(p0, p1)) {
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       CameraActivity obj;
       if (PatchProxy.isSupport(CameraActivity.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, CameraActivity.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.W;
       if (obj != null && obj.onKeyUp(p0, p1)) {
          return true;
       }else {
          return super.onKeyUp(p0, p1);
       }
    }
    public void onMultiWindowModeChanged(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, CameraActivity.class, "17")) {
          return;
       }
       super.onMultiWindowModeChanged(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CameraActivity", "onMultiWindowModeChanged...isInMultiWindowMode:"+p0+" , newConfig:"+p1, objArray);
       CameraActivity tW = this.W;
       if (tW != null && tW.isAdded()) {
          this.getSupportFragmentManager().beginTransaction().p(this.W).m();
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.k(this.W);
          uoe.m();
          if (this.W instanceof CameraFragment && (this.Y0.a().B() || this.Y0.a().isRecording())) {
             Object[] objArray1 = new Object[i];
             a.D().A("CameraActivity", "CameraFragment has RecordInfo when changing multi-window mode, cancel all recording!", objArray1);
             this.Y0.a().E(true);
          }
       }
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity.class, "15")) {
          return;
       }
       super.onNewIntent(p0);
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onNewIntent "+this, objArray);
       this.setIntent(p0);
       this.O3();
       this.M3();
       CameraActivity tW = this.W;
       if (tW != null && tW instanceof CameraFragment) {
          tW.ih().m(new d());
       }
       this.X0.p(this.X0.g());
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "36")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("CameraActivity", "onPause "+this, objArray);
       d.d("postCameraActivityPauseMonitor").n();
       k1.i();
       this.Y0.c();
       super.onPause();
       d.d("postCameraActivityPauseMonitor").c();
       return;
    }
    public void onPostResume(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "25")) {
          return;
       }
       super.onPostResume();
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CameraActivity.class, "26")) {
          return;
       }
       super.onRequestPermissionsResult(p0, p1, p2);
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraActivity.class, "31")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CameraActivity", "onResume "+this, objArray1);
       if (!PatchProxy.applyVoidOneRefs(this, objArray, a.class, "4")) {
          String str1 = "PageInterface";
          a.b(j0.b(this.getIntent(), str1, 0), "onResume");
          l.a(this.getIntent(), str1);
       }
       String str = "postCameraActivityResumeMonitor";
       d.d(str).n();
       k1.i();
       super.onResume();
       this.w1 = true;
       RecordPModuleRegister.f().e(new a(this));
       this.u1.a(this);
       this.Y0.d();
       if (this.Z0 != null) {
          this.Z0 = false;
          k1.r(new a(this), 2000);
       }
       if (b.a(-404437045).e(80)) {
          k1.r(new c(this), 200);
       }else {
          k1.r(new d(this), 50);
          this.E3(new e(this));
       }
       d.d(str).c();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "37")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onStart "+this, objArray);
       d.d("postCameraActivityStartMonitor").n();
       k1.i();
       super.onStart();
       this.X0.onStart();
       d.d("postCameraActivityStartMonitor").c();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onStop "+this, objArray);
       d.d("postCameraActivityStopMonitor").n();
       k1.i();
       super.onStop();
       this.X0.onStop();
       d.d("postCameraActivityStopMonitor").c();
       return;
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraActivity.class, "28")) {
          return;
       }
       super.onTrimMemory(p0);
       return;
    }
    public void onUserLeaveHint(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "27")) {
          return;
       }
       super.onUserLeaveHint();
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       if (PatchProxy.isSupport(CameraActivity.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraActivity.class, "35")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "onWindowFocusChanged "+p0, objArray);
       if (p0) {
          this.u1.a(this);
       }
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, CameraActivity.class, "12")) {
          return;
       }
       super.y3();
       Object[] objArray = new Object[0];
       a.D().w("CameraActivity", "enterFullScreenMode", objArray);
       if (this.o1()) {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0606b3));
       }else {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       }
       return;
    }
}
