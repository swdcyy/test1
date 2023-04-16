package com.yxcorp.gifshow.camera.record.photo.m;
import ui9.b;
import com.yxcorp.gifshow.camera.record.photo.p$d;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.kwai.video.westeros.models.EffectPerformance;
import com.yxcorp.gifshow.camera.record.photo.m$a;
import com.yxcorp.gifshow.camera.record.photo.m$b;
import wc9.c0;
import oc9.t;
import com.yxcorp.gifshow.camera.record.photo.e;
import com.yxcorp.gifshow.camera.record.photo.i;
import com.yxcorp.gifshow.camera.record.photo.r;
import sh9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kg9.f;
import hg9.u;
import hg9.a0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import m65.f;
import ce9.l;
import xi9.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import oc9.s;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import hg9.y;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import lnc.s6;
import oc9.d0;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.camera.record.photo.j;
import com.yxcorp.gifshow.camera.record.photo.l;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.utility.n;
import yb9.b;
import th0.e;
import android.view.animation.Interpolator;
import yb9.b$a;
import crd.a;
import java.util.Objects;
import e17.i;
import java.io.File;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent;
import jg9.c1;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import oc9.w;
import hg9.x;
import android.view.View$OnClickListener;
import hg9.z;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.camera.record.photo.h;
import android.os.Bundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.camera.record.photo.p;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hg9.e0;
import eoc.f;
import ig9.c;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;
import eg9.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.animation.Animation;
import com.kwai.camerasdk.videoCapture.CameraController;
import oa0.a;
import ji9.a;
import zb9.k;
import zb9.k$a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ld9.b;
import com.kwai.camerasdk.models.DisplayLayout;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.kuaishou.gifshow.files.a;
import tg9.g;
import rf9.g;
import hg9.n;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent$TakePictureStatus;
import wc9.e;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.kwai.horae.a;
import lnc.b9;
import bn8.a;
import tkd.b;
import tkd.d;
import os5.f;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import hg9.b0;
import io.reactivex.internal.functions.Functions;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.camera.bubble.c;
import ed9.b;
import hg9.d0;

public class m extends e0 implements b, p$d	// class@000eb7
{
    public ProgressFragment A;
    public int B;
    public h C;
    public p D;
    public EffectPerformance E;
    public c0 F;
    public e G;
    public c H;
    public c I;
    public String J;
    public boolean K;
    public b L;
    public a M;
    public boolean N;
    public BaseMultiTakePictureController O;
    public int P;
    public final m Q;
    public final n R;
    public AnimCameraView q;
    public View r;
    public View s;
    public ImageView t;
    public boolean u;
    public TextView v;
    public View w;
    public TextView x;
    public TakePictureType y;
    public boolean z;

    public void m(CameraPageType p0,b p1){
       super(p0, p1);
       this.u = true;
       this.y = TakePictureType.SHOOT_IMAGE;
       this.E = EffectPerformance.UNRECOGNIZED;
       this.K = true;
       this.N = false;
       this.Q = new m$a(this);
       this.R = new m$b(this);
       c0 uoc0 = new c0(p0, p1);
       this.F = uoc0;
       this.L0(uoc0);
       e uoe = new e(p0, p1);
       this.G = uoe;
       this.L0(uoe);
       this.L0(new i(p0, p1));
       this.L0(new r(p0, p1));
       if (p0 == CameraPageType.LIVE_AVATAR) {
          c uoc = new c(p0, this.d);
          this.H = uoc;
          this.L0(uoc);
       }else if(p0 == CameraPageType.VIDEO || (p0 == CameraPageType.PHOTO && PostExperimentUtils.Y())){
          this.L0(new f(p0, p1));
       }
       this.d.n(u.class, new a0(this));
       return;
    }
    public void K0(){
       if (PatchProxy.applyVoid(null, this, m.class, "15")) {
          return;
       }
       this.r.setEnabled(true);
       Object[] objArray = new Object[0];
       a.D().w("TakePictureController", "resume SurfaceView", objArray);
       this.q.getCameraView().getSurfaceView().resume();
       if (this.g != null && this.d.d(l.i).a != null) {
          this.g.K();
          this.g.V();
       }
       return;
    }
    public boolean L1(){
       Object obj = PatchProxy.apply(null, this, m.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.G.s;
    }
    public void N(long p0,long p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, om, "10")) {
          return;
       }
       s.f(this, p0, p1);
       m tr = this.r;
       if (tr != null) {
          tr.setTag(R.id.view_status_tag, "FinalFinish");
       }
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, m.class, "16")) {
          return;
       }
       d tg = this.g;
       if (tg != null && !tg.y0()) {
          if (this.h != null) {
             k1.o(new y(this));
          }
          this.h.m();
       }
       return;
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, m.class, "8")) {
          return;
       }
       EffectPerformance uNRECOGNIZED = (p0 == null)? EffectPerformance.UNRECOGNIZED: p0.getEffectPerformance();
       this.E = uNRECOGNIZED;
       return;
    }
    public BaseFragment b(){
       return this.f;
    }
    public View b0(){
       return this.s;
    }
    public boolean c1(){
       m obj = PatchProxy.apply(null, this, m.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.O;
       boolean b = (obj != null && obj.c1())? true: false;
       return b;
    }
    public void d5(int p0){
       d te;
       m tN;
       View[] viewArray;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "9")) {
          return;
       }
       super.d5(p0);
       if (!this.f.isAdded()) {
          return;
       }
       boolean b = true;
       int i = 0;
       if (!s6.x()) {
          if (!this.f2() && this.z == null) {
             this.z = b;
             te = this.e;
             if (!PatchProxy.applyVoidOneRefs(te, this, om, "31")) {
                this.g2(PermissionUtils.f(te, "android.permission.CAMERA").subscribe(new j(this), l.b));
             }
          }
       }else {
          te = this.e;
          if (!PatchProxy.applyVoidOneRefs(te, this, om, "32") && !PostPermissionUtils.c(te, PostPermission.ALBUM)) {
             tN = this.O;
             if (tN != null) {
                tN.p2(i, i, i);
             }
          }
       }
       tN = this.N;
       boolean b1 = this.d.d(p0.j.a()).c();
       this.N = b1;
       if (!b1 && (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tN), this, om, "12"))) {
          if (this.f2()) {
             viewArray = new View[b];
             viewArray[i] = this.r;
             n.Z(4, viewArray);
          }else {
             viewArray = new View[b];
             viewArray[i] = this.r;
             n.Z(i, viewArray);
             if (tN == null) {
                View[] viewArray1 = new View[b];
                viewArray1[i] = this.w;
                n.Z(i, viewArray1);
                this.d.h().d(this.w, 4, new e(), new e(), null);
             }
          }
       }
       return;
    }
    public final void g2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "33")) {
          return;
       }
       if (this.M == null) {
          this.M = new a();
       }
       this.M.c(p0);
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, m.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.H;
       if (obj == null || obj.p != null) {
          return true;
       }
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(objArray, obj, c.class, "3")) {
          i.a(R.style.arg_RES_7f110668, 0x7f103956);
       }
       return false;
    }
    public void i1(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "30")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TakePictureController", "onGetANewPicture "+p0.getAbsolutePath(), objArray);
       this.d.m(new TakePictureEvent(p0, 0, true));
       return;
    }
    public BaseMultiTakePictureController i2(){
       Object obj = PatchProxy.apply(null, this, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c1(this.c, this.d);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       super.k(p0);
       this.x = m1.f(p0, 0x7f0a063f);
       this.r = m1.f(p0, 0x7f0a3d49);
       this.v = m1.f(p0, 0x7f0a393b);
       this.s = m1.f(p0, 0x7f0a0086);
       this.t = m1.f(p0, 0x7f0a09e4);
       this.w = m1.f(p0, 0x7f0a3d4d);
       this.q = this.d.b().z7();
       m1.a(p0, new x(this), R.id.take_picture_btn);
       m1.d(p0, new z(this), R.id.take_picture_btn);
       m ty = this.y;
       if (ty == TakePictureType.LIVE_AUTHENTICATE) {
          this.h.H0(150.00f);
          this.C.h(0x2710, 0x7d000);
       }else if(ty == TakePictureType.LIVE_ENTRY){
          this.v.setText(R.string.arg_RES_7f102d04);
       }else if(ty == TakePictureType.SHARE){
          this.C.h(Integer.MAX_VALUE, Integer.MAX_VALUE);
       }
       Bundle arguments = this.f.getArguments();
       String str = "tag";
       if (arguments != null) {
          this.J = arguments.getString(str, "");
       }
       if (this.e != null && TextUtils.x(this.J)) {
          this.J = j0.f(this.e.getIntent(), str);
       }
       this.D = new p(this.y, this, this.J, this.d);
       this.Y1(f.a(PanelShowEvent.class, new e0(this)));
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, m.class, "29")) {
          return;
       }
       this.d.m(new c());
       return;
    }
    public final void l2(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "23")) {
          return;
       }
       om = this.H;
       if (om != null) {
          Objects.requireNonNull(om);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), om, uoc, "4")) {
             Object[] objArray = new Object[0];
             a.D().w("FaceDetectorController", "loggerTakePictureStaus "+p0, objArray);
             d e = om.e;
             CameraLogger uCameraLogge = CameraLogger.class;
             if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), e, null, uCameraLogge, "3")) {
                int i = (p0)? 7: 8;
                h$b uob = h$b.e(i, "STATUS_FACE_IDENTIFY_RESULT");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "STATUS_FACE_IDENTIFY_RESULT";
                uob.k(uElementPack);
                u1.p0(null, e, uob);
             }
          }
       }
       return;
    }
    public void m2(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "27")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TakePictureController", "onPictureTakeFailed resume SurfaceView", objArray);
       this.d.m(new a(i));
       this.q.getCameraView().getSurfaceView().resume();
       if (this.g != null && this.d.d(l.i).a != null) {
          this.g.K();
          this.g.V();
       }
       this.r.setEnabled(true);
       if (this.f.isAdded()) {
          if (p0 == 3) {
             i.a(R.style.arg_RES_7f110668, 0x7f1004ab);
          }else if(p0 == 5 && !PermissionUtils.a(this.d.a(), "android.permission.WRITE_EXTERNAL_STORAGE")){
             i.a(R.style.arg_RES_7f110668, 0x7f103ffe);
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f103b10);
          }
       }
       return;
    }
    public final void n2(){
       TakePictureSource sOURCE_PREVI;
       m o;
       d h;
       g og;
       View view;
       ProgressFragment progressFrag = this;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, progressFrag, om, "24")) {
          return;
       }
       if (progressFrag.f.isAdded() && !this.f2()) {
          boolean b = false;
          if (!this.h2()) {
             progressFrag.l2(b);
             return;
          }else {
             boolean b1 = true;
             progressFrag.l2(b1);
             l ol = progressFrag.d.d(l.i);
             l a = ol.a;
             if (!this.c1() && a != null) {
                progressFrag.g.l();
             }
             progressFrag.r.setEnabled(b);
             Object[] objArray1 = new Object[b];
             String str = "TakePictureController";
             a.D().w(str, "takePicture", objArray1);
             if (!progressFrag.G.k2()) {
                sOURCE_PREVI = TakePictureSource.SOURCE_PREVIEW_FRAME;
                if (this.c1()) {
                   progressFrag.r.setEnabled(b);
                   o = progressFrag.O;
                   if (o != null) {
                      Objects.requireNonNull(o);
                      if (!PatchProxy.applyVoid(objArray, o, BaseMultiTakePictureController.class, "5")) {
                         BaseMultiTakePictureController q = o.q;
                         if (q != null) {
                            a.m(q);
                            view = q.b(R.id.flash_effect_v);
                         }else {
                            view = objArray;
                         }
                         if (view != null) {
                            if (o.r == null) {
                               o.r = o.k2();
                            }
                            view.setVisibility(b);
                            view.startAnimation(o.r);
                         }
                      }
                   }
                }
             }else {
                sOURCE_PREVI = h.d(progressFrag.E);
             }
             TakePictureSource takePictureS = sOURCE_PREVI;
             int i = 1017;
             o = progressFrag.B;
             m r = progressFrag.r;
             int i1 = progressFrag.h.isFrontCamera() ^ b1;
             boolean b2 = this.c1();
             String str1 = (a.f0())? "enabled": "unabled";
             TakePictureSource takePictureS1 = takePictureS;
             String str2 = str;
             l ol1 = a;
             CameraLogger.w(i, o, r, i1, b2, str1, a, progressFrag.d.d(a.b).a, progressFrag.G.i2(), progressFrag.G.k2(), ol.g, progressFrag.d.d(k.l.a()), progressFrag.e);
             if (progressFrag.h.Q()) {
                CameraLogger.a("TAKE_PICTURE");
             }
             if (!this.c1()) {
                Object[] objArray2 = new Object[b];
                a.D().w(str2, "pause SurfaceView", objArray2);
                progressFrag.q.getCameraView().getSurfaceView().pause();
             }
             m c = progressFrag.C;
             m e = progressFrag.E;
             boolean b3 = (ol1 != null)? true: false;
             h = progressFrag.h;
             CameraView cameraView = progressFrag.q.getCameraView();
             TakePictureType lIVE_AUTHENT = TakePictureType.LIVE_AUTHENTICATE;
             i1 = Integer.MAX_VALUE;
             int i2 = (progressFrag.y == lIVE_AUTHENT)? 0x2710: Integer.MAX_VALUE;
             int i3 = j0.b(progressFrag.e.getIntent(), "frame_mode", b.e(progressFrag.e, progressFrag.c));
             o = progressFrag.y;
             TakePictureType lIVE_AVATAR = TakePictureType.LIVE_AVATAR;
             int b4 = (o != lIVE_AVATAR && o != TakePictureType.STATE_IMAGE)? true: false;
             int i4 = c.c(e, takePictureS1, b3, h, cameraView, i2, i3, b4);
             if (progressFrag.y == lIVE_AUTHENT) {
                i1 = 0x7d000;
             }
             c.h(i4, i1);
             c = progressFrag.C;
             d h1 = progressFrag.h;
             CameraView cameraView1 = progressFrag.q.getCameraView();
             DisplayLayout displayLayou = progressFrag.q.getCameraView().getSurfaceView().getDisplayLayout();
             m r1 = progressFrag.R;
             File uFile = PatchProxy.apply(null, progressFrag, om, "34");
             if (uFile != PatchProxyResult.class) {
             }else if(this.c1() || (progressFrag.y == TakePictureType.SHARE && PostExperimentUtils.y0() != 1)){
                uFile = a.c();
             }else {
                uFile = b.Z(PostUtils.g("[>|10|>]"));
             }
             Object obj = uFile;
             b4 = (progressFrag.y == TakePictureType.LIVE_ENTRY)? -1: progressFrag.d.d(g.c).a;
             int i5 = progressFrag.d.d(g.b).a ^ 0x01;
             int i6 = j0.b(progressFrag.e.getIntent(), "frame_mode", b.e(progressFrag.e, progressFrag.c));
             d e1 = progressFrag.e;
             o = progressFrag.y;
             boolean b5 = (o != lIVE_AVATAR && o != TakePictureType.STATE_IMAGE)? true: false;
             c.j(h1, cameraView1, displayLayou, takePictureS1, r1, obj, false, b4, i5, i6, e1, b5);
             Object[] objArray3 = new Object[b];
             a.D().w(str2, "拍照 上层设置模式 "+takePictureS1, objArray3);
             if (!this.c1() && (progressFrag.G.k2() && progressFrag.A == null)) {
                ProgressFragment progressFrag1 = new ProgressFragment();
                progressFrag.A = progressFrag1;
                progressFrag1.Ih(R.string.arg_RES_7f103667);
                progressFrag.A.setCancelable(true);
                progressFrag.A.show(progressFrag.e.getSupportFragmentManager(), "TakePicture");
             }
          }
       }
    label_0281 :
       return;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, m.class, "21")) {
          return;
       }
       this.d.m(new TakePictureEvent(TakePictureEvent$TakePictureStatus.BEGIN));
       if (this.F != null && a.f0()) {
          this.F.m2();
       }else {
          this.n2();
       }
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, m.class, "7")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       if (p0 == 551) {
          p0 = -1;
          if (p1 == p0) {
             d te = this.e;
             if (!te instanceof BasePostActivity) {
                if (this.y != TakePictureType.SHARE || p2 == null) {
                   te.setResult(p0, p2);
                   this.e.finish();
                }
             }
          }
          d tg = this.g;
          if (tg != null) {
             tg.V();
          }
       }
    label_0045 :
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       super.onDestroy();
       this.C.g();
       this.D.o();
       a.d.f("generate_new_dcim_image_file");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.M);
       this.M = null;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       super.onPause();
       this.D.k();
       b9.a(this.L);
       View[] viewArray = new View[]{this.x};
       n.Z(8, viewArray);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       super.onResume();
       this.r.setEnabled(true);
       this.D.l();
       if (this.g != null && !this.f2()) {
          this.g.V();
       }
       if (this.x != null && this.y == TakePictureType.LIVE_ENTRY) {
          int i = 0x6de47b0f;
          if (a.e() < d.a(i).g10() && !TextUtils.x(d.a(i).Bz())) {
             this.x.setText(d.a(i).Bz());
             this.x.setVisibility(0);
             b9.a(this.L);
             this.L = t.interval(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b0(this), Functions.d());
             a.l((a.e() + true));
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.C = new h();
       boolean b = true;
       this.K = j0.a(p0, "key_enable_multi_take", b);
       TakePictureType serializable = SerializableHook.getSerializable(this.f.getArguments(), "TakePictureType");
       this.y = serializable;
       if (this.K == null || serializable != TakePictureType.SHARE) {
          b = false;
       }
       if (b) {
          BaseMultiTakePictureController uBaseMultiTa = this.i2();
          this.O = uBaseMultiTa;
          this.L0(uBaseMultiTa);
       }
       super.w1(p0);
       this.I = this.d.b().V7();
       this.d.l(b.class, new d0(this));
       return;
    }
}
