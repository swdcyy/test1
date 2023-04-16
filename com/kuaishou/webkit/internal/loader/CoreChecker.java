package com.kuaishou.webkit.internal.loader.CoreChecker;
import java.lang.Object;
import com.kuaishou.webkit.internal.loader.CoreChecker$CheckCallback;
import java.lang.String;
import com.kuaishou.webkit.internal.Logger;
import android.app.Application;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.internal.loader.CommonUtils;
import com.kuaishou.webkit.internal.loader.CoreChecker$1;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.internal.ReflectHelper;
import android.content.Context;
import com.kuaishou.webkit.internal.loader.KsWebviewLoadConfig;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.webkit.internal.ErrorResult;
import com.kuaishou.webkit.internal.loader.CoreConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;
import java.lang.Integer;
import com.kuaishou.webkit.internal.FileUtils;
import com.kuaishou.webkit.internal.EventReporter$Delegate;
import com.kuaishou.webkit.internal.EventReporter;
import com.kuaishou.webkit.internal.loader.CoreChecker$2;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class CoreChecker	// class@001330
{
    public static EventReporter$Delegate sOriginalEventDelegate;

    public void CoreChecker(){
       super();
    }
    public static void checkCore(CoreChecker$CheckCallback p0){
       Logger.e("CoreChecker", "checkCore begin.");
       Application applicationC = KsWebViewUtils.getApplicationContext();
       CoreChecker.setCustomEventDelegate();
       CommonUtils.disableVersionLock();
       CoreChecker$1 u1 = new CoreChecker$1(applicationC, p0);
       try{
          KwSdk.init(applicationC, u1);
          if (ReflectHelper.needsUnseal()) {
             ReflectHelper.unseal(applicationC);
          }
          KsWebViewUtils.preLoad();
          Logger.e(e0, "checkCore end.");
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void checkCore(boolean p0,CoreChecker$CheckCallback p1){
       KsWebviewLoadConfig.setLoadNewConfig(p0);
       CoreChecker.checkCore(p1);
       KsWebviewLoadConfig.setLoadNewConfig(false);
       return;
    }
    public static String genCountKey(CoreConfig p0){
       String str1;
       if (!TextUtils.isEmpty(p0.version)) {
          StringBuilder str = p0.version;
          str1 = (p0.isArm64())? "_arm64": "_arm32";
          str1 = str+str1;
       }else {
          str1 = "";
       }
       return str1;
    }
    public static int getCheckCount(File p0,CoreConfig p1){
       return CoreChecker.readCheckCount(CoreChecker.getFlagsFile(p0), CoreChecker.genCountKey(p1));
    }
    public static File getFlagsFile(File p0){
       return new File(p0, "core_checker_flags.ini");
    }
    public static void increaseCheckCount(File p0){
       try{
          p0 = CoreChecker.getFlagsFile(p0);
          String str = CoreChecker.genCountKey(CoreConfig.readNewConfig(p0));
          CoreChecker.writeCheckCount(p0, str, (CoreChecker.readCheckCount(p0, str) + 1));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isSupport(File p0,CoreConfig p1){
       try{
          if (CoreChecker.getCheckCount(p0, p1) >= 3) {
             return false;
          }
          return true;
       }catch(java.lang.Exception e0){
       }
    }
    public static int readCheckCount(File p0,String p1){
       if (p0.exists() && !TextUtils.isEmpty(p1)) {
          FileInputStream uFileInputSt = new FileInputStream(p0);
          Properties properties = new Properties();
          properties.load(uFileInputSt);
          String property = properties.getProperty(p1);
          if (!TextUtils.isEmpty(property)) {
             uFileInputSt.close();
             return Integer.parseInt(property.trim());
          }else {
             uFileInputSt.close();
          }
       }
       return 0;
    }
    public static void resetCheckCount(File p0){
       try{
          FileUtils.deleteFileOrDir(CoreChecker.getFlagsFile(p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void restoreCustomEventDelegate(){
       EventReporter$Delegate sOriginalEve = CoreChecker.sOriginalEventDelegate;
       if (sOriginalEve != null) {
          EventReporter.setDelegate(sOriginalEve);
          CoreChecker.sOriginalEventDelegate = null;
       }
       return;
    }
    public static void setCustomEventDelegate(){
       CoreChecker.sOriginalEventDelegate = EventReporter.getDelegate();
       EventReporter.setDelegate(new CoreChecker$2());
    }
    public static boolean writeCheckCount(File p0,String p1,int p2){
       if (TextUtils.isEmpty(p1)) {
          return false;
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p0);
       Properties properties = new Properties();
       properties.setProperty(p1, String.valueOf(p2));
       properties.store(uFileOutputS, null);
       uFileOutputS.flush();
       uFileOutputS.close();
       uFileOutputS.close();
       return true;
    }
}
