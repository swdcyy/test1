package com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import lo4.i;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.widget.DynamicRefreshLayout;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mo4.d;
import com.kwai.library.widget.refresh.RefreshLayout$f;
import com.kwai.library.widget.refresh.RefreshLayout;
import su.e;
import xm4.a;
import java.lang.Integer;
import com.kuaishou.pagedy.container.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import go4.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import msd.a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import java.lang.Boolean;
import com.kuaishou.pagedy.container.widget.DynamicNestedRootRecyclerView;
import mo4.c;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import androidx.viewpager2.widget.ViewPager2;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;

public final class DynamicRootListContainer extends RelativeLayout implements i	// class@000a6f
{
    public final ViewGroup b;
    public final ViewGroup c;
    public DynamicRefreshLayout d;
    public final DynamicRootRecyclerView e;
    public int f;
    public l g;
    public RecyclerView$LayoutManager h;
    public boolean i;
    public a j;
    public RefreshLayout$h k;
    public RecyclerView$Adapter l;

    public void DynamicRootListContainer(Context p0){
       super(p0, null, 0, false, 14, null);
    }
    public void DynamicRootListContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0, false, 12, null);
    }
    public void DynamicRootListContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, false, 8, null);
    }
    public void DynamicRootListContainer(Context p0,AttributeSet p1,int p2,boolean p3,int p4,u p5){
       View view;
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = 0;
       }
       boolean b = true;
       if (p4 & 0x08) {
          p3 = true;
       }
       super(p0, p1, p2);
       String str = "this.findViewById\(R.id.root_recyclerView\)";
       if (p3) {
          View.inflate(p0, R.layout.arg_RES_7f0d024a, this);
          view = this.findViewById(R.id.header_view_container);
          a.o(view, "this.findViewById\(R.id.header_view_container\)");
          this.b = view;
          view = this.findViewById(R.id.ceiling_container);
          a.o(view, "this.findViewById\(R.id.ceiling_container\)");
          this.c = view;
          this.d = this.findViewById(0x7f0a0c6c);
          view = this.findViewById(R.id.root_recyclerView);
          a.o(view, str);
          this.e = view;
          if (!PatchProxy.applyVoid(null, this, DynamicRootListContainer.class, "8")) {
             DynamicRootListContainer td = this.d;
             if (td != null) {
                td.setChildScrollUpCallback(new d(this));
             }
          }
       }else if(e.b("KEY_LIVE_CART_PERF_OPT", b)){
          this.addView(a.c(p0, R.layout.on, this, false));
       }else {
          View.inflate(p0, R.layout.on, this);
       }
       view = this.findViewById(R.id.header_view_container);
       a.o(view, "this.findViewById\(R.id.header_view_container\)");
       this.b = view;
       view = this.findViewById(R.id.ceiling_container);
       a.o(view, "this.findViewById\(R.id.ceiling_container\)");
       this.c = view;
       view = this.findViewById(R.id.root_recyclerView);
       a.o(view, str);
       this.e = view;
       return;
    }
    public final void a(int p0,int p1){
       if (PatchProxy.isSupport(DynamicRootListContainer.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicRootListContainer.class, "15")) {
          return;
       }
       DynamicRootListContainer th = this.h;
       if (!th instanceof KwaiStaggeredGridLayoutManager) {
          th = null;
       }
       if (th != null) {
          th.scrollToPositionWithOffset(p0, p1);
       }
       return;
    }
    public void e(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       this.e.removeOnScrollListener(p0);
       return;
    }
    public final RecyclerView$Adapter getAdapter(){
       return this.l;
    }
    public ViewGroup getCeilingContainer(){
       return this.c;
    }
    public final int getCeilingHeight(){
       return this.f;
    }
    public final l getCeilingListener(){
       return this.g;
    }
    public final ViewGroup getCeilingViewContainer(){
       return this.c;
    }
    public int getFirstVisiblePosition(){
       Object[] objArray = null;
       DynamicRootListContainer obj = PatchProxy.apply(objArray, this, DynamicRootListContainer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       if (obj instanceof StaggeredGridLayoutManager) {
          objArray = obj;
       }
       int i = (objArray != null)? a.d(objArray): -1;
       return i;
    }
    public final ViewGroup getHeaderViewContainer(){
       return this.b;
    }
    public final RecyclerView$LayoutManager getLayoutManager(){
       return this.h;
    }
    public final a getRefreshListener(){
       return this.j;
    }
    public final DynamicRootRecyclerView getRootRecyclerView(){
       return this.e;
    }
    public final RefreshLayout$h getSetOnRefreshStatusListener(){
       return this.k;
    }
    public void n(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       this.e.addOnScrollListener(p0);
       return;
    }
    public final void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "7")) {
          return;
       }
       this.l = p0;
       this.e.setAdapter(p0);
       return;
    }
    public final void setCeilingHeight(int p0){
       if (PatchProxy.isSupport(DynamicRootListContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicRootListContainer.class, "1")) {
          return;
       }
       this.f = p0;
       this.e.setCeilingHeight(p0);
       this.f = this.e.getCeilingHeight();
       return;
    }
    public final void setCeilingListener(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "2")) {
          return;
       }
       this.g = p0;
       this.e.setCeilingListener(p0);
       return;
    }
    public final void setIsNest(boolean p0){
       if (PatchProxy.isSupport(DynamicRootListContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicRootListContainer.class, "9")) {
          return;
       }
       DynamicRootListContainer te = this.e;
       if (!te instanceof DynamicNestedRootRecyclerView) {
          te = null;
       }
       if (te != null) {
          te.setNest(p0);
       }
       return;
    }
    public final void setLayoutManager(RecyclerView$LayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "3")) {
          return;
       }
       this.h = p0;
       this.e.setLayoutManager(p0);
       return;
    }
    public final void setRefreshListener(a p0){
       c uoc;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "5")) {
          return;
       }
       this.j = p0;
       DynamicRootListContainer td = this.d;
       if (td != null) {
          if (p0 != null) {
             uoc = new c(p0);
          }
          td.setOnRefreshListener(uoc);
       }
       return;
    }
    public final void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(DynamicRootListContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicRootListContainer.class, "4")) {
          return;
       }
       this.i = p0;
       DynamicRootListContainer td = this.d;
       if (td != null) {
          td.setRefreshing(p0);
       }
       if (p0) {
          this.e.scrollToPosition(0);
          ViewPager2 viewPager2 = this.e.getViewPager2();
          if (viewPager2 != null) {
             DynamicNestedRecyclerView uDynamicNest = a.c(viewPager2);
             if (uDynamicNest != null) {
                uDynamicNest.scrollToPosition(0);
             }
          }
       }
       return;
    }
    public final void setSetOnRefreshStatusListener(RefreshLayout$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicRootListContainer.class, "6")) {
          return;
       }
       this.k = p0;
       DynamicRootListContainer td = this.d;
       if (td != null) {
          td.setOnRefreshStatusListener(p0);
       }
       return;
    }
}
