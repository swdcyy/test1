package eg9.j;
import gxc.f;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.q;
import xi9.n;
import wd9.a;
import wc9.v;
import android.view.View;
import gxc.e;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import kuaishou.perf.page.impl.d;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.StringBuilder;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$CameraSwitchAnim;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;
import eg9.e;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import x8c.a;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import lnc.s6;
import pi9.i;
import eg9.d;
import android.view.View$OnClickListener;
import oc9.w;
import eg9.j$a;
import tg9.b;
import android.view.MotionEvent;
import eg9.i;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import eg9.g;
import eg9.h;
import erd.g;
import crd.b;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import oe6.e;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import android.content.Intent;
import eg9.a;
import eg9.f;

public class j extends d implements f	// class@002141
{
    public AnimCameraView n;
    public View o;
    public TextView p;
    public View q;
    public boolean r;
    public boolean s;

    public void j(CameraPageType p0,b p1){
       super(p0, p1);
       this.s = false;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       if (this.h.M()) {
          d tg = this.g;
          if (tg != null && tg.t()) {
             return;
          }else if(this.d.d(a.i).a == null && (this.d.d(v.e).b != null || this.r != null)){
             return;
          }else {
             this.f2(null, true);
          }
       }
       return;
    }
    public boolean H1(){
       return e.a(this);
    }
    public void Q1(float p0){
       e.f(this, p0);
    }
    public void f2(View p0,boolean p1){
       Object obj = this;
       Object obj1 = p0;
       boolean b = p1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, oj, "6")) {
          return;
       }
       String str = "SwitchCameraController";
       if (obj.h == null) {
          Object[] objArray = new Object[0];
          a.D().w(str, "abort switchCamera", objArray);
          return;
       }else {
          d.d("postSwitchCameraMonitor").n();
          int i = obj.h.isFrontCamera() ^ 0x01;
          Object[] objArray1 = new Object[0];
          a.D().w(str, "switchCamera to "+i+" byDoubleTap:"+b, objArray1);
          int i1 = 5;
          int i2 = (b)? 2: 1;
          String str1 = (i)? "back": "front";
          CameraLogger.n(i1, i2, "switch_camera", null, str1, obj.e);
          AnimCameraView$CameraSwitchAnim toBack = (!i)? AnimCameraView$CameraSwitchAnim.ToBack: AnimCameraView$CameraSwitchAnim.ToFront;
          AnimCameraView$CameraSwitchAnim uCameraSwitc = toBack;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidFourRefs(p0, uCameraSwitc, Boolean.valueOf(i), Boolean.valueOf(p1), this, j.class, "7")) {
             if (uCameraSwitc == null || uCameraSwitc == AnimCameraView$CameraSwitchAnim.None) {
                obj.h.switchCamera(i);
             }else {
                Object obj2 = null;
                if (!b && obj1 instanceof RecordSwitchCameraView) {
                   obj2 = obj1;
                }
                j n = obj.n;
                e uoe = new e(obj, i);
                Objects.requireNonNull(n);
                if (!PatchProxy.applyVoidTwoRefs(obj2, uoe, n, AnimCameraView.class, "3")) {
                   Object[] objArray2 = new Object[0];
                   a.D().s("AnimCameraView", "animSwitchCamera", objArray2);
                   if (n.b == null) {
                      n.c(n.getContext());
                   }
                   n.b();
                   uoe.a();
                   if (obj2 != null) {
                      obj2.b();
                   }
                }
             }
          }
          return;
       }
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       super.k(p0);
       this.o = p0.findViewById(0x7f0a05d8);
       this.p = p0.findViewById(0x7f0a05e0);
       if (s6.m()) {
          j tp = this.p;
          if (tp != null) {
             i.b(tp);
          }
       }
       p0 = p0.findViewById(R.id.button_switch_camera_wrapper);
       this.q = p0;
       if (p0 != null) {
          p0.setOnClickListener(new d(this));
       }
       this.n = this.d.b().z7();
       this.o.setOnClickListener(new j$a(this));
       this.d.j().addView(this.o);
       return;
    }
    public void k0(MotionEvent p0){
       e.b(this, p0);
    }
    public boolean l(boolean p0){
       return e.i(this, p0);
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       super.nb(p0);
       this.Y1(t.fromCallable(i.b).subscribeOn(d.c).observeOn(d.a).subscribe(new g(this), h.b));
       return;
    }
    public void onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       e.g(this, p0, p1, p2, p3);
    }
    public void s(){
       e.d(this);
    }
    public boolean u0(float p0){
       return e.e(this, p0);
    }
    public void v0(){
       e.h(this);
    }
    public void w(){
       SharedPreferences$Editor uEditor;
       d te;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "4")) {
          return;
       }
       if (this.d.d(a.i).a != null) {
          uEditor = a.a.edit();
          uEditor.putBoolean("camera_front_facing_ktv", this.h.isFrontCamera());
          g.a(uEditor);
       }else {
          te = this.c;
          if (te != CameraPageType.TIE_TIE && te != CameraPageType.WHATS_UP) {
             uEditor = e.a.edit();
             uEditor.putBoolean("default_camera_front_facing", this.h.isFrontCamera());
             g.a(uEditor);
          }
       }
       if (this.s == null) {
          te = this.e;
          boolean b = e.a();
          CameraLogger uCameraLogge = CameraLogger.class;
          if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidTwoRefs(te, Boolean.valueOf(b), objArray, uCameraLogge, "60")) {
             h$b uob = h$b.e(7, "RECORD_CAMERA_STATUS");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RECORD_CAMERA_STATUS";
             JsonObject jsonObject = new JsonObject();
             String str = (b)? "front": "back";
             jsonObject.c0("status", str);
             uElementPack.params = jsonObject.toString();
             uob.k(uElementPack);
             u1.p0("", te, uob);
          }
          this.s = true;
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(a.class, new f(this));
       return;
    }
}
