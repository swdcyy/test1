package com.kuaishou.android.security.base.util.j;
import java.lang.String;
import android.os.ConditionVariable;
import android.content.Context;
import java.lang.Object;
import java.util.zip.CRC32;
import android.content.pm.ApplicationInfo;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Byte;
import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.io.File;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.lang.Character;
import java.io.FileInputStream;
import java.lang.System;
import java.lang.Exception;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.lang.Thread;
import com.kuaishou.android.security.base.util.j$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;
import java.io.IOException;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.security.MessageDigest;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;
import java.lang.Throwable;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.d;
import okio.m;
import okio.l;
import okio.c;
import cud.j;
import okio.b;
import okio.n;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.PackageManager$NameNotFoundException;
import java.lang.Runtime;
import java.lang.Process;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import com.kuaishou.android.security.base.exception.a;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.security.NoSuchAlgorithmException;
import com.kuaishou.android.security.internal.common.ExceptionProxy;
import com.kuaishou.android.security.base.log.d;
import android.preference.PreferenceManager;
import java.util.Locale;

public class j	// class@0006b7
{
    public SharedPreferences a;
    public Context b;
    public static String c;
    public static j f;
    public static boolean g;
    public static boolean h;
    public static String i;
    public static String j;
    public static String k;
    public static boolean l;
    public static final String[] m;
    public static final ConditionVariable n;

    static {
       String[] stringArray = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
       j.m = stringArray;
       j.n = new ConditionVariable();
    }
    public void j(Context p0){
       super();
       this.e(p0);
       new CRC32().update((this.h().getApplicationInfo().packageName).getBytes());
       this.e(p0);
       this.a(o.c(this.h(), "com.fkgfasdfeeqeqe", 0));
    }
    public static ConditionVariable a(){
       return j.n;
    }
    public static j a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.f == null) {
          _monitor_enter(j.class);
          if (j.f == null) {
             j.f = new j(p0);
          }
          _monitor_exit(j.class);
       }
       return j.f;
    }
    public static String a(byte p0){
       int i;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Byte.valueOf(p0), null, oj, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0) {
          i = p0 + 256;
       }
       String[] m = j.m;
       return m[(i / 16)]+m[(i % 16)];
    }
    public static String a(byte[] p0){
       StringBuffer obj = PatchProxy.applyOneRefs(p0, null, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          obj = obj+j.a(p0[i]);
       }
       return obj;
    }
    public static void a(File p0,File p1){
       j.b(p0, p1);
    }
    public static void a(String p0,File p1){
       j.b(p0, p1);
    }
    public static boolean a(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          int i = p0.length();
          if (i) {
             int i1 = 0;
             while (i1 < i) {
                if (!Character.isWhitespace(p0.charAt(i1))) {
                   return false;
                }
                i1 = i1 + 1;
             }
          }
       }
       return true;
    }
    public static byte[] a(File p0){
       byte[] obj = PatchProxy.applyOneRefs(p0, null, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (int)p0.length();
       obj = new byte[i];
       byte[] uobyteArray = new byte[i];
       FileInputStream uFileInputSt = new FileInputStream(p0);
       try{
          int i1 = 0;
          int i2 = uFileInputSt.read(obj, i1, i);
          if (i2 < i) {
             i2 = i - i2;
             while (i2 > 0) {
                int i3 = uFileInputSt.read(uobyteArray, i1, i2);
                int i4 = i - i2;
                System.arraycopy(uobyteArray, i1, obj, i4, i3);
                i2 = i2 - i3;
             }
          }
          try{
             uFileInputSt.close();
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
          }
          return obj;
       }catch(java.io.IOException e7){
          throw e7;
       }
    }
    public static byte[] a(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = File.separator;
       File uFile = new File(b.i().j().c().getFilesDir().getAbsolutePath()+obj+"seaio/");
       new Thread(new j$a(uFile, p1, p0)).start();
       j.n.block();
       File uFile1 = new File(uFile.getAbsolutePath()+obj+p1);
       byte[] uobyteArray = new byte[0];
       if (!uFile1.exists()) {
          Object[] objArray = new Object[0];
          d.a(d$b.a, String.format("pull data from cdn file not exists", objArray), b.n);
          byte[] uobyteArray1 = new byte[0];
          return uobyteArray1;
       }else {
          try{
             uobyteArray = j.a(uFile1);
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
          j.n.close();
          return uobyteArray;
       }
    }
    public static String b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!j.b(j.c)) {
          return j.c;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic == null) {
             return null;
          }else {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                   if (runningAppPr1.pid == i) {
                      ActivityManager$RunningAppProcessInfo processName = runningAppPr1.processName;
                      j.c = processName;
                      return processName;
                   }
                }
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return null;
    }
    public static String b(byte[] p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length > 0) {
          str = j.a(MessageDigest.getInstance("MD5").digest(p0));
       }
       return str;
    }
    public static void b(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "14")) {
          return;
       }
       try{
          FileChannel channel = new FileInputStream(p0).getChannel();
          FileChannel channel1 = new FileOutputStream(p1).getChannel();
          channel1.transferFrom(channel, 0, channel.size());
          channel1.close();
          channel.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static void b(String p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "15")) {
          return;
       }
       ResponseBody responseBody = new OkHttpClient().newCall(new Request$Builder().url(p0).build()).execute().body();
       responseBody.contentLength();
       d uod = responseBody.source();
       j oj = l.c(l.f(p1));
       b uob = oj.buffer();
       int i = 8192;
       while (uod.read(uob, (long)i) - -1) {
          oj.emit();
       }
       oj.flush();
       oj.close();
       uod.close();
       return;
    }
    public static boolean b(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static String c(Context p0){
       StringBuffer obj = PatchProxy.applyOneRefs(p0, null, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!j.b(j.j)) {
          return j.j;
       }
       try{
          obj = "";
          PackageInfo signatures = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64).signatures;
          int len = signatures.length;
          for (int i = 0; i < len; i = i + 1) {
             obj = obj+j.b(signatures[i].toByteArray())+",";
          }
          String str = obj;
          j.j = str;
          return str;
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          e4.printStackTrace();
          return j.j;
       }
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          int i = p0.length();
          if (i) {
             int i1 = 0;
             int i2 = 0;
             while (i1 < i) {
                if (Character.isWhitespace(p0.charAt(i1))) {
                   i2 = 1;
                }
                i1 = i1 + 1;
             }
             if (!i2 && !p0.contains(b.y)) {
                b = false;
             }
          }
       }
       return b;
    }
    public static j d(){
       Object obj = PatchProxy.apply(null, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(b.i().j().c());
    }
    public static boolean d(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = j.b(p0);
       boolean b = (!j.b(obj) && obj.equals(p0.getPackageName()))? true: false;
       return b;
    }
    public String a(String p0){
       StringBuffer obj = PatchProxy.applyOneRefs(p0, this, j.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Process process = Runtime.getRuntime().exec(p0);
       try{
          obj = "";
          if (process.waitFor()) {
             System.err.println("exit value = "+process.exitValue());
          }
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
          process = uBufferedRea.readLine();
          while (process != null) {
             obj = obj+process+"-";
          }
       }catch(java.lang.InterruptedException e5){
          obj = obj+a.a(e5);
          Thread.currentThread().interrupt();
       }
       return obj;
    }
    public void a(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "24")) {
          return;
       }
       if (j.l) {
          return;
       }
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = j.d().f();
       objArray[1] = j.d().b();
       String str = String.format("%s_%s_failure", objArray);
       if (j.c(j.d().b(str))) {
          j.d().b(str, "1");
       }
       objArray = new Object[i];
       objArray[0] = j.d().f();
       objArray[1] = j.d().b();
       str = String.format("%s_%s_record", objArray);
       Object[] objArray1 = new Object[]{Integer.valueOf(p0),Long.valueOf(System.currentTimeMillis()),b.i().h().getKgSessionId()};
       j.d().b(str, j.d().b(str)+String.format("[fail\(%d\)=%d$%s]", objArray1));
       return;
    }
    public void a(SharedPreferences p0){
       this.a = p0;
    }
    public String b(){
       PackageInfo obj = PatchProxy.apply(null, this, j.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!(j.k).isEmpty()) {
          return j.k;
       }
       obj = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64);
       if (obj != null) {
          j.k = obj.versionName;
       }
       return j.k;
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (!p0.length()) {
          return str;
       }
       if (this.e() == null) {
          return str;
       }
       return this.e().getString(p0, b.y);
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "18")) {
          return;
       }
       if (!p0.length() || (p1.length() && this.e() != null)) {
          SharedPreferences$Editor uEditor = this.e().edit();
          uEditor.putString(p0, p1);
          g.a(uEditor);
       }
    label_002c :
       return;
    }
    public String c(){
       Object[] objArray = null;
       byte[] obj = PatchProxy.apply(objArray, this, j.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((j.i).isEmpty()) {
          int i = 8192;
          try{
             obj = new byte[i];
             MessageDigest instance = MessageDigest.getInstance("MD5");
             FileInputStream uFileInputSt = new FileInputStream(new File(this.b.getPackageCodePath()));
             try{
                int i1 = uFileInputSt.read(obj);
                while (i1 != -1) {
                   instance.update(obj, 0, i1);
                }
                String str = j.a(instance.digest());
                j.i = str;
                uFileInputSt.close();
             }catch(java.security.NoSuchAlgorithmException e0){
                objArray = uFileInputSt;
             }catch(java.io.IOException e0){
                objArray = uFileInputSt;
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
          }catch(java.security.NoSuchAlgorithmException e0){
          }catch(java.io.IOException e0){
          }
          e0.printStackTrace();
          if (objArray != null) {
          label_0057 :
             objArray.close();
          }
       }
    }
    public SharedPreferences e(){
       return this.a;
    }
    public void e(Context p0){
       this.b = p0;
    }
    public String f(){
       ActivityManager$RunningAppProcessInfo obj = PatchProxy.apply(null, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!j.b(j.c)) {
          return j.c;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = j.f.b.getSystemService("activity");
          if (systemServic == null) {
             return null;
          }else {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                   if (runningAppPr1.pid == i) {
                      obj = runningAppPr1.processName;
                      j.c = obj;
                      return obj;
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return null;
    }
    public String g(){
       Object[] obj = PatchProxy.apply(null, this, j.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{j.d().f(),j.d().b()};
       String str = String.format("%s_%s_record", obj);
       str = str+j.d().b(str);
       if (str.split("fail").length > 10) {
          ExceptionProxy.cleanSP();
          str = "";
       }
       return str;
    }
    public Context h(){
       return this.b;
    }
    public boolean i(){
       SharedPreferences obj = PatchProxy.apply(null, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (j.g) {
          d.a("read from volatile");
          return j.h;
       }else {
          obj = PreferenceManager.getDefaultSharedPreferences(this.h());
          CRC32 uCRC32 = new CRC32();
          uCRC32.update((this.h().getApplicationInfo().packageName).getBytes());
          Object[] objArray = new Object[]{"com.kwguard.security.sperf.aleadyLaunch",Long.valueOf(uCRC32.getValue())};
          String str = String.format(Locale.getDefault(), "%s_%d", objArray);
          boolean booleanx = obj.getBoolean(str, 0);
          if (!booleanx) {
             SharedPreferences$Editor uEditor = obj.edit();
             uEditor.putBoolean(str, 1);
             g.a(uEditor);
          }
          j.g = true;
          int i = booleanx ^ 0x01;
          j.h = i;
          return i;
       }
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, j.class, "23")) {
          return;
       }
       int i = 2;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = j.d().f();
       objArray[1] = j.d().b();
       if (!j.c(j.d().b(String.format("%s_%s_failure", objArray)))) {
          objArray = new Object[i];
          objArray[i1] = j.d().f();
          objArray[1] = j.d().b();
          String str = String.format("%s_%s_record", objArray);
          Object[] objArray1 = new Object[i];
          objArray1[i1] = Long.valueOf(System.currentTimeMillis());
          objArray1[1] = b.i().h().getKgSessionId();
          j.d().b(str, j.d().b(str)+String.format("[succ=%d$%s]", objArray1));
       }
       return;
    }
    public final void k(){
    }
}
