package com.google.android.material.tabs.TabLayout;
import android.widget.HorizontalScrollView;
import z1.g;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.graphics.RectF;
import androidx.core.util.Pools$SimplePool;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.graphics.drawable.Drawable;
import ek.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import ck.l;
import android.content.res.Resources;
import cw9.c;
import com.google.android.material.tabs.TabLayout$c;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Math;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout$TabView;
import z1.f;
import h3.a;
import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout$e;
import android.animation.ValueAnimator;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$h;
import com.google.android.material.tabs.TabLayout$g;
import com.google.android.material.tabs.TabLayout$h;
import com.google.android.material.tabs.TabLayout$b;
import android.widget.LinearLayout$LayoutParams;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.google.android.material.tabs.TabItem;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.IBinder;
import a2.i0;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import android.animation.Animator$AnimatorListener;
import r0.a;
import android.util.DisplayMetrics;
import rj.a;
import android.animation.TimeInterpolator;
import com.google.android.material.tabs.TabLayout$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Iterator;

public class TabLayout extends HorizontalScrollView	// class@0016d1
{
    public TabLayout$b adapterChangeListener;
    public int contentInsetStart;
    public TabLayout$c currentVpSelectedListener;
    public boolean inlineLabel;
    public int mode;
    public TabLayout$g pageChangeListener;
    public a pagerAdapter;
    public DataSetObserver pagerAdapterObserver;
    public final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    public ValueAnimator scrollAnimator;
    public final int scrollableTabMinWidth;
    public TabLayout$c selectedListener;
    public final ArrayList selectedListeners;
    public TabLayout$f selectedTab;
    public boolean setupViewPagerImplicitly;
    public final TabLayout$SlidingTabIndicator slidingTabIndicator;
    public final int tabBackgroundResId;
    public int tabGravity;
    public ColorStateList tabIconTint;
    public PorterDuff$Mode tabIconTintMode;
    public int tabIndicatorAnimationDuration;
    public boolean tabIndicatorFullWidth;
    public int tabIndicatorGravity;
    public int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    public ColorStateList tabRippleColorStateList;
    public Drawable tabSelectedIndicator;
    public int tabTextAppearance;
    public ColorStateList tabTextColors;
    public float tabTextMultiLineSize;
    public float tabTextSize;
    public final RectF tabViewContentBounds;
    public final f tabViewPool;
    public final ArrayList tabs;
    public boolean unboundedRipple;
    public ViewPager viewPager;
    public static final f tabPool;

    static {
       TabLayout.tabPool = new g(16);
    }
    public void TabLayout(Context p0){
       super(p0, null);
    }
    public void TabLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0408c8);
    }
    public void TabLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.tabs = new ArrayList();
       this.tabViewContentBounds = new RectF();
       this.tabMaxWidth = Integer.MAX_VALUE;
       this.selectedListeners = new ArrayList();
       this.tabViewPool = new Pools$SimplePool(12);
       this.setHorizontalScrollBarEnabled(false);
       TabLayout$SlidingTabIndicator slidingTabIn = new TabLayout$SlidingTabIndicator(this, p0);
       this.slidingTabIndicator = slidingTabIn;
       super.addView(slidingTabIn, false, new FrameLayout$LayoutParams(-2, -1));
       int[] ointArray = new int[]{22};
       TypedArray typedArray = k.h(p0, p1, c$b.D5, p2, R.style.arg_RES_7f1104c1, ointArray);
       slidingTabIn.setSelectedIndicatorHeight(typedArray.getDimensionPixelSize(10, -1));
       slidingTabIn.setSelectedIndicatorColor(typedArray.getColor(7, false));
       this.setSelectedTabIndicator(a.b(p0, typedArray, 5));
       this.setSelectedTabIndicatorGravity(typedArray.getInt(9, false));
       this.setTabIndicatorFullWidth(typedArray.getBoolean(8, 1));
       p2 = typedArray.getDimensionPixelSize(15, false);
       this.tabPaddingBottom = p2;
       this.tabPaddingEnd = p2;
       this.tabPaddingTop = p2;
       this.tabPaddingStart = p2;
       this.tabPaddingStart = typedArray.getDimensionPixelSize(18, p2);
       this.tabPaddingTop = typedArray.getDimensionPixelSize(19, this.tabPaddingTop);
       this.tabPaddingEnd = typedArray.getDimensionPixelSize(17, this.tabPaddingEnd);
       this.tabPaddingBottom = typedArray.getDimensionPixelSize(16, this.tabPaddingBottom);
       p2 = typedArray.getResourceId(22, R.style.arg_RES_7f11031c);
       this.tabTextAppearance = p2;
       TypedArray typedArray1 = p0.obtainStyledAttributes(p2, c$b.E5);
       this.tabTextSize = (float)typedArray1.getDimensionPixelSize(false, false);
       int i = 3;
       this.tabTextColors = a.a(p0, typedArray1, i);
       typedArray1.recycle();
       typedArray1 = 23;
       if (typedArray.hasValue(typedArray1)) {
          this.tabTextColors = a.a(p0, typedArray, typedArray1);
       }
       typedArray1 = 21;
       if (typedArray.hasValue(typedArray1)) {
          this.tabTextColors = TabLayout.m(this.tabTextColors.getDefaultColor(), typedArray.getColor(typedArray1, false));
       }
       this.tabIconTint = a.a(p0, typedArray, i);
       this.tabIconTintMode = l.b(typedArray.getInt(4, -1), null);
       this.tabRippleColorStateList = a.a(p0, typedArray, 20);
       this.tabIndicatorAnimationDuration = typedArray.getInt(6, 300);
       this.requestedTabMinWidth = typedArray.getDimensionPixelSize(13, -1);
       this.requestedTabMaxWidth = typedArray.getDimensionPixelSize(12, -1);
       this.tabBackgroundResId = typedArray.getResourceId(false, false);
       this.contentInsetStart = typedArray.getDimensionPixelSize(1, false);
       this.mode = typedArray.getInt(14, 1);
       this.tabGravity = typedArray.getInt(2, false);
       this.inlineLabel = typedArray.getBoolean(11, false);
       this.unboundedRipple = typedArray.getBoolean(24, false);
       typedArray.recycle();
       Resources resources = this.getResources();
       this.tabTextMultiLineSize = (float)c.b(resources, 0x7f0701c6);
       this.scrollableTabMinWidth = c.b(resources, 0x7f0701c4);
       this.j();
       return;
    }
    public static ColorStateList m(int p0,int p1){
       int[][] ointArray = new int[][2]{HorizontalScrollView.SELECTED_STATE_SET,HorizontalScrollView.EMPTY_STATE_SET};
       int[] ointArray1 = new int[]{p1,p0};
       return new ColorStateList(ointArray, ointArray1);
    }
    public void A(TabLayout$c p0){
       this.selectedListeners.remove(p0);
    }
    public void B(int p0){
       TabLayout$f uof1;
       TabLayout tselectedTab = this.selectedTab;
       int i = (tselectedTab != null)? tselectedTab.c(): 0;
       this.C(p0);
       TabLayout$f uof = this.tabs.remove(p0);
       if (uof != null) {
          uof.g();
          this.y(uof);
       }
       int i1 = this.tabs.size();
       for (int i2 = p0; i2 < i1; i2 = i2 + 1) {
          this.tabs.get(i2).m(i2);
       }
       if (i == p0) {
          if (this.tabs.isEmpty()) {
             uof1 = null;
          }else {
             p0--;
             uof1 = this.tabs.get(Math.max(0, p0));
          }
          this.selectTab(uof1);
       }
       return;
    }
    public final void C(int p0){
       TabLayout$TabView childAt = this.slidingTabIndicator.getChildAt(p0);
       this.slidingTabIndicator.removeViewAt(p0);
       if (childAt != null) {
          childAt.c();
          this.tabViewPool.a(childAt);
       }
       this.requestLayout();
       return;
    }
    public void D(TabLayout$f p0,boolean p1){
       int i;
       TabLayout tselectedTab = this.selectedTab;
       if (tselectedTab == p0) {
          if (tselectedTab != null) {
             this.q(p0);
             this.i(p0.c());
          }
       }else if(p0 != null){
          i = p0.c();
       }else {
          i = -1;
       }
       if (p1) {
          if (tselectedTab == null || (tselectedTab.c() == -1 && i != -1)) {
             this.F(i, 0, true);
          }else {
             this.i(i);
          }
          if (i != -1) {
             this.setSelectedTabView(i);
          }
       }
       this.selectedTab = p0;
       if (tselectedTab != null) {
          this.s(tselectedTab);
       }
       if (p0 != null) {
          this.r(p0);
       }
       return;
    }
    public void E(a p0,boolean p1){
       TabLayout tpagerAdapte = this.pagerAdapter;
       if (tpagerAdapte != null) {
          TabLayout tpagerAdapte1 = this.pagerAdapterObserver;
          if (tpagerAdapte1 != null) {
             tpagerAdapte.y(tpagerAdapte1);
          }
       }
       this.pagerAdapter = p0;
       if (p1 && p0 != null) {
          if (this.pagerAdapterObserver == null) {
             this.pagerAdapterObserver = new TabLayout$e(this);
          }
          p0.r(this.pagerAdapterObserver);
       }
       this.x();
       return;
    }
    public void F(int p0,float p1,boolean p2){
       this.G(p0, p1, p2, true);
    }
    public void G(int p0,float p1,boolean p2,boolean p3){
       int i = Math.round(((float)p0 + p1));
       if (i >= 0 && i < this.slidingTabIndicator.getChildCount()) {
          if (p3) {
             this.slidingTabIndicator.e(p0, p1);
          }
          TabLayout tscrollAnima = this.scrollAnimator;
          if (tscrollAnima != null && tscrollAnima.isRunning()) {
             this.scrollAnimator.cancel();
          }
          this.scrollTo(this.k(p0, p1), 0);
          if (p2) {
             this.setSelectedTabView(i);
          }
       }
    label_0034 :
       return;
    }
    public void H(int p0,int p1){
       this.setTabTextColors(TabLayout.m(p0, p1));
    }
    public void I(ViewPager p0,boolean p1){
       this.J(p0, p1, false);
    }
    public final void J(ViewPager p0,boolean p1,boolean p2){
       TabLayout tviewPager = this.viewPager;
       if (tviewPager != null) {
          TabLayout tpageChangeL = this.pageChangeListener;
          if (tpageChangeL != null) {
             tviewPager.removeOnPageChangeListener(tpageChangeL);
          }
          tviewPager = this.adapterChangeListener;
          if (tviewPager != null) {
             this.viewPager.removeOnAdapterChangeListener(tviewPager);
          }
       }
       tviewPager = this.currentVpSelectedListener;
       if (tviewPager != null) {
          this.A(tviewPager);
          this.currentVpSelectedListener = null;
       }
       if (p0 != null) {
          this.viewPager = p0;
          if (this.pageChangeListener == null) {
             this.pageChangeListener = new TabLayout$g(this);
          }
          this.pageChangeListener.a();
          p0.addOnPageChangeListener(this.pageChangeListener);
          TabLayout$h oh = new TabLayout$h(p0);
          this.currentVpSelectedListener = oh;
          this.a(oh);
          a adapter = p0.getAdapter();
          if (adapter != null) {
             this.E(adapter, p1);
          }
          if (this.adapterChangeListener == null) {
             this.adapterChangeListener = new TabLayout$b(this);
          }
          this.adapterChangeListener.b(p1);
          p0.addOnAdapterChangeListener(this.adapterChangeListener);
          this.F(p0.getCurrentItem(), 0, true);
       }else {
          this.viewPager = null;
          this.E(null, false);
       }
       this.setupViewPagerImplicitly = p2;
       return;
    }
    public final void K(){
       int i = this.tabs.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.tabs.get(i1).p();
       }
       return;
    }
    public final void L(LinearLayout$LayoutParams p0){
       if (this.mode == 1 && this.tabGravity == null) {
          p0.width = 0;
          p0.weight = 0x3f800000;
       }else {
          p0.width = -2;
          p0.weight = 0;
       }
       return;
    }
    public void M(boolean p0){
       int i = 0;
       while (i < this.slidingTabIndicator.getChildCount()) {
          View childAt = this.slidingTabIndicator.getChildAt(i);
          childAt.setMinimumWidth(this.getTabMinWidth());
          this.L(childAt.getLayoutParams());
          if (p0) {
             childAt.requestLayout();
          }
          i = i + 1;
       }
       return;
    }
    public void a(TabLayout$c p0){
       if (!this.selectedListeners.contains(p0)) {
          this.selectedListeners.add(p0);
       }
       return;
    }
    public void addView(View p0){
       this.h(p0);
    }
    public void addView(View p0,int p1){
       this.h(p0);
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       this.h(p0);
    }
    public void addView(View p0,ViewGroup$LayoutParams p1){
       this.h(p0);
    }
    public void b(TabLayout$f p0){
       this.e(p0, this.tabs.isEmpty());
    }
    public void c(TabLayout$f p0,int p1){
       this.d(p0, p1, this.tabs.isEmpty());
    }
    public void d(TabLayout$f p0,int p1,boolean p2){
       if (p0.g != this) {
          throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
       }
       this.l(p0, p1);
       this.g(p0);
       if (p2) {
          p0.h();
       }
       return;
    }
    public void e(TabLayout$f p0,boolean p1){
       this.d(p0, this.tabs.size(), p1);
    }
    public final void f(TabItem p0){
       TabLayout$f uof = this.w();
       TabItem b = p0.b;
       if (b != null) {
          uof.o(b);
       }
       b = p0.c;
       if (b != null) {
          uof.l(b);
       }
       b = p0.d;
       if (b != null) {
          uof.j(b);
       }
       if (!TextUtils.isEmpty(p0.getContentDescription())) {
          uof.i(p0.getContentDescription());
       }
       this.b(uof);
       return;
    }
    public final void g(TabLayout$f p0){
       this.slidingTabIndicator.addView(p0.h, p0.c(), this.n());
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.generateLayoutParams(p0);
    }
    public FrameLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.generateDefaultLayoutParams();
    }
    public final int getDefaultHeight(){
       int i = this.tabs.size();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i) {
          TabLayout$f uof = this.tabs.get(i2);
          if (uof != null && (uof.b() != null && !TextUtils.isEmpty(uof.e()))) {
             i1 = 1;
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       i = (i1 && this.inlineLabel == null)? 72: 48;
       return i;
    }
    public int getSelectedTabPosition(){
       TabLayout tselectedTab = this.selectedTab;
       int i = (tselectedTab != null)? tselectedTab.c(): -1;
       return i;
    }
    public int getTabCount(){
       return this.tabs.size();
    }
    public int getTabGravity(){
       return this.tabGravity;
    }
    public ColorStateList getTabIconTint(){
       return this.tabIconTint;
    }
    public int getTabIndicatorGravity(){
       return this.tabIndicatorGravity;
    }
    public int getTabMaxWidth(){
       return this.tabMaxWidth;
    }
    public final int getTabMinWidth(){
       int i;
       TabLayout trequestedTa = this.requestedTabMinWidth;
       if (trequestedTa != -1) {
          return trequestedTa;
       }
       trequestedTa = (this.mode == null)? this.scrollableTabMinWidth: 0;
       return trequestedTa;
    }
    public int getTabMode(){
       return this.mode;
    }
    public ColorStateList getTabRippleColor(){
       return this.tabRippleColorStateList;
    }
    public final int getTabScrollRange(){
       return Math.max(0, (((this.slidingTabIndicator.getWidth() - this.getWidth()) - this.getPaddingLeft()) - this.getPaddingRight()));
    }
    public Drawable getTabSelectedIndicator(){
       return this.tabSelectedIndicator;
    }
    public ColorStateList getTabTextColors(){
       return this.tabTextColors;
    }
    public final void h(View p0){
       if (!p0 instanceof TabItem) {
          throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
       }
       this.f(p0);
       return;
    }
    public final void i(int p0){
       if (p0 == -1) {
          return;
       }
       boolean b = true;
       float f = 0;
       if (this.getWindowToken() != null && (!i0.Y(this) || this.slidingTabIndicator.c())) {
          this.F(p0, f, b);
          return;
       }else {
          int scrollX = this.getScrollX();
          int i = this.k(p0, f);
          if (scrollX != i) {
             this.u();
             int[] ointArray = new int[]{scrollX,i};
             this.scrollAnimator.setIntValues(ointArray);
             this.scrollAnimator.start();
          }
          this.slidingTabIndicator.a(p0, this.tabIndicatorAnimationDuration);
          return;
       }
    }
    public final void j(){
       int i = 0;
       int i1 = (this.mode == null)? Math.max(i, (this.contentInsetStart - this.tabPaddingStart)): 0;
       i0.J0(this.slidingTabIndicator, i1, i, i, i);
       TabLayout tmode = this.mode;
       if (tmode != null) {
          if (tmode == true) {
             this.slidingTabIndicator.setGravity(true);
          }
       }else {
          this.slidingTabIndicator.setGravity(0x800003);
       }
       this.M(true);
       return;
    }
    public final int k(int p0,float p1){
       int i = 0;
       if (this.mode != null) {
          return i;
       }
       View childAt = this.slidingTabIndicator.getChildAt(p0);
       p0++;
       View childAt1 = (p0 < this.slidingTabIndicator.getChildCount())? this.slidingTabIndicator.getChildAt(p0): null;
       int width = (childAt != null)? childAt.getWidth(): 0;
       if (childAt1 != null) {
          i = childAt1.getWidth();
       }
       childAt1 = (childAt.getLeft() + (width / 2)) - (this.getWidth() / 2);
       int i1 = (int)(((float)(width + i) * 0x3f000000) * p1);
       childAt1 = (!i0.B(this))? childAt1 + i1: childAt1 - i1;
       return childAt1;
    }
    public final void l(TabLayout$f p0,int p1){
       p0.m(p1);
       this.tabs.add(p1, p0);
       int i = this.tabs.size();
       p1++;
       while (p1 < i) {
          this.tabs.get(p1).m(p1);
       }
       return;
    }
    public final LinearLayout$LayoutParams n(){
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       this.L(layoutParams);
       return layoutParams;
    }
    public TabLayout$f o(){
       TabLayout$f uof = TabLayout.tabPool.q();
       if (uof == null) {
          uof = new TabLayout$f();
       }
       return uof;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.viewPager == null) {
          ViewParent parent = this.getParent();
          if (parent instanceof ViewPager) {
             this.J(parent, true, true);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       if (this.setupViewPagerImplicitly != null) {
          this.setupWithViewPager(null);
          this.setupViewPagerImplicitly = false;
       }
       return;
    }
    public void onDraw(Canvas p0){
       int i = 0;
       while (i < this.slidingTabIndicator.getChildCount()) {
          View childAt = this.slidingTabIndicator.getChildAt(i);
          if (childAt instanceof TabLayout$TabView) {
             childAt.b(p0);
          }
          i = i + 1;
       }
       super.onDraw(p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       int i = (this.t(this.getDefaultHeight()) + this.getPaddingTop()) + this.getPaddingBottom();
       int mode = View$MeasureSpec.getMode(p1);
       if (mode != Integer.MIN_VALUE) {
          if (!mode) {
             p1 = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
          }
       }else {
          p1 = View$MeasureSpec.makeMeasureSpec(Math.min(i, View$MeasureSpec.getSize(p1)), 0x40000000);
       }
       i = View$MeasureSpec.getSize(p0);
       if (View$MeasureSpec.getMode(p0)) {
          TabLayout trequestedTa = this.requestedTabMaxWidth;
          if (trequestedTa <= null) {
             trequestedTa = i - this.t(56);
          }
          this.tabMaxWidth = trequestedTa;
       }
       super.onMeasure(p0, p1);
       i = 1;
       if (this.getChildCount() == i) {
          p0 = 0;
          View childAt = this.getChildAt(p0);
          TabLayout tmode = this.mode;
          if (tmode != null) {
             if (tmode != i) {
             label_0077 :
                if (p0) {
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), HorizontalScrollView.getChildMeasureSpec(p1, (this.getPaddingTop() + this.getPaddingBottom()), childAt.getLayoutParams().height));
                }
             }else if(childAt.getMeasuredWidth() != this.getMeasuredWidth()){
             label_0075 :
                i = 0;
             }
          }else if(childAt.getMeasuredWidth() < this.getMeasuredWidth()){
          }
          p0 = i;
          goto label_0077 ;
       }
       return;
    }
    public final TabLayout$TabView p(TabLayout$f p0){
       TabLayout ttabViewPool = this.tabViewPool;
       TabLayout$TabView tabView = (ttabViewPool != null)? ttabViewPool.q(): null;
       if (tabView == null) {
          tabView = new TabLayout$TabView(this, this.getContext());
       }
       tabView.setTab(p0);
       tabView.setFocusable(true);
       tabView.setMinimumWidth(this.getTabMinWidth());
       if (TextUtils.isEmpty(p0.d)) {
          tabView.setContentDescription(p0.c);
       }else {
          tabView.setContentDescription(p0.d);
       }
       return tabView;
    }
    public final void q(TabLayout$f p0){
       for (int i = this.selectedListeners.size() - 1; i >= 0; i = i - 1) {
          this.selectedListeners.get(i).sf(p0);
       }
       return;
    }
    public final void r(TabLayout$f p0){
       int i = this.selectedListeners.size();
       i = i - 1;
       while (i >= 0) {
          this.selectedListeners.get(i).ua(p0);
       }
       return;
    }
    public final void s(TabLayout$f p0){
       int i = this.selectedListeners.size();
       i = i - 1;
       while (i >= 0) {
          this.selectedListeners.get(i).H7(p0);
       }
       return;
    }
    public void selectTab(TabLayout$f p0){
       this.D(p0, true);
    }
    public void setInlineLabel(boolean p0){
       if (this.inlineLabel != p0) {
          this.inlineLabel = p0;
          int i = 0;
          while (i < this.slidingTabIndicator.getChildCount()) {
             View childAt = this.slidingTabIndicator.getChildAt(i);
             if (childAt instanceof TabLayout$TabView) {
                childAt.f();
             }
             i++;
          }
          this.j();
       }
       return;
    }
    public void setInlineLabelResource(int p0){
       this.setInlineLabel(this.getResources().getBoolean(p0));
    }
    public void setOnTabSelectedListener(TabLayout$c p0){
       TabLayout tselectedLis = this.selectedListener;
       if (tselectedLis != null) {
          this.A(tselectedLis);
       }
       this.selectedListener = p0;
       if (p0 != null) {
          this.a(p0);
       }
       return;
    }
    public void setScrollAnimatorListener(Animator$AnimatorListener p0){
       this.u();
       this.scrollAnimator.addListener(p0);
    }
    public void setSelectedTabIndicator(int p0){
       if (p0) {
          this.setSelectedTabIndicator(a.d(this.getContext(), p0));
       }else {
          this.setSelectedTabIndicator(null);
       }
       return;
    }
    public void setSelectedTabIndicator(Drawable p0){
       if (this.tabSelectedIndicator != p0) {
          this.tabSelectedIndicator = p0;
          i0.j0(this.slidingTabIndicator);
       }
       return;
    }
    public void setSelectedTabIndicatorColor(int p0){
       this.slidingTabIndicator.setSelectedIndicatorColor(p0);
    }
    public void setSelectedTabIndicatorGravity(int p0){
       if (this.tabIndicatorGravity != p0) {
          this.tabIndicatorGravity = p0;
          i0.j0(this.slidingTabIndicator);
       }
       return;
    }
    public void setSelectedTabIndicatorHeight(int p0){
       this.slidingTabIndicator.setSelectedIndicatorHeight(p0);
    }
    public final void setSelectedTabView(int p0){
       int childCount = this.slidingTabIndicator.getChildCount();
       if (p0 < childCount) {
          for (int i = 0; i < childCount; i = i + 1) {
             View childAt = this.slidingTabIndicator.getChildAt(i);
             boolean b = true;
             boolean b1 = (i == p0)? true: false;
             childAt.setSelected(b1);
             if (i != p0) {
                b = false;
             }
             childAt.setActivated(b);
          }
       }
       return;
    }
    public void setTabGravity(int p0){
       if (this.tabGravity != p0) {
          this.tabGravity = p0;
          this.j();
       }
       return;
    }
    public void setTabIconTint(ColorStateList p0){
       if (this.tabIconTint != p0) {
          this.tabIconTint = p0;
          this.K();
       }
       return;
    }
    public void setTabIconTintResource(int p0){
       this.setTabIconTint(a.c(this.getContext(), p0));
    }
    public void setTabIndicatorFullWidth(boolean p0){
       this.tabIndicatorFullWidth = p0;
       i0.j0(this.slidingTabIndicator);
    }
    public void setTabMode(int p0){
       if (p0 != this.mode) {
          this.mode = p0;
          this.j();
       }
       return;
    }
    public void setTabRippleColor(ColorStateList p0){
       if (this.tabRippleColorStateList != p0) {
          this.tabRippleColorStateList = p0;
          int i = 0;
          while (i < this.slidingTabIndicator.getChildCount()) {
             View childAt = this.slidingTabIndicator.getChildAt(i);
             if (childAt instanceof TabLayout$TabView) {
                childAt.e(this.getContext());
             }
             i++;
          }
       }
       return;
    }
    public void setTabRippleColorResource(int p0){
       this.setTabRippleColor(a.c(this.getContext(), p0));
    }
    public void setTabTextColors(ColorStateList p0){
       if (this.tabTextColors != p0) {
          this.tabTextColors = p0;
          this.K();
       }
       return;
    }
    public void setTabsFromPagerAdapter(a p0){
       this.E(p0, false);
    }
    public void setUnboundedRipple(boolean p0){
       if (this.unboundedRipple != p0) {
          this.unboundedRipple = p0;
          int i = 0;
          while (i < this.slidingTabIndicator.getChildCount()) {
             View childAt = this.slidingTabIndicator.getChildAt(i);
             if (childAt instanceof TabLayout$TabView) {
                childAt.e(this.getContext());
             }
             i++;
          }
       }
       return;
    }
    public void setUnboundedRippleResource(int p0){
       this.setUnboundedRipple(this.getResources().getBoolean(p0));
    }
    public void setupWithViewPager(ViewPager p0){
       this.I(p0, true);
    }
    public boolean shouldDelayChildPressedState(){
       boolean b = (this.getTabScrollRange() > 0)? true: false;
       return b;
    }
    public int t(int p0){
       return Math.round((c.c(this.getResources()).density * (float)p0));
    }
    public final void u(){
       if (this.scrollAnimator == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.scrollAnimator = valueAnimato;
          valueAnimato.setInterpolator(a.b);
          this.scrollAnimator.setDuration((long)this.tabIndicatorAnimationDuration);
          this.scrollAnimator.addUpdateListener(new TabLayout$a(this));
       }
       return;
    }
    public TabLayout$f v(int p0){
       TabLayout$f uof = (p0 < 0 || p0 >= this.getTabCount())? null: this.tabs.get(p0);
       return uof;
    }
    public TabLayout$f w(){
       TabLayout$f uof = this.o();
       uof.g = this;
       uof.h = this.p(uof);
       return uof;
    }
    public void x(){
       this.z();
       TabLayout tpagerAdapte = this.pagerAdapter;
       if (tpagerAdapte != null) {
          int i = tpagerAdapte.j();
          boolean b = false;
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             TabLayout$f uof = this.w();
             uof.o(this.pagerAdapter.l(i1));
             this.e(uof, b);
          }
          TabLayout tviewPager = this.viewPager;
          if (tviewPager != null && i > 0) {
             i = tviewPager.getCurrentItem();
             if (i != this.getSelectedTabPosition() && i < this.getTabCount()) {
                this.selectTab(this.v(i));
             }
          }
       }
       return;
    }
    public boolean y(TabLayout$f p0){
       return TabLayout.tabPool.a(p0);
    }
    public void z(){
       for (int i = this.slidingTabIndicator.getChildCount() - 1; i >= 0; i = i - 1) {
          this.C(i);
       }
       Iterator iterator = this.tabs.iterator();
       while (iterator.hasNext()) {
          TabLayout$f uof = iterator.next();
          iterator.remove();
          uof.g();
          this.y(uof);
       }
       this.selectedTab = null;
       return;
    }
}
