package com.tencent.connect.share.a;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.BitmapFactory;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.graphics.Bitmap$Config;
import java.io.File;
import java.lang.StringBuffer;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.content.Context;
import com.tencent.open.utils.d;
import com.tencent.open.utils.k;
import com.tencent.connect.share.a$1;
import android.os.Looper;
import java.lang.Thread;
import com.tencent.connect.share.a$2;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.Math;
import java.lang.StringBuilder;

public class a	// class@000e54
{

    public static final int a(BitmapFactory$Options p0,int p1,int p2){
       int i = a.b(p0, p1, p2);
       p1 = 8;
       if (i <= p1) {
          p1 = 1;
          while (p1 < i) {
             p1 = p1 << 1;
          }
       }else {
          p1 = ((i + 7) / p1) * 8;
       }
       return p1;
    }
    public static Bitmap a(Bitmap p0,int p1){
       Matrix matrix = new Matrix();
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (width > height) {
       }else {
          width = height;
       }
       matrix.postScale(((float)p1 / (float)width), ((float)p1 / (float)width));
       return Bitmap.createBitmap(p0, 0, 0, p0.getWidth(), p0.getHeight(), matrix, true);
    }
    public static final Bitmap a(String p0,int p1){
       Bitmap uBitmap;
       String str = "openSDK_LOG.AsynScaleCompressImage";
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       boolean b = true;
       try{
          options.inJustDecodeBounds = b;
          BitmapFactory.decodeFile(p0, options);
       }catch(java.lang.OutOfMemoryError e3){
          SLog.e(str, "scaleBitmap exception1:", e3);
       }
       BitmapFactory$Options outWidth = options.outWidth;
       BitmapFactory$Options outHeight = options.outHeight;
       if (options.mCancel == null && (outWidth == -1 || outHeight == -1)) {
          return null;
       }
       if (outWidth <= outHeight) {
          outWidth = outHeight;
       }
       options.inPreferredConfig = Bitmap$Config.RGB_565;
       if (outWidth > p1) {
          options.inSampleSize = a.a(options, -1, (p1 * p1));
       }
       options.inJustDecodeBounds = false;
       try{
          uBitmap = BitmapFactory.decodeFile(p0, options);
       label_0052 :
          if (uBitmap == null) {
             SLog.e(str, "scaleBitmap return null");
             return null;
          }else {
             BitmapFactory$Options outWidth1 = options.outWidth;
             options = options.outHeight;
             if (outWidth1 <= options) {
                outWidth1 = options;
             }
             if (outWidth1 > p1) {
                uBitmap = a.a(uBitmap, p1);
             }
             return uBitmap;
          }
       }catch(java.lang.Exception e6){
          SLog.e(str, "scaleBitmap exception2:", e6);
       }catch(java.lang.OutOfMemoryError e6){
          SLog.e(str, "scaleBitmap OutOfMemoryError:", e6);
       }
       uBitmap = null;
       goto label_0052 ;
    }
    public static final String a(Bitmap p0,String p1,String p2){
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       p1 = p1+p2;
       File uFile1 = new File(p1);
       if (uFile1.exists()) {
          uFile1.delete();
       }
       if (p0 != null) {
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
             p0.compress(Bitmap$CompressFormat.JPEG, 80, uFileOutputS);
             uFileOutputS.flush();
             uFileOutputS.close();
             p0.recycle();
             return p1;
          }catch(java.io.FileNotFoundException e2){
             e2.printStackTrace();
          }catch(java.io.IOException e2){
             e2.printStackTrace();
          }
       }
    }
    public static final void a(Context p0,String p1,d p2){
       SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage\(\)");
       String str = null;
       if (TextUtils.isEmpty(p1)) {
          p2.a(1, str);
          return;
       }else if(!k.a()){
          p2.a(2, str);
          return;
       }else {
          new Thread(new a$2(p1, new a$1(p0.getMainLooper(), p2), p0)).start();
          return;
       }
    }
    public static boolean a(String p0,int p1,int p2){
       return a.b(p0, p1, p2);
    }
    public static int b(BitmapFactory$Options p0,int p1,int p2){
       int i1;
       double d = (double)p0.outWidth;
       double d1 = (double)p0.outHeight;
       int i = (p2 == -1)? 1: (int)Math.ceil(Math.sqrt(((d * d1) / (double)p2)));
       if (p1 == -1) {
          i1 = 128;
       }else {
          double d2 = (double)p1;
          i1 = (int)Math.min(Math.floor((d / d2)), Math.floor((d1 / d2)));
       }
       if (i1 < i) {
          return i;
       }else if(p2 == -1 && p1 == -1){
          return 1;
       }else if(p1 == -1){
          return i;
       }else {
          return i1;
       }
    }
    public static final boolean b(String p0,int p1,int p2){
       String str = "openSDK_LOG.AsynScaleCompressImage";
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       try{
          options.inJustDecodeBounds = true;
          BitmapFactory.decodeFile(p0, options);
       }catch(java.lang.OutOfMemoryError e7){
          SLog.e(str, "isBitMapNeedToCompress exception:", e7);
       }
       BitmapFactory$Options outWidth = options.outWidth;
       BitmapFactory$Options outHeight = options.outHeight;
       if (options.mCancel == null) {
          BitmapFactory$Options options1 = -1;
          if (outWidth != options1 && outHeight != options1) {
             options1 = (outWidth > outHeight)? outWidth: outHeight;
             if (outWidth >= outHeight) {
                outWidth = outHeight;
             }
             SLog.d(str, "longSide="+options1+"shortSide="+outWidth);
             options.inPreferredConfig = Bitmap$Config.RGB_565;
             if (options1 > p2 || outWidth > p1) {
                return true;
             }else {
                return false;
             }
          }
       }
       return false;
    }
}
