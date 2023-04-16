package com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$b;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.VelocityTracker;
import java.lang.Math;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import a2.i0;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import androidx.customview.widget.ViewDragHelper;
import android.content.res.Resources;
import cw9.c;
import androidx.customview.widget.ViewDragHelper$c;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior$d;
import java.lang.Runnable;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior$a;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class BottomSheetBehavior extends CoordinatorLayout$Behavior	// class@001657
{
    public int activePointerId;
    public BottomSheetBehavior$c callback;
    public int collapsedOffset;
    public final ViewDragHelper$c dragCallback;
    public boolean fitToContents;
    public int fitToContentsOffset;
    public int halfExpandedOffset;
    public boolean hideable;
    public boolean ignoreEvents;
    public Map importantForAccessibilityMap;
    public int initialY;
    public int lastNestedScrollDy;
    public int lastPeekHeight;
    public float maximumVelocity;
    public boolean nestedScrolled;
    public WeakReference nestedScrollingChildRef;
    public int parentHeight;
    public int peekHeight;
    public boolean peekHeightAuto;
    public int peekHeightMin;
    public boolean skipCollapsed;
    public int state;
    public boolean touchingScrollingChild;
    public VelocityTracker velocityTracker;
    public ViewDragHelper viewDragHelper;
    public WeakReference viewRef;

    public void BottomSheetBehavior(){
       super();
       this.fitToContents = true;
       this.state = 4;
       this.dragCallback = new BottomSheetBehavior$b(this);
    }
    public void BottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       boolean b = true;
       this.fitToContents = b;
       this.state = 4;
       this.dragCallback = new BottomSheetBehavior$b(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D);
       int i = 2;
       TypedValue typedValue = typedArray.peekValue(i);
       if (typedValue != null) {
          typedValue = typedValue.data;
          if (typedValue == -1) {
             this.setPeekHeight(typedValue);
          label_002d :
             this.setHideable(typedArray.getBoolean(b, false));
             this.setFitToContents(typedArray.getBoolean(false, b));
             this.setSkipCollapsed(typedArray.getBoolean(3, false));
             typedArray.recycle();
             this.maximumVelocity = (float)ViewConfiguration.get(p0).getScaledMaximumFlingVelocity();
             return;
          }
       }
       this.setPeekHeight(typedArray.getDimensionPixelSize(i, -1));
       goto label_002d ;
    }
    public static BottomSheetBehavior from(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof CoordinatorLayout$LayoutParams) {
          throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
       }
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       if (uBehavior instanceof BottomSheetBehavior) {
          return uBehavior;
       }
       throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    private float getYVelocity(){
       BottomSheetBehavior tvelocityTra = this.velocityTracker;
       if (tvelocityTra == null) {
          return 0;
       }
       tvelocityTra.computeCurrentVelocity(1000, this.maximumVelocity);
       return this.velocityTracker.getYVelocity(this.activePointerId);
    }
    public final void calculateCollapsedOffset(){
       this.collapsedOffset = (this.fitToContents != null)? Math.max((this.parentHeight - this.lastPeekHeight), this.fitToContentsOffset): this.parentHeight - this.lastPeekHeight;
       return;
    }
    public void dispatchOnSlide(int p0){
       View view = this.viewRef.get();
       if (view != null) {
          BottomSheetBehavior tcallback = this.callback;
          if (tcallback != null) {
             BottomSheetBehavior tcollapsedOf = this.collapsedOffset;
             if (p0 > tcollapsedOf) {
                tcallback.a(view, ((float)(tcollapsedOf - p0) / (float)(this.parentHeight - tcollapsedOf)));
             }else {
                tcallback.a(view, ((float)(tcollapsedOf - p0) / (float)(tcollapsedOf - this.getExpandedOffset())));
             }
          }
       }
       return;
    }
    public View findScrollingChild(View p0){
       if (i0.Z(p0)) {
          return p0;
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          int childCount = p0.getChildCount();
          while (i < childCount) {
             View view = this.findScrollingChild(p0.getChildAt(i));
             if (view != null) {
                return view;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public int getExpandedOffset(){
       BottomSheetBehavior tfitToConten = (this.fitToContents != null)? this.fitToContentsOffset: 0;
       return tfitToConten;
    }
    public final int getPeekHeight(){
       int i = (this.peekHeightAuto != null)? -1: this.peekHeight;
       return i;
    }
    public int getPeekHeightMin(){
       return this.peekHeightMin;
    }
    public boolean getSkipCollapsed(){
       return this.skipCollapsed;
    }
    public final int getState(){
       return this.state;
    }
    public boolean isFitToContents(){
       return this.fitToContents;
    }
    public boolean isHideable(){
       return this.hideable;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       BottomSheetBehavior tviewDragHel;
       boolean b = false;
       if (!p1.isShown()) {
          this.ignoreEvents = true;
          return b;
       }else {
          int actionMasked = p2.getActionMasked();
          if (!actionMasked) {
             this.reset();
          }
          if (this.velocityTracker == null) {
             this.velocityTracker = VelocityTracker.obtain();
          }
          this.velocityTracker.addMovement(p2);
          View view = null;
          int i = -1;
          if (actionMasked) {
             if (actionMasked == 1 || actionMasked == 3) {
                this.touchingScrollingChild = b;
                this.activePointerId = i;
                if (this.ignoreEvents != null) {
                   this.ignoreEvents = b;
                   return b;
                }
             }
          }else {
             int i1 = (int)p2.getX();
             this.initialY = (int)p2.getY();
             BottomSheetBehavior tnestedScrol = this.nestedScrollingChildRef;
             View view1 = (tnestedScrol != null)? tnestedScrol.get(): view;
             if (view1 != null && p0.C(view1, i1, this.initialY)) {
                this.activePointerId = p2.getPointerId(p2.getActionIndex());
                this.touchingScrollingChild = true;
             }
             boolean b1 = (this.activePointerId == i && !p0.C(p1, i1, this.initialY))? true: false;
             this.ignoreEvents = b1;
          }
          if (this.ignoreEvents == null) {
             tviewDragHel = this.viewDragHelper;
             if (tviewDragHel != null && tviewDragHel.shouldInterceptTouchEvent(p2)) {
                return true;
             }
          }
          tviewDragHel = this.nestedScrollingChildRef;
          if (tviewDragHel != null) {
             view = tviewDragHel.get();
          }
          if (actionMasked == 2 && (view != null && (this.ignoreEvents == null && (this.state != true && (!p0.C(view, (int)p2.getX(), (int)p2.getY()) && (this.viewDragHelper != null && Math.abs(((float)this.initialY - p2.getY())) - (float)this.viewDragHelper.getTouchSlop() > 0)))))) {
             b = true;
          }
       label_00ca :
          return b;
       }
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       if (i0.y(p0) && !i0.y(p1)) {
          p1.setFitsSystemWindows(true);
       }
       int top = p1.getTop();
       p0.J(p1, p2);
       this.parentHeight = p0.getHeight();
       if (this.peekHeightAuto != null) {
          if (this.peekHeightMin == null) {
             this.peekHeightMin = c.b(p0.getResources(), 0x7f0701a9);
          }
          this.lastPeekHeight = Math.max(this.peekHeightMin, (this.parentHeight - ((p0.getWidth() * 9) / 16)));
       }else {
          this.lastPeekHeight = this.peekHeight;
       }
       this.fitToContentsOffset = Math.max(0, (this.parentHeight - p1.getHeight()));
       this.halfExpandedOffset = this.parentHeight / 2;
       this.calculateCollapsedOffset();
       BottomSheetBehavior tstate = this.state;
       if (tstate == 3) {
          i0.e0(p1, this.getExpandedOffset());
       }else if(tstate == 6){
          i0.e0(p1, this.halfExpandedOffset);
       }else if(this.hideable != null && tstate == 5){
          i0.e0(p1, this.parentHeight);
       }else if(tstate == 4){
          i0.e0(p1, this.collapsedOffset);
       }else if(tstate == true || tstate == 2){
          i0.e0(p1, (top - p1.getTop()));
       }
       if (this.viewDragHelper == null) {
          this.viewDragHelper = ViewDragHelper.create(p0, this.dragCallback);
       }
       this.viewRef = new WeakReference(p1);
       this.nestedScrollingChildRef = new WeakReference(this.findScrollingChild(p1));
       return true;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       boolean b = (p2 == this.nestedScrollingChildRef.get() && (this.state != 3 || super.onNestedPreFling(p0, p1, p2, p3, p4)))? true: false;
       return b;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       if (p6 == 1) {
          return;
       }
       if (p2 != this.nestedScrollingChildRef.get()) {
          return;
       }
       p3 = p1.getTop();
       p6 = p3 - p4;
       if (p4 > 0) {
          if (p6 < this.getExpandedOffset()) {
             p5[1] = p3 - this.getExpandedOffset();
             i0.e0(p1, (- p5[1]));
             this.setStateInternal(3);
          }else {
             p5[1] = p4;
             i0.e0(p1, (- p4));
             this.setStateInternal(1);
          }
       }else if(p4 < 0 && !p2.canScrollVertically(-1)){
          BottomSheetBehavior tcollapsedOf = this.collapsedOffset;
          if (p6 <= tcollapsedOf || this.hideable != null) {
             p5[1] = p4;
             i0.e0(p1, (- p4));
             this.setStateInternal(1);
          }else {
             p5[1] = p3 - tcollapsedOf;
             i0.e0(p1, (- p5[1]));
             this.setStateInternal(4);
          }
       }
       this.dispatchOnSlide(p1.getTop());
       this.lastNestedScrollDy = p4;
       this.nestedScrolled = true;
       return;
    }
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
       super.onRestoreInstanceState(p0, p1, p2.a());
       BottomSheetBehavior$SavedState d = p2.d;
       this.state = (d == 1 || d == 2)? 4: d;
       return;
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       return new BottomSheetBehavior$SavedState(super.onSaveInstanceState(p0, p1), this.state);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       int i = 0;
       this.lastNestedScrollDy = i;
       this.nestedScrolled = i;
       if (p4 & 0x02) {
          i = true;
       }
       return i;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       int expandedOffs;
       int i = 3;
       if (p1.getTop() == this.getExpandedOffset()) {
          this.setStateInternal(i);
          return;
       }else if(p2 != this.nestedScrollingChildRef.get() || this.nestedScrolled == null){
          if (this.lastNestedScrollDy > null) {
             expandedOffs = this.getExpandedOffset();
          }else if(this.hideable != null && this.shouldHide(p1, this.getYVelocity())){
             expandedOffs = this.parentHeight;
             i = 5;
          }else if(this.lastNestedScrollDy == null){
             expandedOffs = p1.getTop();
             if (this.fitToContents != null) {
                if (Math.abs((expandedOffs - this.fitToContentsOffset)) < Math.abs((expandedOffs - this.collapsedOffset))) {
                   expandedOffs = this.fitToContentsOffset;
                }else {
                   expandedOffs = this.collapsedOffset;
                }
             }else {
                BottomSheetBehavior thalfExpande = this.halfExpandedOffset;
                if (expandedOffs < thalfExpande) {
                   if (expandedOffs < Math.abs((expandedOffs - this.collapsedOffset))) {
                      expandedOffs = 0;
                   }else {
                      expandedOffs = this.halfExpandedOffset;
                   }
                }else if(Math.abs((expandedOffs - thalfExpande)) < Math.abs((expandedOffs - this.collapsedOffset))){
                   expandedOffs = this.halfExpandedOffset;
                }else {
                   expandedOffs = this.collapsedOffset;
                }
                i = 6;
             }
          }else {
             expandedOffs = this.collapsedOffset;
          }
          i = 4;
          if (this.viewDragHelper.smoothSlideViewTo(p1, p1.getLeft(), expandedOffs)) {
             this.setStateInternal(2);
             i0.k0(p1, new BottomSheetBehavior$d(this, p1, i));
          }else {
             this.setStateInternal(i);
          }
          this.nestedScrolled = false;
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       if (!p1.isShown()) {
          return false;
       }
       int actionMasked = p2.getActionMasked();
       if (this.state == true && !actionMasked) {
          return true;
       }
       BottomSheetBehavior tviewDragHel = this.viewDragHelper;
       if (tviewDragHel != null) {
          tviewDragHel.processTouchEvent(p2);
       }
       if (!actionMasked) {
          this.reset();
       }
       if (this.velocityTracker == null) {
          this.velocityTracker = VelocityTracker.obtain();
       }
       this.velocityTracker.addMovement(p2);
       if (actionMasked == 0.00f && (this.ignoreEvents == null && Math.abs(((float)this.initialY - p2.getY())) - (float)this.viewDragHelper.getTouchSlop() > 0)) {
          this.viewDragHelper.captureChildView(p1, p2.getPointerId(p2.getActionIndex()));
       }
    label_005a :
       return (this.ignoreEvents ^ true);
    }
    public final void reset(){
       this.activePointerId = -1;
       BottomSheetBehavior tvelocityTra = this.velocityTracker;
       if (tvelocityTra != null) {
          tvelocityTra.recycle();
          this.velocityTracker = null;
       }
       return;
    }
    public void setBottomSheetCallback(BottomSheetBehavior$c p0){
       this.callback = p0;
    }
    public void setFitToContents(boolean p0){
       if (this.fitToContents == p0) {
          return;
       }
       this.fitToContents = p0;
       if (this.viewRef != null) {
          this.calculateCollapsedOffset();
       }
       int i = (this.fitToContents != null && this.state == 6)? 3: this.state;
       this.setStateInternal(i);
       return;
    }
    public void setHideable(boolean p0){
       this.hideable = p0;
    }
    public final void setPeekHeight(int p0){
       boolean b = true;
       boolean b1 = false;
       if (p0 == -1) {
          if (this.peekHeightAuto == null) {
             this.peekHeightAuto = b;
          }else {
          label_0015 :
             b = false;
          }
       }else if(this.peekHeightAuto != null || this.peekHeight != p0){
          this.peekHeightAuto = b1;
          this.peekHeight = Math.max(b1, p0);
          this.collapsedOffset = this.parentHeight - p0;
       }else {
          goto label_0015 ;
       }
       if (b && this.state == 4) {
          BottomSheetBehavior tviewRef = this.viewRef;
          if (tviewRef != null) {
             View view = tviewRef.get();
             if (view != null) {
                view.requestLayout();
             }
          }
       }
       return;
    }
    public void setSkipCollapsed(boolean p0){
       this.skipCollapsed = p0;
    }
    public final void setState(int p0){
       if (p0 == this.state) {
          return;
       }
       BottomSheetBehavior tviewRef = this.viewRef;
       if (tviewRef == null) {
          if (p0 != 4 && (p0 != 3 && (p0 == 6 || (this.hideable != null && p0 == 5)))) {
             this.state = p0;
          }
          return;
       }else {
          View view = tviewRef.get();
          if (view == null) {
             return;
          }
          ViewParent parent = view.getParent();
          if (parent != null && (parent.isLayoutRequested() && i0.X(view))) {
             view.post(new BottomSheetBehavior$a(this, view, p0));
          }else {
             this.startSettlingAnimation(view, p0);
          }
          return;
       }
    }
    public void setStateInternal(int p0){
       if (this.state == p0) {
          return;
       }
       this.state = p0;
       if (p0 == 6 || p0 == 3) {
          this.updateImportantForAccessibility(true);
       }else if(p0 == 5 || p0 == 4){
          this.updateImportantForAccessibility(false);
       }
       View view = this.viewRef.get();
       if (view != null) {
          BottomSheetBehavior tcallback = this.callback;
          if (tcallback != null) {
             tcallback.b(view, p0);
          }
       }
       return;
    }
    public boolean shouldHide(View p0,float p1){
       boolean b = true;
       if (this.skipCollapsed != null) {
          return b;
       }
       if (p0.getTop() < this.collapsedOffset) {
          return false;
       }
       if ((Math.abs((((float)p0.getTop() + (p1 * 0.10f)) - (float)this.collapsedOffset)) / (float)this.peekHeight) - 0x3f000000 <= 0) {
          b = false;
       }
       return b;
    }
    public void startSettlingAnimation(View p0,int p1){
       int expandedOffs;
       BottomSheetBehavior uBottomSheet = 3;
       if (p1 == 4) {
          uBottomSheet = this.collapsedOffset;
       }else if(p1 == 6){
          BottomSheetBehavior thalfExpande = this.halfExpandedOffset;
          if (this.fitToContents != null) {
             BottomSheetBehavior tfitToConten = this.fitToContentsOffset;
             if (thalfExpande <= tfitToConten) {
                uBottomSheet = tfitToConten;
                p1 = 3;
             }
          }
          uBottomSheet = thalfExpande;
       }else if(p1 == uBottomSheet){
          expandedOffs = this.getExpandedOffset();
       }else if(this.hideable != null && p1 == 5){
          expandedOffs = this.parentHeight;
       }else {
          throw new IllegalArgumentException("Illegal state argument: "+p1);
       }
       if (this.viewDragHelper.smoothSlideViewTo(p0, p0.getLeft(), uBottomSheet)) {
          this.setStateInternal(2);
          i0.k0(p0, new BottomSheetBehavior$d(this, p0, p1));
       }else {
          this.setStateInternal(p1);
       }
       return;
    }
    public final void updateImportantForAccessibility(boolean p0){
       BottomSheetBehavior tviewRef = this.viewRef;
       if (tviewRef == null) {
          return;
       }
       ViewParent parent = tviewRef.get().getParent();
       if (!parent instanceof CoordinatorLayout) {
          return;
       }
       int childCount = parent.getChildCount();
       if (p0) {
          if (this.importantForAccessibilityMap == null) {
             this.importantForAccessibilityMap = new HashMap(childCount);
          }else {
             return;
          }
       }
       int i = 0;
       while (i < childCount) {
          View childAt = parent.getChildAt(i);
          if (childAt != this.viewRef.get()) {
             if (!p0) {
                BottomSheetBehavior timportantFo = this.importantForAccessibilityMap;
                if (timportantFo != null && timportantFo.containsKey(childAt)) {
                   i0.D0(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                }
             }else {
                this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                i0.D0(childAt, 4);
             }
          }
          i = i + 1;
       }
       if (!p0) {
          this.importantForAccessibilityMap = null;
       }
       return;
    }
}
