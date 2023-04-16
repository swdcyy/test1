package com.facebook.webpsupport.WebpBitmapFactoryImpl;
import jb.b;
import java.lang.Object;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import jb.a;
import java.io.InputStream;
import java.lang.String;
import jb.b$a;
import fd.d;
import jb.c;
import java.io.FileInputStream;
import android.graphics.Rect;
import java.lang.Throwable;
import java.io.FileDescriptor;
import android.content.res.Resources;
import android.util.TypedValue;
import java.lang.IllegalArgumentException;
import android.util.DisplayMetrics;
import cw9.c;
import java.io.BufferedInputStream;
import android.graphics.BitmapFactory;

public class WebpBitmapFactoryImpl implements b	// class@001450
{
    public static final boolean a;
    public static b$a b;
    public static a c;

    static {
       WebpBitmapFactoryImpl.a = true;
    }
    public void WebpBitmapFactoryImpl(){
       super();
    }
    public static Bitmap createBitmap(int p0,int p1,BitmapFactory$Options p2){
       if (WebpBitmapFactoryImpl.a && p2 != null) {
          BitmapFactory$Options inBitmap = p2.inBitmap;
          if (inBitmap != null && inBitmap.isMutable()) {
             return p2.inBitmap;
          }
       }
       return WebpBitmapFactoryImpl.c.a(p0, p1, Bitmap$Config.ARGB_8888);
    }
    public static byte[] g(InputStream p0,BitmapFactory$Options p1){
       p0.mark(20);
       if (p1 != null) {
          p1 = p1.inTempStorage;
          if (p1 != null && p1.length >= 20) {
          label_0011 :
             int i = 0;
             try{
                p0.read(p1, i, 20);
                p0.reset();
                return p1;
             }catch(java.io.IOException e0){
                return null;
             }
          }
       }
       byte[] uobyteArray = new byte[20];
       goto label_0011 ;
    }
    public static byte[] getInTempStorageFromOptions(BitmapFactory$Options p0){
       if (p0 != null) {
          p0 = p0.inTempStorage;
          if (p0 != null) {
             return p0;
          }
       }
       byte[] uobyteArray = new byte[8192];
       return uobyteArray;
    }
    public static float getScaleFromOptions(BitmapFactory$Options p0){
       float f = 0x3f800000;
       if (p0 != null) {
          BitmapFactory$Options inSampleSize = p0.inSampleSize;
          if (inSampleSize > 1) {
             f = f / (float)inSampleSize;
          }
          if (p0.inScaled != null) {
             inSampleSize = p0.inDensity;
             BitmapFactory$Options inTargetDens = p0.inTargetDensity;
             p0 = p0.inScreenDensity;
             if (inSampleSize != null && (inTargetDens != null && inSampleSize != p0)) {
                f = (float)inTargetDens / (float)inSampleSize;
             }
          }
       }
    label_001f :
       return f;
    }
    public static void h(String p0){
       b$a b = WebpBitmapFactoryImpl.b;
       if (b != null) {
          b.a(p0, "decoding_failure");
       }
       return;
    }
    public static Bitmap hookDecodeByteArray(byte[] p0,int p1,int p2){
       return WebpBitmapFactoryImpl.hookDecodeByteArray(p0, p1, p2, null);
    }
    public static Bitmap hookDecodeByteArray(byte[] p0,int p1,int p2,BitmapFactory$Options p3){
       Bitmap uBitmap;
       d.a();
       if (c.a && c.b(p0, p1, p2)) {
          uBitmap = WebpBitmapFactoryImpl.nativeDecodeByteArray(p0, p1, p2, p3, WebpBitmapFactoryImpl.getScaleFromOptions(p3), WebpBitmapFactoryImpl.getInTempStorageFromOptions(p3));
          if (uBitmap == null) {
             WebpBitmapFactoryImpl.h("webp_direct_decode_array");
          }
          WebpBitmapFactoryImpl.i(uBitmap, p3);
       }else {
          uBitmap = WebpBitmapFactoryImpl.originalDecodeByteArray(p0, p1, p2, p3);
          if (uBitmap == null) {
             WebpBitmapFactoryImpl.h("webp_direct_decode_array_failed_on_no_webp");
          }
       }
       return uBitmap;
    }
    public static Bitmap hookDecodeFile(String p0){
       return WebpBitmapFactoryImpl.hookDecodeFile(p0, null);
    }
    public static Bitmap hookDecodeFile(String p0,BitmapFactory$Options p1){
       Rect rect = null;
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          Bitmap uBitmap = WebpBitmapFactoryImpl.hookDecodeStream(uFileInputSt, rect, p1);
          uFileInputSt.close();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor p0){
       return WebpBitmapFactoryImpl.hookDecodeFileDescriptor(p0, null, null);
    }
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor p0,Rect p1,BitmapFactory$Options p2){
       Bitmap uBitmap;
       d.a();
       boolean b = false;
       long l = WebpBitmapFactoryImpl.nativeSeek(p0, 0, b);
       if (l - -1) {
          InputStream inputStream = WebpBitmapFactoryImpl.j(new FileInputStream(p0));
          byte[] uobyteArray = WebpBitmapFactoryImpl.g(inputStream, p2);
          if (c.a && (uobyteArray != null && c.b(uobyteArray, b, 20))) {
             uBitmap = WebpBitmapFactoryImpl.nativeDecodeStream(inputStream, p2, WebpBitmapFactoryImpl.getScaleFromOptions(p2), WebpBitmapFactoryImpl.getInTempStorageFromOptions(p2));
             if (uBitmap == null) {
                WebpBitmapFactoryImpl.h("webp_direct_decode_fd");
             }
             WebpBitmapFactoryImpl.setPaddingDefaultValues(p1);
             WebpBitmapFactoryImpl.i(uBitmap, p2);
          }else {
             WebpBitmapFactoryImpl.nativeSeek(p0, l, true);
             uBitmap = WebpBitmapFactoryImpl.originalDecodeFileDescriptor(p0, p1, p2);
             if (uBitmap == null) {
                WebpBitmapFactoryImpl.h("webp_direct_decode_fd_failed_on_no_webp");
             }
          }
          inputStream.close();
       }else {
          uBitmap = WebpBitmapFactoryImpl.hookDecodeStream(new FileInputStream(p0), p1, p2);
          WebpBitmapFactoryImpl.setPaddingDefaultValues(p1);
       }
       return uBitmap;
    }
    public static Bitmap hookDecodeResource(Resources p0,int p1){
       return WebpBitmapFactoryImpl.hookDecodeResource(p0, p1, null);
    }
    public static Bitmap hookDecodeResource(Resources p0,int p1,BitmapFactory$Options p2){
       Bitmap uBitmap;
       TypedValue typedValue = new TypedValue();
       try{
          int i = 0;
          InputStream inputStream = p0.openRawResource(p1, typedValue);
          uBitmap = WebpBitmapFactoryImpl.hookDecodeResourceStream(p0, typedValue, inputStream, i, p2);
          if (inputStream != null) {
             inputStream.close();
          }
       }catch(java.lang.Exception e0){
       }
       if (WebpBitmapFactoryImpl.a && (uBitmap == null && (p2 == null || p2.inBitmap == null))) {
          return uBitmap;
       }else {
          throw new IllegalArgumentException("Problem decoding into existing bitmap");
       }
    }
    public static Bitmap hookDecodeResourceStream(Resources p0,TypedValue p1,InputStream p2,Rect p3,BitmapFactory$Options p4){
       if (p4 == null) {
          p4 = new BitmapFactory$Options();
       }
       if (p4.inDensity == null && p1 != null) {
          p1 = p1.density;
          if (p1 == null) {
             p4.inDensity = 160;
          }else if(p1 != 0xffff){
             p4.inDensity = p1;
          }
       }
       if (p4.inTargetDensity == null && p0 != null) {
          p4.inTargetDensity = c.c(p0).densityDpi;
       }
       return WebpBitmapFactoryImpl.hookDecodeStream(p2, p3, p4);
    }
    public static Bitmap hookDecodeStream(InputStream p0){
       return WebpBitmapFactoryImpl.hookDecodeStream(p0, null, null);
    }
    public static Bitmap hookDecodeStream(InputStream p0,Rect p1,BitmapFactory$Options p2){
       Bitmap uBitmap;
       d.a();
       p0 = WebpBitmapFactoryImpl.j(p0);
       byte[] uobyteArray = WebpBitmapFactoryImpl.g(p0, p2);
       if (c.a && (uobyteArray != null && c.b(uobyteArray, 0, 20))) {
          uBitmap = WebpBitmapFactoryImpl.nativeDecodeStream(p0, p2, WebpBitmapFactoryImpl.getScaleFromOptions(p2), WebpBitmapFactoryImpl.getInTempStorageFromOptions(p2));
          if (uBitmap == null) {
             WebpBitmapFactoryImpl.h("webp_direct_decode_stream");
          }
          WebpBitmapFactoryImpl.i(uBitmap, p2);
          WebpBitmapFactoryImpl.setPaddingDefaultValues(p1);
       }else {
          uBitmap = WebpBitmapFactoryImpl.originalDecodeStream(p0, p1, p2);
          if (uBitmap == null) {
             WebpBitmapFactoryImpl.h("webp_direct_decode_stream_failed_on_no_webp");
          }
       }
       return uBitmap;
    }
    public static void i(Bitmap p0,BitmapFactory$Options p1){
       if (p0 != null && p1 != null) {
          BitmapFactory$Options inDensity = p1.inDensity;
          if (inDensity != null) {
             p0.setDensity(inDensity);
             BitmapFactory$Options inTargetDens = p1.inTargetDensity;
             if (inTargetDens != null && (inDensity == inTargetDens || (inDensity != p1.inScreenDensity && p1.inScaled != null))) {
                p0.setDensity(inTargetDens);
             }
          }else if(WebpBitmapFactoryImpl.a && p1.inBitmap != null){
             p0.setDensity(160);
          }
       }
       if (p1 != null) {
          p1.outMimeType = "image/webp";
       }
       return;
    }
    public static InputStream j(InputStream p0){
       BufferedInputStream uBufferedInp;
       if (!p0.markSupported()) {
          uBufferedInp = new BufferedInputStream(p0, 20);
       }
       return uBufferedInp;
    }
    public static native Bitmap nativeDecodeByteArray(byte[] p0,int p1,int p2,BitmapFactory$Options p3,float p4,byte[] p5);
    public static native Bitmap nativeDecodeStream(InputStream p0,BitmapFactory$Options p1,float p2,byte[] p3);
    public static native long nativeSeek(FileDescriptor p0,long p1,boolean p2);
    public static Bitmap originalDecodeByteArray(byte[] p0,int p1,int p2){
       return BitmapFactory.decodeByteArray(p0, p1, p2);
    }
    public static Bitmap originalDecodeByteArray(byte[] p0,int p1,int p2,BitmapFactory$Options p3){
       return BitmapFactory.decodeByteArray(p0, p1, p2, p3);
    }
    public static Bitmap originalDecodeFile(String p0){
       return BitmapFactory.decodeFile(p0);
    }
    public static Bitmap originalDecodeFile(String p0,BitmapFactory$Options p1){
       return BitmapFactory.decodeFile(p0, p1);
    }
    public static Bitmap originalDecodeFileDescriptor(FileDescriptor p0){
       return BitmapFactory.decodeFileDescriptor(p0);
    }
    public static Bitmap originalDecodeFileDescriptor(FileDescriptor p0,Rect p1,BitmapFactory$Options p2){
       return BitmapFactory.decodeFileDescriptor(p0, p1, p2);
    }
    public static Bitmap originalDecodeResource(Resources p0,int p1){
       return BitmapFactory.decodeResource(p0, p1);
    }
    public static Bitmap originalDecodeResource(Resources p0,int p1,BitmapFactory$Options p2){
       return BitmapFactory.decodeResource(p0, p1, p2);
    }
    public static Bitmap originalDecodeResourceStream(Resources p0,TypedValue p1,InputStream p2,Rect p3,BitmapFactory$Options p4){
       return BitmapFactory.decodeResourceStream(p0, p1, p2, p3, p4);
    }
    public static Bitmap originalDecodeStream(InputStream p0){
       return BitmapFactory.decodeStream(p0);
    }
    public static Bitmap originalDecodeStream(InputStream p0,Rect p1,BitmapFactory$Options p2){
       return BitmapFactory.decodeStream(p0, p1, p2);
    }
    public static void setBitmapSize(BitmapFactory$Options p0,int p1,int p2){
       if (p0 != null) {
          p0.outWidth = p1;
          p0.outHeight = p2;
       }
       return;
    }
    public static boolean setOutDimensions(BitmapFactory$Options p0,int p1,int p2){
       if (p0 == null || p0.inJustDecodeBounds == null) {
          return false;
       }
       p0.outWidth = p1;
       p0.outHeight = p2;
       return true;
    }
    public static void setPaddingDefaultValues(Rect p0){
       if (p0 != null) {
          p0.top = -1;
          p0.left = -1;
          p0.bottom = -1;
          p0.right = -1;
       }
       return;
    }
    public static boolean shouldPremultiply(BitmapFactory$Options p0){
       if (p0 != null) {
          return p0.inPremultiplied;
       }
       return true;
    }
    public Bitmap a(InputStream p0,Rect p1,BitmapFactory$Options p2){
       return WebpBitmapFactoryImpl.hookDecodeStream(p0, p1, p2);
    }
    public Bitmap b(FileDescriptor p0,Rect p1,BitmapFactory$Options p2){
       return WebpBitmapFactoryImpl.hookDecodeFileDescriptor(p0, p1, p2);
    }
    public void c(b$a p0){
       WebpBitmapFactoryImpl.b = p0;
    }
    public void d(a p0){
       WebpBitmapFactoryImpl.c = p0;
    }
    public Bitmap e(String p0,BitmapFactory$Options p1){
       return WebpBitmapFactoryImpl.hookDecodeFile(p0, p1);
    }
    public Bitmap f(byte[] p0,int p1,int p2,BitmapFactory$Options p3){
       return WebpBitmapFactoryImpl.hookDecodeByteArray(p0, p1, p2, p3);
    }
}
