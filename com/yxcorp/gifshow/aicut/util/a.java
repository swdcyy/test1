package com.yxcorp.gifshow.aicut.util.a;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qkd.b;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.System;
import i69.d;
import j69.a;
import j69.b;
import java.util.zip.ZipFile;
import java.util.Enumeration;
import com.yxcorp.utility.TextUtils;
import h69.g;
import q87.c;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import ekd.p;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.Throwable;

public class a	// class@001977
{

    public void a(){
       super();
    }
    public static File a(File p0,String p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0, p1);
       if (obj.exists()) {
          b.m(obj);
          obj.delete();
       }
       return obj;
    }
    public static Charset b(){
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Charset.forName("8859_1");
       }catch(java.lang.Exception e0){
          return Charset.defaultCharset();
       }
    }
    public static File c(String p0,String p1,Charset p2){
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = p1.split("/");
       obj = new File(p0);
       if (stringArray.length < 1) {
          return obj;
       }
       int i = 0;
       int i1 = stringArray.length - 1;
       while (i < i1) {
          i++;
          obj = new File(obj, a.e(stringArray[i], p2));
       }
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return new File(obj, a.e(stringArray[(stringArray.length - 1)], p2));
    }
    public static String d(ZipEntry p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static String e(String p0,Charset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && p1.equals(a.b())) {
          return new String(p0.getBytes("8859_1"), "GB2312");
       }
       return p0;
    }
    public static void f(File p0,String p1){
       String str2;
       Object[] objArray;
       Enumeration obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, null, a.class, "1")) {
          return;
       }
       Charset uCharset = a.b();
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, uCharset, null, a.class, "3") && !PatchProxy.applyVoidFourRefs(p0, p1, null, uCharset, null, a.class, "4")) {
          String str = new File(obj1).getPath()+"_folder_"+System.currentTimeMillis();
          File uFile = new File(str);
          uFile.mkdirs();
          String str1 = "fileSize";
          if (p0.length() - 0x5f5e100 > 0) {
             d.d.a().b().logCustomEvent("ks://resource/bug", str1+p0.length()+"zipfile"+p0.getPath());
          }
          ZipFile zipFile = new ZipFile(obj);
          obj = zipFile.entries();
          int i = 1024;
          byte[] uobyteArray = new byte[i];
          int i1 = 0;
          while (obj.hasMoreElements()) {
             ZipEntry zipEntry = obj.nextElement();
             str2 = "debug";
             if (TextUtils.x(zipEntry.getName())) {
                objArray = new Object[i1];
                g.D().s(str2, "empty"+zipEntry.getName(), objArray);
             }
             objArray = new Object[i1];
             g.D().s(str2, "ze name"+zipEntry.getName(), objArray);
             if (zipEntry.isDirectory()) {
                new File(a.e(new File(uFile, a.d(zipEntry)).getPath(), uCharset)).mkdirs();
             }else {
                BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(a.c(str, a.d(zipEntry), uCharset)));
                BufferedInputStream uBufferedInp = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                int i2 = uBufferedInp.read(uobyteArray, i1, i);
                while (i2 != -1) {
                   uBufferedOut.write(uobyteArray, i1, i2);
                }
                p.c(uBufferedInp);
                p.d(uBufferedOut);
             }
             String str3 = null;
          }
          File uFile1 = new File(obj1);
          if (!uFile1.exists()) {
             uFile1.mkdirs();
          }
          File[] uFileArray = uFile.listFiles();
          str2 = "rename failed, ";
          if (uFileArray.length == 1) {
             CharSequence uCharSequenc = null;
             if (!TextUtils.isEmpty(uCharSequenc)) {
                if (uFileArray[i1].renameTo(a.a(uFile1, uCharSequenc))) {
                label_01cc :
                   if (uFile1.length() - 0x5f5e100 > 0) {
                      d.d.a().b().logCustomEvent("ks://resource/bug", str1+uFile1.length()+"targetFile"+uFile1.getPath());
                   }
                   p.g(zipFile);
                   b.m(uFile);
                   uFile.delete();
                }else {
                   throw new IOException(str2+uFile1);
                }
             }
          }
          i = uFileArray.length;
          while (true) {
             if (i1 < i) {
                object oobject = uFileArray[i1];
                if (oobject.renameTo(a.a(uFile1, oobject.getName()))) {
                   i1 = i1 + 1;
                }else {
                   throw new IOException(str2+uFile1);
                }
             }else {
                goto label_01cc ;
             }
          }
       }
       return;
    }
}
