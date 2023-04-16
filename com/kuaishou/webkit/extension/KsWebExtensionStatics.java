package com.kuaishou.webkit.extension.KsWebExtensionStatics;
import com.kuaishou.webkit.extension.KsWebExtensionStatics$PageLoadListenerWrapper;
import java.lang.Object;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import android.os.Bundle;
import java.lang.String;
import com.kuaishou.webkit.extension.KsWebView$CompletedInjectedResourceInfo;
import com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import com.kuaishou.webkit.extension.KsWebExtensionStatics$PreConnectHostInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Boolean;
import com.kuaishou.webkit.ValueCallback;
import android.os.Message;
import org.json.JSONObject;
import android.util.Pair;
import java.lang.Integer;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.util.List;

public class KsWebExtensionStatics	// class@0012dc
{
    public static final KsWebExtensionStatics$PageLoadListenerWrapper sPageLoadListener;
    public static WebViewFactoryProvider$Statics sStatics;

    static {
       KsWebExtensionStatics.sPageLoadListener = new KsWebExtensionStatics$PageLoadListenerWrapper();
    }
    public void KsWebExtensionStatics(){
       super();
    }
    public static void addKsCorePerformanceListener(KsCorePerformanceListener p0){
       KsCorePerformanceTiming.addListener(p0);
    }
    public static void addPageLoadListener(KsWebViewPageLoadListener p0){
       if (p0 == null) {
          return;
       }
       KsWebExtensionStatics.sPageLoadListener.addPageLoadListener(p0);
       return;
    }
    public static boolean canSetVideoFullscreenRequiresUserGesture(){
       boolean b = false;
       try{
          if (KsWebViewUtils.useSysWebView()) {
             return b;
          }
          if (WebViewFactory.getProvider() != null) {
             b = WebViewFactory.getProvider().setExtensionSetting(35, null);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getChromiumVersionName(){
       if (KsWebViewUtils.useSysWebView()) {
          return "";
       }
       return KsWebExtensionStatics.getChromiumVersionName(WebViewFactory.getProvider());
    }
    public static String getChromiumVersionName(WebViewFactoryProvider p0){
       if (p0 == null) {
          return "";
       }
       return KsWebExtensionStatics.getExtensionSettingString(p0, 51);
    }
    public static KsWebView$CompletedInjectedResourceInfo[] getCompletedInjectedResourceInfos(){
       KsWebView$CompletedInjectedResourceInfo[] uCompletedIn = null;
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             Bundle miscObject = KsWebExtensionStatics.getStatics().getMiscObject(12);
             if (miscObject == null) {
                return uCompletedIn;
             }else {
                String[] stringArray = miscObject.getStringArray("urls");
                long[] longArray = miscObject.getLongArray("time_stamps");
                if (stringArray != null && stringArray.length) {
                   KsWebView$CompletedInjectedResourceInfo[] uCompletedIn1 = new KsWebView$CompletedInjectedResourceInfo[stringArray.length];
                   for (int i = 0; i < stringArray.length; i = i + 1) {
                      uCompletedIn1[i] = new KsWebView$CompletedInjectedResourceInfo(stringArray[i], longArray[i]);
                   }
                   return uCompletedIn1;
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getCoreVersionName(){
       if (KsWebViewUtils.useSysWebView()) {
          return "";
       }
       return KsWebExtensionStatics.getCoreVersionName(WebViewFactory.getProvider());
    }
    public static String getCoreVersionName(WebViewFactoryProvider p0){
       if (p0 == null) {
          return "";
       }
       return KsWebExtensionStatics.getExtensionSettingString(p0, 52);
    }
    public static Object getExtensionSetting(WebViewFactoryProvider p0,int p1,Bundle p2){
       try{
          if (p2 == null) {
             return p0.getExtensionSetting(p1);
          }
          return p0.getExtensionSetting(p1, p2);
       }catch(java.lang.AbstractMethodError e0){
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getExtensionSettingString(WebViewFactoryProvider p0,int p1){
       p0 = KsWebExtensionStatics.getExtensionSetting(p0, p1, null);
       if (p0 != null && p0 instanceof String) {
          return String.valueOf(p0);
       }
       return "";
    }
    public static KsWebExtensionStatics$PreConnectHostInfo[] getPreConnectHostInfos(){
       KsWebExtensionStatics$PreConnectHostInfo[] preConnectHo = null;
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             Bundle miscObject = KsWebExtensionStatics.getStatics().getMiscObject(14);
             if (miscObject == null) {
                return preConnectHo;
             }else {
                String[] stringArray = miscObject.getStringArray("hosts");
                long[] longArray = miscObject.getLongArray("time_stamps");
                int[] intArray = miscObject.getIntArray("usecounts");
                long[] longArray1 = miscObject.getLongArray("first_use_time_stamps");
                long[] longArray2 = miscObject.getLongArray("proxy_resolve_end_time_stamps");
                long[] longArray3 = miscObject.getLongArray("resolved_time_stamps");
                boolean[] booleanArray = miscObject.getBooleanArray("resolved_by_proxys");
                boolean[] booleanArray1 = miscObject.getBooleanArray("using_exists");
                if (stringArray == null || (stringArray.length && booleanArray1 != null)) {
                   KsWebExtensionStatics$PreConnectHostInfo[] preConnectHo1 = new KsWebExtensionStatics$PreConnectHostInfo[stringArray.length];
                   for (int i = 0; i < stringArray.length; i = i + 1) {
                      KsWebExtensionStatics$PreConnectHostInfo preConnectHo2 = new KsWebExtensionStatics$PreConnectHostInfo(stringArray[i], longArray[i], longArray1[i], intArray[i], longArray2[i], longArray3[i], booleanArray[i], booleanArray1[i]);
                      preConnectHo1[i] = v11;
                   }
                   return preConnectHo1;
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static WebViewFactoryProvider$Statics getStatics(){
       if (KsWebViewUtils.useSysWebView()) {
          return null;
       }
       if (KsWebExtensionStatics.sStatics == null) {
          KsWebExtensionStatics.sStatics = WebViewFactory.getProvider().getStatics();
       }
       return KsWebExtensionStatics.sStatics;
    }
    public static String getUserAgent(){
       return null;
    }
    public static String getV8CachedDataVersionTag(){
       String str1;
       if (!KsWebViewUtils.isCoreLoaded()) {
          throw new RuntimeException("Method getCoreVersionName must be called after ksWebView is loaded!");
       }
       StringBuilder str = null;
       if (KsWebViewUtils.useSysWebView()) {
          return str;
       }
       String v8CachedData = KsWebExtensionStatics.getV8CachedDataVersionTag(WebViewFactory.getProvider());
       if (TextUtils.isEmpty(v8CachedData)) {
          return str;
       }
       if (KsWebViewUtils.is64Bit()) {
          str = "";
          str1 = "arm64_";
       }else {
          str = "";
          str1 = "arm_";
       }
       return str+str1+v8CachedData;
    }
    public static String getV8CachedDataVersionTag(WebViewFactoryProvider p0){
       if (p0 == null) {
          return null;
       }
       return KsWebExtensionStatics.getExtensionSettingString(p0, 53);
    }
    public static boolean isCompileJsAndGenCodeCacheSupported(){
       boolean b = false;
       try{
          if (KsWebViewUtils.useSysWebView()) {
             return b;
          }
          if (WebViewFactory.getProvider() != null) {
             b = WebViewFactory.getProvider().setExtensionSetting(10, null);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isLoadScriptSyncFromPackageFileSupported(){
       boolean b = false;
       try{
          if (!KsWebViewUtils.useSysWebView() && WebViewFactory.getProvider() != null) {
             if (WebViewFactory.getProvider().setExtensionSetting(5, null)) {
                return true;
             }else if(KsWebExtensionStatics.getStatics() != null){
                b = KsWebExtensionStatics.getStatics().setMiscObject(5, null);
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isMemoryCacheInjectorSupported(){
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             return KsWebExtensionStatics.getStatics().setMiscObject(9, null);
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isPackageFileEvaluateJsListWithCallbackSupported(){
       boolean b = false;
       try{
          if (!KsWebViewUtils.useSysWebView() && WebViewFactory.getProvider() != null) {
             if (WebViewFactory.getProvider().setExtensionSetting(4, null)) {
                return true;
             }else if(KsWebExtensionStatics.getStatics() != null){
                b = KsWebExtensionStatics.getStatics().setMiscObject(4, null);
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isPackageFileSupported(){
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             return KsWebExtensionStatics.getStatics().setMiscObject(1, null);
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isSupportSdkVersion(WebViewFactoryProvider p0){
       if (p0 == null) {
          return false;
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("sdk_ver", "1.8.90.597");
       p0 = KsWebExtensionStatics.getExtensionSetting(p0, 50, uBundle);
       if (p0 != null) {
          return p0.booleanValue();
       }
       return true;
    }
    public static void onPageLoad(String p0,int p1,boolean p2){
       KsWebExtensionStatics.sPageLoadListener.onPageLoad(p0, p1, p2);
    }
    public static void onPageLoad(String p0,int p1,boolean p2,String p3){
       KsWebExtensionStatics.sPageLoadListener.onPageLoad(p0, p1, p2, p3);
    }
    public static void onUploadKsWebViewAssistantInfo(String p0,String p1,String p2){
       KsWebExtensionStatics.sPageLoadListener.onUploadKsWebViewAssistantInfo(p0, p1, p2);
    }
    public static void removeKsCorePerformanceListener(KsCorePerformanceListener p0){
       KsCorePerformanceTiming.removeListener(p0);
    }
    public static void removePageLoadListener(KsWebViewPageLoadListener p0){
       KsWebExtensionStatics.sPageLoadListener.removePageLoadListener(p0);
    }
    public static boolean requestResourceDump(int p0,ValueCallback p1){
       try{
          if (KsWebExtensionStatics.getStatics() == null) {
             return false;
          }
          Message message = Message.obtain();
          message.what = 3;
          message.arg1 = p0;
          message.obj = p1;
          return KsWebExtensionStatics.getStatics().setMiscMessage(message);
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean requestResourceDumpWithParams(int p0,JSONObject p1,ValueCallback p2){
       try{
          if (KsWebExtensionStatics.getStatics() == null) {
             return false;
          }
          Message message = Message.obtain();
          message.what = 57;
          message.arg1 = p0;
          message.obj = new Pair(p1, p2);
          return KsWebExtensionStatics.getStatics().setMiscMessage(message);
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean setHttpDnsFunctionTable(long p0,int p1){
       boolean b = false;
       try{
          if (KsWebViewUtils.useSysWebView()) {
             return b;
          }
          WebViewFactoryProvider provider = WebViewFactory.getProvider();
          if (provider == null) {
             return e0;
          }
          provider.setExtensionSetting(61, new Integer(p1));
          return provider.setExtensionSetting(62, new Long(p0));
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean setV8ClassicScriptCacheMode(int p0){
       if (p0 < 0 || p0 > 2) {
          throw new IllegalArgumentException("mode\'s value should be 0-2, current value:"+p0);
       }
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             return KsWebExtensionStatics.getStatics().setMiscInt(11, p0);
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean startPreResolveUrls(List p0){
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             return KsWebExtensionStatics.getStatics().setMiscObject(15, p0);
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean startPreconnectUrl(List p0){
       try{
          if (KsWebExtensionStatics.getStatics() != null) {
             return KsWebExtensionStatics.getStatics().setMiscObject(13, p0);
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean umapSystemWebViewMemory(){
       boolean b = false;
       try{
          if (KsWebViewUtils.useSysWebView()) {
             return b;
          }
          if (WebViewFactory.getProvider() != null) {
             b = WebViewFactory.getProvider().setExtensionSetting(6, null);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
