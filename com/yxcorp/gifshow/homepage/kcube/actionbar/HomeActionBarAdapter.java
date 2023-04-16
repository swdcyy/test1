package com.yxcorp.gifshow.homepage.kcube.actionbar.HomeActionBarAdapter;
import gr6.j;
import wq6.f;
import qsa.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wq6.h;
import mr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zq6.b;
import bo5.a;
import zq6.p;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement;
import gr6.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement;
import lnc.a1;
import wh5.c;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import gr6.h;
import com.yxcorp.gifshow.homepage.kcube.actionbar.decoratorview.BackgroundViewElement;
import gr6.l;
import ysa.a;
import gsa.e0;
import so5.a;
import java.lang.Boolean;
import ok.x;
import gr6.i;
import gr6.j$a;
import com.yxcorp.gifshow.homepage.kcube.actionbar.HomeActionBarAdapter$buildFakeViewPagerStyle$1;
import msd.a;
import rkd.b;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LiveViewElement;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.SearchViewElement;
import wsa.c;
import wsa.a;

public final class HomeActionBarAdapter implements j	// class@0016eb
{
    public final f a;
    public final h b;

    public void HomeActionBarAdapter(f p0,h p1){
       a.p(p0, "containerController");
       a.p(p1, "barViewStyle");
       super();
       this.a = p0;
       this.b = p1;
    }
    public b a(h p0){
       TopTabViewType obj = PatchProxy.applyOneRefs(p0, this, HomeActionBarAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       p r = a.r;
       a.o(r, "HomeTopStateId.TAB_VIEW_TYPE");
       obj = this.a.y().e(p0, r);
       if (TopTabViewType.NORMAL_WITH_AVATAR == obj) {
          return new TabWithAvatarViewElement(p0);
       }
       return new SimpleTabViewElement(p0);
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "4")) {
          return;
       }
       a.p(p0, "builder");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          p0.a("menu", new MenuViewElement());
          p0.b(a1.d(R.dimen.arg_RES_7f070356));
       }else if(!c.b()){
          p0.a("login_btn", new LoginButtonViewElement());
          p0.b(a1.d(R.dimen.pv));
       }
       return;
    }
    public void c(PagerSlidingTabStrip p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "1")) {
          return;
       }
       a.p(p0, "tabStrip");
       return;
    }
    public void d(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "7")) {
          return;
       }
       a.p(p0, "builder");
       return;
    }
    public void e(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "6")) {
          return;
       }
       a.p(p0, "builder");
       p0.a("background", new BackgroundViewElement(), 0);
       return;
    }
    public void f(l p0){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "3")) {
          return;
       }
       a.p(p0, "builder");
       HomeActionBarAdapter ta = this.a;
       p obj = PatchProxy.applyOneRefs(ta, null, a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(ta, "containerController");
          obj = a.e;
          a.o(obj, "HomeTopStateId.TAB_BAR_VIEW_INFO");
          obj1 = ta.y().d(obj);
          a.m(obj1);
          obj = obj1;
       }
       p0.a(obj.o);
       p0.n(this.b.d);
       p0.t(this.b.e);
       p0.i(this.b.f);
       if (obj.p != null) {
          p0.b(a1.a(R.color.arg_RES_7f06202f), a1.a(obj.q), obj.r, obj.s, obj.t);
       }else {
          p0.s();
       }
       p0.k(this.b.g);
       ta = this.b;
       p0.g(ta.b, ta.c);
       p0.c(0);
       p0.j(a1.a(R.color.arg_RES_7f060c42));
       p0.f(0);
       p0.m(0);
       p0.l(this.b.a);
       p0.u(0x3f800000);
       obj1 = PatchProxy.apply(null, null, a.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = a.c.get();
       }
       a.o(obj1, "KCubeExperimentUtils.enableActionBarFadeEdges\(\)");
       if (obj1.booleanValue()) {
          p0.q(true);
          p0.e(a1.e(12.00f));
       }
       return;
    }
    public void g(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "8")) {
          return;
       }
       a.p(p0, "builder");
       j$a.a(this, p0);
       p0.a(new HomeActionBarAdapter$buildFakeViewPagerStyle$1(this));
       return;
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeActionBarAdapter.class, "5")) {
          return;
       }
       a.p(p0, "builder");
       if (c.p() || c.l()) {
          p0.a("child_lock_close", new a());
          p0.c(a1.d(R.dimen.arg_RES_7f07025d));
       }else if(!c.b()){
          if (b.g()) {
             p0.a("live", new LiveViewElement());
             p0.d(a1.d(R.dimen.arg_RES_7f07031b));
          }
          p0.a("search", new SearchViewElement());
          p0.c(a1.d(R.dimen.arg_RES_7f070356));
       }else {
          p0.a("child_lock_level", new c());
          p0.c(a1.d(R.dimen.arg_RES_7f070295));
       }
       return;
    }
}
