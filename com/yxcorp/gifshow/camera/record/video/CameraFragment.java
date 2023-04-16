package com.yxcorp.gifshow.camera.record.video.CameraFragment;
import c35.c;
import mm6.e;
import c35.i;
import zg9.c;
import qc9.a;
import di9.b;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import com.kuaishou.viewbinder.ViewBinderOption;
import oh9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camerasdk.j;
import vc9.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.video.viewbinder.AbsCameraFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import com.kwai.camerasdk.models.Business;
import android.view.View;
import android.view.ViewStub;
import lnc.a1;
import android.view.ViewGroup;
import com.kuaishou.viewbinder.ViewStubViewBinder;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import oe6.e;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import com.kuaishou.viewbinder.IViewBinder;
import ed9.f;
import yh9.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.h;
import qh9.c;
import io.reactivex.subjects.ReplaySubject;
import oh9.f;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.video.f;
import erd.o;
import brd.y;
import oe6.a;
import java.lang.Integer;
import qxc.c;
import com.yxcorp.gifshow.camera.record.video.viewbinder.DefaultCameraFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.DefaultRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import kotlin.jvm.internal.a;
import com.kuaishou.viewbinder.BaseViewBinder;
import java.util.HashMap;
import com.kuaishou.viewbinder.BaseViewBinder$a;
import com.yxcorp.gifshow.camera.bubble.c;
import java.lang.Float;
import oh9.d;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import com.yxcorp.gifshow.camera.record.base.b$a;
import yc9.a;
import oh9.h;
import java.util.ArrayList;
import lnc.s6;
import com.yxcorp.gifshow.camera.record.permission.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import uf9.a;
import com.yxcorp.gifshow.camera.record.log.b;
import cg9.d;
import od9.b;
import xg9.i;
import uh9.c;
import wh9.a;
import oh9.b;
import z1.a;
import bi9.h;
import zd9.h;
import com.yxcorp.gifshow.camera.record.video.k;
import oh9.d0;
import com.yxcorp.gifshow.camera.record.mix.MixCameraFragment;
import wc9.q;
import qh9.b;
import pd9.a;
import pb9.p;
import pb9.f;
import com.yxcorp.gifshow.camera.record.screen.b;
import gi9.b;
import xh9.d;
import fg9.c;
import o36.g;
import wh9.w0;
import pi9.e;
import uc9.f;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import yb9.b;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.permission.CameraPermissionActivity;
import android.content.Context;
import hf9.f;
import hf9.f$b;
import hc9.c;
import ai9.j;
import com.kwai.camerasdk.ErrorCode$Result;
import w46.b;
import oc9.w;
import pi9.p;
import ui9.k;
import me9.s;
import java.util.Objects;
import com.yxcorp.utility.TextUtils;
import fn6.a;
import pm6.m;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import lq.i;
import lq.e;
import java.lang.CharSequence;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.yxcorp.gifshow.video.api.camera.CameraResolutionParameters;
import kd9.s;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import java.lang.Math;
import ld9.b;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import android.os.Bundle;
import kuaishou.perf.page.impl.d;
import h80.h;
import h80.k;
import vc9.b;
import ekd.j0;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import oh9.o;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;
import wc9.r;
import oh9.n;
import zh9.q;
import oh9.j;
import gg9.p;
import oh9.l;
import com.yxcorp.gifshow.util.PermissionUtils;
import yc9.b;
import oh9.i;
import android.view.LayoutInflater;
import va9.a;
import yb9.e;
import cj9.b;
import qvb.s;
import java.util.Map;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.ax2c.PreLoader;
import oh9.c;
import n65.g;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import oh9.m;
import oh9.k;
import rf9.g;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import xh9.a;
import java.util.concurrent.TimeUnit;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.camera.record.video.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.camera.record.video.e;

public abstract class CameraFragment extends RecordFragment implements c, e, i, c, a, b	// class@000f6e
{
    public a M;
    public IViewBinder N;
    public q O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public List U0;
    public g V;
    public AbsRecordBottomBarViewBinder V0;
    public View W;
    public AbsRecordSideBarViewBinder W0;
    public c X;
    public ViewBinderOption X0;
    public f Y;
    public boolean Y0;
    public Activity Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public a c1;
    public final b$a d1;
    public c e1;
    public b f1;
    public b g1;
    public static final int h1;

    public void CameraFragment(){
       super();
       this.P = true;
       this.R = true;
       this.S = false;
       this.T = false;
       this.W = null;
       this.X0 = new ViewBinderOption();
       this.Y0 = false;
       this.Z0 = false;
       this.a1 = false;
       this.b1 = false;
       this.d1 = new g(this);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "39")) {
          return;
       }
       if (this.B == 5) {
          return;
       }
       boolean b = this.q.isRecording();
       super.A0();
       if (b && (this.Jh() && this.b1 == null)) {
          this.e2();
       }else if(b && (this.T == null && this.Ih())){
          this.Rh();
       }
       return;
    }
    public a Bh(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public int Ch(){
       return 1;
    }
    public AbsCameraFragmentViewBinder Dh(){
       return this.N;
    }
    public j E6(){
       return this.V;
    }
    public String E7(){
       return "CameraTab";
    }
    public c E9(){
       c obj = PatchProxy.apply(null, this, CameraFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.E9();
       obj.v(StabilityType.TYPE_DEFAULT);
       obj.J = true;
       obj.K = true;
       obj.l0 = Business.kVideoRecord;
       obj.m0 = this.Ch();
       return obj;
    }
    public void Eh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewStub viewStub = p0.findViewById(R.id.camera_flash_bar_root_stub);
       if (viewStub != null) {
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d019d);
          viewStub.inflate();
       }
       return;
    }
    public void Fh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "52")) {
          return;
       }
       long l = a1.k();
       if (p0.findViewById(0x7f0a0635) != null) {
          return;
       }
       int i = 0x7f0a0637;
       if (this.W0 != null) {
          this.W0.A(p0.findViewById(i));
          this.W = this.W0.y();
       }else {
          ViewStub viewStub = p0.findViewById(i);
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d018f);
             this.W = viewStub.inflate();
          }
       }
       CameraFragment tW = this.W;
       if (tW != null) {
          tW.topMargin = a1.d(0x7f070323);
       }
       Object[] objArray = new Object[0];
       a.D().s("CameraBaseFragment", "initSidebarViewIfNeed cost:"+a1.o(l), objArray);
       return;
    }
    public boolean Gh(){
       return this.a1;
    }
    public boolean Hh(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a();
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "37")) {
          return;
       }
       if (this.B == 5) {
          return;
       }
       if (this.getActivity() != null && !this.getActivity().isFinishing()) {
          this.e1 = null;
          super.I7();
          this.Q = true;
       }
       return;
    }
    public final boolean Ih(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PostExperimentUtils.q1() && this.getPage() == 60)? true: false;
       return b;
    }
    public final boolean Jh(){
       a obj = PatchProxy.apply(null, this, CameraFragment.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y.d(a.d.a());
       if (obj.a()) {
          return obj.b();
       }
       return this.Kh();
    }
    public boolean Kh(){
       return this.Z0;
    }
    public void Lh(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "33")) {
          return;
       }
       if (this.q != null) {
          this.P1();
       }
       return;
    }
    public int M(){
       return 4;
    }
    public void Mh(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "53")) {
          return;
       }
       this.Z = p0;
       this.y.g = p0;
       return;
    }
    public final void Nh(boolean p0){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraFragment.class, "55")) {
          return;
       }
       CameraFragment tV = this.V;
       if (tV != null) {
          tV.O = p0;
       }
       return;
    }
    public IViewBinder O1(){
       return this.Dh();
    }
    public void Oh(boolean p0){
       this.R = p0;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "38")) {
          return;
       }
       if (this.B == 5) {
          return;
       }
       super.P1();
       CameraFragment tY = this.Y;
       if (tY == null || (!tY.a() && this.y.d(j.i).a - null <= 0)) {
          RxBus.f.b(new h());
       }
       this.ih().m(new c(this.H5()));
       return;
    }
    public void Ph(boolean p0,boolean p1){
       this.Z0 = p0;
       this.a1 = p1;
    }
    public void Qh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "6")) {
          return;
       }
       this.X0.b = p0;
       return;
    }
    public final void Rh(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "43")) {
          return;
       }
       this.e1 = ReplaySubject.g();
       t.fromCallable(new f(this)).subscribeOn(d.c).onErrorReturn(f.b).observeOn(d.a).subscribe(this.e1);
       return;
    }
    public boolean Sh(){
       return false;
    }
    public boolean Th(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.R != null && !a.g())? true: false;
       return b;
    }
    public IViewBinder V5(int p0){
       AbsCameraFragmentViewBinder uAbsCameraFr1;
       AbsCameraFragmentViewBinder uAbsCameraFr = AbsCameraFragmentViewBinder.class;
       if (PatchProxy.isSupport(CameraFragment.class)) {
          uAbsCameraFr1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraFragment.class, "7");
          if (uAbsCameraFr1 != PatchProxyResult.class) {
          }else {
          label_001d :
             uAbsCameraFr1 = c.a(this.X0.a(), uAbsCameraFr, this);
             if (uAbsCameraFr1 == null) {
                uAbsCameraFr1 = new DefaultCameraFragmentViewBinder(this);
             }
             AbsRecordBottomBarViewBinder uAbsRecordBo = c.a(this.X0.a(), AbsRecordBottomBarViewBinder.class, this);
             this.V0 = uAbsRecordBo;
             if (uAbsRecordBo == null) {
                this.V0 = new DefaultRecordBottomBarViewBinder(this);
             }
             this.W0 = c.a(this.X0.a(), AbsRecordSideBarViewBinder.class, this);
             CameraFragment tV0 = this.V0;
             if (!PatchProxy.applyVoidOneRefs(tV0, uAbsCameraFr1, uAbsCameraFr, "6")) {
                a.p(tV0, "viewbinder");
                if (!PatchProxy.applyVoidTwoRefs("sub_vb_bottom_action_bar", tV0, uAbsCameraFr1, BaseViewBinder.class, "13")) {
                   BaseViewBinder$a uoa = uAbsCameraFr1.b.get("sub_vb_bottom_action_bar");
                   if (uoa == null) {
                      uoa = new BaseViewBinder$a(uAbsCameraFr1);
                      uoa.a = "sub_vb_bottom_action_bar";
                      uoa.d = tV0;
                   }
                   uAbsCameraFr1.b.put("sub_vb_bottom_action_bar", uoa);
                }
             }
          }
       }else {
          goto label_001d ;
       }
       return uAbsCameraFr1;
    }
    public c V7(){
       return this.X;
    }
    public void X7(int p0,float p1){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, CameraFragment.class, "16")) {
          return;
       }
       super.X7(p0, p1);
       if (p1 - 0x3f800000 >= 0) {
          k1.o(new d(this, p0));
       }
       return;
    }
    public List ch(){
       ArrayList obj = PatchProxy.apply(null, this, CameraFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!RecordPModuleRegister.f().g()) {
          RecordPModuleRegister.f().a();
       }
       if (this.U0 != null) {
          return this.U0;
       }else {
          this.y.n(a.class, this.d1);
          this.y.n(a.class, new h(this));
          obj = new ArrayList(40);
          if (s6.x()) {
             obj.add(new b(this.lh(), this.y));
          }
          a uoa = new a(this.lh(), this.y);
          this.M = uoa;
          obj.add(uoa);
          if (this.V == null) {
             this.V = new g(this.lh(), this.y, this.X0);
          }
          obj.add(this.V);
          obj.add(new b(this.lh(), this.y));
          obj.add(new d(this.lh(), this.y));
          obj.add(new b(this.lh(), this.y));
          obj.add(new i(this.lh(), this.y));
          obj.add(new c(this.lh(), this.y));
          obj.add(new a(this.lh(), this.y));
          RecordPModuleRegister.f().c("MAGIC_EMOJI", new b(this, obj));
          obj.add(new h(this.lh(), this.y));
          obj.add(new h(this.lh(), this.y));
          obj.add(new k(this.lh(), this.y));
          obj.add(new d0(this.lh(), this.y));
          if (this instanceof MixCameraFragment ^ 0x01) {
             q oq = new q(this.lh(), this.y);
             this.O = oq;
             obj.add(oq);
          }
          obj.add(new b(this.lh(), this.y));
          obj.add(new a(this.lh(), this.y));
          if (p.g(0)) {
             obj.add(new f(this.lh(), this.y));
          }
          obj.add(new b(this.lh(), this.y));
          obj.add(new b(this.lh(), this.y));
          obj.add(new d(this.lh(), this.y));
          obj.add(new c(this.lh(), this.y));
          if (g.a) {
             obj.add(new w0(this.lh(), this.y));
          }
          if (e.e()) {
             obj.add(new f(this.lh(), this.y));
          }
          return obj;
       }
    }
    public void d5(int p0){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraFragment.class, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("CameraBaseFragment", "setRecordMode: mode = "+p0, objArray);
       CameraFragment tX = this.X;
       int i1 = 5;
       if (tX != null) {
          int i2 = (p0 == i1)? 1: 0;
          tX.p(i2);
       }
       this.y.h().b(p0);
       super.d5(p0);
       if (this.B == i1 || (p0 == i1 && this.isResumed())) {
          u1.L0(this);
          Object[] objArray1 = new Object[i];
          a.D().w("CameraBaseFragment", "mode changed, reopen camera. new mode is "+p0, objArray1);
          this.p6();
       }
       this.y.h().c(p0);
       this.b2(1);
       return;
    }
    public void dg(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "19")) {
          return;
       }
       if (this.S == null && (p0 == null || (!p0.isFinishing() && !s6.x()))) {
          if (!this.Th()) {
             super.dg(p0);
          }else {
             p0.startActivityForResult(new Intent(p0, CameraPermissionActivity.class), 6);
             p0.overridePendingTransition(0, 0);
          }
       }
       return;
    }
    public List dh(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, CameraFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.dh();
       if (this.getActivity() != null) {
          objArray = this.getActivity().getIntent();
       }
       if (!f.N.a(objArray)) {
          obj.add(new c(this.lh(), this.y));
       }
       return obj;
    }
    public void doBindView(View p0){
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "40")) {
          return;
       }
       if (this.B == 5) {
          return;
       }
       j a = this.y.d(j.b).a;
       int i = 0;
       if (a != ErrorCode$Result.kOk.getCode()) {
          Object[] objArray = new Object[i];
          a.D().t("CameraBaseFragment", "onCaptureFinish need show record error dialog "+a, objArray);
          p.i(this.getActivity(), a, this);
          return;
       }else if(this.U != null){
          Object[] objArray1 = new Object[i];
          a.D().w("CameraFragment", "onCaptureFinish isStartingEditActivity return", objArray1);
          return;
       }else if(this.Sh()){
          return;
       }else {
          super.e2();
          return;
       }
    }
    public k eh(){
       k obj = PatchProxy.apply(null, this, CameraFragment.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.eh();
       Objects.requireNonNull(s.c);
       obj.e = this.y.d(s.b).a ^ 0x01;
       return obj;
    }
    public void fh(boolean p0){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraFragment.class, "20")) {
          return;
       }
       if (p0) {
          CameraFragment tX = this.X;
          if (tX != null) {
             tX.t();
          }
       }
       super.fh(p0);
       return;
    }
    public AbsRecordSideBarViewBinder gd(){
       return this.W0;
    }
    public int getPage(){
       if (this.B == 5) {
          return 96;
       }
       return 60;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecordFragment obj = PatchProxy.apply(null, this, CameraFragment.class, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.B;
       int i = 2;
       int i1 = 5;
       int i2 = 1;
       if (obj == i1) {
          Object[] objArray = new Object[i];
          objArray[0] = TextUtils.k(this.z);
          objArray[i2] = a.b(this.getActivity());
          return String.format("task_id=%s&launch_type=%s", objArray);
       }else {
          Object[] objArray1 = new Object[i1];
          objArray1[0] = TextUtils.k(this.z);
          objArray1[i2] = String.valueOf((m.b(obj) / 1000));
          objArray1[i] = a.b(this.getActivity());
          objArray1[3] = Boolean.valueOf(d.a(-273232199).a20().z0());
          int i3 = 4;
          FragmentActivity activity = this.getActivity();
          String str = PatchProxy.applyOneRefs(activity, this, CameraFragment.class, "29");
          String str1 = "";
          if (str != patchProxyRe) {
          }else if(activity != null && (this.P == null || !i.h())){
             str = str1;
          }else {
             str = i.m().k().b();
          }
          objArray1[i3] = str;
          String str2 = String.format("task_id=%s&duration=%s&launch_type=%s&posting=%s&activity_id=%s", objArray1);
          activity = this.getActivity();
          Object obj1 = PatchProxy.applyOneRefs(activity, this, CameraFragment.class, "30");
          if (obj1 != patchProxyRe) {
             str1 = obj1;
          }else if(activity != null && (this.P == null || !i.h())){
             str1 = i.m().k().a();
          }
          if (!TextUtils.x(str1)) {
             Object[] objArray2 = new Object[i2];
             objArray2[0] = str1;
             str2 = str2+String.format("&activity_detail=%s", objArray2);
          }
          objArray1 = new Object[0];
          a.D().w("CameraBaseFragment", "pageparams "+str2, objArray1);
          return str2;
       }
    }
    public String getTaskId(){
       return this.z;
    }
    public long ie(){
       return 0;
    }
    public CameraPageConfig jh(){
       CameraPageConfig obj = PatchProxy.apply(null, this, CameraFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.B == 5)? this.Ve().getPhotoPageConfig(): this.Ve().getRecordPageConfig();
       return obj;
    }
    public CameraResolutionParameters kh(){
       CameraPageConfig mPreviewWidt;
       boolean b;
       s b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CameraResolutionParameters obj = PatchProxy.apply(objArray, this, CameraFragment.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 1;
       if (this.B == 5) {
          obj = PatchProxy.apply(objArray, this, CameraFragment.class, "24");
          if (obj != patchProxyRe) {
          }else {
             mPreviewWidt = this.jh().mPreviewWidth;
             CameraPageConfig mPreviewHeig = this.jh().mPreviewHeight;
             b = e.a();
             s os = this.y.d(s.g);
             b1 = os.b;
             if (b1 > null) {
                os = os.c;
                if (os > null) {
                   mPreviewHeig = os;
                   mPreviewWidt = b1;
                }else {
                label_004a :
                   CameraBaseFragment tn = this.n;
                   if (tn != null) {
                      tn.getCameraView().setIsFullScreen(i);
                   }
                }
             }else {
                goto label_004a ;
             }
             CameraResolutionParameters uCameraResol = new CameraResolutionParameters();
             uCameraResol.mPreviewWidth = mPreviewWidt;
             uCameraResol.mPreviewHeight = mPreviewHeig;
             uCameraResol.mPreviewMaxSize = Math.max(mPreviewWidt, mPreviewHeig);
             uCameraResol.mIsFront = b;
             uCameraResol.mTaskId = this.z;
             Object[] objArray1 = new Object[0];
             a.D().w("CameraBaseFragment", "photomode preview size:"+mPreviewWidt+" "+mPreviewHeig, objArray1);
             obj = uCameraResol;
          }
       }else {
          obj = PatchProxy.apply(objArray, this, CameraFragment.class, "23");
          if (obj != patchProxyRe) {
          }else {
             boolean b2 = this.Hh();
             obj = new CameraResolutionParameters();
             if (TextUtils.x(this.z)) {
                this.z = u1.f();
             }
             obj.mTaskId = this.z;
             Object[] objArray2 = new Object[0];
             a.D().w("CameraFragment", "getCameraResolutionParameters mTaskId:"+this.z, objArray2);
             obj.mIsFront = b2;
             mPreviewWidt = this.jh();
             CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
             if (tZ != null) {
                b1 = this.y.d(s.g);
                s b3 = b1.b;
                if (b3 > null) {
                   b1 = b1.c;
                   if (b1 > null) {
                      obj.mPreviewWidth = b3;
                      obj.mPreviewHeight = b1;
                      obj.mPreviewMaxSize = Math.max(b3, b1);
                   }
                }
             }
             if (tZ != null && tZ.getBaseContext() != null) {
                objArray = tZ;
             }
             int[] ointArray = b.a(mPreviewWidt, b.f(objArray, this.lh()));
             if (ointArray[0] > 0 && ointArray[i] > 0) {
                obj.mPreviewWidth = ointArray[0];
                obj.mPreviewHeight = ointArray[i];
                obj.mPreviewMaxSize = Math.max(ointArray[0], ointArray[i]);
             }else {
                obj.mPreviewWidth = mPreviewWidt.mPreviewWidth;
                obj.mPreviewHeight = mPreviewWidt.mPreviewHeight;
                obj.mPreviewMaxSize = mPreviewWidt.mPreviewMaxEdgeSize;
             }
          }
       }
       return obj;
    }
    public boolean lf(){
       return true;
    }
    public CameraPageType lh(){
       return CameraPageType.VIDEO;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CameraFragment.class, "15")) {
          return;
       }
       if (p0 == 6 && !s6.x()) {
          super.dg(this.getActivity());
       }
       super.onActivityResult(p0, p1, p2);
       this.U = false;
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q.isRecording() && !this.Kh()) {
          this.A0();
       }
       PostCommonFunnel.b.b(null, "camera_back_press");
       return super.onBackPressed();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "3")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, CameraFragment.class, "1")) {
          d.d("postCameraFragmentCreateMonitor").n();
          d.d("postCameraOpenMonitor").h("clickToCameraFragmentCreate");
          d.d("postCameraOpenMonitor").g("cameraFragmentCreateToFirstFrame");
       }
       if (k.c() == null) {
          k.f(new b());
       }
       Intent intent = this.getActivity().getIntent();
       this.B = j0.b(intent, "record_mode", 0);
       String str = "key_camera_viewbinder_option";
       if (j0.g(intent, str)) {
          this.X0 = new ViewBinderOption(j0.f(intent, str));
       }
       this.X = new c(this);
       super.onCreate(p0);
       if (this.N == null) {
          this.N = this.V5(-1);
       }
       u1.L0(this);
       f.b(PanelShowEvent.class, new o(this), this);
       this.y.l(r.class, new n(this));
       this.y.l(q.class, new j(this));
       this.y.l(p.class, new l(this));
       if (!PatchProxy.applyVoid(objArray, this, CameraFragment.class, "58")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             objArray = activity.getIntent();
          }
          if (activity != null && objArray != null) {
             boolean b = PermissionUtils.a(activity, "android.permission.CAMERA");
             if (b) {
                b = PermissionUtils.a(activity, "android.permission.RECORD_AUDIO");
             }
             if (b && this.B == 5) {
                b = PermissionUtils.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
             }
             this.y.n(b.class, new i(this, b));
          }
       }
    label_00ee :
       d.d("postCameraFragmentCreateMonitor").c();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CameraFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.d("postCameraFragmentCreateViewMonitor").n();
       long l = k1.i();
       View bindedView = this.N.getBindedView(p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onCreateView, getBindedView cost:"+a1.o(l)+" view:"+bindedView, objArray);
       this.O1().bindViews(bindedView);
       a.d("CameraFragment getView", l);
       this.Fh(bindedView);
       if (!this.oh()) {
          this.y.o(new e(bindedView.findViewById(R.id.camera_sidebar_layout), this.E6()));
       }
       this.Eh(bindedView);
       d.d("postCameraFragmentCreateViewMonitor").c();
       return bindedView;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "14")) {
          return;
       }
       String str = "postCameraFragmentDestroyMonitor";
       d.d(str).n();
       super.onDestroy();
       if (this.Q != null) {
          b.d();
       }
       s os = s.b();
       int i = 0;
       Objects.requireNonNull(os);
       s os1 = s.class;
       if (!PatchProxy.isSupport(os1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), os, os1, "4")) {
          os.b.remove(Integer.valueOf(i));
       }
       RecordPModuleRegister.f().d();
       d.d(str).c();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "13")) {
          return;
       }
       this.P = false;
       d.d("postCameraFragmentDestroyViewMonitor").n();
       super.onDestroyView();
       d.d("postCameraFragmentDestroyViewMonitor").c();
       CameraFragment tuCameraFrag = this.f1;
       if (tuCameraFrag != null) {
          tuCameraFrag.dispose();
       }
       tuCameraFrag = this.g1;
       if (tuCameraFrag != null) {
          tuCameraFrag.dispose();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "10")) {
          return;
       }
       String str = "postCameraFragmentPauseMonitor";
       d.d(str).n();
       if (this.q.isRecording() && this.Jh()) {
          this.b1 = true;
       }
       super.onPause();
       d.d("postVideoToEditorMonitor").h("prepareDataToPause");
       d.d("postVideoToEditorMonitor").g("pauseToCreate");
       d.d(str).c();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "11")) {
          return;
       }
       String str = "postCameraFragmentResumeMonitor";
       d.d(str).n();
       super.onResume();
       if (this.Jh()) {
          Object[] objArray = new Object[0];
          a.D().w("CameraBaseFragment", "waiting?"+this.b1, objArray);
          if (this.b1 == null) {
             this.Lh();
          }else {
             this.e2();
             this.b1 = false;
          }
       }
       if (!this.q.B() && q.f(this.y.d(j.i).b)) {
          this.P1();
       }
       CameraLogger.v();
       d.d(str).c();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "9")) {
          return;
       }
       d.d("postCameraFragmentStartMonitor").n();
       super.onStart();
       d.d("postCameraFragmentStartMonitor").c();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "12")) {
          return;
       }
       d.d("postCameraFragmentStopMonitor").n();
       super.onStop();
       d.d("postCameraFragmentStopMonitor").c();
       boolean b = false;
       if (a.t().d("cameraFragmentViewClear", b)) {
          int[] ointArray = new int[]{0x7f0d016f};
          PreLoader.getInstance().clear(ointArray);
          Object[] objArray = new Object[b];
          a.D().w("CameraBaseFragment", "onStop, clear\(R.layout.camera_fullscreen_v3\)", objArray);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraFragment.class, "8")) {
          return;
       }
       d.d("postCameraFragmentViewCreatedMonitor").n();
       super.onViewCreated(p0, p1);
       if (this.oh()) {
          this.y.o(new e(p0.findViewById(R.id.camera_sidebar_layout), this.E6()));
       }
       this.d5(this.B);
       CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
       if (tZ != null) {
          p0.post(new c(tZ));
       }
       d.d("postCameraFragmentViewCreatedMonitor").c();
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "34")) {
          return;
       }
       if (this.E != null) {
          return;
       }
       this.Nh(true);
       super.q1();
       return;
    }
    public void rh(int p0){
       if (PatchProxy.isSupport(CameraFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraFragment.class, "46")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("CameraBaseFragment", "doOnRecorderError  errorCode:"+p0, objArray);
       if (g.a(p0)) {
          this.F = false;
          this.A0();
       }else {
          super.rh(p0);
       }
       return;
    }
    public void s0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraFragment.class, "51")) {
          return;
       }
       this.q.b0();
       super.s0();
       this.e1 = objArray;
       VideoContext videoContext = this.q.y();
       if (videoContext != null) {
          videoContext.a();
       }
       if (!this.q.B() && q.f(this.y.c(j.class).b)) {
          this.P1();
       }
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "44")) {
          return;
       }
       if (!this.Ih()) {
          super.th();
          return;
       }else if(this.e1 == null){
          this.Rh();
       }
       this.T = true;
       this.g1 = this.e1.subscribe(new m(this), new k(this));
       this.e1 = null;
       return;
    }
    public boolean uh(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.y.d(g.b).a ^ 0x01);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, CameraFragment.class, "31")) {
          return;
       }
       CameraFragment tM = this.M;
       if (tM != null) {
          tM.w();
       }
       super.w();
       return;
    }
    public boolean x2(){
       CameraFragment obj = PatchProxy.apply(null, this, CameraFragment.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Y;
       boolean b = (obj == null || (!obj.a() && !this.y.d(j.i).c()))? true: false;
       return b;
    }
    public void xh(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraFragment.class, "45")) {
          return;
       }
       super.xh(p0);
       d.d("postVideoToEditorMonitor").h("captureFinishToPrepareData");
       d.d("postVideoToEditorMonitor").g("prepareDataToPause");
       Object[] objArray = new Object[0];
       a.D().w("CameraFragment", "onBuildFinish", objArray);
       this.U = this.y.c(a.class).G1(p0);
       return;
    }
    public void y(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CameraFragment.class, "35")) {
          return;
       }
       if (this.E != null) {
          return;
       }
       boolean b = true;
       this.Nh(b);
       super.y();
       Object obj = PatchProxy.apply(objArray, this, CameraFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(PostExperimentUtils.q1() && this.getPage() == 60){
          b = false;
       }
       if (b) {
          this.f1 = t.timer(1, TimeUnit.SECONDS).observeOn(a.c()).flatMap(g.b).subscribe(Functions.d(), e.b);
       }
       return;
    }
    public a yh(){
       Object obj = PatchProxy.apply(null, this, CameraFragment.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.c(a.class).s1(super.yh());
    }
    public AbsRecordBottomBarViewBinder zb(){
       return this.V0;
    }
}
