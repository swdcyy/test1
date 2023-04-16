package com.yxcorp.gifshow.camera.record.mix.MixCameraFragment;
import sf9.c$b;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import vc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import sf9.i;
import z1.a;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a;
import sf9.k;
import sf9.m;
import sf9.n;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment$a$a;
import sf9.o;
import sf9.p;
import sf9.r;
import sf9.t;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import sf9.u;
import sf9.d;
import sf9.e;
import sf9.f;
import sf9.g;
import sf9.h;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import pi9.c;
import nd9.f0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import sf9.w;
import kotlin.jvm.internal.a;
import sf9.x;
import sf9.c;
import sf9.v;
import java.util.Iterator;
import oc9.t;
import xg9.i;
import sf9.a0;
import com.yxcorp.gifshow.camera.record.tab.e;
import com.yxcorp.gifshow.camera.record.mix.MixCameraFragment$a;
import java.lang.Number;
import oh9.o0;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import com.yxcorp.gifshow.camerasdk.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import sf9.a;
import crd.a;
import android.view.View;
import android.os.Bundle;
import sf9.b;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import yh9.h;
import e17.i;
import java.lang.StringBuilder;
import w46.b;

public final class MixCameraFragment extends CameraFragment implements c$b	// class@000e61
{
    public h i1;
    public a j1;
    public StandardCameraFragment$a k1;
    public boolean l1;

    public void MixCameraFragment(){
       super();
    }
    public a Bh(){
       a obj = PatchProxy.apply(null, this, MixCameraFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a(true);
       return obj;
    }
    public List ch(){
       Object[] objArray = null;
       MixCameraFragment obj = PatchProxy.apply(objArray, this, MixCameraFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("CameraBaseFragment", "buildControllers", objArray1);
       _monitor_enter(this);
       if (PatchProxy.applyVoid(objArray, this, MixCameraFragment.class, "3")) {
          _monitor_exit(this);
       }else {
          Object[] objArray2 = new Object[i];
          a.D().w("CameraBaseFragment", "initControllerFactory", objArray2);
          if (this.k1 != null) {
             objArray2 = new Object[i];
             a.D().w("CameraBaseFragment", "already inited, return", objArray2);
             _monitor_exit(this);
          }else {
             RecordPModuleRegister.f().c("PRETTIFY", new i(this));
             this.U0 = super.ch();
             StandardCameraFragment$a uoa = new StandardCameraFragment$a(this.U0);
             RecordPModuleRegister.f().c("MAGIC_EMOJI", new k(this, uoa));
             RecordPModuleRegister.f().c("PRETTIFY", new m(this, uoa));
             uoa.a(new n(this));
             uoa.a(new o(this));
             uoa.a(new p(this));
             RecordPModuleRegister.f().c("MAGIC_EMOJI", new r(this, uoa));
             RecordPModuleRegister.f().c("MUSIC", new t(this, uoa));
             if (PostExperimentUtils.Q()) {
                uoa.a(new u(this));
             }
             uoa.a(new d(this));
             uoa.a(new e(this));
             uoa.a(new f(this));
             uoa.a(new g(this));
             uoa.a(new h(this));
             this.k1 = uoa;
             _monitor_exit(this);
          }
       }
       obj = this.k1;
       if (obj != null) {
          obj.b();
       }
       CameraFragment tZ = (this.Z != null)? this.Z: this.getActivity();
       if (c.e(tZ)) {
          this.U0.add(new f0(CameraPageType.VIDEO, this.y));
       }
       CameraPageType uCameraPageT = this.lh();
       a.o(uCameraPageT, "pageType");
       CameraBaseFragment ty = this.y;
       a.o(ty, "mCallerContext");
       this.U0.add(new w(uCameraPageT, ty));
       uCameraPageT = this.lh();
       a.o(uCameraPageT, "pageType");
       ty = this.y;
       a.o(ty, "mCallerContext");
       this.U0.add(new x(uCameraPageT, ty));
       uCameraPageT = this.lh();
       a.o(uCameraPageT, "pageType");
       ty = this.y;
       a.o(ty, "mCallerContext");
       this.U0.add(new c(uCameraPageT, ty));
       v ov = new v(this.lh(), this.y);
       this.i1 = ov;
       this.U0.add(ov);
       tZ = this.U0;
       CameraFragment tU0 = this.U0;
       a.o(tU0, "mPreInitControllers");
       Iterator iterator = tU0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next() instanceof i) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       tZ.remove(i);
       uCameraPageT = this.lh();
       a.o(uCameraPageT, "pageType");
       b uob = this.ih();
       a.o(uob, "callerContext");
       this.U0.add(new a0(uCameraPageT, uob));
       this.za().add(new e(this.lh(), this.y));
       RecordPModuleRegister.f().c("PRETTIFY", new MixCameraFragment$a(this));
       tZ = this.U0;
       a.o(tZ, "mPreInitControllers");
       return tZ;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, MixCameraFragment.class, "7")) {
          return;
       }
       super.e2();
       this.l1 = true;
       return;
    }
    public int getRecordDuration(){
       o0 obj = PatchProxy.apply(null, this, MixCameraFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y.d(o0.d);
       a.o(obj, "mCallerContext.getData\(R¡­nLimitData.sDefaultValue\)");
       obj = obj.b;
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
          this.C = 0x3a98;
          return 0x3a98;
       }
    }
    public void j7(){
       if (PatchProxy.applyVoid(null, this, MixCameraFragment.class, "9")) {
          return;
       }
       CameraBaseFragment tq = this.q;
       if (tq != null) {
          tq.resumePreview();
       }
       this.P1();
       return;
    }
    public void oc(String p0,int p1,int p2,VideoContext p3){
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MixCameraFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       MixCameraFragment tj1 = this.j1;
       if (tj1 != null && !PatchProxy.applyVoid(objArray, tj1, a.class, "6")) {
          tj1.b.dispose();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MixCameraFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.B = 6;
       super.onViewCreated(p0, p1);
       a uoa = new a(p0);
       this.j1 = uoa;
       FragmentActivity activity = this.getActivity();
       a uoa1 = a.class;
       if (PatchProxy.applyVoidOneRefs(activity, uoa, uoa1, "1") || (activity != null && !PatchProxy.applyVoidOneRefs(activity, uoa, uoa1, "2"))) {
          uoa1 = uoa.a;
          if (uoa1 != null) {
             uoa1.setVisibility(4);
             f.G(uoa1, new b(uoa1, uoa, activity));
          }
       }
       return;
    }
    public void startRecord(){
       if (PatchProxy.applyVoid(null, this, MixCameraFragment.class, "6")) {
          return;
       }
       if (this.q == null || (this.isAdded() && !this.isRemoving())) {
          this.l1 = false;
          CameraBaseFragment tq = this.q;
          a.o(tq, "this.mCameraHelper");
          if (tq.isRecording()) {
             MixCameraFragment ti1 = this.i1;
             if (ti1 != null && ti1.i2() == true) {
                this.A0();
             }
          }else {
             tq = this.q;
             a.o(tq, "mCameraHelper");
             if (tq.R()) {
                if (this.R0()) {
                   this.q1();
                }else {
                   this.y();
                }
             }
          }
       }
       return;
    }
    public void stopRecord(){
       Object[] objArray2;
       if (PatchProxy.applyVoid(null, this, MixCameraFragment.class, "8")) {
          return;
       }
       if (this.q != null) {
          String str = "mCameraHelper";
          int i = 0;
          if (this.isAdded() && !this.isRemoving()) {
             CameraBaseFragment tq = this.q;
             a.o(tq, str);
             if (!tq.S()) {
                tq = this.q;
                a.o(tq, str);
                if (tq.isRecording()) {
                   objArray2 = new Object[i];
                   a.D().w("CameraBaseFragment", "stop record  call onCaptureFinish ", objArray2);
                   super.e2();
                }else if(this.l1 != null){
                   objArray2 = new Object[i];
                   a.D().w("CameraBaseFragment", "stop record failed ,because is finished", objArray2);
                }else {
                   i.a(R.style.arg_RES_7f110668, 0x7f100dd7);
                   this.P1();
                }
             }
          }
          CameraBaseFragment tq1 = this.q;
          a.o(tq1, str);
          Object[] objArray = new Object[i];
          a.D().w("CameraBaseFragment", "stop record failed ,because state error "+tq1.S(), objArray);
          objArray = new Object[i];
          a.D().t("CameraBaseFragment", "stop record failed ,because state error "+this.isAdded(), objArray);
          Object[] objArray1 = new Object[i];
          a.D().t("CameraBaseFragment", "stop record failed ,because state error "+this.isRemoving(), objArray1);
          return;
       }
       this.l1 = true;
       return;
    }
}
