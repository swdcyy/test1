package com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jo4.c;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView$a;
import su.e;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$h;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout;
import do4.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.HorizontalScrollView;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView$b;
import java.lang.Runnable;
import java.lang.Boolean;
import go4.a;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;
import com.kuaishou.pagedy.container.widget.RootNodeView;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import do4.f;
import java.util.ArrayList;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.pagedy.container.widget.DynamicTabShadowView;
import jo4.h;
import android.view.ViewParent;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;

public class DynamicMultiTabsView extends LinearLayout	// class@000a67
{
    public final DynamicTabLayout b;
    public final ViewPager2 c;
    public final RecyclerView d;
    public h e;
    public a f;
    public DynamicTabShadowView g;
    public int h;
    public final int i;
    public ViewPager2$h j;
    public boolean k;

    public void DynamicMultiTabsView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicMultiTabsView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicMultiTabsView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.e = new c();
       this.i = 5;
       this.j = new DynamicMultiTabsView$a(this);
       if (e.b("KEY_LIVE_CART_PERF_OPT", true)) {
          this.addView(a.c(p0, R.layout.arg_RES_7f0d033f, this, false));
       }else {
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d033f, this);
       }
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.setOrientation(true);
       View view = this.findViewById(R.id.view_pager_dynamic_multi_tab);
       a.o(view, "findViewById\(R.id.view_pager_dynamic_multi_tab\)");
       this.c = view;
       view.j(this.j);
       view = view.getChildAt(false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
       this.d = view;
       view = this.findViewById(R.id.tab_layout_dynamic_multi_tab);
       a.o(view, "findViewById\(R.id.tab_layout_dynamic_multi_tab\)");
       this.b = view;
       return;
    }
    public void DynamicMultiTabsView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void e(DynamicMultiTabsView p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.d(p1);
       return;
    }
    public final n a(int p0){
       n obj;
       if (PatchProxy.isSupport(DynamicMultiTabsView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DynamicMultiTabsView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View childAt = this.d.getChildAt(p0);
       obj = null;
       if (childAt != null) {
          RecyclerView$ViewHolder childViewHol = this.d.getChildViewHolder(childAt);
          if (childViewHol instanceof n) {
             RecyclerView$ViewHolder viewHolder = childViewHol;
          }
       }
       return obj;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, DynamicMultiTabsView.class, "3")) {
          return;
       }
       this.b.setVisibility(8);
       return;
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(DynamicMultiTabsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicMultiTabsView.class, "9")) {
          return;
       }
       if (this.a(p0) == null && this.h < this.i) {
          this.post(new DynamicMultiTabsView$b(this, p0));
       }else {
          n on = this.a(p0);
          if (on != null) {
             on.g();
          }
       }
       return;
    }
    public final void d(boolean p0){
       n on;
       if (PatchProxy.isSupport(DynamicMultiTabsView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicMultiTabsView.class, "6")) {
          return;
       }
       if (p0) {
          on = this.a(this.c.getCurrentItem());
          if (on != null) {
             n on1 = n.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, on, on1, "4")) {
                RecyclerView$ViewHolder itemView = on.itemView;
                a.o(itemView, "itemView");
                if (!PatchProxy.applyVoidOneRefs(itemView, objArray, a.class, "19")) {
                   a.p(itemView, "$this$hideRecyclerView");
                   if (!itemView instanceof ViewGroup) {
                      itemView = objArray;
                   }
                   if (itemView != null) {
                      Iterator iterator = ViewGroupKt.b(itemView).iterator();
                      Iterator iterator1 = iterator;
                      while (iterator1.hasNext()) {
                         View view1 = iterator1.next();
                         if (view1 instanceof RootNodeView) {
                            iterator = ViewGroupKt.b(view1).iterator();
                            iterator1 = iterator;
                            while (iterator1.hasNext()) {
                               view1 = iterator1.next();
                               if (view1 instanceof RecyclerView) {
                                  view1.setVisibility(4);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
                if (!PatchProxy.applyVoid(objArray, on, on1, "5")) {
                   on1 = on.a;
                   View view = (on1 != null)? a.b(on1): objArray;
                   if (view != null) {
                      if (view instanceof RecyclerView) {
                         objArray = a.r(view);
                      }
                      if (view instanceof DynamicRootListContainer) {
                         objArray = a.s(view);
                      }
                      if (objArray != null) {
                         objArray.X0(CollectionsKt__CollectionsKt.E());
                      }
                   }
                }
             label_00c8 :
                on.k = true;
                on.f();
             }
          }
       }else {
          on = this.a(this.c.getCurrentItem());
          if (on != null) {
             on.f();
          }
       }
       return;
    }
    public final void f(int p0,Map p1){
       if (PatchProxy.isSupport(DynamicMultiTabsView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, DynamicMultiTabsView.class, "5")) {
          return;
       }
       RecyclerView$Adapter adapter = this.c.getAdapter();
       if (!adapter instanceof f) {
          adapter = null;
       }
       if (adapter != null) {
          f m = adapter.m;
          if (m != null) {
             m.put(Integer.valueOf(p0), p1);
          }
       }
       n on = this.a(p0);
       if (on != null) {
          on.h(p1);
       }
       return;
    }
    public final List getAllChildViewHolder(){
       ArrayList obj = PatchProxy.apply(null, this, DynamicMultiTabsView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       RecyclerView$Adapter adapter = this.c.getAdapter();
       int i = 0;
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       while (i < itemCount) {
          n on = this.a(i);
          if (on != null && on.a() != null) {
             obj.add(on);
          }
          i = i + 1;
       }
       return obj;
    }
    public final a getComponent(){
       return this.f;
    }
    public final n getCurChildViewHolder(){
       Object obj = PatchProxy.apply(null, this, DynamicMultiTabsView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(this.c.getCurrentItem());
    }
    public final int getMAX_RETRY_COUNT(){
       return this.i;
    }
    public final RecyclerView getRecyclerView(){
       return this.d;
    }
    public final int getRetryCount(){
       return this.h;
    }
    public final DynamicTabShadowView getShadowView(){
       return this.g;
    }
    public final h getTabCreator(){
       return this.e;
    }
    public final DynamicTabLayout getTabLayout(){
       return this.b;
    }
    public final ViewPager2 getViewPager2(){
       return this.c;
    }
    public void onAttachedToWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicMultiTabsView.class, "14")) {
          return;
       }
       super.onAttachedToWindow();
       if (!PatchProxy.applyVoidOneRefs(this, objArray, a.class, "5")) {
          a.p(this, "$this$setupRootRecyclerView");
          ViewParent parent = this.getParent();
          if (!parent instanceof View) {
             parent = objArray;
          }
          while (parent != null) {
             if (parent instanceof DynamicRootRecyclerView) {
                parent.setViewPager2(this.getViewPager2());
                parent.setViewPager2Container(this);
                break ;
             }else {
                parent = parent.getParent();
                if (!parent instanceof View) {
                   parent = objArray;
                }
             }
          }
       }
       return;
    }
    public final void setComponent(a p0){
       this.f = p0;
    }
    public final void setRetryCount(int p0){
       this.h = p0;
    }
    public final void setShadowView(DynamicTabShadowView p0){
       this.g = p0;
    }
    public final void setTabCreator(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicMultiTabsView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
}
