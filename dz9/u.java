package dz9.u;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import ho5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import uh5.e;
import android.app.Application;
import o56.a;
import android.content.Context;
import lnc.i5;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.VideoFeed;
import f6a.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nf6.i;
import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import dz9.t;
import com.yxcorp.gifshow.widget.h$a;
import e17.i$b;
import com.yxcorp.gifshow.widget.h;
import e17.i;
import kf5.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.a1;
import ekd.p0;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import dz9.q;
import u07.u;
import dz9.r;
import w07.i;
import w07.l;
import dz9.s;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class u extends w0	// class@002024
{
    public final GifshowActivity C;
    public final BaseFragment D;
    public final QPhoto E;
    public boolean F;
    public int G;
    public final m0 H;
    public final SlidePageConfig I;

    public void u(m0 p0,SlidePageConfig p1){
       a a;
       int i;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("offline_cache");
       this.H = p0;
       this.I = p1;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.E = mPhoto;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, u.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.o(mPhoto, "photo");
          if (b.a(-607332832).z(mPhoto.getPhotoId())) {
             i = (this.W())? 0x7f080af2: 0x7f080af3;
          }else if(this.W()){
             i = 0x7f080af0;
          }else {
             i = 0x7f080af1;
          }
       }
       this.L(i);
       this.T(R.string.arg_RES_7f103a7a);
       if (!PatchProxy.applyVoid(objArray, this, u.class, "9")) {
          this.G = e.c();
          if (e.e() || (e.f() && i5.h(a.b()))) {
             this.G = this.G + i5.a(a.b());
          }
       }
       return;
    }
    public boolean E(){
       u obj = PatchProxy.apply(null, this, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.E;
       String str = "photo";
       a.o(obj, str);
       boolean b = false;
       int i = -607332832;
       if (!obj.isHlsVideo() || !b.a(i).C()) {
          obj = this.E;
          a.o(obj, str);
          if (obj.isHlsVideo()) {
             obj = null;
          label_0040 :
             u tE = this.E;
             a.o(tE, str);
             if (tE.isAllowPhotoDownload()) {
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                if (mE.isLogined() && b.a(i).G()) {
                   u tE1 = this.E;
                   if (tE1.mEntity instanceof VideoFeed && (!tE1.isAd() && (obj && this.I.Z0 == null))) {
                      b = true;
                   }
                }
             }
          label_007b :
             return b;
          }
       }
       obj = 1;
       goto label_0040 ;
    }
    public final boolean W(){
       Object obj = PatchProxy.apply(null, this, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!c.a() || (this.I.a0() || c.b()))? true: false;
       return b;
    }
    public final void X(){
       if (PatchProxy.applyVoid(null, this, u.class, "8")) {
          return;
       }
       String obj = b.a(-607332832);
       a.o(obj, "Singleton.get\(IOfflineCacheSource::class.java\)");
       obj = obj.E();
       if (TextUtils.x(obj)) {
          return;
       }
       this.C.startActivity(b.a(0x66dce92a).a(this.C, Uri.parse(obj)));
       return;
    }
    public final void Y(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ou, "7") && (!this.C.isFinishing() && !this.C.isDestroyed())) {
          i$b uob = h.b(R.string.arg_RES_7f100111, new t(this), 2000, this.G);
          a.o(uob, "BottomSkipToast.buildBot¡­00, mBottomMargin\n      \)");
          uob.v(false);
          i.z(uob);
       }
    label_004b :
       ou = this.E;
       a.o(ou, "photo");
       ou.setCacheType(3);
       b.a(-607332832).y(p0, this.E);
       Object obj = b.a(-607332832);
       a.o(obj, "Singleton.get\(IOfflineCacheSource::class.java\)");
       if (obj.B()) {
          this.X();
          b.a(-607332832).w(false);
       }
       return;
    }
    public void d(w0 p0,g p1){
       i$b uob;
       u ou = u.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ou, "4")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       int b = (this.o() == 0x7f080af3 || this.o() == 0x7f080af2)? true: false;
       if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ou, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("is_cached", Boolean.valueOf(b));
          jsonObject.c0("button_type", "OFFLINE_CACHING");
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          u tE = this.E;
          a.o(tE, "photo");
          uContentPack.photoPackage = w1.f(tE.getEntity());
          u1.M("", this.D, 6, uElementPack, uContentPack, null);
       }
       int i = -607332832;
       boolean b1 = b.a(i).D();
       boolean b2 = p0.A(a1.c());
       boolean b3 = p0.C(a1.c());
       if (b) {
          this.X();
          return;
       }else {
          b = 2000;
          if (!b3) {
             uob = new i$b();
             uob.x(R.string.arg_RES_7f1038e5);
             uob.k(this.C);
             uob.o(b);
             i.z(uob);
             return;
          }else if(!b1){
             uob = new i$b();
             uob.x(R.string.arg_RES_7f100589);
             uob.k(this.C);
             uob.o(b);
             i.z(uob);
             return;
          }else if(b2){
             if (b.a(i).u()) {
                this.Y(true);
             }else if(PatchProxy.applyVoid(null, this, ou, "6")){
                t$a uoa = new t$a(this.C);
                uoa.z(true);
                uoa.W0(R.string.arg_RES_7f103661);
                uoa.y0(R.string.arg_RES_7f100a8e);
                uoa.Q0(R.string.cancel);
                uoa.S0(R.string.arg_RES_7f10081b);
                uoa.u0(new q(this));
                uoa.t0(new r(this));
                uoa.a0(new i());
                uoa.L(new s(this));
                uoa.X();
             }
          }else {
             this.Y(false);
          }
          return;
       }
    }
    public void onShow(){
       u ou = u.class;
       if (PatchProxy.applyVoid(null, this, ou, "10")) {
          return;
       }
       boolean b = (this.o() == 0x7f080af3)? true: false;
       if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ou, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
          uElementPack.name = "PLAYER_PANEL_ENTRANCE_BUTTON";
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("is_cached", Boolean.valueOf(b));
          jsonObject.c0("button_type", "OFFLINE_CACHING");
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          u tE = this.E;
          a.o(tE, "photo");
          uContentPack.photoPackage = w1.f(tE.getEntity());
          u1.C0("", this.D, 6, uElementPack, uContentPack);
       }
       return;
    }
}
