package com.yxcorp.gifshow.relation.explore.presenter.gallery.n$a;
import qvb.q;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.n;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.util.Objects;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import iac.r0;
import android.view.View$OnClickListener;
import qvb.p;
import java.util.List;
import qvb.a;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import com.yxcorp.gifshow.pymk.f;
import java.util.Collection;
import ekd.q;
import qvb.n0;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.o;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.a;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$e;
import bac.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import iac.u0;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import bac.t;
import androidx.recyclerview.widget.RecyclerView$l;
import bac.p;

public class n$a implements q	// class@00184a
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       if (p1 != null) {
          Log.d("GalleryViewPresenter", "onError: "+p1.getMessage());
       }
       int i = 8;
       this.b.v.setVisibility(i);
       boolean b = false;
       if (this.b.t != null) {
          p0.t = b;
       }else {
          this.b.u.d(1);
          n$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, n.class, "3")) {
             tb.y.setVisibility(i);
             tb.u.d(3);
             tb.u.setVisibility(b);
             tb.u.q(3);
             tb.u.i(R.drawable.arg_RES_7f0805f5);
             tb.u.p(new r0(tb));
          }
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.b.t == null) {
          this.b.v.setVisibility(0);
          this.b.y.setVisibility(8);
       }
       this.b.u.setVisibility(8);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (!this.b.p.getItems().size()) {
          this.b.u.d(0);
          this.b.S8();
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       n$a tb;
       n on = n.class;
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (this.b.t != null) {
          p1.t = false;
       }
       int i = 8;
       this.b.v.setVisibility(i);
       this.b.u.setVisibility(i);
       this.b.y.setVisibility(false);
       Object[] objArray = null;
       if (p0) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, on, "10")) {
             RecommendUserResponseV2 recommendUse = tb.p.i2();
             if (recommendUse != null && !q.f(recommendUse.mFriendUserList)) {
                recommendUse = recommendUse.mFriendUserList;
                for (int i1 = 0; i1 < recommendUse.size(); i1 = i1 + 1) {
                   tb.p.d1().add(i1, recommendUse.get(i1));
                }
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, on, "13")) {
          n x = tb.x;
          if (x == null) {
             CarouselLayoutManager uCarouselLay = new CarouselLayoutManager(false, false);
             uCarouselLay.b0(3);
             if (!PatchProxy.applyVoid(objArray, tb, on, "14")) {
                tb.y.getViewTreeObserver().addOnGlobalLayoutListener(new o(tb));
             }
             tb.y.setLayoutManager(uCarouselLay);
             new t().b(tb.y);
             uCarouselLay.c0(new a(0.10f, 9));
             m om = new m(tb.p.l2(), tb.w, tb.p.getItems(), tb.s, tb.q, tb.C, tb.D, tb.r);
             tb.x = new a(0.10f, 9);
             tb.y.setAdapter(new a(0.10f, 9));
             uCarouselLay.N(new u0(tb));
             SwipeLayout swipeLayout = w9.c(tb.getActivity());
             if (swipeLayout != null) {
                swipeLayout.setFromEdge(true);
             }
             tb.y.setItemAnimator(new t());
          }else {
             x.O0(tb.p.getItems());
          }
       }
       if (!this.b.p.getItems().size()) {
          this.b.u.d(false);
          this.b.S8();
       }
       return;
    }
}
