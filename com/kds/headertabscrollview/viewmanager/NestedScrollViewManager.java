package com.kds.headertabscrollview.viewmanager.NestedScrollViewManager;
import com.facebook.react.views.scroll.a$a;
import com.facebook.react.uimanager.ViewGroupManager;
import com.kds.headertabscrollview.viewmanager.NestedScrollViewManager$a;
import nsd.u;
import java.util.Map;
import vd.d$b;
import vd.d;
import com.facebook.react.views.scroll.ScrollEventType;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ze.n0;
import android.view.View;
import com.kds.headertabscrollview.layout.ReactNestedScrollView;
import android.content.Context;
import com.facebook.react.views.scroll.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.scroll.a$b;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView;
import com.facebook.react.views.scroll.a$c;
import android.widget.FrameLayout;
import java.lang.Integer;
import bg.d;
import java.lang.Float;
import ze.p;
import uf.b;
import android.util.DisplayMetrics;
import ze.c;
import java.util.ArrayList;
import java.util.List;

public final class NestedScrollViewManager extends ViewGroupManager implements a$a	// class@000737
{
    public static final NestedScrollViewManager$a Companion;
    public static final int[] SPACING_TYPES;

    static {
       NestedScrollViewManager.Companion = new NestedScrollViewManager$a(null);
       NestedScrollViewManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
    }
    public void NestedScrollViewManager(){
       super();
    }
    public final Map createExportedCustomDirectEventTypeConstants(){
       d$b uob = d.a();
       uob.b(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), d.d("registrationName", "onScroll"));
       uob.b(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), d.d("registrationName", "onScrollBeginDrag"));
       uob.b(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), d.d("registrationName", "onScrollEndDrag"));
       uob.b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), d.d("registrationName", "onMomentumScrollBegin"));
       uob.b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), d.d("registrationName", "onMomentumScrollEnd"));
       Map map = uob.a();
       a.h(map, "MapBuilder.builder<Strin¡­\"\)\n      \)\n      .build\(\)");
       return map;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactNestedScrollView createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new ReactNestedScrollView(p0);
    }
    public void flashScrollIndicators(ReactNestedScrollView p0){
       a.q(p0, "scrollView");
       p0.C();
    }
    public void flashScrollIndicators(Object p0){
       this.flashScrollIndicators(p0);
    }
    public Map getCommandsMap(){
       return a.a();
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       return this.createExportedCustomDirectEventTypeConstants();
    }
    public String getName(){
       return "NestedScrollView";
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactNestedScrollView p0,int p1,ReadableArray p2){
       a.q(p0, "scrollView");
       a.b(this, p0, p1, p2);
    }
    public void receiveCommand(ReactNestedScrollView p0,String p1,ReadableArray p2){
       a.q(p0, "scrollView");
       if (p1 == null) {
          return;
       }
       a.c(this, p0, p1, p2);
       return;
    }
    public void scrollTo(ReactNestedScrollView p0,a$b p1){
       a.q(p0, "scrollView");
       a.q(p1, "data");
       if (p1.c != null) {
          p0.x(p1.a, p1.b);
       }else {
          p0.scrollTo(p1.a, p1.b);
       }
       return;
    }
    public void scrollTo(Object p0,a$b p1){
       this.scrollTo(p0, p1);
    }
    public void scrollToEnd(ReactNestedScrollView p0,a$c p1){
       a.q(p0, "scrollView");
       a.q(p1, "data");
       View childAt = p0.getChildAt(0);
       a.h(childAt, "scrollView.getChildAt\(0\)");
       int i = childAt.getHeight() + p0.getPaddingBottom();
       if (p1.a != null) {
          p0.z(p0.getScrollX(), i);
       }else {
          p0.scrollTo(p0.getScrollX(), i);
       }
       return;
    }
    public void scrollToEnd(Object p0,a$c p1){
       this.scrollToEnd(p0, p1);
    }
    public final void setBorderColor(ReactNestedScrollView p0,int p1,Integer p2){
       a.q(p0, "view");
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p0.S.c(NestedScrollViewManager.SPACING_TYPES[p1], f1, f);
       return;
    }
    public final void setBorderRadius(ReactNestedScrollView p0,int p1,float p2){
       a.q(p0, "view");
       if (!Float.isNaN(p2) && p2 - Float.NaN) {
          p2 = p.c(p2);
       }
       if (!p1) {
          p0.setBorderRadius(p2);
       }else {
          p1--;
          p0.S.e(p2, p1);
       }
       return;
    }
    public final void setBorderStyle(ReactNestedScrollView p0,String p1){
       a.q(p0, "view");
       p0.setBorderStyle(p1);
    }
    public final void setBorderWidth(ReactNestedScrollView p0,int p1,float p2){
       a.q(p0, "view");
       if (!Float.isNaN(p2) && p2 - Float.NaN) {
          p2 = p.c(p2);
       }
       p0.S.g(NestedScrollViewManager.SPACING_TYPES[p1], p2);
       return;
    }
    public final void setBottomFillColor(ReactNestedScrollView p0,int p1){
       a.q(p0, "view");
       p0.setEndFillColor(p1);
    }
    public final void setDecelerationRate(ReactNestedScrollView p0,float p1){
       a.q(p0, "view");
       p0.setDecelerateRate(p1);
    }
    public final void setFadingEdgeLength(ReactNestedScrollView p0,int p1){
       a.q(p0, "view");
       if (p1 > 0) {
          p0.setVerticalFadingEdgeEnabled(true);
          p0.setFadingEdgeLength(p1);
       }else {
          p0.setVerticalFadingEdgeEnabled(false);
          p0.setFadingEdgeLength(false);
       }
       return;
    }
    public final void setInterceptVerticalScrollAngle(ReactNestedScrollView p0,int p1){
       a.q(p0, "view");
       p0.setInterceptVerticalScrollAngle(p1);
    }
    public final void setNestedScrollEnabled(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
    }
    public final void setOverScrollMode(ReactNestedScrollView p0,String p1){
       a.q(p0, "view");
       p0.setOverScrollMode(b.h(p1));
    }
    public final void setOverflow(ReactNestedScrollView p0,String p1){
       a.q(p0, "view");
       p0.setOverflow(p1);
    }
    public final void setPagingEnabled(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setPagingEnabled(p1);
    }
    public final void setParentPriorityHandlerTouch(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
    }
    public final void setPersistentScrollbar(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setScrollbarFadingEnabled((p1 ^ 0x01));
    }
    public final void setRemoveClippedSubviews(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setRemoveClippedSubviews(p1);
    }
    public final void setScrollEnabled(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setScrollEnabled(p1);
       p0.setFocusable(p1);
    }
    public final void setScrollPerfTag(ReactNestedScrollView p0,String p1){
       a.q(p0, "view");
    }
    public final void setSendMomentumEvents(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setNeedSendMomentumEvents(p1);
    }
    public final void setShowsVerticalScrollIndicator(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setVerticalScrollBarEnabled(p1);
    }
    public final void setSnapToEnd(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setSnapToEnd(p1);
    }
    public final void setSnapToInterval(ReactNestedScrollView p0,float p1){
       a.q(p0, "view");
       p0.setSnapToInterval((int)(p1 * c.d().density));
    }
    public final void setSnapToOffsets(ReactNestedScrollView p0,ReadableArray p1){
       a.q(p0, "view");
       if (p1 == null) {
          return;
       }
       DisplayMetrics density = c.d().density;
       ArrayList uArrayList = new ArrayList();
       int i1 = p1.size();
       for (int i = 0; i < i1; i = i + 1) {
          double d = p1.getDouble(i) * (double)density;
          uArrayList.add(Integer.valueOf((int)d));
       }
       p0.setSnapOffsets(uArrayList);
       return;
    }
    public final void setSnapToStart(ReactNestedScrollView p0,boolean p1){
       a.q(p0, "view");
       p0.setSnapToStart(p1);
    }
}
