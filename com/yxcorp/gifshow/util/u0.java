package com.yxcorp.gifshow.util.u0;
import java.io.File;
import java.lang.String;
import qkd.b;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Long;
import k2b.u1;
import java.util.zip.ZipFile;
import java.util.Enumeration;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import ekd.p;
import java.lang.Throwable;
import android.text.TextUtils;

public class u0	// class@001fb2
{

    public static File a(File p0,String p1){
       File uFile = new File(p0, p1);
       if (uFile.exists()) {
          b.m(uFile);
          uFile.delete();
       }
       return uFile;
    }
    public static Charset b(){
       try{
          return Charset.forName("8859_1");
       }catch(java.lang.Exception e0){
          return Charset.defaultCharset();
       }
    }
    public static File c(String p0,String p1,Charset p2){
       String[] stringArray = p1.split("/");
       File uFile = new File(p0);
       if (stringArray.length < 1) {
          return uFile;
       }
       int i = 0;
       int i1 = stringArray.length - 1;
       while (i < i1) {
          i++;
          uFile = new File(uFile, u0.e(stringArray[i], p2));
       }
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return new File(uFile, u0.e(stringArray[(stringArray.length - 1)], p2));
    }
    public static String d(ZipEntry p0){
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static String e(String p0,Charset p1){
       if (p1 != null && p1.equals(u0.b())) {
          return new String(p0.getBytes("8859_1"), "GB2312");
       }
       return p0;
    }
    public static void f(File p0,String p1){
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       File[] uFileArray = p0.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          object oobject = uFileArray[i];
          File uFile1 = new File(uFile, oobject.getName());
          if (uFile1.exists()) {
             if (uFile1.isFile() || oobject.isFile()) {
                b.x(uFile1);
                if (!oobject.renameTo(uFile1)) {
                   break ;
                }
             }else {
                u0.f(oobject, uFile1.getAbsolutePath());
             }
          }else if(oobject.renameTo(uFile1)){
             throw new IOException("rename failed, "+uFile);
          }
          i = i + 1;
       }
       throw new IOException("rename failed, "+uFile);
    }
    public static File g(File p0,String p1,Charset p2){
       Charset uCharset = p2;
       String str = new File(p1).getPath()+"_folder_"+System.currentTimeMillis();
       File uFile = new File(str);
       uFile.mkdirs();
       if (p0.length() - 0x5f5e100 > 0) {
          Object[] objArray = new Object[]{"fileSize",Long.valueOf(p0.length()),"zipfile",p0.getPath()};
          u1.onEvent("ks://resource/bug", "upzip", objArray);
       }
       ZipFile zipFile = new ZipFile(p0);
       Enumeration uEnumeration = zipFile.entries();
       byte[] uobyteArray = new byte[1024];
       while (uEnumeration.hasMoreElements()) {
          ZipEntry zipEntry = uEnumeration.nextElement();
          String str1 = "debug";
          if (TextUtils.x(zipEntry.getName())) {
             Log.b(str1, "empty"+zipEntry.getName());
          }
          Log.b(str1, "ze name"+zipEntry.getName());
          if (zipEntry.isDirectory()) {
             new File(u0.e(new File(uFile, u0.d(zipEntry)).getPath(), uCharset)).mkdirs();
          }else {
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(u0.c(str, u0.d(zipEntry), uCharset)));
             BufferedInputStream uBufferedInp = new BufferedInputStream(zipFile.getInputStream(zipEntry));
             int i = uBufferedInp.read(uobyteArray, 0, 1024);
             while (i != -1) {
                uBufferedOut.write(uobyteArray, 0, i);
             }
             p.c(uBufferedInp);
             p.d(uBufferedOut);
          }
       }
       p.g(zipFile);
       return uFile;
    }
    public static void h(File p0,String p1,String p2){
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray.length == 1 && !TextUtils.isEmpty(p2)) {
          if (!uFileArray[0].renameTo(u0.a(uFile, p2))) {
             throw new IOException("rename failed, "+uFile);
          }
       }else {
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = uFileArray[i];
                if (oobject.renameTo(u0.a(uFile, oobject.getName()))) {
                   i++;
                }else {
                   throw new IOException("rename failed, "+uFile);
                }
             }
          }
       }
       if (uFile.length() - 0x5f5e100 > 0) {
          Object[] objArray = new Object[]{"fileSize",Long.valueOf(uFile.length()),"targetFile",uFile.getPath()};
          u1.onEvent("ks://resource/bug", "upzip", objArray);
       }
       return;
    }
    public static void i(File p0,String p1){
       u0.l(p0, p1, u0.b());
    }
    public static void j(File p0,String p1,String p2){
       u0.k(p0, p1, p2, u0.b());
    }
    public static void k(File p0,String p1,String p2,Charset p3){
       p0 = u0.g(p0, p1, p3);
       u0.h(p0, p1, p2);
       b.m(p0);
       p0.delete();
    }
    public static void l(File p0,String p1,Charset p2){
       u0.k(p0, p1, null, p2);
    }
}
