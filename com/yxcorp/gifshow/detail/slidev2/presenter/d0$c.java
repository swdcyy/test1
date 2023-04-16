package com.yxcorp.gifshow.detail.slidev2.presenter.d0$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slidev2.presenter.d0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import cjd.e;
import erd.o;
import b8a.g2;
import erd.g;
import b8a.h2;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public class d0$c extends m	// class@0018f7
{
    public final d0 c;

    public void d0$c(d0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$c.class, "1")) {
          return;
       }
       d0$c tc = this.c;
       Objects.requireNonNull(tc);
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uod0, "6")) {
          tc.X7(b.a(0x330163e).addMissU(tc.r.getUser().getId(), 5).map(new e()).doOnNext(new g2(tc)).subscribe(new h2(tc)));
          if (!PatchProxy.applyVoid(objArray, tc, uod0, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_VOTE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("loc", "SLIDE_WINDOW_HEAD");
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tc.r.mEntity);
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
