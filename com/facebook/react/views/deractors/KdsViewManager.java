package com.facebook.react.views.deractors.KdsViewManager;
import com.facebook.react.views.view.ReactViewManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.deractors.KdsViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.deractors.BackgroundDecorView;
import ze.p;
import yd.e;
import java.lang.StringBuilder;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Integer;
import java.lang.Float;

public class KdsViewManager extends ReactViewManager	// class@0013b3
{
    public ViewManager mImageManager;

    public void KdsViewManager(){
       super();
       this.mImageManager = null;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public KdsViewGroup createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KdsViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KdsViewGroup(p0);
    }
    public ReactViewGroup createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public String getName(){
       return "KDSView";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsViewManager.class, "15")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       if (p0 instanceof KdsViewGroup) {
          KdsViewGroup kdsViewGroup = p0;
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasTransform != null) {
             super.setTransform(p0, null);
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setTransform(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mTransformMatrix);
                }
             }else {
                super.setTransform(p0, kdsViewGroup.getBackgroundDecorViewManager().mTransformMatrix);
             }
          }
          float f = 0;
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasRotation != null) {
             super.setRotation(p0, f);
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setRotation(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mRotation);
                }
             }else {
                super.setRotation(p0, kdsViewGroup.getBackgroundDecorViewManager().mRotation);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasScaleX != null) {
             super.setScaleX(p0, 0x3f800000);
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setScaleX(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mScaleX);
                }
             }else {
                super.setScaleX(p0, kdsViewGroup.getBackgroundDecorViewManager().mScaleX);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasScaleY != null) {
             super.setScaleY(p0, 0x3f800000);
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setScaleY(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mScaleY);
                }
             }else {
                super.setScaleY(p0, kdsViewGroup.getBackgroundDecorViewManager().mScaleY);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasTranslateX != null) {
             super.setTranslateX(p0, p.c(f));
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setTranslateX(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mTranslateX);
                }
             }else {
                super.setTranslateX(p0, kdsViewGroup.getBackgroundDecorViewManager().mTranslateX);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasTranslateY != null) {
             super.setTranslateY(p0, p.c(f));
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setTranslateY(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mTranslateY);
                }
             }else {
                super.setTranslateY(p0, kdsViewGroup.getBackgroundDecorViewManager().mTranslateY);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasZIndex != null) {
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setZIndex(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mZIndex);
                }
             }else {
                super.setZIndex(p0, kdsViewGroup.getBackgroundDecorViewManager().mZIndex);
             }
          }
          if (kdsViewGroup.getBackgroundDecorViewManager().mHasOpacity != null) {
             super.setOpacity(p0, 0x3f800000);
             if (kdsViewGroup.getBackgroundDecorViewManager().mHasBackgroundImage != null) {
                if (BackgroundDecorView.i(p0) != null) {
                   super.setOpacity(BackgroundDecorView.i(p0), kdsViewGroup.getBackgroundDecorViewManager().mOpacity);
                }
             }else {
                super.setOpacity(p0, kdsViewGroup.getBackgroundDecorViewManager().mOpacity);
             }
          }
       }
    label_019e :
       return;
    }
    public void setBackgroundImage(KdsViewGroup p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsViewManager.class, "14")) {
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
    public void setBorderColor(KdsViewGroup p0,int p1,Integer p2){
       if (PatchProxy.isSupport(KdsViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KdsViewManager.class, "5")) {
          return;
       }
       super.setBorderColor(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderColorParams(p0, p1, p2);
       return;
    }
    public void setBorderRadius(KdsViewGroup p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsViewManager.class, "2")) {
          return;
       }
       super.setBorderRadius(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderRadiusParams(p0, p1, p2);
       return;
    }
    public void setBorderStyle(KdsViewGroup p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsViewManager.class, "3")) {
          return;
       }
       super.setBorderStyle(p0, p1);
       p0.getBackgroundDecorViewManager().setBorderStyleParams(p0, p1);
       return;
    }
    public void setBorderWidth(KdsViewGroup p0,int p1,float p2){
       if (PatchProxy.isSupport(KdsViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, KdsViewManager.class, "4")) {
          return;
       }
       super.setBorderWidth(p0, p1, p2);
       p0.getBackgroundDecorViewManager().setBorderWidthParams(p0, p1, p2);
       return;
    }
    public void setOpacity(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "12")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundOpacity(p1);
       return;
    }
    public void setRotation(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "7")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundRotation(p1);
       return;
    }
    public void setScaleX(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "8")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleX(p1);
       return;
    }
    public void setScaleY(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "9")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundScaleY(p1);
       return;
    }
    public void setTransform(KdsViewGroup p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsViewManager.class, "6")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTransform(p1);
       return;
    }
    public void setTranslateX(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "10")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateX(p1);
       return;
    }
    public void setTranslateY(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "11")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundTranslateY(p1);
       return;
    }
    public void setZIndex(KdsViewGroup p0,float p1){
       KdsViewManager kdsViewManag = KdsViewManager.class;
       if (PatchProxy.isSupport(kdsViewManag) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, kdsViewManag, "13")) {
          return;
       }
       p0.getBackgroundDecorViewManager().setBackgroundZIndex(p1);
       return;
    }
}
