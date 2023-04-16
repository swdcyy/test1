package com.yxcorp.gifshow.homepage.menu.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import qta.h0;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.c;
import lnc.u1;
import brd.t;
import xl8.b;
import qta.k0;
import erd.g;
import crd.b;
import qta.i0;
import java.lang.Integer;
import dub.z;
import qta.j0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.homepage.menu.g;
import java.lang.Boolean;
import lnc.a1;
import android.view.View;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.u1;
import wh5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.e0;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.m;
import j9c.b;
import java.util.BitSet;
import qta.n0;
import uv8.n0;
import mrd.c;
import ekd.m1;
import com.yxcorp.gifshow.homepage.menu.e$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.homepage.menu.e$b;
import com.yxcorp.gifshow.homepage.menu.a;
import b66.k$a;

public class e extends PresenterV2	// class@001778
{
    public a p;
    public g q;
    public b r;
    public b s;
    public c t;
    public View u;
    public View v;
    public View w;
    public View x;
    public c y;
    public BitSet z;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       this.t = new h0(this);
       b.a(0x34c80eb4).t(this.t);
       u1.a(this);
       this.S8();
       this.X7(this.r.observable().subscribe(new k0(this)));
       this.X7(this.s.observable().subscribe(new i0(this)));
       this.R8();
       this.X7(z.l("HomeMenuSettingPresenter", Integer.valueOf(-3)).subscribe(new j0(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       u1.b(this);
       b.a(0x34c80eb4).v(this.t);
       return;
    }
    public final void P8(){
       ClientContent$ContentPackage uContentPack;
       Object obj = this;
       g og = g.class;
       if (PatchProxy.applyVoid(null, obj, e.class, "13")) {
          return;
       }
       if (obj.r.a().booleanValue() && !obj.s.a().booleanValue()) {
          e q = obj.q;
          String str = a1.p(R.string.arg_RES_7f10471b);
          boolean b = (!obj.v.getVisibility())? true: false;
          Objects.requireNonNull(q);
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(b), q, og, "29")) {
             ClientEvent$ElementPackage uElementPack2 = new ClientEvent$ElementPackage();
             uElementPack2.action2 = "MENU_BUTTON";
             uElementPack2.params = q.d("4", str, b, 0, "home").e();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = q.c("S-353926C9D720", "S-E1C2660BCCF6", b);
             u1.u0(3, uElementPack2, uContentPack);
          }
          q = obj.q;
          int i = 0x7f10471c;
          String str1 = a1.p(i);
          boolean b1 = (!obj.x.getVisibility())? true: false;
          boolean b2 = c.b();
          Objects.requireNonNull(q);
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(str1, Boolean.valueOf(b1), Boolean.valueOf(b2), q, g.class, "33")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "FLOW_OPERATE_LOC";
             i3 oi31 = q.d("6", str1, b1, 0, "home");
             String str3 = (b2)? "on": "off";
             oi31.d("status", str3);
             uElementPack1.params = oi31.e();
             ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
             uContentPack1.ksOrderInfoPackage = q.c("S-0C7AE44BC31B", "S-27612AD84075", b1);
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page2 = "APP_GENERAL";
             u1.y0(urlPackage, 3, uElementPack1, uContentPack1);
          }
          q = obj.q;
          String str2 = a1.p(i);
          boolean b3 = (!obj.x.getVisibility())? true: false;
          boolean b4 = c.b();
          Objects.requireNonNull(q);
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(str2, Boolean.valueOf(b3), Boolean.valueOf(b4), q, g.class, "31")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MENU_BUTTON";
             i3 oi3 = q.d("6", str2, b3, 0, "home");
             str1 = (b4)? "on": "off";
             oi3.d("status", str1);
             uElementPack.params = oi3.e();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = q.c("S-0C7AE44BC31B", "S-27612AD84075", b3);
             u1.C0("", null, 3, uElementPack, uContentPack);
          }
       }
    label_0174 :
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       m.j(this.getActivity(), this.v, false);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       boolean b = true;
       boolean b1 = (b.a(0x34c80eb4).i(1103) || b.b(-3) > 0)? true: false;
       if (b1 && !c.b()) {
          this.v.setVisibility(0);
          n0.c(this.z, 1103, b);
          m.j(this.getActivity(), this.v, 0);
       }else {
          this.v.setVisibility(8);
          n0.c(this.z, 1103, 0);
          n0.a(this.v);
       }
       n0.a(this.z, this.y, 1103);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a06e3);
       this.w = m1.f(p0, 0x7f0a3c7c);
       this.v = m1.f(p0, 0x7f0a38aa);
       p0 = m1.f(p0, R.id.tab_settings);
       this.u = p0;
       p0.setOnClickListener(new e$a(this));
       this.w.setOnClickListener(new e$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_MENU_CLOSE_HELPER");
       this.q = this.r8("HOME_MENU_LOGGER_V3");
       this.r = this.r8("HOME_SLIDE_PANEL_STATE");
       this.s = this.r8("MENU_EDITOR_OPEN_STATE");
       this.y = this.t8("MENU_RED_DOT_SUBJECT");
       this.z = this.t8("MENU_RED_DOT_BIT_SET");
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (p0.a == 2) {
          this.S8();
       }
       return;
    }
}
