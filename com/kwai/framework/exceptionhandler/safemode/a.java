package com.kwai.framework.exceptionhandler.safemode.a;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import com.kwai.framework.exceptionhandler.safemode.a$f;
import com.kwai.framework.exceptionhandler.safemode.a$d;
import com.kwai.framework.exceptionhandler.safemode.a$a;
import com.kwai.framework.exceptionhandler.safemode.a$e;
import com.kwai.framework.exceptionhandler.safemode.a$b;
import java.io.Closeable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.exceptionhandler.safemode.a$c;
import android.content.Context;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.lang.Exception;
import java.util.HashMap;
import qkd.b;
import j80.f;

public class a	// class@00154a
{
    public a$f[] a;
    public static RecoverMessage b;
    public static final Pattern c;

    static {
       a.c = Pattern.compile(".*at\\s+\(.*\)\\.\(.*\)\\\(\(\(.*\):\(-?\\d+\)|Native method\)\\\)", 66);
    }
    public void a(){
       super();
       a$f[] uofArray = new a$f[]{new a$d(this, null),new a$e(this, null),new a$b(this)};
       this.a = uofArray;
    }
    public static void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "9")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static a d(){
       return a$c.a;
    }
    public Pair b(Context p0){
       String name;
       File uFile2;
       Closeable uCloseable;
       Closeable uCloseable1;
       FileInputStream uFileInputSt;
       Closeable uCloseable2;
       int i3;
       Object obj = this;
       Object obj1 = p0;
       ArrayList obj2 = PatchProxy.applyOneRefs(obj1, obj, a.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = new ArrayList();
       a$a uoa = null;
       obj2.add(new a$e(obj, uoa));
       obj2.add(new a$d(obj, uoa));
       Iterator iterator = obj2.iterator();
       while (true) {
          if (iterator.hasNext()) {
             a$f uof = iterator.next();
             File uFile = uof.a(obj1);
             if (uFile != null && uFile.exists()) {
                File[] uFileArray = uFile.listFiles();
                int len = uFileArray.length;
                int i = 0;
                while (true) {
                   if (i < len) {
                      object oobject = uFileArray[i];
                      if (oobject.getName() != null && (oobject.getName()).startsWith("main")) {
                         name = oobject.getName();
                         File uFile1 = uof.b(obj1);
                         uFile1.mkdirs();
                         uFile2 = new File(uFile1, name+".zip");
                         File[] uFileArray1 = oobject.listFiles();
                         String path = uFile2.getPath();
                         if (!PatchProxy.applyVoidTwoRefs(uFileArray1, path, uoa, a.class, "8")) {
                            try{
                               try{
                                  FileOutputStream uFileOutputS = new FileOutputStream(path);
                                  uCloseable1 = new ZipOutputStream(new BufferedOutputStream(uFileOutputS));
                                  try{
                                     int i1 = 4096;
                                     byte[] uobyteArray = new byte[i1];
                                     int i2 = 0;
                                     while (true) {
                                        if (i2 < uFileArray1.length) {
                                           try{
                                              object oobject1 = uFileArray1[i2];
                                              try{
                                                 uFileInputSt = new FileInputStream(oobject1);
                                                 try{
                                                    BufferedInputStream uBufferedInp = new BufferedInputStream(uFileInputSt, i1);
                                                    path = uFileArray1[i2].getAbsolutePath();
                                                    i1 = path.lastIndexOf("/") + 1;
                                                    uCloseable1.putNextEntry(new ZipEntry(path.substring(i1)));
                                                    i1 = 4096;
                                                    i3 = 0;
                                                    try{
                                                       int i4 = uBufferedInp.read(uobyteArray, i3, i1);
                                                       while (i4 != -1) {
                                                          uCloseable1.write(uobyteArray, i3, i4);
                                                          i1 = 4096;
                                                       }
                                                       a.a(uBufferedInp);
                                                       uCloseable2 = uFileInputSt;
                                                       uBufferedInp = null;
                                                    label_010b :
                                                       a.a(uoa);
                                                       i2 = i2 + 1;
                                                       i1 = 4096;
                                                    }catch(java.lang.Exception e0){
                                                    }
                                                    uCloseable2 = uFileInputSt;
                                                    Closeable uCloseable3 = uBufferedInp;
                                                 }catch(java.lang.Exception e0){
                                                    i3 = 0;
                                                    goto label_00f5 ;
                                                 }
                                              }catch(java.lang.Exception e0){
                                                 uCloseable2 = uFileInputSt;
                                              }
                                              e0.printStackTrace();
                                              a.a(uoa);
                                              goto label_010b ;
                                           }catch(java.lang.Exception e0){
                                           }catch(java.lang.Exception e0){
                                           }
                                           e0.printStackTrace();
                                        label_0139 :
                                           a.a(uCloseable1);
                                           a.a(uCloseable);
                                        }else {
                                           goto label_0139 ;
                                        }
                                     }
                                  }catch(java.lang.Exception e0){
                                  }
                               }catch(java.lang.Exception e0){
                               }
                               uCloseable1 = null;
                               goto label_0136 ;
                            }catch(java.lang.Exception e0){
                               uCloseable = null;
                               goto label_0135 ;
                            }
                         }
                         if (uFile2.length() - null > 0) {
                         }else {
                            b.q(uFile2);
                         }
                      }else {
                         i = i + 1;
                         uoa = null;
                      }
                   }
                }
                return uoa;
             }
             uoa = null;
          }else {
             goto label_0177 ;
          }
       }
       new HashMap().put("mLogUUID", name);
       return new Pair(name, uFile2);
    }
    public File c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(f.b(p0), "exception");
    }
}
