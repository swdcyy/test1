package com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement;
import yra.a;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$a;
import nsd.u;
import lnc.a1;
import wq6.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$createView$1;
import msd.l;
import mr6.b;
import mr6.a;
import java.util.Objects;
import zra.a;
import zq6.b;
import wq6.f;
import bo5.a;
import zra.b;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import xq6.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import asa.a;
import com.kwai.kcube.TabIdentifier;
import tkd.b;
import tkd.d;
import wo5.a;
import gr6.c;
import xra.b;
import pr6.d;
import gsa.e0;
import java.lang.Integer;
import ysa.a;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextPaint;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import wkd.b;
import sb5.c;
import sb5.b;
import com.kwai.sdk.switchconfig.a;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import ura.o;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils$TruncateAt;
import wn5.b;
import android.app.Activity;
import e3a.a;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import wq6.g;
import java.lang.CharSequence;

public final class HomeBlockViewElement extends a	// class@001654
{
    public a m;
    public final h n;
    public final boolean o;
    public static final int p;
    public static final HomeBlockViewElement$a q;

    static {
       HomeBlockViewElement.q = new HomeBlockViewElement$a(null);
       HomeBlockViewElement.p = a1.d(0x7f070307);
    }
    public void HomeBlockViewElement(h p0,boolean p1){
       a.p(p0, "tab");
       super();
       this.n = p0;
       this.o = p1;
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeBlockViewElement.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       return this.a(new HomeBlockViewElement$createView$1(this, p0));
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeBlockViewElement.class, "4")) {
          return;
       }
       super.k();
       HomeBlockViewElement tm = this.m;
       if (tm == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, a.class, "11")) {
          p m = a.M;
          a.o(m, "HomeTopStateId.TAB_IMAGE_TITLE");
          tm.e.a(tm.k.y().g(tm.j, m, new b(tm)));
       }
       return;
    }
    public void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeBlockViewElement.class, "1")) {
          return;
       }
       View view = this.j();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
       this.m = new a(this.n, this.f(), view, this.x());
       TabViewInfo tabViewInfo = this.n.F("KEY_TAB_VIEW_INFO");
       HomeBlockViewElement tm = this.m;
       if (tm == null) {
          a.S("tabIconViewHelper");
       }
       if (tabViewInfo != null) {
          objArray = tabViewInfo.mXTabIcon;
       }
       tm.a(objArray);
       super.l();
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, HomeBlockViewElement.class, "6")) {
          return;
       }
       super.m();
       HomeBlockViewElement tm = this.m;
       if (tm == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(null, tm, a.class, "13")) {
          b9.a(tm.g);
          tm.g = null;
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeBlockViewElement.class, "5")) {
          return;
       }
       super.n();
       HomeBlockViewElement tm = this.m;
       if (tm == null) {
          a.S("tabIconViewHelper");
       }
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, a.class, "12")) {
          tm.e.c();
       }
       return;
    }
    public Object t(){
       HomeBlockViewElement$b uob = HomeBlockViewElement$b.class;
       HomeBlockViewElement$b obj = PatchProxy.apply(null, this, HomeBlockViewElement.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HomeBlockViewElement$b();
       TextView obj1 = this.i(R.id.tab_strip_item);
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip.Tab");
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uob, "4")) {
          a.p(obj1, "<set-?>");
          obj.c = obj1;
       }
       obj1 = this.x();
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uob, "2")) {
          a.p(obj1, "<set-?>");
          obj.b = obj1;
       }
       HomeBlockViewElement tn = this.n;
       if (!PatchProxy.applyVoidOneRefs(tn, obj, uob, "6")) {
          a.p(tn, "<set-?>");
          obj.d = tn;
       }
       return obj;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeBlockViewElement.class, "2")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(new a(this.o));
       if (a.g("ato_operate", this.n.M2().getType())) {
          p0.U7(d.a(0x1a3e0336).rp(this.j(), this.e().c(), this.n.M2()));
       }
       PatchProxy.onMethodExit(HomeBlockViewElement.class, "2");
       return;
    }
    public void v(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeBlockViewElement.class, "8")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       HomeBlockViewElement tm = this.m;
       if (tm == null) {
          a.S("tabIconViewHelper");
       }
       e0 e = p0.E;
       Objects.requireNonNull(tm);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(e), tm, uoa, "7")) {
          tm.a = e;
          if (!tm.c()) {
             tm.b();
          }else {
             tm.g();
             tm.d(tm.a);
          }
       }
       TextView textView = this.x();
       object oobject = a.a(this.n, p0, this.f())[0];
       Objects.requireNonNull(oobject, "null cannot be cast to non-null type kotlin.Int");
       textView.setTextColor(oobject.intValue());
       p0 = p0.l;
       if (p0 != null) {
          textView.setBackgroundResource(p0);
       }else {
          textView.setBackgroundResource(R.drawable.arg_RES_7f08032e);
       }
       return;
    }
    public final TextView w(Context p0){
       boolean b2;
       TextView obj = PatchProxy.applyOneRefs(p0, this, HomeBlockViewElement.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(p0);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       obj.setGravity(17);
       TextPaint paint = obj.getPaint();
       a.o(paint, "paint");
       boolean b = true;
       paint.setFakeBoldText(b);
       ActionBarSkinConfig uActionBarSk = this.n.F("KEY_TAB_ACTION_SKIN");
       if (uActionBarSk == null && HomeActionBarSkinHelper.m(this.n)) {
          b obj1 = b.a(-1397878105);
          a.o(obj1, "Singleton.get\(SkinManager::class.java\)");
          obj1 = obj1.a();
          if (b.a(-1397878105).d() && obj1 != null) {
             uActionBarSk = obj1.mActionBarSkinConfig;
          }
       }
       boolean b1 = false;
       if (uActionBarSk != null && a.t().d("enableXtabBgColorHotfix", b1)) {
          StateListDrawable stateListDra = new StateListDrawable();
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setShape(b1);
          gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042b));
          gradientDraw.setColor(0x12ffffff);
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setShape(b1);
          gradientDraw1.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042b));
          gradientDraw1.setColor(0x8ffffff);
          int[] ointArray = new int[b];
          ointArray[b1] = 0x10100a1;
          stateListDra.addState(ointArray, gradientDraw);
          int[] ointArray1 = new int[b1];
          stateListDra.addState(ointArray1, gradientDraw1);
          obj.setBackground(stateListDra);
       }else {
          obj.setBackgroundResource(R.drawable.arg_RES_7f08032e);
       }
       obj.setTextSize(b, 14.00f);
       o e = o.e;
       int i = e.c();
       obj.setPadding(i, b1, e.c(), b1);
       obj.setTextColor(a1.b(R.color.arg_RES_7f0606b7));
       obj.setTypeface(Typeface.defaultFromStyle(b1));
       obj.setMaxLines(b);
       obj.setSingleLine(b);
       obj.setEllipsize(TextUtils$TruncateAt.END);
       b uob = this.n.q("KEY_TAB_NAME_DEST");
       Activity uActivity = a.b(p0);
       if (!uActivity instanceof FragmentActivity) {
          uActivity = null;
       }
       if (uActivity != null) {
          d uod = c.a(uActivity);
          a.o(uod, "IKCubeHomeTabDataStore.get\(activity\)");
          b2 = uod.d().d("ato_operate");
       }else {
          b2 = this.f().x("ato_operate");
       }
       obj.setText(uob.d(b2));
       return obj;
    }
    public final TextView x(){
       View obj = PatchProxy.apply(null, this, HomeBlockViewElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j().findViewById(R.id.textView);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.widget.TextView");
       return obj;
    }
}
