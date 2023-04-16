package com.facebook.react.views.deractors.KdsHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.FpsListener;
import ze.n0;
import android.view.View;
import com.facebook.react.views.deractors.KdsHorizontalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.deractors.BackgroundDecorView;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import ze.p;
import yd.e;
import java.lang.StringBuilder;
import android.widget.HorizontalScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Integer;
import java.lang.Float;

public class KdsHorizontalScrollViewManager extends ReactHorizontalScrollViewManager	// class@0013ad
{
    public ViewManager mImageManager;

    public void KdsHorizontalScrollViewManager(){
       super(null);
       this.mImageManager = null;
    }
    public void KdsHorizontalScrollViewManager(FpsListener p0){
       super(p0);
       this.mImageManager = null;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public KdsHorizontalScrollView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KdsHorizontalScrollViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KdsHorizontalScrollView(p0);
    }
    public ReactHorizontalScrollView createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public String getName(){
       return "KDSHorizontalScrollView";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactHorizontalScrollView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsHorizontalScrollViewManager.class, "15")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       if (p0 instanceof KdsHorizontalScrollView) {
          KdsHorizontalScrollView kdsHorizonta = p0;
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasTransform != null) {
             super.setTransform(p0, null);
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setTransform(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mTransformMatrix);
                }
             }else {
                super.setTransform(p0, kdsHorizonta.getBackgroundDecorViewManager().mTransformMatrix);
             }
          }
          float f = 0;
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasRotation != null) {
             super.setRotation(p0, f);
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setRotation(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mRotation);
                }
             }else {
                super.setRotation(p0, kdsHorizonta.getBackgroundDecorViewManager().mRotation);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasScaleX != null) {
             super.setScaleX(p0, 0x3f800000);
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setScaleX(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mScaleX);
                }
             }else {
                super.setScaleX(p0, kdsHorizonta.getBackgroundDecorViewManager().mScaleX);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasScaleY != null) {
             super.setScaleY(p0, 0x3f800000);
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setScaleY(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mScaleY);
                }
             }else {
                super.setScaleY(p0, kdsHorizonta.getBackgroundDecorViewManager().mScaleY);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasTranslateX != null) {
             super.setTranslateX(p0, p.c(f));
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setTranslateX(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mTranslateX);
                }
             }else {
                super.setTranslateX(p0, kdsHorizonta.getBackgroundDecorViewManager().mTranslateX);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasTranslateY != null) {
             super.setTranslateY(p0, p.c(f));
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setTranslateY(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mTranslateY);
                }
             }else {
                super.setTranslateY(p0, kdsHorizonta.getBackgroundDecorViewManager().mTranslateY);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasZIndex != null) {
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setZIndex(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mZIndex);
                }
             }else {
                super.setZIndex(p0, kdsHorizonta.getBackgroundDecorViewManager().mZIndex);
             }
          }
          if (kdsHorizonta.getBackgroundDecorViewManager().mHasOpacity != null) {
             super.setOpacity(p0, 0x3f800000);
             if (kdsHorizonta.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   kdsHorizonta.getBackgroundDecorViewManager().setOpacity(BackgroundDecorView.i(p0), kdsHorizonta.getBackgroundDecorViewManager().mOpacity);
                }
             }else {
                super.setOpacity(p0, kdsHorizonta.getBackgroundDecorViewManager().mOpacity);
             }
          }
       }
    label_01be :
       return;
    }
    public void setBackgroundImage(KdsHorizontalScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsHorizontalScrollViewManager.class, "14")) {
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
    public void setBorderColor(KdsHorizontalScrollView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(KdsHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KdsHorizontalScrollViewManager.class, "5")) {
          return;
       }
       super.setBorderColor(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderColorParams(p0, p1, p2);
       return;
    }
    public void setBorderRadius(KdsHorizontalScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsHorizontalScrollViewManager.class, "2")) {
          return;
       }
       super.setBorderRadius(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderRadiusParams(p0, p1, p2);
       return;
    }
    public void setBorderStyle(KdsHorizontalScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsHorizontalScrollViewManager.class, "3")) {
          return;
       }
       super.setBorderStyle(p0, p1);
       p0.getBackgroundDecorViewManager().setBorderStyleParams(p0, p1);
       return;
    }
    public void setBorderWidth(KdsHorizontalScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsHorizontalScrollViewManager.class, "4")) {
          return;
       }
       super.setBorderWidth(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderWidthParams(p0, p1, p2);
       return;
    }
    public void setOpacity(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "12")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundOpacity(p1);
       return;
    }
    public void setRotation(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "7")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundRotation(p1);
       return;
    }
    public void setScaleX(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "8")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleX(p1);
       return;
    }
    public void setScaleY(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "9")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleY(p1);
       return;
    }
    public void setTransform(KdsHorizontalScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsHorizontalScrollViewManager.class, "6")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTransform(p1);
       return;
    }
    public void setTranslateX(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "10")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateX(p1);
       return;
    }
    public void setTranslateY(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "11")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateY(p1);
       return;
    }
    public void setZIndex(KdsHorizontalScrollView p0,float p1){
       KdsHorizontalScrollViewManager kdsHorizonta = KdsHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(kdsHorizonta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsHorizonta, "13")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundZIndex(p1);
       return;
    }
}
