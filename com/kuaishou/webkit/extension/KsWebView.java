package com.kuaishou.webkit.extension.KsWebView;
import java.lang.Object;
import com.kuaishou.webkit.extension.KsWebView$CompletedInjectedResourceInfo;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import java.lang.String;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebViewProvider;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;
import com.kuaishou.webkit.extension.KsWebView$BlinkReceivedResourceResponceInfo;
import android.os.Bundle;
import com.kuaishou.webkit.extension.KsWebView$ResourceInfoLoadedFromMemoryCache;
import com.kuaishou.webkit.extension.KsWebView$RunnedJsInfo;
import java.lang.Long;
import com.kuaishou.webkit.extension.KsWebPaintEventListener;
import com.kuaishou.webkit.extension.KsWebSettings;
import com.kuaishou.webkit.extension.KsWebView$1;
import com.kuaishou.webkit.extension.KsWebViewClient;
import java.lang.Boolean;
import com.kuaishou.webkit.extension.MemoryCacheInjector$MemoryCacheResourceLoadObserver;
import com.kuaishou.webkit.extension.ResourceLoadFromMemoryCacheObserver;

public abstract class KsWebView	// class@0012e5
{
    public KsWebSettings mWebSetting;
    public static final int KWM_SET_MEMORY_CACHE_RESOURCE_LOAD_OBSERVER = 106;
    public static final int KWM_SET_RESOURCE_LOAD_FROM_MEMORY_CACHE_OBSERVER = 107;

    public void KsWebView(){
       super();
    }
    public static KsWebView$CompletedInjectedResourceInfo[] getCompletedInjectedResourceInfos(){
       return KsWebExtensionStatics.getCompletedInjectedResourceInfos();
    }
    public static boolean isCompileJsAndGenCodeCacheSupported(){
       return KsWebExtensionStatics.isCompileJsAndGenCodeCacheSupported();
    }
    public void compileJsAndGenCodeCache(String p0,byte[] p1,String p2){
       try{
          if (this.getWebView().getWebViewProvider() != null) {
             this.getWebView().getWebViewProvider().compileJsAndGenCodeCache(p0, p1, p2);
          }
       }catch(java.lang.Exception e2){
          Logger.e("KsWebView", "compileJsAndGenCodeCache:"+e2);
       }
       return;
    }
    public boolean doNativeCrash(boolean p0){
       WebViewProvider webViewProvi = this.getWebView().getWebViewProvider();
       if (webViewProvi != null) {
          return webViewProvi.setMiscBoolean(101, p0);
       }
       return false;
    }
    public boolean doTrimMemory(int p0){
       WebViewProvider webViewProvi = this.getWebView().getWebViewProvider();
       if (webViewProvi != null) {
          return webViewProvi.setMiscInt(105, p0);
       }
       return false;
    }
    public KsWebView$BlinkReceivedResourceResponceInfo[] getBlinkReceivedResourceResponseInfos(){
       KsWebView$BlinkReceivedResourceResponceInfo[] uBlinkReceiv = null;
       try{
          if (this.getWebView().getWebViewProvider() == null) {
             return e0;
          }
          Bundle miscObject = this.getWebView().getWebViewProvider().getMiscObject(112);
          if (miscObject == null) {
             return uBlinkReceiv;
          }
          String[] stringArray = miscObject.getStringArray("urls");
          boolean[] booleanArray = miscObject.getBooleanArray("is_from_memory_cache");
          boolean[] booleanArray1 = miscObject.getBooleanArray("is_injected");
          long[] longArray = miscObject.getLongArray("time_stamps");
          int len = stringArray.length;
          KsWebView$BlinkReceivedResourceResponceInfo[] uBlinkReceiv1 = new KsWebView$BlinkReceivedResourceResponceInfo[len];
          for (int i = 0; i < len; i = i + 1) {
             KsWebView$BlinkReceivedResourceResponceInfo uBlinkReceiv2 = new KsWebView$BlinkReceivedResourceResponceInfo(stringArray[i], booleanArray[i], booleanArray1[i], longArray[i]);
             uBlinkReceiv1[i] = v14;
          }
          return uBlinkReceiv1;
       }catch(java.lang.Exception e0){
       }
    }
    public String[] getInjectedCodeCacheWasConsumedScriptUrls(){
       try{
          if (this.getWebView().getWebViewProvider() != null) {
             return this.getWebView().getWebViewProvider().getMiscObject(109);
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public String getReferrer(){
       if (this.getWebView().getWebViewProvider() != null) {
          this.getWebView().checkThread();
          Object miscObject = this.getWebView().getWebViewProvider().getMiscObject(117);
          if (miscObject != null && miscObject instanceof String) {
             return miscObject.toString();
          }
       }
       return null;
    }
    public KsWebView$ResourceInfoLoadedFromMemoryCache[] getResourceInfosLoadedFromMemoryCache(boolean p0){
       Object obj = null;
       try{
          if (this.getWebView().getWebViewProvider() != null) {
             Bundle uBundle = new Bundle();
             uBundle.putBoolean("is_injected", p0);
             Bundle miscObjectWi = this.getWebView().getWebViewProvider().getMiscObjectWithArgs(111, uBundle, obj);
             if (miscObjectWi == null) {
                return obj;
             }else {
                String[] stringArray = miscObjectWi.getStringArray("urls");
                long[] longArray = miscObjectWi.getLongArray("time_stamps");
                if (stringArray != null && stringArray.length) {
                   KsWebView$ResourceInfoLoadedFromMemoryCache[] resourceInfo = new KsWebView$ResourceInfoLoadedFromMemoryCache[stringArray.length];
                   for (int i = 0; i < stringArray.length; i = i + 1) {
                      resourceInfo[i] = new KsWebView$ResourceInfoLoadedFromMemoryCache(stringArray[i], longArray[i]);
                   }
                   return resourceInfo;
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String[] getResourceUrlsLoadedFromMemoryCache(boolean p0){
       Object obj = null;
       try{
          if (this.getWebView().getWebViewProvider() == null) {
             return e0;
          }
          Bundle uBundle = new Bundle();
          uBundle.putBoolean("is_injected", p0);
          return this.getWebView().getWebViewProvider().getMiscObjectWithArgs(108, uBundle, obj);
       }catch(java.lang.Exception e0){
       }
    }
    public KsWebView$RunnedJsInfo[] getRunedJsInfos(){
       KsWebView$RunnedJsInfo[] runnedJsInfo = null;
       try{
          if (this.getWebView().getWebViewProvider() == null) {
             return e0;
          }
          Bundle miscObject = this.getWebView().getWebViewProvider().getMiscObject(113);
          if (miscObject == null) {
             return runnedJsInfo;
          }
          String[] stringArray = miscObject.getStringArray("urls");
          String[] stringArray1 = miscObject.getStringArray("time_stamp_infos");
          int len = stringArray.length;
          KsWebView$RunnedJsInfo[] runnedJsInfo1 = new KsWebView$RunnedJsInfo[len];
          for (int i = 0; i < len; i = i + 1) {
             String[] stringArray2 = (stringArray1[i]).split(";");
             KsWebView$RunnedJsInfo runnedJsInfo2 = new KsWebView$RunnedJsInfo(stringArray[i], Long.valueOf(stringArray2[0]).longValue(), Long.valueOf(stringArray2[1]).longValue(), Long.valueOf(stringArray2[2]).longValue(), Long.valueOf(stringArray2[3]).longValue());
             runnedJsInfo1[i] = v18;
          }
          return runnedJsInfo1;
       }catch(java.lang.Exception e0){
       }
    }
    public KsWebPaintEventListener getWebPaintEventListener(){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().getMiscObject(102);
       }
       return null;
    }
    public String getWebPerformanceJsonString(){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().getMiscObject(114);
       }
       return null;
    }
    public KsWebSettings getWebSettings(){
       if (this.mWebSetting == null) {
          this.mWebSetting = new KsWebView$1(this);
       }
       return this.mWebSetting;
    }
    public abstract WebView getWebView();
    public KsWebViewClient getWebViewClient(){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().getKsWebViewClient();
       }
       return null;
    }
    public boolean hasEnableAsyncCompositing(){
       if (this.getWebView().getWebViewProvider() == null) {
          return false;
       }
       Object miscObject = this.getWebView().getWebViewProvider().getMiscObject(110);
       if (miscObject == null) {
          return false;
       }
       return miscObject.booleanValue();
    }
    public boolean isLoadDataNotThroughNetSupported(){
       boolean b = (this.getWebView().getWebViewProvider() != null && this.getWebView().getWebViewProvider().setMiscObject(103, null))? true: false;
       return b;
    }
    public boolean isLoadDataWithBaseURLNotThroughNetSupported(){
       boolean b = (this.getWebView().getWebViewProvider() != null && this.getWebView().getWebViewProvider().setMiscObject(104, null))? true: false;
       return b;
    }
    public void loadDataNotThroughNet(String p0,String p1,String p2){
       this.getWebView().getWebViewProvider().loadDataFromKsWebView(p0, p1, p2);
    }
    public void loadDataWithBaseURLNotThroughNet(String p0,String p1,String p2,String p3,String p4){
       this.getWebView().getWebViewProvider().loadDataWithBaseURLFromKsWebView(p0, p1, p2, p3, p4);
    }
    public boolean setMemoryCacheResourceLoadObserver(MemoryCacheInjector$MemoryCacheResourceLoadObserver p0){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().setMiscObject(106, p0);
       }
       return false;
    }
    public boolean setResourceLoadFromMemoryCacheObserver(ResourceLoadFromMemoryCacheObserver p0){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().setMiscObject(107, p0);
       }
       return false;
    }
    public boolean setWebPaintEventListener(KsWebPaintEventListener p0){
       if (this.getWebView().getWebViewProvider() != null) {
          return this.getWebView().getWebViewProvider().setMiscObject(102, p0);
       }
       return false;
    }
    public void setWebViewClient(KsWebViewClient p0){
       if (this.getWebView().getWebViewProvider() != null) {
          this.getWebView().getWebViewProvider().setKsWebViewClient(p0);
       }
       return;
    }
}
