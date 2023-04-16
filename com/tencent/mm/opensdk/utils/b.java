package com.tencent.mm.opensdk.utils.b;
import java.lang.Runtime;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import android.content.ContentResolver;
import android.net.Uri;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import java.io.InputStream;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.io.File;
import android.content.Context;
import java.lang.Integer;

public final class b	// class@000f21
{
    public static Context a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static ThreadPoolExecutor e;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       b.b = i;
       int i1 = i + 1;
       b.c = i1;
       int i2 = (i * 2) + 1;
       b.d = i2;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(i1, i2, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());
       b.e = i;
    }
    public static int a(ContentResolver p0,Uri p1){
       Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
       if (p0 == null || p1 == null) {
          Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
          return 0;
       }else {
          InputStream inputStream = null;
          try{
             inputStream = p0.openInputStream(p1);
             if (inputStream == null) {
                try{
                   if (inputStream != null) {
                      inputStream.close();
                   }
                   return 0;
                }catch(java.io.IOException e0){
                }
             }else {
                int i = inputStream.available();
                try{
                   inputStream.close();
                   return i;
                }catch(java.io.IOException e0){
                }
             }
          }catch(java.lang.Exception e4){
             try{
                Log.w("MicroMsg.SDK.Util", "getFileSize fail, "+e4.getMessage());
                if (inputStream) {
                   inputStream.close();
                }
                return 0;
             }catch(java.io.IOException e0){
             }
          }
       }
    }
    public static int a(String p0){
       int i = 0;
       if (p0 == null || !p0.length()) {
          return i;
       }
       File uFile = new File(p0);
       if (uFile.exists()) {
          return (int)uFile.length();
       }
       if (b.a != null && p0.startsWith("content")) {
          return b.a(b.a.getContentResolver(), Uri.parse(p0));
       }
       return e0;
    }
    public static int a(String p0,int p1){
       try{
          if (p0 != null && p0.length() > 0) {
             p1 = Integer.parseInt(p0);
          }
       label_000e :
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean a(int p0){
       boolean b = (p0 == 36 || p0 == 46)? true: false;
       return b;
    }
    public static boolean b(String p0){
       if (p0 == null || p0.length() <= 0) {
          return true;
       }
       return false;
    }
}
