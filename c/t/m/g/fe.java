package c.t.m.g.fe;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.System;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.lang.StringBuilder;
import android.os.Build;
import c.t.m.g.ex;
import java.lang.CharSequence;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import android.content.pm.ApplicationInfo;
import c.t.m.g.ey;
import java.lang.Throwable;

public class fe	// class@000c8b
{
    public static boolean a;

    public static int a(Context p0,String p1){
       if (!fe.b(p0)) {
          return -1;
       }
       File uFile = fe.b(p0, p1);
       if (!uFile.exists()) {
          return -2;
       }
       System.load(uFile.getAbsolutePath());
       return 0;
    }
    public static File a(Context p0){
       return p0.getDir("TFLlib", 0);
    }
    public static ZipEntry a(ZipFile p0,String p1){
       String str = "lib/";
       ZipEntry entry = p0.getEntry(str+Build.CPU_ABI+"/"+System.mapLibraryName(p1));
       if (entry != null) {
          return entry;
       }
       return p0.getEntry(str+Build.CPU_ABI2+"/"+System.mapLibraryName(p1));
    }
    public static void a(File p0){
       if (p0.exists() && (!p0.delete() && ex.a)) {
          ex.b("libLoaderForTFL", "Failed to delete "+p0.getAbsolutePath());
       }
    label_002a :
       return;
    }
    public static boolean a(Context p0,ZipFile p1,String p2){
       ZipEntry zipEntry = fe.a(p1, p2);
       boolean b = true;
       if (zipEntry == null) {
          if (ex.a) {
             ex.a("libLoaderForTFL", p2+": entry does not exists");
          }
          return b;
       }else {
          String name = zipEntry.getName();
          if (ex.a) {
             ex.a("libLoaderForTFL", p2+"  "+name);
          }
          if (name != null && name.contains("../")) {
             return b;
          }else {
             File uFile = fe.b(p0, p2);
             if (ex.a) {
                ex.a("libLoaderForTFL", p2+"  "+uFile.getAbsolutePath()+"  "+uFile.exists());
             }
             if (uFile.exists()) {
                uFile.delete();
             }
             try{
                if (!uFile.createNewFile()) {
                   if (ex.a) {
                      ex.a("libLoaderForTFL", p2+"  create file failed");
                   }
                   throw new IOException();
                }else {
                   InputStream inputStream = p1.getInputStream(zipEntry);
                   FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                   byte[] uobyteArray = new byte[0x4000];
                   do {
                   } while (inputStream.read(uobyteArray) > 0);
                   try{
                      inputStream.close();
                      try{
                         e0.close();
                         fe.b(uFile);
                         return false;
                      }catch(java.lang.Exception e0){
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }catch(java.io.IOException e8){
                if (ex.a) {
                   ex.a("libLoaderForTFL", p2+"  failed"+e8.getMessage());
                }
                fe.a(uFile);
                throw e8;
             }
          }
       }
    }
    public static File b(Context p0,String p1){
       return new File(fe.a(p0), System.mapLibraryName(p1));
    }
    public static void b(File p0){
       p0.setReadable(true, false);
       p0.setExecutable(true, false);
       p0.setWritable(true);
    }
    public static boolean b(Context p0){
       ZipFile zipFile;
       if (fe.a) {
          return false;
       }
       fe.a = true;
       File uFile = fe.a(p0);
       if (uFile.exists()) {
          fe.c(uFile);
       }else {
          uFile.mkdirs();
       }
       String[] stringArray = null;
       try{
          File uFile1 = new File(p0.getApplicationInfo().sourceDir);
          try{
             zipFile = new ZipFile(uFile1, true);
             stringArray = ey.a;
             int len = stringArray.length;
             for (int i = 0; i < len; i = i + 1) {
                fe.a(p0, zipFile, stringArray[i]);
             }
             try{
                zipFile.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.io.IOException e0){
             ZipFile zipFile1 = zipFile;
             try{
                fe.c(uFile);
                if (stringArray) {
                   stringArray.close();
                }
                return false;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.io.IOException e0){
       }
    }
    public static void c(File p0){
       if (ex.a) {
          ex.a("libLoaderForTFL", "delete");
       }
       try{
          File[] uFileArray = p0.listFiles();
          int i = 0;
          int len = (uFileArray != null)? uFileArray.length: 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject != null && (!oobject.delete() && ex.a)) {
                ex.b("libLoaderForTFL", "Failed to remove "+oobject.getAbsolutePath());
             }
          label_003d :
             i = i + 1;
          }
          return;
       }catch(java.lang.Exception e6){
          if (ex.a) {
             ex.a("libLoaderForTFL", "Failed to remove old libs, ", e6);
          }
          return;
       }
    }
}
