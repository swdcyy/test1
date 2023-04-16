package com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.scroll.a$a;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.FpsListener;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vd.d$b;
import vd.d;
import com.facebook.react.views.scroll.ScrollEventType;
import ze.n0;
import android.view.View;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.a;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;
import com.facebook.react.views.scroll.a$b;
import android.widget.ScrollView;
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

public class ReactScrollViewManager extends ViewGroupManager implements a$a	// class@0013ea
{
    public FpsListener mFpsListener;
    public static final int[] SPACING_TYPES;

    static {
       ReactScrollViewManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
    }
    public void ReactScrollViewManager(){
       super(null);
    }
    public void ReactScrollViewManager(FpsListener p0){
       super();
       this.mFpsListener = null;
       this.mFpsListener = p0;
    }
    public static Map createExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, null, ReactScrollViewManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), d.d("registrationName", "onScroll"));
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), d.d("registrationName", "onScrollBeginDrag"));
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), d.d("registrationName", "onScrollEndDrag"));
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), d.d("registrationName", "onMomentumScrollBegin"));
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), d.d("registrationName", "onMomentumScrollEnd"));
       return obj.a();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactScrollView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactScrollViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactScrollView(p0, this.mFpsListener);
    }
    public void flashScrollIndicators(ReactScrollView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollViewManager.class, "20")) {
          return;
       }
       p0.b();
       return;
    }
    public void flashScrollIndicators(Object p0){
       this.flashScrollIndicators(p0);
    }
    public Map getCommandsMap(){
       Object obj = PatchProxy.apply(null, this, ReactScrollViewManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a();
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactScrollViewManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactScrollViewManager.createExportedCustomDirectEventTypeConstants();
    }
    public String getName(){
       return "RCTScrollView";
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactScrollView p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactScrollViewManager.class, "18")) {
          return;
       }
       a.b(this, p0, p1, p2);
       return;
    }
    public void receiveCommand(ReactScrollView p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactScrollViewManager.class, "19")) {
          return;
       }
       a.c(this, p0, p1, p2);
       return;
    }
    public void scrollTo(ReactScrollView p0,a$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "21")) {
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
    public void scrollToEnd(ReactScrollView p0,a$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "27")) {
          return;
       }
       int i = p0.getChildAt(0).getHeight() + p0.getPaddingBottom();
       if (p1.a != null) {
          p0.smoothScrollTo(p0.getScrollX(), i);
       }else {
          p0.scrollTo(p0.getScrollX(), i);
       }
       return;
    }
    public void scrollToEnd(Object p0,a$c p1){
       this.scrollToEnd(p0, p1);
    }
    public void setBorderColor(ReactScrollView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(ReactScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactScrollViewManager.class, "25")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p1 = ReactScrollViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactScrollView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Float.valueOf(f1), Float.valueOf(f), p0, ReactScrollView.class, "37")) {
          p0.y.c(p1, f1, f);
       }
       return;
    }
    public void setBorderRadius(ReactScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactScrollViewManager.class, "22")) {
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
          if (!PatchProxy.isSupport(ReactScrollView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p2), Integer.valueOf(p1), p0, ReactScrollView.class, "39")) {
             p0.y.e(p2, p1);
          }
       }
       return;
    }
    public void setBorderStyle(ReactScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "23")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(ReactScrollView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactScrollViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactScrollViewManager.class, "24")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p1 = ReactScrollViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactScrollView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, ReactScrollView.class, "36")) {
          p0.y.g(p1, p2);
       }
       return;
    }
    public void setBottomFillColor(ReactScrollView p0,int p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactScrollV, "13")) {
          return;
       }
       p0.setEndFillColor(p1);
       return;
    }
    public void setDecelerationRate(ReactScrollView p0,float p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactScrollV, "4")) {
          return;
       }
       p0.setDecelerationRate(p1);
       return;
    }
    public void setFadingEdgeLength(ReactScrollView p0,int p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactScrollV, "29")) {
          return;
       }
       if (p1 > 0) {
          p0.setVerticalFadingEdgeEnabled(true);
          p0.setFadingEdgeLength(p1);
       }else {
          p0.setVerticalFadingEdgeEnabled(false);
          p0.setFadingEdgeLength(false);
       }
       return;
    }
    public void setNestedScrollEnabled(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "15")) {
          return;
       }
       i0.H0(p0, p1);
       return;
    }
    public void setOverScrollMode(ReactScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "14")) {
          return;
       }
       p0.setOverScrollMode(b.h(p1));
       return;
    }
    public void setOverflow(ReactScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "26")) {
          return;
       }
       p0.setOverflow(p1);
       return;
    }
    public void setPagingEnabled(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "12")) {
          return;
       }
       p0.setPagingEnabled(p1);
       return;
    }
    public void setParentPriorityHandlerTouch(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "16")) {
          return;
       }
       p0.setParentPriorityHandlerTouch(p1);
       return;
    }
    public void setPersistentScrollbar(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "28")) {
          return;
       }
       p0.setScrollbarFadingEnabled((p1 ^ 0x01));
       return;
    }
    public void setRemoveClippedSubviews(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "9")) {
          return;
       }
       p0.setRemoveClippedSubviews(p1);
       return;
    }
    public void setScrollEnabled(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "2")) {
          return;
       }
       p0.setScrollEnabled(p1);
       p0.setFocusable(p1);
       return;
    }
    public void setScrollPerfTag(ReactScrollView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "11")) {
          return;
       }
       p0.setScrollPerfTag(p1);
       return;
    }
    public void setSendMomentumEvents(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "10")) {
          return;
       }
       p0.setSendMomentumEvents(p1);
       return;
    }
    public void setShowsVerticalScrollIndicator(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "3")) {
          return;
       }
       p0.setVerticalScrollBarEnabled(p1);
       return;
    }
    public void setSnapToEnd(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "8")) {
          return;
       }
       p0.setSnapToEnd(p1);
       return;
    }
    public void setSnapToInterval(ReactScrollView p0,float p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactScrollV, "5")) {
          return;
       }
       p0.setSnapInterval((int)(p1 * c.d().density));
       return;
    }
    public void setSnapToOffsets(ReactScrollView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollViewManager.class, "6")) {
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
    public void setSnapToStart(ReactScrollView p0,boolean p1){
       ReactScrollViewManager reactScrollV = ReactScrollViewManager.class;
       if (PatchProxy.isSupport(reactScrollV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactScrollV, "7")) {
          return;
       }
       p0.setSnapToStart(p1);
       return;
    }
}
