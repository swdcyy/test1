package com.meizu.cloud.pushsdk.c.h.b;
import java.lang.Math;
import android.widget.ImageView$ScaleType;
import com.meizu.cloud.pushsdk.c.c.k;
import android.graphics.Bitmap$Config;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.g;
import java.io.IOException;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meizu.cloud.pushsdk.c.b.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.c.a.b;
import java.lang.Throwable;
import android.os.NetworkOnMainThreadException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;

public class b	// class@0014fe
{

    public static int a(int p0,int p1,int p2,int p3){
       double d = Math.min(((double)p0 / (double)p2), ((double)p1 / (double)p3));
       float f = 0x3f800000;
       float f1 = 2.00f * f;
       while ((double)f1 - d <= 0) {
          f = f1;
       }
       return (int)f;
    }
    public static int a(int p0,int p1,int p2,int p3,ImageView$ScaleType p4){
       double d1;
       if (!p0 && !p1) {
          return p2;
       }
       if (p4 == ImageView$ScaleType.FIT_XY) {
          if (!p0) {
             return p2;
          }else {
             return p0;
          }
       }else if(!p0){
          return (int)((double)p2 * ((double)p1 / (double)p3));
       }else if(!p1){
          return p0;
       }else {
          double d = (double)p3 / (double)p2;
          if (p4 == ImageView$ScaleType.CENTER_CROP) {
             d1 = (double)p1;
             if (((double)p0 * d) - d1 < 0) {
                p0 = (int)(d1 / d);
             }
             return p0;
          }else {
             d1 = (double)p1;
             if (((double)p0 * d) - d1 > 0) {
                p0 = (int)(d1 / d);
             }
             return p0;
          }
       }
    }
    public static c a(k p0,int p1,int p2,Bitmap$Config p3,ImageView$ScaleType p4){
       Bitmap uBitmap;
       byte[] uobyteArray = new byte[0];
       try{
          uobyteArray = g.a(p0.b().a()).i();
       }catch(java.io.IOException e2){
          e2.printStackTrace();
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       if (!p1 && !p2) {
          options.inPreferredConfig = p3;
          uBitmap = BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length, options);
       }else {
          options.inJustDecodeBounds = true;
          BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length, options);
          BitmapFactory$Options outWidth = options.outWidth;
          BitmapFactory$Options outHeight = options.outHeight;
          int i = b.a(p1, p2, outWidth, outHeight, p4);
          p1 = b.a(p2, p1, outHeight, outWidth, p4);
          options.inJustDecodeBounds = false;
          options.inSampleSize = b.a(outWidth, outHeight, i, p1);
          Bitmap uBitmap1 = BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length, options);
          if (b.a(uBitmap1, i, p1)) {
             uBitmap = Bitmap.createScaledBitmap(uBitmap1, i, p1, true);
             uBitmap1.recycle();
          }else {
             uBitmap = uBitmap1;
          }
       }
       if (uBitmap == null) {
          return c.a(b.b(new a(p0)));
       }else {
          return c.a(uBitmap);
       }
    }
    public static a a(a p0){
       p0.a("connectionError");
       p0.a(0);
       p0.b(p0.getMessage());
       return p0;
    }
    public static a a(a p0,b p1,int p2){
       p0 = p1.a(p0);
       p0.a(p2);
       p0.a("responseFromServerError");
       return p0;
    }
    public static a a(Exception p0){
       a uoa = new a(p0);
       String str = (p0 instanceof NetworkOnMainThreadException)? "networkOnMainThreadError": "connectionError";
       uoa.a(str);
       uoa.a(0);
       return uoa;
    }
    public static String a(String p0){
       p0 = URLConnection.getFileNameMap().getContentTypeFor(p0);
       if (p0 == null) {
          p0 = "application/octet-stream";
       }
       return p0;
    }
    public static void a(k p0,String p1,String p2){
       byte[] uobyteArray = new byte[2048];
       InputStream inputStream = p0.b().b();
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       FileOutputStream uFileOutputS = new FileOutputStream(new File(uFile, p2));
       int i = inputStream.read(uobyteArray);
       while (i != -1) {
          uFileOutputS.write(uobyteArray, 0, i);
       }
       try{
          uFileOutputS.flush();
          inputStream.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       try{
          uFileOutputS.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static boolean a(Bitmap p0,int p1,int p2){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getWidth() > p1 || p0.getHeight() > p2) {
          b = true;
       }
       return b;
    }
    public static a b(a p0){
       p0.a(0);
       p0.a("parseError");
       p0.b(p0.getMessage());
       return p0;
    }
}
