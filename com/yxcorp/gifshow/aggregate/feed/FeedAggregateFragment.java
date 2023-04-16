package com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment$a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper;
import java.util.Map;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import a69.a;
import erd.g;
import crd.b;
import lnc.b9;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import ga5.j;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import k17.c;
import androidx.recyclerview.widget.RecyclerView$n;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment$b;
import s2b.a;
import s2b.d;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import pa5.n;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import elb.g0;
import a9c.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;
import a69.c;

public class FeedAggregateFragment extends RecyclerFragment	// class@00192c
{
    public QPhoto F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public int L;
    public b M;
    public final RecyclerView$i N;
    public static final int O;

    public void FeedAggregateFragment(){
       super();
       this.N = new FeedAggregateFragment$a(this);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FeedsAggregateTipsHelper(this);
    }
    public int f(){
       return 59;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedAggregateFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FeedAggregateFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(this.K)) {
          return 236;
       }
       return 0;
    }
    public String getPageParams(){
       Object[] obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(this.G);
       Object[] objArray1 = new Object[i];
       objArray1[0] = this.H;
       String str = ",";
       StringBuilder str1 = String.format("{contentType} = {%s}", objArray)+str+String.format("{pageType} = {%s}", objArray1);
       if (this.F != null) {
          obj = new Object[i];
          obj[0] = this.F.getBizId();
          str1 = str1+str+String.format("{type} = {%s}", obj);
       }
       return str1;
    }
    public String o(){
       FeedAggregateFragment tK;
       String obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.K))? super.o(): this.K;
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedAggregateFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.G = this.getArguments().getInt("contentType");
       this.H = this.getArguments().getString("pageType");
       this.I = this.getArguments().getString("extraInfo");
       this.J = this.getArguments().getString("timestamp");
       this.K = this.getArguments().getString("page2Name");
       this.L = this.getArguments().getInt("referPageID", 59);
       this.M = RxBus.f.f(n.class).observeOn(d.a).subscribe(new a(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FeedAggregateFragment.class, "2")) {
          return;
       }
       super.onDestroy();
       b9.a(this.M);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FeedAggregateFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.g7().I0(this.N);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedAggregateFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.ia().R0(this.h0());
       this.h0().addItemDecoration(new c(2, 0, 0, j.c()));
       if (this.getArguments() != null) {
          this.F = SerializableHook.getSerializable(this.getArguments(), "photo");
       }
       this.C.h(new FeedAggregateFragment$b(this));
       this.g7().F0(this.N);
       return;
    }
    public g vh(){
       PhotoItemViewParam$a obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoItemViewParam$a();
       obj.k(3);
       obj.l(this.f());
       obj.r(R.drawable.arg_RES_7f080a06);
       if (this.L == 16) {
          obj.g(true);
       }
       return new n(obj.a(), new g0());
    }
    public RecyclerView$LayoutManager xh(){
       KwaiStaggeredGridLayoutManager obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiStaggeredGridLayoutManager(2, 1);
       obj.setGapStrategy(2);
       return obj;
    }
    public i yh(){
       c obj = PatchProxy.apply(null, this, FeedAggregateFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.p = this.G;
       obj.q = this.H;
       obj.r = this.I;
       obj.s = this.J;
       return obj;
    }
}
