package com.kuaishou.live.core.show.photoalbum.cropper.c;
import android.graphics.Rect;
import android.graphics.RectF;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Math;
import java.io.Closeable;
import android.content.Context;
import android.net.Uri;
import com.kuaishou.live.core.show.photoalbum.cropper.c$a;
import java.lang.Boolean;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.OutOfMemoryError;
import java.lang.Throwable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import android.content.ContentResolver;
import java.lang.System;
import java.lang.Exception;
import java.lang.Float;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$RequestSizeOptions;
import pp.a;
import q87.c;
import com.kuaishou.live.core.show.photoalbum.cropper.c$b;
import j2.a;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;

public final class c	// class@000d6e
{
    public static final Rect a;
    public static final RectF b;
    public static final RectF c;
    public static final float[] d;
    public static final float[] e;
    public static int f;
    public static Pair g;

    static {
       c.a = new Rect();
       c.b = new RectF();
       c.c = new RectF();
       float[] uofloatArray = new float[6];
       c.d = uofloatArray;
       float[] uofloatArray1 = new float[6];
       c.e = uofloatArray1;
    }
    public void c(){
       super();
    }
    public static int a(int p0,int p1){
       EGLDisplay obj1;
       int i1;
       int f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       EGLConfig[] obj = null;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, uoc, "26");
          if (obj1 != patchProxyRe) {
             return obj1.intValue();
          }
       }
       int i = 1;
       if (!c.f) {
          try{
             EGL10 obj2 = PatchProxy.apply(obj, obj, uoc, "28");
             if (obj2 != patchProxyRe) {
                i1 = obj2.intValue();
             }else {
                i1 = 2048;
                obj2 = EGLContext.getEGL();
                obj1 = obj2.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                int[] ointArray = new int[2];
                obj2.eglInitialize(obj1, ointArray);
                ointArray = new int[i];
                obj2.eglGetConfigs(obj1, obj, 0, ointArray);
                obj = new EGLConfig[ointArray[0]];
                obj2.eglGetConfigs(obj1, obj, ointArray[0], ointArray);
                int[] ointArray1 = new int[i];
                int i2 = 0;
                int i3 = 0;
                while (i2 < ointArray[0]) {
                   obj2.eglGetConfigAttrib(obj1, obj[i2], 0x302c, ointArray1);
                   if (i3 < ointArray1[0]) {
                      i3 = ointArray1[0];
                   }
                   i2 = i2 + 1;
                }
                obj2.eglTerminate(obj1);
                i1 = Math.max(i3, i1);
             }
             c.f = i1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static int b(int p0,int p1,int p2,int p3){
       int i = 1;
       if (p1 > p3 || p0 > p2) {
          int i1 = p1 / 2;
          i1 = i1 / i;
          while (i1 > p3) {
             i1 = p0 / 2;
             i1 = i1 / i;
             if (i1 > p2) {
                i = i * 2;
             }
          }
       }
       return i;
    }
    public static void c(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "29")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static c$a d(Context p0,Uri p1,float[] p2,int p3,int p4,int p5,boolean p6,int p7,int p8,int p9,int p10,boolean p11,boolean p12){
       object oobject = p1;
       c uoc = c.class;
       int i = 1;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[i] = oobject;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = Boolean.valueOf(p12);
          Object obj = PatchProxy.apply(objArray, null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i1 = 1;
    label_0072 :
       Context uContext = p0;
       Uri uri = p1;
       float[] uofloatArray = p2;
       int i2 = p3;
       int i3 = p4;
       int i4 = p5;
       boolean b = p6;
       int i5 = p7;
       int i6 = p8;
       int i7 = p9;
       int i8 = p10;
       boolean b1 = p11;
       boolean b2 = p12;
       int i9 = i1;
       try{
          return c.e(uContext, uri, uofloatArray, i2, i3, i4, b, i5, i6, i7, i8, b1, b2, i9);
       }catch(java.lang.OutOfMemoryError e0){
          OutOfMemoryError outOfMemoryE = e0;
          int i10 = i1 * 2;
          if (i10 <= 16) {
             i1 = i10;
             goto label_0072 ;
          }else {
             throw new RuntimeException("Failed to handle OOM by sampling \("+i10+"\): "+oobject+"\r\n"+outOfMemoryE.getMessage(), outOfMemoryE);
          }
       }
    }
    public static c$a e(Context p0,Uri p1,float[] p2,int p3,int p4,int p5,boolean p6,int p7,int p8,int p9,int p10,boolean p11,boolean p12,int p13){
       Context obj1;
       c$a uoa1;
       c$a uoa2;
       object oobject = p1;
       object oobject1 = p2;
       int i = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       int i1 = 13;
       int i2 = 12;
       int i3 = 11;
       int i4 = 10;
       int i5 = 9;
       int i6 = 8;
       int i7 = 0;
       Bitmap obj = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[14];
          objArray[i7] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[i6] = Integer.valueOf(p8);
          objArray[i5] = Integer.valueOf(p9);
          objArray[i4] = Integer.valueOf(p10);
          objArray[i3] = Boolean.valueOf(p11);
          objArray[i2] = Boolean.valueOf(p12);
          objArray[i1] = Integer.valueOf(p13);
          obj1 = PatchProxy.apply(objArray, obj, uoc, "20");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       i2 = 0;
       Rect rect = c.q(p2, p4, p5, p6, p7, p8);
       i7 = (p9 > 0)? p9: rect.width();
       int i8 = (p10 > 0)? p10: rect.height();
       obj1 = p0;
       Uri uri = p1;
       Rect rect1 = rect;
       int i9 = i7;
       p4 = i8;
       p5 = i7;
       i7 = p13;
       try{
          c$a uoa = c.l(obj1, uri, rect1, i9, i8, i7);
          try{
             c$a a = uoa.a;
             c$a uoa3 = uoa.b;
          }catch(java.lang.Exception e0){
             i7 = 1;
          }
       }catch(java.lang.Exception e0){
          obj = null;
          goto label_00c0 ;
       }
       if (obj) {
          boolean b = p11;
          boolean b1 = p12;
          try{
             Bitmap uBitmap = c.x(obj, i, b, b1);
             try{
                if (i % 90) {
                   uoa1 = i7;
                   uBitmap = c.h(uBitmap, p2, rect, p3, p6, p7, p8);
                }else {
                   uoa1 = i7;
                }
                return new c$a(uBitmap, uoa1);
             }catch(java.lang.OutOfMemoryError e0){
                obj = uBitmap;
             }
             if (obj) {
                obj.recycle();
             }
             throw e0;
          }catch(java.lang.OutOfMemoryError e0){
             goto label_00ed ;
          }
       }else if(PatchProxy.isSupport(uoc)){
          Object[] objArray1 = new Object[i1];
          objArray1[i2] = p0;
          objArray1[1] = oobject;
          objArray1[2] = e0;
          objArray1[3] = Integer.valueOf(p3);
          objArray1[4] = Boolean.valueOf(p6);
          objArray1[5] = Integer.valueOf(p7);
          objArray1[6] = Integer.valueOf(p8);
          objArray1[7] = Integer.valueOf(p13);
          objArray1[i6] = rect;
          objArray1[i5] = Integer.valueOf(p5);
          objArray1[i4] = Integer.valueOf(p4);
          objArray1[i3] = Boolean.valueOf(p11);
          objArray1[12] = Boolean.valueOf(p12);
          obj = null;
          uoa2 = PatchProxy.apply(objArray1, obj, uoc, "21");
          if (uoa2 != patchProxyRe) {
          label_01a6 :
             return uoa2;
          }
       }else {
          obj = null;
       }
       try{
          BitmapFactory$Options options = new BitmapFactory$Options();
          i9 = c.b(rect.width(), rect.height(), p5, p4) * p13;
          options.inSampleSize = i9;
          Bitmap uBitmap1 = c.i(p0.getContentResolver(), oobject, options);
          if (uBitmap1 != null) {
             int len = e0.length;
             float[] uofloatArray = new float[len];
             System.arraycopy(e0, i2, uofloatArray, i2, e0.length);
             for (; i2 < len; i2 = i2 + 1) {
                float f = uofloatArray[i2] / (float)options.inSampleSize;
                uofloatArray[i2] = f;
             }
             obj = c.g(uBitmap1, uofloatArray, p3, p6, p7, p8, 0x3f800000, p11, p12);
             if (obj != uBitmap1) {
                uBitmap1.recycle();
             }
          }
          uoa2 = new c$a(obj, i9);
          goto label_01a6 ;
       }catch(java.lang.OutOfMemoryError e0){
          if (obj) {
             obj.recycle();
          }
          throw e0;
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Failed to load sampled bitmap: "+oobject+"\r\n"+e0.getMessage(), e0);
       }
    }
    public static c$a f(Bitmap p0,float[] p1,int p2,boolean p3,int p4,int p5,boolean p6,boolean p7){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6),Boolean.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = 0x3f800000 / (float)1;
       Bitmap uBitmap = p0;
       float[] uofloatArray = p1;
       int i = p2;
       boolean b = p3;
       int i1 = p4;
       int i2 = p5;
       boolean b1 = p6;
       boolean b2 = p7;
       try{
          return new c$a(c.g(uBitmap, uofloatArray, i, b, i1, i2, f, b1, b2), 1);
       }catch(java.lang.OutOfMemoryError e0){
          int i3 = v3 * 2;
          if (i3 <= v2) {
             goto label_004a ;
          }else {
             throw e0;
          }
       }
    }
    public static Bitmap g(Bitmap p0,float[] p1,int p2,boolean p3,int p4,int p5,float p6,boolean p7,boolean p8){
       object oobject = p0;
       int i = p2;
       float f = p6;
       c uoc = c.class;
       int i1 = 2;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[i1] = Integer.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          Object obj = PatchProxy.apply(objArray, null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Rect rect = c.q(p1, p0.getWidth(), p0.getHeight(), p3, p4, p5);
       Matrix matrix = new Matrix();
       matrix.setRotate((float)i, (float)(p0.getWidth() / i1), (float)(p0.getHeight() / i1));
       float f1 = (p7)? - f: f;
       if (p8) {
          f = - f;
       }
       matrix.postScale(f1, f);
       Bitmap uBitmap = Bitmap.createBitmap(p0, rect.left, rect.top, rect.width(), rect.height(), matrix, true);
       if (uBitmap == oobject) {
          uBitmap = oobject.copy(p0.getConfig(), 0);
       }
       if (i % 90) {
          uBitmap = c.h(uBitmap, p1, rect, p2, p3, p4, p5);
       }
       return uBitmap;
    }
    public static Bitmap h(Bitmap p0,float[] p1,Rect p2,int p3,boolean p4,int p5,int p6){
       int i4;
       c uoc = c.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, uoc, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p3 % 90) {
          double d = Math.toRadians((double)p3);
          Rect left = (p3 < 90 || (p3 > 180 && p3 < 270))? p2.left: p2.right;
          int i2 = 0;
          while (true) {
             if (i2 < p1.length) {
                int i3 = left - 1;
                if (p1[i2] - (float)i3 >= 0) {
                   i3 = left + 1;
                   if (p1[i2] - (float)i3 <= 0) {
                      i2 = i2 + i;
                      i1 = (int)Math.abs((Math.sin(d) * (double)((float)p2.bottom - p1[i2])));
                      left = (int)Math.abs((Math.cos(d) * (double)(p1[i2] - (float)p2.top)));
                      i = (int)Math.abs(((double)(p1[i2] - (float)p2.top) / Math.sin(d)));
                      i4 = (int)Math.abs(((double)((float)p2.bottom - p1[i2]) / Math.cos(d)));
                   label_00bd :
                      p2.set(i1, left, (i + i1), (i4 + left));
                      if (p4) {
                         c.m(p2, p5, p6);
                      }
                      Bitmap uBitmap = Bitmap.createBitmap(p0, p2.left, p2.top, p2.width(), p2.height());
                      if (p0 != uBitmap) {
                         p0.recycle();
                      }
                      p0 = uBitmap;
                      break ;
                   }
                }
                i2 = i2 + 2;
             }else {
                i4 = 0;
                left = 0;
                i = 0;
                goto label_00bd ;
             }
          }
       }
       return p0;
    }
    public static Bitmap i(ContentResolver p0,Uri p1,BitmapFactory$Options p2){
       InputStream obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          obj = p0.openInputStream(p1);
          c.c(obj);
          return BitmapFactory.decodeStream(obj, c.a, p2);
       }catch(java.lang.OutOfMemoryError e0){
          int i = p2.inSampleSize * 2;
          p2.inSampleSize = i;
          c.c(e0);
          if (p2.inSampleSize <= 512) {
             goto label_0013 ;
          }else {
             throw new RuntimeException("Failed to decode image: "+p1);
          }
       }
    }
    public static BitmapFactory$Options j(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       InputStream inputStream = p0.openInputStream(p1);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = true;
       BitmapFactory.decodeStream(inputStream, c.a, options);
       options.inJustDecodeBounds = false;
       c.c(inputStream);
       return options;
    }
    public static c$a k(Context p0,Uri p1,int p2,int p3){
       BitmapFactory$Options obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          ContentResolver contentResol = p0.getContentResolver();
          obj = c.j(contentResol, p1);
          obj.inSampleSize = Math.max(c.b(obj.outWidth, obj.outHeight, p2, p3), c.a(obj.outWidth, obj.outHeight));
          return new c$a(c.i(contentResol, p1, obj), obj.inSampleSize);
       }catch(java.lang.Exception e8){
          throw new RuntimeException("Failed to load sampled bitmap: "+p1+"\r\n"+e8.getMessage(), e8);
       }
    }
    public static c$a l(Context p0,Uri p1,Rect p2,int p3,int p4,int p5){
       BitmapFactory$Options obj;
       BitmapRegionDecoder uBitmapRegio;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uoc, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new BitmapFactory$Options();
          obj.inSampleSize = p5 * c.b(p2.width(), p2.height(), p3, p4);
          InputStream inputStream = p0.getContentResolver().openInputStream(p1);
          try{
             uBitmapRegio = BitmapRegionDecoder.newInstance(inputStream, 0);
             try{
             label_0058 :
                c.c(inputStream);
                uBitmapRegio.recycle();
                return new c$a(uBitmapRegio.decodeRegion(p2, obj), obj.inSampleSize);
             }catch(java.lang.OutOfMemoryError e0){
                p4 = e0.inSampleSize * 2;
                e0.inSampleSize = p4;
                if (p4 > 512) {
                   c.c(inputStream);
                   if (uBitmapRegio) {
                      uBitmapRegio.recycle();
                   }
                   return new c$a(v5, v3);
                }else {
                   goto label_0058 ;
                }
             }catch(java.lang.Exception e10){
             }
             int i = inputStream;
          }catch(java.lang.Exception e10){
             uBitmapRegio = 0;
             goto label_008c ;
          }
       }catch(java.lang.Exception e10){
          p3 = 0;
       }
       throw new RuntimeException("Failed to load sampled bitmap: "+p1+"\r\n"+e10.getMessage(), e10);
    }
    public static void m(Rect p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "16")) {
          return;
       }
       if (p1 == p2 && p0.width() != p0.height()) {
          p0.bottom = (p0.height() > p0.width())? p0.bottom - (p0.height() - p0.width()): p0.right - (p0.width() - p0.height());
       }
    label_0050 :
       return;
    }
    public static float n(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.max(Math.max(Math.max(p0[1], p0[3]), p0[5]), p0[7]);
    }
    public static float o(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((c.t(p0) + c.s(p0)) / 2.00f);
    }
    public static float p(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((c.n(p0) + c.u(p0)) / 2.00f);
    }
    public static Rect q(float[] p0,int p1,int p2,boolean p3,int p4,int p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uoc, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Rect rect = new Rect(Math.round(Math.max(0, c.s(p0))), Math.round(Math.max(0, c.u(p0))), Math.round(Math.min((float)p1, c.t(p0))), Math.round(Math.min((float)p2, c.n(p0))));
       if (p3) {
          c.m(rect, p4, p5);
       }
       return rect;
    }
    public static float r(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (c.n(p0) - c.u(p0));
    }
    public static float s(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.min(Math.min(Math.min(p0[0], p0[2]), p0[4]), p0[6]);
    }
    public static float t(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.max(Math.max(Math.max(p0[0], p0[2]), p0[4]), p0[6]);
    }
    public static float u(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.min(Math.min(Math.min(p0[1], p0[3]), p0[5]), p0[7]);
    }
    public static float v(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (c.t(p0) - c.s(p0));
    }
    public static Bitmap w(Bitmap p0,int p1,int p2,CropImageView$RequestSizeOptions p3){
       CropImageView$RequestSizeOptions obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, c.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 > 0 && p2 > 0) {
          try{
             obj = CropImageView$RequestSizeOptions.RESIZE_FIT;
             if (p3 != obj && (p3 == CropImageView$RequestSizeOptions.RESIZE_INSIDE || p3 == CropImageView$RequestSizeOptions.RESIZE_EXACT)) {
                Bitmap uBitmap = null;
                if (p3 == CropImageView$RequestSizeOptions.RESIZE_EXACT) {
                   uBitmap = Bitmap.createScaledBitmap(p0, p1, p2, false);
                }else {
                   float f = (float)p0.getWidth();
                   float f1 = (float)p0.getHeight();
                   float f2 = Math.max((f / (float)p1), (f1 / (float)p2));
                   if (f2 - 0x3f800000 > 0 || p3 == obj) {
                      uBitmap = Bitmap.createScaledBitmap(p0, (int)(f / f2), (int)(f1 / f2), false);
                   }
                }
                if (uBitmap != null) {
                   if (uBitmap != p0) {
                      p0.recycle();
                   }
                   return uBitmap;
                }
             }
          }catch(java.lang.Exception e9){
             a.C().z("AIC", "Failed to resize cropped image, return bitmap before resize", e9);
          }
       }
    }
    public static Bitmap x(Bitmap p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, c.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 <= 0 && (p2 || p3)) {
          Matrix matrix = new Matrix();
          matrix.setRotate((float)p1);
          float f = 0x3f800000;
          float f1 = (p2)? 0xbf800000: 0x3f800000;
          if (p3) {
             f = 0xbf800000;
          }
          matrix.postScale(f1, f);
          Bitmap uBitmap = Bitmap.createBitmap(p0, 0, 0, p0.getWidth(), p0.getHeight(), matrix, false);
          if (uBitmap != p0) {
             p0.recycle();
          }
          return uBitmap;
       }else {
          return p0;
       }
    }
    public static c$b y(Bitmap p0,Context p1,Uri p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c$b obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       try{
          InputStream inputStream = p1.getContentResolver().openInputStream(p2);
          if (inputStream != null) {
             try{
                a uoa = new a(inputStream);
                inputStream.close();
             }catch(java.lang.Exception e0){
             }
          }else {
             p2 = obj;
          }
       }catch(java.lang.Exception e0){
       }
       int i = 0;
       if (p2 != null) {
          obj = PatchProxy.applyTwoRefs(p0, p2, obj, c.class, "2");
          if (obj != e0) {
          }else {
             int i1 = p2.f("Orientation", 1);
             if (i1 != 3) {
                if (i1 != 6) {
                   if (i1 == 8) {
                      i = 270;
                   }
                }else {
                   i = 90;
                }
             }else {
                i = 180;
             }
             obj = new c$b(p0, i);
          }
       }else {
          obj = new c$b(p0, i);
       }
       return obj;
    }
    public static void z(Context p0,Bitmap p1,Uri p2,Bitmap$CompressFormat p3,int p4){
       c uoc = c.class;
       OutputStream obj = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, uoc, "18")) {
             return;
          }
       }
       obj = p0.getContentResolver().openOutputStream(p2);
       p1.compress(p3, p4, obj);
       c.c(obj);
       return;
    }
}
