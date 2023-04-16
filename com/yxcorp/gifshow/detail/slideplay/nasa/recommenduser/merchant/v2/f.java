package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.f;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o6a.l;
import o6a.k;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.model.CommonParams;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import uw9.o;
import java.lang.Exception;
import q87.c;

public class f extends m	// class@0017a0
{
    public final e$a c;

    public void f(e$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, f.class, "1")) {
          return;
       }
       obj.c.S8();
       f c = obj.c;
       e$a p = c.p;
       int i = c.t.a();
       String str = "type";
       if (!PatchProxy.isSupport2(k.class, "4") || !PatchProxy.applyVoidTwoRefsWithListener(p, Integer.valueOf(i), null, k.class, "4")) {
          if (p != null) {
             int i1 = 0;
             try{
                if (!("empty").equals(p.mId)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "USER_RECO_CARD";
                   i3 oi3 = i3.f();
                   oi3.d("live_id", p.mLiveStreamId);
                   oi3.d("user_id", p.mId);
                   oi3.c(str, Integer.valueOf(i));
                   uElementPack.params = oi3.e();
                   ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                   uClickEvent.direction = i1;
                   uClickEvent.type = 1;
                   uClickEvent.elementPackage = uElementPack;
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.c0("live_id", p.mLiveStreamId);
                   jsonObject.c0("user_id", p.mId);
                   jsonObject.a0(str, Integer.valueOf(i));
                   ImmutableMap$b uob = new ImmutableMap$b();
                   uob.c("element_action", new g("USER_RECO_CARD"));
                   uob.c("page_name", new g("FEATURED_PAGE"));
                   uob.c("params", jsonObject);
                   CommonParams uCommonParam = new CommonParams();
                   uCommonParam.mEntryTag = uob.a();
                   b.a(0x4b316083).Y("", uClickEvent, null, false, null, uCommonParam, null);
                }
             }catch(java.lang.Exception e0){
                Object[] objArray = new Object[i1];
                o.C().t("MerchantRecommendUserLoggerV2", e0.toString(), objArray);
             }
             PatchProxy.onMethodExit(k.class, "4");
          }
          PatchProxy.onMethodExit(k.class, "4");
       }
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
