package com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.extension.KwSdk$LoadError;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils$LOAD_STATE;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.StackTraceElement;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import java.io.File;
import com.kuaishou.webkit.internal.loader.InstallUtils;
import android.os.Build;
import java.lang.Integer;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import android.app.Application;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import com.kuaishou.webkit.internal.ThreadUtils;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import com.kuaishou.webkit.internal.EventReporter;
import android.os.Build$VERSION;
import com.kuaishou.webkit.internal.Logger;
import org.json.JSONObject;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import com.kuaishou.webkit.internal.FileUtils;
import com.kuaishou.webkit.internal.loader.CommonUtils;
import android.util.Log;
import java.lang.Boolean;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.webkit.WebView;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.System;
import com.kuaishou.webkit.internal.loader.CoreConfig;
import com.kuaishou.webkit.internal.KsWebViewUtils$ApisP;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.NoSuchFieldError;
import java.lang.ClassLoader;
import java.lang.Process;
import com.kuaishou.webkit.internal.ApkUtils;
import java.lang.RuntimeException;
import android.widget.TextView;
import com.kuaishou.webkit.internal.KsWebViewUtils$2;
import android.view.View$OnClickListener;
import java.util.regex.Pattern;
import com.kuaishou.webkit.WebAddress;
import com.kuaishou.webkit.URLUtil;
import java.lang.Thread;
import com.kuaishou.webkit.internal.KsWebViewUtils$1;
import java.lang.Runnable;
import android.content.Intent;
import com.kuaishou.webkit.process.SandboxedProcessService0;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.IllegalStateException;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class KsWebViewUtils	// class@00131d
{
    public static KsWebViewUtils$LOAD_STATE sCoreLoadState;
    public static String sCurrentInstructionSet;
    public static String sException;
    public static Application sGlobalApplication;
    public static boolean sIsRendererProcess;
    public static boolean sIsUseSysWebView;
    public static KwSdk$LoadError sLoadError;
    public static String sLoadInfo;
    public static String sLoadStep;
    public static final Object sLock;
    public static int sProcessType;
    public static boolean sShouldReportCoreLoadBeforeInitFinished;
    public static boolean sShouldReportUrlLater;

    static {
       KsWebViewUtils.sLoadError = KwSdk$LoadError.KWLE_NO;
       KsWebViewUtils.sLock = new Object();
       KsWebViewUtils.sIsRendererProcess = false;
       KsWebViewUtils.sCurrentInstructionSet = null;
       KsWebViewUtils.sProcessType = -1;
       KsWebViewUtils.sShouldReportUrlLater = false;
       KsWebViewUtils.sShouldReportCoreLoadBeforeInitFinished = true;
       KsWebViewUtils.sCoreLoadState = KsWebViewUtils$LOAD_STATE.NONE_INIT;
       KsWebViewUtils.sIsUseSysWebView = false;
    }
    public void KsWebViewUtils(){
       super();
    }
    public static void addException(Exception p0){
       StackTraceElement[] stackTrace;
       if (p0 == null) {
          return;
       }
       KsWebViewUtils.addException(p0.toString());
       for (Throwable cause = p0.getCause(); cause != null; cause = cause.getCause()) {
          KsWebViewUtils.addException(" Caused by:"+cause.toString());
       }
       KsWebViewUtils.addException(" stackTrace");
       stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          KsWebViewUtils.addException(stackTrace[i].toString());
       }
       return;
    }
    public static void addException(String p0){
       Object sLock = KsWebViewUtils.sLock;
       _monitor_enter(sLock);
       if (!TextUtils.isEmpty(p0)) {
          KsWebViewUtils.sException = KsWebViewUtils.sException+p0+":";
       }
       _monitor_exit(sLock);
       return;
    }
    public static void addLoaderStep(String p0){
       Object sLock = KsWebViewUtils.sLock;
       _monitor_enter(sLock);
       if (p0 != null) {
          if (!TextUtils.isEmpty(KsWebViewUtils.sLoadStep)) {
             KsWebViewUtils.sLoadStep = KsWebViewUtils.sLoadStep+":";
          }
          KsWebViewUtils.sLoadStep = KsWebViewUtils.sLoadStep+p0;
       }
       _monitor_exit(sLock);
       return;
    }
    public static void continueInstallTaskIfNeeded(Context p0,File p1){
       InstallUtils.deleteOldVersionIfNeeded(p0, p1, 3000);
    }
    public static boolean cpuAbiIsSupported(){
       int i;
       String cPU_ABI = Build.CPU_ABI;
       String str = "x86";
       if (cPU_ABI.equalsIgnoreCase(str)) {
          KsWebViewUtils.addException("x861_"+cPU_ABI);
          return false;
       }else {
          String[] supportedCpu = KsWebViewUtils.getSupportedCpuAbis();
          if (supportedCpu.length > 0 && (supportedCpu[0]).equalsIgnoreCase(str)) {
             i = 2;
             Object[] objArray = new Object[i];
             objArray[0] = supportedCpu[0];
             objArray[1] = Integer.valueOf(supportedCpu.length);
             String str1 = String.format("x862_%s_%d", objArray);
             if (supportedCpu.length > 1) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = str1;
                objArray1[1] = supportedCpu[1];
                str1 = String.format("%s_%s", objArray1);
             }
             KsWebViewUtils.addException(str1);
             return false;
          }else {
             i = supportedCpu.length;
             int i1 = 0;
             while (true) {
                if (i1 < i) {
                   if ((supportedCpu[i1]).startsWith("armeabi")) {
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   KsWebViewUtils.addException("x863_"+Build.CPU_ABI);
                   return false;
                }
             }
             return 1;
          }
       }
    }
    public static boolean devModeEnabled(){
       try{
          int devMode = InitSettingsImpl.getInstance().getDevMode();
          Application uApplication = 1;
          if (devMode == uApplication) {
             return new File(KsWebViewUtils.getApplicationContext().getExternalFilesDir(null), "kwv.dev").exists();
          }else if(devMode == 2){
             return uApplication;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return false;
    }
    public static void doPreload(String p0){
       String str = "snapshot";
       String str1 = "info";
       KsCorePerformanceTiming.setCoreLoadTag(p0);
       if (!KsWebViewUtils.sShouldReportUrlLater && ThreadUtils.runningOnUiThread()) {
          KsWebViewUtils.reportLoadOnUI("");
       }
       if (KwSdk.getInitCallback() != null) {
          KwSdk.getInitCallback().onPreLoadCore(InitSettingsImpl.getInstance());
       }
       boolean b = InitSettingsImpl.getInstance().isUsedSystemWebView();
       boolean b1 = KsWebViewUtils.isSupport();
       boolean b2 = (b || !b1)? true: false;
       try{
          KsWebViewUtils.sIsUseSysWebView = b2;
          String installedVer = KsWebViewUtils.getInstalledVersion();
          EventReporter.onEvent("core_init_begin", "sIsUseSysWebView", String.valueOf(KsWebViewUtils.sIsUseSysWebView), "installed", installedVer);
          if (KsWebViewUtils.sIsUseSysWebView) {
             KwSdk$LoadError kWLE_DISABLE = (b)? KwSdk$LoadError.KWLE_DISABLED: KwSdk$LoadError.KWLE_NOT_SUPPORTED;
             KsWebViewUtils.setLoadError(kWLE_DISABLE);
             Logger.i("KsWebViewUtils", "Force= "+b+"; cpu:"+b1+"; sdk:"+Build$VERSION.SDK_INT);
          }else {
             EventReporter.onEvent("core_load_begin", null);
             if (WebViewFactory.getProvider() != null) {
                b = (!KsWebExtensionStatics.isSupportSdkVersion(WebViewFactory.getProvider()))? true: false;
                KsWebViewUtils.sIsUseSysWebView = b;
                if (!b && (InitSettingsImpl.getInstance().isUseSameCoreVersion() && !(KsWebExtensionStatics.getCoreVersionName(WebViewFactory.getProvider())).equals(KwSdk.getVersionName()))) {
                   KsWebViewUtils.sIsUseSysWebView = true;
                }
             label_00cb :
                if (KsWebViewUtils.sIsUseSysWebView) {
                   KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_CORE_NOT_SUPPORTED);
                   EventReporter.onEvent("core_load_failed", "error", "version not match", "version", "Core="+KsWebExtensionStatics.getCoreVersionName(WebViewFactory.getProvider())+"&KwSdk="+KwSdk.getVersionName());
                }
             }else {
                try{
                   KsWebViewUtils.sIsUseSysWebView = true;
                   if (WebViewFactory.notInstalled()) {
                      KsWebViewUtils.setLoadErrorNotInstalled(KsWebViewUtils.getApplicationContext());
                      b = "step="+KsWebViewUtils.getLoaderStep()+"; exp="+KsWebViewUtils.getException();
                      b = b+";rom_all="+FileUtils.getRomTotalSize()+";rom_ava="+FileUtils.getRomAvailableSize()+";pname="+KsWebViewUtils.getProcessName(KsWebViewUtils.getApplicationContext());
                      String directoryFil = FileUtils.getDirectoryFilesSnapshot(CommonUtils.getCoreBaseDir());
                      EventReporter.onEvent("core_load_failed_not_installed", str1, b, e0, directoryFil);
                      if (!TextUtils.isEmpty(installedVer)) {
                         EventReporter.onEvent("core_load_check_error", str1, b, e0, directoryFil);
                      }
                   }else {
                      KsWebViewUtils.setLoadErrorIfNotSet(KwSdk$LoadError.KWLE_EXCEPTION_UNKNOW);
                      EventReporter.onEvent("core_load_failed", "error", KsWebViewUtils.getException(), "load_step", KsWebViewUtils.getLoaderStep());
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }
       }catch(android.util.AndroidRuntimeException e13){
          KsWebViewUtils.sIsUseSysWebView = true;
          KsWebViewUtils.setLoadErrorIfNotSet(KwSdk$LoadError.KWLE_EXCEPTION_UNKNOW);
          EventReporter.onEvent("core_load_failed", "error", Log.getStackTraceString(e13), "load_step", KsWebViewUtils.getLoaderStep());
       }
       b = "Use Sysem WebView: "+Boolean.valueOf(KsWebViewUtils.sIsUseSysWebView).toString();
       try{
          Logger.i("KsWebViewUtils", b);
          if (KsWebViewUtils.sIsUseSysWebView && SystemApiVersionChecker.check(28, "WebView", "setDataDirectorySuffix\(suffix\)")) {
             b = WebViewFactory.getDataDirectorySuffix();
             if (!TextUtils.isEmpty(b)) {
                WebView.setDataDirectorySuffix(b);
             }
          }
       }catch(java.lang.Exception e13){
          Logger.e("KsWebViewUtils", "System WebView setDataDirectorySuffix:"+e13);
       }
       KsWebViewUtils.sCoreLoadState = KsWebViewUtils$LOAD_STATE.LOADED;
       if (KwSdk.getInitCallback() != null) {
          if (KsWebViewUtils.sIsUseSysWebView) {
             KwSdk.getInitCallback().onCoreLoadFinished(false);
             if (!InitSettingsImpl.getInstance().isUsedSystemWebView()) {
                KwSdk.getInitCallback().onCoreLoadFailed(KsWebViewUtils.getLoaderStep(), KsWebViewUtils.getException());
             }
          }else {
             KwSdk.getInitCallback().onCoreLoadFinished(true);
          }
       }
       InitSettingsImpl.getInstance().isMultiProcessEnabled();
       return;
    }
    public static Application getApplicationContext(){
       Application application = KwSdk.getApplication();
       if (application != null) {
          return application;
       }
       application = KsWebViewUtils.sGlobalApplication;
       if (application != null) {
          return application;
       }
       try{
          Class[] uClassArray = new Class[0];
          KsWebViewUtils.sGlobalApplication = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", uClassArray).invoke(null, null);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return KsWebViewUtils.sGlobalApplication;
    }
    public static String getCurrentStackTraceString(){
       if (!(System.currentTimeMillis() % 100) - 1) {
          return Log.getStackTraceString(new Throwable());
       }
       return "";
    }
    public static String getException(){
       return KsWebViewUtils.sException;
    }
    public static String getInstalledVersion(){
       try{
          File coreBaseDir = CommonUtils.getCoreBaseDir();
          if (coreBaseDir.exists()) {
             CoreConfig uCoreConfig = CoreConfig.syncReadConfig(coreBaseDir);
             if (!TextUtils.isEmpty(uCoreConfig.version) && (uCoreConfig.isArm64() == KsWebViewUtils.is64Bit() && InstallUtils.coreFileIsExist(coreBaseDir, uCoreConfig))) {
                return uCoreConfig.version;
             }
          }
       label_0029 :
          return "";
       }catch(java.lang.Exception e0){
       }
    }
    public static Object getKsWebViewLock(){
       return KsWebViewUtils.sLock;
    }
    public static KwSdk$LoadError getLoadError(){
       return KsWebViewUtils.sLoadError;
    }
    public static String getLoaderStep(){
       return KsWebViewUtils.sLoadStep;
    }
    public static String getProcessName(Context p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return KsWebViewUtils$ApisP.getProcessName();
       }
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("android.app.ActivityThread").getMethod("currentProcessName", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e0){
          return KsWebViewUtils.getProcessNameByfile(p0);
       }
    }
    public static String getProcessNameByfile(Context p0){
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(new File("/proc/"+Process.myPid()+"/cmdline")));
          uBufferedRea.close();
          return (uBufferedRea.readLine()).trim();
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return "";
       }
    }
    public static String[] getSupportedCpuAbis(){
       try{
          return Build.SUPPORTED_ABIS;
       }catch(java.lang.NoSuchFieldError e0){
          e0.printStackTrace();
          String[] stringArray = new String[]{Build.CPU_ABI,Build.CPU_ABI2};
          return stringArray;
       }
    }
    public static String getsCurrentInstructionSet(){
       String sCurrentInst = KsWebViewUtils.sCurrentInstructionSet;
       if (sCurrentInst != null) {
          return sCurrentInst;
       }
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       sCurrentInst = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", uClassArray).invoke(null, objArray);
       KsWebViewUtils.sCurrentInstructionSet = sCurrentInst;
       return sCurrentInst;
    }
    public static boolean is64Bit(){
       if (Build$VERSION.SDK_INT >= 23) {
          return Process.is64Bit();
       }
       return KsWebViewUtils.isART64InAndroid5To6();
    }
    public static boolean isART64InAndroid5To6(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{"art"};
          Object obj = ClassLoader.class.getDeclaredMethod("findLibrary", uClassArray).invoke(KsWebViewUtils.class.getClassLoader(), objArray);
          if (obj != null) {
             i = obj.contains("lib64");
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isAfterAndroidO(){
       boolean b = (Build$VERSION.SDK_INT > 25)? true: false;
       return b;
    }
    public static boolean isBlacklist(){
       return false;
    }
    public static boolean isCoreLoaded(){
       boolean b = (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.LOADED)? true: false;
       return b;
    }
    public static boolean isIsolatedProcess(){
       boolean i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Process.class.getMethod("isIsolated", uClassArray).invoke(null, objArray).booleanValue();
       }catch(java.lang.Exception e0){
          if (KsWebViewUtils.getApplicationContext().getFilesDir().list() == null) {
             i = true;
          }
          return i;
       }
    }
    public static boolean isKwvChildProcess(Context p0){
       Application applicationC;
       int i = 0;
       if (KsWebViewUtils.sProcessType == -1) {
          Object sLock = KsWebViewUtils.sLock;
          _monitor_enter(sLock);
          if (p0 == null) {
             applicationC = KsWebViewUtils.getApplicationContext();
          }
          KsWebViewUtils.sProcessType = i;
          if ((KsWebViewUtils.getProcessName(applicationC)).indexOf(":kwv_") > -1) {
             KsWebViewUtils.sProcessType = 1;
          }
          _monitor_exit(sLock);
       }
       if (KsWebViewUtils.sProcessType == 1) {
          i = true;
       }
       return i;
    }
    public static boolean isSupport(){
       boolean b = (!KsWebViewUtils.isBlacklist() && KsWebViewUtils.cpuAbiIsSupported())? true: false;
       return b;
    }
    public static void makesureInit(){
       Object sLock = KsWebViewUtils.sLock;
       _monitor_enter(sLock);
       if (KwSdk.getApplication() == null) {
          Application applicationC = KsWebViewUtils.getApplicationContext();
          if (applicationC == null) {
             _monitor_exit(sLock);
             return;
          }else {
             String packageName = applicationC.getPackageName();
             if (!TextUtils.equals("com.smile.gifmaker", packageName) && !TextUtils.equals("com.kuaishou.nebula", packageName)) {
                _monitor_exit(sLock);
                return;
             }else {
                try{
                   ApkUtils.invokeKuaishouInitMethod();
                }catch(java.lang.Exception e1){
                   throw new RuntimeException(e1);
                }
             }
          }
       }
       _monitor_exit(sLock);
       return;
    }
    public static void onAddDevModeTextView(TextView p0){
       p0.setText(" ...  ");
       p0.setOnClickListener(new KsWebViewUtils$2(p0));
    }
    public static void onWebViewBeforeCreate(){
       if (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.NONE_INIT) {
          KsWebViewUtils.sShouldReportUrlLater = true;
       }
       return;
    }
    public static void onWebViewLoadUrl(String p0){
       if (KsWebViewUtils.sShouldReportUrlLater) {
          KsWebViewUtils.sShouldReportUrlLater = false;
          KsWebViewUtils.reportLoadOnUI(p0);
       }
       return;
    }
    public static void preLoad(){
       KsWebViewUtils.preLoad("Unknown");
    }
    public static void preLoad(String p0){
       KsWebViewUtils$LOAD_STATE lOADED = KsWebViewUtils$LOAD_STATE.LOADED;
       if (KsWebViewUtils.sCoreLoadState == lOADED) {
          return;
       }
       try{
          KsWebViewUtils.makesureInit();
          Object sLock = KsWebViewUtils.sLock;
          _monitor_enter(sLock);
          if (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.NONE_INIT) {
             KsWebViewUtils.sCoreLoadState = KsWebViewUtils$LOAD_STATE.LOADING;
             KsWebViewUtils.doPreload(p0);
             KsWebViewUtils.sCoreLoadState = lOADED;
          label_001c :
             _monitor_exit(sLock);
             try{
                if (!KsWebViewUtils.sIsUseSysWebView && !ThreadUtils.runningOnUiThread()) {
                   WebAddress.preload();
                   URLUtil.preload();
                }
             }catch(java.lang.Exception e0){
             }
          }else {
             goto label_001c ;
          }
       }catch(java.lang.Exception e4){
          try{
             if (KwSdk.getInitCallback() != null) {
                KwSdk.getInitCallback().onCoreLoadFailed("preLoad exception", Log.getStackTraceString(e4));
             }
             KsWebViewUtils.sIsUseSysWebView = true;
             KsWebViewUtils.sCoreLoadState = KsWebViewUtils$LOAD_STATE.LOADED;
             KsWebViewUtils.addLoaderStep("c1");
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static void preLoadOnBackground(){
       if (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.NONE_INIT) {
          new Thread(new KsWebViewUtils$1()).start();
       }
       return;
    }
    public static void preloadRendererProcess(){
       Application applicationC = KsWebViewUtils.getApplicationContext();
       if (applicationC != null) {
          a.e(applicationC, new Intent(KsWebViewUtils.getApplicationContext(), SandboxedProcessService0.class));
       }
       return;
    }
    public static void reportLoadOnUI(String p0){
       EventReporter.onEvent("core_load_on_ui_thread", "url", p0, "call_stack", KsWebViewUtils.getCurrentStackTraceString());
    }
    public static void setDebuggingMode(boolean p0){
       if (p0) {
          Object sLock = KsWebViewUtils.sLock;
          _monitor_enter(sLock);
          if (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.NONE_INIT) {
             _monitor_exit(sLock);
          }else {
             throw new IllegalStateException("Can\'t set debugging mode: KsWebView already initialized");
          }
       }
       return;
    }
    public static void setLoadError(KwSdk$LoadError p0){
       KsWebViewUtils.sLoadError = p0;
    }
    public static void setLoadErrorIfNotSet(KwSdk$LoadError p0){
       if (KsWebViewUtils.sLoadError == KwSdk$LoadError.KWLE_NO) {
          KsWebViewUtils.setLoadError(p0);
       }
       return;
    }
    public static void setLoadErrorNotInstalled(Application p0){
       String str = "KsNotInstallCount";
       if (KsWebViewUtils.sLoadError == KwSdk$LoadError.KWLE_NO) {
          KwSdk$LoadError kWLE_NOT_INS = KwSdk$LoadError.KWLE_NOT_INSTALL_ONCE;
          int i = 0;
          SharedPreferences sharedPrefer = o.c(p0, "KsWebViewChromiumPrefs", i);
          int i1 = 1;
          if (sharedPrefer.getInt("KsLastVersionCodeUsed", i) > 0) {
             kWLE_NOT_INS = KwSdk$LoadError.KWLE_NOT_INSTALL_HASLOAD;
             int intx = sharedPrefer.getInt("KsLastProcessAbi", i);
             if (intx > 0) {
                if (KsWebViewUtils.is64Bit()) {
                   i1 = 2;
                }
                if (i1 != intx) {
                   kWLE_NOT_INS = KwSdk$LoadError.KWLE_NOT_INSTALL_HASLOAD_ABI;
                }
             }
          }else {
             int intx1 = sharedPrefer.getInt(str, i);
             if (intx1 >= 5) {
                kWLE_NOT_INS = KwSdk$LoadError.KWLE_NOT_INSTALL_6TON;
             }else if(intx1 >= i1){
                kWLE_NOT_INS = KwSdk$LoadError.KWLE_NOT_INSTALL_2TO5;
             }
             g.a(sharedPrefer.edit().putInt(str, (intx1 + i1)));
          }
          KsWebViewUtils.setLoadError(kWLE_NOT_INS);
       }
       return;
    }
    public static void setLoadInfo(String p0){
       KsWebViewUtils.sLoadInfo = p0;
    }
    public static boolean useSysWebView(){
       if (KsWebViewUtils.sCoreLoadState == KsWebViewUtils$LOAD_STATE.LOADED) {
          return KsWebViewUtils.sIsUseSysWebView;
       }
       if (WebViewFactory.isDisableWebView()) {
          throw new IllegalStateException("WebView.disableWebView\(\) was called: WebView is disabled");
       }
       boolean b = false;
       boolean b1 = (KsWebViewUtils.sCoreLoadState != KsWebViewUtils$LOAD_STATE.NONE_INIT)? true: false;
       try{
          KsWebViewUtils.preLoad();
          if (KsWebViewUtils.sShouldReportCoreLoadBeforeInitFinished) {
             KsWebViewUtils.sShouldReportCoreLoadBeforeInitFinished = b;
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("core_load_init_started", b1);
             jSONObject.put("on_ui_thread", ThreadUtils.runningOnUiThread());
             jSONObject.put("call_stack", KsWebViewUtils.getCurrentStackTraceString());
             EventReporter.onEvent("core_load_before_init_finished", jSONObject);
          }
          return KsWebViewUtils.sIsUseSysWebView;
       }catch(java.lang.Exception e0){
       }
    }
}
