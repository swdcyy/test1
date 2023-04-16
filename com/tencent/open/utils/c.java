package com.tencent.open.utils.c;
import android.app.Activity;
import java.lang.Object;
import com.tencent.open.utils.c$2;
import java.lang.ref.WeakReference;
import com.tencent.open.utils.c$1;
import android.os.Looper;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.lang.OutOfMemoryError;
import com.tencent.open.utils.d;
import android.os.Handler;
import com.tencent.open.utils.k;
import android.content.Context;
import java.io.File;
import android.os.Environment;
import com.tencent.open.utils.i;
import java.lang.System;
import java.lang.Thread;
import java.lang.Runnable;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.lang.Throwable;

public class c	// class@000f78
{
    public String a;
    public d b;
    public long d;
    public Handler e;
    public WeakReference f;
    public Runnable g;
    public static String c;

    public void c(Activity p0){
       super();
       this.g = new c$2(this);
       this.f = new WeakReference(p0);
       this.e = new c$1(this, p0.getMainLooper());
    }
    public static Bitmap a(String p0){
       int i;
       SLog.v("AsynLoadImg", "getbitmap:"+p0);
       try{
          i = 0;
          HttpURLConnection httpURLConne = new URL(p0).openConnection();
          httpURLConne.setDoInput(true);
          httpURLConne.connect();
          InputStream inputStream = httpURLConne.getInputStream();
          Bitmap uBitmap = BitmapFactory.decodeStream(inputStream);
          inputStream.close();
          SLog.v("AsynLoadImg", "image download finished."+p0);
          return uBitmap;
       }catch(java.lang.OutOfMemoryError e6){
          e6.printStackTrace();
          SLog.v(v2, v0);
          return i;
       }catch(java.io.IOException e6){
          e6.printStackTrace();
          SLog.v(v2, v0);
          return i;
       }
    }
    public static d a(c p0){
       return p0.b;
    }
    public static String a(){
       return c.c;
    }
    public static String b(c p0){
       return p0.a;
    }
    public static Handler c(c p0){
       return p0.e;
    }
    public static long d(c p0){
       return p0.d;
    }
    public void a(String p0,d p1){
       StringBuilder str = "AsynLoadImg";
       SLog.v(str, "--save---");
       String str1 = null;
       if (p0 == null || p0.equals("")) {
          p1.a(1, str1);
          return;
       }else if(!k.a()){
          p1.a(2, str1);
          return;
       }else if(this.f.get() != null){
          Activity uActivity = this.f.get();
          File uFile = k.h(uActivity, "Images");
          File externalStor = Environment.getExternalStorageDirectory();
          if (uFile == null) {
             SLog.e(str, "externalImageFile is null");
             p1.a(2, str1);
             return;
          }else {
             str = "";
             str1 = (i.d(uActivity))? uFile.getAbsolutePath(): externalStor.getAbsolutePath();
             c.c = str+str1+"/tmp/";
          }
       }
       this.d = System.currentTimeMillis();
       this.a = p0;
       this.b = p1;
       new Thread(this.g).start();
       return;
    }
    public boolean a(Bitmap p0,String p1){
       BufferedOutputStream uBufferedOut;
       String c = c.c;
       int i = 0;
       try{
          File uFile = new File(c);
          if (!uFile.exists()) {
             uFile.mkdir();
          }
          SLog.v("AsynLoadImg", "saveFile:"+p1);
          FileOutputStream uFileOutputS = new FileOutputStream(new File(c+p1));
          try{
             uBufferedOut = new BufferedOutputStream(uFileOutputS);
             p0.compress(Bitmap$CompressFormat.JPEG, 80, uBufferedOut);
             try{
                uBufferedOut.flush();
                uBufferedOut.close();
             }catch(java.io.IOException e6){
                e6.printStackTrace();
             }
             return true;
          }catch(java.io.IOException e6){
             BufferedOutputStream uBufferedOut1 = uBufferedOut;
          }
          e6.printStackTrace();
          SLog.e("AsynLoadImg", "saveFile bmp fail---", e6);
          if (i) {
             try{
                i.close();
             }catch(java.io.IOException e7){
                e7.printStackTrace();
             }
          }
       }catch(java.io.IOException e6){
          goto label_0062 ;
       }
    }
}
