package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$mAdapterDataObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import brd.t;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$g;
import erd.r;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$h;
import brd.w;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$i;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$j;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$k;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$l;
import erd.g;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$m;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$n;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$c;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$d;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$e;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$f;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$i;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.View;
import usd.q;
import java.lang.Integer;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$b;
import io.reactivex.g;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$p;
import ok.h;

public final class ProfileCreationScrollSizePresenter extends PresenterV2	// class@0012f4
{
    public RecyclerFragment p;
    public a q;
    public b r;
    public final p s;
    public final int t;
    public static final int u;
    public static final ProfileCreationScrollSizePresenter$a v;

    static {
       ProfileCreationScrollSizePresenter.v = new ProfileCreationScrollSizePresenter$a(null);
       ProfileCreationScrollSizePresenter.u = a1.d(0x7f070321);
    }
    public void ProfileCreationScrollSizePresenter(int p0){
       super();
       this.t = p0;
       this.s = s.c(new ProfileCreationScrollSizePresenter$mAdapterDataObserver$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationScrollSizePresenter.class, "5")) {
          return;
       }
       ProfileCreationScrollSizePresenter tp = this.p;
       a.m(tp);
       RecyclerView recyclerView = tp.h0();
       a.o(recyclerView, "mFragment!!.recyclerView");
       ProfileCreationScrollSizePresenter tp1 = this.p;
       a.m(tp1);
       ProfileCreationScrollSizePresenter tp2 = this.p;
       a.m(tp2);
       BaseFragment parentFragme = tp2.getParentFragment();
       a.m(parentFragme);
       this.X7(t.merge(tp1.I5().filter(ProfileCreationScrollSizePresenter$g.b), parentFragme.n1().filter(new ProfileCreationScrollSizePresenter$h(this))).flatMap(new ProfileCreationScrollSizePresenter$i(this, recyclerView)).filter(ProfileCreationScrollSizePresenter$j.b).map(new ProfileCreationScrollSizePresenter$k(this)).subscribe(new ProfileCreationScrollSizePresenter$l(this)));
       GifshowActivity activity = this.getActivity();
       a.m(activity);
       this.X7(activity.m().filter(ProfileCreationScrollSizePresenter$m.b).delay((long)300, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).filter(new ProfileCreationScrollSizePresenter$n(this)).flatMap(new ProfileCreationScrollSizePresenter$o(this, recyclerView)).filter(ProfileCreationScrollSizePresenter$c.b).map(new ProfileCreationScrollSizePresenter$d(this)).subscribe(new ProfileCreationScrollSizePresenter$e(this)));
       tp = this.q;
       a.m(tp);
       this.X7(tp.d.f("PROFILE_TAB_CHANGE").subscribe(new ProfileCreationScrollSizePresenter$f(this)));
       tp = this.p;
       a.m(tp);
       RecyclerView$i oi = this.R8();
       a.m(oi);
       tp.ia().F0(oi);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationScrollSizePresenter.class, "8")) {
          return;
       }
       ProfileCreationScrollSizePresenter tp = this.p;
       if (tp != null) {
          d uod = tp.ia();
          if (uod != null) {
             uod.I0(this.R8());
          }
       }
       b9.a(this.r);
       return;
    }
    public final int P8(RecyclerView p0){
       int top;
       View obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int childCount = p0.getChildCount();
       if (childCount <= 0) {
          return 0;
       }
       obj = p0.getChildAt((childCount - 1));
       if (obj != null) {
          childCount = q.u(((obj.getBottom() + p0.getPaddingBottom()) + p0.getPaddingTop()), p0.getMeasuredHeight());
          top = p0.getTop();
       }else {
          childCount = p0.getMeasuredHeight();
          top = p0.getTop();
       }
       return (childCount + top);
    }
    public final RecyclerView$i R8(){
       Object obj = PatchProxy.apply(null, this, ProfileCreationScrollSizePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final a S8(){
       return this.q;
    }
    public final RecyclerFragment V8(){
       return this.p;
    }
    public final t W8(RecyclerView p0){
       t ot;
       ProfileCreationScrollSizePresenter obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getHeight()) {
          obj = this.p;
          a.m(obj);
          obj.getClass();
          ot = t.just(Integer.valueOf(this.P8(p0)));
          a.o(ot, "Observable.just\(height\)");
       }else {
          ot = t.create(new ProfileCreationScrollSizePresenter$b(this, p0));
          a.o(ot, "Observable.create { emit¡­plete\(\)\n        }\n      }");
       }
       return ot;
    }
    public final int X8(){
       boolean b;
       ProfileCreationScrollSizePresenter obj = PatchProxy.apply(null, this, ProfileCreationScrollSizePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p;
       a.m(obj);
       int i = 0;
       if (obj.getParentFragment() instanceof TabHostFragment) {
          obj = this.p;
          a.m(obj);
          TabHostFragment parentFragme = obj.getParentFragment();
          a.m(parentFragme);
          PagerSlidingTabStrip pagerSliding = parentFragme.zh();
          a.o(pagerSliding, "\(mFragment!!.parentFragm\x20\x02HostFragment?\)!!.tabStrip\x00");
          b = pagerSliding.isShown();
       }else {
          b = false;
       }
       if (b) {
          i = ProfileCreationScrollSizePresenter.u;
       }
       return i;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationScrollSizePresenter.class, "3")) {
          return;
       }
       ProfileCreationScrollSizePresenter tr = this.r;
       if (tr != null && !tr.isDisposed()) {
          return;
       }
       this.r = b9.c(this.r, new ProfileCreationScrollSizePresenter$p(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationScrollSizePresenter.class, "1")) {
          return;
       }
       this.p = this.q8(RecyclerFragment.class);
       this.q = this.q8(a.class);
       return;
    }
}
