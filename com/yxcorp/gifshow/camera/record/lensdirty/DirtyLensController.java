package com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController$ResourceStatus;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import zd9.a;
import zd9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.camerasdk.videoCapture.CameraController;
import xf6.g;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensInfo;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.camerasdk.q;
import qi9.s1;
import bn8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.yxcorp.gifshow.camera.record.lensdirty.a;
import com.kwai.video.westeros.veplugin.VEPlugin$OnDirtyLensDetectionListener;
import android.view.View;
import wd9.a;
import com.yxcorp.gifshow.camera.record.lensdirty.c;
import io.reactivex.i;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.lensdirty.d;
import com.yxcorp.gifshow.camera.record.lensdirty.f;
import erd.g;
import crd.b;
import java.lang.reflect.Type;
import android.content.Intent;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent;
import zd9.c;

public class DirtyLensController extends d	// class@000e12
{
    public boolean A;
    public s1 B;
    public boolean n;
    public boolean o;
    public DirtyLensInfo p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w;
    public float x;
    public f y;
    public c z;
    public static DirtyLensController$ResourceStatus C;

    static {
       DirtyLensController.C = DirtyLensController$ResourceStatus.UNDETECTED;
    }
    public void DirtyLensController(CameraPageType p0,b p1){
       super(p0, p1);
       this.A = true;
       this.B = new a(this);
       this.y = new f();
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, DirtyLensController.class, "4")) {
          return;
       }
       if (this.A == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y("DirtyLensController", "CameraClosed", objArray);
       this.i2(0);
       this.s = false;
       return;
    }
    public final boolean f2(){
       d obj = PatchProxy.apply(null, this, DirtyLensController.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj == null) {
          return false;
       }
       if (obj.isFrontCamera()) {
          return this.n;
       }
       return this.o;
    }
    public final void g2(){
       boolean b1;
       d th;
       long l;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DirtyLensController uDirtyLensCo = DirtyLensController.class;
       if (PatchProxy.applyVoid(null, this, uDirtyLensCo, "25")) {
          return;
       }
       DirtyLensController obj = PatchProxy.apply(null, this, uDirtyLensCo, "11");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.s != null && (DirtyLensController.C == DirtyLensController$ResourceStatus.DETECTED && this.h != null)){
          obj = PatchProxy.apply(null, this, uDirtyLensCo, "16");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(g.p()){
             l = Long.MAX_VALUE;
             obj = this.p;
             if (obj != null) {
                l = obj.getDifferenceDay();
             }
             if (l - 1 < 0) {
                objArray1 = new Object[b];
                a.D().y("DirtyLensController", "It\'s not time yet currentDay:"+l+" mDelayDetectionDay:"+true, objArray1);
                b1 = false;
             }
          }
          b1 = true;
          if (b1) {
             obj = PatchProxy.apply(null, this, uDirtyLensCo, "18");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(g.p()){
                l = 0;
                obj = this.p;
                if (obj != null) {
                   l = (long)obj.mCurrentDetectTimes;
                }
                if (l - 3 >= 0) {
                   objArray1 = new Object[b];
                   a.D().y("DirtyLensController", "Maximum number of times exceeded currentTime:"+l+" maxTime:"+3, objArray1);
                   b1 = false;
                }
             }
             b1 = true;
             if (b1) {
                obj = PatchProxy.apply(null, this, uDirtyLensCo, "19");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else if(this.q != null){
                   Object[] objArray = new Object[b];
                   a.D().y("DirtyLensController", "Counting down or shooting started", objArray);
                   b1 = false;
                }else {
                   b1 = true;
                }
                if (b1) {
                   b1 = true;
                }
             }
          }
       }
    label_00f2 :
       b1 = false;
       if (b1 && !this.f2()) {
          obj = PatchProxy.apply(null, this, uDirtyLensCo, "26");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             th = this.h;
             if (th != null) {
                b = (th.isFrontCamera())? this.t: this.u;
             }
          }
          if (b == null) {
             if (!this.h.l0(Category.DIRTY_LENS.getResourceDir())) {
                return;
             }else if(!this.d.k()){
                if (!PatchProxy.applyVoid(null, this, uDirtyLensCo, "27")) {
                   th = this.h;
                   if (th != null) {
                      this.t = (th.isFrontCamera())? true: true;
                   }
                }
                this.r = this.h.isFrontCamera();
                if (!PatchProxy.applyVoid(null, this, uDirtyLensCo, "17")) {
                   th = this.h;
                   if (th != null) {
                      th.r(this.B);
                   }
                }
             }
          }
       }
    label_0166 :
       return;
    }
    public final void h2(DirtyLensInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DirtyLensController.class, "20")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("dirtyLensInfo", b.e(p0));
       g.a(uEditor);
       return;
    }
    public final void i2(boolean p0){
       DirtyLensController uDirtyLensCo = DirtyLensController.class;
       if (PatchProxy.isSupport(uDirtyLensCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDirtyLensCo, "30")) {
          return;
       }
       if (this.h == null || (this.v != p0 && this.s != null)) {
          this.v = p0;
          if (p0) {
             this.h.k0(true);
             this.h.j0(new a(this));
          }else {
             this.h.k0(false);
             this.h.j0(null);
          }
       }
       return;
    }
    public void k(View p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DirtyLensController uDirtyLensCo = DirtyLensController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDirtyLensCo, "2")) {
          return;
       }
       super.k(p0);
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, this, uDirtyLensCo, "22");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.f == null){
          b1 = false;
       }else {
          b1 = this.d.d(a.i).c;
       }
       if (b1 != null) {
          this.A = b;
          return;
       }else if(DirtyLensController.C == DirtyLensController$ResourceStatus.DETECTED || (DirtyLensController.C != DirtyLensController$ResourceStatus.UNDETECTED || (!PatchProxy.applyVoid(objArray, this, uDirtyLensCo, "23") && (DirtyLensController.C == DirtyLensController$ResourceStatus.DETECTING || this.f == null)))){
          z c = d.c;
          obj = a0.k(c.a).T(c).G(c);
          this.Y1(obj.R(new d(this), f.b));
       }
    label_0076 :
       Object[] objArray1 = PatchProxy.apply(objArray, this, uDirtyLensCo, "21");
       if (objArray1 != patchProxyRe) {
       }else {
          String str = a.a.getString("dirtyLensInfo", "null");
          if (str != null && str != "") {
             objArray = b.a(str, DirtyLensInfo.class);
          }
          objArray1 = objArray;
       }
       this.p = objArray1;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DirtyLensController.class, "6")) {
          return;
       }
       super.onDestroy();
       if (this.A == null) {
          return;
       }
       DirtyLensController.C = DirtyLensController$ResourceStatus.UNDETECTED;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, DirtyLensController.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (this.A == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y("DirtyLensController", "DestoryView", objArray);
       this.i2(0);
       this.s = false;
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, DirtyLensController.class, "3")) {
          return;
       }
       if (this.A == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y("DirtyLensController", "CameraOpened", objArray);
       this.s = true;
       this.g2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DirtyLensController.class, "1")) {
          return;
       }
       super.w1(p0);
       this.z = this.d.b().V7();
       this.d.l(TakePictureEvent.class, new c(this));
       return;
    }
}
