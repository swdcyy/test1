package androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.ViewInfoStore;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$z;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.a;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.IndexOutOfBoundsException;
import androidx.recyclerview.widget.RecyclerView$l$c;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import a2.a;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.v$a;
import a2.i0;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.ChildHelper;
import java.lang.IllegalStateException;

public final class RecyclerView$t	// class@00089f
{
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public RecyclerView$s g;
    public RecyclerView$z h;
    public final RecyclerView i;

    public void RecyclerView$t(RecyclerView p0){
       this.i = p0;
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       this.b = null;
       this.c = new ArrayList();
       this.d = Collections.unmodifiableList(uArrayList);
       this.e = 2;
       this.f = 2;
    }
    public void A(int p0){
       this.a(this.c.get(p0), true);
       this.c.remove(p0);
    }
    public void B(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol.isTmpDetached()) {
          this.i.removeDetachedView(p0, false);
       }
       if (childViewHol.isScrap()) {
          childViewHol.unScrap();
       }else if(childViewHol.wasReturnedFromScrap()){
          childViewHol.clearReturnedFromScrapFlag();
       }
       this.C(childViewHol);
       if (this.i.mItemAnimator != null && !childViewHol.isRecyclable()) {
          this.i.mItemAnimator.j(childViewHol);
       }
       return;
    }
    public void C(RecyclerView$ViewHolder p0){
       boolean b = true;
       int i = 0;
       if (p0.isScrap() || p0.itemView.getParent() != null) {
          StringBuilder str = "Scrapped or attached views may not be recycled. isScrap:"+p0.isScrap()+" isAttached:";
          if (p0.itemView.getParent() == null) {
             b = false;
          }
          throw new IllegalArgumentException(str+b+this.i.exceptionLabel());
       }else if(!p0.isTmpDetached()){
          if (p0.shouldIgnore()) {
             throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView\(view\) before calling recycle."+this.i.exceptionLabel());
          }
          boolean b1 = p0.doesTransientStatePreventRecycling();
          RecyclerView mAdapter = this.i.mAdapter;
          int b2 = (mAdapter != null && (b1 && mAdapter.A0(p0)))? true: false;
          if (b2 || p0.isRecyclable()) {
             if (this.f > null && !p0.hasAnyOfTheFlags(526)) {
                b2 = this.c.size();
                if (b2 >= this.f && b2 > 0) {
                   this.A(i);
                   b2 = b2 - 1;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (b2 > 0 && !this.i.mPrefetchRegistry.d(p0.mPosition))) {
                   do {
                      b2 = b2 - 1;
                   } while (b2 < 0 || !this.i.mPrefetchRegistry.d(this.c.get(b2).mPosition));
                   b2 = b2 + b;
                }
             label_0086 :
                this.c.add(b2, p0);
                b2 = 1;
             }else {
                b2 = 0;
             }
             if (!b2) {
                this.a(p0, b);
             label_0095 :
                this.i.mViewInfoStore.removeViewHolder(p0);
                if (!b2 && (!b && b1)) {
                   p0.mBindingAdapter = null;
                   p0.mOwnerRecyclerView = null;
                }
             label_00a7 :
                return;
             }
          }else {
             b2 = 0;
          }
          b = false;
          goto label_0095 ;
       }else {
          throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: "+p0+this.i.exceptionLabel());
       }
    }
    public void D(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (!childViewHol.hasAnyOfTheFlags(12) && (!childViewHol.isUpdated() || this.i.canReuseUpdatedViewHolder(childViewHol))) {
          if (childViewHol.isInvalid() && (childViewHol.isRemoved() || this.i.mAdapter.j0())) {
             childViewHol.setScrapContainer(this, false);
             this.a.add(childViewHol);
          }else {
             throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."+this.i.exceptionLabel());
          }
       }else if(this.b == null){
          this.b = new ArrayList();
       }
       childViewHol.setScrapContainer(this, true);
       this.b.add(childViewHol);
       return;
    }
    public void E(RecyclerView$s p0){
       RecyclerView$t tg = this.g;
       if (tg != null) {
          tg.c();
       }
       this.g = p0;
       if (p0 != null && this.i.getAdapter() != null) {
          this.g.a();
       }
       return;
    }
    public void F(RecyclerView$z p0){
       this.h = p0;
    }
    public void G(int p0){
       this.e = p0;
       this.K();
    }
    public final boolean H(RecyclerView$ViewHolder p0,int p1,int p2,long p3){
       p0.mBindingAdapter = null;
       p0.mOwnerRecyclerView = this.i;
       int itemViewType = p0.getItemViewType();
       long nanoTime = this.i.getNanoTime();
       if (p3 - Long.MAX_VALUE && !this.g.l(itemViewType, nanoTime, p3)) {
          return false;
       }
       this.i.mAdapter.Z(p0, p1);
       this.g.d(p0.getItemViewType(), (this.i.getNanoTime() - nanoTime));
       this.b(p0);
       if (this.i.mState.g()) {
          p0.mPreLayoutPosition = p2;
       }
       return true;
    }
    public RecyclerView$ViewHolder I(int p0,boolean p1,long p2){
       RecyclerView$ViewHolder viewHolder1;
       List list;
       RecyclerView$ViewHolder viewHolder3;
       RecyclerView$t ot = this;
       int i = p0;
       boolean b = p1;
       if (i < 0 || i >= ot.i.mState.c()) {
          throw new IndexOutOfBoundsException("Invalid item position "+i+"\("+i+"\). Item count:"+ot.i.mState.c()+ot.i.exceptionLabel());
       }
       RecyclerView$ViewHolder viewHolder = null;
       boolean b1 = true;
       if (ot.i.mState.g()) {
          viewHolder1 = this.h(p0);
          if (viewHolder1 != null) {
             list = 1;
          label_0029 :
             if (viewHolder1 == null) {
                viewHolder1 = this.m(p0, p1);
                if (viewHolder1 != null) {
                   if (!ot.L(viewHolder1)) {
                      if (!b) {
                         viewHolder1.addFlags(4);
                         if (viewHolder1.isScrap()) {
                            ot.i.removeDetachedView(viewHolder1.itemView, false);
                            viewHolder1.unScrap();
                         }else if(viewHolder1.wasReturnedFromScrap()){
                            viewHolder1.clearReturnedFromScrapFlag();
                         }
                         ot.C(viewHolder1);
                      }
                      viewHolder1 = viewHolder;
                   }else {
                      list = 1;
                   }
                }
             }
             if (viewHolder1 == null) {
                int i1 = ot.i.mAdapterHelper.m(i);
                if (i1 >= 0 && i1 < ot.i.mAdapter.getItemCount()) {
                   int i2 = ot.i.mAdapter.f0(i1);
                   if (ot.i.mAdapter.j0()) {
                      viewHolder1 = ot.l(ot.i.mAdapter.d0(i1), i2, b);
                      if (viewHolder1 != null) {
                         viewHolder1.mPosition = i1;
                         list = 1;
                      }
                   }
                   if (!viewHolder1) {
                      RecyclerView$t h = ot.h;
                      if (h != null) {
                         View view = h.a(ot, i, i2);
                         if (view != null) {
                            viewHolder1 = ot.i.getChildViewHolder(view);
                            if (viewHolder1 != null) {
                               if (viewHolder1.shouldIgnore()) {
                                  throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."+ot.i.exceptionLabel());
                               }
                            }else {
                               throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder"+ot.i.exceptionLabel());
                            }
                         }
                      }
                   }
                   if (viewHolder1 == null) {
                      RecyclerView$ViewHolder viewHolder2 = this.i().f(i2);
                      if (viewHolder2 != null) {
                         viewHolder2.resetInternal();
                         if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                            ot.r(viewHolder2);
                         }
                      }
                      viewHolder1 = viewHolder2;
                   }
                   if (viewHolder1 == null) {
                      long nanoTime = ot.i.getNanoTime();
                      if (p2 - Long.MAX_VALUE && !ot.g.m(i2, nanoTime, p2)) {
                         return viewHolder;
                      }else {
                         RecyclerView$t i3 = ot.i;
                         viewHolder = i3.mAdapter.b0(i3, i2);
                         if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            RecyclerView recyclerView = RecyclerView.findNestedRecyclerView(viewHolder.itemView);
                            if (recyclerView != null) {
                               viewHolder.mNestedRecyclerView = new WeakReference(recyclerView);
                            }
                         }
                         ot.g.e(i2, (ot.i.getNanoTime() - nanoTime));
                         viewHolder3 = viewHolder;
                      label_0182 :
                         int i4 = list;
                         if (i4 && !ot.i.mState.g()) {
                            b = 8192;
                            if (viewHolder3.hasAnyOfTheFlags(b)) {
                               viewHolder3.setFlags(false, b);
                               if (ot.i.mState.k != null) {
                                  RecyclerView$t i5 = ot.i;
                                  ot.i.recordAnimationInfoIfBouncedHiddenView(viewHolder3, i5.mItemAnimator.u(i5.mState, viewHolder3, (RecyclerView$l.e(viewHolder3) | 0x1000), viewHolder3.getUnmodifiedPayloads()));
                               }
                            }
                         }
                         if (ot.i.mState.g() && viewHolder3.isBound()) {
                            viewHolder3.mPreLayoutPosition = i;
                         }else if(viewHolder3.isBound() && (viewHolder3.needsUpdate() || viewHolder3.isInvalid())){
                            b = this.H(viewHolder3, ot.i.mAdapterHelper.m(i), p0, p2);
                         label_01f6 :
                            ViewGroup$LayoutParams layoutParams = viewHolder3.itemView.getLayoutParams();
                            if (layoutParams == null) {
                               layoutParams = ot.i.generateDefaultLayoutParams();
                               viewHolder3.itemView.setLayoutParams(layoutParams);
                            }else if(!ot.i.checkLayoutParams(layoutParams)){
                               layoutParams = ot.i.generateLayoutParams(layoutParams);
                               viewHolder3.itemView.setLayoutParams(layoutParams);
                            }else {
                            }
                            layoutParams.mViewHolder = viewHolder3;
                            if (!i4 || !nanoTime) {
                               b1 = false;
                            }
                            layoutParams.mPendingInvalidate = b1;
                            return viewHolder3;
                         }
                         nanoTime = 0;
                         goto label_01f6 ;
                      }
                   }
                }else {
                   throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position "+i+"\(offset:"+i1+"\).state:"+ot.i.mState.c()+ot.i.exceptionLabel());
                }
             }
             viewHolder3 = viewHolder1;
             goto label_0182 ;
          }
       }else {
          viewHolder1 = viewHolder;
       }
       list = null;
       goto label_0029 ;
    }
    public void J(RecyclerView$ViewHolder p0){
       if (p0.mInChangeScrap != null) {
          this.b.remove(p0);
       }else {
          this.a.remove(p0);
       }
       p0.mScrapContainer = null;
       p0.mInChangeScrap = false;
       p0.clearReturnedFromScrapFlag();
       return;
    }
    public void K(){
       RecyclerView mLayout = this.i.mLayout;
       RecyclerView$LayoutManager mPrefetchMax = (mLayout != null)? mLayout.mPrefetchMaxCountObserved: 0;
       this.f = this.e + mPrefetchMax;
       for (int i = this.c.size() - 1; i >= 0 && this.c.size() > this.f; i = i - 1) {
          this.A(i);
       }
       return;
    }
    public boolean L(RecyclerView$ViewHolder p0){
       if (p0.isRemoved()) {
          return this.i.mState.g();
       }
       RecyclerView$ViewHolder mPosition = p0.mPosition;
       if (mPosition < null || mPosition >= this.i.mAdapter.getItemCount()) {
          throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position"+p0+this.i.exceptionLabel());
       }
       boolean b = false;
       if (!this.i.mState.g() && this.i.mAdapter.f0(p0.mPosition) != p0.getItemViewType()) {
          return b;
       }
       if (!this.i.mAdapter.j0()) {
          return true;
       }
       if (!p0.getItemId() - this.i.mAdapter.d0(p0.mPosition)) {
          b = true;
       }
       return b;
    }
    public void M(int p0,int p1){
       p1 = p1 + p0;
       int i = this.c.size() - 1;
       while (i >= 0) {
          RecyclerView$ViewHolder viewHolder = this.c.get(i);
          if (viewHolder != null) {
             RecyclerView$ViewHolder mPosition = viewHolder.mPosition;
             if (mPosition >= p0 && mPosition < p1) {
                viewHolder.addFlags(2);
                this.A(i);
             }
          }
          i = i - 1;
       }
       return;
    }
    public void a(RecyclerView$ViewHolder p0,boolean p1){
       RecyclerView$Adapter uAdapter;
       RecyclerView.clearNestedRecyclerViewIfNotNested(p0);
       RecyclerView$ViewHolder itemView = p0.itemView;
       RecyclerView mAccessibili = this.i.mAccessibilityDelegate;
       if (mAccessibili != null) {
          a uoa = mAccessibili.l();
          uoa = (uoa instanceof v$a)? uoa.l(itemView): null;
          i0.s0(itemView, uoa);
       }
       if (p1) {
          this.g(p0);
       }
       p0.mBindingAdapter = null;
       p0.mOwnerRecyclerView = null;
       this.i().i(p0);
       return;
    }
    public final void b(RecyclerView$ViewHolder p0){
       if (this.i.isAccessibilityEnabled()) {
          p0 = p0.itemView;
          if (!i0.z(p0)) {
             i0.D0(p0, 1);
          }
          RecyclerView mAccessibili = this.i.mAccessibilityDelegate;
          if (mAccessibili == null) {
             return;
          }else {
             a uoa = mAccessibili.l();
             if (uoa instanceof v$a) {
                uoa.m(p0);
             }
             i0.s0(p0, uoa);
          }
       }
       return;
    }
    public void c(){
       this.a.clear();
       this.z();
    }
    public void d(){
       int i = this.c.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          this.c.get(i2).clearOldPosition();
       }
       i = this.a.size();
       for (i2 = 0; i2 < i; i2 = i2 + 1) {
          this.a.get(i2).clearOldPosition();
       }
       RecyclerView$t tb = this.b;
       if (tb != null) {
          i = tb.size();
          for (; i1 < i; i1 = i1 + 1) {
             this.b.get(i1).clearOldPosition();
          }
       }
       return;
    }
    public void e(){
       this.a.clear();
       RecyclerView$t tb = this.b;
       if (tb != null) {
          tb.clear();
       }
       return;
    }
    public int f(int p0){
       if (p0 < 0 || p0 >= this.i.mState.c()) {
          throw new IndexOutOfBoundsException("invalid position "+p0+". State item count is "+this.i.mState.c()+this.i.exceptionLabel());
       }
       if (!this.i.mState.g()) {
          return p0;
       }
       return this.i.mAdapterHelper.m(p0);
    }
    public void g(RecyclerView$ViewHolder p0){
       RecyclerView mRecyclerLis = this.i.mRecyclerListener;
       if (mRecyclerLis != null) {
          mRecyclerLis.a(p0);
       }
       int i = this.i.mRecyclerListeners.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.i.mRecyclerListeners.get(i1).a(p0);
       }
       mRecyclerLis = this.i.mAdapter;
       if (mRecyclerLis != null) {
          mRecyclerLis.E0(p0);
       }
       RecyclerView$t ti = this.i;
       if (ti.mState != null) {
          ti.mViewInfoStore.removeViewHolder(p0);
       }
       return;
    }
    public RecyclerView$ViewHolder h(int p0){
       RecyclerView$t tb = this.b;
       if (tb != null) {
          int i = tb.size();
          if (i) {
             int i1 = 0;
             int i2 = 0;
             while (true) {
                if (i2 < i) {
                   RecyclerView$ViewHolder viewHolder = this.b.get(i2);
                   if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == p0) {
                      viewHolder.addFlags(32);
                      return viewHolder;
                   }else {
                      i2 = i2 + 1;
                   }
                }else if(this.i.mAdapter.j0()){
                   p0 = this.i.mAdapterHelper.m(p0);
                   if (p0 > 0 && p0 < this.i.mAdapter.getItemCount()) {
                      long l = this.i.mAdapter.d0(p0);
                      while (i1 < i) {
                         RecyclerView$ViewHolder viewHolder1 = this.b.get(i1);
                         if (!viewHolder1.wasReturnedFromScrap() && !viewHolder1.getItemId() - l) {
                            viewHolder1.addFlags(32);
                            return viewHolder1;
                         }
                         i1 = i1 + 1;
                      }
                   }
                }
             }
          }
       }
       return null;
    }
    public RecyclerView$s i(){
       if (this.g == null) {
          this.g = new RecyclerView$s();
       }
       return this.g;
    }
    public int j(){
       return this.a.size();
    }
    public List k(){
       return this.d;
    }
    public RecyclerView$ViewHolder l(long p0,int p1,boolean p2){
       RecyclerView$ViewHolder viewHolder;
       RecyclerView$ViewHolder viewHolder1;
       int i = this.a.size() - 1;
       while (true) {
          if (i >= 0) {
             viewHolder = this.a.get(i);
             if (!viewHolder.getItemId() - p0 && !viewHolder.wasReturnedFromScrap()) {
                if (p1 == viewHolder.getItemViewType()) {
                   viewHolder.addFlags(32);
                   if (viewHolder.isRemoved() && !this.i.mState.g()) {
                      viewHolder.setFlags(2, 14);
                      break ;
                   }
                   break ;
                }else if(!p2){
                   this.a.remove(i);
                   this.i.removeDetachedView(viewHolder.itemView, false);
                   this.y(viewHolder.itemView);
                }
             }
             i = i - 1;
          }else {
             i = this.c.size() - 1;
             while (true) {
                if (i < 0) {
                   return null;
                }
                viewHolder1 = this.c.get(i);
                if (!viewHolder1.getItemId() - p0 && !viewHolder1.isAttachedToTransitionOverlay()) {
                   if (p1 == viewHolder1.getItemViewType()) {
                      if (!p2) {
                         this.c.remove(i);
                      }
                   }else if(!p2){
                      this.A(i);
                      return null;
                   }
                }
                i = i - 1;
             }
             return viewHolder1;
          }
       }
       return viewHolder;
    }
    public RecyclerView$ViewHolder m(int p0,boolean p1){
       RecyclerView$ViewHolder viewHolder1;
       int i = this.a.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             RecyclerView$ViewHolder viewHolder = this.a.get(i2);
             if (!viewHolder.wasReturnedFromScrap() && (viewHolder.getLayoutPosition() == p0 && (!viewHolder.isInvalid() && (this.i.mState.h != null || !viewHolder.isRemoved())))) {
                viewHolder.addFlags(32);
                return viewHolder;
             }else {
                i2 = i2 + 1;
             }
          }else if(!p1){
             View view = this.i.mChildHelper.findHiddenNonRemovedView(p0);
             if (view != null) {
                RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(view);
                this.i.mChildHelper.unhide(view);
                int i3 = this.i.mChildHelper.indexOfChild(view);
                if (i3 != -1) {
                   this.i.mChildHelper.detachViewFromParent(i3);
                   this.D(view);
                   childViewHol.addFlags(8224);
                   return childViewHol;
                }else {
                   throw new IllegalStateException("layout index should not be -1 after unhiding a view:"+childViewHol+this.i.exceptionLabel());
                }
             }
          }
          i = this.c.size();
          while (true) {
             if (i1 >= i) {
                return null;
             }
             viewHolder1 = this.c.get(i1);
             if (!viewHolder1.isInvalid() && (viewHolder1.getLayoutPosition() == p0 && !viewHolder1.isAttachedToTransitionOverlay())) {
                if (!p1) {
                   this.c.remove(i1);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          return viewHolder1;
       }
    }
    public View n(int p0){
       return this.a.get(p0).itemView;
    }
    public View o(int p0){
       return this.p(p0, false);
    }
    public View p(int p0,boolean p1){
       return this.I(p0, p1, Long.MAX_VALUE).itemView;
    }
    public final void q(ViewGroup p0,boolean p1){
       int i = p0.getChildCount() - 1;
       while (i >= 0) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup) {
             this.q(childAt, 1);
          }
          i = i - 1;
       }
       if (!p1) {
          return;
       }
       if (p0.getVisibility() == 4) {
          p0.setVisibility(0);
          p0.setVisibility(4);
       }else {
          p0.setVisibility(4);
          p0.setVisibility(p0.getVisibility());
       }
       return;
    }
    public final void r(RecyclerView$ViewHolder p0){
       p0 = p0.itemView;
       if (p0 instanceof ViewGroup) {
          this.q(p0, false);
       }
       return;
    }
    public void s(){
       int i = this.c.size();
       int i1 = 0;
       while (i1 < i) {
          RecyclerView$LayoutParams layoutParams = this.c.get(i1).itemView.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.mInsetsDirty = true;
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void t(){
       int i = this.c.size();
       int i1 = 0;
       while (i1 < i) {
          RecyclerView$ViewHolder viewHolder = this.c.get(i1);
          if (viewHolder != null) {
             viewHolder.addFlags(6);
             viewHolder.addChangePayload(null);
          }
          i1 = i1 + 1;
       }
       RecyclerView mAdapter = this.i.mAdapter;
       if (mAdapter == null || !mAdapter.j0()) {
          this.z();
       }
       return;
    }
    public void u(int p0,int p1){
       int i = this.c.size();
       int i1 = 0;
       while (i1 < i) {
          RecyclerView$ViewHolder viewHolder = this.c.get(i1);
          if (viewHolder != null && viewHolder.mPosition >= p0) {
             viewHolder.offsetPosition(p1, false);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void v(int p0,int p1){
       int i;
       int i1;
       if (p0 < p1) {
          i = p0;
          i1 = p1;
       }else {
          int i5 = 1;
          i1 = p0;
          i = p1;
       }
       int i2 = this.c.size();
       int i3 = 0;
       while (i3 < i2) {
          RecyclerView$ViewHolder viewHolder = this.c.get(i3);
          if (viewHolder != null) {
             RecyclerView$ViewHolder mPosition = viewHolder.mPosition;
             if (mPosition >= i && mPosition <= i1) {
                if (mPosition == p0) {
                   int i4 = p1 - p0;
                   viewHolder.offsetPosition(i4, false);
                }else {
                   viewHolder.offsetPosition(-1, false);
                }
             }
          }
          i3 = i3 + 1;
       }
       return;
    }
    public void w(int p0,int p1,boolean p2){
       int i = p0 + p1;
       int i1 = this.c.size() - 1;
       while (i1 >= 0) {
          RecyclerView$ViewHolder viewHolder = this.c.get(i1);
          if (viewHolder != null) {
             RecyclerView$ViewHolder mPosition = viewHolder.mPosition;
             if (mPosition >= i) {
                int i2 = - p1;
                viewHolder.offsetPosition(i2, p2);
             }else if(mPosition >= p0){
                viewHolder.addFlags(8);
                this.A(i1);
             }
          }
          i1 = i1 - 1;
       }
       return;
    }
    public void x(RecyclerView$Adapter p0,RecyclerView$Adapter p1,boolean p2){
       this.c();
       this.i().h(p0, p1, p2);
    }
    public void y(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       childViewHol.mScrapContainer = null;
       childViewHol.mInChangeScrap = false;
       childViewHol.clearReturnedFromScrapFlag();
       this.C(childViewHol);
    }
    public void z(){
       for (int i = this.c.size() - 1; i >= 0; i = i - 1) {
          this.A(i);
       }
       this.c.clear();
       if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
          this.i.mPrefetchRegistry.b();
       }
       return;
    }
}
