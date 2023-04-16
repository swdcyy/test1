package com.yxcorp.plugin.setting.utils.b;
import java.lang.Object;
import qyb.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import java.lang.StringBuilder;
import brd.t;
import ghd.g;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import ghd.j;
import u07.u;
import ghd.d;
import com.yxcorp.plugin.setting.utils.a;
import u07.a;
import com.yxcorp.plugin.setting.utils.b$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.setting.utils.b$c;
import com.kwai.library.widget.popup.common.c;
import ghd.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import u07.b;
import com.yxcorp.plugin.setting.utils.b$e;
import ekd.p0;
import e17.i;
import ki5.b;
import java.lang.CharSequence;
import ghd.i;
import ghd.o;
import ghd.m;
import com.yxcorp.plugin.setting.utils.b$b;
import com.yxcorp.plugin.setting.utils.b$a;

public class b	// class@000936
{

    public void b(){
       super();
    }
    public static int a(int p0){
       int i = 3;
       if (p0 != 1) {
          if (p0 != 2) {
             i = (p0 != i)? 4: 1;
          }
       }else {
          i = 2;
       }
       return i;
    }
    public static void b(int p0,a p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uob, "5")) {
          return;
       }
       b.a(0x330163e).changePrivateOption("follow_fans_list", b.a(p0)+"").subscribe(new g(p0, p1), new a());
       return;
    }
    public static void c(GifshowActivity p0,PopupInterface$h p1,a p2,PopupInterface$h p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, null, b.class, "8")) {
          return;
       }
       d uod = new d(p0);
       uod.b1(KwaiDialogOption.e);
       uod.B0(R.drawable.arg_RES_7f081f86);
       uod.W0(R.string.arg_RES_7f1046f5);
       uod.S0(R.string.arg_RES_7f1007f3);
       uod.Q0(R.string.arg_RES_7f104715);
       uod.s0(new j(p0));
       uod.u0(new d(p2, p0));
       uod.t0(new a(p0, p2, p3));
       t$a uoa = a.c(uod);
       uoa.V0(true);
       uoa.L(new b$d(R.layout.arg_RES_7f0d0479));
       uoa.Y(new b$c(p0, p1, p3));
       PatchProxy.onMethodExit(b.class, "8");
       return;
    }
    public static void d(GifshowActivity p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, b.class, "11")) {
          return;
       }
       d uod = new d(p0);
       uod.b1(KwaiDialogOption.d);
       uod.V0(true);
       uod.W0(R.string.arg_RES_7f10180c);
       uod.y0(R.string.arg_RES_7f10180f);
       uod.s0(new l(p0));
       uod.C0(j.k(p0, R.drawable.arg_RES_7f080f6e));
       uod = b.c(uod);
       uod.L(new b$e(R.layout.arg_RES_7f0d11ad, p0, p1, p2));
       uod.X();
       PatchProxy.onMethodExit(b.class, "11");
       return;
    }
    public static void e(GifshowActivity p0,a p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, null, null, b.class, "4")) {
          return;
       }
       if (!p0.C(p0)) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          PatchProxy.onMethodExit(b.class, "4");
          return;
       }else {
          d uod = new d(p0);
          uod.b1(KwaiDialogOption.d);
          uod.W0(R.string.arg_RES_7f100fb6);
          uod.y0(R.string.arg_RES_7f100fb7);
          uod.T0(b.b().c(R.string.arg_RES_7f104243));
          uod.Q0(R.string.arg_RES_7f104caf);
          uod.s0(new i(p0));
          uod.u0(new o(p0, p1));
          uod.t0(new m(p0));
          t$a uoa = a.c(uod);
          uoa.V0(true);
          uoa.L(new b$b(R.layout.arg_RES_7f0d047a));
          uoa.Y(new b$a(p0, null));
          PatchProxy.onMethodExit(b.class, "4");
          return;
       }
    }
}
