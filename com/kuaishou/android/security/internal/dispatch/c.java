package com.kuaishou.android.security.internal.dispatch.c;
import java.lang.Object;
import java.util.zip.ZipFile;
import java.lang.String;
import java.io.InputStream;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.math.BigInteger;
import java.lang.Exception;
import java.io.IOException;
import android.content.Context;
import java.lang.Throwable;
import java.lang.StringBuffer;
import java.lang.ClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.BaseDexClassLoader;
import com.kuaishou.android.security.base.util.l;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.util.j;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;
import java.io.Closeable;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.loader.b;
import com.kuaishou.android.security.base.log.d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import android.util.Base64;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.lang.System;
import com.kuaishou.android.security.base.perf.i;

public class c	// class@0006e1
{
    public static boolean a = false;
    public static String b;

    public void c(){
       super();
    }
    public static InputStream a(ZipFile p0,String p1){
       InputStream obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b(p0, p1);
       if (obj == null && p1.equals("armeabi")) {
          obj = c.b(p0, "armeabi-v7a");
       }
       return obj;
    }
    public static String a(){
       return c.b;
    }
    public static String a(File p0){
       String str;
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new FileInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(obj.getChannel().map(FileChannel$MapMode.READ_ONLY, 0, p0.length()));
          str = new BigInteger(1, instance.digest()).toString(16);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       try{
          obj.close();
       }catch(java.io.IOException e8){
          e8.printStackTrace();
       }
       return str;
    }
    public static String a(byte[] p0){
       String str;
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0);
          str = new BigInteger(1, obj.digest()).toString(16);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return str;
    }
    public static void a(Context p0,Throwable p1){
       Object[] objArray;
       String str4;
       String str6;
       String str7;
       Object[] objArray2;
       StringBuffer str = "-->\r\n";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "4")) {
          return;
       }
       StringBuffer str1 = "";
       StringBuffer str2 = "";
       int i = 0;
       try{
          ClassLoader systemClassL = DexClassLoader.getSystemClassLoader();
          if (systemClassL != null && systemClassL instanceof BaseDexClassLoader) {
             str4 = l.a(systemClassL).b("getLdLibraryPath").c();
             str1 = str1+"ldLibraryPath["+str4+"]";
          }
          try{
             str4 = p0.getPackageResourcePath();
             String separator = File.separator;
             File uFile = new File(str4.substring(i, str4.lastIndexOf(separator))+separator+"lib"+separator);
             if (uFile.exists()) {
                str1 = str1+uFile.getAbsolutePath()+str;
                File[] uFileArray = uFile.listFiles();
                int len = uFileArray.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = uFileArray[i1];
                   if (oobject.exists()) {
                      str1 = str1+"\t"+oobject.getName()+str;
                      StringBuffer str5 = "";
                      File[] uFileArray1 = oobject.listFiles();
                      int len1 = uFileArray1.length;
                      int i2 = 0;
                      while (i2 < len1) {
                         object oobject1 = uFileArray1[i2];
                         str6 = "\t\t%s[%s]\r\n";
                         str7 = str;
                         Object[] objArray1 = new Object[]{oobject1.getName(),c.a(oobject1)};
                         str5 = str5+String.format(str6, objArray1);
                         i2 = i2 + 1;
                         str = str7;
                         str6 = null;
                      }
                      str7 = str;
                      str1 = str1+str5;
                      objArray = new Object[]{oobject.getAbsolutePath(),j.a(p0).a(String.format("ls -al %s", objArray2))};
                      objArray2 = new Object[]{oobject.getAbsolutePath()};
                      str2 = str2+String.format("[%s->cmd{%s}", objArray);
                   }else {
                      str7 = str;
                   }
                   i1 = i1 + 1;
                   str = str7;
                   str6 = null;
                }
             }
             str1 = str1+"\r\n FolderDetail:["+str2+"]";
             str = "";
             BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/"+Process.myPid()+"/maps"));
             String str3 = uBufferedRea.readLine();
             while (str3 != null) {
                str = str+str3+"\r\n";
             }
             uBufferedRea.close();
             KSecurityTrack.sLog(30);
             objArray = new Object[]{p1.getMessage(),str1,str};
             d.a(d$b.f, String.format("retry Load 0 [%s]\r\nlibdir[%s]\r\nmaps->[%s]\r\n", objArray), b.m);
             return;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       try{
          p0.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean a = c.a;
       if (a) {
          return a;
       }
       KSecurityTrack.sLog(29);
       b.a(c.b);
       c.a = true;
       if (c.a) {
          KSecurityTrack.sLog(31);
          return c.a;
       }else if(!c.b(p0)){
          KSecurityTrack.sLog(32);
          return false;
       }else {
          KSecurityTrack.sLog(33);
          d.a("retry Load so ok");
          return c.a;
       }
    }
    public static boolean a(BufferedInputStream p0,BufferedInputStream p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          int i = p0.available();
          int i1 = p1.available();
          if (i != i1) {
             return b;
          }
          byte[] uobyteArray = new byte[i];
          byte[] uobyteArray1 = new byte[i1];
          p0.read(uobyteArray);
          p1.read(uobyteArray1);
          int i2 = 0;
          while (true) {
             if (i2 >= i) {
                return true;
             }
             if (uobyteArray[i2] != uobyteArray1[i2]) {
                break ;
             }else {
                i2++;
             }
          }
          return b;
       }catch(java.io.FileNotFoundException e5){
          e5.printStackTrace();
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return b;
    }
    public static boolean a(String p0,String p1,File p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = c.b(p0, p1, p2);
       if (!b && p1.equals("armeabi")) {
          b = c.b(p0, "armeabi-v7a", p2);
       }
       return b;
    }
    public static boolean a(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          FileInputStream uFileInputSt = new FileInputStream(p2);
          ZipFile zipFile = new ZipFile(p0);
          InputStream inputStream = c.a(zipFile, p1);
          if (inputStream == null) {
             if (inputStream != null) {
                inputStream.close();
             }
             zipFile.close();
             uFileInputSt.close();
             return b;
          }else {
             b = c.a(new BufferedInputStream(inputStream), new BufferedInputStream(uFileInputSt));
             inputStream.close();
             zipFile.close();
             uFileInputSt.close();
             return e0;
          }
       }catch(java.io.IOException e0){
       }
    }
    public static boolean a(ZipInputStream p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(p1, b);
          byte[] uobyteArray = new byte[1024];
          int i = p0.read(uobyteArray);
          while (i > 0) {
             uFileOutputS.write(uobyteArray, b, i);
          }
          uFileOutputS.flush();
          uFileOutputS.close();
          uFileOutputS.close();
          return true;
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public static InputStream b(ZipFile p0,String p1){
       InputStream inputStream = null;
       Enumeration obj = PatchProxy.applyTwoRefs(p0, p1, inputStream, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.entries();
          while (obj.hasMoreElements()) {
             ZipEntry zipEntry = obj.nextElement();
             Object[] objArray = new Object[]{c.a()};
             if ((zipEntry.getName()).equals("lib/"+p1+"/"+String.format("lib%s.so", objArray)) && !p1.contains("../")) {
                inputStream = p0.getInputStream(zipEntry);
                break ;
             }
          }
       }catch(java.io.IOException e9){
          e9.printStackTrace();
       }
       return inputStream;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = new String(Base64.decode("bGlia3dzZ21haW4uc28=", 0));
       String str1 = b.i().j().c().getFilesDir().getAbsolutePath()+File.separator+"seaio/"+str;
       byte[] uobyteArray = j.a(new String(Base64.decode("aHR0cDovL3N0YXRpYy55eGltZ3MuY29tL3VkYXRhL3BrZy9rd2FpLWNsaWVudC1pbWFnZS9zYWlvX2d1YXYyX3JhbmRvbXNz", 0)), str);
       Object[] objArray = new Object[]{str1,c.a(uobyteArray)};
       System.load(str1);
       KSecurityTrack.sLog(38);
       Object[] objArray1 = new Object[0];
       d.a(d$b.f, String.format("retry Load 3 success"+String.format("\t\t%s[%s]\r\n", objArray), objArray1), b.m);
       return 1;
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       File uFile = new File(p0.getFilesDir().getPath(), "KWSG_LIB");
       Object[] objArray = new Object[]{c.a()};
       File uFile1 = new File(uFile.getAbsolutePath(), String.format("lib%.so", objArray));
       if (!uFile.exists()) {
          uFile.mkdir();
       }
       String packageResou = p0.getPackageResourcePath();
       String str = i.a();
       if (str == null) {
          KSecurityTrack.sLog(34);
          return b;
       }else {
          c.a = b;
          if (uFile1.exists()) {
             if (!c.a(packageResou, str, uFile1.getAbsolutePath())) {
                uFile1.delete();
             }else {
                KSecurityTrack.sLog(35);
                System.load(uFile1.getAbsolutePath());
                c.a = true;
                Object[] objArray3 = new Object[b];
                d.a(d$b.f, String.format("retry Load 1 success", objArray3), b.m);
             }
          }
          if (c.a) {
             KSecurityTrack.sLog(37);
             return c.a;
          }else {
             boolean b1 = c.a(packageResou, str, uFile);
             if (b1) {
                KSecurityTrack.sLog(39);
                System.load(uFile1.getAbsolutePath());
                c.a = true;
                Object[] objArray1 = new Object[b];
                d.a(d$b.f, String.format("retry Load 2 success", objArray1), b.m);
             }else {
                Object[] objArray2 = new Object[b];
                d.a(d$b.f, String.format("retry Load unzip so failure", objArray2), b.m);
             }
             return c.a;
          }
       }
    }
    public static boolean b(String p0,String p1,File p2){
       ZipInputStream zipInputStre;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = 0;
       try{
          FileInputStream uFileInputSt = new FileInputStream(new File(p0));
          try{
             zipInputStre = new ZipInputStream(uFileInputSt);
             String str = null;
             for (ZipEntry nextEntry = zipInputStre.getNextEntry(); nextEntry != null; nextEntry = zipInputStre.getNextEntry()) {
                Object[] objArray = new Object[]{c.a()};
                if ((nextEntry.getName()).equals("lib/"+p1+"/"+String.format("lib%s.so", objArray))) {
                   str = nextEntry.getName();
                   int i1 = str.lastIndexOf(47) + 1;
                   str = str.substring(i1);
                   File uFile = new File(p2, str);
                   nextEntry = (!uFile.exists() || uFile.lastModified() - nextEntry.getTime() < 0)? 1: null;
                   if (nextEntry) {
                      c.a(zipInputStre, uFile);
                   }
                   str = 1;
                }
             }
             try{
                zipInputStre.close();
                zipInputStre.close();
             }catch(java.lang.Exception e9){
                e9.printStackTrace();
             }
             return str;
          }catch(java.lang.Exception e9){
             int i = zipInputStre;
          }
          throw e9;
       }catch(java.lang.Exception e9){
          goto label_00ab ;
       }
    }
}
