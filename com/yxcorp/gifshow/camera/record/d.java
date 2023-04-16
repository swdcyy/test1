package com.yxcorp.gifshow.camera.record.d;
import com.yxcorp.gifshow.camera.record.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import lnc.d7;
import q87.c;
import com.yxcorp.gifshow.camera.record.video.StandardCameraFragment;
import mm6.c;
import com.yxcorp.gifshow.camera.record.c;
import java.lang.Runnable;
import ekd.k1;
import m65.f;
import com.kwai.robust.PatchProxyResult;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Boolean;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import ui9.j;
import xi9.n;
import ui9.k$a;
import q0c.y1;
import l0c.c;
import com.kwai.video.westeros.models.BeautifyVersion;
import ui9.k;
import qi9.c;
import qi9.v1;
import java.util.Map;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qb9.t;
import com.yxcorp.gifshow.camerasdk.j$p;

public class d extends e	// class@001d3d
{
    public boolean d;
    public boolean e;
    public static boolean f;
    public static d g;

    public void d(GifshowActivity p0){
       super(p0);
    }
    public static synchronized void h(){
       Object[] objArray1;
       _monitor_enter(d.class);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, d.class, "1")) {
          _monitor_exit(d.class);
          return;
       }else {
          int i = 0;
          if (d.f) {
             objArray1 = new Object[i];
             a.D().t("CameraManager", "disable preload", objArray1);
             _monitor_exit(d.class);
             return;
          }else if(!PermissionUtils.a(a.a().a(), "android.permission.CAMERA")){
             objArray1 = new Object[i];
             a.D().t("CameraManager", "don\'t have camera permission", objArray1);
             _monitor_exit(d.class);
             return;
          }else if(d7.l()){
             _monitor_exit(d.class);
             return;
          }else if(d.g == null){
             objArray1 = new Object[i];
             a.D().w("CameraManager", "preload", objArray1);
             d.g = new d(objArray);
             d.g.i(new StandardCameraFragment());
             k1.r(c.b, 3000);
          }else {
             objArray1 = new Object[i];
             a.D().t("CameraManager", "can only preload one camera manager", objArray1);
          }
          _monitor_exit(d.class);
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       super.b();
       d.f = false;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       super.c();
       this.e = true;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.d();
       this.e = false;
       return;
    }
    public final f e(){
       e obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null && obj.getWindow() != null) {
          AnimCameraView uAnimCameraV = this.b.findViewById(R.id.camera_preview_layout);
          if (uAnimCameraV != null && uAnimCameraV.getCameraView() != null) {
             return uAnimCameraV.getCameraView().getSurfaceView();
          }
       }
       return null;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.R;
    }
    public void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       if (!this.c.isClosed() && !p0 instanceof CameraBaseFragment) {
          if (this.c.q().y0()) {
             this.c.m();
          }else {
             this.c.l();
          }
       }
       return;
    }
    public void i(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       if (this.d == null && (this.c.isClosed() && (p0 instanceof CameraBaseFragment && PermissionUtils.a(a.a().a(), "android.permission.CAMERA")))) {
          boolean b = true;
          this.d = b;
          if (this.e != null) {
             return;
          }else {
             k ok = new k$a().b(y1.h().f().a().getNumber()).a();
             CameraBaseFragment uCameraBaseF = p0;
             c uoc = uCameraBaseF.E9();
             if (uoc.s0 != null) {
                return;
             }else if(uoc.r0 != null){
                ok.a = b;
                ok.b.put(uoc, uCameraBaseF.E9());
                ok.a = false;
             }
             this.c.F1(null, new VideoContext(), uoc, ok);
             this.c.f(new t(this, p0));
          }
       }
       return;
    }
}
