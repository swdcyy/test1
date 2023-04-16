package com.yxcorp.gifshow.media.util.c;
import x6b.e;
import java.lang.Object;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.media.util.MediaUtilityNativeWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import rg.d;
import java.lang.System;
import android.graphics.Bitmap;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ykd.a;
import java.lang.Throwable;
import q87.c;
import q6b.d$b;
import q6b.d;
import com.yxcorp.gifshow.media.util.c$a;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.io.File;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.lang.Number;
import exc.g;
import lnc.pa;
import lnc.qa;
import com.yxcorp.gifshow.media.a;
import java.io.Closeable;
import ekd.p;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Math;
import r6b.b;
import com.yxcorp.gifshow.media.builder.MP4Builder;
import java.lang.Exception;

public final class c extends e	// class@001d20
{
    public static final Object a;

    static {
       c.a = new Object();
       Application uApplication = a.b();
       if (PatchProxy.applyVoidOneRefs(uApplication, null, MediaUtilityNativeWrapper.class, "1")) {
       }else if(uApplication != null){
          d.a(uApplication, "ksvideoprocessor");
       }else {
          System.loadLibrary("ksvideoprocessor");
       }
    }
    public void c(){
       super();
    }
    public static int a(int p0){
       if (p0 == 12) {
          return 3;
       }
       if (p0 != 16) {
          return -1;
       }
       return 4;
    }
    public static void b(Bitmap p0,int p1,int p2,int p3,String p4,boolean p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "6")) {
             return;
          }
       }
       c.g("post_album_tool", p0, p1, p2, p3, p4, p5);
       return;
    }
    public static Bitmap c(Context p0,Bitmap p1,int p2,int p3,int p4,String p5,boolean p6,boolean p7){
       Object[] objArray;
       String obj;
       Bitmap uBitmap;
       object oobject = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       object oobject1 = null;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 5;
       int i4 = 4;
       int i5 = 3;
       int i6 = 2;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[i];
          objArray[0] = oobject1;
          objArray[1] = oobject;
          objArray[i6] = Integer.valueOf(p2);
          objArray[i5] = Integer.valueOf(p3);
          objArray[i4] = Integer.valueOf(p4);
          objArray[i3] = p5;
          objArray[i2] = Boolean.valueOf(p6);
          objArray[i1] = Boolean.valueOf(p7);
          obj = PatchProxy.apply(objArray, oobject1, uoc, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "post_album_tool";
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray1 = new Object[9];
          objArray1[0] = obj;
          objArray1[1] = oobject1;
          objArray1[i6] = oobject;
          objArray1[i5] = Integer.valueOf(p2);
          objArray1[i4] = Integer.valueOf(p3);
          objArray1[i3] = Integer.valueOf(p4);
          objArray1[i2] = p5;
          objArray1[i1] = Boolean.valueOf(p6);
          objArray1[i] = Boolean.valueOf(p7);
          Object obj1 = PatchProxy.apply(objArray1, oobject1, uoc, "13");
          if (obj1 != patchProxyRe) {
             uBitmap = obj1;
          }else {
          label_0086 :
             boolean b = p7;
             try{
                uBitmap = c.h(oobject, b);
                c.d(obj, null, uBitmap, p2, p3, p4, p5, p6);
             }catch(com.kwai.video.videoprocessor.JpegBuilderException e0){
                objArray = new Object[0];
                a.C().u("MediaUtility", e0, objArray);
                uBitmap = oobject;
             }
          }
       }else {
          goto label_0086 ;
       }
    }
    public static void d(String p0,Context p1,Bitmap p2,int p3,int p4,int p5,String p6,boolean p7){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "15")) {
             return;
          }
       }
       if (d.a().c()) {
          c$a.a(p1, p2, p3, p4, p5, p6, p7);
       }else {
          BitmapUtil.N(p0, BitmapUtil.T(p2, p3, p4, Bitmap$Config.ARGB_8888), p6, p5);
       }
       return;
    }
    public static Bitmap e(Context p0,Bitmap p1,int p2,int p3,int p4,String p5,boolean p6,boolean p7){
       String obj;
       object oobject = p1;
       object oobject1 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       object oobject2 = null;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[i];
          objArray[0] = oobject2;
          objArray[1] = oobject;
          objArray[i5] = Integer.valueOf(p2);
          objArray[i4] = Integer.valueOf(p3);
          objArray[i3] = Integer.valueOf(p4);
          objArray[5] = oobject1;
          objArray[i2] = Boolean.valueOf(p6);
          objArray[i1] = Boolean.valueOf(p7);
          obj = PatchProxy.apply(objArray, oobject2, uoc, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "post_album_tool";
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray1 = new Object[9];
          objArray1[0] = obj;
          objArray1[1] = oobject2;
          objArray1[i5] = oobject;
          objArray1[i4] = Integer.valueOf(p2);
          objArray1[i3] = Integer.valueOf(p3);
          objArray1[5] = Integer.valueOf(p4);
          objArray1[i2] = oobject1;
          objArray1[i1] = Boolean.valueOf(p6);
          objArray1[i] = Boolean.valueOf(p7);
          Object obj1 = PatchProxy.apply(objArray1, oobject2, uoc, "17");
          if (obj1 != patchProxyRe) {
             oobject = obj1;
          }else if(d.a().c()){
             Bitmap uBitmap = c.h(oobject, p7);
             c$a.a(null, uBitmap, p2, p3, p4, p5, p6);
             oobject = uBitmap;
          }else {
             BitmapUtil.N(obj, BitmapUtil.T(oobject, p2, p3, Bitmap$Config.ARGB_8888), oobject1, p4);
          }
       }else {
          goto label_0088 ;
       }
       return oobject;
    }
    public static void f(String p0,Context p1,Bitmap p2,int p3,int p4,int p5,String p6,boolean p7){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "11")) {
             return;
          }
       }
       try{
          c.d(p0, p1, p2, p3, p4, p5, p6, p7);
       }catch(com.kwai.video.videoprocessor.JpegBuilderException e5){
          Object[] objArray1 = new Object[0];
          a.C().u("MediaUtility", e5, objArray1);
       }
       return;
    }
    public static void g(String p0,Bitmap p1,int p2,int p3,int p4,String p5,boolean p6){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "7")) {
             return;
          }
       }
       c.f(p0, a.b(), p1, p2, p3, p4, p5, p6);
       return;
    }
    public static Bitmap h(Bitmap p0,boolean p1){
       Bitmap obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (Build$VERSION.SDK_INT >= 26 && (p0.getConfig() == Bitmap$Config.RGBA_F16 && RomUtils.w())) {
          Object[] objArray = new Object[0];
          a.C().w("convertBitmap", "processColorSpace is RGBA_F16 and vivo system, so convert to argb 8888", objArray);
          obj = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap$Config.ARGB_8888);
          new Canvas(obj).drawBitmap(p0, new Matrix(), null);
          if (p1) {
             p0.recycle();
          }
          return obj;
       }else {
          return p0;
       }
    }
    public static int i(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (d.a().c()) {
          obj = PatchProxy.applyOneRefs(p0, null, c$a.class, "1");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
             g og = qa.r(g.class);
             if (og == null) {
                i = 0;
             }else {
                og.dE();
                i = og.FH(p0);
             }
          }
       }else {
          i = MediaUtilityNativeWrapper.nativeGetAudioDuration(p0);
       }
       return i;
    }
    public static String j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaUtilityNativeWrapper.nativeGetDescription(p0);
    }
    public static Bitmap k(File p0,int p1){
       Closeable obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          int i = 0;
          try{
             a uoa = new a(p0, p1, i);
             Bitmap uBitmap = Bitmap.createBitmap(uoa.getWidth(), uoa.getHeight(), Bitmap$Config.ARGB_8888);
             if (uoa.d(uBitmap)) {
                p.b(uoa);
                return uBitmap;
             }
             p.b(obj);
             return null;
          }catch(java.io.IOException e4){
          }
          e4.printStackTrace();
          goto label_0044 ;
       }catch(java.io.IOException e4){
          obj = null;
          goto label_0041 ;
       }
    }
    public static int l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return MediaUtilityNativeWrapper.nativeGetVideoCodecId(p0);
    }
    public static int m(String p0){
       Object a = c.a;
       _monitor_enter(a);
       _monitor_exit(a);
       return MediaUtilityNativeWrapper.nativeGetVideoDuration(p0);
    }
    public static int n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = c.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return MediaUtilityNativeWrapper.nativeGetVideoDurationNoInfo(p0);
    }
    public static File o(File p0,int p1,File p2){
       File obj;
       File uFile;
       b uob;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, c.class, "22");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       String str = null;
       obj = File.createTempFile(p0.getName()+System.currentTimeMillis(), str, p2);
       if (PatchProxy.isSupport(uoc)) {
          Object obj1 = PatchProxy.applyThreeRefs(obj, p0, Integer.valueOf(p1), null, c.class, "21");
          if (obj1 != patchProxyRe) {
             uFile = obj1;
          }else {
          label_005c :
             int i1 = c.i(p0.getAbsolutePath());
             int i2 = 0;
             int i3 = (!i1)? 0: (int)Math.ceil((double)(((float)i * 0x3f800000) / (float)i1));
             try{
                if (i1 > i || i3 > 1) {
                   uob = new b(obj, str);
                   while (i2 < i3) {
                      int i4 = i3 - 1;
                      if (i2 == i4) {
                         boolean b = false;
                         boolean b1 = true;
                         boolean b2 = false;
                         long l = 0;
                         i4 = i4 * i1;
                         i4 = i - i4;
                         long l1 = (long)i4;
                         b uob1 = uob;
                         File uFile1 = p0;
                         uob1.d(uFile1, b, b1, b2, l, l1);
                      }else {
                         uob.d(p0, false, true, false, 0, 0);
                      }
                      i2 = i2 + 1;
                   }
                   uob.a();
                   uFile = obj;
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                obj.delete();
                uob.cancel();
             }
             uFile = p0;
          }
       }else {
          goto label_005c ;
       }
       return uFile;
    }
    public static int p(int p0){
       if (p0 == 2) {
          return 1;
       }
       if (p0 != 3) {
          return -1;
       }
       return 0;
    }
}
