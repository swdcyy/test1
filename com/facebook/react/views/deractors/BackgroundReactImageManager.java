package com.facebook.react.views.deractors.BackgroundReactImageManager;
import com.facebook.react.uimanager.SimpleViewManager;
import pf.c;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.a;
import pf.f;
import ze.n0;
import android.view.View;
import com.facebook.react.views.deractors.BackgroundReactImageView;
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
import com.facebook.react.views.image.ReactImageView;
import java.lang.Float;
import java.lang.Integer;
import lg.d;
import ze.p;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import nf.b;
import xb.t$b;
import pf.d;
import android.graphics.Shader$TileMode;
import com.facebook.react.bridge.ReadableArray;
import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;

public class BackgroundReactImageManager extends SimpleViewManager	// class@0013a9
{
    public final Object mCallerContext;
    public final f mCallerContextFactory;
    public AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    public a mGlobalImageLoadListener;
    public final c mImageMemoryMonitor;

    public void BackgroundReactImageManager(){
       super();
       this.mDraweeControllerBuilder = null;
       this.mCallerContext = null;
       this.mCallerContextFactory = null;
       this.mImageMemoryMonitor = new c();
    }
    public void BackgroundReactImageManager(AbstractDraweeControllerBuilder p0,a p1,f p2){
       super();
       this.mDraweeControllerBuilder = p0;
       this.mGlobalImageLoadListener = p1;
       this.mCallerContextFactory = p2;
       this.mCallerContext = null;
       this.mImageMemoryMonitor = new c();
    }
    public void BackgroundReactImageManager(AbstractDraweeControllerBuilder p0,f p1){
       super(p0, null, p1);
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public BackgroundReactImageView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BackgroundReactImageManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BackgroundReactImageView(p0, this.getDraweeControllerBuilder(), this.mGlobalImageLoadListener, this.mImageMemoryMonitor);
    }
    public Object getCallerContext(){
       return this.mCallerContext;
    }
    public AbstractDraweeControllerBuilder getDraweeControllerBuilder(){
       Object obj = PatchProxy.apply(null, this, BackgroundReactImageManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDraweeControllerBuilder == null) {
          this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
       }
       return this.mDraweeControllerBuilder;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, BackgroundReactImageManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.g(b.k(4), d.d("registrationName", "onLoadStart"), b.k(2), d.d("registrationName", "onLoad"), b.k(1), d.d("registrationName", "onError"), b.k(3), d.d("registrationName", "onLoadEnd"));
    }
    public void getMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundReactImageManager.class, "20")) {
          return;
       }
       if (this.mImageMemoryMonitor != null) {
          HashMap hashMap = new HashMap();
          hashMap.put("BackgroundReactImageView", Long.valueOf(this.mImageMemoryMonitor.b()));
          p0.onMemoryStatsCollected(hashMap);
       }
       return;
    }
    public String getName(){
       return "BackgroundReactImageView";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(BackgroundReactImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundReactImageManager.class, "19")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       p0.u();
       return;
    }
    public void setBlurRadius(BackgroundReactImageView p0,float p1){
       BackgroundReactImageManager uBackgroundR = BackgroundReactImageManager.class;
       if (PatchProxy.isSupport(uBackgroundR) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uBackgroundR, "4")) {
          return;
       }
       p0.setBlurRadius(p1);
       return;
    }
    public void setBorderColor(BackgroundReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "7")) {
          return;
       }
       if (p1 == null) {
          p0.setBorderColor(0);
       }else {
          p0.setBorderColor(p1.intValue());
       }
       return;
    }
    public void setBorderRadius(BackgroundReactImageView p0,int p1,float p2){
       if (PatchProxy.isSupport(BackgroundReactImageManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, BackgroundReactImageManager.class, "10")) {
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
    public void setBorderWidth(BackgroundReactImageView p0,float p1){
       BackgroundReactImageManager uBackgroundR = BackgroundReactImageManager.class;
       if (PatchProxy.isSupport(uBackgroundR) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uBackgroundR, "9")) {
          return;
       }
       p0.setBorderWidth(p1);
       return;
    }
    public void setDefaultSource(BackgroundReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "5")) {
          return;
       }
       p0.setDefaultSource(p1);
       return;
    }
    public void setFadeDuration(BackgroundReactImageView p0,int p1){
       BackgroundReactImageManager uBackgroundR = BackgroundReactImageManager.class;
       if (PatchProxy.isSupport(uBackgroundR) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBackgroundR, "15")) {
          return;
       }
       p0.setFadeDuration(p1);
       return;
    }
    public void setHeaders(BackgroundReactImageView p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "17")) {
          return;
       }
       p0.setHeaders(p1);
       return;
    }
    public void setLoadHandlersRegistered(BackgroundReactImageView p0,boolean p1){
       BackgroundReactImageManager uBackgroundR = BackgroundReactImageManager.class;
       if (PatchProxy.isSupport(uBackgroundR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uBackgroundR, "16")) {
          return;
       }
       p0.setShouldNotifyLoadEvents(p1);
       return;
    }
    public void setLoadingIndicatorSource(BackgroundReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "6")) {
          return;
       }
       p0.setLoadingIndicatorSource(p1);
       return;
    }
    public void setOverlayColor(BackgroundReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "8")) {
          return;
       }
       if (p1 == null) {
          p0.setOverlayColor(0);
       }else {
          p0.setOverlayColor(p1.intValue());
       }
       return;
    }
    public void setProgressiveRenderingEnabled(BackgroundReactImageView p0,boolean p1){
       BackgroundReactImageManager uBackgroundR = BackgroundReactImageManager.class;
       if (PatchProxy.isSupport(uBackgroundR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uBackgroundR, "14")) {
          return;
       }
       p0.setProgressiveRenderingEnabled(p1);
       return;
    }
    public void setResizeMethod(BackgroundReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "12")) {
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
    public void setResizeMode(BackgroundReactImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "11")) {
          return;
       }
       p0.setScaleType(p0.getBackgroundScaleType());
       if (("backgroundImage").equals(p1)) {
          p0.setScaleType(p0.getBackgroundScaleType());
       }else {
          p0.setScaleType(d.c(p1));
       }
       p0.setTileMode(d.d(p1));
       return;
    }
    public void setSource(BackgroundReactImageView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "3")) {
          return;
       }
       p0.setSource(p1);
       return;
    }
    public void setTintColor(BackgroundReactImageView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundReactImageManager.class, "13")) {
          return;
       }
       if (p1 == null) {
          p0.clearColorFilter();
       }else {
          p0.setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
       }
       return;
    }
}
