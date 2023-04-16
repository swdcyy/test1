package com.yxcorp.gifshow.ad.detail.presenter.side.k$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
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
import g19.f0;
import erd.g;
import g19.g0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;

public class k$c extends m	// class@0016b2
{
    public final k c;

    public void k$c(k p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
          return;
       }
       k$c tc = this.c;
       Objects.requireNonNull(tc);
       k ok = k.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ok, "6")) {
          tc.X7(b.a(0x330163e).addMissU(tc.r.getUser().getId(), 5).map(new e()).doOnNext(new f0(tc)).subscribe(new g0(tc)));
          if (!PatchProxy.applyVoid(objArray, tc, ok, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_VOTE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("loc", "SLIDE_WINDOW_HEAD");
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tc.r.mEntity);
             u1.L("", tc.t, 1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
