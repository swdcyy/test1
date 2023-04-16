package com.frog.engine.download.DownloadAndroidManager$a;
import okhttp3.Callback;
import java.lang.String;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager;
import java.io.ByteArrayOutputStream;
import java.lang.Thread;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Exception;
import okhttp3.Call;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pg.d;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.io.InputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import pg.b;
import com.frog.engine.internal.FrogLog;
import pg.c;
import java.io.Closeable;
import pg.e;

public final class DownloadAndroidManager$a implements Callback	// class@0014fe
{
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public void DownloadAndroidManager$a(String p0,int p1,int p2,String p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public static void a(int p0,int p1,long p2,long p3){
       DownloadAndroidManager.nativeOnProgress(p0, p1, p2, p2, p3);
    }
    public static void a(int p0,int p1,ByteArrayOutputStream p2){
       Thread.currentThread().getName();
       DownloadAndroidManager.nativeOnFinish(p0, p1, 0, null, p2.toByteArray());
    }
    public static void a(int p0,int p1,IOException p2){
       Thread.currentThread().getName();
       DownloadAndroidManager.nativeOnFinish(p0, p1, 0x2711, "Download Fail "+p2.getMessage(), null);
    }
    public static void a(int p0,int p1,Exception p2){
       Thread.currentThread().getName();
       DownloadAndroidManager.nativeOnFinish(p0, p1, 0x2711, "Download Fail"+p2.getMessage(), null);
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadAndroidManager$a.class, "1")) {
          return;
       }
       p1.getMessage();
       FrogRender.postGLRunnable(this.a, new d(this.b, this.c, p1));
       return;
    }
    public void onResponse(Call p0,Response p1){
       int i;
       InputStream inputStream;
       FileOutputStream uFileOutputS;
       byte[] uobyteArray1;
       long l3;
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, DownloadAndroidManager$a.class, "2")) {
          return;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       try{
          i = 0;
          if (p1.body() != null && p1.isSuccessful()) {
             byte[] uobyteArray = new byte[2048];
             inputStream = p1.body().byteStream();
             try{
                long l = p1.body().contentLength();
                if (!TextUtils.isEmpty(obj.d)) {
                   DownloadAndroidManager$a e = obj.e;
                   uFileOutputS = new FileOutputStream(new File(obj.d, e.substring((e.lastIndexOf("/") + 1))));
                }
                ByteArrayOutputStream uByteArrayOu1 = new ByteArrayOutputStream();
                long l1 = 0;
                StringBuilder str = -1;
                DownloadAndroidManager$a uoa = -1;
                try{
                   int i1 = inputStream.read(uobyteArray);
                   while (i1 != str) {
                      int i2 = 0;
                      if (uFileOutputS != null) {
                         uFileOutputS.write(uobyteArray, i2, i1);
                      }
                      uByteArrayOu1.write(uobyteArray, i2, i1);
                      long l2 = l1 + (long)i1;
                      float f = (float)l2 * 0x3f800000;
                      f = f / (float)l;
                      f = f * 100.00f;
                      int i3 = (int)f;
                      if (uoa != i3 || i3 >= 100) {
                         uobyteArray1 = uobyteArray;
                         l3 = l2;
                         b uob = new b(obj.b, obj.c, l2, l);
                         FrogRender.postGLRunnable(obj.a, i2);
                         uoa = i3;
                      }else {
                         uobyteArray1 = uobyteArray;
                         l3 = l2;
                      }
                      uobyteArray = uobyteArray1;
                      l1 = l3;
                      str = -1;
                   }
                   if (uFileOutputS != null) {
                      uFileOutputS.flush();
                   }
                   uByteArrayOu1.flush();
                   FrogLog.d("frog_download_android", "Java Download success size="+uByteArrayOu1.size());
                   FrogRender.postGLRunnable(obj.a, new c(obj.b, obj.c, uByteArrayOu1));
                   uByteArrayOu = uByteArrayOu1;
                }catch(java.lang.Exception e0){
                   Closeable uCloseable1 = uByteArrayOu1;
                }
             }catch(java.lang.Exception e0){
             }
          }else {
             inputStream = i;
          }
          DownloadAndroidManager.closeQuietly(inputStream);
          DownloadAndroidManager.closeQuietly(uFileOutputS);
          DownloadAndroidManager.closeQuietly(uByteArrayOu);
       }catch(java.lang.Exception e0){
          Closeable uCloseable = i;
       }
       return;
    }
}
