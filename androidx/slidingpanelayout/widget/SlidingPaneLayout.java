package androidx.slidingpanelayout.widget.SlidingPaneLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.util.ArrayList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$a;
import android.view.View;
import a2.a;
import a2.i0;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$c;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.customview.widget.ViewDragHelper;
import android.view.ViewGroup$LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.ColorFilter;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$b;
import java.lang.Object;
import java.lang.Runnable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import java.lang.IllegalStateException;
import java.lang.String;
import android.os.Parcelable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.core.content.ContextCompat;

public class SlidingPaneLayout extends ViewGroup	// class@000994
{
    public boolean mCanSlide;
    public int mCoveredFadeColor;
    public boolean mDisplayListReflectionLoaded;
    public final ViewDragHelper mDragHelper;
    public boolean mFirstLayout;
    public Method mGetDisplayList;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public boolean mIsUnableToDrag;
    public final int mOverhangSize;
    public SlidingPaneLayout$d mPanelSlideListener;
    public int mParallaxBy;
    public float mParallaxOffset;
    public final ArrayList mPostedRunnables;
    public boolean mPreservedOpenState;
    public Field mRecreateDisplayList;
    public Drawable mShadowDrawableLeft;
    public Drawable mShadowDrawableRight;
    public float mSlideOffset;
    public int mSlideRange;
    public View mSlideableView;
    public int mSliderFadeColor;
    public final Rect mTmpRect;

    public void SlidingPaneLayout(Context p0){
       super(p0, null);
    }
    public void SlidingPaneLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlidingPaneLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mSliderFadeColor = -858993460;
       this.mFirstLayout = true;
       this.mTmpRect = new Rect();
       this.mPostedRunnables = new ArrayList();
       DisplayMetrics density = c.c(p0.getResources()).density;
       this.mOverhangSize = (int)((32.00f * density) + 0x3f000000);
       this.setWillNotDraw(false);
       i0.s0(this, new SlidingPaneLayout$a(this));
       i0.D0(this, true);
       ViewDragHelper viewDragHelp = ViewDragHelper.create(this, 0x3f000000, new SlidingPaneLayout$c(this));
       this.mDragHelper = viewDragHelp;
       viewDragHelp.setMinVelocity((density * 400.00f));
    }
    public static boolean viewIsOpaque(View p0){
       if (p0.isOpaque()) {
          return true;
       }
       return false;
    }
    public boolean canScroll(View p0,boolean p1,int p2,int p3,int p4){
       int i = p0;
       int i1 = 1;
       if (i instanceof ViewGroup) {
          ViewGroup viewGroup = i;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i2 = viewGroup.getChildCount() - i1;
          while (true) {
             if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                int i3 = p3 + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                   int i4 = p4 + scrollY;
                   if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                      int i5 = i3 - childAt.getLeft();
                      int i6 = i4 - childAt.getTop();
                      if (this.canScroll(childAt, 1, p2, i5, i6)) {
                         return i1;
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
          return i1;
       }
       if (p1) {
          int i7 = (this.isLayoutRtlSupport())? p2: - p2;
          if (p0.canScrollHorizontally(i7)) {
             goto label_0066 ;
          }
       }
       i1 = false;
       goto label_0066 ;
    }
    public boolean canSlide(){
       return this.mCanSlide;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof SlidingPaneLayout$LayoutParams && super.checkLayoutParams(p0))? true: false;
       return b;
    }
    public boolean closePane(){
       return this.closePane(this.mSlideableView, 0);
    }
    public final boolean closePane(View p0,int p1){
       if (this.mFirstLayout == null && !this.smoothSlideTo(0, p1)) {
          return false;
       }
       this.mPreservedOpenState = false;
       return true;
    }
    public void computeScroll(){
       if (this.mDragHelper.continueSettling(true)) {
          if (this.mCanSlide == null) {
             this.mDragHelper.abort();
             return;
          }else {
             i0.j0(this);
          }
       }
       return;
    }
    public final void dimChildView(View p0,float p1,int p2){
       SlidingPaneLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (p1 > 0 && p2) {
          int i = ((int)((float)((0xff000000 & p2) >> 24) * p1) << 24) | (p2 & 0xffffff);
          if (layoutParams.d == null) {
             layoutParams.d = new Paint();
          }
          layoutParams.d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff$Mode.SRC_OVER));
          if (p0.getLayerType() != 2) {
             p0.setLayerType(2, layoutParams.d);
          }
          this.invalidateChildRegion(p0);
       }else if(p0.getLayerType()){
          SlidingPaneLayout$LayoutParams d = layoutParams.d;
          if (d != null) {
             d.setColorFilter(null);
          }
          SlidingPaneLayout$b uob = new SlidingPaneLayout$b(this, p0);
          this.mPostedRunnables.add(uob);
          i0.k0(this, uob);
       }
       return;
    }
    public void dispatchOnPanelClosed(View p0){
       SlidingPaneLayout tmPanelSlide = this.mPanelSlideListener;
       if (tmPanelSlide != null) {
          tmPanelSlide.a(p0);
       }
       this.sendAccessibilityEvent(32);
       return;
    }
    public void dispatchOnPanelOpened(View p0){
       SlidingPaneLayout tmPanelSlide = this.mPanelSlideListener;
       if (tmPanelSlide != null) {
          tmPanelSlide.c(p0);
       }
       this.sendAccessibilityEvent(32);
       return;
    }
    public void dispatchOnPanelSlide(View p0){
       SlidingPaneLayout tmPanelSlide = this.mPanelSlideListener;
       if (tmPanelSlide != null) {
          tmPanelSlide.b(p0, this.mSlideOffset);
       }
       return;
    }
    public void draw(Canvas p0){
       int right;
       super.draw(p0);
       SlidingPaneLayout tmShadowDraw = (this.isLayoutRtlSupport())? this.mShadowDrawableRight: this.mShadowDrawableLeft;
       int i = 1;
       View childAt = (this.getChildCount() > i)? this.getChildAt(i): null;
       if (childAt != null && tmShadowDraw != null) {
          i = childAt.getTop();
          int bottom = childAt.getBottom();
          int intrinsicWid = tmShadowDraw.getIntrinsicWidth();
          if (this.isLayoutRtlSupport()) {
             right = childAt.getRight();
             intrinsicWid = intrinsicWid + right;
          }else {
             right = childAt.getLeft();
             intrinsicWid = right;
             right = right - intrinsicWid;
          }
          tmShadowDraw.setBounds(right, i, intrinsicWid, bottom);
          tmShadowDraw.draw(p0);
       }
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       SlidingPaneLayout tmTmpRect;
       SlidingPaneLayout$LayoutParams layoutParams = p1.getLayoutParams();
       int i = p0.save();
       if (this.mCanSlide != null && (layoutParams.b == null && this.mSlideableView != null)) {
          p0.getClipBounds(this.mTmpRect);
          if (this.isLayoutRtlSupport()) {
             tmTmpRect = this.mTmpRect;
             tmTmpRect.left = Math.max(tmTmpRect.left, this.mSlideableView.getRight());
          }else {
             tmTmpRect = this.mTmpRect;
             tmTmpRect.right = Math.min(tmTmpRect.right, this.mSlideableView.getLeft());
          }
          p0.clipRect(this.mTmpRect);
       }
    label_0047 :
       p0.restoreToCount(i);
       return super.drawChild(p0, p1, p2);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new SlidingPaneLayout$LayoutParams();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new SlidingPaneLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       SlidingPaneLayout$LayoutParams layoutParams = (p0 instanceof ViewGroup$MarginLayoutParams)? new SlidingPaneLayout$LayoutParams(p0): new SlidingPaneLayout$LayoutParams(p0);
       return layoutParams;
    }
    public int getCoveredFadeColor(){
       return this.mCoveredFadeColor;
    }
    public int getParallaxDistance(){
       return this.mParallaxBy;
    }
    public int getSliderFadeColor(){
       return this.mSliderFadeColor;
    }
    public void invalidateChildRegion(View p0){
       i0.F0(p0, p0.getLayoutParams().d);
    }
    public boolean isDimmed(View p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       SlidingPaneLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (this.mCanSlide != null && (layoutParams.c != null && this.mSlideOffset > 0)) {
          b = true;
       }
    label_001a :
       return b;
    }
    public boolean isLayoutRtlSupport(){
       boolean b = true;
       if (i0.B(this) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isOpen(){
       boolean b = (this.mCanSlide == null || !this.mSlideOffset - 0x3f800000)? true: false;
       return b;
    }
    public boolean isSlideable(){
       return this.mCanSlide;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.mFirstLayout = true;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.mFirstLayout = true;
       int i = this.mPostedRunnables.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mPostedRunnables.get(i1).run();
       }
       this.mPostedRunnables.clear();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       float f;
       float f1;
       int actionMasked = p0.getActionMasked();
       int i = 1;
       if (this.mCanSlide == null && (!actionMasked && this.getChildCount() > i)) {
          View childAt = this.getChildAt(i);
          if (childAt != null) {
             this.mPreservedOpenState = this.mDragHelper.isViewUnder(childAt, (int)p0.getX(), (int)p0.getY()) ^ i;
          }
       }
       if (this.mCanSlide == null || (this.mIsUnableToDrag != null && actionMasked)) {
          this.mDragHelper.cancel();
          return super.onInterceptTouchEvent(p0);
       }else if(actionMasked == 0.00f || actionMasked == i){
          this.mDragHelper.cancel();
          return false;
       }else if(actionMasked){
          if (actionMasked == 2) {
             f = Math.abs((p0.getX() - this.mInitialMotionX));
             f1 = Math.abs((p0.getY() - this.mInitialMotionY));
             if (f - (float)this.mDragHelper.getTouchSlop() > 0 && f1 - f > 0) {
                this.mDragHelper.cancel();
                this.mIsUnableToDrag = i;
                return false;
             }
          }
       }else {
          this.mIsUnableToDrag = false;
          f = p0.getX();
          f1 = p0.getY();
          this.mInitialMotionX = f;
          this.mInitialMotionY = f1;
          if (this.mDragHelper.isViewUnder(this.mSlideableView, (int)f, (int)f1) && this.isDimmed(this.mSlideableView)) {
             f = 1;
          label_0095 :
             if (!this.mDragHelper.shouldInterceptTouchEvent(p0) && !actionMasked) {
                i = false;
             }
             return i;
          }
       }
       actionMasked = 0;
       goto label_0095 ;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       float f;
       int i3;
       int i4;
       boolean i5;
       int i6;
       SlidingPaneLayout slidingPaneL = this;
       int b = this.isLayoutRtlSupport();
       SlidingPaneLayout$LayoutParams layoutParams = 1;
       if (b) {
          slidingPaneL.mDragHelper.setEdgeTrackingEnabled(2);
       }else {
          slidingPaneL.mDragHelper.setEdgeTrackingEnabled(layoutParams);
       }
       int i = p3 - p1;
       int paddingRight = (b)? this.getPaddingRight(): this.getPaddingLeft();
       int paddingLeft = (b)? this.getPaddingLeft(): this.getPaddingRight();
       int paddingTop = this.getPaddingTop();
       int childCount = this.getChildCount();
       if (slidingPaneL.mFirstLayout != null) {
          f = (slidingPaneL.mCanSlide != null && slidingPaneL.mPreservedOpenState != null)? 0x3f800000: 0;
          slidingPaneL.mSlideOffset = f;
       }
       int i1 = paddingRight;
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = slidingPaneL.getChildAt(i2);
          if (childAt.getVisibility() == 8) {
             i3 = 0x3f800000;
          }else {
             SlidingPaneLayout$LayoutParams layoutParams1 = childAt.getLayoutParams();
             int measuredWidt = childAt.getMeasuredWidth();
             if (layoutParams1.b != null) {
                i4 = layoutParams1.leftMargin + layoutParams1.rightMargin;
                i5 = i - paddingLeft;
                i6 = i5 - slidingPaneL.mOverhangSize;
                i6 = Math.min(paddingRight, i6) - i1;
                i6 = i6 - i4;
                slidingPaneL.mSlideRange = i6;
                ViewGroup$MarginLayoutParams rightMargin = (b)? layoutParams1.rightMargin: layoutParams1.leftMargin;
                int i7 = i1 + rightMargin;
                i7 = i7 + i6;
                int i8 = measuredWidt / 2;
                i3 = i7 + i8;
                i5 = (i3 > i5)? true: false;
                layoutParams1.c = i5;
                f = (float)i6 * slidingPaneL.mSlideOffset;
                i5 = (int)f;
                i4 = rightMargin + i5;
                i1 = i1 + i4;
                float f1 = (float)i5;
                f1 = f1 / (float)i6;
                slidingPaneL.mSlideOffset = f1;
                i4 = 0;
                i3 = 0x3f800000;
             }else if(slidingPaneL.mCanSlide != null){
                SlidingPaneLayout mParallaxBy = slidingPaneL.mParallaxBy;
                if (mParallaxBy != null) {
                   f = 0x3f800000 - slidingPaneL.mSlideOffset;
                   f = f * (float)mParallaxBy;
                   i4 = (int)f;
                   i1 = paddingRight;
                }
             }
             i1 = paddingRight;
             i4 = 0;
             if (b) {
                i5 = i - i1;
                i5 = i5 + i4;
                i4 = i5 - measuredWidt;
             }else {
                i4 = i1 - i4;
                i5 = i4 + measuredWidt;
             }
             i6 = childAt.getMeasuredHeight() + paddingTop;
             childAt.layout(i4, paddingTop, i5, i6);
             paddingRight = paddingRight + childAt.getWidth();
          }
          i2 = i2 + 1;
          layoutParams = 1;
       }
       if (slidingPaneL.mFirstLayout != null) {
          if (slidingPaneL.mCanSlide != null) {
             if (slidingPaneL.mParallaxBy != null) {
                slidingPaneL.parallaxOtherViews(slidingPaneL.mSlideOffset);
             }
             if (slidingPaneL.mSlideableView.getLayoutParams().c != null) {
                slidingPaneL.dimChildView(slidingPaneL.mSlideableView, slidingPaneL.mSlideOffset, slidingPaneL.mSliderFadeColor);
             }
          }else {
             for (b = 0; b < childCount; b = b + 1) {
                slidingPaneL.dimChildView(slidingPaneL.getChildAt(b), 0, slidingPaneL.mSliderFadeColor);
             }
          }
          slidingPaneL.updateObscuredViewsVisibility(slidingPaneL.mSlideableView);
       }
       slidingPaneL.mFirstLayout = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       int i1;
       float f1;
       int i8;
       int i9;
       ViewGroup viewGroup = this;
       int mode = View$MeasureSpec.getMode(p0);
       int size = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int size1 = View$MeasureSpec.getSize(p1);
       View view = Integer.MIN_VALUE;
       int i = 0x40000000;
       if (mode != i) {
          if (this.isInEditMode()) {
             if (mode != view && !mode) {
                size = 300;
             }
          }else {
             throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
          }
       }else if(!mode1){
          if (this.isInEditMode()) {
             if (!mode1) {
                mode1 = Integer.MIN_VALUE;
                size1 = 300;
             }
          }else {
             throw new IllegalStateException("Height must not be UNSPECIFIED");
          }
       }
       mode = false;
       if (mode1 != view) {
          if (mode1 != i) {
             size1 = 0;
             i1 = 0;
          }else {
             size1 = (size1 - this.getPaddingTop()) - this.getPaddingBottom();
             i1 = size1;
          }
       }else {
          i1 = (size1 - this.getPaddingTop()) - this.getPaddingBottom();
          size1 = 0;
       }
       int i2 = (size - this.getPaddingLeft()) - this.getPaddingRight();
       int childCount = this.getChildCount();
       viewGroup.mSlideableView = null;
       int i3 = i2;
       int i4 = 0;
       int i5 = 0;
       float f = 0;
       SlidingPaneLayout slidingPaneL = 8;
       while (i4 < childCount) {
          view = viewGroup.getChildAt(i4);
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (view.getVisibility() == slidingPaneL) {
             layoutParams.c = mode;
          }else {
             SlidingPaneLayout$LayoutParams a = layoutParams.a;
             if (a - null > 0) {
                f = f + a;
                if (layoutParams.width != null) {
                }
             }else {
             }
          }
          i4 = i4 + 1;
          mode = false;
          layoutParams = 0x40000000;
       }
       if (i5 || f - null > 0) {
          mode = i2 - viewGroup.mOverhangSize;
          mode1 = 0;
          while (mode1 < childCount) {
             view = viewGroup.getChildAt(mode1);
             if (view.getVisibility() != slidingPaneL) {
                SlidingPaneLayout$LayoutParams layoutParams1 = view.getLayoutParams();
                if (view.getVisibility() != slidingPaneL) {
                   int i6 = (layoutParams1.width == null && layoutParams1.a > 0)? 1: 0;
                   SlidingPaneLayout$LayoutParams layoutParams2 = (i6)? null: view.getMeasuredWidth();
                   if (i5 && view != viewGroup.mSlideableView) {
                      if (layoutParams1.width < null && (layoutParams2 > mode || layoutParams1.a > 0)) {
                         if (i6) {
                            ViewGroup$MarginLayoutParams height1 = layoutParams1.height;
                            if (height1 == -2) {
                               i = View$MeasureSpec.makeMeasureSpec(i1, Integer.MIN_VALUE);
                               i6 = 0x40000000;
                            }else if(height1 == -1){
                               i6 = 0x40000000;
                               i = View$MeasureSpec.makeMeasureSpec(i1, i6);
                            }else {
                               i6 = 0x40000000;
                               i = View$MeasureSpec.makeMeasureSpec(height1, i6);
                            }
                         }else {
                            i6 = 0x40000000;
                            i = View$MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), i6);
                         }
                         view.measure(View$MeasureSpec.makeMeasureSpec(mode, i6), i);
                      }
                   }else if(layoutParams1.a > 0){
                      if (layoutParams1.width == null) {
                         ViewGroup$MarginLayoutParams height = layoutParams1.height;
                         if (height == -2) {
                            i6 = View$MeasureSpec.makeMeasureSpec(i1, Integer.MIN_VALUE);
                            ViewGroup$MarginLayoutParams width = 0x40000000;
                         }else if(height == -1){
                            i6 = View$MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                         }else {
                            i6 = View$MeasureSpec.makeMeasureSpec(height, 0x40000000);
                         }
                      }else {
                         i6 = View$MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
                      }
                      if (i5) {
                         int i7 = layoutParams1.leftMargin + layoutParams1.rightMargin;
                         i = i2 - i7;
                         i9 = mode;
                         mode = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
                         if (layoutParams2 != i) {
                            view.measure(mode, i6);
                         label_0137 :
                            i = 0x40000000;
                         label_0209 :
                            mode1 = mode1 + 1;
                            mode = i9;
                            slidingPaneL = 8;
                         }else {
                            goto label_0137 ;
                         }
                      }else {
                         i9 = mode;
                         float f2 = layoutParams1.a * (float)Math.max(0, i3);
                         f2 = f2 / f;
                         i4 = layoutParams2 + (int)f2;
                         view.measure(View$MeasureSpec.makeMeasureSpec(i4, 0x40000000), i6);
                         goto label_0209 ;
                      }
                   }
                }
             }
          label_0135 :
             i9 = mode;
             goto label_0137 ;
          }
       }
       viewGroup.setMeasuredDimension(size, ((size1 + this.getPaddingTop()) + this.getPaddingBottom()));
       viewGroup.mCanSlide = i5;
       if (viewGroup.mDragHelper.getViewDragState() && !i5) {
          viewGroup.mDragHelper.abort();
       }
       return;
    }
    public void onPanelDragged(int p0){
       if (this.mSlideableView == null) {
          this.mSlideOffset = 0;
          return;
       }else {
          boolean b = this.isLayoutRtlSupport();
          SlidingPaneLayout$LayoutParams layoutParams = this.mSlideableView.getLayoutParams();
          int width = this.mSlideableView.getWidth();
          if (b) {
             p0 = (this.getWidth() - p0) - width;
          }
          width = (b)? this.getPaddingRight(): this.getPaddingLeft();
          ViewGroup$MarginLayoutParams rightMargin = (b)? layoutParams.rightMargin: layoutParams.leftMargin;
          float f = (float)(p0 - (width + rightMargin)) / (float)this.mSlideRange;
          this.mSlideOffset = f;
          if (this.mParallaxBy != null) {
             this.parallaxOtherViews(f);
          }
          if (layoutParams.c != null) {
             this.dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
          }
          this.dispatchOnPanelSlide(this.mSlideableView);
          return;
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof SlidingPaneLayout$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          if (p0.d != null) {
             this.openPane();
          }else {
             this.closePane();
          }
          this.mPreservedOpenState = p0.d;
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       SlidingPaneLayout$SavedState savedState = new SlidingPaneLayout$SavedState(super.onSaveInstanceState());
       boolean b = (this.isSlideable())? this.isOpen(): this.mPreservedOpenState;
       savedState.d = b;
       return savedState;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 != p2) {
          this.mFirstLayout = true;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (this.mCanSlide == null) {
          return super.onTouchEvent(p0);
       }
       this.mDragHelper.processTouchEvent(p0);
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked == 1 && this.isDimmed(this.mSlideableView)) {
             float x = p0.getX();
             float y = p0.getY();
             if ((((x - this.mInitialMotionX) * (x - this.mInitialMotionX)) + ((y - this.mInitialMotionY) * (y - this.mInitialMotionY))) - (float)(this.mDragHelper.getTouchSlop() * this.mDragHelper.getTouchSlop()) < 0 && this.mDragHelper.isViewUnder(this.mSlideableView, (int)x, (int)y)) {
                this.closePane(this.mSlideableView, 0);
             }
          }
       }else {
          this.mInitialMotionX = p0.getX();
          this.mInitialMotionY = p0.getY();
       }
       return true;
    }
    public boolean openPane(){
       return this.openPane(this.mSlideableView, 0);
    }
    public final boolean openPane(View p0,int p1){
       if (this.mFirstLayout == null && !this.smoothSlideTo(0x3f800000, p1)) {
          return false;
       }
       this.mPreservedOpenState = true;
       return true;
    }
    public final void parallaxOtherViews(float p0){
       ViewGroup$MarginLayoutParams rightMargin;
       boolean b = this.isLayoutRtlSupport();
       SlidingPaneLayout$LayoutParams layoutParams = this.mSlideableView.getLayoutParams();
       int i = 0;
       if (layoutParams.c != null) {
          rightMargin = (b)? layoutParams.rightMargin: layoutParams.leftMargin;
          if (rightMargin <= null) {
             rightMargin = 1;
          label_001d :
             int childCount = this.getChildCount();
             while (i < childCount) {
                View childAt = this.getChildAt(i);
                if (childAt != this.mSlideableView) {
                   float f = 0x3f800000;
                   float f1 = f - this.mParallaxOffset;
                   SlidingPaneLayout tmParallaxBy = this.mParallaxBy;
                   f1 = f1 * (float)tmParallaxBy;
                   this.mParallaxOffset = p0;
                   float f2 = f - p0;
                   f2 = f2 * (float)tmParallaxBy;
                   int i1 = (int)f1 - (int)f2;
                   if (b) {
                      i1 = - i1;
                   }
                   childAt.offsetLeftAndRight(i1);
                   if (rightMargin) {
                      SlidingPaneLayout tmParallaxOf = this.mParallaxOffset;
                      f1 = (b)? tmParallaxOf - f: f - tmParallaxOf;
                      this.dimChildView(childAt, f1, this.mCoveredFadeColor);
                   }
                }
                i = i + 1;
             }
             return;
          }
       }
       rightMargin = 0;
       goto label_001d ;
    }
    public void requestChildFocus(View p0,View p1){
       super.requestChildFocus(p0, p1);
       if (!this.isInTouchMode() && this.mCanSlide == null) {
          boolean b = (p0 == this.mSlideableView)? true: false;
          this.mPreservedOpenState = b;
       }
       return;
    }
    public void setAllChildrenVisible(){
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() == 4) {
             childAt.setVisibility(0);
          }
          i = i + 1;
       }
       return;
    }
    public void setCoveredFadeColor(int p0){
       this.mCoveredFadeColor = p0;
    }
    public void setPanelSlideListener(SlidingPaneLayout$d p0){
       this.mPanelSlideListener = p0;
    }
    public void setParallaxDistance(int p0){
       this.mParallaxBy = p0;
       this.requestLayout();
    }
    public void setShadowDrawable(Drawable p0){
       this.setShadowDrawableLeft(p0);
    }
    public void setShadowDrawableLeft(Drawable p0){
       this.mShadowDrawableLeft = p0;
    }
    public void setShadowDrawableRight(Drawable p0){
       this.mShadowDrawableRight = p0;
    }
    public void setShadowResource(int p0){
       this.setShadowDrawable(this.getResources().getDrawable(p0));
    }
    public void setShadowResourceLeft(int p0){
       this.setShadowDrawableLeft(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setShadowResourceRight(int p0){
       this.setShadowDrawableRight(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setSliderFadeColor(int p0){
       this.mSliderFadeColor = p0;
    }
    public void smoothSlideClosed(){
       this.closePane();
    }
    public void smoothSlideOpen(){
       this.openPane();
    }
    public boolean smoothSlideTo(float p0,int p1){
       if (this.mCanSlide == null) {
          return false;
       }
       SlidingPaneLayout$LayoutParams layoutParams = this.mSlideableView.getLayoutParams();
       int i = (this.isLayoutRtlSupport())? (int)((float)this.getWidth() - (((float)(this.getPaddingRight() + layoutParams.rightMargin) + (p0 * (float)this.mSlideRange)) + (float)this.mSlideableView.getWidth())): (int)((float)(this.getPaddingLeft() + layoutParams.leftMargin) + (p0 * (float)this.mSlideRange));
       SlidingPaneLayout tmSlideableV = this.mSlideableView;
       if (this.mDragHelper.smoothSlideViewTo(tmSlideableV, i, tmSlideableV.getTop())) {
          this.setAllChildrenVisible();
          i0.j0(this);
          return true;
       }else {
          return false;
       }
    }
    public void updateObscuredViewsVisibility(View p0){
       int left;
       int right;
       int top;
       int bottom;
       boolean b1;
       int i4;
       int i = p0;
       int b = this.isLayoutRtlSupport();
       int i1 = (b)? this.getWidth() - this.getPaddingRight(): this.getPaddingLeft();
       int paddingLeft = (b)? this.getPaddingLeft(): this.getWidth() - this.getPaddingRight();
       int paddingTop = this.getPaddingTop();
       int i2 = this.getHeight() - this.getPaddingBottom();
       if (i && SlidingPaneLayout.viewIsOpaque(p0)) {
          left = p0.getLeft();
          right = p0.getRight();
          top = p0.getTop();
          bottom = p0.getBottom();
       }else {
          left = 0;
          right = 0;
          top = 0;
          bottom = 0;
       }
       int childCount = this.getChildCount();
       int i3 = 0;
       ViewGroup viewGroup = this;
       while (i3 < childCount) {
          View childAt = viewGroup.getChildAt(i3);
          if (childAt == i) {
             break ;
          }else if(childAt.getVisibility() == 8){
             b1 = b;
          }else if(b){
             i4 = paddingLeft;
          }else {
             i4 = i1;
          }
          i4 = Math.max(i4, childAt.getLeft());
          int i5 = Math.max(paddingTop, childAt.getTop());
          b1 = b;
          i = (b)? i1: paddingLeft;
          i = Math.min(i, childAt.getRight());
          b = Math.min(i2, childAt.getBottom());
          i = (i4 >= left && (i5 >= top && (i <= right && b <= bottom)))? 4: 0;
          childAt.setVisibility(i);
          i3 = i3 + 1;
          i = p0;
          b = b1;
       }
       return;
    }
}
