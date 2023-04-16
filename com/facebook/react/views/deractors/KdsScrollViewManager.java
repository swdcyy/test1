package com.facebook.react.views.deractors.KdsScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.scroll.FpsListener;
import ze.n0;
import android.view.View;
import com.facebook.react.views.deractors.KdsScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.deractors.BackgroundDecorView;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import ze.p;
import yd.e;
import java.lang.StringBuilder;
import android.content.Context;
import android.widget.ScrollView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Integer;
import java.lang.Float;

public class KdsScrollViewManager extends ReactScrollViewManager	// class@0013b0
{
    public ViewManager mImageManager;

    public void KdsScrollViewManager(){
       super();
       this.mImageManager = null;
    }
    public void KdsScrollViewManager(FpsListener p0){
       super(p0);
       this.mImageManager = null;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public KdsScrollView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KdsScrollViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KdsScrollView(p0, this.mFpsListener);
    }
    public ReactScrollView createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public String getName(){
       return "KDSScrollView";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactScrollView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsScrollViewManager.class, "15")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       if (p0 instanceof KdsScrollView) {
          KdsScrollView kdsScrollVie = p0;
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasTransform != null) {
             super.setTransform(p0, null);
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setTransform(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mTransformMatrix);
                }
             }else {
                super.setTransform(p0, kdsScrollVie.getBackgroundDecorViewManager().mTransformMatrix);
             }
          }
          float f = 0;
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasRotation != null) {
             super.setRotation(p0, f);
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setRotation(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mRotation);
                }
             }else {
                super.setRotation(p0, kdsScrollVie.getBackgroundDecorViewManager().mRotation);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasScaleX != null) {
             super.setScaleX(p0, 0x3f800000);
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setScaleX(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mScaleX);
                }
             }else {
                super.setScaleX(p0, kdsScrollVie.getBackgroundDecorViewManager().mScaleX);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasScaleY != null) {
             super.setScaleY(p0, 0x3f800000);
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setScaleY(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mScaleY);
                }
             }else {
                super.setScaleY(p0, kdsScrollVie.getBackgroundDecorViewManager().mScaleY);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasTranslateX != null) {
             super.setTranslateX(p0, p.c(f));
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setTranslateX(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mTranslateX);
                }
             }else {
                super.setTranslateX(p0, kdsScrollVie.getBackgroundDecorViewManager().mTranslateX);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasTranslateY != null) {
             super.setTranslateY(p0, p.c(f));
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setTranslateY(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mTranslateY);
                }
             }else {
                super.setTranslateY(p0, kdsScrollVie.getBackgroundDecorViewManager().mTranslateY);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasZIndex != null) {
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setZIndex(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mZIndex);
                }
             }else {
                super.setZIndex(p0, kdsScrollVie.getBackgroundDecorViewManager().mZIndex);
             }
          }
          if (kdsScrollVie.getBackgroundDecorViewManager().mHasOpacity != null) {
             super.setOpacity(p0, 0x3f800000);
             if (kdsScrollVie.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsScrollVie.getBackgroundDecorViewManager().setOpacity(BackgroundDecorView.i(p0), kdsScrollVie.getBackgroundDecorViewManager().mOpacity);
                }
             }else {
                super.setOpacity(p0, kdsScrollVie.getBackgroundDecorViewManager().mOpacity);
             }
          }
       }
    label_01be :
       return;
    }
    public void setBackgroundImage(KdsScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsScrollViewManager.class, "14")) {
          return;
       }
       if (!e.c) {
          return;
       }
       StringBuilder str = "setBackgroundImage sources = "+p1;
       if (this.mImageManager == null && p0.getContext() != null) {
          this.mImageManager = p0.getContext().getNativeModule(UIManagerModule.class).getUIImplementation().y("BackgroundReactImageView");
       }
       p0.getBackgroundDecorViewManager().setBackgroundImage(p0, p1, this.mImageManager);
       return;
    }
    public void setBorderColor(KdsScrollView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(KdsScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KdsScrollViewManager.class, "5")) {
          return;
       }
       super.setBorderColor(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderColorParams(p0, p1, p2);
       return;
    }
    public void setBorderRadius(KdsScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsScrollViewManager.class, "2")) {
          return;
       }
       super.setBorderRadius(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderRadiusParams(p0, p1, p2);
       return;
    }
    public void setBorderStyle(KdsScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsScrollViewManager.class, "3")) {
          return;
       }
       super.setBorderStyle(p0, p1);
       p0.getBackgroundDecorViewManager().setBorderStyleParams(p0, p1);
       return;
    }
    public void setBorderWidth(KdsScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsScrollViewManager.class, "4")) {
          return;
       }
       super.setBorderWidth(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderWidthParams(p0, p1, p2);
       return;
    }
    public void setOpacity(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "12")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundOpacity(p1);
       return;
    }
    public void setRotation(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "7")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundRotation(p1);
       return;
    }
    public void setScaleX(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "8")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleX(p1);
       return;
    }
    public void setScaleY(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "9")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleY(p1);
       return;
    }
    public void setTransform(KdsScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsScrollViewManager.class, "6")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTransform(p1);
       return;
    }
    public void setTranslateX(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "10")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateX(p1);
       return;
    }
    public void setTranslateY(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "11")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateY(p1);
       return;
    }
    public void setZIndex(KdsScrollView p0,float p1){
       KdsScrollViewManager kdsScrollVie = KdsScrollViewManager.class;
       if (PatchProxy.isSupport(kdsScrollVie) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsScrollVie, "13")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundZIndex(p1);
       return;
    }
}
