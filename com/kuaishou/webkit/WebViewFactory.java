package com.kuaishou.webkit.WebViewFactory;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.String;
import com.kuaishou.webkit.internal.loader.KsWebviewLoadConfig;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import java.io.File;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;
import java.lang.IllegalStateException;
import android.content.Intent;
import com.kuaishou.webkit.process.ChildProcessInterface;
import android.os.Parcelable;
import com.kuaishou.webkit.extension.KwDexPath;
import android.content.Context;
import java.lang.Class;
import com.kuaishou.webkit.extension.base.KsCoreInitSettingsInterface;
import java.lang.reflect.Method;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.pm.PackageInfo;
import com.kuaishou.webkit.WebViewFactoryProvider;
import java.lang.System;
import android.os.Process;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import com.kuaishou.webkit.internal.FileLockHelper;
import com.kuaishou.webkit.a;
import java.lang.Runnable;
import com.kuaishou.webkit.internal.ThreadUtils;
import com.kuaishou.webkit.extension.KsCoreListener;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.extension.KwSdk$LoadError;
import java.lang.UnsupportedOperationException;
import java.lang.ClassLoader;
import android.util.AndroidRuntimeException;
import android.app.Application;
import com.kuaishou.webkit.internal.ReflectHelper;
import com.kuaishou.webkit.internal.EventReporter;
import com.kuaishou.webkit.internal.ApkUtils;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import android.os.Build$VERSION;
import com.kuaishou.webkit.WebViewFactory$DexClassLoaderOptimize;
import com.kuaishou.webkit.WebViewFactory$PackageDexClassLoaderEx;
import android.content.res.Resources;
import com.kuaishou.webkit.WebViewFactory$MissingWebViewPackageException;
import com.kuaishou.webkit.WebViewFactory$WebViewContextWrapper;
import com.kuaishou.webkit.internal.loader.CommonUtils;
import java.lang.Boolean;
import java.lang.Thread;
import com.kuaishou.webkit.b;
import java.lang.IllegalArgumentException;

public final class WebViewFactory	// class@001299
{
    public static boolean isTestLoadFailed;
    public static String sDataDirectorySuffix;
    public static File sKsWebViewLoadFailedIndicatorDirFile;
    public static KwDexPath sKwDexPath;
    public static boolean sKwvNotInstalled;
    public static final String[] sLoadFailedIndicatorFiles;
    public static PackageInfo sPackageInfo;
    public static WebViewFactoryProvider sProviderInstance;
    public static final Object sProviderLock;
    public static ChildProcessInterface sSandboxedProcessInstance;
    public static FileLockHelper sVersionLockHelper;
    public static boolean sWebViewDisabled;
    public static Boolean sWebViewSupported;

    static {
       WebViewFactory.sProviderLock = KsWebViewUtils.getKsWebViewLock();
       String[] stringArray = new String[]{"kwv_so_load_failed_first","kwv_so_load_failed_second","kwv_so_load_failed_third"};
       WebViewFactory.sLoadFailedIndicatorFiles = stringArray;
    }
    public void WebViewFactory(){
       super();
    }
    public static void a(){
       WebViewFactory.lambda$getProvider$1();
    }
    public static void createLoadFailedIndicatorFile(){
       if (!KsWebviewLoadConfig.isLoadNewConfig() && InitSettingsImpl.getInstance().isCheckLoadSoFailedMultiTimes()) {
          try{
             File sKsWebViewLo = WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile;
             if (sKsWebViewLo == null) {
                return;
             }else if(!sKsWebViewLo.exists()){
                WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile.mkdirs();
             }
             String[] sLoadFailedI = WebViewFactory.sLoadFailedIndicatorFiles;
             int len = sLoadFailedI.length;
             int i = 0;
             while (i < len) {
                File uFile = new File(WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile, sLoadFailedI[i]);
                if (!uFile.exists()) {
                   uFile.createNewFile();
                   Logger.i("WebViewFactory", "create load failed indicator file:"+uFile.getAbsolutePath());
                   return;
                }
                i = i + 1;
             }
          }catch(java.lang.Exception e1){
             Logger.e("WebViewFactory", "createLoadFailedIndicatorFile, catch exception:"+e1);
          }
       }
    }
    public static void deleteLoadFailedIndicatorFiles(){
       if (!KsWebviewLoadConfig.isLoadNewConfig() && InitSettingsImpl.getInstance().isCheckLoadSoFailedMultiTimes()) {
          File sKsWebViewLo = WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile;
          if (sKsWebViewLo == null) {
             return;
          }else if(!sKsWebViewLo.exists()){
             return;
          }else {
             int i = WebViewFactory.sLoadFailedIndicatorFiles.length - 1;
             while (i >= 0) {
                File uFile = new File(WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile, WebViewFactory.sLoadFailedIndicatorFiles[i]);
                if (uFile.exists()) {
                   uFile.delete();
                   Logger.i("WebViewFactory", "delete load failed indicator file:"+uFile.getAbsolutePath());
                }
                i = i - 1;
             }
             WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile.delete();
          }
       }
    }
    public static void disableWebView(){
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       if (WebViewFactory.sProviderInstance != null || KsWebViewUtils.isCoreLoaded()) {
          throw new IllegalStateException("Can\'t disable WebView: WebView already initialized");
       }
       WebViewFactory.sWebViewDisabled = true;
       _monitor_exit(sProviderLoc);
       return;
    }
    public static ChildProcessInterface getChildProcessInterface(Intent p0){
       Method method;
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       ChildProcessInterface sSandboxedPr = WebViewFactory.sSandboxedProcessInstance;
       if (sSandboxedPr != null) {
          _monitor_exit(sProviderLoc);
          return sSandboxedPr;
       }else {
          try{
             WebViewFactory.sKwDexPath = p0.getParcelableExtra("kwdexpath");
          }catch(java.lang.Exception e9){
             Logger.e("WebViewFactory", "error getChildProcessInterface from bindintent:"+e9);
          }
          p0 = null;
          try{
             Context webViewConte = WebViewFactory.getWebViewContextAndSetProvider();
             Class sandboxedPro = WebViewFactory.getSandboxedProcessClass(webViewConte);
             try{
                int i = 2;
                Class[] uClassArray = new Class[i];
                uClassArray[0] = KsCoreInitSettingsInterface.class;
                uClassArray[1] = Context.class;
                method = sandboxedPro.getMethod("create", uClassArray);
                try{
                   Object[] objArray = new Object[i];
                   objArray[0] = InitSettingsImpl.getInstance();
                   objArray[1] = webViewConte;
                   sSandboxedPr = method.invoke(p0, objArray);
                   WebViewFactory.sSandboxedProcessInstance = sSandboxedPr;
                   _monitor_exit(sProviderLoc);
                   return sSandboxedPr;
                }catch(java.lang.Exception e1){
                   Logger.e("WebViewFactory", "error  static create:"+e1);
                   _monitor_exit(sProviderLoc);
                   return p0;
                }
             }catch(java.lang.Exception e1){
                Logger.e("WebViewFactory", "error instantiating provider with static factory method:"+e1);
                _monitor_exit(sProviderLoc);
                return p0;
             }
          }catch(java.lang.Exception e1){
             KsWebViewUtils.addException(e1.getMessage());
             Logger.e("WebViewFactory", "error getWebViewContextAndSetProvider:"+e1);
             _monitor_exit(sProviderLoc);
             return p0;
          }
       }
    }
    public static String getDataDirectorySuffix(){
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       _monitor_exit(sProviderLoc);
       return WebViewFactory.sDataDirectorySuffix;
    }
    public static String getDexPathOrPackageName(){
       String dexPath;
       KwDexPath sKwDexPath = WebViewFactory.sKwDexPath;
       if (sKwDexPath != null) {
          dexPath = sKwDexPath.getDexPath();
          if (TextUtils.isEmpty(dexPath)) {
             dexPath = WebViewFactory.sKwDexPath.getPackageName();
          }
       }else {
          dexPath = null;
       }
       return dexPath;
    }
    public static PackageInfo getLoadedPackageInfo(){
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       _monitor_exit(sProviderLoc);
       return WebViewFactory.sPackageInfo;
    }
    public static WebViewFactoryProvider getProvider(){
       int i1;
       FileLockHelper sVersionLock;
       KsCoreListener ksCoreListen;
       Method method;
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       WebViewFactoryProvider sProviderIns = WebViewFactory.sProviderInstance;
       if (sProviderIns != null) {
          _monitor_exit(sProviderLoc);
          return sProviderIns;
       }else {
          long l = System.currentTimeMillis();
          int i = Process.myUid();
          if (i != 1000 && i != 1001) {
             if (WebViewFactory.isWebViewSupported()) {
                if (!WebViewFactory.sWebViewDisabled) {
                   KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("get_provider_check_time", (System.currentTimeMillis() - l));
                   long l1 = 300;
                   try{
                      i1 = 0;
                      Context webViewConte = WebViewFactory.getWebViewContextAndSetProvider();
                      KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("get_webview_context_and_set_provider_time", (System.currentTimeMillis() - System.currentTimeMillis()));
                      try{
                         WebViewFactory.createLoadFailedIndicatorFile();
                         Class providerClas = WebViewFactory.getProviderClass(webViewConte);
                         String str = "get_provider_class_time";
                         long l2 = System.currentTimeMillis() - System.currentTimeMillis();
                         try{
                            KsCorePerformanceTiming.NotifyGeneralPerformanceTiming(str, l2);
                            int i2 = 3;
                            Class[] uClassArray = new Class[i2];
                            uClassArray[0] = KsCoreInitSettingsInterface.class;
                            uClassArray[1] = KwDexPath.class;
                            uClassArray[2] = Context.class;
                            method = providerClas.getMethod("create", uClassArray);
                            str = "get_create_factory_provider_method_time";
                            long l3 = System.currentTimeMillis() - System.currentTimeMillis();
                            try{
                               KsCorePerformanceTiming.NotifyGeneralPerformanceTiming(str, l3);
                               Object[] objArray = new Object[i2];
                               objArray[0] = InitSettingsImpl.getInstance();
                               objArray[1] = WebViewFactory.sKwDexPath;
                               objArray[2] = webViewConte;
                               WebViewFactory.sProviderInstance = method.invoke(i1, objArray);
                               KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("invoke_create_factory_provider_time", (System.currentTimeMillis() - System.currentTimeMillis()));
                               if (WebViewFactory.isTestLoadFailed) {
                                  Object[] objArray1 = new Object[]{webViewConte};
                                  method.invoke(i1, objArray1);
                               }
                               sProviderIns = WebViewFactory.sProviderInstance;
                               if (sProviderIns == null) {
                                  FileLockHelper sVersionLock1 = WebViewFactory.sVersionLockHelper;
                                  if (sVersionLock1 != null) {
                                     sVersionLock1.close();
                                     WebViewFactory.sVersionLockHelper = i1;
                                  }
                               }
                               if (WebViewFactory.sProviderInstance != null) {
                                  ThreadUtils.postOnUiThreadDelayed(a.b, l1);
                                  KsCoreListener ksCoreListen1 = KwSdk.getKsCoreListener();
                                  if (ksCoreListen1 != null) {
                                     ksCoreListen1.onTimeDotting("create_webview_factory_provider_begin", l);
                                     ksCoreListen1.onTimeDotting("create_webview_factory_provider_end", System.currentTimeMillis());
                                  }
                               }
                               _monitor_exit(sProviderLoc);
                               return sProviderIns;
                            }catch(java.lang.Exception e0){
                               KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_EXCEPTION_INVOKE);
                               KsWebViewUtils.addLoaderStep("b16");
                               KsWebViewUtils.addException(e0);
                               Logger.e("WebViewFactory", "error instantiating provider:"+e0);
                               if (WebViewFactory.sProviderInstance == null) {
                                  sVersionLock = WebViewFactory.sVersionLockHelper;
                                  if (sVersionLock != null) {
                                     sVersionLock.close();
                                     WebViewFactory.sVersionLockHelper = i1;
                                  }
                               }
                               if (WebViewFactory.sProviderInstance != null) {
                                  ThreadUtils.postOnUiThreadDelayed(a.b, l1);
                                  ksCoreListen = KwSdk.getKsCoreListener();
                                  if (ksCoreListen != null) {
                                     ksCoreListen.onTimeDotting("create_webview_factory_provider_begin", l);
                                     ksCoreListen.onTimeDotting("create_webview_factory_provider_end", System.currentTimeMillis());
                                  }
                               }
                               _monitor_exit(sProviderLoc);
                               return i1;
                            }
                         }catch(java.lang.Exception e0){
                            KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_EXCEPTION_GET_METHOD);
                            KsWebViewUtils.addLoaderStep("b15");
                            KsWebViewUtils.addException(e0);
                            Logger.e("WebViewFactory", "error get static factory method:"+e0);
                            if (WebViewFactory.sProviderInstance == null) {
                               sVersionLock = WebViewFactory.sVersionLockHelper;
                               if (sVersionLock != null) {
                                  sVersionLock.close();
                                  WebViewFactory.sVersionLockHelper = i1;
                               }
                            }
                            if (WebViewFactory.sProviderInstance != null) {
                               ThreadUtils.postOnUiThreadDelayed(a.b, l1);
                               ksCoreListen = KwSdk.getKsCoreListener();
                               if (ksCoreListen != null) {
                                  ksCoreListen.onTimeDotting("create_webview_factory_provider_begin", l);
                                  ksCoreListen.onTimeDotting("create_webview_factory_provider_end", System.currentTimeMillis());
                               }
                            }
                            _monitor_exit(sProviderLoc);
                            return i1;
                         }
                      }catch(java.lang.Exception e0){
                         KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_EXCEPTION_FIND_CLASS);
                         KsWebViewUtils.addException(e0);
                         Logger.e("WebViewFactory", "error get provider class:"+e0);
                         if (WebViewFactory.sProviderInstance == null) {
                            sVersionLock = WebViewFactory.sVersionLockHelper;
                            if (sVersionLock != null) {
                               sVersionLock.close();
                               WebViewFactory.sVersionLockHelper = i1;
                            }
                         }
                         if (WebViewFactory.sProviderInstance != null) {
                            ThreadUtils.postOnUiThreadDelayed(a.b, l1);
                            ksCoreListen = KwSdk.getKsCoreListener();
                            if (ksCoreListen != null) {
                               ksCoreListen.onTimeDotting("create_webview_factory_provider_begin", l);
                               ksCoreListen.onTimeDotting("create_webview_factory_provider_end", System.currentTimeMillis());
                            }
                         }
                         _monitor_exit(sProviderLoc);
                         return i1;
                      }
                   }catch(java.lang.Exception e0){
                      KsWebViewUtils.addException(e0.getMessage());
                      if (WebViewFactory.sProviderInstance == null) {
                         sVersionLock = WebViewFactory.sVersionLockHelper;
                         if (sVersionLock != null) {
                            sVersionLock.close();
                            WebViewFactory.sVersionLockHelper = i1;
                         }
                      }
                      if (WebViewFactory.sProviderInstance != null) {
                         ThreadUtils.postOnUiThreadDelayed(a.b, l1);
                         ksCoreListen = KwSdk.getKsCoreListener();
                         if (ksCoreListen != null) {
                            ksCoreListen.onTimeDotting("create_webview_factory_provider_begin", l);
                            ksCoreListen.onTimeDotting("create_webview_factory_provider_end", System.currentTimeMillis());
                         }
                      }
                      _monitor_exit(sProviderLoc);
                      return i1;
                   }
                }else {
                   KsWebViewUtils.addLoaderStep("d3");
                   throw new IllegalStateException("WebView.disableWebView\(\) was called: WebView is disabled");
                }
             }else {
                KsWebViewUtils.addLoaderStep("d2");
                throw new UnsupportedOperationException();
             }
          }else {
             KsWebViewUtils.addLoaderStep("d1");
             throw new UnsupportedOperationException("For security reasons, WebView is not allowed in privileged processes");
          }
       }
    }
    public static Class getProviderClass(Context p0){
       try{
          return WebViewFactory.getWebViewProviderClass(p0.getClassLoader());
       }catch(java.lang.ClassNotFoundException e2){
          throw new AndroidRuntimeException(e2);
       }catch(java.lang.Exception e2){
          Logger.e("WebViewFactory", "KsWebView package does not exist:"+e2);
          throw new AndroidRuntimeException(e2);
       }
    }
    public static Class getSandboxedProcessClass(Context p0){
       return Class.forName("com.kuaishou.webview.chromium.extension.process.RendererProcessImpl", true, p0.getClassLoader());
    }
    public static Context getWebViewContextAndSetProvider(){
       String str;
       String dexPath;
       String libPath;
       String optPath;
       WebViewFactory$DexClassLoaderOptimize uDexClassLoa;
       Resources resources;
       WebViewFactory webViewFacto = WebViewFactory.class;
       Application applicationC = KsWebViewUtils.getApplicationContext();
       if (WebViewFactory.sKwDexPath == null) {
          long l = System.currentTimeMillis();
          if (!InitSettingsImpl.getInstance().isDisabledHiddenApiUnseal()) {
             ReflectHelper.unseal(applicationC);
             KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("unseal_time", (System.currentTimeMillis() - l));
          }
          str = 1;
          long l1 = System.currentTimeMillis();
          WebViewFactory.initDexPathOnMainProcess(applicationC);
          if (!WebViewFactory.isKsWebViewLoadFailedReachMaxTimes()) {
             KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("init_dex_path_time", (System.currentTimeMillis() - l1));
          }else {
             KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_MULTI_FAILED);
             EventReporter.onEvent("core_load_failed_multi_times", "failed_step", "load");
             throw new IllegalStateException("load failed muti-times!");
          }
       }else {
          str = null;
       }
       if (WebViewFactory.sKwDexPath.isUsedBuildin(applicationC)) {
          KsWebViewUtils.addLoaderStep("b4");
          return applicationC;
       }else {
          String packageName = WebViewFactory.sKwDexPath.getPackageName();
          try{
             long l2 = System.currentTimeMillis();
             String str1 = ":";
             if (TextUtils.isEmpty(packageName)) {
                KsWebViewUtils.addLoaderStep("b5_1");
                WebViewFactory.sPackageInfo = ApkUtils.getMockWebViewPackageInfo(applicationC);
                dexPath = WebViewFactory.sKwDexPath.getDexPath();
                libPath = WebViewFactory.sKwDexPath.getLibPath();
                KsWebViewUtils.addLoaderStep("b5");
             }else {
                KsWebViewUtils.addLoaderStep("b6_1");
                PackageInfo packageInfo = applicationC.getPackageManager().getPackageInfo(packageName, 128);
                WebViewFactory.sPackageInfo = packageInfo;
                packageInfo = packageInfo.applicationInfo;
                ApplicationInfo sourceDir = packageInfo.sourceDir;
                ApplicationInfo nativeLibrar = packageInfo.nativeLibraryDir;
                String str2 = ApplicationInfo.class.getDeclaredField("secondaryNativeLibraryDir").get(WebViewFactory.sPackageInfo.applicationInfo);
                if (!str2.isEmpty()) {
                   if (!nativeLibrar.isEmpty()) {
                      dexPath = nativeLibrar+str1;
                   }
                   dexPath = dexPath+str2;
                }
                KsWebViewUtils.addLoaderStep("b6");
                libPath = nativeLibrar;
                nativeLibrar = sourceDir;
             }
          }catch(java.lang.Exception e0){
             KsWebViewUtils.addLoaderStep("b7");
             throw new WebViewFactory$MissingWebViewPackageException("kwv: PackageName e:"+e0);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static Class getWebViewProviderClass(ClassLoader p0){
       return Class.forName("com.kuaishou.webview.chromium.WebViewChromiumFactoryProvider", true, p0);
    }
    public static void initDexPathOnMainProcess(Application p0){
       KwDexPath kwDexPath = new KwDexPath();
       WebViewFactory.sKwDexPath = kwDexPath;
       kwDexPath.setDataDirectorySuffix(WebViewFactory.sDataDirectorySuffix);
       KsWebViewUtils.addLoaderStep("b0");
       if (KsWebViewUtils.devModeEnabled()) {
          KsWebViewUtils.addLoaderStep("ba1");
          if (WebViewFactory.isPackageInstalled(InitSettingsImpl.getInstance().getInstalledKsWebViewPackageName(), p0.getPackageManager())) {
             KsWebViewUtils.addLoaderStep("b3");
             KsWebViewUtils.addLoaderStep("optDir="+p0.getApplicationInfo().dataDir);
             WebViewFactory.sKwDexPath.setPackageName(InitSettingsImpl.getInstance().getInstalledKsWebViewPackageName());
             WebViewFactory.sKwDexPath.setOptPath(p0.getApplicationInfo().dataDir);
             WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile = new File(WebViewFactory.sKwDexPath.getOptPath(), "host_kswebview_checker");
             KsWebViewUtils.setLoadInfo("LocalApk:"+InitSettingsImpl.getInstance().getInstalledKsWebViewPackageName());
             return;
          }
       }
       String buildinVersi = KwSdk.getBuildinVersion();
       String str = "kwv_gpu_checker";
       String str1 = 1;
       if (!TextUtils.isEmpty(buildinVersi)) {
          KsWebViewUtils.addLoaderStep("bb1");
          String installedVer = KsWebViewUtils.getInstalledVersion();
          if (TextUtils.isEmpty(installedVer) || CommonUtils.compareVersion(installedVer, buildinVersi) != str1) {
             KsWebViewUtils.addLoaderStep("bb2");
             if (CommonUtils.versionSupported(buildinVersi)) {
                WebViewFactory.sKwDexPath.setPackageName(p0.getPackageName());
                WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile = new File(p0.getFilesDir(), "ks_webview/buildin_checker/"+buildinVersi);
                KsWebViewUtils.setLoadInfo("buildin");
                InitSettingsImpl.getInstance().setGpuCheckerDir(p0.getFilesDir()+"/"+"ks_webview"+"/"+str+"/"+buildinVersi);
                return;
             }else {
                KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_JUMP_OLD_VERSION);
                throw new IllegalStateException("buildin not support v:"+buildinVersi);
             }
          }
       }
       KsWebviewLoadConfig ksWebviewLoa = KsWebviewLoadConfig.obtainConfig(p0);
       if (ksWebviewLoa != null) {
          KsWebViewUtils.addLoaderStep("b2");
          if (ksWebviewLoa.getVersion() == null || CommonUtils.versionSupported(ksWebviewLoa.getVersion())) {
             if (!ksWebviewLoa.isBuildin()) {
                WebViewFactory.sVersionLockHelper = CommonUtils.tryLockVersion(new File(ksWebviewLoa.getBaseDir()));
                KsWebViewUtils.setLoadInfo("Plugin:"+ksWebviewLoa.getBaseDir());
             }else {
                KsWebViewUtils.setLoadInfo("Plugin:internal lib");
             }
             String webViewApk = ksWebviewLoa.getWebViewApk();
             KsWebViewUtils.addLoaderStep("apkDir="+webViewApk);
             WebViewFactory.sKwDexPath.setDexPath(webViewApk);
             WebViewFactory.sKwDexPath.setLibPath(ksWebviewLoa.getNativeLibraryDir());
             WebViewFactory.sKwDexPath.setOptPath(ksWebviewLoa.getOptDir());
             WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile = new File(WebViewFactory.sKwDexPath.getOptPath(), "plugin_checker");
             InitSettingsImpl.getInstance().setGpuCheckerDir(WebViewFactory.sKwDexPath.getOptPath()+"/"+str);
             return;
          }else {
             KsWebViewUtils.setLoadError(KwSdk$LoadError.KWLE_JUMP_OLD_VERSION);
             throw new IllegalStateException("not support v:"+ksWebviewLoa.getVersion());
          }
       }else {
          WebViewFactory.sKwvNotInstalled = str1;
          KsWebViewUtils.setLoadErrorNotInstalled(p0);
          KsWebViewUtils.addException("kwv not installed!");
          throw new IllegalStateException("kwv not installed!");
       }
    }
    public static boolean isBuildin(){
       if (WebViewFactory.getProviderClass(KsWebViewUtils.getApplicationContext()) != null) {
          return true;
       }
       return false;
    }
    public static boolean isDisableWebView(){
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       _monitor_exit(sProviderLoc);
       return WebViewFactory.sWebViewDisabled;
    }
    public static boolean isKsWebViewLoadFailedReachMaxTimes(){
       try{
          Logger.i("WebViewFactory", "isKsWebViewLoadFailedReachMaxTimes, is load new config:"+KsWebviewLoadConfig.isLoadNewConfig()+", check flag:"+InitSettingsImpl.getInstance().isCheckLoadSoFailedMultiTimes());
          if (KsWebviewLoadConfig.isLoadNewConfig() || !InitSettingsImpl.getInstance().isCheckLoadSoFailedMultiTimes()) {
          }else if(WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile == null){
             return false;
          }else {
             String[] sLoadFailedI = WebViewFactory.sLoadFailedIndicatorFiles;
             return new File(WebViewFactory.sKsWebViewLoadFailedIndicatorDirFile, sLoadFailedI[(sLoadFailedI.length - 1)]).exists();
          }
       }catch(java.lang.Exception e0){
          Logger.e(v1, "isKsWebViewLoadFailedReachMaxTimes, catch exception:"+e0);
       }
       return false;
    }
    public static boolean isPackageInstalled(String p0,PackageManager p1){
       int i = 0;
       try{
          p1.getPackageInfo(p0, i);
          return true;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          return e0;
       }
    }
    public static boolean isWebViewSupported(){
       if (WebViewFactory.sWebViewSupported == null) {
          WebViewFactory.sWebViewSupported = Boolean.TRUE;
       }
       return WebViewFactory.sWebViewSupported.booleanValue();
    }
    public static void lambda$getProvider$0(){
       long l = 300;
       try{
          Thread.sleep(l);
          WebViewFactory.deleteLoadFailedIndicatorFiles();
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
    public static void lambda$getProvider$1(){
       new Thread(b.b, "k-wv-run-check").start();
    }
    public static boolean notInstalled(){
       return WebViewFactory.sKwvNotInstalled;
    }
    public static void setDataDirectorySuffix(String p0){
       Object sProviderLoc = WebViewFactory.sProviderLock;
       _monitor_enter(sProviderLoc);
       if (WebViewFactory.sProviderInstance != null || KsWebViewUtils.isCoreLoaded()) {
          throw new IllegalStateException("Can\'t set data directory suffix: WebView already initialized");
       }
       if (p0.indexOf(File.separatorChar) >= 0) {
          throw new IllegalArgumentException("Suffix "+p0+" contains a path separator");
       }
       WebViewFactory.sDataDirectorySuffix = p0;
       _monitor_exit(sProviderLoc);
       return;
    }
    public static void testLoadFailed(){
       WebViewFactory.isTestLoadFailed = true;
    }
}
