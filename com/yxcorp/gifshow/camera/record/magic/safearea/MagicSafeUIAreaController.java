package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import ui9.b;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$b;
import k4b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import j8c.a;
import q87.c;
import java.util.Objects;
import s5b.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$isInterruptCaptureStart$1;
import y4b.e;
import msd.a;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$onEffectDescriptionUpdated$1;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import ef9.d;
import ef9.c;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import android.view.ViewGroup;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import y4b.a;
import lm6.j;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onViewCreated$1;
import ef9.a;
import msd.l;
import erd.g;
import crd.b;
import eoc.f;
import y4b.g;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$d;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$e;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onCreate$1;
import kd9.l0;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onCreate$2;
import nd9.d0;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onCreate$3;
import ed9.d;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$c;

public class MagicSafeUIAreaController extends d0 implements b	// class@000e57
{
    public MagicSafeUIAreaHandler o;
    public static final MagicSafeUIAreaController$a p;

    static {
       MagicSafeUIAreaController.p = new MagicSafeUIAreaController$a(null);
    }
    public void MagicSafeUIAreaController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.o = new MagicSafeUIAreaHandler(new MagicSafeUIAreaController$b(this));
    }
    public void A0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaController.class, "7")) {
          return;
       }
       a0.j(this);
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MagicSafeUIArea", "onCaptureStop", objArray1);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, MagicSafeUIAreaHandler.class, "6")) {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "onCaptureStop", objArray2);
          to.d();
       }
       return;
    }
    public void I7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaController.class, "6")) {
          return;
       }
       a0.i(this);
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MagicSafeUIArea", "onCaptureStart", objArray1);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, MagicSafeUIAreaHandler.class, "5")) {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "onCaptureStart", objArray2);
          to.d();
       }
       return;
    }
    public void P1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaController.class, "8")) {
          return;
       }
       a0.h(this);
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MagicSafeUIArea", "onCaptureReset", objArray1);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, MagicSafeUIAreaHandler.class, "7")) {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "onCaptureReset", objArray2);
          to.d();
       }
       return;
    }
    public boolean R0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MagicSafeUIAreaController obj = PatchProxy.apply(objArray, this, MagicSafeUIAreaController.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MagicSafeUIArea", "isInterruptCaptureStart", objArray1);
       obj = this.o;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, MagicSafeUIAreaHandler.class, "9");
       if (obj1 != patchProxyRe) {
          obj1.booleanValue();
       }else {
          objArray = new Object[0];
          b.D().w("MagicSafeUIAreaHandler", "isInterruptCaptureStart", objArray);
          obj.c.postDelayed(new e(new MagicSafeUIAreaHandler$isInterruptCaptureStart$1(obj)), 100);
       }
       return 0;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(MagicSafeUIAreaController.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, MagicSafeUIAreaController.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicSafeUIArea", "onEffectDescriptionUpdated", objArray);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, to, MagicSafeUIAreaHandler.class, "14")) {
          Object[] objArray1 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "onEffectDescriptionUpdated", objArray1);
          to.e = null;
          to.c.postDelayed(new e(new MagicSafeUIAreaHandler$onEffectDescriptionUpdated$1(to)), 100);
       }
       return;
    }
    public final MagicSafeUIAreaHandler g2(){
       return this.o;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicSafeUIAreaController.class, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicSafeUIArea", "afterEffectRestore", objArray);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, to, MagicSafeUIAreaHandler.class, "15")) {
          Object[] objArray1 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "afterEffectRestore", objArray1);
          to.e = null;
          to.d();
       }
       return;
    }
    public void k(View p0){
       ViewGroup viewGroup;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaController.class, "3")) {
          return;
       }
       super.k(p0);
       Object[] objArray = new Object[0];
       a.D().w("MagicSafeUIArea", "onViewCreated", objArray);
       this.o.doBindView(p0);
       d uod = (this.c == CameraPageType.VIDEO)? new d(): new c();
       MagicSafeUIAreaController to = this.o;
       d tf = this.f;
       AnimCameraView uAnimCameraV = null;
       if (!tf instanceof c) {
          tf = uAnimCameraV;
       }
       if (tf != null) {
          j oj = tf.E6();
          if (oj != null) {
             SideBarViewBinder sideBarViewB = oj.r2();
             if (sideBarViewB != null) {
                viewGroup = sideBarViewB.C();
             label_0052 :
                d td = this.d;
                a.o(td, "mCallerContext");
                w ow = td.b();
                if (ow != null) {
                   uAnimCameraV = ow.z7();
                }
                to.b(p0, viewGroup, uAnimCameraV, uod);
                this.Y1(f.a(j.class, new a(new MagicSafeUIAreaController$onViewCreated$1(this))));
                this.Y1(this.d.l(g.class, new MagicSafeUIAreaController$d(this)));
                this.b2(new MagicSafeUIAreaController$e(this));
                return;
             }
          }
       }
       viewGroup = uAnimCameraV;
       goto label_0052 ;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaController.class, "4")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("MagicSafeUIArea", "onDestroyView", objArray);
       d tl = this.l;
       if (tl != null) {
          Handler handler = tl.getHandler();
          if (handler != null) {
             handler.removeCallbacksAndMessages(null);
          }
       }
       this.o.unbind();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaController.class, "5")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       a.D().w("MagicSafeUIArea", "onResume", objArray);
       this.o.onResume();
       return;
    }
    public void qb(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaController.class, "9")) {
          return;
       }
       a0.e(this);
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MagicSafeUIArea", "onCaptureCountDown", objArray1);
       MagicSafeUIAreaController to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoid(objArray, to, MagicSafeUIAreaHandler.class, "8")) {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicSafeUIAreaHandler", "onCaptureCountDown", objArray2);
          to.d();
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaController.class, "2")) {
          return;
       }
       super.w1(p0);
       this.d.l(c.class, new a(new MagicSafeUIAreaController$onCreate$1(this)));
       this.d.l(l0.class, new a(new MagicSafeUIAreaController$onCreate$2(this)));
       this.d.l(d0.class, new a(new MagicSafeUIAreaController$onCreate$3(this)));
       this.d.l(d.class, new MagicSafeUIAreaController$c(this));
       return;
    }
}
