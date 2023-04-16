package com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import ep8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lr.b;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.bridge.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.tkruntime.v8.JsValueRef;
import lr.a;
import com.tkruntime.v8.V8Function;
import java.util.Objects;
import ep8.g;
import androidx.recyclerview.widget.RecyclerView$i;
import ep8.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.recyclerview.widget.RecyclerView$s;
import java.lang.Integer;
import com.tachikoma.core.component.recyclerview.view.NestedRecyclerView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.ark.rtx.widget.listview.view.FixedNestedRecyclerView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import android.widget.HorizontalScrollView;
import com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import java.util.Map;
import android.view.ViewTreeObserver;
import kr.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.lang.Throwable;
import wp8.a;
import com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView$b;
import java.lang.Math;
import com.tkruntime.v8.V8Value;
import com.tachikoma.core.component.recyclerview.view.CustomRecyclerView;
import java.util.List;

public class RTXRecyclerView extends e	// class@000f9d
{
    public int dataCount;
    public boolean enableLoadMore;
    public boolean isHorizontal;
    public boolean isNestedScroll;
    public JsValueRef itemAppearCallbackRef;
    public JsValueRef itemDisappearCallbackRef;
    public JsValueRef itemTypeCallbackRef;
    public int itemViewCacheSize;
    public b mAdapter;
    public a mFooterAdapter;
    public a mHeaderAdapter;
    public d mHeaderFooterAdapter;
    public FixedNestedRecyclerView mRecyclerView;
    public int numColumns;
    public JsValueRef onEndReachedCallbackRef;
    public float onEndReachedThreshold;
    public JsValueRef onGetFooterCallbackRef;
    public JsValueRef onGetHeaderCallbackRef;
    public V8Function onScrollCallback;
    public JsValueRef onScrollCallbackRef;
    public HashMap recycledPoolCacheSize;
    public boolean scrollEnabled;
    public boolean showsHorizontalScrollIndicator;
    public boolean showsVerticalScrollIndicator;
    public JsValueRef updateItemCallbackRef;
    public boolean v;

    public void RTXRecyclerView(f p0){
       super(p0);
       this.isHorizontal = false;
       this.enableLoadMore = false;
       this.isNestedScroll = false;
       this.scrollEnabled = true;
       this.showsHorizontalScrollIndicator = false;
       this.showsVerticalScrollIndicator = false;
       this.getView();
    }
    public void appendDataCount(int p0){
       this.dataCount = this.dataCount + p0;
       this.v = true;
    }
    public void createAdapter(){
       RTXRecyclerView titemViewCac;
       Iterator iterator;
       Map$Entry uEntry;
       b uob1;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, RTXRecyclerView.class, "16")) {
          return;
       }
       b uob = new b(this.getContext(), this.getTKJSContext(), this.isHorizontal);
       this.mAdapter = uob;
       uob.j = this.updateItemCallbackRef;
       uob.k = this.itemAppearCallbackRef;
       uob.l = this.itemDisappearCallbackRef;
       uob.m = this.itemTypeCallbackRef;
       this.mHeaderFooterAdapter = new d(uob);
       RTXRecyclerView tonGetHeader = this.onGetHeaderCallbackRef;
       if (tonGetHeader != null && tonGetHeader.get() != null) {
          a uoa = new a(this.getContext(), this.getTKJSContext(), this.isHorizontal);
          this.mHeaderAdapter = uoa;
          uoa.K0(this.onGetHeaderCallbackRef.get());
          tonGetHeader = this.mHeaderFooterAdapter;
          RTXRecyclerView tmHeaderAdap = this.mHeaderAdapter;
          Objects.requireNonNull(tonGetHeader);
          if (!PatchProxy.applyVoidOneRefs(tmHeaderAdap, tonGetHeader, uod, "2")) {
             try{
                d g = tonGetHeader.g;
                if (!PatchProxy.applyVoidTwoRefs(tmHeaderAdap, g, tonGetHeader, uod, "4")) {
                   tonGetHeader.k = tmHeaderAdap;
                   g og = (g == null)? new g(tonGetHeader): tonGetHeader.g;
                   tonGetHeader.i = og;
                   tonGetHeader.k.F0(og);
                   tonGetHeader.k0();
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public NestedRecyclerView createViewInstance(Context p0){
       FixedNestedRecyclerView obj = PatchProxy.applyOneRefs(p0, this, RTXRecyclerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FixedNestedRecyclerView(p0);
       this.mRecyclerView = obj;
       obj.setMinimumHeight(100);
       this.mRecyclerView.setClipToPadding(false);
       this.mRecyclerView.setFocusableInTouchMode(false);
       this.mRecyclerView.setOverScrollMode(2);
       return this.mRecyclerView;
    }
    public ViewGroup getParentScrollView(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RTXRecyclerView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof ViewGroup) {
          return null;
       }
       if (!parent instanceof ScrollView && (parent instanceof NestedScrollView || parent instanceof HorizontalScrollView)) {
          return parent;
       }
       return this.getParentScrollView(parent);
    }
    public RecyclerView getRecyclerView(){
       return this.mRecyclerView;
    }
    public void onAttachToParent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "18")) {
          return;
       }
       super.onAttachToParent(p0);
       this.getRecyclerView().addOnScrollListener(new RTXRecyclerView$a(this));
       return;
    }
    public RecyclerView$LayoutManager onCreateLayoutManager(){
       Object obj = PatchProxy.apply(null, this, RTXRecyclerView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = this.isHorizontal ^ i;
       if (this.numColumns > i) {
          return new GridLayoutManager(this.getContext(), this.numColumns, i1, false);
       }
       return new LinearLayoutManager(this.getContext(), i1, false);
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       RTXRecyclerView rTXRecyclerV = RTXRecyclerView.class;
       if (PatchProxy.isSupport(rTXRecyclerV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, rTXRecyclerV, "19")) {
          return;
       }
       super.onDestroy(p0, p1);
       RTXRecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null) {
          Objects.requireNonNull(tmAdapter);
          if (!PatchProxy.applyVoid(null, tmAdapter, b.class, "6")) {
             tmAdapter.p.clear();
             tmAdapter.e = null;
          }
       }
       tmAdapter = this.recycledPoolCacheSize;
       if (tmAdapter != null) {
          tmAdapter.clear();
       }
       return;
    }
    public void onDiffFinish(){
       RTXRecyclerView rTXRecyclerV = RTXRecyclerView.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, rTXRecyclerV, "12")) {
          return;
       }
       RTXRecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null && tmAdapter.getItemCount() == this.dataCount) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, rTXRecyclerV, "15")) {
          if (this.mAdapter == null) {
             this.mRecyclerView.setIsHorizontal(this.isHorizontal);
             this.mRecyclerView.setIsNested(this.isNestedScroll);
             this.mRecyclerView.setLayoutManager(this.onCreateLayoutManager());
             if (this.isNestedScroll != null && !PatchProxy.applyVoid(objArray, this, rTXRecyclerV, "24")) {
                this.mRecyclerView.setNestedScrollingEnabled(false);
                this.mRecyclerView.setHasFixedSize(true);
                this.mRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
             }
             this.createAdapter();
             this.registerScrollListener();
          }
          this.refresh();
          this.v = false;
       }
       return;
    }
    public void onEndReached(){
       if (PatchProxy.applyVoid(null, this, RTXRecyclerView.class, "23")) {
          return;
       }
       RTXRecyclerView tonEndReache = this.onEndReachedCallbackRef;
       if (tonEndReache == null) {
          return;
       }
       if (y.a(tonEndReache.get())) {
          Object[] objArray = new Object[0];
          this.onEndReachedCallbackRef.get().call(null, objArray);
       }
       return;
    }
    public void refresh(){
       if (PatchProxy.applyVoid(null, this, RTXRecyclerView.class, "17")) {
          return;
       }
       RTXRecyclerView tmAdapter = this.mAdapter;
       RTXRecyclerView tdataCount = this.dataCount;
       RTXRecyclerView tv = this.v;
       Objects.requireNonNull(tmAdapter);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tdataCount), Boolean.valueOf(tv), tmAdapter, uob, "5")) {
          uob = tmAdapter.h;
          tmAdapter.h = tdataCount;
          if (tv != null && tdataCount > uob) {
             tmAdapter.r0(uob, (tdataCount - uob));
          }else {
             tmAdapter.n.clear();
             tmAdapter.k0();
          }
       }
       return;
    }
    public void registerScrollListener(){
       if (PatchProxy.applyVoid(null, this, RTXRecyclerView.class, "22")) {
          return;
       }
       if (this.mRecyclerView.getLayoutManager() == null) {
          return;
       }
       this.mRecyclerView.addOnScrollListener(new RTXRecyclerView$b(this));
       return;
    }
    public void scrollToIndex(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "13")) {
          return;
       }
       boolean b = true;
       String str = "animated";
       if (p0.contains(str)) {
          b = p0.getBoolean(str);
       }
       str = "index";
       if (p0.contains(str)) {
          int integer = p0.getInteger(str);
          if (b) {
             this.getRecyclerView().smoothScrollToPosition(integer);
          }else {
             this.getRecyclerView().scrollToPosition(integer);
          }
       }
       str = "viewPosition";
       if (p0.contains(str)) {
          double doublex = p0.getDouble(str);
          int width = (this.isHorizontal != null)? this.getRecyclerView().getWidth(): this.getRecyclerView().getHeight();
          double d = (double)width;
          width = (int)Math.min((doublex * d), d);
          if (b) {
             this.getRecyclerView().smoothScrollBy((- width), 0);
          }else {
             this.getRecyclerView().scrollBy((- width), 0);
          }
       }
       return;
    }
    public void setDataCount(int p0){
       this.dataCount = p0;
    }
    public void setHorizontalScrollIndicatorVisible(boolean p0){
       RTXRecyclerView rTXRecyclerV = RTXRecyclerView.class;
       if (PatchProxy.isSupport(rTXRecyclerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXRecyclerV, "10")) {
          return;
       }
       this.showsHorizontalScrollIndicator = p0;
       this.mRecyclerView.setHorizontalScrollBarEnabled(p0);
       return;
    }
    public void setItemTypeCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "1")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView titemTypeCal = this.itemTypeCallbackRef;
          if (titemTypeCal == null || !p0.jsEquals(titemTypeCal.get())) {
             y.c(this.itemTypeCallbackRef);
             this.itemTypeCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.itemTypeCallbackRef);
          this.itemTypeCallbackRef = null;
       }
       return;
    }
    public void setNestedScroll(boolean p0){
       this.isNestedScroll = p0;
    }
    public void setOnEndReachedCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "3")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView tonEndReache = this.onEndReachedCallbackRef;
          if (tonEndReache == null || !p0.jsEquals(tonEndReache.get())) {
             y.c(this.onEndReachedCallbackRef);
             this.onEndReachedCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.onEndReachedCallbackRef);
          this.onEndReachedCallbackRef = null;
       }
       return;
    }
    public void setOnGetFooterCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "6")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView tonGetFooter = this.onGetFooterCallbackRef;
          if (tonGetFooter == null || !p0.jsEquals(tonGetFooter.get())) {
             y.c(this.onGetFooterCallbackRef);
             this.onGetFooterCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.onGetFooterCallbackRef);
          this.onGetFooterCallbackRef = null;
       }
       return;
    }
    public void setOnGetHeaderCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "5")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView tonGetHeader = this.onGetHeaderCallbackRef;
          if (tonGetHeader == null || !p0.jsEquals(tonGetHeader.get())) {
             y.c(this.onGetHeaderCallbackRef);
             this.onGetHeaderCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.onGetHeaderCallbackRef);
          this.onGetHeaderCallbackRef = null;
       }
       return;
    }
    public void setOnItemAppear(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "7")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView titemAppearC = this.itemAppearCallbackRef;
          if (titemAppearC == null || !p0.jsEquals(titemAppearC.get())) {
             y.c(this.itemAppearCallbackRef);
             this.itemAppearCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.itemAppearCallbackRef);
          this.itemAppearCallbackRef = null;
       }
       return;
    }
    public void setOnItemDisappear(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "8")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView titemDisappe = this.itemDisappearCallbackRef;
          if (titemDisappe == null || !p0.jsEquals(titemDisappe.get())) {
             y.c(this.itemDisappearCallbackRef);
             this.itemDisappearCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.itemDisappearCallbackRef);
          this.itemDisappearCallbackRef = null;
       }
       return;
    }
    public void setOnScrollCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "4")) {
          return;
       }
       V8Function v8Function = null;
       if (p0 != null) {
          RTXRecyclerView tonScrollCal = this.onScrollCallbackRef;
          if (tonScrollCal == null || !p0.jsEquals(tonScrollCal.get())) {
             y.c(this.onScrollCallbackRef);
             this.onScrollCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.onScrollCallbackRef);
          this.onScrollCallbackRef = v8Function;
       }
       RTXRecyclerView tonScrollCal1 = this.onScrollCallbackRef;
       if (tonScrollCal1 != null) {
          v8Function = tonScrollCal1.get();
       }
       this.onScrollCallback = v8Function;
       return;
    }
    public void setScrollEnable(boolean p0){
       RTXRecyclerView rTXRecyclerV = RTXRecyclerView.class;
       if (PatchProxy.isSupport(rTXRecyclerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXRecyclerV, "9")) {
          return;
       }
       this.scrollEnabled = p0;
       this.mRecyclerView.setDisableScroll((p0 ^ 0x01));
       return;
    }
    public void setUpdateItemCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXRecyclerView.class, "2")) {
          return;
       }
       if (p0 != null) {
          RTXRecyclerView tupdateItemC = this.updateItemCallbackRef;
          if (tupdateItemC == null || !p0.jsEquals(tupdateItemC.get())) {
             y.c(this.updateItemCallbackRef);
             this.updateItemCallbackRef = y.b(p0, this);
          }
       }else {
          y.c(this.updateItemCallbackRef);
          this.updateItemCallbackRef = null;
       }
       return;
    }
    public void setVerticalScrollIndicatorVisible(boolean p0){
       RTXRecyclerView rTXRecyclerV = RTXRecyclerView.class;
       if (PatchProxy.isSupport(rTXRecyclerV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, rTXRecyclerV, "11")) {
          return;
       }
       this.showsVerticalScrollIndicator = p0;
       this.mRecyclerView.setVerticalScrollBarEnabled(p0);
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, RTXRecyclerView.class, "20")) {
          return;
       }
       super.unRetainAllJsObj();
       RTXRecyclerView tmAdapter = this.mAdapter;
       if (tmAdapter != null) {
          Objects.requireNonNull(tmAdapter);
          if (!PatchProxy.applyVoid(null, tmAdapter, b.class, "7")) {
             y.c(tmAdapter.j);
             tmAdapter.j = null;
             y.c(tmAdapter.m);
             tmAdapter.m = null;
             y.c(tmAdapter.k);
             tmAdapter.k = null;
             y.c(tmAdapter.l);
             tmAdapter.l = null;
             Iterator iterator = tmAdapter.i.iterator();
             while (iterator.hasNext()) {
                V8Object v8Object = iterator.next();
                if (v8Object != null) {
                   v8Object.setWeak();
                }
             }
             tmAdapter.i.clear();
          }
       }
       y.c(this.onEndReachedCallbackRef);
       this.onEndReachedCallbackRef = null;
       y.c(this.onScrollCallbackRef);
       this.onScrollCallbackRef = null;
       y.c(this.onGetFooterCallbackRef);
       this.onGetFooterCallbackRef = null;
       y.c(this.onGetHeaderCallbackRef);
       this.onGetHeaderCallbackRef = null;
       y.c(this.itemTypeCallbackRef);
       this.itemTypeCallbackRef = null;
       y.c(this.updateItemCallbackRef);
       this.updateItemCallbackRef = null;
       y.c(this.itemAppearCallbackRef);
       this.itemAppearCallbackRef = null;
       y.c(this.itemDisappearCallbackRef);
       this.itemDisappearCallbackRef = null;
       return;
    }
}
