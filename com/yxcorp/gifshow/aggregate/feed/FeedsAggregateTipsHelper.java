package com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper$mNoMoreView$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import g9c.d;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public final class FeedsAggregateTipsHelper extends f	// class@00192f
{
    public final p l;
    public View m;
    public final RecyclerFragment n;

    public void FeedsAggregateTipsHelper(RecyclerFragment p0){
       a.p(p0, "fragment");
       super(p0);
       this.n = p0;
       this.l = s.c(new FeedsAggregateTipsHelper$mNoMoreView$2(this));
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, FeedsAggregateTipsHelper.class, "5")) {
          return;
       }
       View view = this.v();
       if (view != null) {
          this.n.ia().l1(view);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       FeedsAggregateTipsHelper uFeedsAggreg = FeedsAggregateTipsHelper.class;
       if (PatchProxy.isSupport(uFeedsAggreg) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uFeedsAggreg, "4")) {
          return;
       }
       a.p(p1, "error");
       super.k(p0, p1);
       View view = this.n();
       if (view != null) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(new FeedsAggregateTipsHelper$a(this));
          uoa.a(view);
       }
       return;
    }
    public View n(){
       Object obj = PatchProxy.apply(null, this, FeedsAggregateTipsHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          this.m = super.n();
       }
       return this.m;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, FeedsAggregateTipsHelper.class, "2")) {
          return;
       }
       this.n.ia().L0(this.v());
       return;
    }
    public final View v(){
       Object obj = PatchProxy.apply(null, this, FeedsAggregateTipsHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, FeedsAggregateTipsHelper.class, "6")) {
          return;
       }
       super.x();
       f tf = this.f;
       a.o(tf, "mLoadingView");
       tf.setVisibility(8);
       return;
    }
}
