package com.yxcorp.gifshow.home.block.topbar.actionbar.HomeBlockActionBarAdapter;
import gr6.j;
import wq6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wq6.h;
import mr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement;
import gr6.a;
import gr6.j$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.ViewGroup$LayoutParams;
import android.widget.HorizontalScrollView;
import ura.o;
import java.util.Objects;
import android.content.Context;
import android.view.View;
import gr6.h;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockBackgroundViewElement;
import gr6.l;
import android.app.Application;
import o56.a;
import java.lang.Number;
import lnc.a1;
import gr6.i;
import com.yxcorp.gifshow.home.block.topbar.actionbar.HomeBlockActionBarAdapter$buildFakeViewPagerStyle$1;
import msd.a;

public final class HomeBlockActionBarAdapter implements j	// class@00164d
{
    public final f a;
    public final boolean b;

    public void HomeBlockActionBarAdapter(f p0,boolean p1){
       a.p(p0, "containerController");
       super();
       this.a = p0;
       this.b = p1;
    }
    public b a(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeBlockActionBarAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       return new HomeBlockViewElement(p0, this.b);
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, "7")) {
          return;
       }
       a.p(p0, "builder");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, j$a.class, "2")) {
          a.p(p0, "builder");
       }
       return;
    }
    public void c(PagerSlidingTabStrip p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, str)) {
          return;
       }
       a.p(p0, "tabStrip");
       p0.getLayoutParams().width = -1;
       o e = o.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, o.class, str)) {
          a.p(p0, "tabContainer");
          Context context = p0.getContext();
          a.o(context, "tabContainer.context");
          p0.setPadding(e.a(context), p0.getPaddingTop(), e.a(context), p0.getPaddingBottom());
       }
       Objects.requireNonNull(e);
       p0.setTabTopPadding(o.b);
       Objects.requireNonNull(e);
       p0.setTabBottomPadding(o.c);
       p0.v(false);
       p0.setScrollWithPager(false);
       return;
    }
    public void d(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, "6")) {
          return;
       }
       a.p(p0, "builder");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, j$a.class, "5")) {
          a.p(p0, "builder");
       }
       return;
    }
    public void e(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, "5")) {
          return;
       }
       String str = "builder";
       a.p(p0, str);
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, j$a.class, "4")) {
          a.p(p0, str);
       }
       p0.a("background", new HomeBlockBackgroundViewElement(), 0);
       return;
    }
    public void f(l p0){
       int i;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, str)) {
          return;
       }
       a.p(p0, "builder");
       o e = o.e;
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       Objects.requireNonNull(e);
       Object obj = PatchProxy.applyOneRefs(uApplication, e, o.class, str);
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(uApplication, "context");
          i = e.b(uApplication);
          i = (375 <= i && 414 >= i)? a1.e(4.00f): a1.e(3.00f);
       }
       p0.g(i, i);
       return;
    }
    public void g(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, "4")) {
          return;
       }
       a.p(p0, "builder");
       j$a.a(this, p0);
       p0.a(HomeBlockActionBarAdapter$buildFakeViewPagerStyle$1.INSTANCE);
       return;
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockActionBarAdapter.class, "8")) {
          return;
       }
       a.p(p0, "builder");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, j$a.class, "3")) {
          a.p(p0, "builder");
       }
       return;
    }
}
