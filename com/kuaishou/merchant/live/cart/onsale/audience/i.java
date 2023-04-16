package com.kuaishou.merchant.live.cart.onsale.audience.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import fs3.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e34.b;
import kp.r1;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.User;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import uo7.l;
import com.kuaishou.merchant.live.cart.onsale.audience.i$a;
import uo7.b0;
import com.kuaishou.merchant.live.cart.onsale.audience.i$b;
import com.kwai.sharelib.a;
import uo7.k;
import uo7.u;
import gic.l;
import k34.a0;
import com.kuaishou.merchant.live.cart.onsale.audience.i$c;
import gic.f;
import mhc.n1;
import gic.n;
import uo7.h;

public class i	// class@001944
{
    public final ClientContent$LiveStreamPackage a;
    public final GifshowActivity b;
    public String c;
    public final BaseFeed d;
    public final c$c e;

    public void i(ClientContent$LiveStreamPackage p0,GifshowActivity p1,BaseFeed p2,c$c p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
    }
    public void a(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
          return;
       }
       i td = this.d;
       if (td == null) {
          oi = this.e;
          if (oi != null) {
             oi.b();
          }
          b.o(1, 0, this.a);
          return;
       }else {
          this.c = r1.n1(td);
          KsShareBuilder ksShareBuild = new KsShareBuilder(this.b, "KS_MERCHANT_WELFARE", this.c, o2.c(37));
          JsonObject jsonObject = PatchProxy.apply(objArray, this, oi, "2");
          if (jsonObject != PatchProxyResult.class) {
          }else {
             User user = r1.T1(this.d);
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("liveStreamId", this.c);
             jsonObject1.c0("liveStreamTitle", TextUtils.i(r1.p0(this.d), r1.V1(this.d)));
             jsonObject1.c0("anchorName", r1.V1(this.d));
             String str = (user == null)? "": user.getAvatar();
             jsonObject1.c0("anchorAvatarUrl", str);
             jsonObject1.c0("anchorUserId", r1.U1(this.d));
             jsonObject1.c0("userName", QCurrentUser.ME.getName());
             jsonObject1.c0("userId", QCurrentUser.ME.getId());
             jsonObject = jsonObject1;
          }
          ksShareBuild.h(jsonObject);
          i$b uob = new i$b(this, this.d);
          new a(ksShareBuild.g(new i$a(this)).a(), uob).j(new l(new a0(this), uob, new i$c(this))).l();
          return;
       }
    }
}
