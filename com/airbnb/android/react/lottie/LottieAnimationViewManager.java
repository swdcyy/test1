package com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.kwai.kds.componenthelp.KrnBaseSimpleViewManager;
import java.util.WeakHashMap;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import ze.n0;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import v4.a;
import com.facebook.react.bridge.ReactContext;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import java.util.Map;
import v4.g;
import v4.c;
import v4.d;
import java.util.HashMap;
import w4.k;
import w4.j;
import java.lang.Integer;
import vd.d;
import vd.d$b;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.ReadableArray;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$d;
import java.lang.Runnable;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$c;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$b;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$a;
import java.lang.StringBuilder;
import v4.f;
import v4.e;
import java.lang.Exception;
import androidx.collection.LruCache;
import com.facebook.react.bridge.ReadableMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import pf.g;
import com.facebook.react.views.image.ReactImageManager;
import qf.a;
import kb.c;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$e;
import ya.a;
import kb.e;
import java.util.concurrent.Executor;
import java.lang.Float;
import com.airbnb.lottie.RenderMode;
import ib.c;

public class LottieAnimationViewManager extends KrnBaseSimpleViewManager	// class@000d82
{
    public final Map mJsonLoadedListeners;
    public final Map mListenerHashMap;
    public Map propManagersMap;
    public static final String TAG = "LottieAnimationViewManager";
    public static final int VERSION = 1;

    public void LottieAnimationViewManager(){
       super();
       this.propManagersMap = new WeakHashMap();
       this.mListenerHashMap = new WeakHashMap();
       this.mJsonLoadedListeners = new WeakHashMap();
    }
    public static Bitmap copyNewBitmap(Bitmap p0){
       Bitmap uBitmap = null;
       if (p0 == null) {
          return uBitmap;
       }
       uBitmap = p0.copy(p0.getConfig(), p0.isMutable());
       return uBitmap;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public LottieAnimationView createViewInstance(n0 p0){
       LottieAnimationView lottieAnimat = new LottieAnimationView(p0);
       lottieAnimat.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       a uoa = new a(p0, lottieAnimat);
       lottieAnimat.a(uoa);
       this.mListenerHashMap.put(lottieAnimat, uoa);
       if (g.d()) {
          c uoc = new c(p0, lottieAnimat);
          if (g.e()) {
             this.getOrCreatePropertyManager(lottieAnimat).d().put("context", p0);
             uoc.d(this.getOrCreatePropertyManager(lottieAnimat).d());
          }
          lottieAnimat.d(uoc);
          lottieAnimat.setFailureListener(uoc);
          this.mJsonLoadedListeners.put(lottieAnimat, uoc);
       }
       return lottieAnimat;
    }
    public Map getCommandsMap(){
       return d.g("play", Integer.valueOf(1), "reset", Integer.valueOf(2), "pause", Integer.valueOf(3), "resume", Integer.valueOf(4));
    }
    public Map getExportedCustomBubblingEventTypeConstants(){
       d$b uob = d.a();
       uob.b("animationFinish", d.d("phasedRegistrationNames", d.d("bubbled", "onAnimationFinish")));
       return uob.a();
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b uob = d.a();
       uob.b("onJsonLoadSuccess", d.d("registrationName", "onJsonLoadSuccess"));
       uob.b("onJsonLoadFail", d.d("registrationName", "onJsonLoadFail"));
       uob.b("onImagesLoaded", d.d("registrationName", "onImagesLoaded"));
       return uob.a();
    }
    public Map getExportedViewConstants(){
       d$b uob = d.a();
       uob.b("VERSION", Integer.valueOf(1));
       return uob.a();
    }
    public String getName(){
       return "LottieAnimationView";
    }
    public d getOrCreatePropertyManager(LottieAnimationView p0){
       d uod = this.propManagersMap.get(p0);
       if (uod == null) {
          uod = new d(p0);
          this.propManagersMap.put(p0, uod);
       }
       if (g.e() && uod.d() == null) {
          uod.u(new HashMap());
       }
       return uod;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(LottieAnimationView p0){
       super.onAfterUpdateTransaction(p0);
       this.updateCurrentBundleId(p0);
       this.getOrCreatePropertyManager(p0).a();
    }
    public void onAssetsImagesReady(LottieAnimationView p0){
       if (!this.getOrCreatePropertyManager(p0).e()) {
          return;
       }
       Context context = p0.getContext();
       if (!context instanceof ReactContext) {
          return;
       }
       context.getJSModule(RCTEventEmitter.class).receiveEvent(p0.getId(), "onImagesLoaded", Arguments.createMap());
       return;
    }
    public void onCatalystInstanceDestroy(){
       Map$Entry uEntry;
       LottieAnimationView key;
       Iterator iterator = this.mListenerHashMap.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          key = uEntry.getKey();
          if (key == null) {
             continue ;
          }
          key.v(uEntry.getValue());
       }
       this.mListenerHashMap.clear();
       if (g.d()) {
          iterator = this.mJsonLoadedListeners.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             if (key == null) {
                continue ;
             }
             key.w(uEntry.getValue());
             key.setFailureListener(null);
          }
          this.mJsonLoadedListeners.clear();
       }
       super.onCatalystInstanceDestroy();
       return;
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(LottieAnimationView p0){
       if (g.e()) {
          this.reportLogEvent(p0);
       }
       super.onDropViewInstance(p0);
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(LottieAnimationView p0,int p1,ReadableArray p2){
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 == 4) {
                   new Handler(Looper.getMainLooper()).post(new LottieAnimationViewManager$d(this, p0));
                }
             }else {
                new Handler(Looper.getMainLooper()).post(new LottieAnimationViewManager$c(this, p0));
             }
          }else {
             new Handler(Looper.getMainLooper()).post(new LottieAnimationViewManager$b(this, p0));
          }
       }else {
          new Handler(Looper.getMainLooper()).post(new LottieAnimationViewManager$a(this, p2, p0));
       }
       return;
    }
    public final void reportLogEvent(LottieAnimationView p0){
       String str = "jsonLoadError";
       String str1 = "imageLoadError";
       String str2 = "jsonLoadResult";
       String str3 = "imageLoadResult";
       String str4 = "source";
       if (this.getOrCreatePropertyManager(p0).d() != null) {
          HashMap hashMap = this.getOrCreatePropertyManager(p0).d();
          try{
             HashMap hashMap1 = new HashMap();
             n0 on0 = hashMap.get("context");
             if (on0 != null && this.getCurrentBundleInfo(on0) != null) {
                hashMap1.putAll(this.getCurrentBundleInfo(on0));
             }
             hashMap1.put(str4, hashMap.get(str4));
             str4 = "";
             int i = 0;
             Integer integer = (hashMap.get(str3) != null && !hashMap.get(str3).intValue())? null: 1;
             if (hashMap.get(str2) == null || hashMap.get(str2).intValue()) {
                i = 1;
             }
             str2 = "result";
             if (integer == 1 && i == 1) {
                hashMap1.put(str2, Integer.valueOf(1));
             }else if(integer == null && i == 1){
                hashMap1.put(str2, Integer.valueOf(-1));
             }else if(integer != null){
                hashMap1.put(str2, Integer.valueOf(-2));
             }else {
                hashMap1.put(str2, Integer.valueOf(-3));
             }
             if (hashMap1.get(str2).intValue() != 1) {
                if (hashMap.get(str1) != null) {
                   str4 = hashMap.get(str1);
                }
                if (hashMap.get(str) != null) {
                   str4 = hashMap.get(str)+str4;
                }
                hashMap1.put("error", str4);
             }
             hashMap.clear();
             f.a().b().a("KRN_LOTTIE_LOAD", hashMap1);
          }catch(java.lang.Exception e0){
             hashMap.clear();
             a.g("KRN_LOTTIE", "report log event failed :"+e0.getLocalizedMessage());
          }
       }
    }
    public void set(LottieAnimationView p0,boolean p1){
       this.getOrCreatePropertyManager(p0).f(p1);
    }
    public void setAllowSetNativeAutoPlay(LottieAnimationView p0,boolean p1){
       this.getOrCreatePropertyManager(p0).g(p1);
    }
    public void setAssetsImages(LottieAnimationView p0,ReadableArray p1){
       c uoc;
       if (p1 != null && p1.size() > 0) {
          LruCache lruCache = new LruCache(g.f());
          int i = 0;
          while (i < p1.size()) {
             String str = p1.getMap(i).getString("uri");
             if (!TextUtils.isEmpty(str)) {
                ImageRequestBuilder imageRequest = ImageRequestBuilder.k(Uri.parse(str));
                imageRequest.s(true);
                ImageRequest imageRequest1 = imageRequest.a();
                ImagePipeline imagePipelin = Fresco.getImagePipeline();
                if (g.a()) {
                   String tAG = LottieAnimationViewManager.TAG;
                   g globalReactI = ReactImageManager.getGlobalReactImageConfig();
                   if (globalReactI != null) {
                      tAG = globalReactI.b(p0, new a(p0.getContext(), str));
                   }
                   uoc = imagePipelin.fetchDecodedImage(imageRequest1, tAG);
                }else {
                   uoc = imagePipelin.fetchDecodedImage(imageRequest1, p0.getContext());
                }
                LottieAnimationViewManager$e uoe = new LottieAnimationViewManager$e(this, lruCache, str, p1, p0);
                uoc.f(v9, a.a());
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setAutoPlay(LottieAnimationView p0,boolean p1){
       this.getOrCreatePropertyManager(p0).m(p1);
    }
    public void setCacheComposition(LottieAnimationView p0,boolean p1){
    }
    public void setColorFilters(LottieAnimationView p0,ReadableArray p1){
       this.getOrCreatePropertyManager(p0).o(p1);
    }
    public void setEnableMergePaths(LottieAnimationView p0,boolean p1){
       this.getOrCreatePropertyManager(p0).p(p1);
    }
    public void setImageAssetsFolder(LottieAnimationView p0,String p1){
       this.getOrCreatePropertyManager(p0).q(p1);
    }
    public void setLoop(LottieAnimationView p0,boolean p1){
       this.getOrCreatePropertyManager(p0).r(p1);
    }
    public void setProgress(LottieAnimationView p0,float p1){
       this.getOrCreatePropertyManager(p0).s(Float.valueOf(p1));
    }
    public void setRenderMode(LottieAnimationView p0,String p1){
       RenderMode aUTOMATIC;
       if (("AUTOMATIC").equals(p1)) {
          aUTOMATIC = RenderMode.AUTOMATIC;
       }else if(("HARDWARE").equals(p1)){
          aUTOMATIC = RenderMode.HARDWARE;
       }else if(("SOFTWARE").equals(p1)){
          aUTOMATIC = RenderMode.SOFTWARE;
       }else {
          aUTOMATIC = null;
       }
       this.getOrCreatePropertyManager(p0).t(aUTOMATIC);
       return;
    }
    public void setResizeMode(LottieAnimationView p0,String p1){
       ImageView$ScaleType cENTER_CROP;
       if (("cover").equals(p1)) {
          cENTER_CROP = ImageView$ScaleType.CENTER_CROP;
       }else if(("contain").equals(p1)){
          cENTER_CROP = ImageView$ScaleType.CENTER_INSIDE;
       }else if(("center").equals(p1)){
          cENTER_CROP = ImageView$ScaleType.CENTER;
       }else {
          cENTER_CROP = null;
       }
       this.getOrCreatePropertyManager(p0).v(cENTER_CROP);
       return;
    }
    public void setSourceJson(LottieAnimationView p0,String p1){
       if (g.e()) {
          this.getOrCreatePropertyManager(p0).d().put("source", p1);
       }
       this.getOrCreatePropertyManager(p0).j(p1);
       return;
    }
    public void setSourceName(LottieAnimationView p0,String p1){
       if (g.e()) {
          this.getOrCreatePropertyManager(p0).d().put("source", p1);
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }else if(c.k(Uri.parse(p1)) || p1.startsWith("file://")){
          this.getOrCreatePropertyManager(p0).i(p1);
       }else if(!p1.contains(".")){
          p1 = p1+".json";
       }
       this.getOrCreatePropertyManager(p0).k(p1);
       return;
    }
    public void setSourceType(LottieAnimationView p0,String p1){
       this.getOrCreatePropertyManager(p0).w(p1);
    }
    public void setSpeed(LottieAnimationView p0,double p1){
       this.getOrCreatePropertyManager(p0).x((float)p1);
    }
    public final void updateCurrentBundleId(LottieAnimationView p0){
       Context context = p0.getContext();
       if (!context instanceof n0) {
          a.x("ReactNativeLottiePackage", "updateCurrentBundleId: unexpected context");
          return;
       }else {
          this.getOrCreatePropertyManager(p0).n(this.getCurrentBundleId(context));
          return;
       }
    }
}
