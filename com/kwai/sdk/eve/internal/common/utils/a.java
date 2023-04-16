package com.kwai.sdk.eve.internal.common.utils.a;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import java.lang.Number;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.io.ByteArrayInputStream;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.util.zip.ZipInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Exception;

public class a	// class@0014b3
{

    public void a(){
       super();
    }
    public static boolean a(Closeable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       try{
          p0.close();
          return true;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean b(File p0){
       File[] obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.isDirectory()) {
          obj = p0.listFiles();
          if (obj != null) {
             int len = obj.length;
             int i = 0;
             while (i < len) {
                if (!a.b(obj[i])) {
                   return false;
                }
                i = i + 1;
             }
          }
       }
       return p0.delete();
    }
    public static void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "30")) {
          return;
       }
       if (p0.isFile()) {
          p0.delete();
          return;
       }else if(p0.isDirectory()){
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null || !uFileArray.length) {
             p0.delete();
          }else {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                a.c(uFileArray[i]);
             }
             p0.delete();
          }
       }
       return;
    }
    public static long d(File p0){
       long l;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0.isDirectory()) {
          l = 0;
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             l = l + a.d(uFileArray[i]);
          }
       }else {
          l = p0.length();
       }
       return l;
    }
    public static String e(File p0){
       Closeable obj = PatchProxy.applyOneRefs(p0, null, a.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null || !p0.exists()) {
          }else {
             FileInputStream uFileInputSt = new FileInputStream(p0);
             a.a(uFileInputSt);
             return a.f(uFileInputSt);
          }
       }catch(java.lang.Exception e0){
          obj = null;
          a.a(obj);
       }catch(java.lang.Exception e0){
       }
       return null;
    }
    public static String f(InputStream p0){
       BufferedInputStream obj = PatchProxy.applyOneRefs(p0, null, a.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new BufferedInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          StringBuilder str = new StringBuilder(32);
          byte[] uobyteArray = new byte[0x19000];
          int i = obj.read(uobyteArray);
          int i1 = 0;
          while (i != -1) {
             instance.update(uobyteArray, i1, i);
          }
          byte[] uobyteArray1 = instance.digest();
          for (; i1 < uobyteArray1.length; i1 = i1 + 1) {
             int i2 = uobyteArray1[i1] & 0x00ff;
             i2 = i2 + 256;
             str = str+(Integer.toString(i2, 16)).substring(1);
          }
          return str;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.f(new ByteArrayInputStream(p0.getBytes()));
    }
    public static String h(ZipEntry p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static void i(File p0,String p1){
       IOException iOException;
       ZipInputStream zipInputStre;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "29")) {
          return;
       }
       File uFile = new File(p1);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       try{
          try{
             FileInputStream uFileInputSt = new FileInputStream(p0);
             try{
                zipInputStre = new ZipInputStream(uFileInputSt);
                byte[] uobyteArray = new byte[0x100000];
                for (ZipEntry nextEntry = zipInputStre.getNextEntry(); nextEntry != null; nextEntry = zipInputStre.getNextEntry()) {
                   if (nextEntry.isDirectory()) {
                      new File(p1+File.separator+a.h(nextEntry)).mkdirs();
                   }else {
                      File uFile1 = new File(p1+File.separator+a.h(nextEntry));
                      if (!uFile1.getParentFile().exists()) {
                         uFile1.getParentFile().mkdirs();
                      }
                      uFile1.createNewFile();
                      FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
                      int i1 = zipInputStre.read(uobyteArray);
                      while (i1 > 0) {
                         uFileOutputS.write(uobyteArray, 0, i1);
                      }
                      try{
                         uFileOutputS.close();
                      }catch(java.io.IOException e2){
                         e2.printStackTrace();
                      }
                   }
                }
                try{
                   uFileInputSt.close();
                }catch(java.lang.Exception e8){
                   e8.printStackTrace();
                }
             }catch(java.io.IOException e8){
                int i = zipInputStre;
             }
             zipInputStre = null;
             InputStream inputStream = uFileInputSt;
          }catch(java.io.IOException e7){
             iOException = e7;
             goto label_00c8 ;
          }
       }catch(java.io.IOException e7){
          iOException = e7;
          zipInputStre = null;
       }
       iOException.printStackTrace();
       if (null) {
          try{
             null.close();
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
}
