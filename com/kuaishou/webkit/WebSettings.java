package com.kuaishou.webkit.WebSettings;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.WebSettings;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import android.os.Bundle;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import com.kuaishou.webkit.WebSettings$ZoomDensity;
import com.kuaishou.webkit.WebSettings$LayoutAlgorithm;
import com.kuaishou.webkit.WebSettings$PluginState;
import com.kuaishou.webkit.WebSettings$TextSize;
import java.lang.Math;
import android.os.Message;
import com.kuaishou.webkit.WebSettings$RenderPriority;

public abstract class WebSettings	// class@00127a
{
    public static final int LOAD_NORMAL;

    public void WebSettings(){
       super();
    }
    public static String getDefaultUserAgent(Context p0){
       return WebSettings.getDefaultUserAgentImpl(p0, 1, 2);
    }
    public static String getDefaultUserAgentImpl(Context p0,int p1,int p2){
       if (KsWebViewUtils.useSysWebView()) {
          return WebSettings.getDefaultUserAgent(p0);
       }
       int userAgentPol = InitSettingsImpl.getInstance().getUserAgentPolicy();
       if (p1 & userAgentPol) {
          Bundle uBundle = null;
          if (p2 & userAgentPol) {
             uBundle = new Bundle();
             uBundle.putBoolean("async_init", true);
          }
          Object extensionSet = WebViewFactory.getProvider().getExtensionSetting(56, uBundle);
          if (extensionSet != null && extensionSet instanceof String) {
             return extensionSet;
          }
       }
    label_0038 :
       return WebViewFactory.getProvider().getStatics().getDefaultUserAgent(p0);
    }
    public static String getDefaultUserAgentQuick(Context p0){
       return WebSettings.getDefaultUserAgentImpl(p0, 4, 8);
    }
    public abstract boolean enableSmoothTransition();
    public abstract boolean getAcceptThirdPartyCookies();
    public abstract boolean getAllowContentAccess();
    public abstract boolean getAllowFileAccess();
    public abstract boolean getAllowFileAccessFromFileURLs();
    public abstract boolean getAllowUniversalAccessFromFileURLs();
    public abstract boolean getBlockNetworkImage();
    public abstract boolean getBlockNetworkLoads();
    public abstract boolean getBuiltInZoomControls();
    public abstract int getCacheMode();
    public abstract String getCursiveFontFamily();
    public abstract boolean getDatabaseEnabled();
    public abstract String getDatabasePath();
    public abstract int getDefaultFixedFontSize();
    public abstract int getDefaultFontSize();
    public abstract String getDefaultTextEncodingName();
    public abstract WebSettings$ZoomDensity getDefaultZoom();
    public abstract int getDisabledActionModeMenuItems();
    public abstract boolean getDisplayZoomControls();
    public abstract boolean getDomStorageEnabled();
    public abstract String getFantasyFontFamily();
    public abstract String getFixedFontFamily();
    public int getForceDark(){
       return 1;
    }
    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();
    public abstract boolean getJavaScriptEnabled();
    public abstract WebSettings$LayoutAlgorithm getLayoutAlgorithm();
    public abstract boolean getLightTouchEnabled();
    public abstract boolean getLoadWithOverviewMode();
    public abstract boolean getLoadsImagesAutomatically();
    public abstract boolean getMediaPlaybackRequiresUserGesture();
    public abstract int getMinimumFontSize();
    public abstract int getMinimumLogicalFontSize();
    public abstract Object getMiscObject(int p0);
    public abstract Object getMiscObjectWithArgs(int p0,Bundle p1,Object p2);
    public abstract int getMixedContentMode();
    public abstract boolean getNavDump();
    public abstract boolean getOffscreenPreRaster();
    public abstract WebSettings$PluginState getPluginState();
    public abstract boolean getPluginsEnabled();
    public String getPluginsPath(){
       return "";
    }
    public abstract boolean getSafeBrowsingEnabled();
    public abstract String getSansSerifFontFamily();
    public abstract boolean getSaveFormData();
    public abstract boolean getSavePassword();
    public abstract String getSerifFontFamily();
    public abstract String getStandardFontFamily();
    public synchronized WebSettings$TextSize getTextSize(){
       WebSettings$TextSize textSize = null;
       int i = Integer.MAX_VALUE;
       int textZoom = this.getTextZoom();
       WebSettings$TextSize[] textSizeArra = WebSettings$TextSize.values();
       int len = textSizeArra.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             object oobject = textSizeArra[i1];
             int i2 = textZoom - oobject.value;
             i2 = Math.abs(i2);
             if (!i2) {
                return oobject;
             }else if(i2 < i){
                textSize = oobject;
                i = i2;
             }
             i1 = i1 + 1;
          }else if(textSize != null){
             textSize = WebSettings$TextSize.NORMAL;
             break ;
          }
          break ;
       }
       return textSize;
    }
    public abstract int getTextZoom();
    public boolean getUseDoubleTree(){
       return false;
    }
    public abstract boolean getUseWebViewBackgroundForOverscrollBackground();
    public abstract boolean getUseWideViewPort();
    public abstract int getUserAgent();
    public abstract String getUserAgentString();
    public abstract boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled();
    public abstract void setAcceptThirdPartyCookies(boolean p0);
    public abstract void setAllowContentAccess(boolean p0);
    public abstract void setAllowFileAccess(boolean p0);
    public abstract void setAllowFileAccessFromFileURLs(boolean p0);
    public abstract void setAllowUniversalAccessFromFileURLs(boolean p0);
    public abstract void setAppCacheEnabled(boolean p0);
    public abstract void setAppCacheMaxSize(long p0);
    public abstract void setAppCachePath(String p0);
    public abstract void setBlockNetworkImage(boolean p0);
    public abstract void setBlockNetworkLoads(boolean p0);
    public abstract void setBuiltInZoomControls(boolean p0);
    public abstract void setCacheMode(int p0);
    public abstract void setCursiveFontFamily(String p0);
    public abstract void setDatabaseEnabled(boolean p0);
    public abstract void setDatabasePath(String p0);
    public abstract void setDefaultFixedFontSize(int p0);
    public abstract void setDefaultFontSize(int p0);
    public abstract void setDefaultTextEncodingName(String p0);
    public abstract void setDefaultZoom(WebSettings$ZoomDensity p0);
    public abstract void setDisabledActionModeMenuItems(int p0);
    public abstract void setDisplayZoomControls(boolean p0);
    public abstract void setDomStorageEnabled(boolean p0);
    public abstract void setEnableSmoothTransition(boolean p0);
    public abstract void setFantasyFontFamily(String p0);
    public abstract void setFixedFontFamily(String p0);
    public void setForceDark(int p0){
    }
    public abstract void setGeolocationDatabasePath(String p0);
    public abstract void setGeolocationEnabled(boolean p0);
    public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean p0);
    public abstract void setJavaScriptEnabled(boolean p0);
    public abstract void setLayoutAlgorithm(WebSettings$LayoutAlgorithm p0);
    public abstract void setLightTouchEnabled(boolean p0);
    public abstract void setLoadWithOverviewMode(boolean p0);
    public abstract void setLoadsImagesAutomatically(boolean p0);
    public abstract void setMediaPlaybackRequiresUserGesture(boolean p0);
    public abstract void setMinimumFontSize(int p0);
    public abstract void setMinimumLogicalFontSize(int p0);
    public abstract boolean setMiscBoolean(int p0,boolean p1);
    public abstract boolean setMiscBundle(int p0,Bundle p1);
    public abstract boolean setMiscInt(int p0,int p1);
    public abstract boolean setMiscMessage(Message p0);
    public abstract boolean setMiscObject(int p0,Object p1);
    public abstract boolean setMiscString(int p0,String p1);
    public abstract void setMixedContentMode(int p0);
    public abstract void setNavDump(boolean p0);
    public abstract void setNeedInitialFocus(boolean p0);
    public abstract void setOffscreenPreRaster(boolean p0);
    public abstract void setPluginState(WebSettings$PluginState p0);
    public abstract void setPluginsEnabled(boolean p0);
    public void setPluginsPath(String p0){
    }
    public abstract void setRenderPriority(WebSettings$RenderPriority p0);
    public abstract void setSafeBrowsingEnabled(boolean p0);
    public abstract void setSansSerifFontFamily(String p0);
    public abstract void setSaveFormData(boolean p0);
    public abstract void setSavePassword(boolean p0);
    public abstract void setSerifFontFamily(String p0);
    public abstract void setStandardFontFamily(String p0);
    public abstract void setSupportMultipleWindows(boolean p0);
    public abstract void setSupportZoom(boolean p0);
    public synchronized void setTextSize(WebSettings$TextSize p0){
       this.setTextZoom(p0.value);
    }
    public abstract void setTextZoom(int p0);
    public void setUseDoubleTree(boolean p0){
    }
    public abstract void setUseWebViewBackgroundForOverscrollBackground(boolean p0);
    public abstract void setUseWideViewPort(boolean p0);
    public abstract void setUserAgent(int p0);
    public abstract void setUserAgentString(String p0);
    public abstract void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean p0);
    public abstract boolean supportMultipleWindows();
    public abstract boolean supportZoom();
}
