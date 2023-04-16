package com.kuaishou.webkit.internal.FileUtils;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileDescriptor;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import com.kuaishou.webkit.internal.FileUtils$1;
import java.io.FilenameFilter;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import android.os.Environment;
import android.os.StatFs;

public class FileUtils	// class@001315
{

    public void FileUtils(){
       super();
    }
    public static String calculateFileMD5(File p0){
       String str = null;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          try{
             FileInputStream uFileInputSt = new FileInputStream(p0);
             byte[] uobyteArray = new byte[8192];
             try{
                int i = uFileInputSt.read(uobyteArray);
                while (i > 0) {
                   instance.update(uobyteArray, 0, i);
                }
                Object[] objArray = new Object[]{new BigInteger(1, instance.digest()).toString(16)};
                String str1 = (String.format("%32s", objArray)).replace(' ', '0');
                try{
                   uFileInputSt.close();
                   return str1;
                }catch(java.io.IOException e0){
                }
             }catch(java.io.IOException e4){
                throw new RuntimeException("Unable to process file for MD5", e4);
             }
          }catch(java.io.FileNotFoundException e0){
             return e0;
          }
       }catch(java.security.NoSuchAlgorithmException e0){
       }
    }
    public static boolean contentEquals(File p0,File p1){
       int i1;
       boolean b = p0.exists();
       if (b != p1.exists()) {
          return false;
       }
       if (!b) {
          return true;
       }
       if (p0.isDirectory() || p1.isDirectory()) {
          throw new IOException("Can\'t compare directories, only files");
       }
       if (p0.length() - p1.length()) {
          return false;
       }
       if (p0.getCanonicalFile().equals(p1.getCanonicalFile())) {
          return true;
       }
       byte[] uobyteArray = new byte[8192];
       byte[] uobyteArray1 = new byte[8192];
       int i = 0;
       try{
          try{
             FileInputStream uFileInputSt = new FileInputStream(p0);
             FileInputStream uFileInputSt1 = new FileInputStream(p1);
             try{
                while (true) {
                   int i2 = uFileInputSt.read(uobyteArray);
                   if (i2 > 0) {
                      if (i2 != uFileInputSt1.read(uobyteArray1)) {
                         try{
                            uFileInputSt.close();
                            uFileInputSt1.close();
                            break ;
                         }catch(java.io.IOException e0){
                         }
                      }else {
                         if (!Arrays.equals(uobyteArray, uobyteArray1)) {
                            try{
                               uFileInputSt.close();
                               uFileInputSt1.close();
                               return false;
                            }catch(java.io.IOException e0){
                            }
                         }
                      }
                   }else {
                      try{
                         uFileInputSt.close();
                         uFileInputSt1.close();
                         return true;
                      }catch(java.io.IOException e0){
                      }
                   }
                }
                return false;
             }catch(java.io.IOException e8){
             }
             i = uFileInputSt;
          }catch(java.io.IOException e8){
             i1 = i;
             goto label_007a ;
          }
       }catch(java.io.IOException e8){
          i1 = i;
       }
       throw new RuntimeException("Unable to process file for sameContent", e8);
    }
    public static boolean copyFile(File p0,File p1){
       return FileUtils.copyFile(p0, p1, true);
    }
    public static boolean copyFile(File p0,File p1,boolean p2){
       String canonicalPat;
       BufferedInputStream uBufferedInp;
       BufferedOutputStream uBufferedOut;
       try{
          canonicalPat = p1.getCanonicalPath();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          canonicalPat = "";
       }
       int i = 0;
       if (!p1.exists()) {
          String separator = File.separator;
          if (canonicalPat.lastIndexOf(separator) >= 0) {
             FileUtils.makeDir(canonicalPat.substring(i, canonicalPat.lastIndexOf(separator)));
          }
       }
       if (p2 && !FileUtils.deleteFileOrDir(p1)) {
          return i;
       }else {
          byte[] uobyteArray = null;
          try{
             FileInputStream uFileInputSt = new FileInputStream(p0);
             try{
                uBufferedInp = new BufferedInputStream(uFileInputSt, 8192);
                FileOutputStream uFileOutputS = new FileOutputStream(p1);
                try{
                   uBufferedOut = new BufferedOutputStream(uFileOutputS, 8192);
                   uobyteArray = new byte[8192];
                   int i1 = uBufferedInp.read(uobyteArray, i, 8192);
                   while (i1 != -1) {
                      uBufferedOut.write(uobyteArray, i, i1);
                   }
                   try{
                      uBufferedOut.flush();
                      uFileOutputS.getFD().sync();
                      if (!p0.length() - p1.length()) {
                         i = true;
                      }
                      uBufferedOut.close();
                      uBufferedInp.close();
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.io.IOException e7){
                   BufferedOutputStream uBufferedOut1 = uBufferedOut;
                }
             }catch(java.io.IOException e7){
             }
          }catch(java.io.IOException e7){
             uBufferedInp = uobyteArray;
          }catch(java.io.IOException e7){
             e7.printStackTrace();
          }
       label_0090 :
          return i;
       }
    }
    public static void copyStream(InputStream p0,OutputStream p1){
       byte[] uobyteArray = new byte[8192];
       int i = p0.read(uobyteArray);
       while (i != -1) {
          p1.write(uobyteArray, 0, i);
       }
       return;
    }
    public static void copyStreamToFile(InputStream p0,File p1){
       File uFile = new File(p1.getPath()+".tmp");
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       FileUtils.copyStream(p0, uFileOutputS);
       uFileOutputS.close();
       if (uFile.renameTo(p1)) {
          return;
       }
       throw new IOException();
    }
    public static boolean deleteFileOrDir(File p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = 1;
       if (p0.exists()) {
          if (p0.isFile()) {
             i = i & p0.delete();
          }else if(p0.isDirectory()){
             File[] uFileArray = p0.listFiles();
             if (uFileArray != null) {
                for (; b < uFileArray.length; b = b + 1) {
                   i = i & FileUtils.deleteFileOrDir(uFileArray[b]);
                }
             }
             i = i & p0.delete();
          }
       }
       return i;
    }
    public static boolean extractAsset(Context p0,String p1,File p2){
       try{
          InputStream inputStream = SplitAssetHelper.open(p0.getAssets(), p1);
          FileUtils.copyStreamToFile(inputStream, p2);
          if (inputStream != null) {
             inputStream.close();
          }
          return true;
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public static String getDirectoryFilesSnapshot(File p0){
       if (p0 == null) {
          return "fn1";
       }
       if (!p0.exists()) {
          return "fnot_"+p0.getAbsolutePath();
       }
       try{
          String[] stringArray = p0.list(new FileUtils$1());
          if (stringArray != null) {
             return TextUtils.join("-", stringArray);
          }
          return "fn5";
       }catch(java.lang.Exception e2){
          return "fne_"+e2.getMessage();
       }
    }
    public static long getRomAvailableSize(){
       StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
       return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
    }
    public static long getRomTotalSize(){
       StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
       return (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
    }
    public static final boolean isLegalFile(File p0){
       boolean b = (p0 != null && (p0.exists() && (p0.canRead() && (p0.isFile() && p0.length() > 0))))? true: false;
       return b;
    }
    public static String listDirToString(String p0,File p1){
       if (p1.isDirectory()) {
          String[] stringArray = p1.list();
          if (stringArray != null) {
             p0 = TextUtils.join(p0, stringArray);
          label_0012 :
             if (TextUtils.isEmpty(p0)) {
                p0 = "";
             }
             return p0;
          }
       }
       CharSequence uCharSequenc = null;
       goto label_0012 ;
    }
    public static boolean makeDir(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return uFile.mkdirs();
       }
       return true;
    }
    public static boolean makeSureDirExist(File p0){
       if (!p0.exists()) {
          return p0.mkdirs();
       }
       return true;
    }
    public static boolean moveFile(File p0,File p1){
       if (p0.exists() && p0.isFile()) {
          File parentFile = p1.getParentFile();
          if (parentFile != null && (!parentFile.exists() && !parentFile.mkdirs())) {
             return false;
          }else if(p0.renameTo(p1) || FileUtils.copyFile(p0, p1, true)){
             parentFile = 1;
          }else {
             parentFile = 0;
          }
          if (parentFile && p1.exists()) {
             p0.delete();
             return true;
          }
       }
       return false;
    }
}
