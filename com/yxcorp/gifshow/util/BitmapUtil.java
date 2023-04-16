package com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Bitmap;
import java.io.File;
import java.util.regex.Pattern;
import lnc.v5;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import ekd.b0;
import android.graphics.BitmapFactory$Options;
import java.lang.Math;
import android.graphics.BitmapFactory;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.media.util.c;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import ekd.p;
import ekd.n0;
import ykd.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import qkd.b;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.media.util.h;
import android.graphics.Matrix;
import com.yxcorp.gifshow.media.a;
import java.io.Closeable;
import android.net.Uri;
import android.content.ContentValues;
import android.os.Environment;
import java.lang.System;
import java.lang.Long;
import com.yxcorp.gifshow.albumcontrol.a;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.provider.MediaStore$Images$Media;
import v79.a;
import java.io.FileOutputStream;
import android.os.Build$VERSION;
import oh7.a$d;
import oh7.a;
import oh7.c;
import java.io.BufferedOutputStream;
import com.yxcorp.utility.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import android.content.Context;
import android.graphics.Bitmap$Config;
import android.util.Base64;
import android.view.View;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import com.yxcorp.gifshow.util.BitmapUtil$BitmapCropMode;
import com.yxcorp.gifshow.util.BitmapUtil$a;
import java.lang.Enum;
import android.graphics.ColorSpace$Named;
import android.graphics.ColorSpace;
import com.yxcorp.gifshow.util.BitmapUtil$b;

public abstract class BitmapUtil	// class@001ed3
{
    public static final Paint a;

    static {
       BitmapUtil.a = new Paint(7);
    }
    public static Bitmap A(String p0,int p1,int p2){
       Bitmap uBitmap = null;
       if (p0 == null || !new File(p0).exists()) {
          return uBitmap;
       }
       if (p0.c().matcher(p0).matches() || p0.b().matcher(p0).matches()) {
          return c.k(new File(p0), Math.min(p1, p2));
       }
       b0 uob0 = BitmapUtil.E(p0);
       BitmapFactory$Options options = new BitmapFactory$Options();
       if (p1 > 0 && p2 > 0) {
          b0 a = uob0.a;
          if (a > p1 || uob0.b > p2) {
             options.inSampleSize = BitmapUtil.G(Math.min((a / p1), (uob0.b / p2)));
          }
       }
       options.inMutable = true;
       Bitmap uBitmap1 = BitmapFactory.decodeFile(p0, options);
       if (uBitmap1 == null) {
          return uBitmap;
       }else {
          return BitmapUtil.D(p0, uBitmap1);
       }
    }
    public static byte[] B(Bitmap p0){
       return BitmapUtil.C(p0, 98);
    }
    public static byte[] C(Bitmap p0,int p1){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       p0.compress(Bitmap$CompressFormat.JPEG, p1, uByteArrayOu);
       p.d(uByteArrayOu);
       return uByteArrayOu.toByteArray();
    }
    public static Bitmap D(String p0,Bitmap p1){
       String str = n0.e(p0);
       Object[] objArray = new Object[0];
       a.C().t("BitmapUtil", "getBitmapWithRotate file:"+p0+",fileInUpper:"+str, objArray);
       if (!b.M(str) && !b.O(str)) {
          String[] stringArray = new String[]{".heic","heif"};
          if (TextUtils.B(p0, stringArray)) {
          label_0043 :
             int i = h.b(p0);
             Object[] objArray1 = new Object[0];
             a.C().t("BitmapUtil", "getBitmapWithRotate degree:"+i, objArray1);
             if (i) {
                Matrix matrix = new Matrix();
                matrix.setRotate((float)i);
                Bitmap uBitmap = Bitmap.createBitmap(p1, 0, 0, p1.getWidth(), p1.getHeight(), matrix, false);
                if (uBitmap != p1) {
                   p1.recycle();
                }
                p1 = uBitmap;
             }
          }
       }else {
          goto label_0043 ;
       }
       return p1;
    }
    public static b0 E(String p0){
       a uoa;
       String str = n0.d(p0);
       if (str.endsWith(".jif") || str.endsWith(".mp4")) {
          int i = 0;
          try{
             File uFile = new File(p0);
             try{
                uoa = new a(uFile, i, i);
                p.b(uoa);
                return new b0(uoa.getWidth(), uoa.getHeight());
             }catch(java.io.IOException e0){
                Closeable uCloseable = uoa;
                p.b(e0);
                return new b0(i, i);
             }
          }catch(java.io.IOException e0){
          }
       }else {
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inJustDecodeBounds = true;
          BitmapFactory.decodeFile(p0, options);
          int i1 = h.b(p0);
          if (i1 == 90 || i1 == 270) {
             return new b0(options.outHeight, options.outWidth);
          }
          return new b0(options.outWidth, options.outHeight);
       }
    }
    public static int F(Bitmap p0,int p1,int p2){
       int i = 100;
       if (p1 <= 0) {
          return i;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       p0.compress(Bitmap$CompressFormat.JPEG, i, uByteArrayOu);
       while (true) {
          if (uByteArrayOu.toByteArray().length > p1) {
             uByteArrayOu.reset();
             i = i - 10;
             if (i <= p2) {
                break ;
             }else {
                p0.compress(Bitmap$CompressFormat.JPEG, i, uByteArrayOu);
             }
          }else {
             p2 = i;
             break ;
          }
       }
       p.d(uByteArrayOu);
       return p2;
    }
    public static int G(int p0){
       int i = 1;
       int i1 = i * 2;
       while (i1 <= p0) {
          i = i1;
       }
       return i;
    }
    public static Uri H(String p0,File p1,String p2){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("_display_name", p1.getName());
       uContentValu.put("mime_type", "image/"+p2);
       String separator = File.separator;
       uContentValu.put("relative_path", (Environment.DIRECTORY_DCIM+separator+(p1.getParent()).substring((Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()).length())).replace(separator+""+separator, separator));
       long l = System.currentTimeMillis();
       uContentValu.put("date_modified", Long.valueOf(l));
       uContentValu.put("date_added", Long.valueOf(l));
       uContentValu.put("datetaken", Long.valueOf(l));
       return a.b.g(p0, a.b().getContentResolver(), MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uContentValu).a();
    }
    public static boolean I(Bitmap p0){
       boolean b = (p0 != null && !p0.isRecycled())? true: false;
       return b;
    }
    public static void J(Bitmap p0){
       if (p0 != null && !p0.isRecycled()) {
          p0.recycle();
       }
       return;
    }
    public static void K(File p0,int p1){
       OutputStream outputStream;
       Throwable throwable;
       if (p0 == null || (!p0.exists() || (p0.canWrite() && p0.canRead()))) {
          long l = (long)p1;
          if (p0.length() - l > 0 && p1 > 0) {
             BitmapFactory$Options options = new BitmapFactory$Options();
             options.inJustDecodeBounds = true;
             Bitmap uBitmap = BitmapFactory.decodeFile(p0.getPath(), options);
             while (p0.length() - l > 0) {
                BitmapFactory$Options outWidth = (uBitmap == null)? options.outWidth: uBitmap.getWidth();
                BitmapFactory$Options outHeight = (uBitmap == null)? options.outHeight: uBitmap.getHeight();
                float f = (float)outWidth * 0x3f666666;
                float f1 = (float)outHeight * 0x3f666666;
                uBitmap = BitmapUtil.r(p0, (int)f, (int)f1, false);
                if (uBitmap == null) {
                   return;
                }else {
                   Bitmap$CompressFormat uCompressFor = null;
                   try{
                      try{
                         FileOutputStream uFileOutputS = new FileOutputStream(p0);
                         uBitmap.compress(Bitmap$CompressFormat.JPEG, 100, uFileOutputS);
                      label_0079 :
                         uBitmap.recycle();
                         p.d(outputStream);
                      }catch(java.lang.Exception e1){
                      }
                      ExceptionHandler.handleCaughtException(throwable);
                      goto label_0079 ;
                   }catch(java.lang.Exception e4){
                      outputStream = uCompressFor;
                      throwable = e4;
                      goto label_0076 ;
                   }
                }
             }
          }
       }
    label_0089 :
       return;
    }
    public static void L(File p0,int p1,int p2){
       FileOutputStream uFileOutputS;
       if (!p0.exists() || (p0.canWrite() && (!p0.canRead() || (p0.length() - (long)p1 > 0 && p1 > 0)))) {
          Bitmap uBitmap = BitmapFactory.decodeFile(p0.getPath());
          if (uBitmap != null) {
             p1 = BitmapUtil.F(uBitmap, p1, p2);
             if (p1 <= 100 && p1 >= 0) {
                p2 = 0;
                try{
                   try{
                      uFileOutputS = new FileOutputStream(p0);
                      uBitmap.compress(Bitmap$CompressFormat.JPEG, p1, uFileOutputS);
                      uBitmap.recycle();
                      p.d(uFileOutputS);
                   }catch(java.lang.Exception e5){
                      OutputStream outputStream = uFileOutputS;
                   }
                   ExceptionHandler.handleCaughtException(e5);
                   uBitmap.recycle();
                   p.d(p2);
                }catch(java.lang.Exception e5){
                   goto label_004f ;
                }
             }
          }
       }
    label_0061 :
       return;
    }
    public static File M(Bitmap p0,String p1,int p2){
       return BitmapUtil.N("post_album_tool", p0, p1, p2);
    }
    public static File N(String p0,Bitmap p1,String p2,int p3){
       Object[] objArray3;
       BufferedOutputStream uBufferedOut;
       File uFile = new File(p2);
       Object[] objArray = new Object[0];
       a.C().t("BitmapUtil", "saveBitmapFile "+p2+" "+uFile.getName(), objArray);
       if (Build$VERSION.SDK_INT >= 30 && ((uFile.getAbsolutePath()).startsWith(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()) && (p0 != null && !p0.isEmpty()))) {
          Uri uri = BitmapUtil.H(p0, uFile, "jpeg");
          a uoa = a.C();
          StringBuilder str = "insert is";
          String path = (uri != null)? uri.getPath(): null;
          Object[] objArray1 = new Object[0];
          uoa.t("BitmapUtil", str+path, objArray1);
          if (uri != null) {
             a.c(p1, uri, new a$d(Bitmap$CompressFormat.JPEG, p3));
             if (uFile.exists()) {
                return uFile;
             }else {
                objArray = new Object[0];
                a.C().t("BitmapUtil", "encode failed", objArray);
                c.a(uri);
             }
          }
       }
       try{
       label_009e :
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          try{
             uBufferedOut = new BufferedOutputStream(uFileOutputS);
             p1.compress(Bitmap$CompressFormat.JPEG, p3, uBufferedOut);
             uBufferedOut.flush();
             p.d(uBufferedOut);
          label_0130 :
             return uFile;
          }catch(java.io.IOException e10){
             OutputStream outputStream = uBufferedOut;
          }
          Object[] objArray2 = new Object[0];
          a.C().t("BitmapUtil", "Unexpected exception "+p2+", "+Log.f(e10), objArray2);
          File parentFile = new File(p2).getParentFile();
          if (parentFile == null) {
             objArray3 = new Object[0];
             a.C().t("BitmapUtil", "Not exists file parent "+p2, objArray3);
          }else {
             objArray3 = new Object[0];
             a.C().t("BitmapUtil", "Unexpected exception "+parentFile.exists()+", "+parentFile.canWrite(), objArray3);
          }
          p.d(0);
          goto label_0130 ;
       }catch(java.io.IOException e10){
          goto label_00bf ;
       }
    }
    public static File O(Bitmap p0,String p1,int p2){
       int i;
       if (p0.isRecycled()) {
          return null;
       }
       File uFile = new File(p1);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       p0.compress(Bitmap$CompressFormat.PNG, p2, uByteArrayOu);
       try{
          i = 0;
          BufferedInputStream uBufferedInp = new BufferedInputStream(new ByteArrayInputStream(uByteArrayOu.toByteArray()));
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(uFile));
          byte[] uobyteArray = new byte[1024];
          int i1 = uBufferedInp.read(uobyteArray);
          while (i1 != -1) {
             uBufferedOut.write(uobyteArray, i, i1);
             uBufferedOut.flush();
          }
          uBufferedOut.close();
          uBufferedInp.close();
          return uFile;
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[i];
          a.C().t("BitmapUtil", "Unexpected exception "+Log.f(e6), objArray);
          return null;
       }
    }
    public static void P(Context p0,Bitmap p1,String p2,int p3){
       Object[] objArray1;
       try{
          h.c(p0, p1, p2, p3);
          return;
       }catch(java.io.IOException e5){
          String str = "Unexpected exception ";
          Object[] objArray = new Object[0];
          a.C().t("BitmapUtil", str+p2+", "+Log.f(e5), objArray);
          File parentFile = new File(p2).getParentFile();
          if (parentFile == null) {
             objArray1 = new Object[0];
             a.C().t("BitmapUtil", "Not exists file parent "+p2, objArray1);
          }else {
             objArray1 = new Object[0];
             a.C().t("BitmapUtil", str+parentFile.exists()+", "+parentFile.canWrite(), objArray1);
          }
          throw e5;
       }
    }
    public static void Q(Bitmap p0,String p1,int p2){
       BitmapUtil.P(null, p0, p1, p2);
    }
    public static void R(Bitmap p0,String p1,int p2){
       try{
          BitmapUtil.Q(p0, p1, p2);
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static void S(Bitmap p0,String p1,int p2){
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       p0.compress(Bitmap$CompressFormat.JPEG, p2, uFileOutputS);
       p.d(uFileOutputS);
    }
    public static Bitmap T(Bitmap p0,int p1,int p2,Bitmap$Config p3){
       return BitmapUtil.U(p0, p1, p2, p3, true);
    }
    public static Bitmap U(Bitmap p0,int p1,int p2,Bitmap$Config p3,boolean p4){
       Bitmap uBitmap;
       if (p0 == null) {
          return null;
       }
       if (p3 == null) {
          p3 = p0.getConfig();
       }
       int i = 0;
       if (p1 != p0.getWidth() || p2 != p0.getHeight()) {
          uBitmap = Bitmap.createScaledBitmap(p0, p1, p2, true);
          if (p4) {
             p0.recycle();
          }
          p0 = uBitmap;
          i = 1;
       }
       if (!p0.isMutable() || !p0.getConfig().equals(p3)) {
          uBitmap = p0.copy(p3, true);
          if (i || p4) {
             p0.recycle();
          }
          p0 = uBitmap;
       }
       return p0;
    }
    public static Bitmap V(Bitmap p0,int p1,Bitmap$Config p2){
       if (p0 == null) {
          return null;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (p1 > 0 && (Math.max(width, height) > p1 || (p2 != null && !p0.getConfig().equals(p2)))) {
          if (p1 > 0 && (width > height && width > p1)) {
             height = (height * p1) / width;
          }else if(p1 > 0 && (height > width && height > p1)){
             width = (width * p1) / height;
             height = p1;
          }else if(p1 > 0 && (width == height && width > p1)){
             height = p1;
          }
          p1 = width;
          if (p1 != p0.getWidth() || height != p0.getHeight()) {
             p0 = Bitmap.createScaledBitmap(p0, p1, height, true);
          }
          if (p2 == null) {
             p2 = p0.getConfig();
          }
          if (!p0.isMutable() || !p0.getConfig().equals(p2)) {
             p0 = p0.copy(p2, true);
          }
       }
    label_006a :
       return p0;
    }
    public static Bitmap W(Bitmap p0,float p1){
       if (p0 == null) {
          return null;
       }
       Matrix matrix = new Matrix();
       matrix.preScale(p1, p1);
       Bitmap uBitmap = Bitmap.createBitmap(p0, 0, 0, p0.getWidth(), p0.getHeight(), matrix, false);
       if (uBitmap.equals(p0)) {
          return uBitmap;
       }
       p0.recycle();
       return uBitmap;
    }
    public static Bitmap a(String p0){
       return BitmapUtil.b(p0, 0);
    }
    public static Bitmap b(String p0,int p1){
       byte[] uobyteArray = Base64.decode(p0, p1);
       return BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length);
    }
    public static Bitmap c(String p0){
       Bitmap uBitmap;
       int i = 0;
       try{
          byte[] uobyteArray = Base64.decode(p0, i);
          uBitmap = BitmapFactory.decodeByteArray(uobyteArray, i, uobyteArray.length);
       }catch(java.lang.Exception e0){
          uBitmap = null;
       }
       return uBitmap;
    }
    public static String d(Bitmap p0){
       return BitmapUtil.e(p0, 2);
    }
    public static String e(Bitmap p0,int p1){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       p0.compress(Bitmap$CompressFormat.JPEG, 50, uByteArrayOu);
       return Base64.encodeToString(uByteArrayOu.toByteArray(), p1);
    }
    public static Bitmap f(View p0){
       return BitmapUtil.h(p0, Bitmap$Config.RGB_565);
    }
    public static Bitmap g(View p0,int p1,int p2,Bitmap$Config p3){
       if (p1 <= 0 || p2 <= 0) {
          return BitmapUtil.h(p0, p3);
       }
       p0.setDrawingCacheEnabled(true);
       p0.measure(View$MeasureSpec.makeMeasureSpec(p1, 0x40000000), View$MeasureSpec.makeMeasureSpec(p2, 0x40000000));
       p0.layout(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight());
       Bitmap drawingCache = p0.getDrawingCache();
       if (drawingCache == null) {
          drawingCache = BitmapUtil.i(p0, p3);
       }
       return drawingCache;
    }
    public static Bitmap h(View p0,Bitmap$Config p1){
       p0.setDrawingCacheEnabled(true);
       p0.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       p0.layout(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight());
       Bitmap drawingCache = p0.getDrawingCache();
       if (drawingCache == null) {
          drawingCache = BitmapUtil.i(p0, p1);
       }
       return drawingCache;
    }
    public static Bitmap i(View p0,Bitmap$Config p1){
       Bitmap uBitmap = Bitmap.createBitmap(p0.getMeasuredWidth(), p0.getMeasuredHeight(), p1);
       p0.layout(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight());
       p0.draw(new Canvas(uBitmap));
       return uBitmap;
    }
    public static Bitmap j(View p0){
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       if (!measuredWidt || !measuredHeig) {
          return null;
       }
       p0.setVisibility(0);
       Bitmap uBitmap = Bitmap.createBitmap(measuredWidt, measuredHeig, Bitmap$Config.ARGB_8888);
       p0.draw(new Canvas(uBitmap));
       p0.setVisibility(p0.getVisibility());
       return uBitmap;
    }
    public static Bitmap k(Bitmap p0){
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       int width = p0.getWidth();
       int height = p0.getHeight();
       Bitmap uBitmap = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       width = width / 2;
       float f = (float)width;
       height = height / 2;
       uCanvas.drawCircle(f, (float)height, (float)Math.min(width, height), paint);
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
       uCanvas.drawBitmap(p0, 0, 0, paint);
       return uBitmap;
    }
    public static Bitmap l(Bitmap p0,int p1,boolean p2,boolean p3,boolean p4,boolean p5){
       int i = p1;
       Bitmap uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       Paint paint = new Paint();
       int i1 = 0;
       Rect rect = new Rect(i1, i1, p0.getWidth(), p0.getHeight());
       float f = (float)i;
       paint.setAntiAlias(true);
       uCanvas.drawARGB(i1, i1, i1, i1);
       paint.setColor(-12434878);
       uCanvas.drawRoundRect(new RectF(rect), f, f, paint);
       if (!p2) {
          uCanvas.drawRect(0, 0, (float)(p0.getWidth() - i), (float)(p0.getHeight() - i), paint);
       }
       if (!p3) {
          uCanvas.drawRect(f, 0, (float)p0.getWidth(), (float)(p0.getHeight() - i), paint);
       }
       if (!p4) {
          uCanvas.drawRect(0, f, (float)(p0.getWidth() - i), (float)p0.getHeight(), paint);
       }
       if (!p5) {
          uCanvas.drawRect(f, f, (float)p0.getWidth(), (float)p0.getHeight(), paint);
       }
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
       uCanvas.drawBitmap(p0, rect, rect, paint);
       return uBitmap;
    }
    public static Bitmap m(String p0,int p1){
       return BitmapUtil.n(p0, p1, -1);
    }
    public static Bitmap n(String p0,int p1,long p2){
       int i;
       Bitmap frameAtTime;
       int i1;
       int height;
       float f;
       float f1;
       Bitmap uBitmap1;
       MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
       Bitmap uBitmap = null;
       try{
          i = 0;
          mediaMetadat.setDataSource(p0);
          frameAtTime = mediaMetadat.getFrameAtTime(p2);
          try{
             mediaMetadat.release();
          }catch(java.lang.RuntimeException e6){
             Object[] objArray1 = new Object[i];
             a.C().u("system_thumbnail", e6, objArray1);
          }
       }catch(java.lang.IllegalArgumentException e4){
          a uoa = a.C();
          Object[] objArray = new Object[i];
          try{
             uoa.u("system_thumbnail", e4, objArray);
             mediaMetadat.release();
          }catch(java.lang.RuntimeException e4){
             objArray = new Object[i];
             a.C().u("system_thumbnail", e4, objArray);
          }
       }catch(java.lang.RuntimeException e4){
          try{
             uoa = a.C();
             objArray = new Object[i];
             uoa.u("system_thumbnail", e4, objArray);
             mediaMetadat.release();
          }catch(java.lang.RuntimeException e4){
             objArray = new Object[i];
             a.C().u("system_thumbnail", e4, objArray);
          }
       }
       frameAtTime = uBitmap;
    }
    public static Bitmap o(Bitmap p0,int p1,int p2){
       return BitmapUtil.p(p0, p1, p2, BitmapUtil$BitmapCropMode.CENTER);
    }
    public static Bitmap p(Bitmap p0,int p1,int p2,BitmapUtil$BitmapCropMode p3){
       int i2;
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (width == p1 && height == p2) {
          return p0.copy(p0.getConfig(), true);
       }
       Bitmap$Config aRGB_8888 = (p0.getConfig() == null)? Bitmap$Config.ARGB_8888: p0.getConfig();
       Bitmap uBitmap = Bitmap.createBitmap(p1, p2, aRGB_8888);
       Bitmap uBitmap1 = null;
       if (uBitmap == null) {
          return uBitmap1;
       }else {
          Canvas uCanvas = new Canvas(uBitmap);
          int i = width * p2;
          int i1 = height * p1;
          if (i > i1) {
             i1 = i1 / p2;
             i2 = BitmapUtil$a.a[p3.ordinal()];
             if (i2 != 1) {
                if (i2 != 2) {
                   if (i2 == 3) {
                      uBitmap1 = new Rect((width - i1), 0, width, height);
                   }
                }else {
                   uBitmap1 = new Rect(((width - i1) / 2), 0, ((width + i1) / 2), height);
                }
             }else {
                uBitmap1 = new Rect(0, 0, i1, height);
             }
          }else if(i < i1){
             i = i / p1;
             i2 = BitmapUtil$a.a[p3.ordinal()];
             if (i2 != 1) {
                if (i2 != 2) {
                   if (i2 == 3) {
                      uBitmap1 = new Rect(0, (height - i), width, height);
                   }
                }else {
                   uBitmap1 = new Rect(0, ((height - i) / 2), width, ((height + i) / 2));
                }
             }else {
                uBitmap1 = new Rect(0, 0, width, i);
             }
          }
          uCanvas.drawBitmap(p0, uBitmap1, new Rect(0, 0, p1, p2), BitmapUtil.a);
          return uBitmap;
       }
    }
    public static Bitmap q(File p0){
       return BitmapUtil.s(p0.getAbsolutePath());
    }
    public static Bitmap r(File p0,int p1,int p2,boolean p3){
       return BitmapUtil.t(p0.getAbsolutePath(), p1, p2, p3);
    }
    public static Bitmap s(String p0){
       return BitmapUtil.t(p0, 0, 0, 0);
    }
    public static Bitmap t(String p0,int p1,int p2,boolean p3){
       return BitmapUtil.u(p0, p1, p2, p3, -1, -1, false);
    }
    public static Bitmap u(String p0,int p1,int p2,boolean p3,int p4,int p5,boolean p6){
       return BitmapUtil.v(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static Bitmap v(String p0,int p1,int p2,boolean p3,int p4,int p5,boolean p6,boolean p7){
       b0 a;
       Object[] objArray5;
       int i = p1;
       int i1 = p2;
       boolean b = p3;
       int i2 = p4;
       int i3 = p5;
       boolean b1 = p6;
       int b2 = p7;
       Object[] objArray = new Object[0];
       a.C().w("BitmapUtil", "decodeFile file:"+p0+",maxWidth:"+i+",maxHeight:"+i1+",forceSize:"+b+",inTargetDensity:"+i2+",inDensity:"+i3+",preferredP3:"+b1+",inMutable:"+b2, objArray);
       Bitmap uBitmap = null;
       if (!p0 || !new File(p0).exists()) {
          Object[] objArray1 = new Object[0];
          a.C().w("BitmapUtil", "file is null or not exist ", objArray1);
       }else if(i3.c().matcher(p0).matches() || i3.b().matcher(p0).matches()){
          Object[] objArray2 = new Object[0];
          a.C().w("BitmapUtil", "file is video", objArray2);
          return c.k(new File(p0), Math.min(p1, p2));
       }else {
          b0 uob0 = BitmapUtil.E(p0);
          BitmapFactory$Options options = new BitmapFactory$Options();
          if (b2) {
             options.inMutable = b2;
          }
          if (i > 0 && i1 > 0) {
             a = uob0.a;
             if (a > i || uob0.b > i1) {
                b2 = (b)? Math.min((a / i), (uob0.b / i1)): Math.max((a / i), (uob0.b / i1));
                options.inSampleSize = BitmapUtil.G(b2);
             }
          }
          if (i2 > 0 && i3 > 0) {
             options.inTargetDensity = i2;
             options.inDensity = i3;
          }
          String str = " size=";
          if (b1 && Build$VERSION.SDK_INT >= 26) {
             options.inPreferredColorSpace = ColorSpace.get(ColorSpace$Named.SRGB);
          }
          Object[] objArray3 = new Object[0];
          a.C().w("BitmapUtil", "file decode dim:"+uob0+",inSampleSize:"+options.inSampleSize+",fileExist:"+new File(p0).exists(), objArray3);
          Bitmap uBitmap1 = BitmapFactory.decodeFile(p0, options);
          if (uBitmap1 == null) {
             Object[] objArray4 = new Object[0];
             a.C().t("BitmapUtil", "decodeFile failed file: "+p0+str+new File(p0).length(), objArray4);
          }
          if (uBitmap1 == null) {
             objArray5 = new Object[0];
             a.C().w("BitmapUtil", "getBitmap is null file="+p0+str+new File(p0).length(), objArray5);
             return uBitmap;
          }else {
             Bitmap uBitmap2 = BitmapUtil.D(p0, uBitmap1);
             if (i > 0 && i1 > 0) {
                int width = uBitmap2.getWidth();
                i3 = uBitmap2.getHeight();
                if (b) {
                   if (width != i || i3 != i1) {
                      uBitmap2 = Bitmap.createScaledBitmap(uBitmap2, i, i1, true);
                   }
                }else if(width > i || i3 > i1){
                   Rect rect = b0.a((long)width, (long)i3, (long)i, (long)i1);
                   i = rect.width();
                   width = rect.height();
                   if (i <= 0 || width <= 0) {
                      objArray5 = new Object[0];
                      a.C().t("BitmapUtil", "getRectWithRatioKept returns wrong dst size:  dstWidth"+i+" dstHeight"+width, objArray5);
                   }else {
                      uBitmap2 = Bitmap.createScaledBitmap(uBitmap2, i, width, true);
                   }
                }
             }
             return uBitmap2;
          }
       }
       return null;
    }
    public static Bitmap w(String p0,int p1,int p2,boolean p3,boolean p4){
       return BitmapUtil.u(p0, p1, p2, p3, -1, -1, p4);
    }
    public static Bitmap x(String p0,int p1,int p2,boolean p3,boolean p4,boolean p5){
       return BitmapUtil.v(p0, p1, p2, p3, -1, -1, p4, p5);
    }
    public static Bitmap y(String p0,BitmapUtil$b p1){
       int i;
       BitmapUtil$b c;
       Bitmap uBitmap = null;
       if (p0 == null || !new File(p0).exists()) {
          return uBitmap;
       }
       if (v5.c().matcher(p0).matches() || v5.b().matcher(p0).matches()) {
          return c.k(new File(p0), Math.min(p1.a, p1.b));
       }
       b0 uob0 = BitmapUtil.E(p0);
       BitmapFactory$Options options = new BitmapFactory$Options();
       if (p1.d != null) {
          options.inMutable = true;
       }
       BitmapUtil$b a = p1.a;
       if (a > null) {
          BitmapUtil$b b = p1.b;
          if (b > null) {
             b0 a1 = uob0.a;
             if (a1 > a || uob0.b > b) {
                i = (p1.c != true)? Math.min((a1 / a), (uob0.b / b)): Math.max((a1 / a), (uob0.b / b));
                options.inSampleSize = BitmapUtil.G(i);
             }
          }
       }
       BitmapUtil$b e = p1.e;
       if (e > null) {
          a = p1.f;
          if (a > null) {
             options.inTargetDensity = e;
             options.inDensity = a;
          }
       }
       if (p1.g != null && Build$VERSION.SDK_INT >= 26) {
          options.inPreferredColorSpace = ColorSpace.get(ColorSpace$Named.SRGB);
       }
       Bitmap uBitmap1 = BitmapFactory.decodeFile(p0, options);
       if (uBitmap1 == null) {
          return uBitmap;
       }else {
          Bitmap uBitmap2 = BitmapUtil.D(p0, uBitmap1);
          if (p1.a > null && p1.b > null) {
             int width = uBitmap2.getWidth();
             i = uBitmap2.getHeight();
             c = p1.c;
             if (c != true) {
                if (c != 3) {
                   if (c == 4) {
                      c = p1.a;
                      if (width != c || i != p1.b) {
                         uBitmap2 = BitmapUtil.p(uBitmap2, c, p1.b, BitmapUtil$BitmapCropMode.CENTER);
                      }
                   }
                }else {
                   c = p1.a;
                   if (width != c || i != p1.b) {
                      uBitmap2 = Bitmap.createScaledBitmap(uBitmap2, c, p1.b, true);
                   }
                }
             }else {
                c = p1.a;
                if (width > c || i > p1.b) {
                   Rect rect = b0.a((long)width, (long)i, (long)c, (long)p1.b);
                   width = rect.width();
                   uBitmap2 = Bitmap.createScaledBitmap(uBitmap2, width, rect.height(), true);
                }
             }
          }
          return uBitmap2;
       }
    }
    public static Bitmap z(String p0,boolean p1,boolean p2){
       return BitmapUtil.v(p0, 0, 0, false, -1, -1, p1, p2);
    }
}
