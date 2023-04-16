package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement;
import zsa.a;
import wq6.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.SimpleTabViewElement$createView$1;
import msd.l;
import mr6.b;
import mr6.a;
import java.util.Objects;
import ata.a;
import zq6.b;
import wq6.f;
import bo5.a;
import ata.b;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import xq6.a;
import ata.c;
import ata.d;
import fr6.i;
import brd.t;
import pr6.d;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import ata.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import crd.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import ata.f;
import ata.g;
import android.widget.FrameLayout;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import gr6.c;
import qsa.c;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bta.c;
import com.kwai.kcube.TabIdentifier;
import tkd.b;
import tkd.d;
import wo5.a;
import gsa.e0;
import java.lang.Integer;

public final class SimpleTabViewElement extends a	// class@00170b
{
    public a r;
    public d s;

    public void SimpleTabViewElement(h p0){
       a.p(p0, "tab");
       super(p0);
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleTabViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       return this.a(new SimpleTabViewElement$createView$1(this, p0));
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SimpleTabViewElement.class, "5")) {
          return;
       }
       super.k();
       SimpleTabViewElement tr = this.r;
       if (tr == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, a.class, "11")) {
          p m = a.M;
          a.o(m, "HomeTopStateId.TAB_IMAGE_TITLE");
          tr.g.a(tr.m.y().g(tr.l, m, new b(tr)));
          m = a.y;
          a.o(m, "HomeTopStateId.TAB_RED_DOT_NOTIFY");
          tr.g.a(tr.m.y().g(tr.l, m, new c(tr)));
       }
       tr = this.s;
       if (tr == null) {
          a.S("tabLottieViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, d.class, "12")) {
          tr.l.W(tr.g);
          tr.i.c(tr.n.m().compose(tr.n.c(FragmentEvent.DESTROY)).subscribe(new e(tr), Functions.d()));
          tr.i.c(tr.n.h().j().subscribe(new f(tr), Functions.d()));
          p n = a.N;
          a.o(n, "HomeTopStateId.TAB_COMMON_LOTTIE");
          tr.b = tr.l.y().g(tr.k, n, new g(tr));
       }
       return;
    }
    public void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SimpleTabViewElement.class, "3")) {
          return;
       }
       View view = this.j();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
       this.r = new a(this.x(), this.f(), view, this.y());
       view = this.j();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
       this.s = new d(this.x(), this.f(), view, this.e().d());
       TabViewInfo tabViewInfo = this.x().F("KEY_TAB_VIEW_INFO");
       SimpleTabViewElement tr = this.r;
       if (tr == null) {
          a.S("tabIconViewHelper");
       }
       TabViewInfo mTabIcon = (tabViewInfo != null)? tabViewInfo.mTabIcon: objArray;
       tr.b(mTabIcon);
       tr = this.s;
       if (tr == null) {
          a.S("tabLottieViewHelper");
       }
       if (tabViewInfo != null) {
          objArray = tabViewInfo.mTabLottie;
       }
       tr.c(objArray);
       super.l();
       return;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SimpleTabViewElement.class, "7")) {
          return;
       }
       super.m();
       SimpleTabViewElement tr = this.r;
       if (tr == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, a.class, "13")) {
          b9.a(tr.i);
          tr.i = objArray;
       }
       tr = this.s;
       if (tr == null) {
          a.S("tabLottieViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, d.class, "14")) {
          k1.m(tr.h);
          d j = tr.j;
          if (j != null) {
             j.dispose();
          }
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SimpleTabViewElement.class, "6")) {
          return;
       }
       super.n();
       SimpleTabViewElement tr = this.r;
       if (tr == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, a.class, "12")) {
          tr.g.c();
       }
       tr = this.s;
       if (tr == null) {
          a.S("tabLottieViewHelper");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, d.class, "13")) {
          d b = tr.b;
          if (b == null) {
             a.S("release");
          }
          b.release();
          tr.l.b(tr.g);
          tr.i.dispose();
       }
       return;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SimpleTabViewElement.class, "8")) {
          return;
       }
       a.p(p0, "rootPresenter");
       super.u(p0);
       if (this.x().l()) {
          p0.U7(new c(this.j()));
       }
       if (a.g("ato_operate", this.x().M2().getType())) {
          p0.U7(d.a(0x1a3e0336).rp(this.j(), this.e().d(), this.x().M2()));
       }
       PatchProxy.onMethodExit(SimpleTabViewElement.class, "8");
       return;
    }
    public void v(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleTabViewElement.class, "4")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       super.v(p0);
       SimpleTabViewElement tr = this.r;
       if (tr == null) {
          a.S("tabIconViewHelper");
       }
       p0 = p0.E;
       Objects.requireNonNull(tr);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tr, uoa, "7")) {
          tr.a = p0;
          if (!tr.d()) {
             tr.c();
          }else {
             tr.h();
             tr.e(tr.a);
          }
       }
       return;
    }
    public IconifyRadioButtonNew y(){
       View obj = PatchProxy.apply(null, this, SimpleTabViewElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j().findViewById(R.id.textView);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.library.widget.textview.IconifyRadioButtonNew");
       return obj;
    }
}
