package m$f;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.lang.String;
import java.util.Locale;
import java.lang.Object;
import java.util.Map;
import okhttp3.Dns;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.StringBuilder;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import android.os.Process;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.Response;
import java.lang.Thread;
import a.a.a.a.b.e.b$b;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.util.Arrays;
import a.a.a.a.b.e.b;
import okhttp3.ResponseBody;
import android.os.Build$VERSION;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.security.MessageDigest;
import java.lang.Integer;
import java.lang.Exception;

public final class m$f	// class@00259a
{
    public static final OkHttpClient a;
    public static final OkHttpClient b;
    public static final Random c;
    public static final ConcurrentHashMap d;
    public static final ScheduledThreadPoolExecutor e;

    static {
       TimeUnit sECONDS = TimeUnit.SECONDS;
       m$f.a = new OkHttpClient$Builder().connectTimeout(10, sECONDS).writeTimeout(10, sECONDS).readTimeout(30, sECONDS).build();
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(10, sECONDS).writeTimeout(10, sECONDS).readTimeout(30, sECONDS);
       _monitor_enter(i$b.class);
       String str = (b.b().l().appKPN()).toUpperCase(Locale.ROOT);
       Map a = i$b.a;
       Dns uDns = (a.containsKey(str))? a.get(str): i$b.a(str);
       _monitor_exit(i$b.class);
       m$f.b = uBuilder.dns(uDns).build();
       m$f.c = new Random();
       m$f.d = new ConcurrentHashMap();
       m$f.e = new ScheduledThreadPoolExecutor(2);
    }
    public static int a(Context p0){
       String[] stringArray = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!m$f.e(p0, stringArray)) {
          return 3;
       }
       NetworkInfo activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
       if (activeNetwor == null) {
          return 0;
       }
       if (1 == activeNetwor.getType()) {
          return 2;
       }
       activeNetwor.getType();
       return 1;
    }
    public static final String b(String p0){
       return p0+m$f.c.nextInt(0x5f5e100);
    }
    public static void c(File p0){
       if (p0.exists()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                m$f.c(oobject);
             }else {
                oobject.delete();
             }
             i = i + 1;
          }
          p0.delete();
       }
       return;
    }
    public static void d(File p0,File p1){
       try{
          BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(p1));
          byte[] uobyteArray = new byte[1024];
          int i = uBufferedInp.read(uobyteArray);
          while (i > 0) {
             uBufferedOut.write(uobyteArray, 0, i);
             uBufferedOut.flush();
          }
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static boolean e(Context p0,String[] p1){
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (p0.checkPermission(p1[i], Process.myPid(), Process.myUid()) == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static synchronized boolean f(String p0,String p1,File p2,String p3){
       String str2;
       StringBuilder str3;
       String str = p1;
       Object obj = p3;
       _monitor_enter(m$f.class);
       int i = 0;
       String str1 = "";
       int i1 = 0;
       while (true) {
          if (i1 <= 5) {
             Request request = new Request$Builder().url(str).tag(p0).build();
             Call uCall = m$f.b.newCall(request).clone();
             Response response = m$f.a.newCall(request).execute();
             ResponseBody responseBody = response.body();
             int i2 = response.code();
             char c = '[';
             if (i2 >= 200 && (i2 < 300 && responseBody != null)) {
                m$c.b("download file "+str+" success");
                new FileOutputStream(p2).write(responseBody.bytes(), i, (int)responseBody.contentLength());
                if (!p2.length() - responseBody.contentLength()) {
                   str2 = m$f.h(p2);
                   if (str2.equals(obj)) {
                      i = 1;
                   label_02d9 :
                      if (!i) {
                         b.a(b$b.a, str1, 112);
                         break ;
                      }
                      break ;
                   }else {
                      str3 = str1+c+i1+"] file md5 incorrect "+str+"="+p2.getAbsolutePath()+" respcode="+i2+' '+"correctMd5["+obj+"]!=curFileMd5["+str2+"] download file length["+p2.length();
                   }
                }else {
                   str3 = str1+c+i1+"] download file length error"+str+"="+p2.getAbsolutePath()+" respcode="+i2+' '+"download file length["+p2.length();
                }
                str2 = "]\r\n";
                str1 = str3+str2;
                response.body().close();
             }else {
                m$c.d("download file http error "+response.code());
                str1 = str1+c+i1+"] SEC_ERROR_DOWNLOADFILE_FILE_DOWNLOAD_REQ_FAIL "+str+"="+p2.getAbsolutePath()+" respcode="+i2+' '+"download file length["+p2.length()+"]\r\n";
             }
             m$c.b("file download finish");
             i1 = i1 + 1;
          }else {
             int i3 = p2;
             goto label_02d9 ;
          }
       }
       _monitor_exit(m$f.class);
       return i;
    }
    public static boolean g(Context p0){
       String[] stringArray = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!m$f.e(p0, stringArray)) {
          return false;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (Build$VERSION.SDK_INT >= 23) {
          return systemServic.getNetworkCapabilities(systemServic.getActiveNetwork()).hasCapability(16);
       }
       NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
       if (activeNetwor == null) {
          return false;
       }
       return activeNetwor.isConnected();
    }
    public static String h(File p0){
       String str = null;
       if (!p0.isFile()) {
          return str;
       }
       int i = 1024;
       byte[] uobyteArray = new byte[i];
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          FileInputStream uFileInputSt = new FileInputStream(p0);
          int i1 = uFileInputSt.read(uobyteArray, 0, i);
          while (i1 != -1) {
             instance.update(uobyteArray, 0, i1);
          }
          uFileInputSt.close();
          byte[] uobyteArray1 = instance.digest();
          StringBuilder str1 = "";
          if (uobyteArray1 != null && uobyteArray1.length > 0) {
             for (int i2 = 0; i2 < uobyteArray1.length; i2 = i2 + 1) {
                int i3 = uobyteArray1[i2] & 0x00ff;
                String str2 = Integer.toHexString(i3);
                if (str2.length() < 2) {
                   str1 = str1+0;
                }
                str1 = str1+str2;
             }
             str = str1;
          }
          return str;
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          return str;
       }
    }
}
