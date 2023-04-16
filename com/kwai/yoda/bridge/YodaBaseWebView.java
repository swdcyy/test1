package com.kwai.yoda.bridge.YodaBaseWebView;
import my7.b;
import rx7.t;
import com.kwai.yoda.kernel.container.YodaWebView;
import android.content.Context;
import java.util.UUID;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.yoda.model.RunTimeState;
import com.kwai.yoda.bridge.c;
import java.util.HashSet;
import java.lang.Object;
import com.kwai.yoda.Yoda;
import ty7.j;
import ty7.b;
import rx7.v;
import java.lang.Boolean;
import java.util.LinkedList;
import crd.a;
import android.util.AttributeSet;
import mz7.a;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.event.d;
import com.kuaishou.webkit.WebView;
import android.view.ViewParent;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Long;
import java.util.Objects;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import xz7.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import px7.d;
import kotlin.jvm.internal.a;
import my7.i;
import my7.o;
import java.lang.Integer;
import java.lang.Throwable;
import my7.f;
import java.lang.IllegalArgumentException;
import yz7.r;
import com.kwai.yoda.model.LaunchModel;
import my7.f$a;
import io.reactivex.g;
import brd.t;
import erd.g;
import com.kuaishou.live.common.core.basic.tools.h;
import crd.b;
import px7.a;
import gz7.i;
import java.util.List;
import com.kwai.yoda.model.LaunchModelInternal;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.ConcurrentHashMap;
import wz7.d;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import java.util.Map;
import com.kwai.yoda.bridge.g;
import com.kwai.yoda.cache.YodaXCache;
import gz7.b;
import com.kwai.yoda.request.YodaWebRequestProcessor;
import java.lang.CharSequence;
import yb7.o;
import android.widget.ProgressBar;
import android.graphics.drawable.Drawable;
import com.kwai.yoda.model.LaunchModel$a;
import rx7.x;
import com.kwai.yoda.bridge.YodaWebChromeClient;
import nz7.e;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import com.kuaishou.webkit.DownloadListener;
import com.kwai.yoda.helper.WebViewMemOptHelper;
import java.lang.StringBuilder;
import rb7.c;
import rx7.r;
import rb7.a;
import sz7.l;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import xz7.d;
import com.kwai.yoda.bridge.YodaBaseWebView$b;
import java.lang.Runnable;
import ca7.v;
import com.kuaishou.webkit.extension.KsWebView$BlinkReceivedResourceResponceInfo;
import com.kuaishou.webkit.extension.KsWebView;
import r97.d0;
import com.kuaishou.webkit.extension.KsWebView$CompletedInjectedResourceInfo;
import yz7.e;
import com.google.gson.JsonObject;
import ty7.c;
import sz7.q;
import java.util.Arrays;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import java.util.ArrayList;
import wz7.a;
import jz7.e;
import java.util.Collections;
import android.content.MutableContextWrapper;
import yz7.c;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import com.kuaishou.webkit.WebBackForwardList;
import com.kuaishou.webkit.WebHistoryItem;
import android.util.Log;
import com.kuaishou.webkit.extension.KsWebView$ResourceInfoLoadedFromMemoryCache;
import com.kuaishou.webkit.extension.KsWebView$RunnedJsInfo;
import xz7.e;
import android.app.Activity;
import rx7.s;
import com.kuaishou.webkit.WebSettings;
import px7.e;
import android.text.TextUtils;
import com.kwai.yoda.kernel.cookie.YodaWebCookie;
import px7.b;
import com.kwai.yoda.model.ButtonParams;
import ca7.u;
import px7.c;
import com.kwai.yoda.model.PageStyleParams;
import com.kwai.yoda.model.StatusBarParams;
import com.kwai.yoda.model.PullDownTypeParams;
import com.kwai.yoda.model.ButtonParams$PositionId;
import com.kwai.yoda.model.ButtonParams$Icon;
import com.kwai.yoda.bridge.YodaBaseWebView$a;
import com.kuaishou.webkit.extension.KsWebPaintEventListener;
import android.view.ViewGroup$LayoutParams;
import yz7.n;
import com.kwai.yoda.bridge.d;
import android.view.View$OnTouchListener;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData;
import com.kwai.yoda.session.logger.sample.WebSampleRateItem;
import o97.a;
import yz7.k;
import ry7.e;
import sz7.j;
import hy7.a;
import yb7.g;
import android.graphics.Picture;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import rx7.z;
import f97.a;
import java.lang.Exception;
import com.kuaishou.webkit.URLUtil;
import java.util.Set;
import com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import com.kwai.yoda.bridge.YodaBaseWebView$d;
import android.view.KeyEvent;
import org.json.JSONObject;
import com.kwai.yoda.bridge.c$b;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import com.kwai.yoda.helper.WebViewMemOptHelper$a;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import io.reactivex.android.schedulers.a;
import gy7.g;
import erd.o;
import gy7.h;
import erd.r;
import gy7.i;
import gy7.j;
import gy7.k;
import erd.a;
import android.widget.AbsoluteLayout$LayoutParams;
import vy7.a;
import vy7.a$a;
import o97.a$a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import java.util.concurrent.CopyOnWriteArrayList;
import ry7.g;
import uy7.a;
import rx7.f;
import com.kwai.yoda.a;
import rx7.j;
import rx7.i;
import rx7.h;
import rx7.e;
import sx7.x;
import sx7.x$a;
import sx7.x$b;
import bz7.a;
import jr4.b$b;
import rx7.y;
import rx7.a0;
import gy7.l;
import c97.d;
import com.kwai.yoda.session.logger.webviewload.ReferSessionInfo;
import kr4.a$f;
import nz7.b;
import rx7.u;
import com.kuaishou.webkit.extension.KsWebSettings;
import com.kwai.yoda.YodaInitConfig;
import android.net.Uri;
import com.kwai.yoda.hybrid.AppConfigHandler;
import iy7.a;
import com.kwai.yoda.bridge.YodaBaseWebView$c;
import com.kuaishou.webkit.extension.KsWebViewClient;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.webkit.WebSettings$PluginState;
import ca7.m;
import gy7.n;
import rx7.w;
import com.kwai.yoda.bridge.f;
import com.kwai.yoda.bridge.e;
import sy7.b;
import com.kwai.yoda.util.Supplier;
import java.util.Locale;
import yz7.f;
import yz7.f$a;

public abstract class YodaBaseWebView extends YodaWebView implements b, t	// class@001183
{
    public final Object AJAX_HELPER_LOCK;
    public Boolean[] blankCheckList;
    public JsonObject currentPageData;
    public v loadUrlInfo;
    public b mBlankCheckDisposable;
    public d0 mClientLogCallback;
    public a mContainerSession;
    public String mCurrentUrl;
    public final b mDebugTools;
    public boolean mDestroyed;
    public boolean mEmbedded;
    public final boolean mIsColdStart;
    public boolean mIsLastAppLifecycle;
    public NewYodaJavascriptBridge mJavascriptBridge;
    public d mJsInterceptor;
    public KsWebPaintEventListener mKsWebPaintEventListener;
    public WebView mKuaishouWebView;
    public LaunchModel mLaunchModel;
    public a mLifeCycleCompositeDisposable;
    public b mLifeCycleDisposable;
    public final c mLoadEventLogger;
    public ProgressBar mLoadingProgressBar;
    public i mManagerProvider;
    public e mMediaRecorder;
    public Context mOriginContext;
    public boolean mPageLoadFinished;
    public int mPendingVideoFullScreenOrientation;
    public boolean mPreCached;
    public AtomicInteger mProgressChangedCount;
    public boolean mRenderProcessKilled;
    public final RunTimeState mRunTimeState;
    public final HashSet mScrollChangeCallbacks;
    public boolean mShowing;
    public e mTopTaskHelper;
    public boolean mTouchViewContentUrlState;
    public e mUserAgentJar;
    public YodaWebCookie mWebCookie;
    public final String mWebViewId;
    public final LinkedList mWebViewInterceptors;
    public int mWebViewSessionCount;
    public KsWebView mYodaKsWebView;
    public YodaWebChromeClient mYodaWebChromeClient;
    public g mYodaWebViewClient;
    public v pageUrlInfo;
    public static final String TAG = "YodaBaseWebView";

    public void YodaBaseWebView(Context p0){
       super(p0);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.initBaseWebView(p0);
    }
    public void YodaBaseWebView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.initBaseWebView(p0);
    }
    public void YodaBaseWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.initBaseWebView(p0);
    }
    public void YodaBaseWebView(Context p0,AttributeSet p1,int p2,a p3){
       super(p0, p1, p2);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.setContainerSession(p3);
       this.initBaseWebView(p0);
    }
    public void YodaBaseWebView(Context p0,AttributeSet p1,a p2){
       super(p0, p1);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.setContainerSession(p2);
       this.initBaseWebView(p0);
    }
    public void YodaBaseWebView(Context p0,a p1){
       super(p0);
       this.mWebViewId = UUID.randomUUID().toString();
       this.mWebViewSessionCount = 0;
       this.mPageLoadFinished = false;
       this.mProgressChangedCount = new AtomicInteger(0);
       this.mRunTimeState = new RunTimeState();
       this.mLoadEventLogger = new c();
       this.mScrollChangeCallbacks = new HashSet();
       this.AJAX_HELPER_LOCK = new Object();
       this.mDestroyed = false;
       this.mPreCached = false;
       this.mIsColdStart = Yoda.get().isColdStart();
       this.mDebugTools = j.c.a(this);
       this.mCurrentUrl = "";
       this.pageUrlInfo = new v();
       this.loadUrlInfo = new v();
       this.mKsWebPaintEventListener = null;
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       this.mWebViewInterceptors = new LinkedList();
       this.mPendingVideoFullScreenOrientation = Integer.MIN_VALUE;
       this.mLifeCycleCompositeDisposable = new a();
       this.setContainerSession(p1);
       this.initBaseWebView(p0);
    }
    public static void access$101(YodaBaseWebView p0,String p1,ValueCallback p2){
       super.evaluateJavascript(p1, p2);
    }
    private void destroyInternal(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "75")) {
          return;
       }
       d.f().b(this);
       this.stopLoading();
       ViewParent parent = this.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(this);
       }
       this.removeAllViews();
       this.clearHistory();
       return;
    }
    public static void k(YodaBaseWebView p0){
       p0.lambda$onWebViewLoadError$6();
    }
    public static void l(YodaBaseWebView p0,Long p1){
       p0.lambda$startCheckBlank$2(p1);
    }
    private void lambda$createLifecycleObserver$1(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xc84dc82d:
             if (p0.equals("resume")) {
                i = 0;
             }
             break;
           case 0x360802:
             if (p0.equals("stop")) {
                i = 1;
             }
             break;
           case 0x65825f6:
             if (p0.equals("pause")) {
                i = 2;
             }
             break;
           case 0x68ac462:
             if (p0.equals("start")) {
                i = 3;
             }
             break;
           case 0x5cd39ffa:
             if (p0.equals("destroy")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.onResume();
             break;
           case 1:
             this.onStop();
             break;
           case 2:
             this.onPause();
             break;
           case 3:
             this.onStart();
             break;
           case 4:
             this.onDestroy();
             break;
           default:
       }
       return;
    }
    public static boolean lambda$initViewSettings$0(View p0,MotionEvent p1){
       int action = p1.getAction();
       if (action && (action == 1 && (p0 != null && !p0.hasFocus()))) {
          p0.requestFocus();
       }
    label_0015 :
       return false;
    }
    private void lambda$isPureColor$5(Bitmap p0,int p1){
       double d;
       YodaBaseWebView yodaBaseWebV = this;
       YodaBaseWebView obj = p0;
       int i = p1;
       Object obj1 = PatchProxy.applyOneRefs(obj, null, b.class, "4");
       if (obj1 != PatchProxyResult.class) {
          d = obj1.doubleValue();
       }else if(obj == null){
          d = 0x3ff0000000000000;
       }else {
          int width = p0.getWidth();
          int height = p0.getHeight();
          if (width <= 0 || height <= 0) {
             d = 0x3ff0000000000000;
          }else {
             int i1 = 256;
             int[] ointArray = new int[i1];
             int i2 = 0;
             int i3 = 0;
             while (i2 < height) {
                for (int i4 = 0; i4 < width; i4 = i4 + 8) {
                   int pixel = obj.getPixel(i4, i2);
                   double d1 = (double)Color.red(pixel) * 0x3fd322d0e5604189;
                   d = (double)Color.green(pixel) * 0x3fe2c8b439581062;
                   d1 = d1 + d;
                   d = (double)Color.blue(pixel) * 0x3fbd2f1a9fbe76c9;
                   d1 = d1 + d;
                   int i5 = (int)d1;
                   int i6 = ointArray[i5] + 1;
                   ointArray[i5] = i6;
                   ointArray[i5] = i6;
                   i3 = i3 + 1;
                }
                i2 = i2 + 8;
             }
             int i7 = -1;
             int i8 = 0;
             while (i8 < i1) {
                if (i7 < ointArray[i8]) {
                   i7 = ointArray[i8];
                }
                i8 = i8 + 1;
             }
             d = ((double)i7 * 0x3ff0000000000000) / (double)i3;
          }
       }
       obj = yodaBaseWebV.blankCheckList;
       if (obj != null && obj.length > i) {
          if (d - 0x3fee666666666666 < 0) {
             this.disposeBlankCheck();
             obj = yodaBaseWebV.blankCheckList;
             while (i < obj.length) {
                obj[i] = Boolean.FALSE;
                i = i + 1;
             }
          }else {
             obj[i] = Boolean.TRUE;
          }
       }
       return;
    }
    private void lambda$onWebViewLoadError$6(){
       if (PatchProxy.applyVoidOneRefs(this, null, d.class, "3")) {
       }else {
          a.q(this, "$this$showErrorPage");
          i managerProvi = this.getManagerProvider();
          if (managerProvi != null) {
             o oo = managerProvi.b();
             if (oo != null) {
                oo.i();
             }
          }
       }
       return;
    }
    private void lambda$onWebViewLoadError$7(Integer p0){
       int i = p0.intValue();
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(this, Integer.valueOf(i), null, uod, "4")) {
          a.q(this, "$this$showErrorPage");
          i managerProvi = this.getManagerProvider();
          if (managerProvi != null) {
             o oo = managerProvi.b();
             if (oo != null) {
                oo.b(i);
             }
          }
       }
       return;
    }
    private void lambda$startCheckBlank$2(Long p0){
       this.isPureColor(this, p0.intValue());
    }
    public static void lambda$startCheckBlank$3(Throwable p0){
    }
    public static void lambda$startCheckBlank$4(){
    }
    public static void m(YodaBaseWebView p0,Integer p1){
       p0.lambda$onWebViewLoadError$7(p1);
    }
    public static void n(YodaBaseWebView p0,String p1){
       p0.lambda$createLifecycleObserver$1(p1);
    }
    public static void o(YodaBaseWebView p0,Bitmap p1,int p2){
       p0.lambda$isPureColor$5(p1, p2);
    }
    public void attach(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "20")) {
          return;
       }
       if (p0 == null) {
          r.e("YodaBaseWebView", new IllegalArgumentException("controller cannot be NULL!"));
          return;
       }else {
          this.initWebClient(p0);
          this.setManagerProvider(p0.getManagerProvider());
          this.setLaunchModel(p0.getLaunchModel());
          this.setContainerSession(p0.getContainerSession());
          this.checkHybridPackage(p0.getLaunchModel());
          this.handleLaunchModel();
          this.handleController(p0);
          this.mLifeCycleDisposable = t.create(p0.getLifeCycler()).subscribe(this.createLifecycleObserver(), h.b);
          return;
       }
    }
    public void checkHybridPackage(LaunchModel p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "21")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "2") && p0 != null) {
          i offlinePacka = Yoda.get().getOfflinePackageHandler();
          if (offlinePacka != null) {
             List hyIds = p0.getHyIds();
             if (hyIds != null && (!hyIds.isEmpty() && !PatchProxy.applyVoidOneRefs(hyIds, offlinePacka, i.class, "22"))) {
                a.q(hyIds, "hyIds");
                r.g("Start to refresh package file because network lazy load trigger");
                Iterator iterator = hyIds.iterator();
                while (iterator.hasNext()) {
                   d uod = offlinePacka.c.get(iterator.next());
                   if (uod != null) {
                      a.h(uod, "cachedRequestInfo[it] ?: return@forEach");
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      d uod1 = d.class;
                      Object obj = PatchProxy.apply(null, uod, uod1, "6");
                      boolean b = true;
                      if (obj != patchProxyRe) {
                         b = obj.booleanValue();
                      }else if(uod.isThrottled != null){
                         Object obj1 = PatchProxy.apply(null, uod, uod1, "3");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         }else if(uod.loadType == 3 && (a.g(uod.status, "PENDING") || a.g(uod.status, "NONE"))){
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                         if (b1 && (!Azeroth2.B.m().y() || uod.isImportant != null)) {
                         label_00c4 :
                            if (b) {
                               uod.status = "DOWNLOADING";
                               offlinePacka.c.put(uod.hyId, uod);
                               offlinePacka.j(uod);
                            }
                         }
                      }
                   label_00c3 :
                      b = false;
                      goto label_00c4 ;
                   }
                }
             }
          }
       }
       return;
    }
    public void cleanMatchRecord(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "38")) {
          return;
       }
       YodaBaseWebView tmYodaWebVie = this.mYodaWebViewClient;
       if (tmYodaWebVie == null) {
          return;
       }
       Objects.requireNonNull(tmYodaWebVie);
       if (!PatchProxy.applyVoid(objArray, tmYodaWebVie, g.class, "27")) {
          b uob = YodaXCache.n.k(tmYodaWebVie.a);
          if (uob != null) {
             uob.c();
          }
          g c = tmYodaWebVie.c;
          if (c != null && !PatchProxy.applyVoid(objArray, c, YodaWebRequestProcessor.class, "11")) {
             c.a().c();
          }
       }
    label_0042 :
       return;
    }
    public void clearProgressChangedCount(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "5")) {
          return;
       }
       this.mProgressChangedCount.set(0);
       return;
    }
    public void clearWebViewState(){
       this.mTouchViewContentUrlState = false;
       this.mRenderProcessKilled = false;
    }
    public final void clearWebViewStateInternal(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "93")) {
          return;
       }
       if (!o.c(p0) && p0.startsWith("javascript:")) {
          return;
       }
       this.clearWebViewState();
       return;
    }
    public void compositeWith(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "39")) {
          return;
       }
       this.mLifeCycleCompositeDisposable.c(p0);
       return;
    }
    public void configLoadingProgressbar(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "63")) {
          return;
       }
       ProgressBar progressBar = this.getProgressBar();
       if (progressBar == null) {
          return;
       }
       progressBar.setProgressDrawable(this.getProgressBarDrawable());
       if (this.enableProgressBar()) {
          progressBar.setVisibility(0);
       }else {
          progressBar.setVisibility(4);
       }
       return;
    }
    public LaunchModel$a createDefaultModelBuilder(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaBaseWebView.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LaunchModel$a(p0);
    }
    public g createLifecycleObserver(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x(this);
    }
    public YodaWebChromeClient createWebChromeClient(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new YodaWebChromeClient(this);
    }
    public g createWebViewClient(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(this);
    }
    public void destroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "76")) {
          return;
       }
       this.getSessionLogger().w("destroy");
       if (!this.isPageLoadFinished()) {
          this.getSessionLogger().w("user_cancel");
       }
       boolean b = true;
       this.reportWebLoadEventIfRequire(b);
       this.destroyInternal();
       g yodaWebViewC = this.getYodaWebViewClient();
       if (yodaWebViewC != null) {
          yodaWebViewC.f();
       }
       YodaWebChromeClient yodaWebChrom = this.getYodaWebChromeClient();
       if (yodaWebChrom != null && !PatchProxy.applyVoid(objArray, yodaWebChrom, YodaWebChromeClient.class, "10")) {
          yodaWebChrom.onHideCustomView();
       }
       this.setWebViewClient(objArray);
       this.setWebChromeClient(objArray);
       this.setDownloadListener(objArray);
       this.destroyDrawingCache();
       this.setOriginContext(objArray);
       if (Yoda.get().isDebugToolEnable()) {
          YodaBaseWebView tmDebugTools = this.mDebugTools;
          if (tmDebugTools != null) {
             tmDebugTools.a();
          }
       }
       this.disposeBlankCheck();
       this.preCachePool();
       this.mDestroyed = b;
       super.destroy();
       WebViewMemOptHelper g = WebViewMemOptHelper.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoidOneRefs(this, g, WebViewMemOptHelper.class, "11")) {
          a.q(this, "webview");
          g.b().remove(Integer.valueOf(this.hashCode()));
          b uob = g.e().remove(Integer.valueOf(this.hashCode()));
          if (uob != null) {
             r.h("WebViewMemOptHelper", "dispose pending hide when destroy:"+this.hashCode());
             uob.dispose();
          }
       }
       c.c.e(new r(this.hashCode()));
       return;
    }
    public synchronized void disposeBlankCheck(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "115")) {
          return;
       }
       YodaBaseWebView tmBlankCheck = this.mBlankCheckDisposable;
       if (tmBlankCheck == null || tmBlankCheck.isDisposed()) {
          return;
       }
       this.mBlankCheckDisposable.dispose();
       this.mBlankCheckDisposable = null;
       return;
    }
    public boolean enableProgressBar(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getLaunchModel() != null && this.getLaunchModel().isEnableProgress())? true: false;
       return b;
    }
    public void ensureLaunch(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "80")) {
          return;
       }
       if (this.getLaunchModel() == null) {
          this.setLaunchModel(this.createDefaultModelBuilder(p0).a());
       }
       this.getSessionPageInfoModule().bizId = this.getRunTimeState().getBizId();
       this.getSessionPageInfoModule().cookieSecured = Boolean.valueOf(YodaCookie.f.m(p0));
       return;
    }
    public final void enterNewSession(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaBaseWebView.class, "55")) {
          return;
       }
       this.getContainerSession().a(p0);
       this.getSessionLogger().w("unload");
       this.setContainerSession(new a());
       this.getSessionPageInfoModule().f(p0);
       this.getSessionPageInfoModule().actionMsg = p0+"_"+p1+"_"+this.getSessionPageInfoModule().d();
       p0.firstLoad = false;
       if (o.c(p2)) {
          p2 = this.getUrl();
       }
       this.getSessionLogger().v(p2, this.getReferUrl());
       this.getSessionLogger().w("created");
       this.setAllowUploadLoadingInfo(this.getSessionLogger().e());
       this.getSessionLogger().w("start_load");
       this.startCheckBlank(p2);
       this.setKsWebViewClient();
       return;
    }
    public void evaluateJavascript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "66")) {
          return;
       }
       this.evaluateJavascript(p0, null);
       return;
    }
    public void evaluateJavascript(String p0,ValueCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "67")) {
          return;
       }
       try{
          YodaBaseWebView tmJsIntercep = this.mJsInterceptor;
          if (tmJsIntercep != null && tmJsIntercep.a(p0)) {
             return;
          }
       }catch(java.lang.Exception e0){
          r.e(this.getClass().getSimpleName(), e0);
       }
       v.e(new YodaBaseWebView$b(this, p0, p1));
       return;
    }
    public Boolean[] getBlankCheckResult(){
       return this.blankCheckList;
    }
    public KsWebView$BlinkReceivedResourceResponceInfo[] getBlinkReceivedResourceResponseInfos(){
       KsWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getYodaKsWebView();
       if (obj != null) {
          return obj.getBlinkReceivedResourceResponseInfos();
       }
       return null;
    }
    public d0 getClientLogCallback(){
       return this.mClientLogCallback;
    }
    public KsWebView$CompletedInjectedResourceInfo[] getCompletedInjectedResourceInfos(){
       Object[] objArray = null;
       KsWebView$CompletedInjectedResourceInfo[] obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getYodaKsWebView() == null) {
          return objArray;
       }
       obj = KsWebView.getCompletedInjectedResourceInfos();
       r.h("YodaBaseWebView", "--- getCompletedInjectedResourceInfos, infos:"+e.f(obj));
       return obj;
    }
    public a getContainerSession(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mContainerSession == null) {
          this.setContainerSession(new a());
       }
       return this.mContainerSession;
    }
    public JsonObject getCurrentPageData(){
       return this.currentPageData;
    }
    public String getCurrentUrl(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!o.c(this.mCurrentUrl)) {
          return this.mCurrentUrl;
       }
       return this.getLoadUrl();
    }
    public c getDebugKit(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDebugTools;
       if (obj == null) {
          return null;
       }
       return obj.b();
    }
    public String getExtraUA(){
       return "";
    }
    public long getFmp(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return this.getSessionLogger().m().b("first_meaningful_paint");
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public List getHitOfflineInfo(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOfflineMatchRecord();
    }
    public String[] getInjectedCodeCacheWasConsumedScriptUrls(){
       Object[] objArray = null;
       KsWebView obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getYodaKsWebView();
       if (obj == null) {
          return objArray;
       }
       String[] injectedCode = obj.getInjectedCodeCacheWasConsumedScriptUrls();
       r.h("YodaBaseWebView", "--- getInjectedCodeCacheWasConsumedScriptUrls, urls:"+Arrays.toString(injectedCode));
       return injectedCode;
    }
    public NewYodaJavascriptBridge getJavascriptBridge(){
       return this.mJavascriptBridge;
    }
    public WebView getKuaishouWebView(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mKuaishouWebView == null) {
          this.mKuaishouWebView = this;
       }
       return this.mKuaishouWebView;
    }
    public LaunchModel getLaunchModel(){
       return this.mLaunchModel;
    }
    public String getLaunchParams(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mLaunchModel != null) {
          return e.f(this.getLaunchModel());
       }
       return super.getLaunchParams();
    }
    public c getLoadEventLogger(){
       return this.mLoadEventLogger;
    }
    public String getLoadUrl(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLaunchModel;
       if (obj == null) {
          return "";
       }
       return obj.getUrl();
    }
    public i getManagerProvider(){
       return this.mManagerProvider;
    }
    public List getMatchedOfflineInfo(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getLaunchModel().getHyIds();
       i offlinePacka = Yoda.get().getOfflinePackageHandler();
       if (offlinePacka != null && !obj.isEmpty()) {
          objArray = new ArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             a uoa = offlinePacka.g(iterator.next());
             if (uoa != null) {
                objArray.add(uoa);
             }
          }
       }
       return objArray;
    }
    public e getMediaRecorder(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMediaRecorder == null) {
          this.mMediaRecorder = new e();
       }
       return this.mMediaRecorder;
    }
    public List getOfflineMatchRecord(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "35");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mYodaWebViewClient;
       if (obj == null) {
          return new ArrayList();
       }
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(objArray, obj, g.class, "24");
       if (list != patchProxyRe) {
       }else {
          b uob = YodaXCache.n.k(obj.a);
          if (uob != null) {
             list = uob.g();
          }else {
             g c = obj.c;
             if (c != null) {
                Object obj1 = PatchProxy.apply(objArray, c, YodaWebRequestProcessor.class, "8");
                list = (obj1 != patchProxyRe)? obj1: c.a().g();
             }else {
                list = Collections.emptyList();
             }
          }
       }
       return list;
    }
    public List getOfflineNotMatchRecord(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "36");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mYodaWebViewClient;
       if (obj == null) {
          return new ArrayList();
       }
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(objArray, obj, g.class, "25");
       if (list != patchProxyRe) {
       }else {
          b uob = YodaXCache.n.k(obj.a);
          if (uob != null) {
             list = uob.h();
          }else {
             g c = obj.c;
             if (c != null) {
                Object obj1 = PatchProxy.apply(objArray, c, YodaWebRequestProcessor.class, "9");
                list = (obj1 != patchProxyRe)? obj1: c.a().h();
             }else {
                list = Collections.emptyList();
             }
          }
       }
       return list;
    }
    public List getOfflineRequestRecord(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mYodaWebViewClient;
       if (obj == null) {
          return new ArrayList();
       }
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(objArray, obj, g.class, "26");
       if (list != patchProxyRe) {
       }else {
          b uob = YodaXCache.n.k(obj.a);
          if (uob != null) {
             list = uob.j();
          }else {
             g c = obj.c;
             if (c != null) {
                Object obj1 = PatchProxy.apply(objArray, c, YodaWebRequestProcessor.class, "10");
                list = (obj1 != patchProxyRe)? obj1: c.a().j();
             }else {
                list = Collections.emptyList();
             }
          }
       }
       return list;
    }
    public Context getOriginContext(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOriginContext;
       if (obj != null) {
          return obj;
       }
       Context context = this.getContext();
       while (context instanceof MutableContextWrapper) {
          context = context.getBaseContext();
       }
       return context;
    }
    public int getPendingVideoFullScreenOrientation(){
       return this.mPendingVideoFullScreenOrientation;
    }
    public ProgressBar getProgressBar(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.enableProgressBar() && this.mLoadingProgressBar == null) {
          this.initLoadingProgressbar();
       }
       return this.mLoadingProgressBar;
    }
    public final Drawable getProgressBarDrawable(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getLaunchModel() != null && c.b(this.getLaunchModel().getProgressBarColor())) {
          return new ClipDrawable(new ColorDrawable(Color.parseColor(this.getLaunchModel().getProgressBarColor())), 3, 1);
       }
       return this.getResources().getDrawable(0x7f081dc3);
    }
    public final String getReferUrl(){
       Object[] objArray = null;
       WebBackForwardList obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.copyBackForwardList();
          if (obj.getCurrentIndex() > 0) {
             objArray = obj.getItemAtIndex((obj.getCurrentIndex() - 1)).getUrl();
          }
       }catch(java.lang.Exception e0){
          r.j("YodaBaseWebView", Log.getStackTraceString(e0));
       }
       return objArray;
    }
    public List getRequestOfflineInfo(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getLaunchModel().getHyIds();
       i offlinePacka = Yoda.get().getOfflinePackageHandler();
       if (offlinePacka != null && !obj.isEmpty()) {
          objArray = new ArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             d uod = offlinePacka.h(iterator.next());
             if (uod != null) {
                objArray.add(uod);
             }
          }
       }
       return objArray;
    }
    public KsWebView$ResourceInfoLoadedFromMemoryCache[] getResourceInfosLoadedFromMemoryCache(boolean p0){
       KsWebView obj;
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "111");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getYodaKsWebView();
       if (obj != null) {
          KsWebView$ResourceInfoLoadedFromMemoryCache[] resourceInfo = obj.getResourceInfosLoadedFromMemoryCache(p0);
          r.h("YodaBaseWebView", "--- getResourceInfosLoadedFromMemoryCache, urls:"+Arrays.toString(resourceInfo));
          return resourceInfo;
       }else {
          return null;
       }
    }
    public String[] getResourceUrlsLoadedFromMemoryCache(boolean p0){
       KsWebView obj;
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "108");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getYodaKsWebView();
       if (obj != null) {
          String[] resourceUrls = obj.getResourceUrlsLoadedFromMemoryCache(p0);
          r.h("YodaBaseWebView", "--- getResourceUrlsLoadedFromMemoryCache, urls:"+Arrays.toString(resourceUrls));
          return resourceUrls;
       }else {
          return null;
       }
    }
    public RunTimeState getRunTimeState(){
       return this.mRunTimeState;
    }
    public KsWebView$RunnedJsInfo[] getRunedJsInfos(){
       Object[] objArray = null;
       KsWebView obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getYodaKsWebView();
       if (obj == null) {
          return objArray;
       }
       KsWebView$RunnedJsInfo[] runedJsInfos = obj.getRunedJsInfos();
       r.h("YodaBaseWebView", "--- getRunedJsInfos, urls:"+Arrays.toString(runedJsInfos));
       return runedJsInfos;
    }
    public e getSessionLogger(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContainerSession().c();
    }
    public l getSessionPageInfoModule(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSessionLogger().k();
    }
    public e getTopTaskHelper(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mTopTaskHelper == null) {
          this.mTopTaskHelper = new e(s.b(this));
       }
       return this.mTopTaskHelper;
    }
    public StringBuilder getUserAgent(WebSettings p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, YodaBaseWebView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getUserAgentString();
       this.getUserAgentJar().a(this.getContext(), obj);
       String extraUA = this.getExtraUA();
       if (!TextUtils.isEmpty(extraUA)) {
          obj = obj+extraUA;
       }
       return obj;
    }
    public e getUserAgentJar(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUserAgentJar == null) {
          this.mUserAgentJar = new e();
       }
       return this.mUserAgentJar;
    }
    public WebChromeClient getWebChromeClient(){
       WebChromeClient webChromeCli;
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mYodaWebChromeClient;
       if (obj == null) {
          webChromeCli = super.getWebChromeClient();
       }
       return webChromeCli;
    }
    public WebViewClient getWebViewClient(){
       WebViewClient webViewClien;
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mYodaWebViewClient;
       if (obj == null) {
          webViewClien = super.getWebViewClient();
       }
       return webViewClien;
    }
    public KsWebView getYodaKsWebView(){
       WebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mYodaKsWebView == null) {
          obj = this.getKuaishouWebView();
          if (obj != null) {
             this.mYodaKsWebView = obj.getKsWebView();
          }
       }
       return this.mYodaKsWebView;
    }
    public YodaWebChromeClient getYodaWebChromeClient(){
       return this.mYodaWebChromeClient;
    }
    public YodaWebCookie getYodaWebCookie(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mWebCookie == null) {
          this.mWebCookie = new YodaWebCookie();
       }
       return this.mWebCookie;
    }
    public g getYodaWebViewClient(){
       return this.mYodaWebViewClient;
    }
    public void goBack(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "82")) {
          return;
       }
       this.onBackOrForward("back");
       super.goBack();
       return;
    }
    public void goBackOrForward(int p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, YodaBaseWebView.class, "84")) {
          return;
       }
       this.onBackOrForward(String.valueOf(p0));
       super.goBackOrForward(p0);
       return;
    }
    public void goForward(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "83")) {
          return;
       }
       this.onBackOrForward("forward");
       super.goForward();
       return;
    }
    public void handleController(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "23")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.getSettings() != null) {
          this.getSettings().setUserAgentString(this.getSettings().getUserAgentString()+" StatusHT/"+p0.getStatusBarHeight()+" "+"TitleHT"+"/"+p0.getTitleBarHeight());
       }
       return;
    }
    public void handleLaunchModel(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "22")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, uoa, "1")) {
          LaunchModel launchModel = this.getLaunchModel();
          if (launchModel != null) {
             b.d(this, launchModel.getSlideBackBehavior());
             ButtonParams uButtonParam1 = new ButtonParams();
             uButtonParam1.mTitle = launchModel.getTitle();
             if (!u.c(launchModel.getTitleColor())) {
                uButtonParam1.mTextColor = launchModel.getTitleColor();
             }
             c.c(this, uButtonParam1);
             PageStyleParams pageStylePar = new PageStyleParams();
             pageStylePar.mPosition = launchModel.getTopBarPosition();
             if (!u.c(launchModel.getTopBarBgColor())) {
                pageStylePar.mBackgroundColor = launchModel.getTopBarBgColor();
             }
             if (!u.c(launchModel.getTopBarBorderColor())) {
                pageStylePar.mBorderBottomColor = launchModel.getTopBarBorderColor();
             }
             if (!u.c(launchModel.getStatusBarColorType())) {
                pageStylePar.mStatusBarColorType = launchModel.getStatusBarColorType();
             }
             c.d(this, pageStylePar);
             if (c.b(launchModel.getWebViewBgColor())) {
                this.setBackgroundColor(Color.parseColor(launchModel.getWebViewBgColor()));
             }else if(!u.c(launchModel.getWebViewBgColor())){
                this.setBackgroundColor(0);
             }
             PullDownTypeParams pullDownType = new PullDownTypeParams();
             pullDownType.mBehavior = launchModel.getBounceStyle();
             b.c(this, pullDownType);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, uoa, "3")) {
          ButtonParams uButtonParam = new ButtonParams();
          uButtonParam.mButtonId = ButtonParams$PositionId.LEFT1;
          uButtonParam.mImage = ButtonParams$Icon.BACK.mValue;
          uButtonParam.mRole = "left1_close";
          uButtonParam.mPageAction = "backOrClose";
          uButtonParam.mViewType = "imageView";
          c.a(this, uButtonParam);
       }
       return;
    }
    public int increaseProgressChangedCount(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mProgressChangedCount.incrementAndGet();
    }
    public final void initBaseWebView(Context p0){
       YodaBaseWebView tmDebugTools;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "6")) {
          return;
       }
       this.updateLocal(p0);
       this.logInitTime();
       this.initJavascriptBridge();
       this.initViewSettings();
       this.initWebSettings();
       YodaCookie.f.p(this);
       this.initJavascriptInterface();
       if (Yoda.get().isDebugToolEnable()) {
          WebView.setWebContentsDebuggingEnabled(true);
       }
       if (Yoda.get().isDebugToolEnable()) {
          tmDebugTools = this.mDebugTools;
          if (tmDebugTools != null) {
             tmDebugTools.c();
          }
       }
       if (Azeroth2.B.m().y()) {
          this.clearCache(true);
          tmDebugTools.isLowDiskMode = true;
       }
       return;
    }
    public void initJavascriptBridge(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "14")) {
          return;
       }
       this.mJavascriptBridge = new NewYodaJavascriptBridge(this);
       return;
    }
    public final void initJavascriptInterface(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "10")) {
          return;
       }
       this.getSessionLogger().w("start_inject_bridge");
       this.addJavascriptInterface(this.mJavascriptBridge, "__yodaBridge__");
       this.getSessionLogger().w("bridge_ready");
       this.getSessionLogger().w("bridge_injected");
       return;
    }
    public final boolean initKsWebPaintEventListener(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.mKsWebPaintEventListener == null) {
          this.mKsWebPaintEventListener = new YodaBaseWebView$a(this);
       }
       if (this.getKsWebView() == null) {
          return b;
       }else {
          return this.getKsWebView().setWebPaintEventListener(this.mKsWebPaintEventListener);
       }
    }
    public void initLoadingProgressbar(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "60")) {
          return;
       }
       ProgressBar progressBar = new ProgressBar(this.getContext(), objArray, 0x1010078);
       this.mLoadingProgressBar = progressBar;
       progressBar.setMax(100);
       this.addView(this.mLoadingProgressBar, new ViewGroup$LayoutParams(-1, n.c(this.getContext(), 3.00f)));
       return;
    }
    public void initViewSettings(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "8")) {
          return;
       }
       this.setFocusable(true);
       this.setFocusableInTouchMode(true);
       this.setOnTouchListener(d.b);
       return;
    }
    public void initWebClient(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "25")) {
          return;
       }
       WebViewClient webViewClien = p0.getWebViewClient();
       if (webViewClien == null) {
          webViewClien = this.createWebViewClient();
       }
       this.setWebViewClient(webViewClien);
       WebChromeClient webChromeCli = p0.getWebChromeClient();
       if (webChromeCli == null) {
          webChromeCli = this.createWebChromeClient();
       }
       this.setWebChromeClient(webChromeCli);
       return;
    }
    public final void initWebSettings(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "7")) {
          return;
       }
       this.setWebSettings(this.getSettings());
       return;
    }
    public void injectCommonParams(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "18")) {
          return;
       }
       this.injectCommonParams("pageLoadData", e.f(GetPageLoadDataFunction$PerfDataResultParams$TimeData.fromSessionStampMap(this.getSessionLogger().m().a())));
       this.injectCommonParams("sampleData", e.f(this.getSessionLogger().g()));
       return;
    }
    public void injectCommonParams(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "16")) {
          return;
       }
       a uoa = Azeroth2.B.q();
       if (uoa != null && !uoa.H5(null, "yoda_js_inject_common_data", true)) {
          return;
       }
       this.injectCommonParamsJs();
       Object[] objArray = new Object[]{p0,p1};
       this.evaluateJavascript(k.a("typeof window.__yodaInjectWebviewCommonData__ === \'function\' && window.__yodaInjectWebviewCommonData__\(\'%s\', %s\)", objArray));
       return;
    }
    public void injectCommonParamsJs(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "15")) {
          return;
       }
       this.evaluateJavascript("if \(!window.__yodaCommonDataObject__ ||\n    typeof window.__yodaCommonDataObject__ !== \"object\" ||\n    typeof window.__yodaInjectWebviewCommonData__ !== \"function\"\) {\n    window.__yodaCommonDataObject__ = {};\n    window.__yodaInjectWebviewCommonData__ = function\(dataKey, dataValue\) {\n        var isvalid = typeof dataKey === \"string\" && dataKey.length != 0;\n        if \(isvalid\) {\n            window.__yodaCommonDataObject__[dataKey] = dataValue;\n        }\n    };\n}");
       return;
    }
    public void injectCookie(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "100")) {
          return;
       }
       this.getSessionLogger().i().a = this.getYodaWebCookie().b();
       return;
    }
    public boolean isAppEvent(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "117");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.getTopTaskHelper();
       Objects.requireNonNull(obj);
       e uoe = e.class;
       boolean b = false;
       if (PatchProxy.isSupport(uoe)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.FALSE, obj, uoe, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0035 :
             e a = obj.a;
             boolean b1 = true;
             if (a == null) {
                b = a.a(Azeroth2.B.d()) ^ 0x01;
             }else {
                try{
                   Object[] objArray = new Object[b];
                   Boolean uBoolean = g.a(a, "isTopOfTask", objArray);
                   if (uBoolean != null && uBoolean.booleanValue()) {
                      obj.b = b1;
                      b = true;
                   }else if(obj.a() && obj.b != null){
                      b1 = false;
                   }
                   obj.b = b1;
                   b = b1;
                }catch(java.lang.Exception e0){
                }
             }
          }
       }else {
          goto label_0035 ;
       }
       return b;
    }
    public boolean isColdStart(){
       return this.mIsColdStart;
    }
    public boolean isForeground(){
       Object obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsLastAppLifecycle != null)? this.isShowing(): Azeroth2.B.t();
       return b;
    }
    public boolean isPageLoadFinished(){
       return this.mPageLoadFinished;
    }
    public final void isPureColor(WebView p0,int p1){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, YodaBaseWebView.class, "104")) {
          return;
       }
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else {
          Picture picture = p0.capturePicture();
          int height = picture.getHeight();
          if (picture.getWidth() > 0 && height > 0) {
             obj = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), Bitmap$Config.ARGB_8888);
             picture.draw(new Canvas(obj));
          }
       }
       a.a(new z(this, obj, p1));
       return;
    }
    public boolean isRenderProcessKilled(){
       return this.mRenderProcessKilled;
    }
    public boolean isShowing(){
       return this.mShowing;
    }
    public boolean isUseKsWebView(){
       WebView obj = PatchProxy.apply(null, this, YodaBaseWebView.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getKuaishouWebView();
       if (obj == null) {
          return false;
       }
       boolean b = obj.isKsWebView();
       r.h("YodaBaseWebView", "isUseKsWebView, isKs:"+b);
       return b;
    }
    public boolean isWebViewEmbedded(){
       return this.mEmbedded;
    }
    public void loadData(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaBaseWebView.class, "88")) {
          return;
       }
       super.loadData(p0, p1, p2);
       this.clearWebViewStateInternal(this.getUrl());
       return;
    }
    public void loadDataWithBaseURL(String p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "86")) {
             return;
          }
       }
       this.ensureLaunch(p0);
       this.loadUrlWithResetPage(p0);
       if (!this.loadDataWithBaseURLNotThroughNet(p0, p1, p2, p3, p4)) {
          r.h("YodaBaseWebView", "loadDataWithBaseURL");
          super.loadDataWithBaseURL(p0, p1, p2, p3, p4);
       }
       this.clearWebViewStateInternal(this.getUrl());
       return;
    }
    public final boolean loadDataWithBaseURLNotThroughNet(String p0,String p1,String p2,String p3,String p4){
       a obj;
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, YodaBaseWebView.class, "87");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          obj = Azeroth2.B.q();
          if (obj == null || (obj.H5(null, "yoda_switch_load_data_not_through_net", 0) && this.getKsWebView().isLoadDataNotThroughNetSupported())) {
             this.getKsWebView().loadDataWithBaseURLNotThroughNet(p0, p1, p2, p3, p4);
             r.h("YodaBaseWebView", "loadDataWithBaseURLNotThroughNet");
             return 1;
          }
       }catch(java.lang.Exception e11){
          r.h("YodaBaseWebView", "loadDataWithBaseURLNotThroughNet, e:"+e11.getMessage());
       }
    label_0076 :
       return 0;
    }
    public void loadUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "78")) {
          return;
       }
       if (this.mDestroyed != null) {
          r.j(this.getClass().getSimpleName(), "webview destroyed, drop: "+p0);
          return;
       }else {
          this.ensureLaunch(p0);
          this.loadUrlWithResetPage(p0);
          this.clearWebViewStateInternal(this.getUrl());
          super.loadUrl(p0);
          return;
       }
    }
    public void loadUrl(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "79")) {
          return;
       }
       if (this.mDestroyed != null) {
          r.j(this.getClass().getSimpleName(), "webview destroyed, drop: "+p0);
          return;
       }else {
          this.ensureLaunch(p0);
          this.loadUrlWithResetPage(p0);
          this.clearWebViewStateInternal(this.getUrl());
          super.loadUrl(p0, p1);
          return;
       }
    }
    public final void loadUrlWithResetPage(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "90")) {
          return;
       }
       if (URLUtil.isNetworkUrl(p0)) {
          this.setCurrentUrl(p0, "load");
          this.onUrlLoading(p0, "load");
          if (this.isPageLoadFinished()) {
             this.reportWebLoadEventIfRequire();
          }else {
             e sessionLogge = this.getSessionLogger();
             Objects.requireNonNull(sessionLogge);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object obj = PatchProxy.apply(null, sessionLogge, e.class, "10");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                sessionLogge = sessionLogge.g;
                Objects.requireNonNull(sessionLogge);
                obj = PatchProxy.applyOneRefs("start_load", sessionLogge, q.class, "4");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   a.q("start_load", "loadEvent");
                   b = sessionLogge.c.keySet().contains("start_load_time");
                }
             }
             if (b) {
                this.enterNewSession("load_again", null, p0);
             }else if(!this.getSessionLogger().o()){
                this.getSessionLogger().w("created");
             }
             this.setAllowUploadLoadingInfo(this.getSessionLogger().e());
             this.getSessionLogger().w("start_load");
             this.startCheckBlank(p0);
             this.setKsWebViewClient();
          }
       }
       return;
    }
    public void logInitTime(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "13")) {
          return;
       }
       this.getSessionPageInfoModule().coldStart = this.isColdStart();
       this.getSessionPageInfoModule().sdkInitInfo = Yoda.get().getInitSDKInfo();
       this.getSessionPageInfoModule().f("native");
       this.getSessionLogger().w("created");
       return;
    }
    public void notifySampleChange(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "17")) {
          return;
       }
       Object[] objArray = new Object[]{p0};
       p0 = k.a("window.updateYodaSampleRateWithParams\(\'%s\'\)", objArray);
       r.h("YodaBaseWebView", "---- notifySampleChange, updateYodaSampleRateWithParams, formatStr:"+p0);
       this.evaluateJavascript(p0);
       return;
    }
    public final void notifyScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, YodaBaseWebView.class, "97")) {
          return;
       }
       YodaBaseWebView tmScrollChan = this.mScrollChangeCallbacks;
       _monitor_enter(tmScrollChan);
       Iterator iterator = this.mScrollChangeCallbacks.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2, p3);
       }
       _monitor_exit(tmScrollChan);
       return;
    }
    public void onBackOrForward(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "85")) {
          return;
       }
       this.reportWebLoadEventIfRequire();
       this.enterNewSession("back", p0, null);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "120")) {
          return;
       }
       YodaBaseWebView tmLifeCycleD = this.mLifeCycleDisposable;
       if (tmLifeCycleD != null && !tmLifeCycleD.isDisposed()) {
          this.mLifeCycleDisposable.dispose();
       }
       this.mLifeCycleCompositeDisposable.dispose();
       this.mLifeCycleDisposable = null;
       this.destroy();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       String obj;
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, YodaBaseWebView.class, "95");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 4) {
          return super.onKeyDown(p0, p1);
       }else {
          obj = this.getLaunchModel().getPhysicalBackBehavior();
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("behavior", obj);
             d.f().c(this, "physical-back-button", jSONObject.toString());
          }catch(org.json.JSONException e1){
             r.e(this.getClass().getSimpleName(), e1);
          }
          if (("backOrClose").equals(obj)) {
             if (this.canGoBack()) {
                this.goBack();
                return true;
             }else {
                return super.onKeyDown(p0, p1);
             }
          }else if(("close").equals(obj)){
             return super.onKeyDown(p0, p1);
          }else if(("none").equals(obj)){
             return true;
          }else {
             return super.onKeyDown(p0, p1);
          }
       }
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "71")) {
          return;
       }
       boolean b = this.isShowing();
       super.onPause();
       c loadEventLog = this.getLoadEventLogger();
       Objects.requireNonNull(loadEventLog);
       boolean b1 = false;
       if (!PatchProxy.applyVoid(objArray, loadEventLog, c.class, "12")) {
          loadEventLog = loadEventLog.f;
          Objects.requireNonNull(loadEventLog);
          if (!PatchProxy.applyVoid(objArray, loadEventLog, c$b.class, "2")) {
             if (loadEventLog.a > 0) {
                loadEventLog.b = loadEventLog.b + (SystemClock.elapsedRealtime() - loadEventLog.a);
             }
             loadEventLog.c = b1;
          }
       }
       this.mShowing = b1;
       this.getSessionPageInfoModule().o(Boolean.FALSE);
       WebViewMemOptHelper g = WebViewMemOptHelper.g;
       Objects.requireNonNull(g);
       WebViewMemOptHelper webViewMemOp = WebViewMemOptHelper.class;
       if (!PatchProxy.applyVoidOneRefs(this, g, webViewMemOp, "6")) {
          a.q(this, "webview");
          if (g.g("yoda_webview_trim_domain", this.getUrl()) && !PatchProxy.applyVoidOneRefs(this, g, webViewMemOp, "7")) {
             b uob = t.just(Boolean.TRUE).delay(g.d().webviewTrimDelay, TimeUnit.SECONDS).subscribeOn(AzerothSchedulers.b.a()).observeOn(a.c()).map(new g(this)).filter(h.b).subscribe(new i(new WeakReference(this)), j.b, k.b);
             a.h(uob, "Observable.just\(true\)\n  ¡­mory finish.\"\)\n        }\)");
             g.e().put(Integer.valueOf(this.hashCode()), uob);
          }
       }
       this.getMediaRecorder().f("native_audio_recorder_error", "userCancel", "WebView on pause");
       if (!b) {
          return;
       }else {
          b = this.isAppEvent();
          this.mIsLastAppLifecycle = b;
          this.onPauseEvent(b);
          if (Yoda.get().isDebugToolEnable()) {
             YodaBaseWebView tmDebugTools = this.mDebugTools;
             if (tmDebugTools != null) {
                tmDebugTools.d();
             }
          }
          return;
       }
    }
    public void onPauseEvent(boolean p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "118")) {
          return;
       }
       d uod = d.f();
       Object[] objArray = new Object[1];
       String str = (p0)? "appPause": "pagePause";
       objArray[0] = str;
       uod.c(this, "pause", k.a("{\'type\': \'%s\'}", objArray));
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "69")) {
          return;
       }
       boolean b = this.isShowing();
       super.onResume();
       c loadEventLog = this.getLoadEventLogger();
       Objects.requireNonNull(loadEventLog);
       boolean b1 = true;
       if (!PatchProxy.applyVoid(objArray, loadEventLog, c.class, "11")) {
          loadEventLog = loadEventLog.f;
          Objects.requireNonNull(loadEventLog);
          if (!PatchProxy.applyVoid(objArray, loadEventLog, c$b.class, "1")) {
             loadEventLog.a = SystemClock.elapsedRealtime();
             loadEventLog.c = b1;
          }
       }
       this.mShowing = b1;
       this.getSessionPageInfoModule().o(Boolean.TRUE);
       WebViewMemOptHelper g = WebViewMemOptHelper.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoidOneRefs(this, g, WebViewMemOptHelper.class, "10")) {
          a.q(this, "webview");
          b uob = g.e().remove(Integer.valueOf(this.hashCode()));
          if (uob != null) {
             r.h("WebViewMemOptHelper", "dispose pending hide when resume:"+this.hashCode());
             uob.dispose();
          }
          if (g.b().remove(Integer.valueOf(this.hashCode())) != null) {
             r.h("WebViewMemOptHelper", "show webview onResume by mem_opt:"+this.hashCode());
             this.setVisibility(0);
          }
       }
       if (b) {
          return;
       }else {
          this.onResumeEvent(this.mIsLastAppLifecycle);
          if (Yoda.get().isDebugToolEnable()) {
             YodaBaseWebView tmDebugTools = this.mDebugTools;
             if (tmDebugTools != null) {
                tmDebugTools.e();
             }
          }
          return;
       }
    }
    public void onResumeEvent(boolean p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "70")) {
          return;
       }
       d uod = d.f();
       Object[] objArray = new Object[1];
       String str = (p0)? "appResume": "pageResume";
       objArray[0] = str;
       uod.c(this, "resume", String.format("{\'type\': \'%s\'}", objArray));
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, YodaBaseWebView.class, "96")) {
          return;
       }
       ProgressBar progressBar = this.getProgressBar();
       if (progressBar == null) {
          super.onScrollChanged(p0, p1, p2, p3);
          return;
       }else {
          AbsoluteLayout$LayoutParams layoutParams = progressBar.getLayoutParams();
          layoutParams.y = layoutParams.y - (p1 - p3);
          progressBar.setLayoutParams(layoutParams);
          super.onScrollChanged(p0, p1, p2, p3);
          this.notifyScrollChanged(p0, p1, p2, p3);
          return;
       }
    }
    public void onStart(){
    }
    public void onStop(){
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaBaseWebView.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          this.mTouchViewContentUrlState = true;
       }
       return super.onTouchEvent(p0);
    }
    public void onUrlLoading(String p0,String p1){
       boolean b;
       long l;
       a$a a;
       Object obj = this;
       String obj1 = p0;
       c obj2 = p1;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, YodaBaseWebView.class, "101")) {
          return;
       }
       if (URLUtil.isNetworkUrl(p0)) {
          this.sendUrlChangeEvent(p0);
          if (this.isPageLoadFinished()) {
             this.reportWebLoadEventIfRequire();
             this.getSessionPageInfoModule().openUrl = obj1;
             obj.enterNewSession("h5_navigation", obj2, obj1);
          }
          Object[] objArray = null;
          String str = "7";
          YodaWebCookie obj3 = PatchProxy.apply(objArray, objArray, a.class, str);
          if (obj3 != PatchProxyResult.class) {
             b = obj3.booleanValue();
          }else {
             a = a.a;
             Objects.requireNonNull(a);
             Object obj6 = PatchProxy.apply(objArray, a, a$a.class, str);
             if (obj6 != PatchProxyResult.class) {
                b = obj6.booleanValue();
             }else {
                a uoa = Azeroth2.B.q();
                b = (uoa != null)? a$a.b(uoa, null, "enable_bridge_on_url_loading", false, 1, null): false;
             }
          }
          if (b) {
             this.getJavascriptBridge().p(obj1);
          }
          obj3 = this.getYodaWebCookie();
          Objects.requireNonNull(obj3);
          if (!PatchProxy.applyVoidOneRefs(obj1, obj3, YodaWebCookie.class, "3")) {
             a.q(obj1, "url");
             obj3.c = obj1;
             obj3.b.clear();
             obj3.a().c(obj1);
          }
          this.setPageUrlInfo(p0, p1);
          this.getSessionLogger().w("start_cookie_inject");
          r.b("YodaBaseWebView", "injectCookieOnUrlLoading");
          this.injectCookie();
          this.getSessionLogger().w("cookie_injected");
          if (this.getLoadEventLogger().e()) {
             obj2 = this.getLoadEventLogger();
             Objects.requireNonNull(obj2);
             if (!PatchProxy.applyVoid(objArray, obj2, uoc, "4")) {
                obj2.a().subscribe(new f(obj2), a.b);
             }
             obj2 = this.getLoadEventLogger();
             Objects.requireNonNull(obj2);
             if (!PatchProxy.applyVoidOneRefs(obj, obj2, uoc, "5")) {
                c g = obj2.g;
                if (g == null || g.isDisposed()) {
                   WeakReference weakReferenc = new WeakReference(obj);
                   a obj5 = PatchProxy.apply(objArray, obj2, uoc, str);
                   if (obj5 != PatchProxyResult.class) {
                      l = obj5.longValue();
                   }else {
                      obj5 = Azeroth2.B.q();
                      long l1 = 1;
                      l = (obj5 != null)? obj5.K5(objArray, "yoda_profiling_record_period", l1): l1;
                   }
                   c d = obj2.d;
                   Objects.requireNonNull(d);
                   h oh = new h(d);
                   obj2.g = t.interval(l, l, TimeUnit.SECONDS).takeUntil(new j(obj2, weakReferenc, obj)).flatMap(new i(obj2)).subscribe(oh, a.b, new e(weakReferenc, obj));
                }
             }
          }
       label_0151 :
          this.getContainerSession().e = x.h.h(this.getLoadUrl());
          WebSettings settings = this.getSettings();
          e userAgentJar = this.getUserAgentJar();
          Context context = this.getContext();
          String str1 = this.getSettings().getUserAgentString();
          Objects.requireNonNull(userAgentJar);
          Object obj4 = PatchProxy.applyFourRefs(context, this, str1, p0, userAgentJar, e.class, "3");
          if (obj4 != PatchProxyResult.class) {
             str1 = obj4;
          }else {
             a.q(context, "context");
             a.q(str1, "stringBuilder");
             a.q(obj1, "url");
             if (userAgentJar.a == null) {
                userAgentJar.a = true;
                str1 = userAgentJar.b(context, obj, str1, obj1);
             }
          }
          obj1 = str1;
          try{
             settings.setUserAgentString(obj1);
             WebSettings settings1 = this.getSettings();
             if (settings1 != null) {
                this.getSessionLogger().d().j = e.f(new a(settings1.getUserAgentString()));
             }
          }catch(java.lang.Exception e0){
             r.j("YodaBaseWebView", Log.getStackTraceString(e0));
          }
       }
    }
    public void onWebViewLoadError(String p0,Integer p1,String p2,String p3,String p4,Boolean p5){
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "121")) {
             return;
          }
       }
       r.h("onWebViewLoadError", "resultType:"+p0+"£¬errorCode:"+p1+", description:"+p2+", failingUrl:"+p3+"£¬ userAction:"+p4+", showError:"+p5);
       p3.status = Integer.valueOf(0);
       p3.resultType = p0;
       p0.errorCode = p1;
       p0.errorUserAction = p4;
       if (p5 == null || (p5.booleanValue() || (p5 == null && (this.getLaunchModel() != null && this.getLaunchModel().isEnableErrorPage())))) {
          this.getSessionPageInfoModule().n(Boolean.TRUE);
          if (p1 == null) {
             v.e(new y(this));
          }else {
             v.e(new a0(this, p1));
          }
       }else {
          this.getSessionPageInfoModule().n(Boolean.FALSE);
       }
       p0.errorMsg = p2;
       this.getSessionLogger().w("load_error");
       return;
    }
    public void postUrl(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "81")) {
          return;
       }
       this.loadUrlWithResetPage(p0);
       this.clearWebViewStateInternal(this.getUrl());
       super.postUrl(p0, p1);
       return;
    }
    public void preCachePool(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaBaseWebView.class, "77")) {
          return;
       }
       a uoa = Azeroth2.B.q();
       boolean b = true;
       if (uoa != null && !uoa.H5(objArray, "yoda_pre_cache_pool", b)) {
          return;
       }
       if (this.mPreCached != null) {
          return;
       }
       this.mPreCached = b;
       this.getSessionLogger().w("pre_cache_pool");
       this.getSessionLogger().w("pre_cache_pool_end");
       this.getSessionPageInfoModule().poolCreateFailReason = l.d().e(d.a().d());
       return;
    }
    public final void prepareNewSessionInitInfo(a p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "54")) {
          return;
       }
       l ol = p0.c().k();
       if (p1 != null) {
          ReferSessionInfo referSession = new ReferSessionInfo();
          referSession.referSessionId = p1.b();
          referSession.referWebViewUrl = this.getUrl();
          referSession.referLoadUrl = p1.c().k().c();
          b$b d = p1.c().d().d;
          if (d != null) {
             referSession.referPageUrl = d.a;
          }
          referSession.referResultType = p1.c().k().d();
          referSession.referEndAction = p1.c().k().endAction;
          ol.referSessionInfo = referSession;
       }
       e uoe = p0.c();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoidOneRefs(this, uoe, e.class, "8")) {
          a.q(this, "webView");
          uoe.a = new WeakReference(this);
       }
       int b = this.isUseKsWebView();
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          str = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, uob, "2");
          if (str != PatchProxyResult.class) {
          label_00ab :
             ol.webViewType = str;
             ol.webViewId = this.mWebViewId;
             b = this.mWebViewSessionCount + 1;
             this.mWebViewSessionCount = b;
             if (b > 1) {
                ol.webViewLoadCount = Integer.valueOf(b);
             }
             return;
          }
       }
       Objects.requireNonNull(b.a);
       String str1 = (b)? "KSWebView": "WebView";
       str = str1;
       goto label_00ab ;
    }
    public void registerLoadIntercept(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "116")) {
          return;
       }
       this.mWebViewInterceptors.add(p0);
       return;
    }
    public void registerScrollChangeCallback(YodaBaseWebView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "98")) {
          return;
       }
       if (p0 != null) {
          YodaBaseWebView tmScrollChan = this.mScrollChangeCallbacks;
          _monitor_enter(tmScrollChan);
          this.mScrollChangeCallbacks.add(p0);
          _monitor_exit(tmScrollChan);
       }
       return;
    }
    public void reload(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "89")) {
          return;
       }
       Iterator iterator = this.mWebViewInterceptors.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       this.enterNewSession("reload", null, null);
       super.reload();
       this.clearWebViewStateInternal(this.getUrl());
       return;
    }
    public void reportWebLoadEventIfRequire(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "102")) {
          return;
       }
       this.reportWebLoadEventIfRequire(this.isPageLoadFinished());
       return;
    }
    public void reportWebLoadEventIfRequire(boolean p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "103")) {
          return;
       }
       c loadEventLog = this.getLoadEventLogger();
       Objects.requireNonNull(loadEventLog);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(null, loadEventLog, uoc, "2")) {
          c f = loadEventLog.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(null, f, c$b.class, "4")) {
             f.a = SystemClock.elapsedRealtime();
             f.b = 0;
          }
          if (!PatchProxy.applyVoid(null, loadEventLog, uoc, "3")) {
             loadEventLog.e = null;
             uoc = loadEventLog.g;
             if (uoc != null && !uoc.isDisposed()) {
                loadEventLog.g.dispose();
             }
             loadEventLog.d.clear();
          }
       }
       this.cleanMatchRecord();
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "74")) {
          return;
       }
       this.destroyInternal();
       this.setVisibility(0);
       this.cancelPendingInputEvents();
       this.loadUrl("about:blank");
       this.setPageLoadFinished(0);
       return;
    }
    public boolean setAllowUploadLoadingInfo(boolean p0){
       KsWebView obj;
       if (PatchProxy.isSupport(YodaBaseWebView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, YodaBaseWebView.class, "113");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getYodaKsWebView();
       if (obj != null) {
          p0 = obj.getWebSettings().setAllowUploadLoadingInfo(p0);
          r.h("YodaBaseWebView", "--- setAllowUploadLoadingInfo, allowKsLog:"+p0);
          return p0;
       }else {
          return false;
       }
    }
    public void setClientLogCallback(d0 p0){
       this.mClientLogCallback = p0;
    }
    public void setConfigInfo(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "44")) {
          return;
       }
       l sessionPageI = this.getSessionPageInfoModule();
       YodaInitConfig config = Yoda.get().getConfig();
       if (config != null) {
          sessionPageI.preInitYoda = Boolean.valueOf(config.isPreInitSpringYoda());
          sessionPageI.networkScore = config.getNetworkScore();
       }
       e sessionLogge = this.getSessionLogger();
       YodaBaseWebView tmCurrentUrl = this.mCurrentUrl;
       String referUrl = this.getReferUrl();
       try{
          sessionLogge.v(tmCurrentUrl, referUrl);
          WebSettings settings = this.getSettings();
          if (settings != null) {
             this.getSessionLogger().d().j = e.f(new a(settings.getUserAgentString()));
          }
       }catch(java.lang.Exception e0){
          r.j("YodaBaseWebView", Log.getStackTraceString(e0));
       }
       return;
    }
    public void setContainerSession(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "53")) {
          return;
       }
       if (p0 != null) {
          YodaBaseWebView tmContainerS = this.mContainerSession;
          if (tmContainerS != p0) {
             if (tmContainerS != null && tmContainerS.c == null) {
                tmContainerS.a("create_session");
             }
             this.prepareNewSessionInitInfo(p0, this.mContainerSession);
             this.mContainerSession = p0;
          }
       }
       return;
    }
    public void setCurrentPageData(JsonObject p0){
       this.currentPageData = p0;
    }
    public void setCurrentUrl(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "41")) {
          return;
       }
       this.mCurrentUrl = p0;
       YodaBaseWebView tmCurrentUrl = this.mCurrentUrl;
       if (!PatchProxy.applyVoidTwoRefs(this, tmCurrentUrl, null, s.class, "3")) {
          Uri uri = Uri.parse(o.a(tmCurrentUrl));
          if (uri.isHierarchical()) {
             String queryParamet = uri.getQueryParameter("bizId");
             if (!o.c(queryParamet) && Yoda.get().hasInit()) {
                Iterator iterator = Yoda.get().getAppConfigHandler().c().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      a uoa = iterator.next();
                      if (uoa != null && o.b(queryParamet, uoa.f)) {
                         a e = uoa.e;
                         if (e != null && !o.c(e.getHyId())) {
                            this.getLaunchModel().setHyIdStr(uoa.e.getHyId());
                            this.getSessionPageInfoModule().h(this.getLaunchModel().getHyIds());
                         }
                      }
                   }
                }
             }
             String queryParamet1 = uri.getQueryParameter("hyId");
             if (!o.c(queryParamet1)) {
                this.getLaunchModel().setHyIdStr(queryParamet1);
                this.getSessionPageInfoModule().h(this.getLaunchModel().getHyIds());
             }else {
                String queryParamet2 = uri.getQueryParameter("__launch_options__");
                if (!o.c(queryParamet2)) {
                   try{
                      queryParamet1 = new JSONObject(queryParamet2).optString("hyId");
                   }catch(org.json.JSONException e0){
                      r.e(s.class.getSimpleName(), e0);
                   }
                   if (!o.c(queryParamet1)) {
                      this.getLaunchModel().setHyIdStr(queryParamet1);
                      this.getSessionPageInfoModule().h(this.getLaunchModel().getHyIds());
                   }
                }
             }
          }
       }
       this.setConfigInfo();
       this.getJavascriptBridge().p(p0);
       if (p1.equals("page_started")) {
          this.setLoadUrlInfo(p0, p1);
       }else {
          this.setPageUrlInfo(p0, p1);
       }
       return;
    }
    public void setJsInterceptor(d p0){
       this.mJsInterceptor = p0;
    }
    public final void setKsWebViewClient(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView.class, "91")) {
          return;
       }
       KsWebView yodaKsWebVie = this.getYodaKsWebView();
       if (yodaKsWebVie != null) {
          yodaKsWebVie.setWebViewClient(new YodaBaseWebView$c(this));
       }
       return;
    }
    public void setLaunchModel(LaunchModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "51")) {
          return;
       }
       this.mLaunchModel = p0;
       this.configLoadingProgressbar();
       return;
    }
    public final void setLoadUrlInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "43")) {
          return;
       }
       this.loadUrlInfo.a(p0, p1, null);
       return;
    }
    public void setManagerProvider(i p0){
       this.mManagerProvider = p0;
    }
    public void setOriginContext(Context p0){
       this.mOriginContext = p0;
    }
    public void setPageLoadFinished(boolean p0){
       this.mPageLoadFinished = p0;
    }
    public final void setPageUrlInfo(String p0,String p1){
       String host;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaBaseWebView.class, "42")) {
          return;
       }
       try{
          host = Uri.parse(p0).getHost();
       }catch(java.lang.Exception e0){
          r.h("YodaBaseWebView", "setPageUrlInfo, parse url fail, e:"+e0.getMessage()+", url:"+p0);
          host = "";
       }
       this.pageUrlInfo.a(p0, p1, host);
       this.loadUrlInfo.a(p0, p1, host);
       return;
    }
    public void setPendingVideoFullScreenOrientation(int p0){
       this.mPendingVideoFullScreenOrientation = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, YodaBaseWebView.class, "65")) {
          return;
       }
       ProgressBar progressBar = this.getProgressBar();
       if (progressBar == null) {
          return;
       }
       progressBar.setProgress(p0);
       return;
    }
    public void setProgressVisibility(int p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, YodaBaseWebView.class, "3")) {
          return;
       }
       if (this.getProgressBar() == null) {
          return;
       }
       int i = 0x10e0000;
       if (this.enableProgressBar()) {
          n.j(this.mLoadingProgressBar, p0, (long)this.getResources().getInteger(i), null);
       }else {
          n.j(this.mLoadingProgressBar, 4, (long)this.getResources().getInteger(i), null);
       }
       return;
    }
    public void setRenderProcessKilled(boolean p0){
       this.mRenderProcessKilled = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(YodaBaseWebView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, YodaBaseWebView.class, "72")) {
          return;
       }
       super.setVisibility(p0);
       WebViewMemOptHelper g = WebViewMemOptHelper.g;
       Objects.requireNonNull(g);
       WebViewMemOptHelper webViewMemOp = WebViewMemOptHelper.class;
       if (!PatchProxy.isSupport(webViewMemOp) || !PatchProxy.applyVoidTwoRefs(this, Integer.valueOf(p0), g, webViewMemOp, "8")) {
          a.q(this, "webview");
          if (g.b().remove(Integer.valueOf(this.hashCode())) != null) {
             r.h("WebViewMemOptHelper", "remove hiddenWebviews in mem_opt:"+this.hashCode());
          }
       }
       if (p0) {
          this.getMediaRecorder().f("native_audio_recorder_error", "userCancel", "WebView not visible");
       }
       return;
    }
    public void setWebChromeClient(WebChromeClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "34")) {
          return;
       }
       super.setWebChromeClient(p0);
       this.mYodaWebChromeClient = (p0 instanceof YodaWebChromeClient)? p0: null;
       return;
    }
    public void setWebSettings(WebSettings p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "28")) {
          return;
       }
       if (p0 != null) {
          boolean b = true;
          try{
             p0.setJavaScriptEnabled(b);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          p0.setBuiltInZoomControls(b);
          p0.setSupportZoom(b);
          p0.setDisplayZoomControls(false);
          p0.setUseWideViewPort(b);
          p0.setLoadWithOverviewMode(b);
          p0.setDomStorageEnabled(b);
          if (!Yoda.get().isDebugToolEnable()) {
             p0.setPluginState(WebSettings$PluginState.ON);
          }else {
             p0.setPluginState(WebSettings$PluginState.OFF);
          }
          p0.setAllowFileAccessFromFileURLs(false);
          p0.setAllowUniversalAccessFromFileURLs(false);
          p0.setAllowFileAccess(false);
          p0.setMixedContentMode(false);
          if (m.d(d.a().d())) {
             this.getSettings().setCacheMode(-1);
          }else {
             this.getSettings().setCacheMode(b);
          }
          p0.setMediaPlaybackRequiresUserGesture(false);
          p0.setUserAgentString(this.getUserAgent(p0));
       }
       return;
    }
    public void setWebViewClient(WebViewClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "33")) {
          return;
       }
       super.setWebViewClient(p0);
       this.mYodaWebViewClient = (p0 instanceof g)? p0: null;
       return;
    }
    public void setWebViewEmbedded(boolean p0){
       this.mEmbedded = p0;
    }
    public final void startCheckBlank(String p0){
       Uri uri;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "92")) {
          return;
       }
       this.disposeBlankCheck();
       Boolean[] uBooleanArra = new Boolean[3];
       this.blankCheckList = uBooleanArra;
       boolean b = this.initKsWebPaintEventListener();
       String str = "YodaBaseWebView";
       r.b(str, "startCheckBlank, isSupportKs£º"+b);
       this.getSessionPageInfoModule().ksSupportBlank = Boolean.valueOf(b);
       if (b) {
          return;
       }
       n obj = null;
       try{
          uri = Uri.parse(p0);
       }catch(java.lang.Exception e1){
          r.h(str, "startCheckBlank, parse url fail, e:"+e1.getMessage()+", url:"+p0);
          uri = obj;
       }
       if (uri == null) {
          return;
       }
       String str1 = "yoda_webview_blank_check_white_list";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       obj = PatchProxy.applyTwoRefs(uri, str1, obj, on, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.q(uri, "uri");
          obj = n.e;
          Map map = obj.c(str1);
          boolean b1 = true;
          if (map != null) {
             Object obj1 = PatchProxy.applyTwoRefs(uri, map, obj, on, "13");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(obj.e(map.get("*"), uri.getPath(), b1)){
                b = true;
             }else {
                String host = uri.getHost();
                if (host != null) {
                   b = obj.e(map.get(host), uri.getPath(), b1);
                }
             }
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          r.h(str, "--- startCheckBlank, capture, url:"+p0);
          this.mBlankCheckDisposable = t.intervalRange(0, 3, 1, 1, TimeUnit.SECONDS).subscribeOn(AzerothSchedulers.c()).observeOn(AzerothSchedulers.b()).subscribe(new w(this), f.b, e.b);
          return;
       }
    }
    public boolean tryInjectCookie(String p0){
       YodaWebCookie obj = PatchProxy.applyOneRefs(p0, this, YodaBaseWebView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getYodaWebCookie();
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, YodaWebCookie.class, "6")) {
          YodaCookie f = YodaCookie.f;
          p0 = f.e(p0);
          YodaWebCookie yodaWebCooki = (p0 == null || !p0.length())? 1: null;
          if (yodaWebCooki) {
             b.b.k("The resource root domain for cookie is null or empty");
          }else if(obj.b.contains(p0)){
             b.b.g("The resource root domain has injected cookie, skip this time.");
          }else {
             f.c(p0, false);
             obj.b.add(p0);
          }
       }
       return true;
    }
    public void unregisterScrollChangeCallback(YodaBaseWebView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "99")) {
          return;
       }
       if (p0 != null) {
          YodaBaseWebView tmScrollChan = this.mScrollChangeCallbacks;
          _monitor_enter(tmScrollChan);
          this.mScrollChangeCallbacks.remove(p0);
          _monitor_exit(tmScrollChan);
       }
       return;
    }
    public void updateLocal(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBaseWebView.class, "12")) {
          return;
       }
       Supplier localeSuppli = Yoda.get().getLocaleSupplier();
       if (localeSuppli == null) {
          return;
       }
       Locale locale = localeSuppli.get();
       if (!PatchProxy.applyVoidTwoRefs(p0, locale, null, f.class, "1")) {
          f.a.a(p0, locale);
       }
       return;
    }
}
