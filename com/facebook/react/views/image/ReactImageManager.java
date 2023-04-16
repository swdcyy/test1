package com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.uimanager.SimpleViewManager;
import pf.g;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.a;
import pf.f;
import pf.c;
import ze.n0;
import android.view.View;
import com.facebook.react.views.image.ReactImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import java.util.Map;
import pf.b;
import vd.d;
import com.facebook.react.bridge.MemoryStatsCallback;
import java.util.HashMap;
import java.lang.Long;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.Float;
import java.lang.Integer;
import lg.d;
import ze.p;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import xb.t$b;
import pf.d;
import android.graphics.Shader$TileMode;
import com.facebook.react.bridge.ReadableArray;
import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;

public class ReactImageManager extends SimpleViewManager	// class@0013ba
{
    public final Object mCallerContext;
    public final f mCallerContextFactory;
    public AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    public a mGlobalImageLoadListener;
    public final c mImageMemoryMonitor;
    public final g mReactImageConfig;
    public static g mGlobalReactImageConfig;

    public void ReactImageManager(){
       super(null);
    }
    public void ReactImageManager(AbstractDraweeControllerBuilder p0,a p1,f p2,g p3){
       super();
       this.mDraweeControllerBuilder = p0;
       this.mGlobalImageLoadListener = p1;
       this.mCallerContextFactory = p2;
       if (ReactImageManager.getGlobalReactImageConfig() != null) {
          p3 = ReactImageManager.getGlobalReactImageConfig();
       }
       this.mReactImageConfig = p3;
       this.mCallerContext = null;
       this.mImageMemoryMonitor = new c();
       return;
    }
    public void ReactImageManager(AbstractDraweeControllerBuilder p0,f p1){
       super(p0, null, p1, null);
    }
    public void ReactImageManager(g p0){
       super();
       this.mDraweeControllerBuilder = null;
       this.mCallerContext = null;
       this.mCallerContextFactory = null;
       if (ReactImageManager.getGlobalReactImageConfig() != null) {
          p0 = ReactImageManager.getGlobalReactImageConfig();
       }
       this.mReactImageConfig = p0;
       this.mImageMemoryMonitor = new c();
       return;
    }
    public static synchronized g getGlobalReactImageConfig(){
       _monitor_enter(ReactImageManager.class);
       _monitor_exit(ReactImageManager.class);
       return ReactImageManager.mGlobalReactImageConfig;
    }
    public static synchronized void setGlobalReactImageConfig(g p0){
       _monitor_enter(ReactImageManager.class);
       ReactImageManager.mGlobalReactImageConfig = p0;
       _monitor_exit(ReactImageManager.class);
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactImageView createViewInstance(n0 p0){
       ReactImageManager obj = PatchProxy.applyOneRefs(p0, this, ReactImageManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCallerContextFactory;
       if (obj != null) {
          obj.a(p0);
       }else {
          this.getCallerContext();
       }
       ReactImageView reactImageVi = new ReactImageView(p0, this.getDraweeControllerBuilder(), this.mGlobalImageLoadListener, this.mReactImageConfig, this.mImageMemoryMonitor);
       return obj;
    }
    public Object getCallerContext(){
       return this.mCallerContext;
    }
    public AbstractDraweeControllerBuilder getDraweeControllerBuilder(){
       Object obj = PatchProxy.apply(null, this, ReactImageManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDraweeControllerBuilder == null) {
          this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
       }
       return this.mDraweeControllerBuilder;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactImageManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.g(b.k(4), d.d("registrationName", "onLoadStart"), b.k(2), d.d("registrationName", "onLoad"), b.k(1), d.d("registrationName", "onError"), b.k(3), d.d("registrationName", "onLoadEnd"));
    }
    public void getMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageManager.class, "22")) {
          return;
       }
       if (this.mImageMemoryMonitor != null) {
          HashMap hashMap = new HashMap();
          hashMap.put("RCTImageView", Long.valueOf(this.mImageMemoryMonitor.b()));
          p0.onMemoryStatsCollected(hashMap);
       }
       return;
    }
    public String getName(){
       return "RCTImageView";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageManager.class, "21")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       p0.u();
       return;
    }
    public void setBlurRadius(ReactImageView p0,float p1){
       ReactImageManager reactImageMa = ReactImageManager.class;
       if (PatchProxy.isSupport(reactImageMa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactImageMa, "4")) {
          return;
       }
       p0.setBlurRadius(p1);
       return;
    }
    public void setBorderColor(ReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "9")) {
          return;
       }
       if (p1 == null) {
          p0.setBorderColor(0);
       }else {
          p0.setBorderColor(p1.intValue());
       }
       return;
    }
    public void setBorderRadius(ReactImageView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactImageManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactImageManager.class, "12")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (!p1) {
          p0.setBorderRadius(p2);
       }else {
          p1--;
          p0.v(p2, p1);
       }
       return;
    }
    public void setBorderWidth(ReactImageView p0,float p1){
       ReactImageManager reactImageMa = ReactImageManager.class;
       if (PatchProxy.isSupport(reactImageMa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactImageMa, "11")) {
          return;
       }
       p0.setBorderWidth(p1);
       return;
    }
    public void setDefaultSource(ReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "5")) {
          return;
       }
       p0.setDefaultSource(p1);
       return;
    }
    public void setFadeDuration(ReactImageView p0,int p1){
       ReactImageManager reactImageMa = ReactImageManager.class;
       if (PatchProxy.isSupport(reactImageMa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactImageMa, "17")) {
          return;
       }
       p0.setFadeDuration(p1);
       return;
    }
    public void setHeaders(ReactImageView p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "19")) {
          return;
       }
       p0.setHeaders(p1);
       return;
    }
    public void setLoadHandlersRegistered(ReactImageView p0,boolean p1){
       ReactImageManager reactImageMa = ReactImageManager.class;
       if (PatchProxy.isSupport(reactImageMa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactImageMa, "18")) {
          return;
       }
       p0.setShouldNotifyLoadEvents(p1);
       return;
    }
    public void setLoadingIndicatorSource(ReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "6")) {
          return;
       }
       p0.setLoadingIndicatorSource(p1);
       return;
    }
    public void setOverlayColor(ReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "10")) {
          return;
       }
       if (p1 == null) {
          p0.setOverlayColor(0);
       }else {
          p0.setOverlayColor(p1.intValue());
       }
       return;
    }
    public void setProgressiveRenderingEnabled(ReactImageView p0,boolean p1){
       ReactImageManager reactImageMa = ReactImageManager.class;
       if (PatchProxy.isSupport(reactImageMa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactImageMa, "16")) {
          return;
       }
       p0.setProgressiveRenderingEnabled(p1);
       return;
    }
    public void setResizeMethod(ReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "14")) {
          return;
       }
       if (p1 == null || ("auto").equals(p1)) {
          p0.setResizeMethod(ImageResizeMethod.AUTO);
       }else if(("resize").equals(p1)){
          p0.setResizeMethod(ImageResizeMethod.RESIZE);
       }else if(("scale").equals(p1)){
          p0.setResizeMethod(ImageResizeMethod.SCALE);
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid resize method: \'"+p1+"\'");
       }
       return;
    }
    public void setResizeMode(ReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "13")) {
          return;
       }
       p0.setScaleType(d.c(p1));
       p0.setTileMode(d.d(p1));
       return;
    }
    public void setSource(ReactImageView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "3")) {
          return;
       }
       p0.setSource(p1);
       return;
    }
    public void setTintColor(ReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageManager.class, "15")) {
          return;
       }
       if (p1 == null) {
          p0.clearColorFilter();
       }else {
          p0.setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
       }
       return;
    }
    public void updateReuseViewPropsEnd(View p0){
       this.updateReuseViewPropsEnd(p0);
    }
    public void updateReuseViewPropsEnd(ReactImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageManager.class, "8")) {
          return;
       }
       p0.P = false;
       return;
    }
    public void updateReuseViewPropsStart(View p0){
       this.updateReuseViewPropsStart(p0);
    }
    public void updateReuseViewPropsStart(ReactImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageManager.class, "7")) {
          return;
       }
       super.updateReuseViewPropsStart(p0);
       p0.O = false;
       p0.P = true;
       return;
    }
}
