package com.kuaishou.live.lite.tempplay.d;
import java.lang.Object;
import qd3.r;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import qd3.r$a;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public class d	// class@000b8b
{

    public void d(){
       super();
    }
    public static String a(r p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       if (p0 == null || p0.a() == null) {
          return "";
       }
       obj.a("if_effect", Boolean.TRUE);
       return obj.toString();
    }
    public static void b(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, null, d.class, "3")) {
          return;
       }
       b.c0(LiveLiteLogTag.LIVE_LITE_TEMP_PLAY, "logProfitItemEffectShowEvent", "bizType", p1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_PROFIT_INFO_EFFECT";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("biz_type", p1);
       uElementPack.params = jsonObject.toString();
       u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(new ClientContent$ContentPackage()));
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "5")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIVE_LITE_TEMP_PLAY, "logTempPlayItemClickEvent", "btnType", p1, "bizType", p2);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LITE_TOP_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("btn_type", p1);
       jsonObject.c0("biz_type", p2);
       if (p3 != null) {
          jsonObject.c0("extra_info", p3);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "2")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIVE_LITE_TEMP_PLAY, "logTempPlayItemShowEvent", "btnType", p1, "bizType", p2);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LITE_TOP_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("btn_type", p1);
       jsonObject.c0("biz_type", p2);
       if (p3 != null) {
          jsonObject.c0("extra_info", p3);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
}
