package com.yxcorp.gifshow.util.w;
import java.lang.String;
import android.os.Build$VERSION;
import android.provider.MediaStore$Images$Media;
import android.net.Uri;
import lnc.r4;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import oh7.c;
import ekd.p;
import java.io.FileNotFoundException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import ekd.n0;
import java.util.Date;
import com.yxcorp.gifshow.albumcontrol.a;
import oh7.d;
import java.io.IOException;
import com.yxcorp.gifshow.albumcontrol.AlbumAccessControlException;
import android.os.Environment;
import qkd.b;
import java.lang.System;
import lnc.t4;
import java.lang.Runnable;
import ekd.k1;
import android.provider.MediaStore$Video$Media;
import lnc.s4;
import android.graphics.Rect;
import lnc.m3;
import java.lang.Throwable;
import q87.c;
import oh7.a;
import android.media.ExifInterface;

public class w	// class@001fb7
{

    public static boolean a(String p0,String p1){
       if (Build$VERSION.SDK_INT >= 30 && r4.e(p0, MediaStore$Images$Media.EXTERNAL_CONTENT_URI, p1) != null) {
          return true;
       }
       return new File(p1).exists();
    }
    public static void b(File p0,Uri p1){
       if (!p0.exists()) {
          throw new FileNotFoundException("sourceFile does not exist.");
       }
       BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
       OutputStream outputStream = c.c(p1);
       byte[] uobyteArray = new byte[2048];
       int i = uBufferedInp.read(uobyteArray);
       while (i != -1) {
          if (outputStream != null) {
             outputStream.write(uobyteArray, 0, i);
          }
       }
       p.c(uBufferedInp);
       w.i(outputStream);
       p.d(outputStream);
       return;
    }
    public static String c(String p0,File p1){
       int i;
       if (!p1.exists()) {
          throw new FileNotFoundException("sourceFile does not exist.");
       }
       String path = p1.getPath();
       if (TextUtils.x(path)) {
          path = "";
       }else {
          try{
             BitmapFactory$Options options = new BitmapFactory$Options();
             options.inJustDecodeBounds = true;
             BitmapFactory.decodeFile(path, options);
             BitmapFactory$Options outMimeType = options.outMimeType;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static String d(String p0,File p1,String p2){
       if (!p1.exists()) {
          throw new FileNotFoundException("sourceFile does not exist.");
       }
       if (Build$VERSION.SDK_INT >= 30) {
          if (a.b.a("ContentResolver.insert", p0)) {
             Uri uri = d.a(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, p2);
             if (uri != null) {
                w.b(p1, uri);
                return r4.c(p0, uri);
             }else {
                throw new IOException("insert media failed");
             }
          }else {
             throw new AlbumAccessControlException(p0+" is not allowed to access album");
          }
       }else {
          File uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), p2);
          b.g(p1, uFile);
          if (uFile.exists()) {
             uFile.setLastModified(System.currentTimeMillis());
             k1.o(new t4(uFile));
          }
          return uFile.getAbsolutePath();
       }
    }
    public static String e(String p0,File p1){
       return w.f(p0, p1, n0.c("yyyyMMdd_kkmmssSSS").format(new Date())+".mp4");
    }
    public static String f(String p0,File p1,String p2){
       if (!p1.exists()) {
          throw new FileNotFoundException("sourceFile does not exist.");
       }
       if (Build$VERSION.SDK_INT >= 30) {
          if (a.b.a("ContentResolver.insert", p0)) {
             Uri uri = d.a(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, p2);
             if (uri != null) {
                w.b(p1, uri);
                return r4.c(p0, uri);
             }else {
                throw new IOException("insert media failed");
             }
          }else {
             throw new AlbumAccessControlException(p0+" is not allowed to access album");
          }
       }else {
          File uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), p2);
          b.g(p1, uFile);
          if (uFile.exists()) {
             uFile.setLastModified(System.currentTimeMillis());
             k1.o(new s4(uFile));
          }
          return uFile.getAbsolutePath();
       }
    }
    public static Bitmap g(String p0,String p1,BitmapFactory$Options p2){
       if (Build$VERSION.SDK_INT >= 30) {
          Uri uri = r4.e(p0, MediaStore$Images$Media.EXTERNAL_CONTENT_URI, p1);
          if (uri != null) {
             try{
                return BitmapFactory.decodeStream(c.b(uri), null, p2);
             }catch(java.lang.Exception e3){
                m3.C().e("MediaFileUtils", "decodeBitmap", e3);
             }
          }
       }
    }
    public static Bitmap h(String p0,BitmapFactory$Options p1){
       Bitmap uBitmap;
       try{
          uBitmap = BitmapFactory.decodeFile(p0, p1);
       }catch(java.lang.Exception e2){
          m3.C().e("MediaFileUtils", "decodeBitmapLowApiImpl", e2);
          uBitmap = null;
       }
       return uBitmap;
    }
    public static void i(OutputStream p0){
       try{
          if (p0 != null) {
             p0.flush();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static int j(String p0,String p1){
       if (Build$VERSION.SDK_INT >= 30) {
          Uri uri = r4.e(p0, MediaStore$Images$Media.EXTERNAL_CONTENT_URI, p1);
          if (uri != null) {
             return a.g(uri);
          }
       }
       return w.k(p1);
    }
    public static int k(String p0){
       int i = 0;
       try{
          int attributeInt = new ExifInterface(p0).getAttributeInt("Orientation", i);
          if (attributeInt == 6) {
             i = 90;
          }else if(attributeInt == 3){
             i = 180;
          }else if(attributeInt == 8){
             i = 270;
          }
       }catch(java.lang.Exception e4){
          m3.C().e("MediaFileUtils", "getDegreeLowApiImpl", e4);
       }
       return i;
    }
    public static Uri l(String p0,Uri p1,File p2){
       if (Build$VERSION.SDK_INT >= 30) {
          Uri uri = r4.e(p0, p1, p2.getAbsolutePath());
          if (uri != null) {
             return uri;
          }
       }
       return Uri.fromFile(p2);
    }
}
