package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tbruyelle.rxpermissions2.g;
import java.io.File;
import io.reactivex.subjects.PublishSubject;
import android.net.Uri;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.w0;
import android.os.Parcelable;
import z79.e;
import n3d.a;
import brd.w;
import com.kwai.robust.PatchProxyResult;
import z79.f;
import io.reactivex.g;
import brd.t;
import com.yxcorp.gifshow.albumwrapper.imagecrop.c;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import gp.a;
import q87.c;
import android.content.Intent;
import com.yxcorp.gifshow.util.j;
import java.lang.Integer;
import java.lang.Boolean;
import android.hardware.Camera;
import android.hardware.Camera$CameraInfo;
import java.lang.Throwable;
import android.app.Activity;
import x79.e;
import n3d.a$a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import w69.b;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import m26.a$a;
import java.util.ArrayList;
import z79.d;
import g46.a;
import z36.d$a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.b;
import com.kwai.feature.post.api.feature.mix.model.IMixImportTimeLineTextFormatter;
import m26.a;
import r16.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.albumwrapper.imagecrop.d;
import com.yxcorp.gifshow.albumwrapper.imagecrop.e;
import erd.g;
import crd.b;
import qkd.b;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import android.content.Context;
import z79.g;
import erd.o;
import com.yxcorp.gifshow.albumwrapper.imagecrop.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;

public class ImageSelectSupplier	// class@001b5f
{
    public final File a;
    public PublishSubject b;
    public ImageSelectSupplier$Type c;
    public i d;
    public ImageSelectSupplier$ImageSelectType e;
    public ImageSelectSupplier$c f;
    public boolean g;
    public ImageSelectSupplier$Type h;
    public int i;
    public double j;
    public double k;
    public final g l;
    public final GifshowActivity m;
    public static final String n = "ImageSelectSupplier";
    public static final Object o;
    public static final int p;
    public static final int q;

    static {
       ImageSelectSupplier.o = new Object();
    }
    public void ImageSelectSupplier(GifshowActivity p0,g p1,File p2){
       super();
       this.b = PublishSubject.g();
       this.g = true;
       this.h = null;
       this.i = -1;
       this.j = 0;
       this.k = 0;
       this.m = p0;
       this.l = p1;
       this.a = p2;
    }
    public void a(Uri p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageSelectSupplier.class, "6")) {
          return;
       }
       p1.putParcelable("output", w0.c(this.a));
       this.e(this.m, p0, p1, 770, new e(this));
       return;
    }
    public w b(){
       Object obj = PatchProxy.apply(null, this, ImageSelectSupplier.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h != null) {
          return t.create(new f(this));
       }
       return t.create(new c(this));
    }
    public void c(i p0,ImageSelectSupplier$Type p1,ImageSelectSupplier$ImageSelectType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ImageSelectSupplier.class, "2")) {
          return;
       }
       this.c = p1;
       this.d = p0;
       this.e = p2;
       int i = 0;
       if (!this.a.delete()) {
          Object[] objArray = new Object[i];
          a.C().t(ImageSelectSupplier.n, "Delete original file failed.", objArray);
       }
       if (p1 == ImageSelectSupplier$Type.CAMERA) {
          Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
          intent.putExtra("output", j.b(this.a));
          ImageSelectSupplier ti = this.i;
          String str = 1;
          if (ti == null || ti == str) {
             ImageSelectSupplier imageSelectS = ImageSelectSupplier.class;
             if (PatchProxy.isSupport(imageSelectS)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(ti), this, imageSelectS, "3");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else if(ti != null && ti != str){
                   int numberOfCame = Camera.getNumberOfCameras();
                   if (numberOfCame > 0) {
                      Camera$CameraInfo uCameraInfo = new Camera$CameraInfo();
                      int i1 = 0;
                      while (i1 < numberOfCame) {
                         try{
                            Camera.getCameraInfo(i1, uCameraInfo);
                            if (uCameraInfo.facing == ti) {
                               i = true;
                               break ;
                            }
                         }catch(java.lang.RuntimeException e8){
                            a.C().e(ImageSelectSupplier.n, "isCameraAccessible Camera.getCameraInfo failed", e8);
                         }
                         i1++;
                      }
                   }
                }
             }else {
                goto label_0065 ;
             }
          }
       label_009a :
          this.m.t1(intent, 768, new e(this));
          this.m.overridePendingTransition(R.anim.arg_RES_7f010033, 0x7f0100f2);
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putInt("selectType", p2.mValue);
          e.f().j(this.m, this.d, 769, new e(this), uBundle);
       }
       return;
    }
    public void d(int p0,int p1,Intent p2){
       ImageSelectSupplier ta;
       ImageSelectSupplier imageSelectS = ImageSelectSupplier.class;
       if (PatchProxy.isSupport(imageSelectS) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ImageSelectSupplier.class, "4")) {
          return;
       }
       int i = -1;
       switch (p0){
           case 768:
             if (p1 == i) {
                ta = this.a;
                if (ta != null && ta.exists()) {
                   Fresco.getImagePipeline().evictFromCache(w0.c(this.a));
                   this.a(w0.c(this.a), this.e.getCropPrams());
                }
             }
             break;
           case 769:
             if (p1 == i) {
                List list = PatchProxy.applyOneRefs(p2, this, imageSelectS, "5");
                if (list == PatchProxyResult.class) {
                   list = j0.e(p2, "album_data_list");
                }
                if (q.f(list)) {
                   this.c(this.d, this.c, this.e);
                   return;
                }else {
                   QMedia qMedia = list.get(0);
                   if (qMedia == null) {
                      this.c(this.d, this.c, this.e);
                      return;
                   }else if(qMedia.isVideoType()){
                      if (this.e.skipMixImport(qMedia)) {
                         Intent intent = new Intent();
                         qMedia.setClipDuration(qMedia.duration);
                         SerializableHook.putExtra(intent, "video", qMedia);
                         this.b.onNext(intent);
                      }else {
                         a$a uoa = new a$a();
                         uoa.p(new ArrayList(list));
                         uoa.n(0);
                         uoa.r(0);
                         uoa.s(0);
                         uoa.i(0);
                         uoa.k(1);
                         uoa.o(j0.a(this.m.getIntent(), "INTENT_GO_HOME_ON_POST_COMPLETE", 1));
                         a$a uoa1 = uoa.e(new d(this));
                         uoa1.y("noOperation");
                         uoa1.h(this.j);
                         uoa1.w(this.k);
                         uoa1.q(b.b);
                         y6.s(d.class, LoadPolicy.DIALOG).G(d.a).R(new d(this, p0, uoa1.f()), e.b);
                      }
                   }else {
                      String[] stringArray = new String[]{qMedia.path};
                      File uFile = b.B(stringArray);
                      if (uFile != null && uFile.exists()) {
                         Fresco.getImagePipeline().evictFromCache(w0.c(uFile));
                         this.a(w0.c(uFile), this.e.getCropPrams());
                      }else {
                         this.c(this.d, this.c, this.e);
                      }
                   }
                }
             }else if(p2 != null && !p1){
                this.c(this.d, this.c, this.e);
             }
             break;
           case 770:
             if (p1 == i) {
                if (p2.getBooleanExtra("newBackgroundClip", 0)) {
                   return;
                }
                ta = this.a;
                if (ta != null && ta.exists()) {
                   Fresco.getImagePipeline().evictFromCache(w0.c(this.a));
                }
                this.b.onNext(p2);
                this.b.onComplete();
             }else if(!p1){
                this.d.a().f(0);
                this.d.a().g(R.anim.arg_RES_7f010112);
                this.c(this.d, this.c, this.e);
             }
             break;
           default:
       }
    label_01a2 :
       return;
    }
    public void e(GifshowActivity p0,Uri p1,Bundle p2,int p3,a p4){
       ImageSelectSupplier imageSelectS = ImageSelectSupplier.class;
       if (PatchProxy.isSupport(imageSelectS)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, imageSelectS, "7")) {
             return;
          }
       }
       Intent intent = new Intent(p0, ImageCropGifshowActivity.class);
       intent.setData(p1);
       intent.putExtras(p2);
       p0.t1(intent, p3, p4);
       return;
    }
    public t f(i p0,ImageSelectSupplier$ImageSelectType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ImageSelectSupplier.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(ImageSelectSupplier.o).flatMap(new g(this)).flatMap(new a(this, p0, p1));
    }
    public ImageSelectSupplier g(ImageSelectSupplier$c p0){
       this.f = p0;
       return this;
    }
    public void h(double p0){
       this.j = p0;
    }
    public ImageSelectSupplier i(ImageSelectSupplier$Type p0){
       this.h = p0;
       return this;
    }
    public void j(double p0){
       this.k = p0;
    }
}
