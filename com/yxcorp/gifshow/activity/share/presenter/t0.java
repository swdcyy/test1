package com.yxcorp.gifshow.activity.share.presenter.t0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.presenter.v0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.t$a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.activity.share.presenter.u0;
import w07.l;
import w07.m;
import w07.a;
import w07.d;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class t0 implements View$OnClickListener	// class@001431
{
    public final v0 b;

    public void t0(v0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, v0.class, "3")) {
       }else {
          Activity activity = tb.getActivity();
          if (activity != null && !activity.isFinishing()) {
             t$a uoa = new t$a(activity);
             uoa.W0(R.string.arg_RES_7f100a3a);
             uoa.y0(R.string.arg_RES_7f100a37);
             uoa.S0(R.string.arg_RES_7f101812);
             uoa.L(new b(R.layout.arg_RES_7f0d14ec));
             uoa.a0(new u0(activity));
             uoa.a0(new m());
             uoa.a0(new a());
             uoa.a0(new d());
             uoa.v(true);
             uoa.Q(R.id.widget_popup_bottom_anim_view);
             uoa.G(g.a);
             uoa.O(j.a);
             uoa.Y(PopupInterface.a);
          }
       }
       return;
    }
}
