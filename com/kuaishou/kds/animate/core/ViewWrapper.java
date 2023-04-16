package com.kuaishou.kds.animate.core.ViewWrapper;
import com.facebook.react.bridge.ReactContext;
import android.view.View;
import java.lang.Object;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import ze.x;
import android.view.ViewGroup;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import java.lang.Integer;
import android.graphics.drawable.ColorDrawable;
import java.lang.Float;
import vh0.m;
import java.lang.Runnable;
import vh0.n;

public class ViewWrapper	// class@00079a
{
    public final ReactContext mReactContext;
    public final View mTargetView;
    public final f mUIImplementation;
    public final UIManagerModule mUIManagerModule;
    public final int mViewTag;

    public void ViewWrapper(ReactContext p0,int p1,View p2){
       super();
       this.mReactContext = p0;
       UIManagerModule nativeModule = p0.getNativeModule(UIManagerModule.class);
       this.mUIManagerModule = nativeModule;
       this.mUIImplementation = nativeModule.getUIImplementation();
       this.mViewTag = p1;
       this.mTargetView = p2;
    }
    public static void a(ViewWrapper p0,int p1){
       p0.lambda$setHeight$1(p1);
    }
    public static void b(ViewWrapper p0,int p1){
       p0.lambda$setWidth$0(p1);
    }
    private void lambda$setHeight$1(int p0){
       x ox = this.mUIImplementation.x(this.mViewTag);
       if (ox != null) {
          this.mUIManagerModule.updateNodeSize(this.mViewTag, (int)ox.getLayoutWidth(), p0);
       }
       return;
    }
    private void lambda$setWidth$0(int p0){
       x ox = this.mUIImplementation.x(this.mViewTag);
       if (ox != null) {
          this.mUIManagerModule.updateNodeSize(this.mViewTag, p0, (int)ox.getLayoutHeight());
       }
       return;
    }
    public final ViewGroup findTargetView(ViewGroup p0){
       View obj = PatchProxy.applyOneRefs(p0, this, ViewWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof ScrollView && p0.getChildCount() == 1) {
          obj = p0.getChildAt(0);
          if (obj instanceof TextView) {
             return p0;
          }else if(obj instanceof ViewGroup){
             return obj;
          }
       }
       return p0;
    }
    public int getBackgroundColor(){
       Drawable obj = PatchProxy.apply(null, this, ViewWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTargetView.getBackground();
       if (obj == null) {
          return 0;
       }
       int i = 0xff000000;
       if (obj instanceof ReactViewBackgroundDrawable) {
          i = obj.g();
       }
       return i;
    }
    public float getCameraDistance(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getCameraDistance();
    }
    public int getColor(){
       ViewWrapper obj = PatchProxy.apply(null, this, ViewWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTargetView;
       if (obj instanceof TextView) {
          return obj.getCurrentTextColor();
       }
       if (obj instanceof ViewGroup) {
          ViewGroup viewGroup = this.findTargetView(obj);
          int i = 0;
          while (i < viewGroup.getChildCount()) {
             View childAt = viewGroup.getChildAt(i);
             if (childAt instanceof TextView) {
                return childAt.getCurrentTextColor();
             }
             i = i + 1;
          }
       }
       return 0;
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mTargetView.getHeight();
    }
    public float getOpacity(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getAlpha();
    }
    public float getRotation(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getRotation();
    }
    public float getRotationX(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getRotationX();
    }
    public float getRotationY(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getRotationY();
    }
    public float getScaleX(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getScaleX();
    }
    public float getScaleY(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getScaleY();
    }
    public float getTranslationX(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getTranslationX();
    }
    public float getTranslationY(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTargetView.getTranslationY();
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, ViewWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mTargetView.getWidth();
    }
    public void setBackgroundColor(int p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewWrapper, "8")) {
          return;
       }
       Drawable background = this.mTargetView.getBackground();
       if (background instanceof ColorDrawable) {
          background.setColor(p0);
       }else if(background instanceof ReactViewBackgroundDrawable){
          background.r(p0);
       }else {
          this.mTargetView.setBackgroundColor(p0);
       }
       return;
    }
    public void setCameraDistance(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "26")) {
          return;
       }
       this.mTargetView.setCameraDistance(p0);
       return;
    }
    public void setColor(int p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewWrapper, "5")) {
          return;
       }
       viewWrapper = this.mTargetView;
       if (viewWrapper instanceof TextView) {
          viewWrapper.setTextColor(p0);
       }else if(viewWrapper instanceof ViewGroup){
          ViewGroup viewGroup = this.findTargetView(viewWrapper);
          int i = 0;
          while (i < viewGroup.getChildCount()) {
             View childAt = viewGroup.getChildAt(i);
             if (childAt instanceof TextView) {
                childAt.setTextColor(p0);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setHeight(int p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewWrapper, "4")) {
          return;
       }
       this.mReactContext.runOnNativeModulesQueueThread(new m(this, p0));
       return;
    }
    public void setOpacity(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "10")) {
          return;
       }
       this.mTargetView.setAlpha(p0);
       return;
    }
    public void setRotation(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "16")) {
          return;
       }
       this.mTargetView.setRotation(p0);
       return;
    }
    public void setRotationX(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "18")) {
          return;
       }
       this.mTargetView.setRotationX(p0);
       return;
    }
    public void setRotationY(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "20")) {
          return;
       }
       this.mTargetView.setRotationY(p0);
       return;
    }
    public void setScaleX(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "22")) {
          return;
       }
       this.mTargetView.setScaleX(p0);
       return;
    }
    public void setScaleY(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "24")) {
          return;
       }
       this.mTargetView.setScaleY(p0);
       return;
    }
    public void setTranslationX(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "12")) {
          return;
       }
       this.mTargetView.setTranslationX(p0);
       return;
    }
    public void setTranslationY(float p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewWrapper, "14")) {
          return;
       }
       this.mTargetView.setTranslationY(p0);
       return;
    }
    public void setWidth(int p0){
       ViewWrapper viewWrapper = ViewWrapper.class;
       if (PatchProxy.isSupport(viewWrapper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewWrapper, "2")) {
          return;
       }
       this.mReactContext.runOnNativeModulesQueueThread(new n(this, p0));
       return;
    }
}
