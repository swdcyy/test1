package com.facebook.react.views.view.ReactClippingViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.UiThreadUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import java.lang.Boolean;

public abstract class ReactClippingViewManager extends ViewGroupManager	// class@001435
{

    public void ReactClippingViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ReactViewGroup p0,View p1,int p2){
       if (PatchProxy.isSupport(ReactClippingViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ReactClippingViewManager.class, "2")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0.getRemoveClippedSubviews()) {
          p0.addViewWithSubviewClippingEnabled(p1, p2);
       }else {
          p0.addView(p1, p2);
       }
       return;
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(ReactViewGroup p0,int p1){
       ReactClippingViewManager reactClippin = ReactClippingViewManager.class;
       if (PatchProxy.isSupport(reactClippin)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, reactClippin, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.getRemoveClippedSubviews()) {
          return p0.getChildAtWithSubviewClippingEnabled(p1);
       }else {
          return p0.getChildAt(p1);
       }
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(ReactViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactClippingViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.getRemoveClippedSubviews()) {
          return p0.getAllChildrenCount();
       }
       return p0.getChildCount();
    }
    public void removeAllViews(ViewGroup p0){
       this.removeAllViews(p0);
    }
    public void removeAllViews(ReactViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactClippingViewManager.class, "6")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0.getRemoveClippedSubviews()) {
          p0.removeAllViewsWithSubviewClippingEnabled();
       }else {
          p0.removeAllViews();
       }
       return;
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(ReactViewGroup p0,int p1){
       ReactClippingViewManager reactClippin = ReactClippingViewManager.class;
       if (PatchProxy.isSupport(reactClippin) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactClippin, "5")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0.getRemoveClippedSubviews()) {
          View childAt = this.getChildAt(p0, p1);
          if (childAt.getParent() != null) {
             p0.removeView(childAt);
          }
          p0.removeViewWithSubviewClippingEnabled(childAt);
       }else {
          p0.removeViewAt(p1);
       }
       return;
    }
    public void setRemoveClippedSubviews(ReactViewGroup p0,boolean p1){
       ReactClippingViewManager reactClippin = ReactClippingViewManager.class;
       if (PatchProxy.isSupport(reactClippin) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactClippin, "1")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       p0.setRemoveClippedSubviews(p1);
       return;
    }
}
