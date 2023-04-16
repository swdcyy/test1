package com.yxcorp.image.fresco.wrapper.a;
import h0d.d;
import e0d.h;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.String;
import java.lang.Class;
import java.lang.Package;
import java.lang.Object;
import android.widget.ImageView;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.fresco.wrapper.a$b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.image.fresco.wrapper.a$c;
import com.facebook.common.references.a;
import com.kwai.robust.PatchProxyResult;
import ab.e;
import com.facebook.imagepipeline.image.a;
import bd.c;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap$Config;
import com.yxcorp.image.common.log.Log;
import bd.a;
import oc.b;
import oc.c;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.image.callercontext.a;
import kb.c;
import com.yxcorp.image.fresco.wrapper.a$e;
import android.os.AsyncTask;
import kb.e;
import com.yxcorp.image.fresco.wrapper.a$a;
import ya.i;
import bd.b;
import java.lang.Exception;
import android.content.Context;
import com.yxcorp.image.fresco.wrapper.a$g;
import m0d.f;
import io.reactivex.g;
import brd.t;
import io.reactivex.android.schedulers.a;
import m0d.h;
import m0d.g;
import erd.g;
import crd.b;
import android.os.Handler;
import java.lang.Throwable;
import m0d.j;
import java.lang.Runnable;
import m0d.i;
import com.yxcorp.image.fresco.wrapper.a$d;
import i0d.b;
import java.lang.Integer;
import i0d.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Locale;
import java.lang.Boolean;
import i0d.f;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class a	// class@001380
{
    public static z a;
    public static a$f b;
    public static a$f c;
    public static a$f d;
    public static final String e;
    public static final String f;

    static {
       a.a = b.b(h.d().f());
       a.b = null;
       a.c = null;
       a.d = null;
       a.e = a.class.getSimpleName();
       a.f = a.class.getPackage().getName();
    }
    public void a(){
       super();
    }
    public static void a(ImageView p0,ImageRequest p1,Drawable p2,ImageCallback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "9")) {
          return;
       }
       if (p2 != null) {
          p0.setImageDrawable(p2);
       }
       a.d(p1, new a$b(p3, p0));
       return;
    }
    public static void b(ImageView p0,ImageRequest[] p1,Drawable p2,ImageCallback p3){
       if (p2 != null) {
          p0.setImageDrawable(p2);
       }
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       AtomicInteger uAtomicInteg = new AtomicInteger(-1);
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          a$c uoc = new a$c(uAtomicBoole, p3, p0, uAtomicInteg, oobject);
          a.d(oobject, v10);
       }
       return;
    }
    public static Drawable c(a p0){
       Bitmap uBitmap1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       BitmapDrawable uBitmapDrawa = null;
       Object obj = PatchProxy.applyOneRefs(p0, uBitmapDrawa, uoa, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       e.f(a.l(p0));
       p0 = p0.j();
       if (p0 instanceof c) {
          Bitmap uBitmap = p0.g();
          if (uBitmap != null) {
             uBitmap1 = PatchProxy.applyOneRefs(uBitmap, uBitmapDrawa, uoa, "11");
             if (uBitmap1 != patchProxyRe) {
             }else {
                Bitmap uBitmap2 = uBitmap.copy(uBitmap.getConfig(), uBitmap.isMutable());
                uBitmap1 = (uBitmap2 == null)? Bitmap.createScaledBitmap(uBitmap, (uBitmap.getWidth() / 2), (uBitmap.getHeight() / 2), false): uBitmap2;
             }
             uBitmapDrawa = new BitmapDrawable(uBitmap1);
          }
          return uBitmapDrawa;
       }else if(p0 instanceof a){
          uBitmap1 = PatchProxy.applyOneRefs(p0, uBitmapDrawa, uoa, "12");
          if (uBitmap1 != patchProxyRe) {
          }else {
             c frame = p0.g().getFrame(false);
             uBitmap1 = a.l((p0.getWidth() / 2), (p0.getHeight() / 2));
             if (uBitmap1 != null) {
                uBitmap1.eraseColor(false);
                frame.renderFrame(uBitmap1.getWidth(), uBitmap1.getHeight(), uBitmap1);
             }
          }
          return new BitmapDrawable(uBitmap1);
       }else {
          throw new UnsupportedOperationException("Unrecognized image class: "+p0);
       }
    }
    public static void d(ImageRequest p0,ImageCallback p1){
       Fresco.getImagePipeline().fetchDecodedImage(p0, ImageSource.UNKNOWN.newCallerContext()).f(new a$e(p1), AsyncTask.THREAD_POOL_EXECUTOR);
    }
    public static void e(String p0,ImageCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       Fresco.getImagePipeline().fetchDecodedImage(ImageRequest.c(p0), ImageSource.UNKNOWN.newCallerContext()).f(new a$a(p1), i.d());
       return;
    }
    public static Bitmap f(ImageRequest p0){
       Object obj = null;
       a obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       c uoc = Fresco.getImagePipeline().fetchImageFromBitmapCache(p0, ImageSource.UNKNOWN.newCallerContext());
       obj1 = uoc.getResult();
       if (obj1 != null) {
          try{
             a uoa = obj1.j();
             if (uoa instanceof b) {
                Bitmap uBitmap = uoa.g();
                a.f(obj1);
                uoc.close();
                return uBitmap.copy(uBitmap.getConfig(), uBitmap.isMutable());
             }else {
                a.f(obj1);
             }
          }catch(java.lang.Exception e2){
             Log.c(a.e, "Copy bitmap failed caused by "+e2.toString());
             a.f(obj1);
             uoc.close();
             return obj;
          }
       }
       uoc.close();
       return obj;
    }
    public static void g(Context p0,Drawable p1,String p2,a$g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "14")) {
          return;
       }
       t.create(new f(p1, p2, p0)).subscribeOn(a.a).observeOn(a.c()).subscribe(new h(p3), new g(p1, p3));
       return;
    }
    public static void h(Handler p0,ImageCallback p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "16")) {
          return;
       }
       p0.postAtFrontOfQueue(new j(p1, p2));
       return;
    }
    public static void i(Handler p0,ImageCallback p1,Drawable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "15")) {
          return;
       }
       p0.postAtFrontOfQueue(new i(p1, p2));
       return;
    }
    public static void j(Context p0,ImageRequest p1,String p2,a$g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "18")) {
          return;
       }
       a.d(p1, new a$d(p0, p2, p3));
       return;
    }
    public static void k(Bitmap p0,String p1,int p2){
       boolean b;
       Bitmap$CompressFormat jPEG;
       boolean b1;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "19")) {
          return;
       }
       String str = "2";
       Object obj = PatchProxy.applyOneRefs(p1, null, d.class, str);
       if (obj != patchProxyRe) {
       }else if(TextUtils.isEmpty(p1)){
          obj = p1;
       }else {
          obj = p1.toUpperCase(Locale.US);
       }
       String[] obj1 = PatchProxy.applyOneRefs(obj, null, uob, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = new String[]{"jpg","jpeg"};
          b = f.a(obj, obj1);
       }
       if (b) {
          jPEG = Bitmap$CompressFormat.JPEG;
       }else {
          obj1 = new String[]{"png"};
          if (f.a(p1, obj1)) {
             jPEG = Bitmap$CompressFormat.PNG;
          }else {
             String[] obj2 = PatchProxy.applyOneRefs(obj, null, uob, "3");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                obj2 = new String[]{"webp"};
                b1 = f.a(obj, obj2);
             }
             if (b1) {
                jPEG = Bitmap$CompressFormat.WEBP;
             }else {
                throw new IOException("Unknown file extension");
             }
          }
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       p0.compress(jPEG, p2, uFileOutputS);
       uFileOutputS.close();
       return;
    }
    public static Bitmap l(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoa, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       if (p0 <= i || p1 <= i) {
          return null;
       }else {
          return Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       }
    }
}
