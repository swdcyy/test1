package com.kwai.robust.NativePatchHelper;
import java.lang.Object;
import android.content.Context;
import java.io.File;
import com.kwai.robust.NativeModel;
import android.content.pm.ApplicationInfo;
import java.util.zip.ZipFile;
import java.lang.String;
import java.util.zip.ZipEntry;
import com.kwai.robust.Utils;
import java.io.InputStream;
import com.kwai.robust.bsdiff.BSPatch;
import com.kwai.robust.RobustException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;

public class NativePatchHelper	// class@0013ed
{

    public void NativePatchHelper(){
       super();
    }
    public static void extractBsDiffInternals(Context p0,File p1,NativeModel p2,File p3){
       ZipFile zipFile = new ZipFile(p0.getApplicationInfo().sourceDir);
       ZipFile zipFile1 = new ZipFile(p1);
       p3 = p2.getNativeDir(p3);
       Utils.enforceDir(p3.getParentFile());
       InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(p2.getApkSoEntryName()));
       InputStream inputStream1 = zipFile1.getInputStream(zipFile1.getEntry(p2.getPatchEntryName()));
       int i = BSPatch.patchFast(inputStream, inputStream1, p3);
       int i1 = 1;
       if (i > i1) {
          throw new RobustException("extractBsDiff error: "+BSPatch.getErrorString(i));
       }
       if (inputStream1 != null) {
          inputStream1.close();
       }
       if (inputStream != null) {
          inputStream.close();
       }
       if ((Utils.md5(p3)).equalsIgnoreCase(p2.getNewMd5())) {
          zipFile1.close();
          zipFile.close();
          return;
       }else {
          Object[] objArray = new Object[i1];
          objArray[0] = p2.getApkSoEntryName();
          throw new RobustException(String.format("verify fail destFile=%s", objArray));
       }
    }
    public static void extractNative(Context p0,File p1,List p2,File p3){
       if (p2 == null || p2.isEmpty()) {
          throw new RobustException("verify nativeModels empty ");
       }
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          NativePatchHelper.extractBsDiffInternals(p0, p1, iterator.next(), p3);
       }
       return;
    }
    public static int getNewSoCountInNativeDir(File p0){
       int i = 0;
       if (p0.isDirectory() && p0.exists()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          int i1 = 0;
          while (true) {
             if (i < len) {
                object oobject = uFileArray[i];
                if (oobject.isFile() && (oobject.getName()).endsWith(".so")) {
                   i1 = i1 + 1;
                   i = i + 1;
                }else {
                   throw new RobustException("wrong file in native path: "+oobject.getAbsolutePath());
                }
             }else {
                i = i1;
                break ;
             }
          }
       }
       return i;
    }
    public static void verifyNativePatch(Context p0,List p1,String p2,File p3){
       NativeModel nativeModel;
       File nativeDir;
       String str;
       if (p1 == null || p1.isEmpty()) {
          throw new RobustException("verify nativeModels empty ");
       }
       Iterator iterator = p1.iterator();
       do {
          if (iterator.hasNext()) {
             nativeModel = iterator.next();
             nativeDir = nativeModel.getNativeDir(p3);
             if (!nativeDir.isFile() || !nativeDir.exists()) {
                throw new RobustException("verify extractedFile do dot exist:"+nativeDir+",models:"+nativeModel);
             }
          }else {
             int newSoCountIn = NativePatchHelper.getNewSoCountInNativeDir(p3);
             if (p1.size() == newSoCountIn) {
                return;
             }
             Object[] objArray1 = new Object[]{p3,Integer.valueOf(newSoCountIn),Integer.valueOf(p1.size())};
             throw new RobustException(String.format("verify fail: size do not match : %d : so count %d , model size: %d", objArray1));
          }
          str = Utils.md5(nativeDir);
       } while (str.equalsIgnoreCase(nativeModel.getNewMd5()));
       Object[] objArray = new Object[]{str,nativeModel};
       throw new RobustException(String.format("verify fail fileMd5=%s nativeModel=%s", objArray));
    }
}
