package com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.c;
import com.beloo.widget.chipslayoutmanager.e;
import com.beloo.widget.chipslayoutmanager.f$a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import p9.a;
import android.util.SparseArray;
import u9.e;
import com.beloo.widget.chipslayoutmanager.ParcelableContainer;
import w9.g;
import z9.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import y9.a;
import r9.b;
import r9.c;
import t9.v;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager$a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager$b;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.View;
import android.graphics.Rect;
import t9.g;
import androidx.recyclerview.widget.RecyclerView$t;
import t9.h;
import java.lang.Integer;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import java.lang.Object;
import y9.b;
import java.util.Iterator;
import p9.a$a;
import t9.b;
import r9.a;
import java.lang.StringBuilder;
import y9.c;
import java.lang.Math;
import x9.b;
import java.lang.Runnable;
import p9.e;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.beloo.widget.chipslayoutmanager.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import t9.k;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import z9.b;
import y9.c$a;
import q9.c;
import y9.d;
import v9.a;
import t9.m;
import w9.f;
import v9.m;
import t9.t;
import v9.p;
import w9.b;
import com.beloo.widget.chipslayoutmanager.a$a;
import java.util.Objects;
import t9.a;
import v9.n;
import w9.e;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import u9.i;

public class ChipsLayoutManager extends RecyclerView$LayoutManager implements c, e, f$a	// class@000f02
{
    public b A;
    public boolean B;
    public g b;
    public d c;
    public a d;
    public SparseArray e;
    public n f;
    public boolean g;
    public Integer h;
    public i i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public a n;
    public Integer o;
    public SparseArray p;
    public ParcelableContainer q;
    public b r;
    public boolean s;
    public int t;
    public AnchorViewState u;
    public m v;
    public k w;
    public c x;
    public e y;
    public g z;
    public static final String C = "ChipsLayoutManager";

    public void ChipsLayoutManager(Context p0){
       super();
       this.d = new a(this);
       this.e = new SparseArray();
       this.g = true;
       this.h = null;
       this.i = new e();
       this.j = 1;
       this.k = 1;
       this.m = false;
       this.o = null;
       this.p = new SparseArray();
       this.q = new ParcelableContainer();
       this.s = false;
       this.z = new g(this);
       this.A = new a();
       this.t = p0.getResources().getConfiguration().orientation;
       this.r = new a(this.p);
       this.n = new c(new b(this).a);
       this.w = new v(this);
       this.setAutoMeasureEnabled(true);
    }
    public static ChipsLayoutManager$a R(Context p0){
       if (p0 != null) {
          return new ChipsLayoutManager$b(new ChipsLayoutManager(p0));
       }
       throw new IllegalArgumentException("you have passed null context to builder");
    }
    public int E(){
       View childAt;
       int i = this.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          childAt = this.getChildAt(i);
          if (this.b.c(this.b.t(childAt)) && this.b.h(childAt)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return this.getPosition(childAt);
    }
    public void H(boolean p0){
       this.m = p0;
    }
    public int L(){
       return this.k;
    }
    public final void N(RecyclerView$t p0,h p1,h p2){
       int i = this.u.c().intValue();
       int childCount = this.getChildCount();
       int i1 = 0;
       for (int i2 = 0; i2 < childCount; i2 = i2 + 1) {
          View childAt = this.getChildAt(i2);
          this.p.put(this.getPosition(childAt), childAt);
       }
       for (childCount = 0; childCount < this.p.size(); childCount = childCount + 1) {
          this.detachView(this.p.valueAt(childCount));
       }
       i2 = i - 1;
       this.r.g(i2);
       if (this.u.a() != null) {
          this.O(p0, p1, i2);
       }
       this.r.g(i);
       this.O(p0, p2, i);
       this.r.a();
       for (; i1 < this.p.size(); i1 = i1 + 1) {
          this.removeAndRecycleView(this.p.valueAt(i1), p0);
          this.r.f(i1);
       }
       this.b.u();
       this.e.clear();
       Iterator iterator = this.d.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          View view = iterator1.next();
          this.e.put(this.getPosition(view), view);
       }
       this.p.clear();
       this.r.b();
       return;
    }
    public final void O(RecyclerView$t p0,h p1,int p2){
       if (p2 < 0) {
          return;
       }
       b uob = p1.k();
       if (p2 >= uob.c) {
          throw new IllegalArgumentException("you can\'t move above of maxItemCount");
       }
       if (p2 < 0) {
          throw new IllegalArgumentException("can\'t move to negative position");
       }
       uob.b = p2;
       while (uob.hasNext()) {
          p2 = uob.next().intValue();
          View view = this.p.get(p2);
          if (view == null) {
             try{
                View view1 = p0.o(p2);
                this.r.h();
                if (!p1.w(view1)) {
                   p0.B(view1);
                   this.r.d();
                   break ;
                }
             }catch(java.lang.IndexOutOfBoundsException e0){
                break ;
             }
          }else if(!p1.m(view)){
          }else {
             this.p.remove(p2);
          }
       }
       this.r.e();
       p1.v();
       return;
    }
    public g P(){
       return this.b;
    }
    public a Q(){
       return this.n;
    }
    public final void S(int p0){
       c.a(ChipsLayoutManager.C, "cache purged from position "+p0);
       this.n.e(p0);
       p0 = this.n.b(p0);
       ChipsLayoutManager to = this.o;
       if (to == null) {
       }else {
          p0 = Math.min(to.intValue(), p0);
       }
       this.o = Integer.valueOf(p0);
       return;
    }
    public final void T(){
       this.postOnAnimation(new b(this));
    }
    public boolean b(){
       return this.g;
    }
    public int c(){
       if (!this.getChildCount()) {
          return -1;
       }
       return this.b.D().intValue();
    }
    public boolean canScrollHorizontally(){
       return this.y.b();
    }
    public boolean canScrollVertically(){
       return this.y.a();
    }
    public int computeHorizontalScrollExtent(RecyclerView$y p0){
       return this.y.g(p0);
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       return this.y.e(p0);
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       return this.y.l(p0);
    }
    public int computeVerticalScrollExtent(RecyclerView$y p0){
       return this.y.f(p0);
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       return this.y.h(p0);
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       return this.y.i(p0);
    }
    public void detachAndScrapAttachedViews(RecyclerView$t p0){
       super.detachAndScrapAttachedViews(p0);
       this.e.clear();
    }
    public int e(){
       return this.j;
    }
    public void g(boolean p0){
       this.g = p0;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public int getItemCount(){
       return (super.getItemCount() + this.c.b());
    }
    public int h(){
       View view;
       Iterator iterator = this.d.iterator();
       while (true) {
          Iterator iterator1 = iterator;
          if (!iterator1.hasNext()) {
             return -1;
          }
          view = iterator1.next();
          Rect rect = this.b.t(view);
          if (this.b.c(rect) && this.b.z(rect)) {
             break ;
          }
       }
       return this.getPosition(view);
    }
    public int i0(){
       if (!this.getChildCount()) {
          return -1;
       }
       return this.b.B().intValue();
    }
    public boolean isLayoutRTL(){
       boolean b = true;
       if (this.getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean k(){
       return this.m;
    }
    public void m(Integer p0){
       if (p0.intValue() < 1) {
          throw new IllegalArgumentException("maxViewsInRow should be positive, but is = "+p0);
       }
       this.h = p0;
       this.o = Integer.valueOf(0);
       this.n.l();
       this.T();
       return;
    }
    public Integer n(){
       return this.h;
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
       if (p0 != null && this.w.e0()) {
          try{
             this.w.c(false);
             p0.I0(this.w);
          }catch(java.lang.IllegalStateException e0){
          }
       }
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       c.b("onItemsAdded", "starts from = "+p1+", item count = "+p2, 1);
       super.onItemsAdded(p0, p1, p2);
       this.S(p1);
    }
    public void onItemsChanged(RecyclerView p0){
       c.b("onItemsChanged", "", 1);
       super.onItemsChanged(p0);
       this.n.l();
       this.S(0);
    }
    public void onItemsMoved(RecyclerView p0,int p1,int p2,int p3){
       Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3)};
       c.b("onItemsMoved", String.format(Locale.US, "from = %d, to = %d, itemCount = %d", objArray), 1);
       super.onItemsMoved(p0, p1, p2, p3);
       this.S(Math.min(p1, p2));
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
       c.b("onItemsRemoved", "starts from = "+p1+", item count = "+p2, 1);
       super.onItemsRemoved(p0, p1, p2);
       this.S(p1);
       this.w.b(p0);
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2){
       c.b("onItemsUpdated", "starts from = "+p1+", item count = "+p2, 1);
       super.onItemsUpdated(p0, p1, p2);
       this.S(p1);
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2,Object p3){
       this.onItemsUpdated(p0, p1, p2);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       t ot;
       h oh;
       this.A.a(p0, p1);
       String c = ChipsLayoutManager.C;
       c.a(c, "onLayoutChildren. State ="+p1);
       if (!this.getItemCount()) {
          this.detachAndScrapAttachedViews(p0);
          return;
       }else {
          String str = "isPreLayout = "+p1.g();
          int i = 4;
          if (c.a.a(i)) {
             c.d("onLayoutChildren", str);
          }
          if (this.isLayoutRTL() != this.s) {
             this.s = this.isLayoutRTL();
             this.detachAndScrapAttachedViews(p0);
          }
          ChipsLayoutManager th = this.h;
          int i1 = (th == null)? 10: th.intValue();
          p0.G((int)((float)i1 * 2.00f));
          int i2 = 5;
          if (p1.g()) {
             i1 = this.c.a(p0);
             c.b("LayoutManager", "height ="+this.getHeight(), i);
             c.b("onDeletingHeightCalc", "additional height  = "+i1, i);
             AnchorViewState uAnchorViewS = this.x.b();
             this.u = uAnchorViewS;
             this.x.c(uAnchorViewS);
             c.b.w(c, "anchor state in pre-layout = "+this.u);
             this.detachAndScrapAttachedViews(p0);
             a uoa = this.v.q();
             uoa.c(i2);
             if (i1 >= 0) {
                uoa.a = i1;
                ot = this.v.a(uoa, this.z.a());
                this.r.c(this.u);
                oh = ot.b(this.u);
                this.N(p0, oh, ot.c(this.u));
                this.B = true;
             }else {
                throw new IllegalArgumentException("additional height can\'t be negative");
             }
          }else {
             this.detachAndScrapAttachedViews(p0);
             this.n.e(this.u.c().intValue());
             Integer integer = null;
             if (this.o != null && this.u.c().intValue() <= this.o.intValue()) {
                this.o = integer;
             }
             a uoa1 = this.v.q();
             uoa1.c(i2);
             t ot1 = this.v.a(uoa1, this.z.a());
             h oh1 = ot1.b(this.u);
             oh = ot1.c(this.u);
             this.N(p0, oh1, oh);
             if (this.y.d(p0, integer)) {
                c.a(c, "normalize gaps");
                this.u = this.x.b();
                this.T();
             }
             if (this.B != null) {
                ot = this.v.a(new p(), new b(this.z.a));
                a$a uoa2 = this.c.c(p0);
                if (uoa2.c() > 0) {
                   c.a("disappearing views", "count = "+uoa2.c());
                   c.a("fill disappearing views", "");
                   Objects.requireNonNull(ot);
                   oh.X(ot.e.a());
                   oh.Y(ot.f.a());
                   for (int i3 = 0; i3 < uoa2.b().size(); i3 = i3 + 1) {
                      oh.w(p0.o(uoa2.b().keyAt(i3)));
                   }
                   oh.v();
                   oh1.X(ot.e.b());
                   oh1.Y(ot.f.b());
                   for (int i4 = 0; i4 < uoa2.a().size(); i4 = i4 + 1) {
                      oh1.w(p0.o(uoa2.a().keyAt(i4)));
                   }
                   oh1.v();
                }
             }
             this.B = false;
          }
          this.c.reset();
          if (!p1.f()) {
             this.w.a();
          }
          return;
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       this.q = p0;
       ParcelableContainer b = p0.b;
       this.u = b;
       if (this.t != p0.e) {
          AnchorViewState uAnchorViewS = this.x.a();
          this.u = uAnchorViewS;
          uAnchorViewS.f(Integer.valueOf(b.c().intValue()));
       }
       this.n.c(this.q.c.get(this.t));
       this.o = this.q.d.get(this.t);
       String c = ChipsLayoutManager.C;
       c.a(c, "RESTORE. last cache position before cleanup = "+this.n.j());
       ChipsLayoutManager to = this.o;
       if (to != null) {
          this.n.e(to.intValue());
       }
       this.n.e(this.u.c().intValue());
       c.a(c, "RESTORE. anchor position ="+this.u.c());
       c.a(c, "RESTORE. layoutOrientation = "+this.t+" normalizationPos = "+this.o);
       c.a(c, "RESTORE. last cache position = "+this.n.j());
       return;
    }
    public Parcelable onSaveInstanceState(){
       ChipsLayoutManager tq = this.q;
       tq.b = this.u;
       tq.c.put(this.t, this.n.a());
       this.q.e = this.t;
       String c = ChipsLayoutManager.C;
       c.a(c, "STORE. last cache position ="+this.n.j());
       ChipsLayoutManager to = this.o;
       if (to != null) {
       }else {
          to = this.n.j();
       }
       c.a(c, "STORE. layoutOrientation = "+this.t+" normalizationPos = "+to);
       this.q.d.put(this.t, to);
       return this.q;
    }
    public void s(e p0,RecyclerView$t p1,RecyclerView$y p2){
       if (this.o != null && this.getChildCount() > 0) {
          int position = this.getPosition(this.getChildAt(0));
          if (position < this.o.intValue() || (!this.o.intValue() && this.o.intValue() == position)) {
             c.a("normalization", "position = "+this.o+" top view position = "+position);
             c.a(ChipsLayoutManager.C, "cache purged from position "+position);
             this.n.e(position);
             this.o = null;
             this.T();
          }
       }
       this.u = this.x.b();
       a uoa = this.v.q();
       uoa.c(1);
       t ot = this.v.a(uoa, this.z.a());
       h oh = ot.b(this.u);
       this.N(p1, oh, ot.c(this.u));
       return;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return this.y.k(p0, p1, p2);
    }
    public void scrollToPosition(int p0){
       ChipsLayoutManager to;
       if (p0 >= this.getItemCount() || p0 < 0) {
          c.c("span layout manager", "Cannot scroll to "+p0+", item count "+this.getItemCount());
          return;
       }else {
          Integer integer = this.n.j();
          to = this.o;
          if (to == null) {
             to = integer;
          }
          this.o = to;
          if (integer != null && p0 < integer.intValue()) {
             p0 = this.n.b(p0);
          }
          AnchorViewState uAnchorViewS = this.x.a();
          this.u = uAnchorViewS;
          uAnchorViewS.f(Integer.valueOf(p0));
          super.requestLayout();
          return;
       }
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       return this.y.j(p0, p1, p2);
    }
    public void setMeasuredDimension(int p0,int p1){
       this.w.e(p0, p1);
       c.d(ChipsLayoutManager.C, "measured dimension = "+p1);
       super.setMeasuredDimension(this.w.d(), this.w.f());
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (p2 >= this.getItemCount() || p2 < 0) {
          c.c("span layout manager", "Cannot scroll to "+p2+", item count "+this.getItemCount());
          return;
       }else {
          RecyclerView$x ox = this.y.c(p0.getContext(), p2, 150, this.u);
          ox.p(p2);
          this.startSmoothScroll(ox);
          return;
       }
    }
    public boolean supportsPredictiveItemAnimations(){
       return true;
    }
    public i w(){
       return this.i;
    }
}
