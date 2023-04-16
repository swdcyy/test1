package com.yxcorp.gifshow.homepage.menu.redesign.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import brd.t;
import t45.d;
import brd.z;
import tta.c0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import android.widget.TextView;
import xl8.b;
import tta.d0;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import tra.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import bt7.a;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import com.yxcorp.gifshow.homepage.menu.redesign.g$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.homepage.menu.redesign.g$b;
import android.text.TextPaint;
import wh5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.HomeActivity;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import e17.i;
import com.yxcorp.gifshow.homepage.menu.a;
import com.yxcorp.gifshow.homepage.menu.g;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.u1;
import uv8.n0;
import com.yxcorp.gifshow.homepage.wiget.a;
import qta.o0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.homepage.menu.redesign.f;
import ok.o;
import uc5.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import b66.k$a;
import com.kwai.framework.preference.startup.AvatarPendantConfig;
import oe6.b;

public class g extends PresenterV2	// class@001789
{
    public a p;
    public g q;
    public b r;
    public int s;
    public KwaiImageView t;
    public KwaiImageView u;
    public EmojiTextView v;
    public KwaiImageView w;
    public a x;

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       u1.a(this);
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new c0(this)));
       g.a(this.t, QCurrentUser.ME, HeadImageSize.BIG);
       this.v.setText(QCurrentUser.ME.getName());
       this.X7(this.r.observable().subscribe(new d0(this)));
       if (!PatchProxy.applyVoid(objArray, this, og, "13")) {
          ActivityUserIconModel uActivityUse = ActivityUserIconModel.class;
          String str = "";
          String str1 = a.a.getString("activityNickNameIcon", str);
          if (str1 != null && str1 != str) {
             objArray = b.a(str1, uActivityUse);
          }
          og = this.x;
          if (og == null) {
             this.x = new a(this.getActivity(), this.w, objArray);
          }else {
             og.b(objArray);
          }
          if (this.x.a()) {
             this.v.setPadding(0, 0, a1.e(22.00f), 0);
          }else {
             this.v.setPadding(0, 0, 0, 0);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.t.setOnClickListener(new g$a(this));
       this.v.setOnClickListener(new g$b(this));
       this.v.getPaint().setFakeBoldText(true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void P8(){
       ClientEvent$ElementPackage obj;
       boolean b;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "7")) {
          return;
       }
       int i = 1;
       int i1 = 4;
       if (c.b()) {
          obj = PatchProxy.apply(objArray, this, og, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.getActivity() instanceof HomeActivity && a.o0(this.getActivity()).p0() == i1){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
             return;
          }
       }
       this.p.a();
       this.q.a(i1);
       og = this.q;
       g ts = this.s;
       Objects.requireNonNull(og);
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(Boolean.FALSE, Integer.valueOf(0), Integer.valueOf(ts), og, g.class, "19")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "USER_INFO";
          uElementPack.params = og.f(0, 0, ts);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.ksOrderInfoPackage = og.c("S-997067D89C39", "S-9B77B0C635BA", 0);
          u1.u(i, uElementPack, uContentPack);
          if (!PatchProxy.applyVoid(objArray, objArray, n0.class, "1")) {
             obj = new ClientEvent$ElementPackage();
             obj.action = 1753;
             u1.u(i, obj, objArray);
          }
          a.b().c(810, "menu_avatar");
          Kgi.c(new o0(uContentPack));
       }
       d.a(-1718536792).wT(this.getActivity(), objArray);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       a.d(this.u, QCurrentUser.me().getPendants(), f.b);
       this.s = (!this.u.getVisibility() && a.a(QCurrentUser.me().getPendantType()))? QCurrentUser.ME.getPendantType(): 0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a2adb);
       this.t = m1.f(p0, 0x7f0a3c6e);
       this.w = m1.f(p0, 0x7f0a00d5);
       EmojiTextView uEmojiTextVi = m1.f(p0, R.id.tab_name);
       this.v = uEmojiTextVi;
       uEmojiTextVi.getPaint().setFakeBoldText(true);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_MENU_CLOSE_HELPER");
       this.q = this.r8("HOME_MENU_LOGGER_V3");
       this.r = this.r8("HOME_SLIDE_PANEL_STATE");
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       if (p0.a == 2) {
          if (!QCurrentUser.ME.isLogined()) {
             return;
          }else {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, objArray, a.class, "4")) {
                AvatarPendantConfig uAvatarPenda = b.c(AvatarPendantConfig.class);
                if (uAvatarPenda == null) {
                   QCurrentUser.me().setPendants(objArray);
                   QCurrentUser.me().setPendantType(0);
                }else {
                   QCurrentUser.me().setPendants(uAvatarPenda.mAvatarPendants);
                   QCurrentUser.me().setPendantType(uAvatarPenda.mPendantType);
                }
             }
             this.R8();
          }
       }
       return;
    }
}
