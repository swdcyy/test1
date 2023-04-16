package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e50.g;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$scrollListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$childAttachStateChangeListener$2;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$rerankDataProvider$2;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import g50.i;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$a;
import erd.g;
import crd.b;
import e50.o;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import io.reactivex.subjects.PublishSubject;

public final class HomeFollowEveRankPresenter extends PresenterV2	// class@0011f1
{
    public i p;
    public PublishSubject q;
    public RecyclerView r;
    public final p s;
    public final p t;
    public final p u;
    public final g v;
    public final HomeFollowFragment w;

    public void HomeFollowEveRankPresenter(g p0,HomeFollowFragment p1){
       a.p(p0, "rankController");
       a.p(p1, "mHomeFollowFragment");
       super();
       this.v = p0;
       this.w = p1;
       this.s = s.c(new HomeFollowEveRankPresenter$scrollListener$2(this));
       this.t = s.c(new HomeFollowEveRankPresenter$childAttachStateChangeListener$2(this));
       this.u = s.c(new HomeFollowEveRankPresenter$rerankDataProvider$2(this));
    }
    public static final i P8(HomeFollowEveRankPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("pageList");
       }
       return p0;
    }
    public static final RecyclerView R8(HomeFollowEveRankPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("recyclerView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowEveRankPresenter.class, "5")) {
          return;
       }
       this.X7(RxBus.f.g(i.class, RxBus$ThreadMode.MAIN).subscribe(new HomeFollowEveRankPresenter$a(this)));
       this.v.g(this.W8());
       HomeFollowEveRankPresenter tr = this.r;
       String str = "recyclerView";
       if (tr == null) {
          a.S(str);
       }
       tr.addOnChildAttachStateChangeListener(this.V8());
       if (HomeFollowExperimentUtils.a()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.addOnScrollListener(this.X8());
       }
       tr = this.q;
       if (tr == null) {
          a.S("itemClickPublisher");
       }
       tr.subscribe(new HomeFollowEveRankPresenter$b(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowEveRankPresenter.class, "7")) {
          return;
       }
       this.v.h();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowEveRankPresenter.class, "6")) {
          return;
       }
       HomeFollowEveRankPresenter tr = this.r;
       String str = "recyclerView";
       if (tr == null) {
          a.S(str);
       }
       tr.removeOnChildAttachStateChangeListener(this.V8());
       if (HomeFollowExperimentUtils.a()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.removeOnScrollListener(this.X8());
       }
       return;
    }
    public final int S8(RecyclerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeFollowEveRankPresenter.class, "9");
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
       Object obj = PatchProxy.apply(null, this, HomeFollowEveRankPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final o W8(){
       Object obj = PatchProxy.apply(null, this, HomeFollowEveRankPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final RecyclerView$r X8(){
       Object obj = PatchProxy.apply(null, this, HomeFollowEveRankPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowEveRankPresenter.class, "1")) {
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
