package com.yxcorp.gifshow.camera.record.e;
import qi9.f1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.gifshow.camerasdk.j;
import o56.c;
import o56.a;
import android.app.Application;
import nh9.f;
import android.content.Context;
import com.yxcorp.gifshow.camerasdk.j$r;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.e$a;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import java.util.Objects;
import java.util.Set;
import java.lang.Long;
import androidx.fragment.app.Fragment;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Exception;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public class e implements f1	// class@001d3f
{
    public GifshowActivity b;
    public j c;

    public void e(GifshowActivity p0){
       super();
       this.b = p0;
       this.c = new j(a.a().a(), this, f.e(), "camera_sdk");
    }
    public void G(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "6")) {
          return;
       }
       e tb = this.b;
       if (tb == null) {
          return;
       }
       CameraBaseFragment uCameraBaseF = tb.o0();
       if (uCameraBaseF != null) {
          uCameraBaseF.G();
       }
       f uof = f.e();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "1")) {
          uof.a.clear();
          uof.b.clear();
       }
       return;
    }
    public void N(long p0,long p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoe, "7")) {
          return;
       }
       uoe = this.b;
       if (uoe == null) {
          return;
       }
       CameraBaseFragment uCameraBaseF = uoe.o0();
       if (uCameraBaseF != null && uCameraBaseF.isResumed()) {
          uCameraBaseF.N(p0, p1);
       }
       return;
    }
    public j a(){
       return this.c;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.c.j1();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.c.W();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.c.X();
       return;
    }
    public void i1(ErrorCode$Result p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       e tb = this.b;
       if (tb == null) {
          return;
       }
       CameraBaseFragment uCameraBaseF = tb.o0();
       if (uCameraBaseF != null && uCameraBaseF.isResumed()) {
          uCameraBaseF.i1(p0, p1);
       }
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tb = this.b;
       if (tb == null) {
          return;
       }
       CameraBaseFragment uCameraBaseF = tb.o0();
       if (uCameraBaseF != null && uCameraBaseF.isResumed()) {
          uCameraBaseF.t1();
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e tb = this.b;
       if (tb == null) {
          return;
       }
       CameraBaseFragment uCameraBaseF = tb.o0();
       if (uCameraBaseF != null && uCameraBaseF.isResumed()) {
          uCameraBaseF.w();
       }
       PageMonitor.INSTANCE.trackPageRequestStart(uCameraBaseF);
       return;
    }
}
