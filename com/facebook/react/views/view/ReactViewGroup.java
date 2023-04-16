package com.facebook.react.views.view.ReactViewGroup;
import we.d;
import ze.q;
import ze.u;
import we.c;
import ze.b0;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Rect;
import android.content.Context;
import com.facebook.react.uimanager.PointerEvents;
import ze.b1;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import od.a;
import java.lang.System;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import android.view.ViewParent;
import android.view.View$OnLayoutChangeListener;
import android.graphics.Canvas;
import ze.h0;
import ze.i0;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.Exception;
import cb.a;
import java.util.Objects;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation;
import pe.a;
import lg.d;
import java.lang.Math;
import android.graphics.Path$Direction;
import android.view.ViewStructure;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.graphics.Point;
import java.lang.Boolean;
import yd.e;
import ze.r;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import we.b;
import ze.k;
import android.view.View$MeasureSpec;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.UnsupportedOperationException;
import java.lang.Float;
import com.facebook.react.views.view.ReactViewGroup$a;
import android.view.animation.Animation;

public class ReactViewGroup extends ViewGroup implements d, q, u, c, b0	// class@00143b
{
    public View[] mAllChildren;
    public int mAllChildrenCount;
    public float mBackfaceOpacity;
    public String mBackfaceVisibility;
    public ReactViewGroup$a mChildrenLayoutChangeListener;
    public Rect mClippingRect;
    public final b1 mDrawingOrderHelper;
    public Rect mHitSlopRect;
    public int mLayoutDirection;
    public boolean mNeedsOffscreenAlphaCompositing;
    public b mOnInterceptTouchEventListener;
    public String mOverflow;
    public Path mPath;
    public PointerEvents mPointerEvents;
    public ReactViewBackgroundDrawable mReactBackgroundDrawable;
    public boolean mRemoveClippedSubviews;
    public static final ViewGroup$LayoutParams sDefaultLayoutParam;
    public static final Rect sHelperRect;

    static {
       ReactViewGroup.sDefaultLayoutParam = new ViewGroup$LayoutParams(0, 0);
       ReactViewGroup.sHelperRect = new Rect();
    }
    public void ReactViewGroup(Context p0){
       super(p0);
       this.mRemoveClippedSubviews = false;
       this.mAllChildren = null;
       this.mPointerEvents = PointerEvents.AUTO;
       this.mNeedsOffscreenAlphaCompositing = false;
       this.mBackfaceOpacity = 0x3f800000;
       this.mBackfaceVisibility = "visible";
       this.setClipChildren(false);
       this.mDrawingOrderHelper = new b1(this);
    }
    public final void addInArray(View p0,int p1){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ReactViewGroup.class, "34")) {
          return;
       }
       ReactViewGroup tmAllChildre = this.mAllChildren;
       a.c(tmAllChildre);
       ReactViewGroup tmAllChildre1 = this.mAllChildrenCount;
       int len = tmAllChildre.length;
       int i = 0;
       if (p1 == tmAllChildre1) {
          if (len == tmAllChildre1) {
             View[] viewArray = new View[(len + 12)];
             this.mAllChildren = viewArray;
             System.arraycopy(tmAllChildre, i, viewArray, i, len);
             tmAllChildre = this.mAllChildren;
          }
          ReactViewGroup tmAllChildre2 = this.mAllChildrenCount;
          this.mAllChildrenCount = tmAllChildre2 + 1;
          tmAllChildre[tmAllChildre2] = p0;
       }else if(p1 < tmAllChildre1){
          if (len == tmAllChildre1) {
             View[] viewArray1 = new View[(len + 12)];
             this.mAllChildren = viewArray1;
             System.arraycopy(tmAllChildre, i, viewArray1, i, p1);
             System.arraycopy(tmAllChildre, p1, this.mAllChildren, (p1 + 1), (tmAllChildre1 - p1));
             tmAllChildre = this.mAllChildren;
          }else {
             System.arraycopy(tmAllChildre, p1, tmAllChildre, (p1 + 1), (tmAllChildre1 - p1));
          }
          tmAllChildre[p1] = p0;
          this.mAllChildrenCount = this.mAllChildrenCount + 1;
       }else {
          throw new IndexOutOfBoundsException("index="+p1+" count="+tmAllChildre1);
       }
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewGroup.class, "22")) {
          return;
       }
       this.mDrawingOrderHelper.b(p0);
       this.setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
       super.addView(p0, p1, p2);
       return;
    }
    public void addViewWithSubviewClippingEnabled(View p0,int p1){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ReactViewGroup.class, "29")) {
          return;
       }
       this.addViewWithSubviewClippingEnabled(p0, p1, ReactViewGroup.sDefaultLayoutParam);
       return;
    }
    public void addViewWithSubviewClippingEnabled(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewGroup.class, "30")) {
          return;
       }
       a.a(this.mRemoveClippedSubviews);
       a.c(this.mClippingRect);
       a.c(this.mAllChildren);
       this.addInArray(p0, p1);
       int i = 0;
       int i1 = 0;
       while (i < p1) {
          if (this.mAllChildren[i].getParent() == null) {
             i1 = i1 + 1;
          }
          i++;
       }
       this.updateSubviewClipStatus(this.mClippingRect, p1, i1);
       p0.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "40")) {
          return;
       }
       try{
          this.dispatchOverflowDraw(p0);
          super.dispatchDraw(p0);
       }catch(java.lang.NullPointerException e4){
          a.h("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", e4);
       }catch(java.lang.StackOverflowError e4){
          h0 oh0 = i0.a(this);
          if (oh0 != null) {
             oh0.C(e4);
          }else if(this.getContext() instanceof ReactContext){
             this.getContext().handleException(new IllegalViewOperationException("StackOverflowException", this, e4));
          }else {
             throw e4;
          }
       }
       return;
    }
    public final void dispatchOverflowDraw(Canvas p0){
       float f3;
       float f4;
       float f10;
       Path path = this;
       ReactViewGroup obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, path, ReactViewGroup.class, "41")) {
          return;
       }
       ReactViewGroup mOverflow = path.mOverflow;
       if (mOverflow != null) {
          Objects.requireNonNull(mOverflow);
          if (!mOverflow.equals("hidden")) {
             if (mOverflow.equals("visible")) {
                obj = path.mPath;
                if (obj != null) {
                   obj.rewind();
                }
             }
          }else {
             float f = (float)this.getWidth();
             float f1 = (float)this.getHeight();
             ReactViewGroup mReactBackgr = path.mReactBackgroundDrawable;
             ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu = 1;
             float f2 = 0;
             if (mReactBackgr != null) {
                RectF rectF = mReactBackgr.h();
                RectF top = rectF.top;
                if (top - f2 <= 0 && (rectF.left - f2 <= 0 && (rectF.bottom - f2 > 0 || rectF.right - f2 > 0))) {
                   f3 = rectF.left + f2;
                   f4 = top + f2;
                   f = f - rectF.right;
                   f1 = f1 - rectF.bottom;
                }else {
                   f3 = 0;
                }
                float f5 = path.mReactBackgroundDrawable.j();
                float f6 = path.mReactBackgroundDrawable.e(f5, ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT);
                float f7 = path.mReactBackgroundDrawable.e(f5, ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT);
                float f8 = path.mReactBackgroundDrawable.e(f5, ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT);
                f5 = path.mReactBackgroundDrawable.e(f5, ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT);
                RectF rectF1 = (path.mLayoutDirection == uBorderRadiu)? 1: null;
                float f9 = path.mReactBackgroundDrawable.d(ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_START);
                f10 = path.mReactBackgroundDrawable.d(ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_END);
                f2 = path.mReactBackgroundDrawable.d(ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_START);
                float f11 = f5;
                f5 = path.mReactBackgroundDrawable.d(ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_END);
                float f12 = f6;
                if (a.b().a(this.getContext())) {
                   f6 = (d.a(f9))? f12: f9;
                   if (!d.a(f10)) {
                      f7 = f10;
                   }
                   if (!d.a(f2)) {
                      f8 = f2;
                   }
                   if (d.a(f5)) {
                      f5 = f11;
                   }
                   f10 = (rectF1)? f7: f6;
                   if (!rectF1) {
                      f6 = f7;
                   }
                   f9 = (rectF1)? f5: f8;
                   if (rectF1) {
                      f5 = f8;
                   }
                }else if(rectF1 != null){
                   f6 = f10;
                }else {
                   f6 = f9;
                }
                if (rectF1 == null) {
                   f9 = f10;
                }
                f10 = (rectF1 != null)? f5: f2;
                if (rectF1 == null) {
                   f2 = f5;
                }
                if (d.a(f6)) {
                   f6 = f12;
                }
                if (!d.a(f9)) {
                   f7 = f9;
                }
                if (!d.a(f10)) {
                   f8 = f10;
                }
                if (!d.a(f2)) {
                   f5 = f2;
                   f10 = f6;
                   f6 = f7;
                   f9 = f8;
                }else {
                   f10 = f6;
                   f6 = f7;
                   f9 = f8;
                   f5 = f11;
                }
                ReactViewGroup reactViewGro = null;
                if (f10 - reactViewGro <= 0 && (f6 - reactViewGro <= 0 && (f5 - reactViewGro > 0 || f9 - reactViewGro > 0))) {
                   if (path.mPath == null) {
                      path.mPath = new Path();
                   }
                   path.mPath.rewind();
                   float[] uofloatArray = new float[]{Math.max((f10 - rectF.left), 0),Math.max((f10 - rectF.top), 0),Math.max((f6 - rectF.right), 0),Math.max((f6 - rectF.top), 0),Math.max((f5 - rectF.right), 0),Math.max((f5 - rectF.bottom), 0),Math.max((f9 - rectF.left), 0),Math.max((f9 - rectF.bottom), 0)};
                   path.mPath.addRoundRect(new RectF(f3, f4, f, f1), uofloatArray, Path$Direction.CW);
                   obj.clipPath(path.mPath);
                   f2 = f3;
                   f10 = 1;
                }else {
                   f2 = f3;
                   f10 = 0;
                }
             }else {
                f10 = 0;
                f2 = 0;
                f4 = 0;
             }
             if (!f10) {
                obj.clipRect(new RectF(f2, f4, f, f1));
             }
          }
       }
       return;
    }
    public void dispatchProvideStructure(ViewStructure p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "3")) {
          return;
       }
       try{
          super.dispatchProvideStructure(p0);
       }catch(java.lang.NullPointerException e3){
          a.h("ReactNative", "NullPointerException when executing dispatchProvideStructure", e3);
       }
       return;
    }
    public void dispatchSetPressed(boolean p0){
    }
    public int getAllChildrenCount(){
       return this.mAllChildrenCount;
    }
    public int getBackgroundColor(){
       Object obj = PatchProxy.apply(null, this, ReactViewGroup.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getBackground() != null) {
          return this.getBackground().g();
       }
       return 0;
    }
    public View getChildAtWithSubviewClippingEnabled(int p0){
       ReactViewGroup obj;
       if (PatchProxy.isSupport(ReactViewGroup.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mAllChildren;
       a.c(obj);
       return obj[p0];
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (PatchProxy.isSupport(ReactViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactViewGroup.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mDrawingOrderHelper.a(p0, p1);
    }
    public boolean getChildVisibleRect(View p0,Rect p1,Point p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactViewGroup.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.L)? r.b(p0, p1, p2, this, this.mOverflow): super.getChildVisibleRect(p0, p1, p2);
       return b;
    }
    public void getClippingRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "14")) {
          return;
       }
       p0.set(this.mClippingRect);
       return;
    }
    public Rect getHitSlopRect(){
       return this.mHitSlopRect;
    }
    public final ReactViewBackgroundDrawable getOrCreateReactViewBackground(){
       Object[] objArray = null;
       Drawable obj = PatchProxy.apply(objArray, this, ReactViewGroup.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mReactBackgroundDrawable == null) {
          this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(this.getContext());
          obj = this.getBackground();
          this.updateBackgroundDrawable(objArray);
          if (obj == null) {
             this.updateBackgroundDrawable(this.mReactBackgroundDrawable);
          }else {
             Drawable[] uDrawableArr = new Drawable[]{this.mReactBackgroundDrawable,obj};
             this.updateBackgroundDrawable(new LayerDrawable(uDrawableArr));
          }
          boolean b = a.b().d(this.getContext());
          this.mLayoutDirection = b;
          this.mReactBackgroundDrawable.u(b);
       }
       return this.mReactBackgroundDrawable;
    }
    public String getOverflow(){
       return this.mOverflow;
    }
    public PointerEvents getPointerEvents(){
       return this.mPointerEvents;
    }
    public boolean getRemoveClippedSubviews(){
       return this.mRemoveClippedSubviews;
    }
    public int getZIndexMappedChildIndex(int p0){
       if (PatchProxy.isSupport(ReactViewGroup.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.mDrawingOrderHelper.d()) {
          p0 = this.mDrawingOrderHelper.a(this.getChildCount(), p0);
       }
       return p0;
    }
    public boolean hasOverlappingRendering(){
       return this.mNeedsOffscreenAlphaCompositing;
    }
    public final int indexOfChildInAllChildren(View p0){
       ReactViewGroup obj = PatchProxy.applyOneRefs(p0, this, ReactViewGroup.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mAllChildrenCount;
       ReactViewGroup tmAllChildre = this.mAllChildren;
       a.c(tmAllChildre);
       int i = 0;
       while (true) {
          if (i >= obj) {
             return -1;
          }
          if (tmAllChildre[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactViewGroup.class, "21")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.mRemoveClippedSubviews != null) {
          this.updateClippingRect();
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       ReactViewGroup obj = PatchProxy.applyOneRefs(p0, this, ReactViewGroup.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mOnInterceptTouchEventListener;
       if (obj != null && obj.a(this, p0)) {
          return true;
       }
       obj = this.mPointerEvents;
       if (obj == PointerEvents.NONE || obj == PointerEvents.BOX_ONLY) {
          return true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactViewGroup.class, "1")) {
          return;
       }
       k.a(p0, p1);
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       return;
    }
    public void onRtlPropertiesChanged(int p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "2")) {
          return;
       }
       ReactViewGroup tmReactBackg = this.mReactBackgroundDrawable;
       if (tmReactBackg != null) {
          tmReactBackg.u(this.mLayoutDirection);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactViewGroup.class, "20")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.mRemoveClippedSubviews != null) {
          this.updateClippingRect();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       ReactViewGroup tmPointerEve = this.mPointerEvents;
       if (tmPointerEve == PointerEvents.NONE || tmPointerEve == PointerEvents.BOX_NONE) {
          return false;
       }
       return true;
    }
    public void removeAllViewsWithSubviewClippingEnabled(){
       if (PatchProxy.applyVoid(null, this, ReactViewGroup.class, "32")) {
          return;
       }
       a.a(this.mRemoveClippedSubviews);
       a.c(this.mAllChildren);
       for (int i = 0; i < this.mAllChildrenCount; i = i + 1) {
          this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
       }
       this.removeAllViewsInLayout();
       this.mAllChildrenCount = 0;
       return;
    }
    public final void removeFromArray(int p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "35")) {
          return;
       }
       ReactViewGroup tmAllChildre = this.mAllChildren;
       a.c(tmAllChildre);
       ReactViewGroup tmAllChildre1 = this.mAllChildrenCount;
       if (p0 == (tmAllChildre1 - 1)) {
          int i = tmAllChildre1 - 1;
          this.mAllChildrenCount = i;
          tmAllChildre[i] = null;
       }else if(p0 >= 0 && p0 < tmAllChildre1){
          System.arraycopy(tmAllChildre, (p0 + 1), tmAllChildre, p0, ((tmAllChildre1 - p0) - 1));
          p0 = this.mAllChildrenCount - 1;
          this.mAllChildrenCount = p0;
          tmAllChildre[p0] = null;
       }else {
          throw new IndexOutOfBoundsException();
       }
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "23")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.mDrawingOrderHelper.c(p0);
       this.setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
       super.removeView(p0);
       return;
    }
    public void removeViewAt(int p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "24")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.mDrawingOrderHelper.c(this.getChildAt(p0));
       this.setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
       super.removeViewAt(p0);
       return;
    }
    public void removeViewWithSubviewClippingEnabled(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "31")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a.a(this.mRemoveClippedSubviews);
       a.c(this.mClippingRect);
       a.c(this.mAllChildren);
       p0.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
       int i = this.indexOfChildInAllChildren(p0);
       if (this.mAllChildren[i].getParent() != null) {
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             if (this.mAllChildren[i1].getParent() == null) {
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          super.removeViewsInLayout((i - i2), 1);
       }
       this.removeFromArray(i);
       return;
    }
    public void requestLayout(){
    }
    public void setBackfaceVisibility(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "43")) {
          return;
       }
       this.mBackfaceVisibility = p0;
       this.setBackfaceVisibilityDependantOpacity();
       return;
    }
    public void setBackfaceVisibilityDependantOpacity(){
       if (PatchProxy.applyVoid(null, this, ReactViewGroup.class, "44")) {
          return;
       }
       if ((this.mBackfaceVisibility).equals("visible")) {
          this.setAlpha(this.mBackfaceOpacity);
          return;
       }else {
          float rotationX = this.getRotationX();
          float rotationY = this.getRotationY();
          ReactViewGroup reactViewGro = (rotationX - 0xc2b40000 >= 0 && (rotationX - 0x42b40000 < 0 && (rotationY - 0xc2b40000 >= 0 && rotationY - 0x42b40000 < 0)))? 1: null;
          if (reactViewGro) {
             this.setAlpha(this.mBackfaceOpacity);
             return;
          }else {
             this.setAlpha(0);
             return;
          }
       }
    }
    public void setBackground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "5")) {
          return;
       }
       throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewGroup.class, "4")) {
          return;
       }
       if (p0 || this.mReactBackgroundDrawable != null) {
          this.getOrCreateReactViewBackground().r(p0);
       }
       return;
    }
    public void setBorderColor(int p0,float p1,float p2){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, ReactViewGroup.class, "9")) {
          return;
       }
       this.getOrCreateReactViewBackground().o(p0, p1, p2);
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactViewGroup.class, "10")) {
          return;
       }
       this.getOrCreateReactViewBackground().s(p0);
       return;
    }
    public void setBorderRadius(float p0,int p1){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, ReactViewGroup.class, "11")) {
          return;
       }
       this.getOrCreateReactViewBackground().t(p0, p1);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "12")) {
          return;
       }
       this.getOrCreateReactViewBackground().p(p0);
       return;
    }
    public void setBorderWidth(int p0,float p1){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ReactViewGroup.class, "8")) {
          return;
       }
       this.getOrCreateReactViewBackground().q(p0, p1);
       return;
    }
    public void setHitSlopRect(Rect p0){
       this.mHitSlopRect = p0;
    }
    public void setNeedsOffscreenAlphaCompositing(boolean p0){
       this.mNeedsOffscreenAlphaCompositing = p0;
    }
    public void setOnInterceptTouchEventListener(b p0){
       this.mOnInterceptTouchEventListener = p0;
    }
    public void setOpacityIfPossible(float p0){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactViewGroup.class, "42")) {
          return;
       }
       this.mBackfaceOpacity = p0;
       this.setBackfaceVisibilityDependantOpacity();
       return;
    }
    public void setOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "38")) {
          return;
       }
       this.mOverflow = p0;
       this.invalidate();
       return;
    }
    public void setPointerEvents(PointerEvents p0){
       this.mPointerEvents = p0;
    }
    public void setRemoveClippedSubviews(boolean p0){
       int childCount;
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactViewGroup.class, "13")) {
          return;
       }
       if (p0 == this.mRemoveClippedSubviews) {
          return;
       }
       this.mRemoveClippedSubviews = p0;
       int i = 0;
       if (p0) {
          Rect rect = new Rect();
          this.mClippingRect = rect;
          r.a(this, rect);
          childCount = this.getChildCount();
          this.mAllChildrenCount = childCount;
          View[] viewArray = new View[Math.max(12, childCount)];
          this.mAllChildren = viewArray;
          this.mChildrenLayoutChangeListener = new ReactViewGroup$a(this);
          for (; i < this.mAllChildrenCount; i = i + 1) {
             View childAt = this.getChildAt(i);
             this.mAllChildren[i] = childAt;
             childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
          }
          this.updateClippingRect();
       }else {
          a.c(this.mClippingRect);
          a.c(this.mAllChildren);
          a.c(this.mChildrenLayoutChangeListener);
          for (childCount = 0; childCount < this.mAllChildrenCount; childCount++) {
             this.mAllChildren[childCount].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
          }
          this.getDrawingRect(this.mClippingRect);
          this.updateClippingToRect(this.mClippingRect);
          this.mAllChildren = null;
          this.mClippingRect = null;
          this.mAllChildrenCount = i;
          this.mChildrenLayoutChangeListener = null;
       }
       return;
    }
    public void setTranslucentBackgroundDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "6")) {
          return;
       }
       this.updateBackgroundDrawable(null);
       if (this.mReactBackgroundDrawable != null && p0 != null) {
          Drawable[] uDrawableArr = new Drawable[]{this.mReactBackgroundDrawable,p0};
          this.updateBackgroundDrawable(new LayerDrawable(uDrawableArr));
       }else if(p0 != null){
          this.updateBackgroundDrawable(p0);
       }
       return;
    }
    public final void updateBackgroundDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "39")) {
          return;
       }
       super.setBackground(p0);
       return;
    }
    public void updateClippingRect(){
       if (PatchProxy.applyVoid(null, this, ReactViewGroup.class, "15")) {
          return;
       }
       if (this.mRemoveClippedSubviews == null) {
          return;
       }
       a.c(this.mClippingRect);
       a.c(this.mAllChildren);
       r.a(this, this.mClippingRect);
       this.updateClippingToRect(this.mClippingRect);
       return;
    }
    public final void updateClippingToRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "16")) {
          return;
       }
       a.c(this.mAllChildren);
       int i = 0;
       int i1 = 0;
       while (i < this.mAllChildrenCount) {
          this.updateSubviewClipStatus(p0, i, i1);
          if (this.mAllChildren[i].getParent() == null) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return;
    }
    public void updateDrawingOrder(){
       if (PatchProxy.applyVoid(null, this, ReactViewGroup.class, "27")) {
          return;
       }
       this.mDrawingOrderHelper.e();
       this.setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
       this.invalidate();
       return;
    }
    public final void updateSubviewClipStatus(Rect p0,int p1,int p2){
       if (PatchProxy.isSupport(ReactViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ReactViewGroup.class, "17")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       ReactViewGroup tmAllChildre = this.mAllChildren;
       a.c(tmAllChildre);
       object oobject = tmAllChildre[p1];
       Rect sHelperRect = ReactViewGroup.sHelperRect;
       sHelperRect.set(oobject.getLeft(), oobject.getTop(), oobject.getRight(), oobject.getBottom());
       boolean b = p0.intersects(sHelperRect.left, sHelperRect.top, sHelperRect.right, sHelperRect.bottom);
       Animation animation = oobject.getAnimation();
       int i = 0;
       ViewParent viewParent = (animation != null && !animation.hasEnded())? 1: null;
       if (!b && (oobject.getParent() != null && !viewParent)) {
          super.removeViewsInLayout((p1 - p2), 1);
       }else if(b && oobject.getParent() == null){
          super.addViewInLayout(oobject, (p1 - p2), ReactViewGroup.sDefaultLayoutParam, 1);
          this.invalidate();
       }else if(b){
       label_007f :
          if (i && (oobject instanceof q && oobject.getRemoveClippedSubviews())) {
             oobject.updateClippingRect();
          }
       label_0090 :
          return;
       }
       i = 1;
       goto label_007f ;
    }
    public void updateSubviewClipStatus(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewGroup.class, "18")) {
          return;
       }
       if (this.mRemoveClippedSubviews != null && this.getParent() != null) {
          a.c(this.mClippingRect);
          a.c(this.mAllChildren);
          Rect sHelperRect = ReactViewGroup.sHelperRect;
          sHelperRect.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
          int b = this.mClippingRect.intersects(sHelperRect.left, sHelperRect.top, sHelperRect.right, sHelperRect.bottom);
          int i = 0;
          ReactViewGroup reactViewGro = (p0.getParent() != null)? 1: null;
          if (b != reactViewGro) {
             b = 0;
             while (i < this.mAllChildrenCount) {
                reactViewGro = this.mAllChildren;
                if (reactViewGro[i] == p0) {
                   this.updateSubviewClipStatus(this.mClippingRect, i, b);
                   break ;
                }else if(reactViewGro[i].getParent() == null){
                   b = b + 1;
                }
                i = i + 1;
             }
          }
       }
       return;
    }
}
