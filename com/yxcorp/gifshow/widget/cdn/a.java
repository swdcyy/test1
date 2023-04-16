package com.yxcorp.gifshow.widget.cdn.a;
import java.io.File;
import java.lang.String;
import qkd.b;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Object;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.cdn.PreloadZipException;
import java.lang.Exception;
import zyc.b;
import java.lang.System;
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

public class a	// class@00196a
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
          uFile = new File(uFile, a.e(stringArray[i], p2));
       }
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return new File(uFile, a.e(stringArray[(stringArray.length - 1)], p2));
    }
    public static String d(ZipEntry p0){
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static String e(String p0,Charset p1){
       if (p1 != null && p1.equals(a.b())) {
          return new String(p0.getBytes("8859_1"), "GB2312");
       }
       return p0;
    }
    public static void f(File p0,String p1,String p2){
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       File[] uFileArray = p0.listFiles();
       String str = "rename failed, ";
       int i = 0;
       if (uFileArray.length == 1 && !TextUtils.isEmpty(p2)) {
          if (!uFileArray[i].renameTo(a.a(uFile, p2))) {
             throw new IOException(str+uFile);
          }
       }else {
          int len = uFileArray.length;
          while (true) {
             if (i < len) {
                object oobject = uFileArray[i];
                if (oobject.renameTo(a.a(uFile, oobject.getName()))) {
                   i = i + 1;
                }else {
                   throw new IOException(str+uFile);
                }
             }
          }
       }
       if (uFile.length() - 0x5f5e100 > 0) {
          b.c(new PreloadZipException("unzip file: "+uFile.getPath()+" size: "+uFile.length()));
       }
       return;
    }
    public static void g(File p0,String p1){
       Charset uCharset = a.b();
       String str = new File(p1).getPath()+"_folder_"+System.currentTimeMillis();
       File uFile = new File(str);
       uFile.mkdirs();
       if (p0.length() - 0x5f5e100 > 0) {
          b.c(new PreloadZipException("unzip file: "+p0.getPath()+" size: "+p0.length()));
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
             new File(a.e(new File(uFile, a.d(zipEntry)).getPath(), uCharset)).mkdirs();
          }else {
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(a.c(str, a.d(zipEntry), uCharset)));
             BufferedInputStream uBufferedInp = new BufferedInputStream(zipFile.getInputStream(zipEntry));
             int i = 0;
             int i1 = uBufferedInp.read(uobyteArray, i, 1024);
             while (i1 != -1) {
                uBufferedOut.write(uobyteArray, i, i1);
             }
             p.c(uBufferedInp);
             p.d(uBufferedOut);
          }
       }
       a.f(uFile, p1, null);
       p.g(zipFile);
       b.m(uFile);
       uFile.delete();
       return;
    }
}
