package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$e;
import tyc.j4;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import tyc.h4;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.g;
import java.util.Objects;
import androidx.recyclerview.widget.y;
import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Collection;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$d;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.animation.TimeInterpolator;
import th0.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Float;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$g;
import android.view.ViewParent;
import java.lang.Runnable;
import android.view.ViewTreeObserver;
import tyc.i4;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$b;

public final class RecyclerTabWithIndicatorView extends PostGroupWithIndicator	// class@0018b4
{
    public HashMap A;
    public final ScrollToCenterRecyclerView m;
    public RecyclerView n;
    public View o;
    public int p;
    public int q;
    public int r;
    public final List s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public final RecyclerTabWithIndicatorView$e x;
    public RecyclerTabWithIndicatorView$b y;
    public RecyclerTabWithIndicatorView$a z;

    public void RecyclerTabWithIndicatorView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RecyclerTabWithIndicatorView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RecyclerTabWithIndicatorView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       ScrollToCenterRecyclerView scrollToCent = new ScrollToCenterRecyclerView(p0);
       this.m = scrollToCent;
       p2 = -1;
       this.p = p2;
       this.q = p2;
       this.r = p2;
       this.s = new ArrayList();
       this.t = true;
       RecyclerTabWithIndicatorView$e uoe = new RecyclerTabWithIndicatorView$e(p0, j4.e, j4.f, j4.c, j4.d, j4.b, j4.a);
       this.x = v0;
       this.z = new RecyclerTabWithIndicatorView$a();
       if (PatchProxy.applyVoid(null, this, RecyclerTabWithIndicatorView.class, "1")) {
       }else {
          scrollToCent.setLayoutParams(new ViewGroup$LayoutParams(p2, p2));
          this.addView(scrollToCent);
          scrollToCent.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          scrollToCent.addOnScrollListener(new h4(this));
          scrollToCent.getRecycledViewPool().k(0, 0);
          if (scrollToCent.getItemAnimator() instanceof g) {
             RecyclerView$l itemAnimator = scrollToCent.getItemAnimator();
             Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
             itemAnimator.K(0);
          }
       }
       PostGroupWithIndicator tb = this.b;
       a.o(tb, "mIndicator");
       tb.setVisibility(8);
       return;
    }
    public void RecyclerTabWithIndicatorView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void r(RecyclerTabWithIndicatorView p0,int p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.q(p1, p2);
       return;
    }
    public static void s(RecyclerTabWithIndicatorView p0,List p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 2;
       }
       if (p4 & 0x04) {
          p3 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) || !PatchProxy.applyVoidThreeRefs(p1, Integer.valueOf(p2), Boolean.valueOf(p3), p0, RecyclerTabWithIndicatorView.class, "3")) {
          a.p(p1, "tabInfoList");
          p0.u = p2;
          p0.t = p3;
          p0.s.clear();
          p0.s.addAll(p1);
          int i = p0.s.size();
          int i1 = 0;
          for (p4 = 0; p4 < i; p4++) {
             RecyclerTabWithIndicatorView$d uod = p0.s.get(p4);
             uod.a = i1;
             i1 = i1 + uod.a();
             int i2 = (p3 && p4)? 0: 1;
             i1 = i1 - i2;
             uod.b = i1;
             i1 = uod.b() + 1;
          }
          p0.m.setAdapter(new RecyclerTabWithIndicatorView$c(p0));
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, RecyclerTabWithIndicatorView.class, "17")) {
          return;
       }
       this.m.setClickable(false);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RecyclerTabWithIndicatorView.class, "16")) {
          return;
       }
       this.m.setClickable(true);
       return;
    }
    public long getAnimatorDuration(){
       return 300;
    }
    public final int getFirstVisibleItem(){
       RecyclerTabWithIndicatorView obj = PatchProxy.apply(null, this, RecyclerTabWithIndicatorView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.n;
       if (obj != null) {
          return obj.getChildAdapterPosition(obj.getChildAt(0));
       }
       return -1;
    }
    public TimeInterpolator getInterpolator(){
       Object obj = PatchProxy.apply(null, this, RecyclerTabWithIndicatorView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public final int getLastVisibleItem(){
       RecyclerTabWithIndicatorView obj = PatchProxy.apply(null, this, RecyclerTabWithIndicatorView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.n;
       if (obj != null) {
          return obj.getChildAdapterPosition(obj.getChildAt((obj.getChildCount() - 1)));
       }
       return -1;
    }
    public View getParentView(){
       return this.m;
    }
    public final RecyclerTabWithIndicatorView$d getSelectTabInfo(){
       Object obj = PatchProxy.apply(null, this, RecyclerTabWithIndicatorView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.F2(this.s, this.p);
    }
    public void i(float p0){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RecyclerTabWithIndicatorView.class, "18")) {
          return;
       }
       if (this.r == -1) {
          return;
       }
       PostGroupWithIndicator tb = this.b;
       a.o(tb, "mIndicator");
       tb.setScaleX(this.z.getInterpolation(p0));
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, RecyclerTabWithIndicatorView.class, "8")) {
          return;
       }
       PostGroupWithIndicator tb = this.b;
       a.o(tb, "mIndicator");
       tb.setVisibility(8);
       RecyclerView$Adapter adapter = this.m.getAdapter();
       if (adapter != null) {
          adapter.l0(this.p);
       }
       this.p = -1;
       return;
    }
    public final int m(int p0){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RecyclerTabWithIndicatorView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       int i1 = this.s.size();
       while (true) {
          if (i >= i1) {
             return -1;
          }
          if (this.s.get(i).c() <= p0 && p0 <= this.s.get(i).b()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final void n(int p0){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerTabWithIndicatorView.class, "11")) {
          return;
       }
       RecyclerTabWithIndicatorView tn = this.n;
       if (tn != null) {
          Object[] objArray = new Object[0];
          a.D().w("RecyclerTabWithIndicatorView", "makePositionFirst "+p0, objArray);
          int firstVisible = this.getFirstVisibleItem();
          int lastVisibleI = this.getLastVisibleItem();
          if (p0 <= firstVisible) {
             if (this.t != null && p0) {
                this.w = true;
                p0++;
             }
             tn.smoothScrollToPosition(p0);
          }else if(p0 <= lastVisibleI){
             p0 = p0 - firstVisible;
             if (p0 >= 0 && p0 < tn.getChildCount()) {
                View childAt = tn.getChildAt(p0);
                a.o(childAt, "mDataRecyclerView.getChildAt\(movePosition\)");
                tn.smoothScrollBy(childAt.getLeft(), 0);
             }
          }else {
             tn.smoothScrollToPosition(p0);
             this.v = true;
          }
       }
       return;
    }
    public final void o(View p0,boolean p1){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RecyclerTabWithIndicatorView.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecyclerTabWithIndicatorView", "scrollerIndicatorAfterLaidOut", objArray);
       RecyclerTabWithIndicatorView$g og = new RecyclerTabWithIndicatorView$g(this, p0, p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, og, this, RecyclerTabWithIndicatorView.class, "21") && p0 != null) {
          if (p0.getWidth() > 0 && (p0.getHeight() > 0 && p0.getParent() != null)) {
             og.run();
          }else {
             this.m.getViewTreeObserver().addOnGlobalLayoutListener(new i4(p0, og));
          }
       }
       return;
    }
    public final void p(int p0){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerTabWithIndicatorView.class, "7")) {
          return;
       }
       this.q(this.m(p0), false);
       return;
    }
    public final void q(int p0,boolean p1){
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, RecyclerTabWithIndicatorView.class, "6")) {
          return;
       }
       if (p1) {
          this.q = p0;
       }
       if (p0 == -1) {
          this.l();
          return;
       }else {
          RecyclerView$ViewHolder viewHolder = this.m.findViewHolderForAdapterPosition(p0);
          if (viewHolder != null) {
             viewHolder = viewHolder.itemView;
             a.o(viewHolder, "findViewHolderForAdapterPosition.itemView");
             this.t(viewHolder, p0, false, true);
          }else {
             this.q = p0;
             this.m.scrollToPosition(p0);
             RecyclerView$Adapter adapter = this.m.getAdapter();
             if (adapter != null) {
                adapter.l0(this.p);
             }
          }
          return;
       }
    }
    public final void setOnTabClickListener(RecyclerTabWithIndicatorView$b p0){
       this.y = p0;
    }
    public final void t(View p0,int p1,boolean p2,boolean p3){
       int i;
       if (PatchProxy.isSupport(RecyclerTabWithIndicatorView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, RecyclerTabWithIndicatorView.class, "10")) {
          return;
       }
       if (p1 != this.p) {
          Object[] objArray = new Object[0];
          a.D().s("RecyclerTabWithIndicatorView", "updateSelectedView  mSelectedIndex="+this.p+", curIndex="+p1+' ', objArray);
          this.m.x(p1);
          RecyclerTabWithIndicatorView tp = this.p;
          boolean b = true;
          if (tp != -1 && p1 != tp) {
             i = (tp > p1)? 0: 1;
          }else {
             i = -1;
          }
          this.r = i;
          this.o = p0;
          this.setIndicatorVisible(0);
          this.k();
          if (this.p == -1) {
             b = false;
          }
          this.o(p0, b);
          RecyclerTabWithIndicatorView tp1 = this.p;
          this.p = p1;
          if (p3) {
             Object[] objArray1 = new Object[0];
             a.D().s("RecyclerTabWithIndicatorView", "updateSelectedTab lastIndex="+tp1, objArray1);
             RecyclerView$Adapter adapter = this.m.getAdapter();
             if (adapter != null) {
                adapter.l0(tp1);
                adapter.l0(this.p);
             }
          }
          if (p2) {
             this.n(this.s.get(p1).c());
          }
       }
       this.q = -1;
       return;
    }
}
