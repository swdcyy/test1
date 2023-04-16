package androidx.recyclerview.widget.k;
import java.lang.Runnable;
import java.lang.ThreadLocal;
import androidx.recyclerview.widget.k$a;
import java.lang.Object;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ChildHelper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import androidx.recyclerview.widget.k$b;
import java.lang.Math;
import androidx.recyclerview.widget.k$c;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.ref.WeakReference;
import java.lang.String;
import w1.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;
import java.util.concurrent.TimeUnit;

public final class k implements Runnable	// class@00091c
{
    public ArrayList b;
    public long c;
    public long d;
    public ArrayList e;
    public static final ThreadLocal f;
    public static Comparator g;

    static {
       k.f = new ThreadLocal();
       k.g = new k$a();
    }
    public void k(){
       super();
       this.b = new ArrayList();
       this.e = new ArrayList();
    }
    public static boolean e(RecyclerView p0,int p1){
       int unfilteredCh = p0.mChildHelper.getUnfilteredChildCount();
       int i = 0;
       while (true) {
          if (i >= unfilteredCh) {
             return false;
          }
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0.mChildHelper.getUnfilteredChildAt(i));
          if (childViewHol.mPosition == p1 && !childViewHol.isInvalid()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void a(RecyclerView p0){
       this.b.add(p0);
    }
    public final void b(){
       RecyclerView recyclerView;
       k$c uoc;
       int i = this.b.size();
       boolean b = false;
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          recyclerView = this.b.get(i1);
          if (!recyclerView.getWindowVisibility()) {
             recyclerView.mPrefetchRegistry.c(recyclerView, b);
             i2 = i2 + recyclerView.mPrefetchRegistry.d;
          }
          i1 = i1 + 1;
       }
       this.e.ensureCapacity(i2);
       i1 = 0;
       i2 = 0;
       while (i1 < i) {
          recyclerView = this.b.get(i1);
          if (!recyclerView.getWindowVisibility()) {
             RecyclerView mPrefetchReg = recyclerView.mPrefetchRegistry;
             int i3 = Math.abs(mPrefetchReg.a) + Math.abs(mPrefetchReg.b);
             int i4 = 0;
             int i5 = mPrefetchReg.d * 2;
             while (i4 < i5) {
                if (i2 >= this.e.size()) {
                   uoc = new k$c();
                   this.e.add(uoc);
                }else {
                   uoc = this.e.get(i2);
                }
                k$b c = mPrefetchReg.c;
                int i6 = i4 + 1;
                i6 = c[i6];
                boolean b1 = (i6 <= i3)? true: false;
                uoc.a = b1;
                uoc.b = i3;
                uoc.c = i6;
                uoc.d = recyclerView;
                uoc.e = c[i4];
                i2 = i2 + 1;
                i4 = i4 + 2;
             }
          }
          i1 = i1 + 1;
       }
       Collections.sort(this.e, k.g);
       return;
    }
    public final void c(k$c p0,long p1){
       long l = (p0.a != null)? Long.MAX_VALUE: p1;
       RecyclerView$ViewHolder viewHolder = this.h(p0.d, p0.e, l);
       if (viewHolder != null && (viewHolder.mNestedRecyclerView != null && (viewHolder.isBound() && !viewHolder.isInvalid()))) {
          this.g(viewHolder.mNestedRecyclerView.get(), p1);
       }
    label_0030 :
       return;
    }
    public final void d(long p0){
       for (int i = 0; i < this.e.size(); i = i + 1) {
          k$c uoc = this.e.get(i);
          if (uoc.d == null) {
             break ;
          }else {
             this.c(uoc, p0);
             uoc.a();
          }
       }
       return;
    }
    public void f(long p0){
       this.b();
       this.d(p0);
    }
    public final void g(RecyclerView p0,long p1){
       if (p0 == null) {
          return;
       }
       if (p0.mDataSetHasChangedAfterLayout != null && p0.mChildHelper.getUnfilteredChildCount()) {
          p0.removeAndRecycleViews();
       }
       RecyclerView mPrefetchReg = p0.mPrefetchRegistry;
       mPrefetchReg.c(p0, true);
       if (mPrefetchReg.d != null) {
          k.a("RV Nested Prefetch");
          p0.mState.h(p0.mAdapter);
          int i = 0;
          int i1 = mPrefetchReg.d * 2;
          while (i < i1) {
             this.h(p0, mPrefetchReg.c[i], p1);
             i = i + 2;
          }
          k.b();
       }
       return;
    }
    public final RecyclerView$ViewHolder h(RecyclerView p0,int p1,long p2){
       if (k.e(p0, p1)) {
          return null;
       }
       RecyclerView mRecycler = p0.mRecycler;
       p0.onEnterLayoutOrScroll();
       RecyclerView$ViewHolder viewHolder = mRecycler.I(p1, false, p2);
       if (viewHolder != null) {
          if (viewHolder.isBound() && !viewHolder.isInvalid()) {
             mRecycler.B(viewHolder.itemView);
          }else {
             mRecycler.a(viewHolder, false);
          }
       }
       p0.onExitLayoutOrScroll(false);
       return viewHolder;
    }
    public void i(RecyclerView p0){
       this.b.remove(p0);
    }
    public void postFromTraversal(RecyclerView p0,int p1,int p2){
       if (p0.isAttachedToWindow() && !this.c) {
          this.c = p0.getNanoTime();
          p0.post(this);
       }
       p0.mPrefetchRegistry.e(p1, p2);
       return;
    }
    public void run(){
       k.a("RV Prefetch");
       if (!this.b.isEmpty()) {
          int i = this.b.size();
          int i1 = 0;
          long l = 0;
          while (i1 < i) {
             RecyclerView recyclerView = this.b.get(i1);
             if (!recyclerView.getWindowVisibility()) {
                l = Math.max(recyclerView.getDrawingTime(), l);
             }
             i1 = i1 + 1;
          }
          if (l) {
             this.f((TimeUnit.MILLISECONDS.toNanos(l) + this.d));
             this.c = 0;
             k.b();
             return;
          }
       }
       this.c = 0;
       k.b();
       return;
    }
}
