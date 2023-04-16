package com.kuaishou.webkit.adapter.WebSettingsAdapter;
import com.kuaishou.webkit.WebSettings;
import android.webkit.WebSettings;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Exception;
import com.kuaishou.webkit.WebSettings$ZoomDensity;
import android.webkit.WebSettings$ZoomDensity;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import com.kuaishou.webkit.WebSettings$LayoutAlgorithm;
import android.webkit.WebSettings$LayoutAlgorithm;
import android.os.Bundle;
import com.kuaishou.webkit.WebSettings$PluginState;
import android.webkit.WebSettings$PluginState;
import java.lang.Integer;
import java.lang.Enum;
import android.os.Message;
import com.kuaishou.webkit.WebSettings$RenderPriority;
import android.webkit.WebSettings$RenderPriority;

public class WebSettingsAdapter extends WebSettings	// class@0012c5
{
    public WebSettings mStub;

    public void WebSettingsAdapter(WebSettings p0){
       super();
       this.mStub = p0;
    }
    public boolean enableSmoothTransition(){
       return this.mStub.enableSmoothTransition();
    }
    public boolean getAcceptThirdPartyCookies(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Class.forName("android.webkit.WebSettings").getMethod("getAcceptThirdPartyCookies", uClassArray).invoke(this.mStub, objArray).booleanValue();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return i;
       }
    }
    public boolean getAllowContentAccess(){
       return this.mStub.getAllowContentAccess();
    }
    public boolean getAllowFileAccess(){
       return this.mStub.getAllowFileAccess();
    }
    public boolean getAllowFileAccessFromFileURLs(){
       return this.mStub.getAllowFileAccessFromFileURLs();
    }
    public boolean getAllowUniversalAccessFromFileURLs(){
       return this.mStub.getAllowUniversalAccessFromFileURLs();
    }
    public boolean getBlockNetworkImage(){
       return this.mStub.getBlockNetworkImage();
    }
    public boolean getBlockNetworkLoads(){
       return this.mStub.getBlockNetworkLoads();
    }
    public boolean getBuiltInZoomControls(){
       return this.mStub.getBuiltInZoomControls();
    }
    public int getCacheMode(){
       return this.mStub.getCacheMode();
    }
    public String getCursiveFontFamily(){
       return this.mStub.getCursiveFontFamily();
    }
    public boolean getDatabaseEnabled(){
       return this.mStub.getDatabaseEnabled();
    }
    public String getDatabasePath(){
       return this.mStub.getDatabasePath();
    }
    public int getDefaultFixedFontSize(){
       return this.mStub.getDefaultFixedFontSize();
    }
    public int getDefaultFontSize(){
       return this.mStub.getDefaultFontSize();
    }
    public String getDefaultTextEncodingName(){
       return this.mStub.getDefaultTextEncodingName();
    }
    public WebSettings$ZoomDensity getDefaultZoom(){
       return WebSettings$ZoomDensity.valueOf(this.mStub.getDefaultZoom().name());
    }
    public int getDisabledActionModeMenuItems(){
       if (SystemApiVersionChecker.check(24, "WebSettings", "getDisabledActionModeMenuItems\(\)")) {
          return this.mStub.getDisabledActionModeMenuItems();
       }
       return 0;
    }
    public boolean getDisplayZoomControls(){
       return this.mStub.getDisplayZoomControls();
    }
    public boolean getDomStorageEnabled(){
       return this.mStub.getDomStorageEnabled();
    }
    public String getFantasyFontFamily(){
       return this.mStub.getFantasyFontFamily();
    }
    public String getFixedFontFamily(){
       return this.mStub.getFixedFontFamily();
    }
    public int getForceDark(){
       if (SystemApiVersionChecker.check(29, "WebSettings", "getForceDark\(\)")) {
          return this.mStub.getForceDark();
       }
       return 0;
    }
    public boolean getJavaScriptCanOpenWindowsAutomatically(){
       return this.mStub.getJavaScriptCanOpenWindowsAutomatically();
    }
    public boolean getJavaScriptEnabled(){
       return this.mStub.getJavaScriptEnabled();
    }
    public WebSettings$LayoutAlgorithm getLayoutAlgorithm(){
       return WebSettings$LayoutAlgorithm.valueOf(this.mStub.getLayoutAlgorithm().toString());
    }
    public boolean getLightTouchEnabled(){
       return this.mStub.getLightTouchEnabled();
    }
    public boolean getLoadWithOverviewMode(){
       return this.mStub.getLoadWithOverviewMode();
    }
    public boolean getLoadsImagesAutomatically(){
       return this.mStub.getLoadsImagesAutomatically();
    }
    public boolean getMediaPlaybackRequiresUserGesture(){
       return this.mStub.getMediaPlaybackRequiresUserGesture();
    }
    public int getMinimumFontSize(){
       return this.mStub.getMinimumFontSize();
    }
    public int getMinimumLogicalFontSize(){
       return this.mStub.getMinimumLogicalFontSize();
    }
    public Object getMiscObject(int p0){
       return null;
    }
    public Object getMiscObjectWithArgs(int p0,Bundle p1,Object p2){
       return null;
    }
    public int getMixedContentMode(){
       if (SystemApiVersionChecker.check(21, "WebSettings", "getMixedContentMode\(\)")) {
          return this.mStub.getMixedContentMode();
       }
       return 0;
    }
    public boolean getNavDump(){
       return false;
    }
    public boolean getOffscreenPreRaster(){
       if (SystemApiVersionChecker.check(23, "WebSettings", "getOffscreenPreRaster\(\)")) {
          return this.mStub.getOffscreenPreRaster();
       }
       return false;
    }
    public WebSettings$PluginState getPluginState(){
       return WebSettings$PluginState.valueOf(this.mStub.getPluginState().toString());
    }
    public boolean getPluginsEnabled(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Class.forName("android.webkit.WebSettings").getMethod("getPluginsEnabled", uClassArray).invoke(this.mStub, objArray).booleanValue();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return i;
       }
    }
    public boolean getSafeBrowsingEnabled(){
       if (SystemApiVersionChecker.check(26, "WebSettings", "getSafeBrowsingEnabled\(\)")) {
          return this.mStub.getSafeBrowsingEnabled();
       }
       return false;
    }
    public String getSansSerifFontFamily(){
       return this.mStub.getSansSerifFontFamily();
    }
    public boolean getSaveFormData(){
       return this.mStub.getSaveFormData();
    }
    public boolean getSavePassword(){
       return this.mStub.getSavePassword();
    }
    public String getSerifFontFamily(){
       return this.mStub.getSerifFontFamily();
    }
    public String getStandardFontFamily(){
       return this.mStub.getStandardFontFamily();
    }
    public int getTextZoom(){
       return this.mStub.getTextZoom();
    }
    public boolean getUseWebViewBackgroundForOverscrollBackground(){
       return false;
    }
    public boolean getUseWideViewPort(){
       return this.mStub.getUseWideViewPort();
    }
    public int getUserAgent(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Class.forName("android.webkit.WebSettings").getMethod("getUserAgent", uClassArray).invoke(this.mStub, objArray).intValue();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return i;
       }
    }
    public String getUserAgentString(){
       return this.mStub.getUserAgentString();
    }
    public boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled(){
       return false;
    }
    public void setAcceptThirdPartyCookies(boolean p0){
       try{
          Class[] uClassArray = new Class[]{Boolean.TYPE};
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          Class.forName("android.webkit.WebSettings").getMethod("setAcceptThirdPartyCookies", uClassArray).invoke(this.mStub, objArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void setAllowContentAccess(boolean p0){
       this.mStub.setAllowContentAccess(p0);
    }
    public void setAllowFileAccess(boolean p0){
       this.mStub.setAllowFileAccess(p0);
    }
    public void setAllowFileAccessFromFileURLs(boolean p0){
       this.mStub.setAllowFileAccessFromFileURLs(p0);
    }
    public void setAllowUniversalAccessFromFileURLs(boolean p0){
       this.mStub.setAllowUniversalAccessFromFileURLs(p0);
    }
    public void setAppCacheEnabled(boolean p0){
       this.mStub.setAppCacheEnabled(p0);
    }
    public void setAppCacheMaxSize(long p0){
       this.mStub.setAppCacheMaxSize(p0);
    }
    public void setAppCachePath(String p0){
       this.mStub.setAppCachePath(p0);
    }
    public void setBlockNetworkImage(boolean p0){
       this.mStub.setBlockNetworkImage(p0);
    }
    public void setBlockNetworkLoads(boolean p0){
       this.mStub.setBlockNetworkLoads(p0);
    }
    public void setBuiltInZoomControls(boolean p0){
       this.mStub.setBuiltInZoomControls(p0);
    }
    public void setCacheMode(int p0){
       this.mStub.setCacheMode(p0);
    }
    public void setCursiveFontFamily(String p0){
       this.mStub.setCursiveFontFamily(p0);
    }
    public void setDatabaseEnabled(boolean p0){
       this.mStub.setDatabaseEnabled(p0);
    }
    public void setDatabasePath(String p0){
       this.mStub.setDatabasePath(p0);
    }
    public void setDefaultFixedFontSize(int p0){
       this.mStub.setDefaultFixedFontSize(p0);
    }
    public void setDefaultFontSize(int p0){
       this.mStub.setDefaultFontSize(p0);
    }
    public void setDefaultTextEncodingName(String p0){
       this.mStub.setDefaultTextEncodingName(p0);
    }
    public void setDefaultZoom(WebSettings$ZoomDensity p0){
       this.mStub.setDefaultZoom(WebSettings$ZoomDensity.valueOf(p0.name()));
    }
    public void setDisabledActionModeMenuItems(int p0){
       if (SystemApiVersionChecker.check(24, "WebSettings", "setDisabledActionModeMenuItems\(menuItems\)")) {
          this.mStub.setDisabledActionModeMenuItems(p0);
       }
       return;
    }
    public void setDisplayZoomControls(boolean p0){
       this.mStub.setDisplayZoomControls(p0);
    }
    public void setDomStorageEnabled(boolean p0){
       this.mStub.setDomStorageEnabled(p0);
    }
    public void setEnableSmoothTransition(boolean p0){
       this.mStub.setEnableSmoothTransition(p0);
    }
    public void setFantasyFontFamily(String p0){
       this.mStub.setFantasyFontFamily(p0);
    }
    public void setFixedFontFamily(String p0){
       this.mStub.setFixedFontFamily(p0);
    }
    public void setForceDark(int p0){
       if (SystemApiVersionChecker.check(29, "WebSettings", "setForceDark\(forceDark\)")) {
          this.mStub.setForceDark(p0);
       }
       return;
    }
    public void setGeolocationDatabasePath(String p0){
       this.mStub.setGeolocationDatabasePath(p0);
    }
    public void setGeolocationEnabled(boolean p0){
       this.mStub.setGeolocationEnabled(p0);
    }
    public void setJavaScriptCanOpenWindowsAutomatically(boolean p0){
       this.mStub.setJavaScriptCanOpenWindowsAutomatically(p0);
    }
    public void setJavaScriptEnabled(boolean p0){
       this.mStub.setJavaScriptEnabled(p0);
    }
    public void setLayoutAlgorithm(WebSettings$LayoutAlgorithm p0){
       this.mStub.setLayoutAlgorithm(WebSettings$LayoutAlgorithm.valueOf(p0.toString()));
    }
    public void setLightTouchEnabled(boolean p0){
       this.mStub.setLightTouchEnabled(p0);
    }
    public void setLoadWithOverviewMode(boolean p0){
       this.mStub.setLoadWithOverviewMode(p0);
    }
    public void setLoadsImagesAutomatically(boolean p0){
       this.mStub.setLoadsImagesAutomatically(p0);
    }
    public void setMediaPlaybackRequiresUserGesture(boolean p0){
       this.mStub.setMediaPlaybackRequiresUserGesture(p0);
    }
    public void setMinimumFontSize(int p0){
       this.mStub.setMinimumFontSize(p0);
    }
    public void setMinimumLogicalFontSize(int p0){
       this.mStub.setMinimumLogicalFontSize(p0);
    }
    public boolean setMiscBoolean(int p0,boolean p1){
       return false;
    }
    public boolean setMiscBundle(int p0,Bundle p1){
       return false;
    }
    public boolean setMiscInt(int p0,int p1){
       return false;
    }
    public boolean setMiscMessage(Message p0){
       return false;
    }
    public boolean setMiscObject(int p0,Object p1){
       return false;
    }
    public boolean setMiscString(int p0,String p1){
       return false;
    }
    public void setMixedContentMode(int p0){
       if (SystemApiVersionChecker.check(21, "WebSettings", "setMixedContentMode\(mode\)")) {
          this.mStub.setMixedContentMode(p0);
       }
       return;
    }
    public void setNavDump(boolean p0){
    }
    public void setNeedInitialFocus(boolean p0){
       this.mStub.setNeedInitialFocus(p0);
    }
    public void setOffscreenPreRaster(boolean p0){
       if (SystemApiVersionChecker.check(23, "WebSettings", "setOffscreenPreRaster\(enabled\)")) {
          this.mStub.setOffscreenPreRaster(p0);
       }
       return;
    }
    public void setPluginState(WebSettings$PluginState p0){
       try{
          this.mStub.setPluginState(WebSettings$PluginState.valueOf(p0.toString()));
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public void setPluginsEnabled(boolean p0){
       try{
          Class[] uClassArray = new Class[]{Boolean.TYPE};
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          Class.forName("android.webkit.WebSettings").getMethod("setPluginsEnabled", uClassArray).invoke(this.mStub, objArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void setRenderPriority(WebSettings$RenderPriority p0){
       this.mStub.setRenderPriority(WebSettings$RenderPriority.valueOf(p0.toString()));
    }
    public void setSafeBrowsingEnabled(boolean p0){
       if (SystemApiVersionChecker.check(26, "WebSettings", "setSafeBrowsingEnabled\(enable\)")) {
          this.mStub.setSafeBrowsingEnabled(p0);
       }
       return;
    }
    public void setSansSerifFontFamily(String p0){
       this.mStub.setSansSerifFontFamily(p0);
    }
    public void setSaveFormData(boolean p0){
       this.mStub.setSaveFormData(p0);
    }
    public void setSavePassword(boolean p0){
       this.mStub.setSavePassword(p0);
    }
    public void setSerifFontFamily(String p0){
       this.mStub.setSerifFontFamily(p0);
    }
    public void setStandardFontFamily(String p0){
       this.mStub.setStandardFontFamily(p0);
    }
    public void setSupportMultipleWindows(boolean p0){
       this.mStub.setSupportMultipleWindows(p0);
    }
    public void setSupportZoom(boolean p0){
       this.mStub.setSupportZoom(p0);
    }
    public void setTextZoom(int p0){
       this.mStub.setTextZoom(p0);
    }
    public void setUseWebViewBackgroundForOverscrollBackground(boolean p0){
    }
    public void setUseWideViewPort(boolean p0){
       this.mStub.setUseWideViewPort(p0);
    }
    public void setUserAgent(int p0){
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          Class.forName("android.webkit.WebSettings").getMethod("setUserAgent", uClassArray).invoke(this.mStub, objArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void setUserAgentString(String p0){
       this.mStub.setUserAgentString(p0);
    }
    public void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean p0){
    }
    public boolean supportMultipleWindows(){
       return this.mStub.supportMultipleWindows();
    }
    public boolean supportZoom(){
       return this.mStub.supportZoom();
    }
}
