package com.tachikoma.component.listview.TKListView2;
import xn8.a;
import android.view.View$OnAttachStateChangeListener;
import bo8.a$b;
import com.tachikoma.core.component.e;
import gx4.f;
import com.tachikoma.component.listview.TKListView2$LayoutMode;
import com.tachikoma.component.scroll.constants.OverScrollMode;
import java.lang.String;
import java.lang.Enum;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ep8.d;
import yn8.a;
import java.lang.Math;
import com.tachikoma.component.listview.view.TKNestedRecyclerView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import java.lang.Integer;
import android.content.Context;
import com.tachikoma.component.common.refresh.TKRefreshLayout;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import xn8.c;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout;
import bo8.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import zn8.a;
import com.tachikoma.component.listview.TKListView2$a;
import java.lang.Runnable;
import java.lang.IndexOutOfBoundsException;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import zp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.component.listview.TKListView2$b;
import iq8.x;
import java.lang.Float;
import com.tkruntime.v8.JsValueRef;
import iq8.n;
import no8.a;
import com.tkruntime.v8.V8Value;
import ep8.d$b;
import gx4.c;
import com.tachikoma.core.component.view.TKView;
import android.view.ViewParent;
import java.lang.IllegalArgumentException;
import com.tachikoma.component.common.refresh.TKRefreshControl2;
import java.util.Iterator;
import java.lang.Long;
import xn8.e;
import java.lang.reflect.Field;
import java.lang.Exception;
import java.util.HashMap;
import com.tachikoma.component.listview.TKListView2$c;
import com.tachikoma.component.listview.layoutmanager.TKStaggeredGridLayoutManager;
import java.lang.ref.WeakReference;
import com.tachikoma.component.listview.layoutmanager.TKGridLayoutManger;
import com.tachikoma.component.listview.layoutmanager.TKLinearLayoutManger;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import ep8.e;
import androidx.recyclerview.widget.GridLayoutManager$b;
import zn8.d;
import zn8.b;
import zn8.c;

public class TKListView2 extends e implements a, View$OnAttachStateChangeListener, a$b	// class@000d0e
{
    public TKListView2$LayoutMode A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public Runnable M;
    public JsValueRef N;
    public TKRefreshControl2 O;
    public TKView P;
    public TKView Q;
    public JsValueRef R;
    public JsValueRef S;
    public JsValueRef T;
    public JsValueRef U;
    public JsValueRef V;
    public JsValueRef W;
    public JsValueRef X;
    public V8Function bindDataFun;
    public V8Function createViewFun;
    public V8Function getItemsLayout;
    public V8Function getItemsTypeFun;
    public V8Function onFooterShow;
    public V8Function onHeaderShow;
    public V8Function onProgressUpdatedFun;
    public V8Function onScrollStateChangedCallback;
    public JsValueRef onScrollStateChangedCallbackRef;
    public V8Function onSnap;
    public V8Function onVisibleItemsChangedFun;
    public String overScrollMode;
    public List repeatedItemLayouts;
    public List repeatedItemTypes;
    public boolean scrollEnabled;
    public long scrollEventThrottle;
    public boolean showScrollIndicator;
    public int snapType;
    public a v;
    public d w;
    public TKNestedRecyclerView x;
    public a y;
    public RecyclerView$LayoutManager z;

    public void TKListView2(f p0){
       super(p0);
       this.A = TKListView2$LayoutMode.LIST;
       this.B = 2;
       this.D = true;
       this.E = -1;
       this.F = -1;
       this.snapType = 0;
       this.overScrollMode = OverScrollMode.never.name();
       this.scrollEnabled = true;
       this.scrollEventThrottle = 400;
       this.showScrollIndicator = false;
       this.getView();
    }
    public void calculateVisibleItems(){
       int i4;
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "54")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       if (this.onVisibleItemsChangedFun == null && (this.onFooterShow == null && this.onHeaderShow == null)) {
          return;
       }
       int i = this.w.M0();
       int i1 = 0;
       int i2 = Math.max((this.v.getItemCount() - 1), i1);
       int i3 = this.x.y();
       TKListView2 tx = this.x;
       Objects.requireNonNull(tx);
       Object[] obj = PatchProxy.apply(null, tx, TKNestedRecyclerView.class, "20");
       if (obj != PatchProxyResult.class) {
          i4 = obj.intValue();
       }else {
          TKNestedRecyclerView j = tx.j;
          if (j != null) {
             if (j instanceof LinearLayoutManager) {
                i4 = j.c();
             }else if(j instanceof StaggeredGridLayoutManager){
                int[] ointArray = j.findLastVisibleItemPositions(tx.getTempVisibleArray());
                int len = ointArray.length;
                int i5 = 0;
                int i6 = -1;
                while (i5 < len) {
                   int i7 = ointArray[i5];
                   if (i6 == -1 || (i7 >= 0 && i7 > i6)) {
                      i6 = i7;
                   }
                   i5 = i5 + 1;
                }
                i4 = i6;
             }
          }
          i4 = -1;
       }
       if (i3 != -1 && i4 != -1) {
          if (!i3) {
             if (this.K == null && i > 0) {
                this.K = true;
                if (!PatchProxy.applyVoid(null, this, TKListView2.class, "49") && y.a(this.onHeaderShow)) {
                   Object[] objArray1 = new Object[i1];
                   this.onHeaderShow.call(null, objArray1);
                }
             }
          }else {
             this.K = i1;
          }
          i3 = Math.max(i1, (i3 - i));
          if (i3 > i2) {
             return;
          }else {
             i4 = i4 - i;
             if (i4 < 0) {
                return;
             }else if(i4 > i2){
                if (this.L == null && this.Q != null) {
                   this.L = true;
                   if (!PatchProxy.applyVoid(null, this, TKListView2.class, "50") && y.a(this.onFooterShow)) {
                      obj = new Object[i1];
                      this.onFooterShow.call(null, obj);
                   }
                }
             }else {
                this.L = i1;
             }
             i = Math.min(Math.max(i3, i4), i2);
             if (i3 == this.I && i == this.J) {
                return;
             }else if(PatchProxy.isSupport(TKListView2.class) && (PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(i), this, TKListView2.class, "48") || !y.a(this.onVisibleItemsChangedFun))){
                Object[] objArray = new Object[]{Integer.valueOf(i3),Integer.valueOf(i)};
                this.onVisibleItemsChangedFun.call(null, objArray);
             }
          label_0149 :
             this.I = i3;
             this.J = i;
          }
       }
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKRefreshLayout createViewInstance(Context p0){
       f obj = PatchProxy.applyOneRefs(p0, this, TKListView2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mInitParams.b;
       if (obj != null && (obj.length > 0 && obj[0] instanceof Boolean)) {
          this.H = obj[0].booleanValue();
       }
    label_0029 :
       if (!PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "2")) {
          TKNestedRecyclerView tKNestedRecy = new TKNestedRecyclerView(p0);
          a uoa = new a(this.getTKJSContext(), this.H);
          this.v = uoa;
          d uod = new d(uoa);
          this.w = uod;
          tKNestedRecy.setAdapter(uod);
          tKNestedRecy.setScrollListener(this);
          tKNestedRecy.setItemAnimator(null);
          this.x = tKNestedRecy;
          tKNestedRecy.addOnScrollListener(new c(this));
       }
       TKRefreshLayout tKRefreshLay = new TKRefreshLayout(p0);
       tKRefreshLay.setEnabled(0);
       tKRefreshLay.addView(this.x);
       tKRefreshLay.setNestedScrollingEnabled(0);
       tKRefreshLay.addOnAttachStateChangeListener(this);
       return tKRefreshLay;
    }
    public void destroyOnMainThread(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "57")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().removeOnAttachStateChangeListener(this);
       }
       if (this.P != null) {
          this.P = null;
       }
       if (this.Q != null) {
          this.Q = null;
       }
       if (this.O != null) {
          this.O = null;
       }
       TKListView2 ty = this.y;
       if (ty != null) {
          ty.t(null);
       }
       this.x = null;
       this.z = null;
       return;
    }
    public List getChildren(){
       ArrayList obj = PatchProxy.apply(null, this, TKListView2.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       TKListView2 tP = this.P;
       if (tP != null) {
          obj.add(tP);
       }
       tP = this.v;
       if (tP != null) {
          obj.addAll(tP.K0());
       }
       tP = this.Q;
       if (tP != null) {
          obj.add(tP);
       }
       return obj;
    }
    public final int getRealPosition(int p0){
       if (this.P != null) {
          p0++;
       }
       return p0;
    }
    public final a m(){
       TKListView2 obj = PatchProxy.apply(null, this, TKListView2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          return null;
       }
       return obj.getItemDecoration();
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "53")) {
          return;
       }
       if (this.onVisibleItemsChangedFun == null && (this.onFooterShow == null && this.onHeaderShow == null)) {
          return;
       }
       if (this.M == null) {
          this.M = new TKListView2$a(this);
       }
       this.getView().post(this.M);
       return;
    }
    public void notifyAllRemoved(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKListView2.class, "43")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(objArray, tv, a.class, "9") && tv.m == null) {
          tv.k = 0;
          if (!tv.p.isEmpty()) {
             tv.p.clear();
          }
          tv.k0();
       }
       this.n();
       return;
    }
    public void notifyDataSetChanged(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "37")) {
          return;
       }
       this.v.J0(p0);
       this.n();
       return;
    }
    public void notifyFooterChanged(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "23")) {
          return;
       }
       if (this.Q != null) {
          this.w.R0();
          this.w.k0();
       }
       return;
    }
    public void notifyHeaderChanged(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "22")) {
          return;
       }
       if (this.P != null) {
          this.w.R0();
          this.w.k0();
       }
       return;
    }
    public void notifyItemChanged(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "44")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tv, uoa, "10") && tv.m == null)) {
          if (tv.M0()) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(Integer.valueOf(p0));
             List list = tv.T0(uArrayList);
             if (list != null && !list.isEmpty()) {
                if (p0 >= 0 && p0 < tv.p.size()) {
                   tv.p.set(p0, list.get(0));
                }else {
                   a.d(tv.e, new IndexOutOfBoundsException());
                }
             }
          }
          tv.l0(p0);
       }
       this.n();
       return;
    }
    public void notifyItemInserted(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "38")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tv, uoa, "4") && tv.m == null)) {
          if (tv.M0()) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(Integer.valueOf(p0));
             List list = tv.T0(uArrayList);
             if (list != null && !list.isEmpty()) {
                if (p0 >= 0 && p0 <= tv.p.size()) {
                   tv.p.add(p0, list.get(0));
                }else {
                   a.d(tv.e, new IndexOutOfBoundsException());
                }
             }
          }
          tv.k = tv.k + 1;
          tv.n0(p0);
       }
       this.n();
       return;
    }
    public void notifyItemMoved(int p0,int p1){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKListView2.class, "42")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tv, uoa, "8") && tv.m == null)) {
          if (!tv.p.isEmpty()) {
             if (p0 >= 0 && p0 < tv.p.size()) {
                int i = tv.p.remove(p0).intValue();
                if (p1 >= 0 && p1 <= tv.p.size()) {
                   tv.p.add(p1, Integer.valueOf(i));
                }else {
                   a.d(tv.e, new IndexOutOfBoundsException());
                }
             }else {
                a.d(tv.e, new IndexOutOfBoundsException());
             }
          }
          tv.o0(p0, p1);
       }
       this.n();
       return;
    }
    public void notifyItemRangeChanged(int p0,int p1){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKListView2.class, "45")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tv, uoa, "11") && tv.m == null)) {
          if (tv.M0()) {
             ArrayList uArrayList = new ArrayList();
             int i = 0;
             for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
                int i2 = p0 + i1;
                uArrayList.add(Integer.valueOf(i2));
             }
             List list = tv.T0(uArrayList);
             if (list != null || !tv.p.isEmpty()) {
                while (i < list.size()) {
                   i1 = p0 + i;
                   if (i1 >= 0 && i1 < tv.p.size()) {
                      tv.p.set(i1, list.get(i));
                   }else {
                      a.d(tv.e, new IndexOutOfBoundsException());
                   }
                   i = i + 1;
                }
             }
          }
          tv.p0(p0, p1);
       }
       this.n();
       return;
    }
    public void notifyItemRangeInserted(int p0,int p1){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKListView2.class, "39")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tv, uoa, "5") || (tv.m == null && p1 > 0))) {
          if (tv.M0()) {
             ArrayList uArrayList = new ArrayList();
             for (int i = 0; i < p1; i = i + 1) {
                int i1 = p0 + i;
                uArrayList.add(Integer.valueOf(i1));
             }
             List list = tv.T0(uArrayList);
             if (list != null && !list.isEmpty()) {
                if (p0 >= 0 && p0 <= tv.p.size()) {
                   tv.p.addAll(p0, list);
                }else {
                   a.d(tv.e, new IndexOutOfBoundsException());
                }
             }
          }
          tv.k = tv.k + p1;
          tv.r0(p0, p1);
       }
    label_0088 :
       this.n();
       return;
    }
    public void notifyItemRangeRemoved(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKListView2.class, "41")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tv, uoa, "7") || (tv.m == null && p1 > 0))) {
          if (!tv.p.isEmpty()) {
             i = Math.max(0, p0);
             int i1 = Math.min(((i + p1) - 1), (tv.p.size() - 1));
             while (i1 >= i) {
                if (i1 < tv.p.size()) {
                   tv.p.remove(i1);
                }else {
                   a.d(tv.e, new IndexOutOfBoundsException());
                }
                i1 = i1 - 1;
             }
          }
          i = tv.k - p1;
          tv.k = i;
          tv.k = Math.max(0, i);
          tv.s0(p0, p1);
       }
    label_0088 :
       this.n();
       return;
    }
    public void notifyItemRemoved(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "40")) {
          return;
       }
       TKListView2 tv = this.v;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tv, uoa, "6") && tv.m == null)) {
          if (!tv.p.isEmpty()) {
             if (p0 >= 0 && p0 < tv.p.size()) {
                tv.p.remove(p0);
             }else {
                a.d(tv.e, new IndexOutOfBoundsException());
             }
          }
          int i = tv.k - 1;
          tv.k = i;
          tv.k = Math.max(0, i);
          tv.t0(p0);
       }
       this.n();
       return;
    }
    public final void o(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "21")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (this.H != null) {
          if (layoutParams == null) {
             layoutParams = new RecyclerView$LayoutParams(-2, -1);
          }else {
             layoutParams.width = -2;
             layoutParams.height = -1;
          }
       }else if(layoutParams == null){
          layoutParams = new RecyclerView$LayoutParams(-1, -2);
       }else {
          layoutParams.width = -1;
          layoutParams.height = -2;
       }
       try{
          p0.setLayoutParams(layoutParams);
       }catch(java.lang.Exception e5){
          a.g("updateLayoutParams error", e5);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKListView2.class, "56")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.v.onDestroy();
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKListView2$b(this));
       }
       return;
    }
    public void onProgressUpdated(float p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TKListView2.class, "46")) {
          return;
       }
       if (!y.a(this.onProgressUpdatedFun)) {
          return;
       }
       Object[] objArray = new Object[]{Float.valueOf(p0)};
       this.onProgressUpdatedFun.call(null, objArray);
       return;
    }
    public void onScrollStateChanged(int p0){
       String str;
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "47")) {
          return;
       }
       if (!y.a(this.onScrollStateChangedCallback)) {
          return;
       }
       int i = 1;
       if (p0 != i) {
          str = (p0 != 2)? "idle": "settling";
       }else {
          str = "dragging";
       }
       Object[] objArray = new Object[i];
       objArray[0] = str;
       this.onScrollStateChangedCallback.call(null, objArray);
       return;
    }
    public void onSnap(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "51")) {
          return;
       }
       TKListView2 tN = this.N;
       if (tN != null && y.a(tN.get())) {
          int i = 1;
          int i1 = (this.P != null)? 1: 0;
          p0 = p0 - i1;
          if (this.Q != null && p0 >= this.v.getItemCount()) {
             p0 = -2;
          }
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          this.N.get().call(null, objArray);
       }
    label_005c :
       return;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "58")) {
          return;
       }
       TKListView2 tx = this.x;
       if (tx != null) {
          this.onScrollStateChanged(tx.getScrollState());
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
    public void scrollBy(int p0,int p1,boolean p2,int p3,boolean p4){
       if (PatchProxy.isSupport(TKListView2.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TKListView2.class, "35")) {
             return;
          }
       }
       if (this.x == null) {
          return;
       }else {
          p0 = n.b(p0);
          p1 = n.b(p1);
          if (p2) {
             this.x.C(p0, p1, p3, p4);
          }else {
             this.x.scrollBy(p0, p1);
          }
          return;
       }
    }
    public void scrollToPosition(int p0,boolean p1,int p2){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, TKListView2.class, "32")) {
          return;
       }
       p0 = this.getRealPosition(p0);
       TKListView2 tx = this.x;
       if (tx == null) {
          return;
       }
       if (p1) {
          Objects.requireNonNull(tx);
          if (!PatchProxy.isSupport(TKNestedRecyclerView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p2), tx, TKNestedRecyclerView.class, "13")) {
             tx.E(p0, 0, p2);
          }
       }else {
          tx.scrollToPosition(p0);
          this.n();
       }
       return;
    }
    public void scrollToPositionToCenter(int p0,int p1){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKListView2.class, "33")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       this.x.D(this.getRealPosition(p0), p1);
       return;
    }
    public void scrollToPositionWithOffset(int p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKListView2.class, "34")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       p0 = this.getRealPosition(p0);
       if (p1) {
          this.x.E(p0, n.b(p2), p3);
       }else {
          this.x.B(p0, n.b(p2));
          this.n();
       }
       return;
    }
    public void setBindDataFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "28")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_bindData");
       }
       y.c(this.V);
       JsValueRef jsValueRef = y.b(p0, this);
       this.V = jsValueRef;
       this.bindDataFun = jsValueRef.get();
       this.v.R0(this.V);
       return;
    }
    public void setCreateViewFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "27")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_createView");
       }
       y.c(this.U);
       JsValueRef jsValueRef = y.b(p0, this);
       this.U = jsValueRef;
       this.createViewFun = jsValueRef.get();
       this.v.S0(this.U);
       return;
    }
    public void setFooter(V8Object p0){
       View view;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "18")) {
          return;
       }
       TKListView2 tQ = this.Q;
       if (tQ != null) {
          TKListView2 tw = this.w;
          view = tQ.getView();
          Objects.requireNonNull(tw);
          Object obj = PatchProxy.applyOneRefs(view, tw, uod, "19");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else if(tw.f.d(view)){
             tw.S0();
          }
          this.Q.unRetainJsObj();
          this.Q.detachToRoot();
       }
       int i = 0;
       if (p0 == null) {
          this.Q = null;
          if (this.m() != null) {
             this.m().i(i);
          }
          return;
       }else {
          TKView nativeModule = this.getNativeModule(p0);
          this.Q = nativeModule;
          if (nativeModule == null) {
             if (this.m() != null) {
                this.m().i(i);
             }
             return;
          }else {
             nativeModule.retainJsObj();
             this.isAttachedToRoot();
             i = -2;
             int i1 = -1;
             RecyclerView$LayoutParams layoutParams = (this.H != null)? new RecyclerView$LayoutParams(i, i1): new RecyclerView$LayoutParams(i1, i);
             tQ = this.w;
             View view1 = this.Q.getView();
             Objects.requireNonNull(tQ);
             if (!PatchProxy.applyVoidTwoRefs(view1, layoutParams, tQ, uod, "25")) {
                if (view1 != null) {
                   if (view1.getParent() instanceof ViewGroup && view1.getParent() != tQ.f) {
                      view1.getParent().removeView(view1);
                   }
                   view1.setLayoutParams(layoutParams);
                   if (tQ.f.a(view1)) {
                      tQ.S0();
                   }
                }else {
                   throw new IllegalArgumentException("the view to add must not be null!");
                }
             }
             this.n();
             if (this.m() != null) {
                this.m().i(this.w.L0());
             }
             return;
          }
       }
    }
    public void setGetItemsLayoutFun(V8Function p0){
    }
    public void setGetItemsTypeFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "26")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_getItemsType");
       }
       y.c(this.T);
       JsValueRef jsValueRef = y.b(p0, this);
       this.T = jsValueRef;
       this.getItemsTypeFun = jsValueRef.get();
       this.v.Q0(this.T);
       return;
    }
    public void setHeader(V8Object p0){
       View view;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "17")) {
          return;
       }
       TKListView2 tP = this.P;
       if (tP != null) {
          TKListView2 tw = this.w;
          view = tP.getView();
          Objects.requireNonNull(tw);
          Object obj = PatchProxy.applyOneRefs(view, tw, uod, "18");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else if(tw.e.d(view)){
             tw.S0();
          }
          this.P.unRetainJsObj();
          this.P.detachToRoot();
       }
       int i = 0;
       if (p0 == null) {
          this.P = null;
          if (this.m() != null) {
             this.m().j(i);
          }
          return;
       }else {
          TKView nativeModule = this.getNativeModule(p0);
          this.P = nativeModule;
          if (nativeModule == null) {
             if (this.m() != null) {
                this.m().j(i);
             }
             return;
          }else {
             nativeModule.retainJsObj();
             this.isAttachedToRoot();
             i = -2;
             int i1 = -1;
             RecyclerView$LayoutParams layoutParams = (this.H != null)? new RecyclerView$LayoutParams(i, i1): new RecyclerView$LayoutParams(i1, i);
             tP = this.w;
             View view1 = this.P.getView();
             Objects.requireNonNull(tP);
             if (!PatchProxy.applyVoidTwoRefs(view1, layoutParams, tP, uod, "22")) {
                if (view1 != null) {
                   view1.setLayoutParams(layoutParams);
                   if (tP.e.a(view1)) {
                      tP.S0();
                   }
                }else {
                   throw new IllegalArgumentException("the view to add must not be null");
                }
             }
             this.n();
             if (this.m() != null) {
                this.m().j(this.w.M0());
             }
             return;
          }
       }
    }
    public void setItemHorizontalSpacing(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "8")) {
          return;
       }
       p0 = n.b(p0);
       if (this.F != p0) {
          this.F = p0;
          this.G = false;
       }
       return;
    }
    public void setItemVerticalSpacing(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "7")) {
          return;
       }
       p0 = n.b(p0);
       if (this.E != p0) {
          this.E = p0;
          this.G = false;
       }
       return;
    }
    public void setLayoutMode(int p0){
       TKListView2$LayoutMode lIST;
       if (p0 != 1) {
          lIST = (p0 != 2)? TKListView2$LayoutMode.LIST: TKListView2$LayoutMode.WATERFALL;
       }else {
          lIST = TKListView2$LayoutMode.GRID;
       }
       if (this.A != lIST) {
          this.A = lIST;
          this.C = false;
       }
       return;
    }
    public void setOnFooterShow(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "25")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_onFooterShow");
       }
       y.c(this.S);
       JsValueRef jsValueRef = y.b(p0, this);
       this.S = jsValueRef;
       this.onFooterShow = jsValueRef.get();
       return;
    }
    public void setOnHeaderShow(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "24")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_onHeaderShow");
       }
       y.c(this.R);
       JsValueRef jsValueRef = y.b(p0, this);
       this.R = jsValueRef;
       this.onHeaderShow = jsValueRef.get();
       return;
    }
    public void setOnProgressUpdated(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "30")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_onProgressUpdated");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.X);
       this.X = jsValueRef;
       this.onProgressUpdatedFun = jsValueRef.get();
       TKListView2 tx = this.x;
       if (tx == null) {
          return;
       }else {
          tx.setOnProgressUpdatedEventEnable(true);
          return;
       }
    }
    public void setOnScrollStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "31")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_onScrollStateChanged");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollStateChangedCallbackRef);
       this.onScrollStateChangedCallbackRef = jsValueRef;
       this.onScrollStateChangedCallback = jsValueRef.get();
       return;
    }
    public void setOnSnap(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "11")) {
          return;
       }
       y.c(this.N);
       JsValueRef jsValueRef = y.b(p0, this);
       this.N = jsValueRef;
       this.onSnap = jsValueRef.get();
       return;
    }
    public void setOnVisibleItemsChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "29")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ListView_onVisibleItemsChanged");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.W);
       this.W = jsValueRef;
       this.onVisibleItemsChangedFun = jsValueRef.get();
       return;
    }
    public void setOrientation(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = 0;
       }
       if (this.H != i) {
          this.H = i;
          this.C = false;
          this.D = false;
       }
       return;
    }
    public void setOverScrollMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "12")) {
          return;
       }
       OverScrollMode overScrollMo = OverScrollMode.valueOf(p0);
       this.overScrollMode = overScrollMo.name();
       TKListView2 tx = this.x;
       if (tx != null) {
          tx.setOverScrollMode(overScrollMo.mode);
       }
       return;
    }
    public void setPullRefresh(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "16")) {
          return;
       }
       if (this.H != null) {
          return;
       }
       TKListView2 tO = this.O;
       if (tO != null) {
          tO.unRetainJsObj();
       }
       TKRefreshControl2 nativeModule = this.getNativeModule(p0);
       this.O = nativeModule;
       if (nativeModule == null) {
          return;
       }else {
          nativeModule.retainJsObj();
          this.O.setRefreshLayout(this.getView());
          if (this.scrollEnabled != null && (!PatchProxy.isSupport(TKListView2.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, TKListView2.class, "52"))) {
             this.getView().setEnabled(true);
             this.getView().setNestedScrollingEnabled(true);
          }
          return;
       }
    }
    public void setRepeatedItemLayouts(List p0){
    }
    public void setRepeatedItemTypes(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "9")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (!iterator.next() instanceof Integer) {
                   a.d(this.getTKJSContext(), new IllegalArgumentException("The element in repeatedItemTypes must be integer"));
                   return;
                }
             }else {
                this.repeatedItemTypes = p0;
                TKListView2 tv = this.v;
                Objects.requireNonNull(tv);
                if (!PatchProxy.applyVoidOneRefs(p0, tv, a.class, "1")) {
                   tv.n = p0;
                   tv.k0();
                   break ;
                }
             }
          }
       }
       return;
    }
    public void setScrollEnabled(boolean p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKListView2.class, "13")) {
          return;
       }
       this.scrollEnabled = p0;
       TKListView2 tx = this.x;
       if (tx != null) {
          tx.setScrollEnable(p0);
       }
       TKRefreshLayout view = this.getView();
       p0 = (p0 && this.O != null)? true: false;
       view.setEnabled(p0);
       return;
    }
    public void setScrollEventThrottle(long p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TKListView2.class, "14")) {
          return;
       }
       this.scrollEventThrottle = p0;
       TKListView2 tx = this.x;
       if (tx != null) {
          tx.setScrollEventThrottle(p0);
       }
       return;
    }
    public void setShowScrollIndicator(boolean p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKListView2.class, "15")) {
          return;
       }
       this.showScrollIndicator = p0;
       TKListView2 tx = this.x;
       if (tx == null) {
          return;
       }
       if (this.H != null) {
          tx.setHorizontalScrollBarEnabled(p0);
       }else {
          tx.setVerticalScrollBarEnabled(p0);
       }
       return;
    }
    public void setSnapType(int p0){
       if (PatchProxy.isSupport(TKListView2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKListView2.class, "10")) {
          return;
       }
       if (this.snapType != p0 && this.x != null) {
          int i = 1;
          if (p0 == i) {
             a uoa = new a();
             this.y = uoa;
             uoa.b(this.x);
             this.y.t(this);
             TKListView2 tx = this.x;
             e uoe = e.class;
             if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(tx, Integer.valueOf(4000), null, uoe, "1")) {
                try{
                   Field declaredFiel = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                   declaredFiel.setAccessible(i);
                   declaredFiel.set(tx, Integer.valueOf(4000));
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
             }
          }
       }
    label_0067 :
       return;
    }
    public void setSpanCount(int p0){
       if (this.B != p0 && p0 > 0) {
          this.B = p0;
          this.C = false;
          this.G = false;
       }
       return;
    }
    public void setStyle(HashMap p0){
       int i;
       TKListView2 tP;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKListView2.class, "3")) {
          return;
       }
       super.setStyle(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, TKListView2.class, "4")) {
          TKListView2 tKListView2 = 3;
          TKListView2 tKListView21 = 2;
          if (!PatchProxy.applyVoid(objArray, this, TKListView2.class, "5") && this.C == null) {
             this.C = true;
             i = this.H ^ true;
             int i1 = TKListView2$c.a[this.A.ordinal()];
             String str = "2";
             if (i1 != 1) {
                if (i1 != tKListView21) {
                   if (i1 == tKListView2) {
                      TKStaggeredGridLayoutManager tKStaggeredG = new TKStaggeredGridLayoutManager(this.B, i);
                      tP = this.x;
                      if (!PatchProxy.applyVoidOneRefs(tP, tKStaggeredG, TKStaggeredGridLayoutManager.class, str)) {
                         tKStaggeredG.e = new WeakReference(tP);
                      }
                      this.z = tKStaggeredG;
                   }
                }else {
                   this.z = new TKGridLayoutManger(this.getContext(), this.B, i, false);
                }
             }else {
                this.z = new TKLinearLayoutManger(this.getContext(), i, false);
             }
             this.x.setLayoutManager(this.z);
             tP = this.w;
             TKListView2 tx = this.x;
             Objects.requireNonNull(tP);
             d uod = d.class;
             if (!PatchProxy.applyVoidOneRefs(tx, tP, uod, "32") && !PatchProxy.applyVoidTwoRefs(tx, objArray, tP, uod, "33")) {
                if (tx.getLayoutManager() instanceof GridLayoutManager) {
                   GridLayoutManager layoutManage = tx.getLayoutManager();
                   layoutManage.m1(new e(tP, layoutManage, objArray));
                }
                if (tx.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                   tP.o = true;
                }
             }
          label_00c0 :
             tP.o = this.z instanceof TKStaggeredGridLayoutManager;
             tP = this.v;
             tx = this.H;
             Objects.requireNonNull(tP);
             if (PatchProxy.isSupport(a.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(tx), tP, a.class, str) && tP.f != tx)) {
                tP.g = true;
                tP.f = tx;
                tP.k0();
             }
          }
       label_00ed :
          if (this.D == null) {
             this.D = true;
             if (!PatchProxy.applyVoid(objArray, this, TKListView2.class, "20")) {
                tP = this.P;
                if (tP != null) {
                   this.o(tP.getView());
                }
                tP = this.Q;
                if (tP != null) {
                   this.o(tP.getView());
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, TKListView2.class, "6") && this.G == null) {
             this.G = true;
             if (this.F >= null || this.E >= null) {
                i = TKListView2$c.a[this.A.ordinal()];
                if (i != 1) {
                   if (i != tKListView21) {
                      if (i == tKListView2) {
                         objArray = new d(this.B, this.F, this.E, false);
                      }
                   }else {
                      objArray = new b(this.B, this.F, this.E, false);
                   }
                }else {
                   objArray = new c(this.F, this.E, false);
                }
             }
             this.x.setItemDecoration(objArray);
             if (objArray != null) {
                objArray.j(this.w.M0());
                objArray.i(this.w.L0());
             }
          }
       }
    label_0179 :
       return;
    }
    public void stopScroll(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "36")) {
          return;
       }
       TKListView2 tx = this.x;
       if (tx == null) {
          return;
       }
       tx.stopScroll();
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKListView2.class, "55")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.W);
       y.c(this.X);
       y.c(this.R);
       y.c(this.S);
       y.c(this.onScrollStateChangedCallbackRef);
       y.c(this.N);
       this.v.P0();
       return;
    }
}
