package com.kuaishou.pagedy.container.widget.DynamicNestListContainer;
import lo4.i;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.widget.DynamicRefreshLayout;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import mo4.e;
import androidx.recyclerview.widget.RecyclerView$n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mo4.b;
import com.kwai.library.widget.refresh.RefreshLayout$f;
import com.kwai.library.widget.refresh.RefreshLayout;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lo4.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import go4.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import msd.a;
import java.lang.Boolean;
import mo4.a;
import com.kwai.library.widget.refresh.RefreshLayout$g;

public final class DynamicNestListContainer extends FrameLayout implements i	// class@000a69
{
    public final DynamicRefreshLayout b;
    public final DynamicNestedRecyclerView c;
    public RecyclerView$LayoutManager d;
    public boolean e;
    public a f;
    public RecyclerView$Adapter g;
    public boolean h;

    public void DynamicNestListContainer(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicNestListContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicNestListContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View.inflate(p0, R.layout.arg_RES_7f0d0249, this);
       View view = this.findViewById(R.id.nest_dynamic_refreshLayout);
       a.o(view, "this.findViewById\(R.id.nest_dynamic_refreshLayout\)");
       this.b = view;
       View view1 = this.findViewById(R.id.nest_recyclerView);
       a.o(view1, "this.findViewById\(R.id.nest_recyclerView\)");
       this.c = view1;
       view1.setItemAnimator(null);
       view.setEnabled(false);
       view1.setFocusable(false);
       view1.addItemDecoration(new e());
       if (PatchProxy.applyVoid(null, this, DynamicNestListContainer.class, "6")) {
       }else {
          view.setChildScrollUpCallback(new b(this));
       }
       return;
    }
    public void DynamicNestListContainer(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void e(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestListContainer.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       this.c.removeOnScrollListener(p0);
       return;
    }
    public final RecyclerView$Adapter getAdapter(){
       return this.g;
    }
    public ViewGroup getCeilingContainer(){
       return h.a(this);
    }
    public int getFirstVisiblePosition(){
       Object[] objArray = null;
       DynamicNestListContainer obj = PatchProxy.apply(objArray, this, DynamicNestListContainer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj instanceof StaggeredGridLayoutManager) {
          objArray = obj;
       }
       int i = (objArray != null)? a.d(objArray): -1;
       return i;
    }
    public final RecyclerView$LayoutManager getLayoutManager(){
       return this.d;
    }
    public final DynamicNestedRecyclerView getNestRecyclerView$kspagedykit_release(){
       return this.c;
    }
    public final a getRefreshListener(){
       return this.f;
    }
    public void n(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestListContainer.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.c.addOnScrollListener(p0);
       return;
    }
    public final void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestListContainer.class, "4")) {
          return;
       }
       this.g = p0;
       this.c.setAdapter(p0);
       return;
    }
    public final void setLayoutManager(RecyclerView$LayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestListContainer.class, "1")) {
          return;
       }
       this.d = p0;
       this.c.setLayoutManager(p0);
       return;
    }
    public final void setRefreshEnable(boolean p0){
       if (PatchProxy.isSupport(DynamicNestListContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicNestListContainer.class, "5")) {
          return;
       }
       this.h = p0;
       this.b.setEnabled(p0);
       return;
    }
    public final void setRefreshListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestListContainer.class, "3")) {
          return;
       }
       this.f = p0;
       DynamicNestListContainer tb = this.b;
       if (p0 != null) {
          p0 = new a(p0);
       }
       tb.setOnRefreshListener(p0);
       return;
    }
    public final void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(DynamicNestListContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicNestListContainer.class, "2")) {
          return;
       }
       this.e = p0;
       this.b.setRefreshing(p0);
       return;
    }
}
