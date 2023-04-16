package com.kuaishou.commercial.splash.presenter.o0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.q0;
import java.lang.Object;
import android.view.ViewGroup;
import gz.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import yx.j0;
import android.widget.TextView;
import lnc.a1;
import android.text.SpannableStringBuilder;
import com.kuaishou.commercial.splash.SplashUtils;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import lnc.b3;
import com.yxcorp.utility.n;
import android.text.SpannableString;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;
import im8.f;
import android.graphics.drawable.GradientDrawable;
import gz.o4;
import java.lang.Runnable;

public final class o0 implements g	// class@0015fd
{
    public final q0 b;

    public void o0(q0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       p0 = q0.class;
       q0 e = tb.E;
       String str = "SplashVideoCoverPresenter";
       int i = 0;
       Object[] objArray = null;
       if (e.x != null) {
          if (!PatchProxy.applyVoid(objArray, tb, p0, "13")) {
             if (tb.y.getParent() != null) {
                tb.A = tb.y.inflate();
             }
             p0 = tb.A;
             if (p0 == null) {
                p0 = new Object[i];
                j0.c(str, "mShareButtonView error, will not show share button", p0);
             }else {
                e = tb.E;
                p0.findViewById(R.id.splash_action_bar_text).setText(SplashUtils.g(e.u, e.v, a1.d(R.dimen.arg_RES_7f07034b)));
                if (tb.E.w != null && QCurrentUser.ME.isLogined()) {
                   p0 = tb.A.findViewById(R.id.avatar);
                   p0.setVisibility(i);
                   g.a(p0, QCurrentUser.ME, HeadImageSize.SMALL);
                }
             }
          }
       }else if(e.B == null || PatchProxy.applyVoid(objArray, tb, p0, "12")){
          if (tb.z.getParent() != null) {
             tb.B = tb.z.inflate();
          }
          p0 = tb.B;
          if (p0 == null) {
             p0 = new Object[i];
             j0.c(str, "mSplashButtonView error, will not show splash button", p0);
          }else {
             p0 = p0.findViewById(R.id.splash_button);
             p0.setVisibility(i);
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             spannableStr.append(tb.E.s);
             if (tb.E.E != null) {
                b3 uob3 = new b3(tb.getContext(), tb.getContext().getResources().getDrawable(0x7f082373));
                uob3.d(n.c(tb.getContext(), 8.00f), n.c(tb.getContext(), 16.00f));
                uob3.e(n.c(tb.getContext(), 6.00f));
                spannableStr.append(uob3.a());
             }
             p0.setText(spannableStr);
             int i1 = (tb.E.t > null)? n.c(tb.getContext(), (float)tb.E.t): n.c(tb.getContext(), 0x42f00000);
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams.bottomMargin = i1;
             }
             i1 = n.c(tb.getContext(), (float)tb.E.q);
             layoutParams.width = (i1 > 0)? i1: n.c(tb.getContext(), 260.00f);
             tb.D.set(Integer.valueOf(layoutParams.width));
             i1 = n.c(tb.getContext(), (float)tb.E.r);
             layoutParams.height = (i1 > 0)? i1: n.c(tb.getContext(), 52.00f);
             p0.setLayoutParams(layoutParams);
             if (tb.E.p >= null) {
                GradientDrawable background = p0.getBackground();
                background.setCornerRadius((float)a1.e((float)tb.E.p));
                p0.setBackground(background);
             }
             p0.post(new o4(tb, p0));
          }
       }
    label_01a1 :
       return;
    }
}
