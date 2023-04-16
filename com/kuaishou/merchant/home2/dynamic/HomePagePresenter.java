package com.kuaishou.merchant.home2.dynamic.HomePagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter$onBind$1;
import hx3.e;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter$onBind$2;
import mkc.b;
import android.view.View;
import mkc.c;
import su.o;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter$onUnbind$1;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import kx3.b;
import kx3.d;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import uu.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.pagedy.util.PageDyUtil;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.bowl.core.component.a;
import su.a;
import com.kuaishou.merchant.pagedy.a;
import java.lang.Boolean;
import iv.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter$a;
import android.view.View$OnClickListener;
import ekd.m1;
import ax3.a;
import com.kwai.sdk.switchconfig.a;

public class HomePagePresenter extends PresenterV2	// class@001701
{
    public d p;
    public BaseFragment q;
    public a r;
    public ViewGroup s;
    public ViewGroup t;

    public void HomePagePresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomePagePresenter.class, "2")) {
          return;
       }
       HomePagePresenter tp = this.p;
       String str = "homePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       Activity activity = this.getActivity();
       String str1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity";
       Objects.requireNonNull(activity, str1);
       tp.v0().observe(activity, new e(new HomePagePresenter$onBind$1(this)));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       Activity activity1 = this.getActivity();
       Objects.requireNonNull(activity1, str1);
       tp.h.observe(activity1, new e(new HomePagePresenter$onBind$2(this)));
       tp = this.t;
       if (tp == null) {
          a.S("tipsContainer");
       }
       c.h(tp, this.R8());
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, HomePagePresenter.class, "12")) {
          return;
       }
       o.c().u();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomePagePresenter.class, "11")) {
          return;
       }
       HomePagePresenter tp = this.p;
       if (tp == null) {
          a.S("homePageViewModel");
       }
       tp.v0().removeObserver(new e(new HomePagePresenter$onUnbind$1(this)));
       return;
    }
    public void P8(ViewGroup p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomePagePresenter.class, "5")) {
          return;
       }
       p0.removeAllViews();
       ViewParent parent = p1.getParent();
       if (!parent instanceof ViewGroup) {
          parent = null;
       }
       if (parent != null) {
          parent.removeView(p1);
       }
       p0.addView(p1);
       return;
    }
    public b R8(){
       return b.d;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, HomePagePresenter.class, "7")) {
          return;
       }
       DynamicPageType[] uDynamicPage = DynamicPageType.values();
       int len = uDynamicPage.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          b dynamicRegis = uDynamicPage[i1].getDynamicRegisterModel();
          if (dynamicRegis != null) {
             this.Z8(dynamicRegis);
          }
          i1 = i1 + 1;
       }
       FeedType[] uFeedTypeArr = FeedType.values();
       len = uFeedTypeArr.length;
       while (i < len) {
          b dynamicRegis1 = uFeedTypeArr[i].getDynamicRegisterModel();
          if (dynamicRegis1 != null) {
             this.Z8(dynamicRegis1);
          }
          i = i + 1;
       }
       c uoc = c.a();
       HomePagePresenter tq = this.q;
       if (tq == null) {
          a.S("fragment");
       }
       uoc.s(PageDyUtil.a(tq), QPhoto.class);
       return;
    }
    public String V8(){
       return "merchant_home_default_page.json";
    }
    public String W8(){
       HomePagePresenter obj = PatchProxy.apply(null, this, HomePagePresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("fragment");
       }
       String str = obj.o();
       if (str == null) {
          str = "BUYER_HOME_PAGE";
       }
       return str;
    }
    public String X8(){
       return "/rest/app/square/home/mall/dynamic/page";
    }
    public final void Y8(a p0){
       HomePagePresenter tp;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePagePresenter.class, "3")) {
          return;
       }
       if (p0 != null) {
          tp = this.p;
          if (tp == null) {
             a.S("homePageViewModel");
          }
          if (a.g(p0, tp.w)) {
             return;
          }
       }
       this.a9(p0, false);
       tp = this.p;
       if (tp == null) {
          a.S("homePageViewModel");
       }
       tp.w = p0;
       return;
    }
    public final void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePagePresenter.class, "8")) {
          return;
       }
       HomePagePresenter tq = this.q;
       if (tq == null) {
          a.S("fragment");
       }
       a.g(tq, p0.c(), p0.b(), p0.a());
       return;
    }
    public void a9(a p0,boolean p1){
       HomePagePresenter ts;
       HomePagePresenter homePagePres = HomePagePresenter.class;
       if (PatchProxy.isSupport(homePagePres) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, homePagePres, "4")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       String str = "tipsContainer";
       if (p0 != null) {
          a rootView = p0.rootView;
          if (rootView != null) {
             HomePagePresenter tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             b[] uobArray = new b[]{this.R8(),b.g};
             c.d(tt, uobArray);
             homePagePres = this.t;
             if (homePagePres == null) {
                a.S(str);
             }
             homePagePres.setVisibility(8);
             homePagePres = this.r;
             if (homePagePres == null) {
                a.S("callerContext");
             }
             homePagePres.d("MAGNET_IS_GUARANTEE", Boolean.valueOf(p1));
             HomePagePresenter tr = this.r;
             if (tr == null) {
                a.S("callerContext");
             }
             p0.setCallerContexts(tr);
             ts = this.s;
             if (ts == null) {
                a.S("container");
             }
             this.P8(ts, rootView);
          label_00a0 :
             return;
          }
       }
       ts = this.t;
       if (ts == null) {
          a.S(str);
       }
       ts.setVisibility(i1);
       ts = this.t;
       if (ts == null) {
          a.S(str);
       }
       b[] uobArray1 = new b[i];
       uobArray1[i1] = this.R8();
       c.d(ts, uobArray1);
       ts = this.t;
       if (ts == null) {
          a.S(str);
       }
       KwaiEmptyStateView$a uoa = new KwaiEmptyStateView$a();
       uoa.p(new HomePagePresenter$a(this));
       c.e(ts, b.g, uoa);
       goto label_00a0 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePagePresenter.class, "9")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0c5c);
       this.t = m1.f(p0, 0x7f0a3f11);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomePagePresenter.class, "10")) {
          return;
       }
       BaseFragment uBaseFragmen = this.r8("FEED_FRAGMENT");
       this.q = uBaseFragmen;
       Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.kuaishou.merchant.home2.basic.CallerContextHolder");
       this.r = uBaseFragmen.h();
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.p = d.J0(activity);
       boolean b = a.t().d("merchantHomeAgileLocalOptimizeCode", false);
       if (a.g("BUYER_HOME_PAGE", this.W8()) && !b) {
          this.S8();
       }
       return;
    }
}
