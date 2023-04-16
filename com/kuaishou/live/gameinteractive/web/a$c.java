package com.kuaishou.live.gameinteractive.web.a$c;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j43.a;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import p91.m;
import jga.f$a;
import java.lang.StringBuilder;
import jga.f;
import u43.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.gameinteractive.web.b;
import com.kuaishou.live.gameinteractive.web.c;
import crd.b;
import pp.a;
import q87.c;

public class a$c implements g	// class@001bfc
{
    public final boolean b;
    public final c c;
    public final a d;

    public void a$c(a p0,boolean p1,c p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(boolean p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("follow_type", Integer.valueOf(p0));
       String str = oi3.e();
       String str1 = "INTERACTION_FOLLOW_SUCCESS";
       ClientContent$LiveStreamPackage liveStreamPa = this.d.p.b().a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(str1, liveStreamPa, str, Boolean.TRUE, null, a.class, "3")) {
          h$b uob = h$b.e(7, str1);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str1;
          uElementPack.params = TextUtils.k(str);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "LIVE_WATCH";
          uob.h(uContentPack);
          uob.k(uElementPack);
          uob.u(urlPackage);
          u1.r0(uob);
       }
       return;
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.d.getActivity();
          f$a uoa = new f$a(this.d.p.Z2.I(), p0.Q2());
          uoa.q(true);
          uoa.c("");
          uoa.o(p0.getUrl()+"#follow");
          p0 = uoa.b();
          if (this.b != null) {
             FollowHelper.c(p0, new b(this, this.c));
          }else {
             this.d.X7(FollowHelper.k(p0).subscribeOn(d.b).subscribe(new b(this), new c(this)));
          }
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "request permission failed!", objArray);
          this.c.onError(-2, "request permission failed!");
       }
       return;
    }
}
