package com.yxcorp.gifshow.follow.stagger.container.presenter.HomeFollowDebugInfoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.follow.stagger.container.presenter.HomeFollowDebugInfoPresenter$followDebugInfoAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.container.presenter.HomeFollowDebugInfoPresenter$a;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil;
import xl8.b;
import ria.a;
import ria.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import com.yxcorp.gifshow.follow.stagger.container.presenter.HomeFollowDebugInfoPresenter$onBind$2;
import oia.b;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import xf6.i;
import android.view.ViewStub;
import java.util.Objects;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qrd.l1;
import oia.a;
import android.view.View$OnClickListener;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class HomeFollowDebugInfoPresenter extends PresenterV2	// class@00115b
{
    public View p;
    public RecyclerView q;
    public final List r;
    public final p s;
    public View t;
    public RecyclerFragment u;

    public void HomeFollowDebugInfoPresenter(){
       super();
       this.r = new ArrayList();
       this.s = s.c(new HomeFollowDebugInfoPresenter$followDebugInfoAdapter$2(this));
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, HomeFollowDebugInfoPresenter.class, "6")) {
          return;
       }
       HomeFollowDebugInfoPresenter tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       a = c.a;
       this.X7(tu.Vg().g().subscribe(new HomeFollowDebugInfoPresenter$a(this), a));
       this.R8();
       FollowDegradeUtil i = FollowDegradeUtil.i;
       this.S8(i.c().a());
       this.P8().J0(new b(2, "端智能实验命中 : "+HomeFollowExperimentUtils.b()));
       this.X7(i.c().observable().subscribe(new b(new HomeFollowDebugInfoPresenter$onBind$2(this)), a));
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, HomeFollowDebugInfoPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final void R8(){
       View view;
       HomeFollowDebugInfoPresenter homeFollowDe = HomeFollowDebugInfoPresenter.class;
       if (PatchProxy.applyVoid(null, this, homeFollowDe, "7")) {
          return;
       }
       int i = 1;
       if (i.i()) {
          HomeFollowDebugInfoPresenter tt = this.t;
          if (tt instanceof ViewStub) {
             Objects.requireNonNull(tt, "null cannot be cast to non-null type android.view.ViewStub");
             view = tt.inflate();
             this.t = view;
             a.m(view);
             if (!PatchProxy.applyVoidOneRefs(view, this, homeFollowDe, "8")) {
                this.p = m1.f(view, 0x7f0a0f5a);
                RecyclerView recyclerView = m1.f(view, R.id.follow_debug_info);
                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
                recyclerView.addItemDecoration(new a());
                recyclerView.setAdapter(this.P8());
                this.q = recyclerView;
                homeFollowDe = this.p;
                if (homeFollowDe != null) {
                   homeFollowDe.setOnClickListener(new a(this));
                }
             }
          }
          View[] viewArray = new View[i];
          viewArray[0] = this.t;
          n.Z(0, viewArray);
       }else {
          View[] viewArray1 = new View[i];
          viewArray1[0] = this.t;
          n.Z(8, viewArray1);
       }
       return;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowDebugInfoPresenter.class, "9")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.P8().J0(new b(1, "最新的一次综合分更新:\n"+p0));
       }else {
          this.P8().J0(new b(1, "动态降级:暂无数据"));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowDebugInfoPresenter.class, "4")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0f59);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowDebugInfoPresenter.class, "5")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.u = obj;
       return;
    }
}
