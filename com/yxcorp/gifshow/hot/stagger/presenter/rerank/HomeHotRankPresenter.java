package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ff6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$scrollListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$childAttachStateChangeListener$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$rerankDataProvider$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import g50.i;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$a;
import erd.g;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import e50.o;
import hf6.b;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class HomeHotRankPresenter extends PresenterV2	// class@0018d0
{
    public j p;
    public PublishSubject q;
    public HomeItemFragment r;
    public RecyclerView s;
    public b t;
    public final p u;
    public final p v;
    public final p w;
    public final d x;

    public void HomeHotRankPresenter(d p0){
       a.p(p0, "rankManager");
       super();
       this.x = p0;
       this.u = s.c(new HomeHotRankPresenter$scrollListener$2(this));
       this.v = s.c(new HomeHotRankPresenter$childAttachStateChangeListener$2(this));
       this.w = s.c(new HomeHotRankPresenter$rerankDataProvider$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeHotRankPresenter.class, "13")) {
          return;
       }
       this.X7(RxBus.f.g(i.class, RxBus$ThreadMode.MAIN).subscribe(new HomeHotRankPresenter$a(this)));
       this.P8();
       HomeHotRankPresenter ts = this.s;
       String str = "recyclerView";
       if (ts == null) {
          a.S(str);
       }
       ts.addOnScrollListener(this.V8());
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       ts.addOnChildAttachStateChangeListener(this.R8());
       ts = this.q;
       if (ts == null) {
          a.S("itemClickPublisher");
       }
       ts.subscribe(new HomeHotRankPresenter$b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeHotRankPresenter.class, "14")) {
          return;
       }
       HomeHotRankPresenter ts = this.s;
       String str = "recyclerView";
       if (ts == null) {
          a.S(str);
       }
       ts.removeOnScrollListener(this.V8());
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       ts.removeOnChildAttachStateChangeListener(this.R8());
       return;
    }
    public final void P8(){
       HomeHotRankPresenter homeHotRankP = HomeHotRankPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeHotRankP, "15")) {
          return;
       }
       HomeHotRankPresenter tr = this.r;
       if (tr == null) {
          a.S("fragment");
       }
       FragmentActivity activity = tr.getActivity();
       if (activity != null) {
          HomeHotRankPresenter tx = this.x;
          a.o(activity, "it");
          o oo = PatchProxy.apply(objArray, this, homeHotRankP, "12");
          if (oo == PatchProxyResult.class) {
             oo = this.w.getValue();
          }
          tx.g(activity, oo);
          this.t = this.x.h();
       }
       return;
    }
    public final RecyclerView$o R8(){
       Object obj = PatchProxy.apply(null, this, HomeHotRankPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final j S8(){
       HomeHotRankPresenter obj = PatchProxy.apply(null, this, HomeHotRankPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("pageList");
       }
       return obj;
    }
    public final RecyclerView$r V8(){
       Object obj = PatchProxy.apply(null, this, HomeHotRankPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeHotRankPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.r8("HOME_ITEM_CLICK");
       a.o(obj, "inject\(HomeItemAccessIds.HOME_ITEM_CLICK\)");
       this.q = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.r = obj;
       obj = this.q8(RecyclerView.class);
       a.o(obj, "inject\(RecyclerView::class.java\)");
       this.s = obj;
       return;
    }
}
