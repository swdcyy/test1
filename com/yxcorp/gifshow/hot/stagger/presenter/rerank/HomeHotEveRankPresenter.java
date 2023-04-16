package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e50.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$enableDiffRefresh$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$scrollIdleTriggerRerank$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$rerankClickUseCustomEvent$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$scrollListener$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$rerankDataProvider$2;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import g50.i;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$a;
import erd.g;
import crd.b;
import e50.o;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import io.reactivex.subjects.PublishSubject;

public final class HomeHotEveRankPresenter extends PresenterV2	// class@0018c2
{
    public j p;
    public PublishSubject q;
    public RecyclerView r;
    public final p s;
    public final p t;
    public final p u;
    public final p v;
    public final p w;
    public final p x;
    public final g y;

    public void HomeHotEveRankPresenter(g p0){
       a.p(p0, "rankController");
       super();
       this.y = p0;
       this.s = s.c(HomeHotEveRankPresenter$enableDiffRefresh$2.INSTANCE);
       this.t = s.c(HomeHotEveRankPresenter$scrollIdleTriggerRerank$2.INSTANCE);
       this.u = s.c(HomeHotEveRankPresenter$rerankClickUseCustomEvent$2.INSTANCE);
       this.v = s.c(new HomeHotEveRankPresenter$scrollListener$2(this));
       this.w = s.c(new HomeHotEveRankPresenter$childAttachStateChangeListener$2(this));
       this.x = s.c(new HomeHotEveRankPresenter$rerankDataProvider$2(this));
    }
    public static final j P8(HomeHotEveRankPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("pageList");
       }
       return p0;
    }
    public static final RecyclerView R8(HomeHotEveRankPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("recyclerView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeHotEveRankPresenter.class, "8")) {
          return;
       }
       this.X7(RxBus.f.g(i.class, RxBus$ThreadMode.MAIN).subscribe(new HomeHotEveRankPresenter$a(this)));
       this.y.g(this.W8());
       HomeHotEveRankPresenter tr = this.r;
       String str = "recyclerView";
       if (tr == null) {
          a.S(str);
       }
       tr.addOnScrollListener(this.X8());
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       tr.addOnChildAttachStateChangeListener(this.V8());
       tr = this.q;
       if (tr == null) {
          a.S("itemClickPublisher");
       }
       tr.subscribe(new HomeHotEveRankPresenter$b(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, HomeHotEveRankPresenter.class, "10")) {
          return;
       }
       this.y.h();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeHotEveRankPresenter.class, "9")) {
          return;
       }
       HomeHotEveRankPresenter tr = this.r;
       String str = "recyclerView";
       if (tr == null) {
          a.S(str);
       }
       tr.removeOnScrollListener(this.X8());
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       tr.removeOnChildAttachStateChangeListener(this.V8());
       return;
    }
    public final int S8(RecyclerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeHotEveRankPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       int i = -1;
       if (layoutManage instanceof LinearLayoutManager) {
          i = layoutManage.c();
       }else if(layoutManage instanceof StaggeredGridLayoutManager){
          int[] ointArray = layoutManage.findLastVisibleItemPositions(null);
          a.o(ointArray, "into");
          int i1 = 1;
          int i2 = 0;
          int i3 = (!ointArray.length)? 1: 0;
          if (i3 ^ i1) {
             i3 = ointArray[i2];
             i = ointArray.length;
             for (; i2 < i; i2 = i2 + 1) {
                i3 = Math.max(ointArray[i2], i3);
             }
             i = i3;
          }
       }
       return i;
    }
    public final RecyclerView$o V8(){
       Object obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public final o W8(){
       Object obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final RecyclerView$r X8(){
       Object obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeHotEveRankPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.r8("HOME_ITEM_CLICK");
       a.o(obj, "inject\(HomeItemAccessIds.HOME_ITEM_CLICK\)");
       this.q = obj;
       obj = this.q8(RecyclerView.class);
       a.o(obj, "inject\(RecyclerView::class.java\)");
       this.r = obj;
       return;
    }
}
