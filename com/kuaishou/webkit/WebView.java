package com.kuaishou.webkit.WebView;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.widget.AbsoluteLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;
import java.lang.System;
import android.os.Looper;
import android.os.Build$VERSION;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.view.View;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Exception;
import android.content.pm.ApplicationInfo;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import com.kuaishou.webkit.WebViewProvider;
import com.kuaishou.webkit.CookieSyncManager;
import android.widget.TextView;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.webkit.extension.KsCoreListener;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.IllegalArgumentException;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.graphics.Rect;
import java.lang.Runnable;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.webkit.WebView;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import com.kuaishou.webkit.WebViewFactory;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;
import android.content.pm.PackageInfo;
import android.net.Uri;
import java.lang.ClassLoader;
import java.util.List;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.adapter.ValueCallbackSystemAdapter;
import android.webkit.ValueCallback;
import android.util.SparseArray;
import com.kuaishou.webkit.WebViewProvider$ViewDelegate;
import android.graphics.Picture;
import com.kuaishou.webkit.WebView$CapturePictureAsyncCallback;
import com.kuaishou.webkit.extension.KsWebView;
import java.lang.Throwable;
import java.lang.Thread;
import android.util.Log;
import java.lang.RuntimeException;
import java.lang.Integer;
import com.kuaishou.webkit.WebViewProvider$ScrollDelegate;
import com.kuaishou.webkit.WebBackForwardList;
import android.webkit.WebBackForwardList;
import com.kuaishou.webkit.adapter.WebBackForwardListAdapter;
import android.print.PrintDocumentAdapter;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.WebMessagePort;
import android.webkit.WebMessagePort;
import com.kuaishou.webkit.adapter.WebMessagePortImpl;
import android.graphics.Canvas;
import android.os.Message;
import com.kuaishou.webkit.WebView$SysWebView;
import android.webkit.WebViewClient;
import com.kuaishou.webkit.adapter.WebViewClientAdapter;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebView$PrivateAccess;
import android.os.StrictMode;
import android.view.accessibility.AccessibilityNodeProvider;
import android.net.http.SslCertificate;
import android.graphics.Bitmap;
import android.os.Handler;
import com.kuaishou.webkit.WebView$HitTestResult;
import android.webkit.WebView$HitTestResult;
import com.kuaishou.webkit.extension.KsWebSettings;
import com.kuaishou.webkit.WebView$5;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.adapter.WebSettingsAdapter;
import android.webkit.WebSettings;
import android.view.textclassifier.TextClassifier;
import com.kuaishou.webkit.WebChromeClient;
import android.webkit.WebChromeClient;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import com.kuaishou.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcess;
import com.kuaishou.webkit.adapter.WebViewRenderProcessAdapter;
import com.kuaishou.webkit.WebViewRenderProcessClient;
import android.webkit.WebViewRenderProcessClient;
import com.kuaishou.webkit.adapter.WebViewRenderProcessClientAdapter;
import java.lang.Boolean;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.DragEvent;
import android.view.ViewStructure;
import com.kuaishou.webkit.URLUtil;
import com.kuaishou.webkit.WebView$VisualStateCallback;
import com.kuaishou.webkit.adapter.VisualStateCallbackAdapter;
import android.webkit.WebView$VisualStateCallback;
import com.kuaishou.webkit.WebMessage;
import com.kuaishou.webkit.adapter.WebMessageAdapter;
import android.webkit.WebMessage;
import java.io.File;
import com.kuaishou.webkit.DownloadListener;
import com.kuaishou.webkit.WebView$2;
import android.webkit.DownloadListener;
import com.kuaishou.webkit.WebView$FindListener;
import android.webkit.WebView$FindListener;
import com.kuaishou.webkit.WebView$4;
import com.kuaishou.webkit.WebView$FindListenerDistributor;
import com.kuaishou.webkit.WebView$1;
import android.graphics.Paint;
import android.view.View$OnLongClickListener;
import android.view.View$OnTouchListener;
import com.kuaishou.webkit.WebView$PictureListener;
import com.kuaishou.webkit.WebView$3;
import android.webkit.WebView$PictureListener;
import java.util.concurrent.Executor;

public class WebView extends AbsoluteLayout implements ViewTreeObserver$OnGlobalFocusChangeListener, ViewGroup$OnHierarchyChangeListener	// class@00128e
{
    public boolean mCalledBySysWebView;
    public Field mFieldScrollX;
    public Field mFieldScrollY;
    public WebView$FindListenerDistributor mFindListener;
    public KsWebView mKsWebView;
    public WebViewProvider mProvider;
    public WebView$SysWebView mSysWebView;
    public final Looper mWebViewThread;
    public static boolean sEnforceThreadChecking;
    public static boolean sHasInstance;

    public void WebView(Context p0){
       super(p0, null);
    }
    public void WebView(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010085);
    }
    public void WebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, 0);
    }
    public void WebView(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3, null, false);
    }
    public void WebView(Context p0,AttributeSet p1,int p2,int p3,Map p4,boolean p5){
       super(p0, p1, p2, 0, p4, p5, System.currentTimeMillis());
    }
    public void WebView(Context p0,AttributeSet p1,int p2,int p3,Map p4,boolean p5,long p6){
       super(p0, p1, p2);
       this.mWebViewThread = Looper.myLooper();
       if (Build$VERSION.SDK_INT >= 26 && !this.getImportantForAutofill()) {
          this.setImportantForAutofill(1);
       }
       if (p0 != null) {
          boolean b = false;
          if (KsWebViewUtils.useSysWebView()) {
             WebView.sEnforceThreadChecking = b;
             this.ensureProviderCreated();
          }else {
             try{
                this.mFieldScrollX = View.class.getDeclaredField("mScrollX");
                this.mFieldScrollY = View.class.getDeclaredField("mScrollY");
                this.mFieldScrollX.setAccessible(1);
                this.mFieldScrollY.setAccessible(1);
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
             }
             if (p0.getApplicationInfo().targetSdkVersion >= 18) {
                b = true;
             }
             WebView.sEnforceThreadChecking = b;
             this.checkThread();
             this.ensureProviderCreated();
             KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("init_webview_provider_begin", System.currentTimeMillis());
             this.mProvider.init(p4, p5);
             KsCorePerformanceTiming.NotifyGeneralPerformanceTiming("init_webview_provider_end", System.currentTimeMillis());
             CookieSyncManager.setGetInstanceIsAllowed();
          }
          if (KsWebViewUtils.devModeEnabled()) {
             WebView.setWebContentsDebuggingEnabled(1);
             TextView textView = new TextView(this.getContext());
             if (this.isKsWebView()) {
                textView.setBackgroundColor(-1605349296);
             }else {
                textView.setBackgroundColor(0xa0c00000);
             }
             textView.setTextColor(-1);
             this.addView(textView, new AbsoluteLayout$LayoutParams(-2, -2, 10, 10));
             KsWebViewUtils.onAddDevModeTextView(textView);
          }
          if (!WebView.sHasInstance) {
             WebView.sHasInstance = true;
             KsCoreListener ksCoreListen = KwSdk.getKsCoreListener();
             if (ksCoreListen != null) {
                ksCoreListen.onFirstWebViewCreated((KsWebViewUtils.useSysWebView() ^ 1));
                if (!KsWebViewUtils.useSysWebView()) {
                   ksCoreListen.onTimeDotting("create_first_webview_begin", p6);
                   ksCoreListen.onTimeDotting("create_first_webview_end", System.currentTimeMillis());
                   KsCorePerformanceTiming.NotifyFirstWebViewCreated();
                }
             }
          }
          return;
       }else {
          throw new IllegalArgumentException("Invalid context argument");
       }
    }
    public void WebView(Context p0,AttributeSet p1,int p2,Map p3,boolean p4){
       super(p0, p1, p2, 0, p3, p4);
    }
    public void WebView(Context p0,AttributeSet p1,int p2,boolean p3){
       super(p0, p1, p2, 0, null, p3);
    }
    public static boolean access$1001(WebView p0,MotionEvent p1){
       return super.onHoverEvent(p1);
    }
    public static boolean access$1101(WebView p0,int p1,Bundle p2){
       return super.performAccessibilityAction(p1, p2);
    }
    public static boolean access$1201(WebView p0){
       return super.performLongClick();
    }
    public static boolean access$1301(WebView p0,KeyEvent p1){
       return super.dispatchKeyEvent(p1);
    }
    public static boolean access$1401(WebView p0,MotionEvent p1){
       return super.onGenericMotionEvent(p1);
    }
    public static boolean access$1501(WebView p0,int p1,Rect p2){
       return super.requestFocus(p1, p2);
    }
    public static void access$1601(WebView p0,ViewGroup$LayoutParams p1){
       super.setLayoutParams(p1);
    }
    public static boolean access$1700(WebView p0,int p1){
       return p0.awakenScrollBars(p1);
    }
    public static boolean access$1800(WebView p0,int p1,boolean p2){
       return p0.awakenScrollBars(p1, p2);
    }
    public static void access$1900(WebView p0,int p1,int p2){
       p0.setMeasuredDimension(p1, p2);
    }
    public static int access$2000(WebView p0){
       return p0.getHorizontalScrollbarHeight();
    }
    public static int access$201(WebView p0){
       return super.getScrollBarStyle();
    }
    public static void access$301(WebView p0,int p1,int p2,int p3,int p4){
       super.onScrollChanged(p1, p2, p3, p4);
    }
    public static boolean access$401(WebView p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,boolean p9){
       return super.overScrollBy(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public static void access$501(WebView p0,int p1,int p2){
       super.scrollTo(p1, p2);
    }
    public static void access$601(WebView p0,int p1,int p2){
       super.scrollBy(p1, p2);
    }
    public static int access$701(WebView p0){
       return super.getScrollX();
    }
    public static int access$801(WebView p0){
       return super.getScrollY();
    }
    public static void access$901(WebView p0){
       super.computeScroll();
    }
    public static void clearClientCertPreferences(Runnable p0){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(21, "WebView", "clearClientCertPreferences\(onCleared\)")) {
             WebView.clearClientCertPreferences(p0);
          }
       }else {
          WebView.getFactory().getStatics().clearClientCertPreferences(p0);
       }
       return;
    }
    public static void disablePlatformNotifications(){
    }
    public static void disableWebView(){
       WebViewFactory.disableWebView();
       if (SystemApiVersionChecker.check(28, "WebView", "disableWebView\(\)")) {
          WebView.disableWebView();
       }
       return;
    }
    public static void enablePlatformNotifications(){
    }
    public static void enableSlowWholeDocumentDraw(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(21, "WebView", "enableSlowWholeDocumentDraw\(\)")) {
             WebView.enableSlowWholeDocumentDraw();
          }
       }else {
          WebView.getFactory().getStatics().enableSlowWholeDocumentDraw();
       }
       return;
    }
    public static String findAddress(String p0){
       try{
          return WebView.findAddress(p0);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public static void freeMemoryForTests(){
       if (KsWebViewUtils.useSysWebView()) {
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             Class.forName("android.webkit.WebView").getMethod("freeMemoryForTests", uClassArray).invoke(null, objArray);
          }catch(java.lang.Exception e0){
             Logger.w("WebView", "Method freeMemoryForTests\(\) catch Exception: "+e0);
          }
       }else {
          WebView.getFactory().getStatics().freeMemoryForTests();
       }
    }
    public static PackageInfo getCurrentWebViewPackage(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(26, "WebView", "getCurrentWebViewPackage\(\)")) {
             return WebView.getCurrentWebViewPackage();
          }
          return null;
       }else {
          PackageInfo loadedPackag = WebViewFactory.getLoadedPackageInfo();
          if (loadedPackag != null) {
             return loadedPackag;
          }
          return null;
       }
    }
    public static WebViewFactoryProvider getFactory(){
       return WebViewFactory.getProvider();
    }
    public static Uri getSafeBrowsingPrivacyPolicyUrl(){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebView.getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
       }
       if (SystemApiVersionChecker.check(27, "WebView", "getSafeBrowsingPrivacyPolicyUrl\(\)")) {
          return WebView.getSafeBrowsingPrivacyPolicyUrl();
       }
       return null;
    }
    public static ClassLoader getWebViewClassLoader(){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebView.getFactory().getWebViewClassLoader();
       }
       if (SystemApiVersionChecker.check(28, "WebView", "getWebViewClassLoader\(\)")) {
          return WebView.getWebViewClassLoader();
       }
       return null;
    }
    public static void setDataDirectorySuffix(String p0){
       WebViewFactory.setDataDirectorySuffix(p0);
    }
    public static void setSafeBrowsingWhitelist(List p0,ValueCallback p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(27, "WebView", "setSafeBrowsingWhitelist\(hosts, callback\)")) {
             ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
             WebView.setSafeBrowsingWhitelist(p0, valueCallbac);
          }
       }else {
          WebView.getFactory().getStatics().setSafeBrowsingWhitelist(p0, p1);
       }
       return;
    }
    public static void setWebContentsDebuggingEnabled(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebView.setWebContentsDebuggingEnabled(p0);
       }else {
          WebView.getFactory().getStatics().setWebContentsDebuggingEnabled(p0);
       }
       return;
    }
    public static void startSafeBrowsing(Context p0,ValueCallback p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(27, "WebView", "startSafeBrowsing\(context, callback\)")) {
             ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
             WebView.startSafeBrowsing(p0, valueCallbac);
          }
       }else {
          WebView.getFactory().getStatics().initSafeBrowsing(p0, p1);
       }
       return;
    }
    public void addJavascriptInterface(Object p0,String p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.addJavascriptInterface(p0, p1);
       }else {
          this.checkThread();
          this.mProvider.addJavascriptInterface(p0, p1);
       }
       return;
    }
    public void addView(View p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.addView(p0);
       }else {
          super.addView(p0);
       }
       return;
    }
    public void autofill(SparseArray p0){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(26, "WebView", "autofill\(value\)")) {
             this.mSysWebView.autofill(p0);
          }
       }else {
          this.mProvider.getViewDelegate().autofill(p0);
       }
       return;
    }
    public boolean canGoBack(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.canGoBack();
       }
       this.checkThread();
       return this.mProvider.canGoBack();
    }
    public boolean canGoBackOrForward(int p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.canGoBackOrForward(p0);
       }
       this.checkThread();
       return this.mProvider.canGoBackOrForward(p0);
    }
    public boolean canGoForward(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.canGoForward();
       }
       this.checkThread();
       return this.mProvider.canGoForward();
    }
    public boolean canZoomIn(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.canZoomIn();
       }
       this.checkThread();
       return this.mProvider.canZoomIn();
    }
    public boolean canZoomOut(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.canZoomOut();
       }
       this.checkThread();
       return this.mProvider.canZoomOut();
    }
    public Picture capturePicture(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.capturePicture();
       }
       this.checkThread();
       return this.mProvider.capturePicture();
    }
    public boolean capturePictureAsync(WebView$CapturePictureAsyncCallback p0){
       if (KsWebViewUtils.useSysWebView()) {
          return false;
       }
       this.checkThread();
       if (this.getKsWebView().hasEnableAsyncCompositing()) {
          return this.mProvider.capturePictureAsync(p0);
       }
       p0.onFinished(this.capturePicture());
       return true;
    }
    public void checkThread(){
       if (this.mWebViewThread != null && Looper.myLooper() != this.mWebViewThread) {
          Throwable throwable = new Throwable("A WebView method was called on thread \'"+Thread.currentThread().getName()+"\'. All WebView methods must be called on the same thread. \(Expected Looper "+this.mWebViewThread+" called on "+Looper.myLooper()+", FYI main Looper is "+Looper.getMainLooper()+"\)");
          Logger.w("WebView", Log.getStackTraceString(throwable));
          if (WebView.sEnforceThreadChecking) {
             throw new RuntimeException(throwable);
          }
       }
       return;
    }
    public void clearCache(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearCache(p0);
       }else {
          this.checkThread();
          this.mProvider.clearCache(p0);
       }
       return;
    }
    public void clearFormData(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearFormData();
       }else {
          this.checkThread();
          this.mProvider.clearFormData();
       }
       return;
    }
    public void clearHistory(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearHistory();
       }else {
          this.checkThread();
          this.mProvider.clearHistory();
       }
       return;
    }
    public void clearMatches(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearMatches();
       }else {
          this.checkThread();
          this.mProvider.clearMatches();
       }
       return;
    }
    public void clearSslPreferences(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearSslPreferences();
       }else {
          this.checkThread();
          this.mProvider.clearSslPreferences();
       }
       return;
    }
    public void clearView(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.clearView();
       }else {
          this.checkThread();
          this.mProvider.clearView();
       }
       return;
    }
    public int computeHorizontalScrollOffset(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getScrollDelegate().computeHorizontalScrollOffset();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("computeHorizontalScrollOffset", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.d("WebView", "Method computeHorizontalScrollOffset\(\) catches exception: "+e1);
          return i;
       }
    }
    public int computeHorizontalScrollRange(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getScrollDelegate().computeHorizontalScrollRange();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("computeHorizontalScrollRange", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.d("WebView", "Method computeHorizontalScrollRange\(\) catches exception: "+e1);
          return i;
       }
    }
    public void computeScroll(){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getScrollDelegate().computeScroll();
       }
       return;
    }
    public int computeVerticalScrollExtent(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getScrollDelegate().computeVerticalScrollExtent();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("computeVerticalScrollExtent", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.d("WebView", "Method computeVerticalScrollExtent\(\) catches exception: "+e1);
          return i;
       }
    }
    public int computeVerticalScrollOffset(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getScrollDelegate().computeVerticalScrollOffset();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("computeVerticalScrollOffset", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.d("WebView", "Method computeVerticalScrollOffset\(\) catches exception: "+e1);
          return i;
       }
    }
    public int computeVerticalScrollRange(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getScrollDelegate().computeVerticalScrollRange();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("computeVerticalScrollRange", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.d("WebView", "Method computeVerticalScrollRange\(\) catches exception: "+e1);
          return i;
       }
    }
    public WebBackForwardList copyBackForwardList(){
       if (KsWebViewUtils.useSysWebView()) {
          WebBackForwardList webBackForwa = this.mSysWebView.copyBackForwardList();
          WebBackForwardListAdapter webBackForwa1 = (webBackForwa != null)? new WebBackForwardListAdapter(webBackForwa): null;
          return webBackForwa1;
       }else {
          this.checkThread();
          return this.mProvider.copyBackForwardList();
       }
    }
    public PrintDocumentAdapter createPrintDocumentAdapter(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(19, "WebView", "createPrintDocumentAdapter\(\)")) {
             return this.mSysWebView.createPrintDocumentAdapter();
          }
          return null;
       }else {
          this.checkThread();
          return this.mProvider.createPrintDocumentAdapter("default");
       }
    }
    public PrintDocumentAdapter createPrintDocumentAdapter(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(21, "WebView", "createPrintDocumentAdapter\(documentName\)")) {
             return this.mSysWebView.createPrintDocumentAdapter(p0);
          }else {
             return null;
          }
       }else {
          this.checkThread();
          if (TextUtils.isEmpty(p0)) {
             p0 = "default";
          }
          return this.mProvider.createPrintDocumentAdapter(p0);
       }
    }
    public WebMessagePort[] createWebMessageChannel(){
       if (KsWebViewUtils.useSysWebView()) {
          if (!SystemApiVersionChecker.check(23, "WebView", "createWebMessageChannel\(\)")) {
             return null;
          }
          WebMessagePort[] webMessagePo = this.mSysWebView.createWebMessageChannel();
          if (webMessagePo == null) {
             return null;
          }
          int len = webMessagePo.length;
          WebMessagePortImpl[] webMessagePo1 = new WebMessagePortImpl[len];
          for (int i = 0; i < len; i = i + 1) {
             WebMessagePortImpl webMessagePo2 = (webMessagePo[i] != null)? new WebMessagePortImpl(webMessagePo[i]): null;
             webMessagePo1[i] = webMessagePo2;
          }
          return webMessagePo1;
       }else {
          this.checkThread();
          return this.mProvider.createWebMessageChannel();
       }
    }
    public void debugDump(){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.checkThread();
       }
       return;
    }
    public void destroy(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.destroy();
       }else {
          this.checkThread();
          this.mProvider.destroy();
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().preDispatchDraw(p0);
       }
       super.dispatchDraw(p0);
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.dispatchKeyEvent(p0);
       }
       return this.mProvider.getViewDelegate().dispatchKeyEvent(p0);
    }
    public void documentHasImages(Message p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.documentHasImages(p0);
       }else {
          this.checkThread();
          this.mProvider.documentHasImages(p0);
       }
       return;
    }
    public void emulateShiftHeld(){
       this.checkThread();
    }
    public final void ensureProviderCreated(){
       KsWebViewUtils.onWebViewBeforeCreate();
       if (KsWebViewUtils.useSysWebView()) {
          if (this.mSysWebView == null) {
             WebView$SysWebView sysWebView = new WebView$SysWebView(this, this, this.getContext());
             sysWebView.setFocusableInTouchMode(true);
             this.addView(sysWebView, new ViewGroup$LayoutParams(-1, -1));
             this.mSysWebView = sysWebView;
             if (SystemApiVersionChecker.check(26, "WebView", "getWebViewClient\(\)") && this.mSysWebView.getWebViewClient() != null) {
                this.mSysWebView.setWebViewClient(new WebViewClientAdapter(this, new WebViewClient()));
             }
          }
       }else {
          this.checkThread();
          if (this.mProvider == null) {
             this.mProvider = WebView.getFactory().createWebView(this, new WebView$PrivateAccess(this));
          }
       }
       return;
    }
    public void evaluateJavascript(String p0,ValueCallback p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(19, "WebView", "evaluateJavascript\(resultCallback\)")) {
             WebView tmSysWebView = this.mSysWebView;
             ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
             tmSysWebView.evaluateJavascript(p0, valueCallbac);
          }
       }else {
          this.checkThread();
          this.mProvider.evaluateJavaScript(p0, p1);
       }
       return;
    }
    public int findAll(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.findAll(p0);
       }
       this.checkThread();
       StrictMode.noteSlowCall("findAll blocks UI: prefer findAllAsync");
       return this.mProvider.findAll(p0);
    }
    public void findAllAsync(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.findAllAsync(p0);
       }else {
          this.checkThread();
          this.mProvider.findAllAsync(p0);
       }
       return;
    }
    public View findFocus(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.findFocus();
       }
       return this.mProvider.getViewDelegate().findFocus(super.findFocus());
    }
    public void findNext(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.findNext(p0);
       }else {
          this.checkThread();
          this.mProvider.findNext(p0);
       }
       return;
    }
    public void flingScroll(int p0,int p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.flingScroll(p0, p1);
       }else {
          this.checkThread();
          this.mProvider.flingScroll(p0, p1);
       }
       return;
    }
    public void freeMemory(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.freeMemory();
       }else {
          this.checkThread();
          this.mProvider.freeMemory();
       }
       return;
    }
    public CharSequence getAccessibilityClassName(){
       if (KsWebViewUtils.useSysWebView()) {
          return WebView.class.getName();
       }
       return WebView.class.getName();
    }
    public AccessibilityNodeProvider getAccessibilityNodeProvider(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getAccessibilityNodeProvider();
       }
       AccessibilityNodeProvider accessibilit = this.mProvider.getViewDelegate().getAccessibilityNodeProvider();
       if (accessibilit == null) {
          accessibilit = super.getAccessibilityNodeProvider();
       }
       return accessibilit;
    }
    public SslCertificate getCertificate(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getCertificate();
       }
       this.checkThread();
       return this.mProvider.getCertificate();
    }
    public int getContentHeight(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getContentHeight();
       }
       this.checkThread();
       return this.mProvider.getContentHeight();
    }
    public int getContentWidth(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getContentWidth();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Class.forName("android.webkit.WebView").getMethod("getContentWidth", uClassArray).invoke(this.mSysWebView, objArray).intValue();
       }catch(java.lang.Exception e1){
          Logger.w("WebView", "Method getContentWidth\(\) catch Exception: "+e1);
          return i;
       }
    }
    public Bitmap getDrawingCache(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getDrawingCache(p0);
       }
       if (!this.getKsWebView().hasEnableAsyncCompositing()) {
          return super.getDrawingCache(p0);
       }
       this.destroyDrawingCache();
       return super.getDrawingCache(p0);
    }
    public Bitmap getFavicon(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getFavicon();
       }
       this.checkThread();
       return this.mProvider.getFavicon();
    }
    public Handler getHandler(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getHandler();
       }
       return this.mProvider.getViewDelegate().getHandler(super.getHandler());
    }
    public WebView$HitTestResult getHitTestResult(){
       if (KsWebViewUtils.useSysWebView()) {
          WebView$HitTestResult hitTestResul = null;
          WebView$HitTestResult hitTestResul1 = this.mSysWebView.getHitTestResult();
          if (hitTestResul1 != null) {
             hitTestResul = new WebView$HitTestResult();
             hitTestResul.setType(hitTestResul1.getType());
             hitTestResul.setExtra(hitTestResul1.getExtra());
          }
          return hitTestResul;
       }else {
          this.checkThread();
          return this.mProvider.getHitTestResult();
       }
    }
    public String[] getHttpAuthUsernamePassword(String p0,String p1){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getHttpAuthUsernamePassword(p0, p1);
       }
       this.checkThread();
       return this.mProvider.getHttpAuthUsernamePassword(p0, p1);
    }
    public KsWebSettings getKsWebSettings(){
       return this.getKsWebView().getWebSettings();
    }
    public KsWebView getKsWebView(){
       if (this.mKsWebView == null) {
          this.mKsWebView = new WebView$5(this);
       }
       return this.mKsWebView;
    }
    public String getOriginalUrl(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getOriginalUrl();
       }
       this.checkThread();
       return this.mProvider.getOriginalUrl();
    }
    public int getProgress(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getProgress();
       }
       this.checkThread();
       return this.mProvider.getProgress();
    }
    public boolean getRendererPriorityWaivedWhenNotVisible(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getRendererPriorityWaivedWhenNotVisible();
       }
       if (SystemApiVersionChecker.check(26, "WebView", "getRendererPriorityWaivedWhenNotVisible\(\)")) {
          return this.mSysWebView.getRendererPriorityWaivedWhenNotVisible();
       }
       return false;
    }
    public int getRendererRequestedPriority(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getRendererRequestedPriority();
       }
       if (SystemApiVersionChecker.check(26, "WebView", "getRendererRequestedPriority\(\)")) {
          return this.mSysWebView.getRendererRequestedPriority();
       }
       return 0;
    }
    public float getScale(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getScale();
       }
       this.checkThread();
       return this.mProvider.getScale();
    }
    public WebSettings getSettings(){
       if (KsWebViewUtils.useSysWebView()) {
          return new WebSettingsAdapter(this.mSysWebView.getSettings());
       }
       this.checkThread();
       return this.mProvider.getSettings();
    }
    public Object getTextClassifier(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getTextClassifier();
       }
       if (SystemApiVersionChecker.check(27, "WebView", "getTextClassifier\(\)")) {
          return this.mSysWebView.getTextClassifier();
       }
       return null;
    }
    public String getTitle(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getTitle();
       }
       this.checkThread();
       return this.mProvider.getTitle();
    }
    public String getTouchIconUrl(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getTouchIconUrl();
       }
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("android.webkit.WebView").getMethod("getTouchIconUrl", uClassArray).invoke(this.mSysWebView, objArray);
       }catch(java.lang.Exception e0){
          Logger.w("WebView", "Method getTouchIconUrl\(\) catch Exception: "+e0);
          return null;
       }
    }
    public String getUrl(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getUrl();
       }
       this.checkThread();
       return this.mProvider.getUrl();
    }
    public View getView(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView;
       }
       return this;
    }
    public int getVisibleTitleHeight(){
       if (KsWebViewUtils.useSysWebView()) {
          int i = 0;
          try{
             Class[] uClassArray = new Class[i];
             Object[] objArray = new Object[i];
             return Class.forName("android.webkit.WebView").getMethod("getVisibleTitleHeight", uClassArray).invoke(this.mSysWebView, objArray).intValue();
          }catch(java.lang.Exception e1){
             Logger.d("WebView", "Method getVisibleTitleHeight\(\) catches exception: "+e1);
             return i;
          }
       }else {
          this.checkThread();
          return this.mProvider.getVisibleTitleHeight();
       }
    }
    public WebChromeClient getWebChromeClient(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(26, "WebView", "getWebChromeClient\(\)")) {
             WebChromeClient webChromeCli = this.mSysWebView.getWebChromeClient();
             if (webChromeCli != null && webChromeCli instanceof WebChromeClientAdapter) {
                return webChromeCli.getStub();
             }
          }
          return null;
       }else {
          this.checkThread();
          return this.mProvider.getWebChromeClient();
       }
    }
    public int getWebScrollX(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getScrollX();
       }
       if (this.getKsWebView().hasEnableAsyncCompositing()) {
          return this.mProvider.getScrollX();
       }
       return this.getScrollX();
    }
    public int getWebScrollY(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getScrollY();
       }
       if (this.getKsWebView().hasEnableAsyncCompositing()) {
          return this.mProvider.getScrollY();
       }
       return this.getScrollY();
    }
    public WebViewClient getWebViewClient(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(26, "WebView", "getWebViewClient\(\)")) {
             WebViewClient webViewClien = this.mSysWebView.getWebViewClient();
             if (webViewClien != null && webViewClien instanceof WebViewClientAdapter) {
                return webViewClien.getStub();
             }
          }
          return null;
       }else {
          this.checkThread();
          return this.mProvider.getWebViewClient();
       }
    }
    public WebViewProvider$ViewDelegate getWebViewDelegate(){
       if (KsWebViewUtils.useSysWebView()) {
          return null;
       }
       return this.mProvider.getViewDelegate();
    }
    public Looper getWebViewLooper(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.getWebViewLooper();
       }
       return this.mWebViewThread;
    }
    public WebViewProvider getWebViewProvider(){
       if (KsWebViewUtils.useSysWebView()) {
          return null;
       }
       return this.mProvider;
    }
    public WebViewRenderProcess getWebViewRenderProcess(){
       if (KsWebViewUtils.useSysWebView()) {
          WebViewRenderProcessAdapter webViewRende = null;
          if (SystemApiVersionChecker.check(29, "WebView", "getWebViewRenderProcess\(\)")) {
             WebViewRenderProcess webViewRende1 = this.mSysWebView.getWebViewRenderProcess();
             if (webViewRende1 != null) {
                webViewRende = new WebViewRenderProcessAdapter(webViewRende1);
             }
          }
          return webViewRende;
       }else {
          this.checkThread();
          return this.mProvider.getWebViewRenderProcess();
       }
    }
    public WebViewRenderProcessClient getWebViewRenderProcessClient(){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(29, "WebView", "getWebViewRenderProcessClient\(\)")) {
             WebViewRenderProcessClient webViewRende = this.mSysWebView.getWebViewRenderProcessClient();
             if (webViewRende != null && webViewRende instanceof WebViewRenderProcessClientAdapter) {
                return webViewRende.getStub();
             }
          }
          return null;
       }else {
          this.checkThread();
          return this.mProvider.getWebViewRenderProcessClient();
       }
    }
    public View getZoomControls(){
       if (KsWebViewUtils.useSysWebView()) {
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             return Class.forName("android.webkit.WebView").getMethod("getZoomControls", uClassArray).invoke(this.mSysWebView, objArray);
          }catch(java.lang.Exception e0){
             Logger.d("WebView", "Method getZoomControls\(\) catches exception: "+e0);
             return null;
          }
       }else {
          this.checkThread();
          return this.mProvider.getZoomControls();
       }
    }
    public void goBack(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.goBack();
       }else {
          this.checkThread();
          this.mProvider.goBack();
       }
       return;
    }
    public void goBackOrForward(int p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.goBackOrForward(p0);
       }else {
          this.checkThread();
          this.mProvider.goBackOrForward(p0);
       }
       return;
    }
    public void goForward(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.goForward();
       }else {
          this.checkThread();
          this.mProvider.goForward();
       }
       return;
    }
    public void invokeZoomPicker(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.invokeZoomPicker();
       }else {
          this.checkThread();
          this.mProvider.invokeZoomPicker();
       }
       return;
    }
    public boolean isKsWebView(){
       return (KsWebViewUtils.useSysWebView() ^ 0x01);
    }
    public boolean isPaused(){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.isPaused();
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return Class.forName("android.webkit.WebView").getMethod("isPaused", uClassArray).invoke(this.mSysWebView, objArray).booleanValue();
       }catch(java.lang.Exception e1){
          Logger.w("WebView", "Method isPaused\(\) catch Exception: "+e1);
          return i;
       }
    }
    public boolean isPrivateBrowsingEnabled(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.isPrivateBrowsingEnabled();
       }
       this.checkThread();
       return this.mProvider.isPrivateBrowsingEnabled();
    }
    public boolean isVisibleToUserForAutofill(int p0){
       if (!KsWebViewUtils.useSysWebView()) {
          return true;
       }
       if (SystemApiVersionChecker.check(28, "WebView", "isVisibleToUserForAutofill\(virtualId\)")) {
          return this.mSysWebView.isVisibleToUserForAutofill(p0);
       }
       return false;
    }
    public void loadData(String p0,String p1,String p2){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.loadData(p0, p1, p2);
       }else {
          this.checkThread();
          this.mProvider.loadData(p0, p1, p2);
       }
       return;
    }
    public void loadDataWithBaseURL(String p0,String p1,String p2,String p3,String p4){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.loadDataWithBaseURL(p0, p1, p2, p3, p4);
       }else {
          this.checkThread();
          this.mProvider.loadDataWithBaseURL(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void loadUrl(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.loadUrl(p0);
       }else {
          this.checkThread();
          this.mProvider.loadUrl(p0);
       }
       KsWebViewUtils.onWebViewLoadUrl(p0);
       return;
    }
    public void loadUrl(String p0,Map p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.loadUrl(p0, p1);
       }else {
          this.checkThread();
          this.mProvider.loadUrl(p0, p1);
       }
       KsWebViewUtils.onWebViewLoadUrl(p0);
       return;
    }
    public void notifyFindDialogDismissed(){
       if (KsWebViewUtils.useSysWebView()) {
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("notifyFindDialogDismissed", uClassArray);
             declaredMeth.setAccessible(true);
             Object[] objArray = new Object[0];
             declaredMeth.invoke(this.mSysWebView, objArray);
          }catch(java.lang.Exception e0){
             Logger.d("WebView", "Method notifyFindDialogDismissed\(\) catches exception: "+e0);
          }
       }else {
          this.checkThread();
          this.mProvider.notifyFindDialogDismissed();
       }
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onAttachedToWindow();
       }
       return;
    }
    public boolean onCheckIsTextEditor(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.onCheckIsTextEditor();
       }
       return this.mProvider.getViewDelegate().onCheckIsTextEditor();
    }
    public void onChildViewAdded(View p0,View p1){
    }
    public void onChildViewRemoved(View p0,View p1){
    }
    public void onConfigurationChanged(Configuration p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onConfigurationChanged(p0);
       }
       return;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.onCreateInputConnection(p0);
       }
       return this.mProvider.getViewDelegate().onCreateInputConnection(p0);
    }
    public void onDetachedFromWindow(){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onDetachedFromWindow();
          super.onDetachedFromWindow();
       }
       return;
    }
    public boolean onDragEvent(DragEvent p0){
       if (KsWebViewUtils.useSysWebView()) {
          return false;
       }
       return this.mProvider.getViewDelegate().onDragEvent(p0);
    }
    public void onDraw(Canvas p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onDraw(p0);
       }
       return;
    }
    public void onFinishTemporaryDetach(){
       super.onFinishTemporaryDetach();
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onFinishTemporaryDetach();
       }
       return;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onFocusChanged(p0, p1, p2);
       }
       super.onFocusChanged(p0, p1, p2);
       return;
    }
    public boolean onGenericMotionEvent(MotionEvent p0){
       if (KsWebViewUtils.useSysWebView()) {
          return false;
       }
       return this.mProvider.getViewDelegate().onGenericMotionEvent(p0);
    }
    public void onGlobalFocusChanged(View p0,View p1){
    }
    public boolean onHoverEvent(MotionEvent p0){
       if (KsWebViewUtils.useSysWebView()) {
          return false;
       }
       return this.mProvider.getViewDelegate().onHoverEvent(p0);
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getViewDelegate().onKeyDown(p0, p1);
       }
       if (this.mCalledBySysWebView != null) {
          return this.mSysWebView.super_onKeyDown(p0, p1);
       }
       return super.onKeyDown(p0, p1);
    }
    public boolean onKeyMultiple(int p0,int p1,KeyEvent p2){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getViewDelegate().onKeyMultiple(p0, p1, p2);
       }
       if (this.mCalledBySysWebView != null) {
          return this.mSysWebView.super_onKeyMultiple(p0, p1, p2);
       }
       return super.onKeyMultiple(p0, p1, p2);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getViewDelegate().onKeyUp(p0, p1);
       }
       if (this.mCalledBySysWebView != null) {
          return this.mSysWebView.super_onKeyUp(p0, p1);
       }
       return super.onKeyUp(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onMeasure(p0, p1);
       }
       return;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (KsWebViewUtils.useSysWebView()) {
          if (this.mCalledBySysWebView != null) {
             this.mSysWebView.super_onOverScrolled(p0, p1, p2, p3);
          }
       }else {
          this.mProvider.getViewDelegate().onOverScrolled(p0, p1, p2, p3);
       }
       return;
    }
    public void onPause(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.onPause();
       }else {
          this.checkThread();
          this.mProvider.onPause();
       }
       return;
    }
    public void onProvideAutofillVirtualStructure(ViewStructure p0,int p1){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onProvideAutofillVirtualStructure(p0, p1);
       }
       return;
    }
    public void onProvideVirtualStructure(ViewStructure p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onProvideVirtualStructure(p0);
       }
       return;
    }
    public void onResume(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.onResume();
       }else {
          this.checkThread();
          this.mProvider.onResume();
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (KsWebViewUtils.useSysWebView()) {
          if (this.mCalledBySysWebView != null) {
             this.mSysWebView.super_onScrollChanged(p0, p1, p2, p3);
          }else {
             super.onScrollChanged(p0, p1, p2, p3);
          }
       }else if(!this.getKsWebView().hasEnableAsyncCompositing()){
          super.onScrollChanged(p0, p1, p2, p3);
       }
       this.mProvider.getViewDelegate().onScrollChanged(p0, p1, p2, p3);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       super.onStartTemporaryDetach();
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onStartTemporaryDetach();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.getViewDelegate().onTouchEvent(p0);
       }
       if (this.mCalledBySysWebView != null) {
          return this.mSysWebView.super_TouchEvent(p0);
       }
       return super.onTouchEvent(p0);
    }
    public boolean onTrackballEvent(MotionEvent p0){
       if (KsWebViewUtils.useSysWebView()) {
          return false;
       }
       return this.mProvider.getViewDelegate().onTrackballEvent(p0);
    }
    public void onVisibilityChanged(View p0,int p1){
       super.onVisibilityChanged(p0, p1);
       this.ensureProviderCreated();
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onVisibilityChanged(p0, p1);
       }
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          this.mProvider.getViewDelegate().onWindowFocusChanged(p0);
       }
       super.onWindowFocusChanged(p0);
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (KsWebViewUtils.useSysWebView()) {
       }else {
          super.onWindowVisibilityChanged(p0);
          this.mProvider.getViewDelegate().onWindowVisibilityChanged(p0);
       }
       return;
    }
    public boolean overScrollBy(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       WebView webView = this;
       if (webView.mCalledBySysWebView != null) {
          return webView.mSysWebView.super_overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       if (this.getKsWebView().hasEnableAsyncCompositing()) {
          return webView.mProvider.overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return super.overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public boolean overlayHorizontalScrollbar(){
       return true;
    }
    public boolean overlayVerticalScrollbar(){
       return false;
    }
    public boolean pageDown(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.pageDown(p0);
       }
       this.checkThread();
       return this.mProvider.pageDown(p0);
    }
    public boolean pageUp(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.pageUp(p0);
       }
       this.checkThread();
       return this.mProvider.pageUp(p0);
    }
    public void pauseTimers(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.pauseTimers();
       }else {
          this.checkThread();
          this.mProvider.pauseTimers();
       }
       return;
    }
    public boolean performLongClick(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.performLongClick();
       }
       return this.mProvider.getViewDelegate().performLongClick();
    }
    public void postUrl(String p0,byte[] p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.postUrl(p0, p1);
       }else {
          this.checkThread();
          if (URLUtil.isNetworkUrl(p0)) {
             this.mProvider.postUrl(p0, p1);
          }else {
             this.mProvider.loadUrl(p0);
          }
       }
       return;
    }
    public void postVisualStateCallback(long p0,WebView$VisualStateCallback p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(23, "WebView", "postVisualStateCallback\(requestId, callback\)")) {
             WebView tmSysWebView = this.mSysWebView;
             VisualStateCallbackAdapter visualStateC = (p1 != null)? new VisualStateCallbackAdapter(p1): null;
             tmSysWebView.postVisualStateCallback(p0, visualStateC);
          }
       }else {
          this.checkThread();
          this.mProvider.insertVisualStateCallback(p0, p1);
       }
       return;
    }
    public void postWebMessage(WebMessage p0,Uri p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(23, "WebView", "postWebMessage\(message, targetOrigin\)")) {
             WebView tmSysWebView = this.mSysWebView;
             WebMessageAdapter webMessageAd = (p0 != null)? new WebMessageAdapter(p0): null;
             tmSysWebView.postWebMessage(webMessageAd, p1);
          }
       }else {
          this.checkThread();
          this.mProvider.postMessageToMainFrame(p0, p1);
       }
       return;
    }
    public void refreshPlugins(boolean p0){
       this.checkThread();
    }
    public void reload(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.reload();
       }else {
          this.checkThread();
          this.mProvider.reload();
       }
       return;
    }
    public void removeAllViews(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.removeAllViews();
       }else {
          super.removeAllViews();
       }
       return;
    }
    public void removeJavascriptInterface(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.removeJavascriptInterface(p0);
       }else {
          this.checkThread();
          this.mProvider.removeJavascriptInterface(p0);
       }
       return;
    }
    public void removeView(View p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.removeView(p0);
       }else {
          super.removeView(p0);
       }
       return;
    }
    public boolean requestChildRectangleOnScreen(View p0,Rect p1,boolean p2){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.requestChildRectangleOnScreen(p0, p1, p2);
       }
       return this.mProvider.getViewDelegate().requestChildRectangleOnScreen(p0, p1, p2);
    }
    public boolean requestFocus(int p0,Rect p1){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.requestFocus(p0, p1);
       }
       return this.mProvider.getViewDelegate().requestFocus(p0, p1);
    }
    public void requestFocusNodeHref(Message p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.requestFocusNodeHref(p0);
       }else {
          this.checkThread();
          this.mProvider.requestFocusNodeHref(p0);
       }
       return;
    }
    public void requestImageRef(Message p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.requestImageRef(p0);
       }else {
          this.checkThread();
          this.mProvider.requestImageRef(p0);
       }
       return;
    }
    public boolean restorePicture(Bundle p0,File p1){
       if (KsWebViewUtils.useSysWebView()) {
          int i = 0;
          try{
             Class[] uClassArray = new Class[]{Bundle.class,File.class};
             Object[] objArray = new Object[]{p0,p1};
             return Class.forName("android.webkit.WebView").getMethod("restorePicture", uClassArray).invoke(this.mSysWebView, objArray).booleanValue();
          }catch(java.lang.Exception e8){
             Logger.w("WebView", "Method restorePicture\(b, src\) catch Exception: "+e8);
             return i;
          }
       }else {
          this.checkThread();
          return this.mProvider.restorePicture(p0, p1);
       }
    }
    public WebBackForwardList restoreState(Bundle p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebBackForwardList webBackForwa = this.mSysWebView.restoreState(p0);
          WebBackForwardListAdapter webBackForwa1 = (webBackForwa != null)? new WebBackForwardListAdapter(webBackForwa): null;
          return webBackForwa1;
       }else {
          this.checkThread();
          return this.mProvider.restoreState(p0);
       }
    }
    public void resumeTimers(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.resumeTimers();
       }else {
          this.checkThread();
          this.mProvider.resumeTimers();
       }
       return;
    }
    public void savePassword(String p0,String p1,String p2){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.savePassword(p0, p1, p2);
       }else {
          this.checkThread();
          this.mProvider.savePassword(p0, p1, p2);
       }
       return;
    }
    public boolean savePicture(Bundle p0,File p1){
       if (!KsWebViewUtils.useSysWebView()) {
          return this.mProvider.savePicture(p0, p1);
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[]{Bundle.class,File.class};
          Object[] objArray = new Object[]{p0,p1};
          return Class.forName("android.webkit.WebView").getMethod("savePicture", uClassArray).invoke(this.mSysWebView, objArray).booleanValue();
       }catch(java.lang.Exception e8){
          Logger.w("WebView", "Method savePicture\(b, dest\) catch Exception: "+e8);
          return i;
       }
    }
    public WebBackForwardList saveState(Bundle p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebBackForwardList webBackForwa = this.mSysWebView.saveState(p0);
          WebBackForwardListAdapter webBackForwa1 = (webBackForwa != null)? new WebBackForwardListAdapter(webBackForwa): null;
          return webBackForwa1;
       }else {
          this.checkThread();
          return this.mProvider.saveState(p0);
       }
    }
    public void saveWebArchive(String p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.saveWebArchive(p0);
       }else {
          this.checkThread();
          this.mProvider.saveWebArchive(p0);
       }
       return;
    }
    public void saveWebArchive(String p0,boolean p1,ValueCallback p2){
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          ValueCallbackSystemAdapter valueCallbac = (p2 != null)? new ValueCallbackSystemAdapter(p2): null;
          tmSysWebView.saveWebArchive(p0, p1, valueCallbac);
       }else {
          this.checkThread();
          this.mProvider.saveWebArchive(p0, p1, p2);
       }
       return;
    }
    public void scrollBy(int p0,int p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.scrollBy(p0, p1);
       }else if(this.getKsWebView().hasEnableAsyncCompositing()){
          this.mProvider.scrollBy(p0, p1);
       }else {
          super.scrollBy(p0, p1);
       }
       return;
    }
    public void scrollTo(int p0,int p1){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.scrollTo(p0, p1);
       }else if(this.getKsWebView().hasEnableAsyncCompositing()){
          this.mProvider.scrollTo(p0, p1);
       }else {
          super.scrollTo(p0, p1);
       }
       return;
    }
    public void setBackgroundColor(int p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setBackgroundColor(p0);
       }else {
          this.mProvider.getViewDelegate().setBackgroundColor(p0);
       }
       return;
    }
    public void setCertificate(SslCertificate p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setCertificate(p0);
       }else {
          this.checkThread();
          this.mProvider.setCertificate(p0);
       }
       return;
    }
    public void setDownloadListener(DownloadListener p0){
       WebView$2 u2;
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          p0 = (p0 == null)? null: new WebView$2(this, p0);
          tmSysWebView.setDownloadListener(p0);
       }else {
          this.checkThread();
          this.mProvider.setDownloadListener(p0);
       }
       return;
    }
    public void setFindDialogFindListener(WebView$FindListener p0){
       if (KsWebViewUtils.useSysWebView()) {
          try{
             Class[] uClassArray = new Class[]{WebView$FindListener.class};
             Method declaredMeth = Class.forName("android.webkit.WebView").getDeclaredMethod("setFindDialogFindListener", uClassArray);
             declaredMeth.setAccessible(1);
             WebView tmSysWebView = this.mSysWebView;
             Object[] objArray = new Object[1];
             object oobject = (p0 == null)? null: new WebView$4(this, p0);
             objArray[0] = oobject;
             declaredMeth.invoke(tmSysWebView, objArray);
          }catch(java.lang.Exception e7){
             Logger.d("WebView", "Method setFindDialogFindListener\(listener\) catches exception: "+e7);
          }
       }else {
          this.checkThread();
          this.setupFindListenerIfNeeded();
          this.mFindListener.mFindDialogFindListener = p0;
       }
    }
    public void setFindListener(WebView$FindListener p0){
       WebView$1 u1;
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          p0 = (p0 == null)? null: new WebView$1(this, p0);
          tmSysWebView.setFindListener(p0);
       }else {
          this.checkThread();
          this.setupFindListenerIfNeeded();
          this.mFindListener.mUserFindListener = p0;
       }
       return;
    }
    public void setHorizontalScrollbarOverlay(boolean p0){
    }
    public void setHttpAuthUsernamePassword(String p0,String p1,String p2,String p3){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setHttpAuthUsernamePassword(p0, p1, p2, p3);
       }else {
          this.checkThread();
          this.mProvider.setHttpAuthUsernamePassword(p0, p1, p2, p3);
       }
       return;
    }
    public void setInitialScale(int p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setInitialScale(p0);
       }else {
          this.checkThread();
          this.mProvider.setInitialScale(p0);
       }
       return;
    }
    public void setLayerType(int p0,Paint p1){
       super.setLayerType(p0, p1);
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setLayerType(p0, p1);
       }else {
          this.mProvider.getViewDelegate().setLayerType(p0, p1);
       }
       return;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (KsWebViewUtils.useSysWebView()) {
          super.setLayoutParams(p0);
       }else {
          this.mProvider.getViewDelegate().setLayoutParams(p0);
       }
       return;
    }
    public void setMapTrackballToArrowKeys(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setMapTrackballToArrowKeys(p0);
       }else {
          this.checkThread();
          this.mProvider.setMapTrackballToArrowKeys(p0);
       }
       return;
    }
    public void setNetworkAvailable(boolean p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setNetworkAvailable(p0);
       }else {
          this.checkThread();
          this.mProvider.setNetworkAvailable(p0);
       }
       return;
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setOnLongClickListener(p0);
       }else {
          super.setOnLongClickListener(p0);
       }
       return;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.setOnTouchListener(p0);
       }else {
          super.setOnTouchListener(p0);
       }
       return;
    }
    public void setOverScrollMode(int p0){
       super.setOverScrollMode(p0);
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          if (tmSysWebView != null) {
             tmSysWebView.setOverScrollMode(p0);
          }
       }else {
          this.ensureProviderCreated();
          this.mProvider.getViewDelegate().setOverScrollMode(p0);
       }
       return;
    }
    public void setPictureListener(WebView$PictureListener p0){
       WebView$3 u3;
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          p0 = (p0 == null)? null: new WebView$3(this, p0);
          tmSysWebView.setPictureListener(p0);
       }else {
          this.checkThread();
          this.mProvider.setPictureListener(p0);
       }
       return;
    }
    public void setRendererPriorityPolicy(int p0,boolean p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(26, "WebView", "setRendererPriorityPolicy\(rendererRequestedPriority, waivedWhenNotVisible\)")) {
             this.mSysWebView.setRendererPriorityPolicy(p0, p1);
          }
       }else {
          this.mProvider.setRendererPriorityPolicy(p0, p1);
       }
       return;
    }
    public void setScrollBarStyle(int p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          if (tmSysWebView != null) {
             tmSysWebView.setScrollBarStyle(p0);
          }
       }else {
          this.mProvider.getViewDelegate().setScrollBarStyle(p0);
          super.setScrollBarStyle(p0);
       }
       return;
    }
    public void setTextClassifier(TextClassifier p0){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(27, "WebView", "setTextClassifier\(textClassifier\)")) {
             this.mSysWebView.setTextClassifier(p0);
          }
       }else {
          this.mProvider.setTextClassifier(p0);
       }
       return;
    }
    public void setVerticalScrollbarOverlay(boolean p0){
    }
    public void setWebChromeClient(WebChromeClient p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          WebChromeClientAdapter webChromeCli = (p0 != null)? new WebChromeClientAdapter(this, p0): null;
          tmSysWebView.setWebChromeClient(webChromeCli);
       }else {
          this.checkThread();
          this.mProvider.setWebChromeClient(p0);
       }
       return;
    }
    public void setWebViewClient(WebViewClient p0){
       if (KsWebViewUtils.useSysWebView()) {
          WebView tmSysWebView = this.mSysWebView;
          WebViewClientAdapter webViewClien = (p0 != null)? new WebViewClientAdapter(this, p0): null;
          tmSysWebView.setWebViewClient(webViewClien);
       }else {
          this.checkThread();
          this.mProvider.setWebViewClient(p0);
       }
       return;
    }
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient p0){
       WebViewRenderProcessClientAdapter webViewRende = null;
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(29, "WebView", "setWebViewRenderProcessClient\(webViewRenderProcessClient\)")) {
             WebView tmSysWebView = this.mSysWebView;
             if (p0 != null) {
                webViewRende = new WebViewRenderProcessClientAdapter(this, p0);
             }
             tmSysWebView.setWebViewRenderProcessClient(webViewRende);
          }
       }else {
          this.checkThread();
          this.mProvider.setWebViewRenderProcessClient(webViewRende, p0);
       }
       return;
    }
    public void setWebViewRenderProcessClient(Executor p0,WebViewRenderProcessClient p1){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(29, "WebView", "setWebViewRenderProcessClient\(executor, webViewRenderProcessClient\)")) {
             WebView tmSysWebView = this.mSysWebView;
             WebViewRenderProcessClientAdapter webViewRende = (p1 != null)? new WebViewRenderProcessClientAdapter(this, p1): null;
             tmSysWebView.setWebViewRenderProcessClient(p0, webViewRende);
          }
       }else {
          this.checkThread();
          this.mProvider.setWebViewRenderProcessClient(p0, p1);
       }
       return;
    }
    public final void setupFindListenerIfNeeded(){
       if (this.mFindListener == null) {
          WebView$FindListenerDistributor uFindListene = new WebView$FindListenerDistributor(this, null);
          this.mFindListener = uFindListene;
          this.mProvider.setFindListener(uFindListene);
       }
       return;
    }
    public boolean shouldDelayChildPressedState(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.shouldDelayChildPressedState();
       }
       return this.mProvider.getViewDelegate().shouldDelayChildPressedState();
    }
    public boolean showFindDialog(String p0,boolean p1){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.showFindDialog(p0, p1);
       }
       this.checkThread();
       return this.mProvider.showFindDialog(p0, p1);
    }
    public void stopLoading(){
       if (KsWebViewUtils.useSysWebView()) {
          this.mSysWebView.stopLoading();
       }else {
          this.checkThread();
          this.mProvider.stopLoading();
       }
       return;
    }
    public void zoomBy(float p0){
       if (KsWebViewUtils.useSysWebView()) {
          if (SystemApiVersionChecker.check(21, "WebView", "zoomBy\(zoomFactor\)")) {
             this.mSysWebView.zoomBy(p0);
          }
       }else {
          this.checkThread();
          double d = (double)p0;
          if (d - 0x3f847ae147ae147b >= 0) {
             if (d - 0x4059000000000000 <= 0) {
                this.mProvider.zoomBy(p0);
             }else {
                throw new IllegalArgumentException("zoomFactor must be less than 100.");
             }
          }else {
             throw new IllegalArgumentException("zoomFactor must be greater than 0.01.");
          }
       }
       return;
    }
    public boolean zoomIn(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.zoomIn();
       }
       this.checkThread();
       return this.mProvider.zoomIn();
    }
    public boolean zoomOut(){
       if (KsWebViewUtils.useSysWebView()) {
          return this.mSysWebView.zoomOut();
       }
       this.checkThread();
       return this.mProvider.zoomOut();
    }
}
