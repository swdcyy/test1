package com.yxcorp.plugin.setting.presenter.k;
import a17.b$b;
import com.yxcorp.plugin.setting.presenter.m;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import e17.i;
import e17.s;
import k2b.e0;
import pgd.y;
import com.kwai.framework.model.user.QCurrentUser;
import sgd.b;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import tgd.s;
import u07.u;
import tgd.u;
import tgd.t;
import u07.a;
import com.kwai.library.widget.popup.common.c$b;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import tkd.b;
import tkd.d;
import zw5.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;

public final class k implements b$b	// class@0008e2
{
    public final m a;

    public void k(m p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       k ta = this.a;
       Objects.requireNonNull(ta);
       m om = m.class;
       int i = 0;
       int i1 = 0x7f1038e7;
       int i2 = 1;
       if (!p2) {
          if (!PatchProxy.isSupport(om) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, om, "7") && ta.t != null)) {
             if (!p0.C(ta.getActivity())) {
                s.e(i1);
             }else {
                b.d(ta.getActivity(), y.c(ta.t), (i2 ^ QCurrentUser.ME.isGiftUnfollow()), y.c(p2));
                ta.P8(i);
             }
          }
       }else {
          int i3 = 2;
          if (p2 == i2) {
             if (!PatchProxy.isSupport(om) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, om, "8") && ta.t != i3)) {
                if (!p0.C(ta.getActivity())) {
                   s.e(i1);
                }else {
                   b.d(ta.getActivity(), y.c(ta.t), (QCurrentUser.ME.isGiftUnfollow() ^ i2), y.c(p2));
                   ta.P8(i3);
                }
             }
          }else if(p2 == i3){
             if (!PatchProxy.isSupport(om) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, om, "10") && (ta.getActivity() != null && ta.t != i2))) {
                if (!p0.C(ta.getActivity())) {
                   s.e(i1);
                }else {
                   b.d(ta.getActivity(), y.c(ta.t), (QCurrentUser.ME.isGiftUnfollow() ^ i2), y.c(p2));
                   if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, om, "11")) {
                      d uod = new d(ta.getActivity());
                      uod.b1(KwaiDialogOption.d);
                      uod.B0(R.drawable.arg_RES_7f08229c);
                      uod.W0(R.string.arg_RES_7f103e2c);
                      uod.y0(R.string.arg_RES_7f10392e);
                      uod.S0(R.string.arg_RES_7f103e2d);
                      uod.Q0(R.string.arg_RES_7f104caf);
                      uod.s0(new s(ta));
                      uod.w0(i2);
                      uod.u0(new u(ta));
                      uod.t0(new t(ta));
                      t$a uoa = a.c(uod);
                      uoa.V0(i2);
                      uoa.B(i);
                      uoa.L(new b(R.layout.arg_RES_7f0d11af));
                      uoa.X();
                   }
                }
             }
          }else if(p2 != 3 || (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, om, "9"))){
             if (!p0.C(ta.getActivity())) {
                s.e(i1);
             }else {
                b.d(ta.getActivity(), y.c(ta.t), (i2 ^ QCurrentUser.ME.isGiftUnfollow()), y.c(p2));
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, ta, om, "13") && ta.getActivity() != null) {
                   if (ta.v > null) {
                      d.a(0x2001f24e).As(ta.getActivity(), "news_setting_privacy", ta.v);
                   }else {
                      d.a(0x2001f24e).QY("news_setting_privacy", ta.getActivity(), objArray);
                   }
                }
             }
          }
       }
       return;
    }
}
