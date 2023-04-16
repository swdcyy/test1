package com.kwai.locallife.live.bullet.a$a;
import kr5.c;
import com.kwai.locallife.live.bullet.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kwai.locallife.live.bullet.LiveLocalLifeBuyingBulletData;
import android.view.View;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.locallife.live.bullet.a$a$a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;

public class a$a extends c	// class@000eb3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.p(p0);
    }
    public void f(LiveFloatingScreenBaseData p0,View p1){
       this.o(p0, p1);
    }
    public void m(LiveFloatingScreenCommonData p0,View p1){
       this.o(p0, p1);
    }
    public boolean n(LiveFloatingScreenCommonData p0){
       return this.p(p0);
    }
    public void o(LiveLocalLifeBuyingBulletData p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       super.m(p0, p1);
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCALLIFE_LIVE_BUYING_POPUP";
          u1.B0(new ShowMetaData().setType(7).setElementPackage(uElementPack));
       }
       return;
    }
    public boolean p(LiveLocalLifeBuyingBulletData p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.n(p0);
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(null, obj, a.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCALLIFE_LIVE_BUYING_POPUP";
          u1.B(new ClickMetaData().setType(7).setElementPackage(uElementPack));
       }
       if (QCurrentUser.ME.isLogined()) {
          return this.a.P8(p0);
       }else {
          d.a(-1712118428).x00(this.a.getActivity(), 0, null, new a$a$a(this, p0));
          return true;
       }
    }
}
