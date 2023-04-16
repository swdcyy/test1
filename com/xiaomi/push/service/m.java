package com.xiaomi.push.service.m;
import android.content.Context;
import java.io.InputStream;
import android.graphics.BitmapFactory$Options;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import java.lang.String;
import rs8.c;
import android.net.Uri;
import android.content.ContentResolver;
import java.io.Closeable;
import ws8.l7;
import java.lang.Throwable;
import com.xiaomi.push.service.m$a;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.lang.StringBuilder;
import java.io.ByteArrayOutputStream;
import com.xiaomi.push.service.m$b;
import java.io.ByteArrayInputStream;
import java.io.File;
import ws8.k7;
import java.lang.System;
import ws8.p0;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;

public class m	// class@001185
{
    public static long a;

    public static int a(Context p0,InputStream p1){
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = true;
       BitmapFactory.decodeStream(p1, null, options);
       if (options.outWidth == -1 || options.outHeight == -1) {
          c.l("decode dimension failed for bitmap.");
          return true;
       }else {
          int i = Math.round((((float)c.c(p0.getResources()).densityDpi / 160.00f) * 48.00f));
          BitmapFactory$Options outWidth = options.outWidth;
          if (outWidth > i) {
             options = options.outHeight;
             if (options > i) {
                return Math.min((outWidth / i), (options / i));
             }
          }
          return true;
       }
    }
    public static Bitmap b(Context p0,String p1){
       int i;
       InputStream inputStream;
       Closeable uCloseable;
       Uri uri = Uri.parse(p1);
       try{
          i = 0;
          inputStream = p0.getContentResolver().openInputStream(uri);
          try{
             int i1 = m.a(p0, inputStream);
             InputStream inputStream1 = p0.getContentResolver().openInputStream(uri);
             try{
                BitmapFactory$Options options = new BitmapFactory$Options();
                options.inSampleSize = i1;
                l7.b(inputStream1);
                l7.b(inputStream);
                return BitmapFactory.decodeStream(inputStream1, i, options);
             }catch(java.io.IOException e4){
             }
          }catch(java.io.IOException e4){
             uCloseable = i;
          }
       }catch(java.io.IOException e4){
          uCloseable = i;
          inputStream = uCloseable;
       }
    }
    public static m$a c(String p0,boolean p1){
       HttpURLConnection httpURLConne;
       Closeable uCloseable1;
       Closeable uCloseable = null;
       try{
          httpURLConne = new URL(p0).openConnection();
          try{
             uCloseable1 = 8000;
             httpURLConne.setConnectTimeout(uCloseable1);
             httpURLConne.setReadTimeout(0x4e20);
             httpURLConne.setRequestProperty("User-agent", "Mozilla/5.0 \(Linux; U;\) AppleWebKit/537.36 \(KHTML, like Gecko\) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser");
             httpURLConne.connect();
             int contentLengt = httpURLConne.getContentLength();
             String str = 0x19000;
             if (p1 && contentLengt > str) {
                c.l("Bitmap size is too big, max size is 102400  contentLen size is "+contentLengt+" from url "+p0);
                l7.b(uCloseable);
                httpURLConne.disconnect();
                return uCloseable;
             }else {
                contentLengt = httpURLConne.getResponseCode();
                if (contentLengt != 200) {
                   c.l("Invalid Http Response Code "+contentLengt+" received");
                   l7.b(uCloseable);
                   httpURLConne.disconnect();
                   return uCloseable;
                }else {
                   try{
                      InputStream inputStream = httpURLConne.getInputStream();
                      try{
                         ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                         String str1 = (p1)? 0x19000: 0x1f4000;
                         byte[] uobyteArray = new byte[1024];
                         while (str1 > 0) {
                            int i = inputStream.read(uobyteArray, 0, 1024);
                            if (i == -1) {
                               break ;
                            }
                            str1 = str1 - i;
                            uByteArrayOu.write(uobyteArray, 0, i);
                         }
                         if (str1 <= 0) {
                            c.l("length 102400 exhausted.");
                            l7.b(inputStream);
                            httpURLConne.disconnect();
                            return new m$a(uCloseable, str);
                         }else {
                            byte[] uobyteArray1 = uByteArrayOu.toByteArray();
                            l7.b(inputStream);
                            httpURLConne.disconnect();
                            return new m$a(uobyteArray1, uobyteArray1.length);
                         }
                      }catch(java.net.SocketTimeoutException e0){
                      }catch(java.io.IOException e10){
                      }
                   }catch(java.io.IOException e10){
                      uCloseable1 = uCloseable;
                   }
                }
             }
          }catch(java.net.SocketTimeoutException e0){
             uCloseable1 = e0;
          }catch(java.io.IOException e10){
          }
       }catch(java.net.SocketTimeoutException e0){
          httpURLConne = e0;
          uCloseable1 = httpURLConne;
       }catch(java.io.IOException e10){
          httpURLConne = uCloseable;
          uCloseable1 = httpURLConne;
       }
    label_00d7 :
       httpURLConne.disconnect();
    }
    public static m$b d(Context p0,String p1,boolean p2){
       ByteArrayInputStream uByteArrayIn;
       Bitmap uBitmap = null;
       m$b uob = new m$b(uBitmap, 0);
       Bitmap uBitmap1 = m.g(p0, p1);
       if (uBitmap1 != null) {
          uob.a = uBitmap1;
          return uob;
       }else {
          try{
             m$a uoa = m.c(p1, p2);
             if (uoa == null) {
                l7.b(uBitmap);
                return uob;
             }else {
                uob.b = (long)uoa.b;
                m$a a = uoa.a;
                if (a != null) {
                   if (p2) {
                      uByteArrayIn = new ByteArrayInputStream(a);
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      options.inSampleSize = m.a(p0, uByteArrayIn);
                      uob.a = BitmapFactory.decodeByteArray(a, 0, a.length, options);
                      uBitmap = uByteArrayIn;
                   }else {
                      uob.a = BitmapFactory.decodeByteArray(a, 0, a.length);
                   }
                }
                m.f(p0, uoa.a, p1);
             label_0059 :
                l7.b(uBitmap);
                return uob;
             }
          }catch(java.lang.Exception e6){
          }catch(java.lang.Exception e6){
             uBitmap = uByteArrayIn;
          }
          c.o(e6);
          goto label_0059 ;
       }
    }
    public static void e(Context p0){
       File uFile = new File(p0.getCacheDir().getPath()+File.separator+"mipush_icon");
       if (!uFile.exists()) {
          return;
       }
       if (!m.a) {
          m.a = k7.a(uFile);
       }
       if (m.a - 0xf00000 > 0) {
          try{
             File[] uFileArray = uFile.listFiles();
             int i = 0;
             while (i < uFileArray.length) {
                if (!uFileArray[i].isDirectory()) {
                   long l = System.currentTimeMillis() - uFileArray[i].lastModified();
                   if (Math.abs(l) - 0x127500 > 0) {
                      uFileArray[i].delete();
                   }
                }
                i = i + 1;
             }
          }catch(java.lang.Exception e8){
             c.o(e8);
          }
          m.a = 0;
       }
       return;
    }
    public static void f(Context p0,byte[] p1,String p2){
       int i;
       Closeable uCloseable;
       BufferedOutputStream uBufferedOut;
       if (p1 == null) {
          c.l("cannot save small icon cause bitmap is null");
          return;
       }else {
          m.e(p0);
          File uFile = new File(p0.getCacheDir().getPath()+File.separator+"mipush_icon");
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          File uFile1 = new File(uFile, p0.b(p2));
          try{
             i = 0;
             if (!uFile1.exists()) {
                uFile1.createNewFile();
             }
             try{
                FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
                try{
                   uBufferedOut = new BufferedOutputStream(uFileOutputS);
                   uBufferedOut.write(p1);
                   uBufferedOut.flush();
                   l7.b(uBufferedOut);
                }catch(java.lang.Exception e6){
                   Closeable uCloseable1 = uBufferedOut;
                }
             }catch(java.lang.Exception e6){
             }
          }catch(java.lang.Exception e6){
             uCloseable = i;
          }
          l7.b(uCloseable);
          if (!m.a) {
             m.a = k7.a(new File(p0.getCacheDir().getPath()+File.separator+"mipush_icon")) + uFile1.length();
          }
          return;
       }
    }
    public static Bitmap g(Context p0,String p1){
       int i;
       FileInputStream uFileInputSt;
       File uFile = new File(p0.getCacheDir().getPath()+File.separator+"mipush_icon", p0.b(p1));
       Bitmap uBitmap = null;
       if (!uFile.exists()) {
          return uBitmap;
       }
       try{
          try{
             uFileInputSt = new FileInputStream(uFile);
             uBitmap = BitmapFactory.decodeStream(uFileInputSt);
             uFile.setLastModified(System.currentTimeMillis());
             l7.b(uFileInputSt);
          label_0058 :
             return uBitmap;
          }catch(java.lang.Exception e0){
             Closeable uCloseable = uFileInputSt;
             i = uBitmap;
          }
          c.o(e0);
          l7.b(uBitmap);
          uBitmap = i;
          goto label_0058 ;
       }catch(java.lang.Exception e0){
          i = uBitmap;
          goto label_0051 ;
       }
    }
}
