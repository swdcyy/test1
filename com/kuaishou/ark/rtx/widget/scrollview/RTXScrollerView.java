package com.kuaishou.ark.rtx.widget.scrollview.RTXScrollerView;
import or.b;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.kuaishou.ark.rtx.widget.RTXView;
import gx4.f$a;
import gx4.e;
import com.tkruntime.v8.V8Object;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import iq8.n;
import android.view.View;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tachikoma.core.component.view.TKView;
import java.lang.Integer;
import tx4.y;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Function;
import java.lang.Throwable;
import wp8.a;
import java.lang.Boolean;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.tachikoma.core.component.TKYogaLayout;
import com.tachikoma.core.yoga.layout.YogaLayout;
import com.kuaishou.ark.rtx.widget.scrollview.view.HScrollerView;
import yp8.a;
import jq8.a;
import com.facebook.yoga.YogaFlexDirection;
import com.kuaishou.ark.rtx.widget.scrollview.view.VScrollerView;
import or.a;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;
import com.kuaishou.ark.rtx.widget.scrollview.RTXScrollerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.System;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import com.kuaishou.ark.rtx.widget.scrollview.a;
import java.lang.Runnable;
import iq8.x;
import nr.a;
import com.tkruntime.v8.JsValueRef;
import java.util.Objects;
import lg.g;
import com.facebook.yoga.YogaEdge;

public class RTXScrollerView extends e implements b, RefreshLayout$g	// class@000fa0
{
    public boolean isHorizontal;
    public boolean isNestedScroll;
    public RecyclerView mChildRecyclerView;
    public a mScrollView;
    public V8Function onRefresh;
    public JsValueRef onRefreshRef;
    public V8Function onScrollBeginDrag;
    public JsValueRef onScrollBeginDragRef;
    public V8Function onScrollCallback;
    public JsValueRef onScrollCallbackRef;
    public V8Function onScrollEndDrag;
    public JsValueRef onScrollEndDragRef;
    public int onScrollOverPosition;
    public boolean pagingEnabled;
    public boolean refreshing;
    public boolean scrollEnabled;
    public boolean showsHorizontalScrollIndicator;
    public boolean showsVerticalScrollIndicator;
    public RTXView v;
    public boolean w;
    public long x;
    public boolean y;

    public void RTXScrollerView(f p0){
       super(p0);
       this.pagingEnabled = false;
       this.isHorizontal = false;
       this.isNestedScroll = false;
       this.scrollEnabled = true;
       this.showsHorizontalScrollIndicator = true;
       this.showsVerticalScrollIndicator = true;
       this.y = false;
       if (PatchProxy.applyVoidOneRefs(this.getContext(), this, RTXScrollerView.class, "1")) {
       }else {
          V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.getJSContext().g(), "RTXElement");
          RTXView rTXView = new RTXView(new f$a(this.getTKContext(), v8ObjectProx).a());
          this.v = rTXView;
          v8ObjectProx.setNativeObject(rTXView);
       }
       return;
    }
    private int k(HashMap p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RTXScrollerView.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          if (p0 == null || (!TextUtils.isEmpty(p1) && p0.containsKey(p1))) {
             return n.b(p0.get(p1).intValue());
          }
          return 0;
       }catch(java.lang.Exception e0){
       }
    }
    public void add(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "12")) {
          return;
       }
       this.v.addChild(p0);
       return;
    }
    public void addBefore(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXScrollerView.class, "18")) {
          return;
       }
       this.v.addBefore(p0, p1);
       return;
    }
    public void addChild(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "17")) {
          return;
       }
       this.v.addChild(p0);
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public CustomRefreshLayout createViewInstance(Context p0){
       CustomRefreshLayout obj = PatchProxy.applyOneRefs(p0, this, RTXScrollerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CustomRefreshLayout(p0);
       obj.setEnabled(false);
       return obj;
    }
    public RecyclerView findRecyclerView(ViewGroup p0){
       View childAt;
       Object obj = PatchProxy.applyOneRefs(p0, this, RTXScrollerView.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i);
          if (childAt instanceof RecyclerView) {
             break ;
          }else if(childAt instanceof ViewGroup){
             RecyclerView recyclerView = this.findRecyclerView(childAt);
             if (recyclerView != null) {
                return recyclerView;
             }
          }
          i = i + 1;
       }
       return childAt;
    }
    public V8Object getSubview(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RTXScrollerView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getSubview(p0);
    }
    public void insertBefore(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXScrollerView.class, "15")) {
          return;
       }
       this.v.addBefore(p0, p1);
       return;
    }
    public final void m(int p0,int p1){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, rTXScrollerV, "29")) {
          return;
       }
       if (!y.a(this.onScrollCallback)) {
          return;
       }
       V8Object v8Object = this.getJSContext().l();
       V8Object v8Object1 = this.getJSContext().l();
       v8Object1.add("x", p0);
       v8Object1.add("y", p1);
       v8Object.add("contentOffset", v8Object1);
       Object[] objArray = new Object[]{v8Object};
       this.onScrollCallback.call(null, objArray);
       v8Object1.setWeak();
       v8Object.setWeak();
       return;
    }
    public final void n(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "33")) {
          return;
       }
       CustomRefreshLayout view = this.getView();
       if (view != null) {
          view.setEnabled(p0);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, rTXScrollerV, "31")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().setOnRefreshListener(null);
       }
       super.onDestroy(p0, p1);
       RTXScrollerView tv = this.v;
       if (tv != null && tv.getView() != null) {
          this.v.getView().removeAllViews();
          this.v.getView().g();
       }
       return;
    }
    public void onDiffFinish(){
       if (PatchProxy.applyVoid(null, this, RTXScrollerView.class, "20")) {
          return;
       }
       if (this.mScrollView == null) {
          boolean b = false;
          if (this.isHorizontal != null) {
             this.n(b);
             this.mScrollView = new HScrollerView(this.getContext());
             this.v.getDomNode().c().r(YogaFlexDirection.ROW);
          }else {
             this.mScrollView = new VScrollerView(this.getContext());
          }
          this.mScrollView.g(b);
          this.mScrollView.h(true);
          this.getView().addView(this.mScrollView.getView());
          this.mScrollView.f(this.v.getView());
          this.mScrollView.e(this);
          this.setHorizontalScrollIndicatorVisible(this.showsHorizontalScrollIndicator);
          this.setVerticalScrollIndicatorVisible(this.showsVerticalScrollIndicator);
          this.mScrollView.c(this.isNestedScroll);
          this.mScrollView.getView().getViewTreeObserver().addOnGlobalLayoutListener(new RTXScrollerView$a(this));
       }
       this.mScrollView.setScrollEnabled(this.scrollEnabled);
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, RTXScrollerView.class, "30")) {
          return;
       }
       if (!y.a(this.onRefresh)) {
          return;
       }
       Object[] objArray = new Object[0];
       this.onRefresh.call(null, objArray);
       return;
    }
    public void onScrollChange(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RTXScrollerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RTXScrollerView.class, "28")) {
          return;
       }
       if (!y.a(this.onScrollCallback)) {
          return;
       }
       RTXScrollerView tonScrollOve = this.onScrollOverPosition;
       if (tonScrollOve > null) {
          p3 = (this.isHorizontal != null)? p0: p1;
          RTXScrollerView tw = this.w;
          if (tw != null || (p3 > (tonScrollOve + 20) || (tw != null && p3 < (tonScrollOve - 20)))) {
             this.w = tw ^ 0x01;
             this.m(p0, p1);
          }
          return;
       }else {
          long l = System.currentTimeMillis();
          if ((l - this.x) - 10 < 0) {
             return;
          }
          this.x = l;
          this.m(p0, p1);
          return;
       }
    }
    public void remove(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "13")) {
          return;
       }
       this.v.remove(p0);
       return;
    }
    public void removeAll(){
       if (PatchProxy.applyVoid(null, this, RTXScrollerView.class, "14")) {
          return;
       }
       this.v.removeAll();
       return;
    }
    public void replace(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXScrollerView.class, "16")) {
          return;
       }
       this.v.replace(p0, p1);
       return;
    }
    public void scrollTo(V8Object p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, rTXScrollerV, "21")) {
          return;
       }
       String str = "animated";
       boolean booleanx = (p0.contains(str))? p0.getBoolean(str): false;
       String str1 = "x";
       int i = -1;
       int integer = (p0.contains(str1))? p0.getInteger(str1): -1;
       if (p0.contains("y")) {
          i = p0.getInteger("y");
       }
       RTXScrollerView tisHorizonta = this.isHorizontal;
       if (tisHorizonta == null || (integer < 0 || (tisHorizonta == null && i < 0))) {
          return;
       }else if(tisHorizonta != null){
          if (booleanx) {
             this.mScrollView.getView().smoothScrollTo(integer, this.mScrollView.getView().getScrollY());
          }else {
             this.mScrollView.getView().scrollTo(integer, this.mScrollView.getView().getScrollY());
          }
       }else if(!i){
          if (!PatchProxy.isSupport(rTXScrollerV) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(booleanx), this, rTXScrollerV, "22")) {
             tisHorizonta = this.mChildRecyclerView;
             int i1 = 1;
             tisHorizonta = (tisHorizonta != null && tisHorizonta.isNestedScrollingEnabled())? 1: null;
             if (tisHorizonta) {
                this.mChildRecyclerView.scrollToPosition(0);
                if (this.mScrollView.getView().getNestedScrollAxes() & 0x02) {
                   this.mChildRecyclerView.stopNestedScroll(0);
                   this.mChildRecyclerView.stopNestedScroll(i1);
                }
                x.d(new a(this, booleanx), 50);
             }else if(booleanx){
                this.mScrollView.getView().smoothScrollTo(this.mScrollView.getView().getScrollX(), 0);
             }else {
                this.mScrollView.getView().scrollTo(this.mScrollView.getView().getScrollX(), 0);
             }
          }
       }else if(booleanx){
          this.mScrollView.getView().smoothScrollTo(this.mScrollView.getView().getScrollX(), i);
       }else {
          this.mScrollView.getView().scrollTo(this.mScrollView.getView().getScrollX(), i);
       }
       return;
    }
    public void scrollToEnd(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "23")) {
          return;
       }
       String str = "options";
       if (p0.contains(str)) {
          p0 = p0.getObject(str);
          if (p0.contains("animated")) {
             p0.getBoolean("animated");
          }
       }
       x.f(new a(this));
       return;
    }
    public void setHorizontalScrollIndicatorVisible(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "10")) {
          return;
       }
       this.showsHorizontalScrollIndicator = p0;
       rTXScrollerV = this.mScrollView;
       if (rTXScrollerV != null) {
          rTXScrollerV.i(p0);
       }
       return;
    }
    public void setNestedScroll(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "3")) {
          return;
       }
       this.isNestedScroll = p0;
       rTXScrollerV = this.mScrollView;
       if (rTXScrollerV != null) {
          rTXScrollerV.c(p0);
       }
       return;
    }
    public void setOnRefresh(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "7")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onRefreshRef);
       this.onRefreshRef = jsValueRef;
       jsValueRef = (jsValueRef == null)? null: jsValueRef.get();
       this.onRefresh = jsValueRef;
       if (jsValueRef != null) {
          this.n(true);
          this.getView().setOnRefreshListener(this);
       }else {
          this.n(false);
          this.getView().setOnRefreshListener(null);
       }
       return;
    }
    public void setOnScrollBeginDrag(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "8")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollBeginDragRef);
       this.onScrollBeginDragRef = jsValueRef;
       jsValueRef = (jsValueRef == null)? null: jsValueRef.get();
       this.onScrollBeginDrag = jsValueRef;
       return;
    }
    public void setOnScrollCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "5")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollCallbackRef);
       this.onScrollCallbackRef = jsValueRef;
       jsValueRef = (jsValueRef == null)? null: jsValueRef.get();
       this.onScrollCallback = jsValueRef;
       return;
    }
    public void setOnScrollEndDrag(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "9")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollEndDragRef);
       this.onScrollEndDragRef = jsValueRef;
       jsValueRef = (jsValueRef == null)? null: jsValueRef.get();
       this.onScrollEndDrag = jsValueRef;
       return;
    }
    public void setRefreshing(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "6")) {
          return;
       }
       this.refreshing = p0;
       this.getView().setRefreshing(p0);
       return;
    }
    public void setScrollEnable(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "4")) {
          return;
       }
       this.scrollEnabled = p0;
       rTXScrollerV = this.mScrollView;
       if (rTXScrollerV != null) {
          rTXScrollerV.setScrollEnabled(p0);
       }
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXScrollerView.class, "25")) {
          return;
       }
       String str = "paddingLeft";
       int i = this.k(p0, str);
       String str1 = "paddingTop";
       int i1 = this.k(p0, str1);
       String str2 = "paddingRight";
       int i2 = this.k(p0, str2);
       int i3 = this.k(p0, "paddingBottom");
       if (p0 != null) {
          p0.remove(str);
          p0.remove(str2);
          p0.remove(str1);
          p0.remove("paddingBottom");
       }
       super.setStyle(p0);
       a uoa = this.v.getDomNode().c();
       a uoa1 = this.getDomNode().c();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(uoa1, uoa, a.class, "16")) {
          uoa = uoa.a;
          if (uoa != null && uoa1 != null) {
             uoa.d(uoa1.m());
          }
       }
       this.v.getDomNode().c().z(YogaEdge.LEFT, (float)i);
       this.v.getDomNode().c().z(YogaEdge.TOP, (float)i1);
       this.v.getDomNode().c().z(YogaEdge.RIGHT, (float)i2);
       this.v.getDomNode().c().z(YogaEdge.BOTTOM, (float)i3);
       return;
    }
    public void setVerticalScrollIndicatorVisible(boolean p0){
       RTXScrollerView rTXScrollerV = RTXScrollerView.class;
       if (PatchProxy.isSupport(rTXScrollerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXScrollerV, "11")) {
          return;
       }
       this.showsVerticalScrollIndicator = p0;
       rTXScrollerV = this.mScrollView;
       if (rTXScrollerV != null) {
          rTXScrollerV.d(p0);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, RTXScrollerView.class, "32")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onRefreshRef);
       this.onRefresh = null;
       RTXScrollerView tv = this.v;
       if (tv != null && tv.getView() != null) {
          this.v.unRetainJsObj();
       }
       y.c(this.onScrollCallbackRef);
       this.onScrollCallback = null;
       y.c(this.onScrollBeginDragRef);
       this.onScrollBeginDrag = null;
       y.c(this.onScrollEndDragRef);
       this.onScrollEndDrag = null;
       return;
    }
}
