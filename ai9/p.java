package ai9.p;
import ui9.b;
import oc9.d0;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.video.westeros.models.EffectPerformance;
import com.yxcorp.gifshow.camera.record.base.d;
import ai9.q;
import ai9.k;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import j8c.a;
import q87.c;
import qg9.a;
import ai9.l;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import aj9.f;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import q16.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yh9.j;
import tg9.g;
import crd.b;
import android.app.Activity;
import ld9.b;
import java.lang.Integer;
import brd.t;
import ai9.o;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import ai9.n;
import ai9.m;
import erd.g;
import lnc.a1;
import com.kwai.gifshow.post.api.core.model.VideoProduceTime;
import k2b.w;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.photo.p;
import q16.a;
import java.io.File;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import android.view.View;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.photo.h;
import lnc.b9;
import gd9.a;
import android.content.Intent;

public class p extends d0 implements b	// class@0000d8
{
    public boolean A;
    public EffectPerformance o;
    public AnimCameraView p;
    public h q;
    public w r;
    public Bitmap s;
    public File t;
    public a u;
    public VideoContext v;
    public b w;
    public boolean x;
    public int y;
    public int z;
    public static final TakePictureSource B;

    static {
       p.B = TakePictureSource.SOURCE_PREVIEW_FRAME;
    }
    public void p(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = EffectPerformance.UNRECOGNIZED;
       this.x = false;
       this.y = 0;
       this.A = false;
       this.d.n(q.class, new k(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, p.class, "10")) {
          return;
       }
       a0.j(this);
       this.A = false;
       return;
    }
    public void I7(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "6")) {
          return;
       }
       a0.i(this);
       Object[] objArray1 = new Object[0];
       a.D().w("RecordToPictureController", "onCaptureStart\(\)", objArray1);
       if (this.A == null) {
          this.A = true;
          if (!PatchProxy.applyVoid(objArray, this, op, "7")) {
             objArray = new Object[0];
             a.D().w("RecordToPictureController", "get tail frame", objArray);
             if (a.a(this.d)) {
                this.h.w(new l(this), MediaRecorderCallbackFrameType.kLastFrame);
             }
          }
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       a0.h(this);
       this.A = false;
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public boolean V3(FragmentActivity p0,a p1,a$a p2){
       int b1;
       g a;
       t ot;
       p op = p.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "11");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       p0 = PatchProxy.apply(null, this, op, "18");
       int b = false;
       if (p0 != patchProxyRe) {
          b1 = p0.booleanValue();
       }else if(!a.a(this.d)){
          b1 = this.d.d(j.i).a();
          this.z = b1;
          if (b1 < 950) {
             b1 = true;
          }
       }
       b1 = false;
       this.x = b1;
       if (!b1) {
          return b;
       }else {
          Object[] objArray = new Object[b];
          a.D().w("RecordToPictureController", "handleGotoPreviewPage record to picture start", objArray);
          a = this.d.d(g.c).a;
          p tw = this.w;
          if (tw != null && !tw.isDisposed()) {
             this.w.dispose();
          }
          b = b.e(this.e, this.c);
          if (PatchProxy.isSupport(op)) {
             ot = PatchProxy.applyTwoRefs(Integer.valueOf(a), Integer.valueOf(b), this, op, "12");
             if (ot != patchProxyRe) {
             label_00a8 :
                this.w = ot.observeOn(d.a).subscribe(new n(this, p2, a), new m(this));
                return true;
             }
          }
          ot = t.fromCallable(new o(this, a, b)).subscribeOn(d.c);
          goto label_00a8 ;
       }
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, p.class, "19")) {
          return;
       }
       EffectPerformance uNRECOGNIZED = (p0 == null)? EffectPerformance.UNRECOGNIZED: p0.getEffectPerformance();
       this.o = uNRECOGNIZED;
       return;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, p.class, "9")) {
          return;
       }
       a0.f(this);
       this.A = false;
       return;
    }
    public final void g2(boolean p0){
       Object[] objArray1;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "16")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("RecordToPictureController", "prepareEditPageParam", objArray);
       if (!a1.i(this.e)) {
          objArray1 = new Object[i];
          a.D().w("RecordToPictureController", "prepareEditParams activity is not available", objArray1);
          return;
       }else {
          VideoProduceTime videoProduce = new VideoProduceTime();
          videoProduce.mPickTime = this.r.a();
          a$a uoa = p.b(this.e, this.d, videoProduce);
          Object[] objArray2 = new Object[i];
          a.D().w("RecordToPictureController", "prepareEditPhoto end", objArray2);
          uoa.x(true);
          a uoa1 = uoa.f();
          this.u = uoa1;
          String[] stringArray = new String[true];
          stringArray[i] = this.t.getAbsolutePath();
          uoa1.v = stringArray;
          this.u.getArgs().getPageMonitorSource().set("RECORD");
          this.v = p.c(this.e, this.d, false, "RecordToPictureController", this.t, p0, true, this.z);
          objArray1 = new Object[i];
          a.D().w("RecordToPictureController", "prepareEditPageParam end", objArray1);
          return;
       }
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       super.k(p0);
       this.p = this.d.b().z7();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       super.onDestroy();
       this.q.g();
       this.q = null;
       b9.a(this.w);
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       super.onPause();
       this.r.b();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       super.onResume();
       this.r.c();
       a.e(3);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       super.w1(p0);
       this.q = new h();
       this.r = new w();
       return;
    }
}
