package com.kuaishou.webkit.extension.KwSdk;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.internal.Logger;
import android.app.Application;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.io.File;
import com.kuaishou.webkit.internal.loader.CommonUtils;
import android.content.Context;
import java.lang.Exception;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.webkit.internal.ApkUtils;
import java.lang.Throwable;
import com.kuaishou.webkit.internal.EventReporter;
import com.kuaishou.webkit.extension.KwSdk$InstallState;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.extension.KsCoreListener;
import com.kuaishou.webkit.extension.KwSdk$LoadError;
import com.kuaishou.webkit.internal.loader.InstallUtils;
import com.kuaishou.webkit.extension.KwSdk$1;
import java.lang.Thread;
import com.kuaishou.webkit.extension.KwSdk$InstallCallback;
import com.kuaishou.webkit.internal.FileUtils;
import com.kuaishou.webkit.internal.ErrorResult;
import org.json.JSONObject;
import com.kuaishou.webkit.extension.KwSdk$4;
import java.lang.Runnable;
import com.kuaishou.webkit.internal.ThreadUtils;
import com.kuaishou.webkit.internal.loader.CoreConfig;
import com.kuaishou.webkit.process.ChildProcessService;
import com.kuaishou.webkit.extension.KwSdk$2;
import com.kuaishou.webkit.internal.Logger$Delegate;
import com.kuaishou.webkit.extension.KwSdk$3;
import com.kuaishou.webkit.internal.EventReporter$Delegate;

public class KwSdk	// class@0012f3
{
    public static Application sApplication;
    public static boolean sHasGetHostInitCallback;
    public static KwSdk$CoreInitCallback sInitCallback;
    public static KsCoreListener sKsCoreListener;

    public void KwSdk(){
       super();
    }
    public static void clearOldVersion(){
       try{
          Logger.d("kswebview", "clearOldVersion begin");
          KsWebViewUtils.continueInstallTaskIfNeeded(KsWebViewUtils.getApplicationContext(), CommonUtils.getCoreBaseDir());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public static int compareVersion(String p0,String p1){
       return CommonUtils.compareVersion(p0, p1);
    }
    public static Application getApplication(){
       return KwSdk.sApplication;
    }
    public static String getBuildinVersion(){
       if (WebViewFactory.isBuildin()) {
          return KwSdk.getVersionName();
       }
       return "";
    }
    public static String getCoreVersionName(){
       if (KsWebViewUtils.isCoreLoaded() && !KsWebViewUtils.useSysWebView()) {
          return KsWebExtensionStatics.getCoreVersionName();
       }
       return "";
    }
    public static KwSdk$CoreInitCallback getInitCallback(){
       if (KwSdk.sInitCallback == null && !KwSdk.sHasGetHostInitCallback) {
          KwSdk.sHasGetHostInitCallback = true;
          String str = null;
          KwSdk$CoreInitCallback hostCoreInit = ApkUtils.getHostCoreInitCallback();
          KwSdk.sInitCallback = hostCoreInit;
          if (hostCoreInit == null) {
             str = "is null!";
          }
          EventReporter.onEvent("core_load_before_init_kwsdk", "call_stack", KsWebViewUtils.getCurrentStackTraceString(), "exp", str);
       }
       return KwSdk.sInitCallback;
    }
    public static String getInstallDirectory(){
       return CommonUtils.getCoreBaseDir().getAbsolutePath();
    }
    public static KwSdk$InstallState getInstallState(){
       String installedVer = KwSdk.getInstalledVersion();
       if (TextUtils.isEmpty(installedVer)) {
          return KwSdk$InstallState.STATE_NONE;
       }
       if (TextUtils.equals(KwSdk.getVersionName(), installedVer)) {
          return KwSdk$InstallState.STATE_CURRENT;
       }
       return KwSdk$InstallState.STATE_OLD;
    }
    public static String getInstalledVersion(){
       String buildinVersi = KwSdk.getBuildinVersion();
       String installedVer = KsWebViewUtils.getInstalledVersion();
       if (TextUtils.isEmpty(buildinVersi) || (!TextUtils.isEmpty(installedVer) && CommonUtils.compareVersion(buildinVersi, installedVer) < 0)) {
          buildinVersi = installedVer;
       }
       if (!TextUtils.isEmpty(buildinVersi) && !CommonUtils.versionSupported(buildinVersi)) {
          buildinVersi = "";
       }
       return buildinVersi;
    }
    public static KsCoreListener getKsCoreListener(){
       return KwSdk.sKsCoreListener;
    }
    public static KwSdk$LoadError getLoadError(){
       return KsWebViewUtils.getLoadError();
    }
    public static String getVersionFromDir(String p0){
       return InstallUtils.getVersionFromDir(p0);
    }
    public static String getVersionName(){
       return "1.8.90.597";
    }
    public static boolean init(Application p0,KwSdk$CoreInitCallback p1){
       if (KwSdk.sApplication != null) {
          return false;
       }
       KwSdk.sApplication = p0;
       KwSdk.sInitCallback = p1;
       return true;
    }
    public static void initAndPreload(Application p0,KwSdk$CoreInitCallback p1){
       if (!KwSdk.init(p0, p1)) {
          return;
       }
       KwSdk$1 u1 = new KwSdk$1("k-wv-load-pre");
       u1.setPriority(10);
       u1.start();
       return;
    }
    public static boolean install(String p0,KwSdk$InstallCallback p1){
       return KwSdk.install(p0, p1, 0xea60);
    }
    public static boolean install(String p0,KwSdk$InstallCallback p1,long p2){
       Application applicationC = KsWebViewUtils.getApplicationContext();
       File coreBaseDir = CommonUtils.getCoreBaseDir();
       FileUtils.makeSureDirExist(coreBaseDir);
       EventReporter.onEvent("core_install_will_begin", "version_count", String.valueOf(InstallUtils.getInstalledVersionCount(coreBaseDir)));
       ErrorResult uErrorResult = InstallUtils.doInstallCopy(coreBaseDir, p0);
       if (uErrorResult.succeed()) {
          EventReporter.onEvent("core_install_copy_succeed", null);
          InstallUtils.startDexOptimizeAndInstallProcess(applicationC, coreBaseDir, p0, p1, p2);
       }else if(!TextUtils.isEmpty(uErrorResult.error())){
          EventReporter.onEvent("core_install_copy_failed", "error", uErrorResult.error());
       }
       if (uErrorResult.errorCode() != -2) {
          KsWebViewUtils.continueInstallTaskIfNeeded(applicationC, coreBaseDir);
       }
       if (p1 != null) {
          ThreadUtils.postOnUiThread(new KwSdk$4(p1, KwSdk.isInstalled(), uErrorResult));
       }
       return uErrorResult.succeed();
    }
    public static boolean installFromAsset(Context p0,KwSdk$InstallCallback p1){
       File uFile = new File(CommonUtils.getCoreBaseDir(), "asset_install_temp");
       FileUtils.makeSureDirExist(uFile);
       FileUtils.extractAsset(p0, "libkswebview_config.so", CoreConfig.getConfigFile(uFile));
       String str = "libkswebview_apk.so";
       FileUtils.extractAsset(p0, str, new File(uFile, str));
       int i = 0;
       String[] kW_LIBS = CommonUtils.KW_LIBS;
       while (i < kW_LIBS.length) {
          FileUtils.extractAsset(p0, kW_LIBS[i], new File(uFile, kW_LIBS[i]));
          i = i + 1;
       }
       FileUtils.deleteFileOrDir(uFile);
       return KwSdk.install(uFile.getAbsolutePath(), p1);
    }
    public static boolean isCoreLoaded(){
       return KsWebViewUtils.isCoreLoaded();
    }
    public static boolean isInstalled(){
       boolean b = (KwSdk.getInstallState() != KwSdk$InstallState.STATE_NONE)? true: false;
       return b;
    }
    public static boolean isIsolatedProcess(){
       return KsWebViewUtils.isIsolatedProcess();
    }
    public static boolean isKwvChildProcess(Context p0){
       return KsWebViewUtils.isKwvChildProcess(p0);
    }
    public static boolean isSupportInstall(){
       return true;
    }
    public static void onChildApplicationCreated(){
       ChildProcessService.onApplicationCreate();
    }
    public static void preLoadOnBackground(){
       if (!KwSdk.isKwvChildProcess(null)) {
          KsWebViewUtils.preLoadOnBackground();
       }
       return;
    }
    public static void preload(){
       KwSdk.preload("Unknown");
    }
    public static void preload(String p0){
       if (!KwSdk.isKwvChildProcess(null)) {
          KsWebViewUtils.preLoad(p0);
       }
       return;
    }
    public static void preloadRendererProcess(){
       KsWebViewUtils.preloadRendererProcess();
    }
    public static void setCoreListener(KsCoreListener p0){
       KwSdk.sKsCoreListener = p0;
       Logger.setDelegate(new KwSdk$2());
       EventReporter.setDelegate(new KwSdk$3());
    }
    public static void setDebuggingMode(boolean p0){
       KsWebViewUtils.setDebuggingMode(p0);
    }
    public static boolean uninstall(){
       return FileUtils.deleteFileOrDir(CommonUtils.getCoreBaseDir());
    }
    public static boolean useKsWebView(){
       return (KsWebViewUtils.useSysWebView() ^ 0x01);
    }
}
