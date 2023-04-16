package com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import java.util.ArrayList;
import vc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import j8c.a;
import q87.c;
import ekd.j0;
import java.lang.StringBuilder;
import qi9.c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import oh9.w1;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import com.yxcorp.gifshow.camera.record.video.x;
import com.yxcorp.gifshow.camera.record.video.y;
import com.yxcorp.gifshow.camera.record.video.z;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oh9.o1;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;
import oh9.p1;
import oh9.q1;
import oh9.r1;
import oh9.s1;
import oh9.t1;
import oh9.u1;
import oh9.v1;
import oh9.x1;
import oh9.y1;
import tkd.b;
import tkd.d;
import lg9.a;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import oc9.t;
import oh9.n1;
import com.yxcorp.gifshow.camera.record.video.a0;
import androidx.fragment.app.FragmentActivity;
import pi9.c;
import com.yxcorp.gifshow.camera.record.video.b0;
import oh9.z1;
import com.yxcorp.gifshow.camera.record.video.c0;
import oh9.a2;
import oh9.b2;
import oh9.l2;
import oh9.n2;
import oh9.c2;
import oh9.d2;
import oh9.e2;
import oh9.m2;
import oh9.l1;
import java.util.Collection;
import pi9.p;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import oh9.f2;
import oh9.g2;
import gh9.i;
import gh9.d;
import oh9.m1;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oh9.h2;
import com.yxcorp.gifshow.camera.record.video.d0;
import qd9.d;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import lnc.n4;
import com.yxcorp.gifshow.camera.record.video.e0;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import com.yxcorp.gifshow.media.model.CameraConfig;
import oh9.x2;
import oh9.y2;
import oh9.i2;
import ig9.b;
import oh9.z2;
import erd.g;
import crd.b;
import g26.d;
import oh9.j2;
import e17.i;
import oh9.o2;
import o56.c;
import o56.a;
import oh9.k2;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.System;
import kuaishou.perf.page.impl.d;

public class StandardCameraFragment extends CameraFragment	// class@000f75
{
    public boolean i1;
    public final List j1;
    public StandardCameraFragment$a k1;
    public StandardCameraFragment$a l1;
    public static boolean m1 = true;

    public void StandardCameraFragment(){
       super();
       this.i1 = false;
       this.j1 = new ArrayList();
    }
    public a Bh(){
       Object[] objArray;
       a obj = PatchProxy.apply(null, this, StandardCameraFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       boolean b = true;
       obj.a(b);
       obj.b(b);
       obj.c = b;
       if (!PatchProxy.applyVoidOneRefs(obj, this, StandardCameraFragment.class, "6")) {
          Intent intent = this.Z.getIntent();
          int i = 0;
          if (intent == null) {
             objArray = new Object[i];
             a.D().w("CameraBaseFragment", "decideSupportSceneClassify, intent or config is null", objArray);
          }else {
             int i1 = j0.b(intent, "camera_page_source", i);
             if (i1 != 4) {
                b = false;
             }
             obj.d = b;
             objArray = new Object[i];
             a.D().w("CameraBaseFragment", "decideSupportSceneClassify, source="+i1+", support="+b, objArray);
          }
       }
       return obj;
    }
    public c E9(){
       c obj = PatchProxy.apply(null, this, StandardCameraFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.E9();
       if (this.getArguments() != null) {
          obj.z = this.Uh();
       }
       StabilityType stabilityTyp = this.y.c(StabilityType.class);
       if (stabilityTyp == null) {
          stabilityTyp = StabilityType.TYPE_DEFAULT;
       }
       obj.v(stabilityTyp);
       return obj;
    }
    public final boolean Uh(){
       Bundle obj = PatchProxy.apply(null, this, StandardCameraFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getArguments();
       boolean b = false;
       if (obj != null && obj.getBoolean("is_super_stability_enable", b)) {
          b = true;
       }
       return b;
    }
    public List ch(){
       Object[] objArray = null;
       StandardCameraFragment$a obj = PatchProxy.apply(objArray, this, StandardCameraFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("CameraBaseFragment", "buildControllers", objArray1);
       _monitor_enter(this);
       if (PatchProxy.applyVoid(objArray, this, StandardCameraFragment.class, "3")) {
          _monitor_exit(this);
       }else {
          Object[] objArray2 = new Object[i];
          a.D().w("CameraBaseFragment", "initControllerFactory", objArray2);
          if (this.k1 != null) {
             objArray2 = new Object[i];
             a.D().w("CameraBaseFragment", "already inited, return", objArray2);
             _monitor_exit(this);
          }else {
             RecordPModuleRegister.f().c("PRETTIFY", new w1(this));
             this.U0 = super.ch();
             obj = new StandardCameraFragment$a(this.U0);
             RecordPModuleRegister.f().c("MAGIC_EMOJI", new x(this, obj));
             RecordPModuleRegister.f().c("PRETTIFY", new y(this, obj));
             RecordPModuleRegister.f().c("MUSIC", new z(this, obj));
             if (PostExperimentUtils.Q()) {
                obj.a(new o1(this));
             }
             obj.a(new p1(this));
             obj.a(new q1(this));
             obj.a(new r1(this));
             obj.a(new s1(this));
             obj.a(new t1(this));
             if (PostExperimentUtils.c1()) {
                obj.a(new u1(this));
             }
             if (PostExperimentUtils.n0() > 0) {
                i = 1;
             }
             if (i) {
                obj.a(new v1(this));
             }
             obj.a(new x1(this));
             if (PostExperimentUtils.k0()) {
                obj.a(new y1(this));
             }
             t ot = d.a(-1713800816).w60(this.lh(), this.ih());
             if (ot != null) {
                obj.a(new n1(ot));
             }
             RecordPModuleRegister.f().c("MAGIC_EMOJI", new a0(this, obj));
             CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
             if (c.e(tZ)) {
                RecordPModuleRegister.f().c("MAGIC_EMOJI", new b0(this, obj));
             }
             obj.a(new z1(this));
             RecordPModuleRegister.f().c("ALBUM", new c0(this, obj));
             obj.a(new a2(this));
             obj.a(new b2(this));
             obj.a(new l2(this));
             obj.a(new n2(this));
             obj.a(new c2(this));
             obj.a(new d2(this));
             obj.a(new e2(this));
             if (PostExperimentUtils.R()) {
                obj.a(new m2(this));
             }
             this.k1 = obj;
             _monitor_exit(this);
          }
       }
       this.k1.b();
       if (this.Z != null && this.Z.getIntent() != null) {
          this.dh();
       }
       RecordPModuleRegister.f().c("PRETTIFY", new l1(this));
       return this.U0;
    }
    public List dh(){
       boolean i;
       boolean b;
       FragmentActivity activity;
       Object[] objArray = null;
       CameraFragment obj = PatchProxy.apply(objArray, this, StandardCameraFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CameraBaseFragment", "buildControllersWhenOnCreate", objArray1);
       _monitor_enter(this);
       if (PatchProxy.applyVoid(objArray, this, StandardCameraFragment.class, "5")) {
          _monitor_exit(this);
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w("CameraBaseFragment", "initOnCreateControllerFactory", objArray2);
          if (this.l1 != null) {
             objArray2 = new Object[0];
             a.D().w("CameraBaseFragment", "already inited, return", objArray2);
             _monitor_exit(this);
          }else if(this.Z != null){
             obj = this.Z;
          }else {
             activity = this.getActivity();
          }
          if (obj == null) {
             objArray2 = new Object[0];
             a.D().w("CameraBaseFragment", "activity is null, return", objArray2);
             _monitor_exit(this);
          }else {
             this.j1.clear();
             this.j1.addAll(super.dh());
             StandardCameraFragment$a uoa = new StandardCameraFragment$a(this.j1);
             Intent intent = obj.getIntent();
             if (p.e(intent) && PermissionUtils.a(obj, "android.permission.CAMERA")) {
                uoa.a(new f2(this));
             }
             uoa.a(new g2(this));
             if (!i.a(intent)) {
                this.y.n(d.class, new m1(this));
                uoa.a(new h2(this));
             }
             i = j0.b(intent, "camera_page_source", 0);
             z2 oz2 = 2;
             if (i != oz2) {
                RecordPModuleRegister.f().c("EXTRACT_FRAME", new d0(this, uoa));
             }
             Objects.requireNonNull(d.a);
             CameraConfig uCameraConfi = 3;
             if (obj instanceof CameraActivity && (i != uCameraConfi && !n4.e(obj))) {
                RecordPModuleRegister.f().c("ASSISTANT_CAMERA", new e0(this, uoa));
             }
          label_00f2 :
             if (i != oz2 && (i != 16 && i != uCameraConfi)) {
                i = c.c(this.getArguments());
                b = this.Uh();
                UltraWideAndSuperStabilityStateHelper ultraWideAnd = new UltraWideAndSuperStabilityStateHelper(i, b, this.Ve());
                if (b) {
                   uoa.a(new x2(this, ultraWideAnd));
                }
                if (i) {
                   uoa.a(new y2(this, ultraWideAnd));
                }
             }
          label_0123 :
             if (obj instanceof CameraActivity && !j0.a(intent, "panel_disabled", 0)) {
                uoa.a(new i2(this));
                this.ih().l(b.class, new z2(this));
             }
             if (j0.a(intent, "showFlashPopupOnCameraPage", 0)) {
                if (d.b()) {
                   uoa.a(new j2(this));
                }else {
                   i.a(R.style.arg_RES_7f11066a, 0x7f101bba);
                }
             }
             uoa.a(new o2(this, intent));
             if (a.a().c() && j0.a(intent, "enableMockVideo", 0)) {
                uoa.a(new k2(this));
             }
             this.l1 = uoa;
             _monitor_exit(this);
          }
       }
       this.l1.b();
       return this.j1;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StandardCameraFragment.class, "1")) {
          return;
       }
       super.onResume();
       if (this.i1 == null && (this.getArguments() != null && this.getArguments().getBoolean("is_default_fragment"))) {
          FragmentActivity activity = this.getActivity();
          boolean m1 = StandardCameraFragment.m1;
          CameraLogger uCameraLogge = CameraLogger.class;
          if (PatchProxy.isSupport(uCameraLogge) && (!PatchProxy.applyVoidTwoRefs(activity, Boolean.valueOf(m1), objArray, uCameraLogge, "38") && activity != null)) {
             String str = "launch_time";
             if (j0.g(activity.getIntent(), str)) {
                long l = System.currentTimeMillis();
                l = l - j0.c(activity.getIntent(), str, l);
                if (l - null > 0) {
                   String str1 = "postCameraFragmentClickToResumeMonitor";
                   d uod = d.d(str1);
                   String str2 = (m1)? "cold": "warm";
                   uod.k(str2);
                   d.d(str1).j(l);
                }
             }
          }
          this.i1 = true;
       }
    label_007b :
       StandardCameraFragment.m1 = false;
       return;
    }
}
