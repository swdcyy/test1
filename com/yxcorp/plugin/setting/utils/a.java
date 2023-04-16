package com.yxcorp.plugin.setting.utils.a;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.setting.utils.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import e17.i;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import ki5.b;
import java.lang.CharSequence;
import ghd.h;
import ghd.b;
import ghd.c;
import u07.a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import ghd.r;
import com.kwai.library.widget.popup.common.c;
import k2b.e0;
import sgd.a;

public final class a implements u	// class@00092f
{
    public final GifshowActivity b;
    public final a c;
    public final PopupInterface$h d;

    public void a(GifshowActivity p0,a p1,PopupInterface$h p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       if (PatchProxy.applyVoidThreeRefsWithListener(tb, tc, td, null, b.class, "3")) {
       }else if(!p0.C(tb)){
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          PatchProxy.onMethodExit(b.class, "3");
       }else {
          d uod = new d(tb);
          uod.b1(KwaiDialogOption.d);
          uod.W0(R.string.arg_RES_7f100fb6);
          uod.y0(R.string.arg_RES_7f100fb7);
          uod.S0(R.string.arg_RES_7f1007f3);
          uod.R0(b.b().c(R.string.arg_RES_7f104243));
          uod.s0(new h(tb));
          uod.u0(new b(tc, tb));
          uod.t0(new c(tc, tb));
          t$a uoa = a.c(uod);
          uoa.V0(true);
          uoa.L(new b(R.layout.arg_RES_7f0d047a));
          uoa.Y(new r(tb, td));
          PatchProxy.onMethodExit(b.class, "3");
       }
       p0.q(3);
       a.e(tb, "", "myself");
       return;
    }
}
