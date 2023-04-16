package xg9.i;
import bi9.a;
import gxc.f;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.ArrayList;
import bi9.i;
import gxc.e;
import android.util.SparseArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import bi9.b;
import j8c.a;
import q87.c;
import java.lang.Float;
import java.util.Objects;
import oc9.b0;
import oc9.a0;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.k$j;
import com.yxcorp.gifshow.camera.record.base.d;
import java.lang.StringBuilder;
import java.lang.Boolean;
import wd9.a;
import xi9.n;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import java.lang.reflect.Type;
import bn8.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Number;
import q65.h;
import android.view.View;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import android.app.Activity;
import com.yxcorp.gifshow.widget.record.ArcScaleView;
import xg9.b;
import com.yxcorp.gifshow.widget.record.ArcScaleView$a;
import xg9.c;
import com.yxcorp.gifshow.widget.record.ArcScaleView$c;
import lm6.j;
import xg9.f;
import erd.g;
import crd.b;
import eoc.f;
import xg9.d;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$b;
import xg9.e;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$c;
import android.view.MotionEvent;
import xg9.i$a;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.camerasdk.q;
import lnc.q4;
import e17.i;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import xg9.k;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ozc.a;
import android.content.Intent;
import xg9.j;
import xg9.a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ji9.b;
import xg9.g;
import bj9.a;
import xg9.h;

public class i extends d0 implements a, f	// class@004517
{
    public List A;
    public final b B;
    public float o;
    public float p;
    public float q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ArcScaleView x;
    public BaseRecordButton y;
    public int z;

    public void i(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = 0x3f800000;
       this.p = 0x3f800000;
       this.q = 0x3f800000;
       this.r = 0;
       this.s = 0x3f800000;
       this.t = 0x3f800000;
       this.u = false;
       this.v = false;
       this.w = false;
       this.z = 1;
       this.A = new ArrayList();
       this.B = new i();
    }
    public void B(){
       e.c(this);
    }
    public void F1(int p0,int p1,SparseArray p2){
       int i;
       b b;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i.class, "31")) {
          return;
       }
       float f = (float)this.z;
       i = 1;
       if (this.A.size() > 0) {
          Iterator iterator = this.A.iterator();
          while (iterator.hasNext()) {
             f = f + (float)iterator.next().intValue();
          }
          f = f / (float)(this.A.size() + i);
       }
       this.A.clear();
       b uob = p2.get(i);
       if (uob == null) {
          uob = this.B;
          p2.put(i, uob);
       }else if(!uob instanceof i){
          Object[] objArray = new Object[0];
          a.D().A("ScaleController", "onSamplingData get instance not RecordZoomFactorSampler ZOOM_FACTOR_KEY", objArray);
          return;
       }
       b uob1 = uob;
       Float uFloat = Float.valueOf(f);
       Objects.requireNonNull(uob1);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), uFloat, uob1, b.class, "2")) {
          uob = uob1.b;
          if (uob != null) {
             if (!uob.size() || !uob1.b(uFloat)) {
                uob1.b.add(uob1.d(p0, p1, uFloat));
                uob1.a = uFloat;
             }else {
                b = uob1.b;
                uob1.c(p1, b.get((b.size() - 1)));
             }
          }
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       this.m2();
       return;
    }
    public boolean H1(){
       return e.a(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, i.class, "12")) {
          return;
       }
       a0.i(this);
       i tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(null, tB, b.class, "1")) {
          tB.b = new ArrayList();
          tB.a = null;
       }
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "13")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.e;
          if (p0 != null) {
             float f = (float)this.z;
             Objects.requireNonNull(p0);
             VideoContext videoContext = VideoContext.class;
             if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Float.valueOf(f), p0, videoContext, "156") != PatchProxyResult.class) {
             }else {
                VideoContext.b();
                p0.e = f;
             }
          }
       }
       return;
    }
    public void Q1(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "19")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       if (this.n2()) {
          this.p2();
          return;
       }else {
          this.s = this.i2();
          this.t = p0;
          Object[] objArray = new Object[0];
          a.D().s("ScaleController", "begin zoom "+this.s+", factor "+this.t, objArray);
          return;
       }
    }
    public final boolean g2(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = PatchProxy.apply(null, this, oi, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.d.d(a.i).c == null) {
          Object obj1 = PatchProxy.apply(null, this, oi, "24");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             d tg = this.g;
             b1 = (tg != null && tg.C())? true: false;
          }
          if (!b1) {
          label_0044 :
             return b;
          }
       }
       b = false;
       goto label_0044 ;
    }
    public boolean h2(){
       Object obj = PatchProxy.apply(null, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.g2()) {
          return false;
       }
       if (this.n2()) {
          return false;
       }
       if (PostExperimentUtils.O0(a.h(ShowAlbum.class))) {
          return false;
       }
       return true;
    }
    public final float i2(){
       Object obj = PatchProxy.apply(null, this, i.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float zoom = this.h.getZoom();
       if (!zoom) {
          zoom = 0x3f800000;
       }
       return zoom;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       super.k(p0);
       this.y = this.l2(p0);
       ArcScaleView uArcScaleVie = this.e.findViewById(R.id.arc_scaleview);
       this.x = uArcScaleVie;
       if (uArcScaleVie != null) {
          uArcScaleVie.setArcScaleViewListener(new b(this));
          this.x.setSelectScaleListener(new c(this));
       }
       this.Y1(f.a(j.class, new f(this)));
       if (this.y != null && this.d.d(a.i).a == null) {
          this.y.b(new d(this));
          this.y.setMoveEventListener(new e(this));
       }
       return;
    }
    public void k0(MotionEvent p0){
       e.b(this, p0);
    }
    public final int k2(){
       i to = this.o;
       if (to - 0x3f800000) {
          return (int)((to * 10.00f) + (float)this.r);
       }
       return this.r;
    }
    public boolean l(boolean p0){
       return e.i(this, p0);
    }
    public BaseRecordButton l2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a34a7);
    }
    public final void m2(){
       if (PatchProxy.applyVoid(null, this, i.class, "30")) {
          return;
       }
       i tx = this.x;
       if (tx != null && !tx.getVisibility()) {
          tx = this.x;
          i$a uoa = new i$a(this);
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoidOneRefs(uoa, tx, ArcScaleView.class, "22")) {
             ArcScaleView x0 = tx.X0;
             if (x0 != null && x0.isRunning()) {
                tx.X0.cancel();
             }
             x0 = tx.Y0;
             if (x0 == null || (!x0.isRunning() && !tx.getVisibility())) {
                float[] uofloatArray = new float[]{0,tx.getViewHeight()};
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("translationY", uofloatArray),PropertyValuesHolder.ofFloat("alpha", new float[2]{0x3f800000,0})};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tx, propertyValu);
                tx.Y0 = objectAnimat;
                objectAnimat.setDuration(300);
                tx.Y0.addListener(uoa);
                tx.Y0.start();
             }
          }
       }
    label_0084 :
       return;
    }
    public final boolean n2(){
       Object obj = PatchProxy.apply(null, this, i.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v != null && this.f2())? true: false;
       return b;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       super.nb(p0);
       if (p0.R() && !p0.getZoom() - 0x3f800000) {
          this.o2(0x3f800000);
       }
       return;
    }
    public final boolean o2(float p0){
       d obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oi, "26");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.h;
       if (obj != null) {
          obj.setZoom(p0);
       }
       if (PatchProxy.isSupport(oi)) {
          Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oi, "28");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
          label_003e :
             i tq = this.q;
             i = (!tq)? 1: (int)q4.a(((((p0 - this.o) / tq) * (float)this.k2()) + 0x3f800000), 0x3f800000, (float)this.k2());
          }
       }else {
          goto label_003e ;
       }
       Object[] objArray = new Object[0];
       a.D().s("ScaleController", "set zoomF "+p0+", index "+i, objArray);
       if (this.z != i) {
          this.z = i;
          i tx = this.x;
          if (tx != null) {
             tx.f(i);
          }
          this.A.add(Integer.valueOf(this.z));
       }
       return true;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.m2();
       return;
    }
    public void onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       e.g(this, p0, p1, p2, p3);
    }
    public final void p2(){
       if (PatchProxy.applyVoid(null, this, i.class, "18")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f10527f);
       return;
    }
    public final void r2(){
       if (PatchProxy.applyVoid(null, this, i.class, "9")) {
          return;
       }
       i tx = this.x;
       if (tx != null) {
          tx.setMaxSupportNum(this.k2());
          this.x.setShowBeginNum((int)(this.o * 10.00f));
       }
       return;
    }
    public void s(){
       e.d(this);
    }
    public final void s2(){
       int i;
       int i1;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "8")) {
          return;
       }
       this.q = this.h.getMaxZoom();
       this.p = this.h.getMinZoom();
       d obj = PatchProxy.apply(objArray, this, oi, "10");
       i = 0;
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else if(this.h.isZoomSupported()){
          i1 = this.h.getMaxZoomSteps();
       }else {
          i1 = 0;
       }
       this.r = i1;
       this.o = 0x3f800000;
       Object[] objArray1 = new Object[i];
       a.D().s("ScaleController", "Front "+this.h.isFrontCamera()+", min "+this.p+", max "+this.q+", step "+this.r, objArray1);
       this.r2();
       this.o2(0x3f800000);
       obj = this.h;
       if (obj != null && (obj.getVideoStabilizationMode() == DaenerysCaptureStabilizationMode.kStabilizationModeSuperEIS || this.h.getVideoStabilizationMode() == DaenerysCaptureStabilizationMode.kStabilizationModeProSuperEIS)) {
          i = true;
       }
       this.v = i;
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       this.s2();
       return;
    }
    public boolean u0(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oi, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.n2() || this.h == null) {
          return b;
       }else {
          this.t = this.t * p0;
          Object[] objArray = new Object[b];
          a.D().s("ScaleController", "onScale factor "+p0+", total "+this.t, objArray);
          if (!p0 - null) {
             Object[] objArray1 = new Object[b];
             a.D().w("ScaleController", "onScareEnd zoom="+this.z, objArray1);
             CameraLogger.onZoomEvent(this.z, 7);
          }else if(this.g2()){
             float f = this.s * this.t;
             i tq = this.q;
             if (f - tq > 0) {
                f = tq;
             }
             tq = this.o;
             if (f - tq < 0) {
                f = tq;
             }
             this.o2(f);
          }
          return true;
       }
    }
    public void v0(){
       i oi = i.class;
       Object[] objArray = null;
       String str = "21";
       if (PatchProxy.applyVoid(objArray, this, oi, str)) {
          return;
       }
       if (this.h2() && !PatchProxy.applyVoid(objArray, this, oi, "29")) {
          this.d.m(new k(true));
          oi = this.x;
          if (oi != null && !PatchProxy.applyVoid(objArray, oi, ArcScaleView.class, str)) {
             ArcScaleView y0 = oi.Y0;
             if (y0 != null && y0.isRunning()) {
                oi.Y0.cancel();
             }
             y0 = oi.X0;
             if (y0 == null || (!y0.isRunning() && oi.getVisibility())) {
                float[] uofloatArray = new float[]{oi.getViewHeight(),0};
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("translationY", uofloatArray),PropertyValuesHolder.ofFloat("alpha", new float[2]{0,0x3f800000})};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(oi, propertyValu);
                oi.X0 = objectAnimat;
                objectAnimat.setDuration(300);
                oi.X0.setInterpolator(new DecelerateInterpolator());
                oi.X0.addListener(new a(oi));
                oi.X0.start();
             }
          }
       }
    label_009b :
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.s2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.n(j.class, new a(this));
       this.d.l(b.class, new g(this));
       this.d.l(a.class, new h(this));
       return;
    }
}
