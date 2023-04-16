package com.kwai.video.videoprocessor.JpegBuilder;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import rg.d;
import java.lang.System;
import android.os.Handler;
import android.os.Looper;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Bitmap$Config;
import android.os.Build$VERSION;
import android.os.Environment;
import java.io.File;
import android.os.ParcelFileDescriptor;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.kwai.video.videoprocessor.JpegBuilderException;
import com.kwai.video.videoprocessor.logger.EditorSdkLogger;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;
import android.provider.MediaStore$Images$Media;
import android.content.ContentValues;
import java.lang.Long;
import android.content.ContentResolver;
import android.net.Uri;
import com.kwai.video.videoprocessor.JpegBuilder$2;
import java.lang.Runnable;
import java.lang.Double;
import com.kwai.video.videoprocessor.JpegBuilder$1;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;

public class JpegBuilder	// class@000c8f
{
    public boolean mCancelled;
    public final Handler mHandler;
    public JpegBuilderEventListener mListener;
    public long mNativeAddress;

    public void JpegBuilder(Context p0){
       super();
       this.mNativeAddress = 0;
       this.mListener = null;
       this.mCancelled = false;
       String str = "ksvideoprocessor";
       if (p0 != null) {
          d.a(p0, str);
       }else {
          System.loadLibrary(str);
       }
       this.mHandler = new Handler(p0.getApplicationContext().getMainLooper());
       return;
    }
    public static native int compressBitmapNative(Bitmap p0,int p1,int p2,int p3,String p4,boolean p5);
    public static void compressBitmapToJpeg(Context p0,Bitmap p1,int p2,int p3,int p4,String p5,boolean p6){
       JpegBuilder jpegBuilder = JpegBuilder.class;
       ParcelFileDescriptor parcelFileDe = null;
       if (PatchProxy.isSupport(jpegBuilder)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, parcelFileDe, jpegBuilder, "7")) {
             return;
          }
       }
       String str = "ksvideoprocessor";
       if (p0 != null) {
          d.a(p0, str);
       }else {
          System.loadLibrary(str);
       }
       if (p1 != null) {
          if (p2 > 0) {
             if (p3 > 0) {
                if (!TextUtils.isEmpty(p5)) {
                   try{
                      Bitmap uBitmap = JpegBuilder.convertBitmap(p1, p2, p3, Bitmap$Config.ARGB_8888);
                      if (p0 != null && (Build$VERSION.SDK_INT >= 30 && p5.startsWith(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()))) {
                         parcelFileDe = JpegBuilder.generatePfdThroughDCIMUri(p0, p5);
                         if (parcelFileDe != null) {
                            try{
                               p5 = "generatePfdThroughDCIMUri"+String.valueOf(parcelFileDe.detachFd());
                            }catch(java.lang.Exception e9){
                               e9.printStackTrace();
                               throw new JpegBuilderException("generatePfdThroughDCIMUri Failed");
                            }
                         }
                      }
                      int i = JpegBuilder.compressBitmapNative(uBitmap, p2, p3, p4, p5, p6);
                      if (parcelFileDe != null) {
                         try{
                            parcelFileDe.close();
                         }catch(java.lang.Exception e10){
                            e10.printStackTrace();
                         }
                      }
                   }catch(java.lang.OutOfMemoryError e0){
                      EditorSdkLogger.e(e0, "compressBitmapToJpeg, convertBitmap error");
                      throw new JpegBuilderException(-30001);
                   }
                }else {
                   EditorSdkLogger.e("JpegBuilder", "compressBitmapToJpeg, Empty filename");
                   throw new JpegBuilderException("Empty filename");
                }
             }else {
                EditorSdkLogger.e("JpegBuilder", "compressBitmapToJpeg, height <= 0");
                throw new JpegBuilderException("Height <= 0");
             }
          }else {
             EditorSdkLogger.e("JpegBuilder", "compressBitmapToJpeg, Width <= 0");
             throw new JpegBuilderException("Width <= 0");
          }
       }else {
          EditorSdkLogger.e("JpegBuilder", "compressBitmapToJpeg, Bitmap is null");
          throw new JpegBuilderException("Bitmap is null");
       }
    }
    public static void compressBitmapToJpeg(Bitmap p0,int p1,int p2,int p3,String p4,boolean p5){
       JpegBuilder jpegBuilder = JpegBuilder.class;
       if (PatchProxy.isSupport(jpegBuilder)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, jpegBuilder, "8")) {
             return;
          }
       }
       JpegBuilder.compressBitmapToJpeg(null, p0, p1, p2, p3, p4, p5);
       return;
    }
    public static Bitmap convertBitmap(Bitmap p0,int p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(JpegBuilder.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, JpegBuilder.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else if(p0.getWidth() == p1 && (p0.getHeight() == p2 && p0.getConfig() == p3)){
          return p0;
       }else {
          Bitmap uBitmap = Bitmap.createBitmap(p1, p2, p3);
          new Canvas(uBitmap).drawBitmap(p0, null, new Rect(0, 0, p1, p2), null);
          return uBitmap;
       }
    }
    public static ParcelFileDescriptor generatePfdThroughDCIMUri(Context p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, JpegBuilder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = File.separator;
          String str = p1.substring((p1.lastIndexOf(obj) + obj.length()));
          String str1 = str.substring((str.lastIndexOf(".") + 1));
          p1 = p1.substring(0, ((p1.length() - str.length()) - obj.length()));
          int i = p1.lastIndexOf(obj);
          ContentValues uContentValu = new ContentValues();
          uContentValu.put("_display_name", str);
          uContentValu.put("mime_type", "image/"+str1);
          uContentValu.put("relative_path", "DCIM/"+p1.substring((i + obj.length())));
          long l = System.currentTimeMillis();
          uContentValu.put("date_modified", Long.valueOf(l));
          uContentValu.put("date_added", Long.valueOf(l));
          uContentValu.put("datetaken", Long.valueOf(l));
          return p0.getContentResolver().openFileDescriptor(p0.getContentResolver().insert(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uContentValu), "w");
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          return v1;
       }
    }
    public static native long newNativeJpegBuilder();
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, JpegBuilder.class, "3")) {
          return;
       }
       _monitor_enter(this);
       this.mCancelled = true;
       if (this.mNativeAddress) {
          this.cancelBuildNative(this.mNativeAddress);
       }
       _monitor_exit(this);
       return;
    }
    public native final void cancelBuildNative(long p0);
    public native void deleteNativeJpegBuilder(long p0);
    public boolean isCancelled(){
       _monitor_enter(this);
       _monitor_exit(this);
       return this.mCancelled;
    }
    public final void onFinished(int p0){
       JpegBuilder jpegBuilder = JpegBuilder.class;
       if (PatchProxy.isSupport(jpegBuilder) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, jpegBuilder, "5")) {
          return;
       }
       this.mHandler.post(new JpegBuilder$2(this, p0));
       return;
    }
    public final void onProgress(double p0){
       JpegBuilder jpegBuilder = JpegBuilder.class;
       if (PatchProxy.isSupport(jpegBuilder) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, jpegBuilder, "4")) {
          return;
       }
       this.mHandler.post(new JpegBuilder$1(this, p0));
       return;
    }
    public void startBuild(String[] p0,String p1,int p2,int p3,JpegBuilderEventListener p4){
       JpegBuilder jpegBuilder = JpegBuilder.class;
       if (PatchProxy.isSupport(jpegBuilder)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, jpegBuilder, "2")) {
             return;
          }
       }
       _monitor_enter(this);
       if (this.mNativeAddress) {
          EditorSdkLogger.e("JpegBuilder", "Already started, check your codes!!!!!");
          _monitor_exit(this);
          return;
       }else {
          this.mNativeAddress = JpegBuilder.newNativeJpegBuilder();
          this.mListener = p4;
          _monitor_exit(this);
          this.startBuildNative(this.mNativeAddress, p0, p1, p2, p3);
          return;
       }
    }
    public void startBuild(String[] p0,String p1,int p2,JpegBuilderEventListener p3){
       if (PatchProxy.isSupport(JpegBuilder.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, JpegBuilder.class, "1")) {
          return;
       }
       this.startBuild(p0, p1, p2, 90, p3);
       return;
    }
    public native final void startBuildNative(long p0,String[] p1,String p2,int p3,int p4);
}
