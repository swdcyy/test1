package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement;
import qsa.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement$childStateReader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement$loginBtnValueWatcher$2;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import android.graphics.Typeface;
import mr6.a;
import zq6.b;
import bo5.a;
import zq6.u;
import zq6.p;
import zq6.s;
import xq6.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xsa.n;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import gsa.e0;
import mr6.b;
import java.util.Objects;

public final class LoginButtonViewElement extends i	// class@0016f9
{
    public final p n;
    public final p o;
    public s p;
    public final int q;

    public void LoginButtonViewElement(){
       super();
       this.n = s.c(new LoginButtonViewElement$childStateReader$2(this));
       this.o = s.c(new LoginButtonViewElement$loginBtnValueWatcher$2(this));
       this.q = a1.a(0x7f061ed6);
    }
    public View c(ViewGroup p0){
       TextView textView = PatchProxy.applyOneRefs(p0, this, LoginButtonViewElement.class, "3");
       if (textView != PatchProxyResult.class) {
       }else {
          a.p(p0, "container");
          textView = new TextView(p0.getContext());
          textView.setId(R.id.left_text);
          textView.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
          textView.setGravity(17);
          textView.setText(a1.p(R.string.arg_RES_7f103059));
          textView.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070295));
          textView.setTypeface(null, 1);
          textView.setTextColor(a1.a(R.color.arg_RES_7f061f86));
          textView.setBackgroundResource(R.drawable.arg_RES_7f080962);
       }
       return textView;
    }
    public void k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LoginButtonViewElement loginButtonV = LoginButtonViewElement.class;
       if (PatchProxy.applyVoid(null, this, loginButtonV, "4")) {
          return;
       }
       super.k();
       b uob = PatchProxy.apply(null, this, loginButtonV, "1");
       if (uob == patchProxyRe) {
          uob = this.n.getValue();
       }
       p a = a.a;
       a.o(a, "HomeTopStateId.LOGIN_TEXT_BTN_VISIBILITY");
       Object obj = PatchProxy.apply(null, this, loginButtonV, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.o.getValue();
       }
       this.p = uob.b(a, obj);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, LoginButtonViewElement.class, "5")) {
          return;
       }
       super.n();
       LoginButtonViewElement tp = this.p;
       if (tp != null) {
          tp.release();
       }
       return;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LoginButtonViewElement.class, "6")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(new n());
       p0.U7(d.a(-2043427941).uE("home", R.id.left_text));
       PatchProxy.onMethodExit(LoginButtonViewElement.class, "6");
       return;
    }
    public void v(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginButtonViewElement.class, "7")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       if (!d.a(-2043427941).BH()) {
          View view = this.j();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
          view.setTextColor(p0.L);
          view.setShadowLayer(p0.N, p0.N, p0.N, this.q);
       }
       return;
    }
}
