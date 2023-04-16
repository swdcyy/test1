package com.kuaishou.webkit.internal.loader.CommonUtils;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import com.kuaishou.webkit.internal.FileLockHelper;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import java.lang.Integer;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import android.app.Application;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.content.Context;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.FileUtils;

public class CommonUtils	// class@00132b
{
    public static final String[] KW_LIBS;
    public static boolean sDisableVersionLock;

    static {
       String[] stringArray = new String[]{"libkswebview.so","libkswebview_plat_support.so"};
       CommonUtils.KW_LIBS = stringArray;
    }
    public void CommonUtils(){
       super();
    }
    public static boolean IsVersionLocked(File p0){
       try{
          FileLockHelper uFileLockHel = CommonUtils.tryLockVersion(p0);
          if (uFileLockHel == null) {
             if (uFileLockHel != null) {
                uFileLockHel.close();
             }
             return true;
          }else {
             uFileLockHel.close();
             return false;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int compareVersion(String p0,String p1){
       int i2;
       if (TextUtils.equals(p0, p1)) {
          return 0;
       }
       String[] stringArray = p0.split("\\.");
       String[] stringArray1 = p1.split("\\.");
       int len = stringArray.length;
       int len1 = stringArray1.length;
       int i = Math.min(len, len1);
       int i1 = 0;
       while (true) {
          i2 = -1;
          if (i1 < i) {
             if (!TextUtils.equals(stringArray[i1], stringArray1[i1])) {
                int i3 = Integer.valueOf(stringArray[i1]).intValue();
                int i4 = Integer.valueOf(stringArray1[i1]).intValue();
                if (i3 != i4) {
                   if (i3 > i4) {
                      i2 = 1;
                      break ;
                   }
                   break ;
                }
             }
             i1 = i1 + 1;
          }else if(len != len1){
             if (len > len1) {
                i2 = 1;
             }
             return i2;
          }else {
             return 0;
          }
       }
       return i2;
    }
    public static void disableVersionLock(){
       CommonUtils.sDisableVersionLock = true;
    }
    public static File getCoreBaseDir(){
       String installDirec = InitSettingsImpl.getInstance().getInstallDirectory();
       if (TextUtils.isEmpty(installDirec)) {
          installDirec = KsWebViewUtils.getApplicationContext().getFilesDir().getAbsolutePath();
       }
       return new File(installDirec, "ks_webview");
    }
    public static File getFixedOptDir(Context p0,String p1){
       int i = 0;
       try{
          File coreBaseDir = CommonUtils.getCoreBaseDir();
          if (!coreBaseDir.exists()) {
             coreBaseDir.mkdirs();
          }
          File uFile = (TextUtils.isEmpty(p1))? new File(coreBaseDir, "opt"): new File(coreBaseDir, p1);
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          return i;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isOptimizedPathFor(String p0,String p1){
       File parentFile;
       String name;
       int i;
       File uFile = new File(p0);
       boolean b = false;
       if (!uFile.exists()) {
          return b;
       }
       if (KsWebViewUtils.isAfterAndroidO()) {
          try{
             p0 = KsWebViewUtils.getsCurrentInstructionSet();
             parentFile = uFile.getParentFile();
             name = uFile.getName();
             i = name.lastIndexOf(46);
             if (i > 0) {
                name = name.substring(b, i);
             }
             parentFile = new File(parentFile.getAbsolutePath()+"/oat/"+p0+"/"+name+".odex");
          }catch(java.lang.Exception e0){
             return b;
          }
       }else {
          p0 = uFile.getName();
          name = ".dex";
          if (!p0.endsWith(name)) {
             i = p0.lastIndexOf(".");
             p0 = (i < 0)? p0+name: new StringBuilder((i + 4))+p0+name;
          }
       label_008c :
          parentFile = new File(p1, p0);
       }
       return FileUtils.isLegalFile(parentFile);
    }
    public static FileLockHelper tryLockVersion(File p0){
       if (CommonUtils.sDisableVersionLock || !p0.exists()) {
          return null;
       }
       return FileLockHelper.tryGetFileLock(new File(p0, "version.lock"));
    }
    public static boolean versionSupported(String p0){
       String lastVersionS = InitSettingsImpl.getInstance().getLastVersionSupported();
       if (TextUtils.isEmpty(lastVersionS) || CommonUtils.compareVersion(p0, lastVersionS) >= 0) {
          return true;
       }
       return false;
    }
}
