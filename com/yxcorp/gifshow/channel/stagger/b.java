package com.yxcorp.gifshow.channel.stagger.b;
import k2b.t2$a;
import pa5.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import k2b.s2;
import android.view.View;
import pj9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import k2b.k2;
import k2b.u1;
import zk.g;
import com.google.gson.JsonElement;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap$b;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import pj9.a;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.yxcorp.gifshow.action.c;

public final class b implements t2$a	// class@00105f
{
    public final a a;

    public void b(a p0){
       this.a = p0;
    }
    public void a(BaseFeed p0,String p1,int p2,int p3){
       s2.a(this, p0, p1, p2, p3);
    }
    public final void b(BaseFeed p0,String p1,int p2,int p3,View p4){
       b ta = this.a;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p2), ta, null, b.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAY_PHOTO";
          if (ta != null) {
             JSONObject jSONObject = new JSONObject();
             ta.a(jSONObject, p0, true);
             uElementPack.params = jSONObject.toString();
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.g(p0, (p2 + true));
          uContentPack.liveStreamPackage = x.e(p0, 2);
          uContentPack.ksOrderInfoPackage = l0.a(w1.o(p0));
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.type = 1;
          uClickEvent.elementPackage = uElementPack;
          uClickEvent.contentPackage = uContentPack;
          CommonParams uCommonParam = new CommonParams();
          ImmutableMap immutableMap = PatchProxy.applyThreeRefs(p0, uElementPack, uContentPack, null, b.class, "3");
          if (immutableMap != PatchProxyResult.class) {
          }else {
             JsonObject jsonObject = new JsonObject();
             k2 ok2 = u1.j();
             String str = "";
             String str1 = (ok2 != null && ok2.l() != null)? ok2.l(): str;
             jsonObject.G("url_params", new g(str1));
             jsonObject.G("photo_id", new g(p0.getId()));
             str1 = r1.I1(p0);
             if (!TextUtils.x(str1)) {
                jsonObject.G("server_exp_tag", new g(str1));
             }
             ImmutableMap$b uob = ImmutableMap.builder();
             if (ok2 != null) {
                str = ok2.d;
             }
             uob.c("page_name", new g(str));
             uob.c("element_action", new g(uElementPack.action2));
             uob.c("stid", new g("a_"+uContentPack.photoPackage.expTag));
             uob.c("pos", new g(Long.valueOf(uContentPack.photoPackage.index)));
             uob.c("params", jsonObject);
             immutableMap = uob.a();
          }
          uCommonParam.mEntryTag = immutableMap;
          u1.B(new ClickMetaData().setType(true).setElementPackage(uElementPack).setContentPackage(uContentPack).setIsRealTime(false).setFeedLogCtx(r1.O0(p0)).setCommonParams(uCommonParam));
          Kgi.c(new a(uContentPack, uClickEvent, uElementPack));
       }
       if (r1.D3(p0) || r1.D2(p0)) {
          c.a(2, p0);
       }else if(r1.S2(p0)){
          c.a(2, p0);
       }
       return;
    }
}
