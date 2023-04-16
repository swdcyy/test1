package com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.a$a;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.FpsListener;
import ze.n0;
import android.view.View;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.a$b;
import android.widget.HorizontalScrollView;
import com.facebook.react.views.scroll.a$c;
import java.util.Objects;
import java.lang.Float;
import bg.d;
import lg.d;
import ze.p;
import java.lang.Boolean;
import a2.i0;
import uf.b;
import android.util.DisplayMetrics;
import ze.c;
import java.util.ArrayList;
import java.util.List;

public class ReactHorizontalScrollViewManager extends ViewGroupManager implements a$a	// class@0013e6
{
    public FpsListener mFpsListener;
    public static final int[] SPACING_TYPES;

    static {
       ReactHorizontalScrollViewManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
    }
    public void ReactHorizontalScrollViewManager(){
       super(null);
    }
    public void ReactHorizontalScrollViewManager(FpsListener p0){
       super();
       this.mFpsListener = null;
       this.mFpsListener = p0;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactHorizontalScrollView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactHorizontalScrollView(p0, this.mFpsListener);
    }
    public void flashScrollIndicators(ReactHorizontalScrollView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollViewManager.class, "18")) {
          return;
       }
       p0.a();
       return;
    }
    public void flashScrollIndicators(Object p0){
       this.flashScrollIndicators(p0);
    }
    public String getName(){
       return "AndroidHorizontalScrollView";
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactHorizontalScrollView p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactHorizontalScrollViewManager.class, "16")) {
          return;
       }
       a.b(this, p0, p1, p2);
       return;
    }
    public void receiveCommand(ReactHorizontalScrollView p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactHorizontalScrollViewManager.class, "17")) {
          return;
       }
       a.c(this, p0, p1, p2);
       return;
    }
    public void scrollTo(ReactHorizontalScrollView p0,a$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "19")) {
          return;
       }
       if (p1.c != null) {
          p0.smoothScrollTo(p1.a, p1.b);
       }else {
          p0.scrollTo(p1.a, p1.b);
       }
       return;
    }
    public void scrollTo(Object p0,a$b p1){
       this.scrollTo(p0, p1);
    }
    public void scrollToEnd(ReactHorizontalScrollView p0,a$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "20")) {
          return;
       }
       int i = p0.getChildAt(0).getWidth() + p0.getPaddingRight();
       if (p1.a != null) {
          p0.smoothScrollTo(i, p0.getScrollY());
       }else {
          p0.scrollTo(i, p0.getScrollY());
       }
       return;
    }
    public void scrollToEnd(Object p0,a$c p1){
       this.scrollToEnd(p0, p1);
    }
    public void setBorderColor(ReactHorizontalScrollView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(ReactHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactHorizontalScrollViewManager.class, "25")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p1 = ReactHorizontalScrollViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactHorizontalScrollView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Float.valueOf(f1), Float.valueOf(f), p0, ReactHorizontalScrollView.class, "42")) {
          p0.y.c(p1, f1, f);
       }
       return;
    }
    public void setBorderRadius(ReactHorizontalScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactHorizontalScrollViewManager.class, "22")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (!p1) {
          p0.setBorderRadius(p2);
       }else {
          p1--;
          Objects.requireNonNull(p0);
          if (!PatchProxy.isSupport(ReactHorizontalScrollView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p2), Integer.valueOf(p1), p0, ReactHorizontalScrollView.class, "44")) {
             p0.y.e(p2, p1);
          }
       }
       return;
    }
    public void setBorderStyle(ReactHorizontalScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "23")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(ReactHorizontalScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactHorizontalScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactHorizontalScrollViewManager.class, "24")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p1 = ReactHorizontalScrollViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactHorizontalScrollView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, ReactHorizontalScrollView.class, "41")) {
          p0.y.g(p1, p2);
       }
       return;
    }
    public void setBottomFillColor(ReactHorizontalScrollView p0,int p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactHorizon, "21")) {
          return;
       }
       p0.setEndFillColor(p1);
       return;
    }
    public void setDecelerationRate(ReactHorizontalScrollView p0,float p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactHorizon, "4")) {
          return;
       }
       p0.setDecelerationRate(p1);
       return;
    }
    public void setDisableIntervalMomentum(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "5")) {
          return;
       }
       p0.setDisableIntervalMomentum(p1);
       return;
    }
    public void setFadingEdgeLength(ReactHorizontalScrollView p0,int p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactHorizon, "28")) {
          return;
       }
       if (p1 > 0) {
          p0.setHorizontalFadingEdgeEnabled(true);
          p0.setFadingEdgeLength(p1);
       }else {
          p0.setHorizontalFadingEdgeEnabled(false);
          p0.setFadingEdgeLength(false);
       }
       return;
    }
    public void setNestedScrollEnabled(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "15")) {
          return;
       }
       i0.H0(p0, p1);
       return;
    }
    public void setOverScrollMode(ReactHorizontalScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "14")) {
          return;
       }
       p0.setOverScrollMode(b.h(p1));
       return;
    }
    public void setOverflow(ReactHorizontalScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "26")) {
          return;
       }
       p0.setOverflow(p1);
       return;
    }
    public void setPagingEnabled(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "13")) {
          return;
       }
       p0.setPagingEnabled(p1);
       return;
    }
    public void setPersistentScrollbar(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "27")) {
          return;
       }
       p0.setScrollbarFadingEnabled((p1 ^ 0x01));
       return;
    }
    public void setRemoveClippedSubviews(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "10")) {
          return;
       }
       p0.setRemoveClippedSubviews(p1);
       return;
    }
    public void setScrollEnabled(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "2")) {
          return;
       }
       p0.setScrollEnabled(p1);
       return;
    }
    public void setScrollPerfTag(ReactHorizontalScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "12")) {
          return;
       }
       p0.setScrollPerfTag(p1);
       return;
    }
    public void setSendMomentumEvents(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "11")) {
          return;
       }
       p0.setSendMomentumEvents(p1);
       return;
    }
    public void setShowsHorizontalScrollIndicator(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "3")) {
          return;
       }
       p0.setHorizontalScrollBarEnabled(p1);
       return;
    }
    public void setSnapToEnd(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "9")) {
          return;
       }
       p0.setSnapToEnd(p1);
       return;
    }
    public void setSnapToInterval(ReactHorizontalScrollView p0,float p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactHorizon, "6")) {
          return;
       }
       p0.setSnapInterval((int)(p1 * c.d().density));
       return;
    }
    public void setSnapToOffsets(ReactHorizontalScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollViewManager.class, "7")) {
          return;
       }
       DisplayMetrics uDisplayMetr = c.d();
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p1.size(); i = i + 1) {
          double d = p1.getDouble(i) * (double)uDisplayMetr.density;
          uArrayList.add(Integer.valueOf((int)d));
       }
       p0.setSnapOffsets(uArrayList);
       return;
    }
    public void setSnapToStart(ReactHorizontalScrollView p0,boolean p1){
       ReactHorizontalScrollViewManager reactHorizon = ReactHorizontalScrollViewManager.class;
       if (PatchProxy.isSupport(reactHorizon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactHorizon, "8")) {
          return;
       }
       p0.setSnapToStart(p1);
       return;
    }
}
