package com.yxcorp.gifshow.camera.record.video.h;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import aj9.b;
import ekd.j;
import q16.a$a;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;
import lnc.i1;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ce9.l;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.io.Serializable;
import lnc.r5;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import lnc.r1;
import oh9.t;
import java.lang.Runnable;
import t45.c;
import oh9.q;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import aj9.f;
import com.yxcorp.gifshow.camerasdk.q;
import lq.i;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.s;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import oh9.r;
import erd.g;
import crd.b;

public class h extends d0	// class@000f87
{
    public Bitmap o;
    public EditorSplashImageInfo p;
    public CountDownLatch q;
    public boolean r;
    public RectF s;
    public String t;

    public void h(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = null;
       this.q = new CountDownLatch(0);
       this.r = false;
       this.s = null;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, h.class, "13")) {
          return;
       }
       a0.j(this);
       this.r = false;
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       a0.i(this);
       Object[] objArray = new Object[0];
       a.D().w("EditorSplashController", "onCaptureStart\(\)", objArray);
       if (j.h(this.h.D().g) && this.r == null) {
          this.r = true;
          this.h2();
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, h.class, "11")) {
          return;
       }
       a0.h(this);
       this.r = false;
       return;
    }
    public void de(a$a p0,a p1){
       l obj;
       int i;
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "7")) {
          return;
       }
       p1 = a.D();
       Object[] objArray = new Object[0];
       String str = "prepareIntentForPreviewActivityInWorkThread start";
       try{
          p1.w("EditorSplashController", str, objArray);
          this.q.await(500, TimeUnit.MILLISECONDS);
       }catch(java.lang.InterruptedException e8){
          i1.c(e8);
       }
       if (this.p != null) {
          h to = this.o;
          if (to != null && !to.isRecycled()) {
             this.p.setSplashImageBitmap(this.o);
          }else if(!TextUtils.x(this.t)){
             File uFile = new File(this.t);
             if (uFile.exists()) {
                this.p.setSplashImageBitmap(BitmapUtil.q(uFile));
             }
          }
          to = this.p;
          int rotation = to.getRotation();
          if (PatchProxy.isSupport(oh)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(rotation), this, oh, "8");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_00b8 :
                to.setRotation(i);
                p0.b0(this.p);
             }
          }
          obj = this.d.d(l.i).d;
          if (!q.f(obj)) {
             Iterator iterator = new ArrayList(obj).iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().isVoteMagic()) {
                      i = 1;
                   label_00ac :
                      if (i && (rotation == 90 || rotation == 270)) {
                         rotation = 0;
                      }
                      i = rotation;
                      goto label_00b8 ;
                   }
                }
             }
          }
          i = 0;
          goto label_00ac ;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditorSplashController", "prepareIntentForPreviewActivityInWorkThread set splash bitmap", objArray1);
       return;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       a0.f(this);
       this.r = false;
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          String splashImageB = tp.getSplashImageBitmapKey();
          if (!TextUtils.x(splashImageB)) {
             r5.b().d(splashImageB);
          }
       }
       return;
    }
    public void h2(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditorSplashController", "onCaptureStart\(\) >>> video files is empty", objArray1);
       this.o = objArray;
       this.q.countDown();
       this.q.countDown();
       this.q = new CountDownLatch(2);
       t ot = new t(this, n.k(this.e), n.j(this.e), n.w(this.e), r1.b(this.e), n.A(this.e));
       c.a(v2);
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          this.h.w(new q(this), MediaRecorderCallbackFrameType.kFirstFrame);
       }
       objArray = new Object[0];
       a.D().w("EditorSplashController", "onCaptureStart clear first frame", objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       super.onDestroy();
       this.g2();
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
          return;
       }
       super.onResume();
       if (i.h()) {
          if (!i.m().y().isEmpty()) {
             objArray = i.m().y().get(0);
          }
          String str = i.m().z("SPLASH_IMAGE_PATH");
          if (objArray != null && !TextUtils.x(str)) {
             this.t = str;
             if (new File(this.t).exists()) {
                this.q = new CountDownLatch(1);
                c.a(new s(this));
             }
          }
       }
    label_0069 :
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(c.class, new r(this));
       return;
    }
}
