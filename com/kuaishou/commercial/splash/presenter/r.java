package com.kuaishou.commercial.splash.presenter.r;
import erd.g;
import com.kuaishou.commercial.splash.presenter.u;
import java.lang.Object;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.s;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.l1;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewParent;
import android.view.ViewStub;
import yx.j0;
import lnc.a1;
import android.text.SpannableStringBuilder;
import com.kuaishou.commercial.splash.SplashUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import lnc.b3;
import android.text.SpannableString;
import java.lang.Integer;
import im8.f;
import android.graphics.drawable.GradientDrawable;
import gz.p2;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import gz.n2;
import com.kuaishou.commercial.splash.presenter.s;
import crd.b;

public final class r implements g	// class@001606
{
    public final u b;

    public void r(u p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       p0 = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "6")) {
       }else if(PatchProxy.applyVoid(objArray, tb, p0, "12")){
          s h = tb.D.h;
          if (TextUtils.x(h)) {
             tb.w.setVisibility(8);
          }else {
             tb.w.setText(h);
          }
       }
       if (!PatchProxy.applyVoid(objArray, tb, p0, "11") && l1.a(tb.getActivity())) {
          tb.t.findViewById(0x7f0a172b).getLayoutParams().topMargin = n.c(tb.getContext(), 32.00f);
       }
       u d = tb.D;
       String str = "SplashImageFullScreelCoverPresenter";
       if (d.x != null) {
          if (!PatchProxy.applyVoid(objArray, tb, p0, "7")) {
             if (tb.z.getParent() != null) {
                tb.B = tb.z.inflate();
             }
             p0 = tb.B;
             if (p0 == null) {
                p0 = new Object[0];
                j0.c(str, "mShareButtonView error, will not show share button", p0);
             }else {
                u d1 = tb.D;
                p0.findViewById(R.id.splash_action_bar_text).setText(SplashUtils.g(d1.u, d1.v, a1.d(R.dimen.arg_RES_7f07034b)));
                if (tb.D.w != null && QCurrentUser.ME.isLogined()) {
                   p0 = tb.B.findViewById(R.id.avatar);
                   p0.setVisibility(0);
                   g.a(p0, QCurrentUser.ME, HeadImageSize.SMALL);
                }
             }
          }
       }else if(d.B == null || PatchProxy.applyVoid(objArray, tb, p0, "14")){
          if (tb.A.getParent() != null) {
             tb.C = tb.A.inflate();
          }
          p0 = tb.C;
          if (p0 == null) {
             p0 = new Object[0];
             j0.c(str, "mSplashButtonView error, will not show splash button", p0);
          }else {
             p0 = p0.findViewById(R.id.splash_button);
             tb.y = p0;
             p0.setVisibility(0);
             p0 = new SpannableStringBuilder();
             p0.append(tb.D.s);
             if (tb.D.E != null) {
                b3 uob3 = new b3(tb.getContext(), tb.getContext().getResources().getDrawable(0x7f082373));
                uob3.d(n.c(tb.getContext(), 8.00f), n.c(tb.getContext(), 16.00f));
                uob3.e(n.c(tb.getContext(), 6.00f));
                p0.append(uob3.a());
             }
             tb.y.setText(p0);
             int i = (tb.D.t > null)? n.c(tb.getContext(), (float)tb.D.t): n.c(tb.getContext(), 0x42f00000);
             ViewGroup$LayoutParams layoutParams = tb.y.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams.bottomMargin = i;
             }
             i = n.c(tb.getContext(), (float)tb.D.q);
             layoutParams.width = (i > 0)? i: n.c(tb.getContext(), 260.00f);
             tb.s.set(Integer.valueOf(layoutParams.width));
             i = n.c(tb.getContext(), (float)tb.D.r);
             layoutParams.height = (i > 0)? i: n.c(tb.getContext(), 52.00f);
             if (tb.D.p >= null) {
                i = tb.y.getBackground();
                i.setCornerRadius((float)a1.e((float)tb.D.p));
                tb.y.setBackground(i);
             }
             tb.y.setLayoutParams(layoutParams);
             tb.y.post(new p2(tb));
          }
       }
    label_020c :
       if (tb.D.l == null) {
          tb.P8();
       }
       p0 = tb.D;
       if (p0.e != null) {
          tb.u.setVisibility(8);
       }else {
          tb.X7(t.timer(p0.d, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new n2(tb), s.b));
       }
       return;
    }
}
