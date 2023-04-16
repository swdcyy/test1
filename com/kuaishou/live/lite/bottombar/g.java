package com.kuaishou.live.lite.bottombar.g;
import java.lang.Object;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class g	// class@001ed1
{

    public void g(){
       super();
    }
    public static void a(LiveLiteBottomBarService$a p0,ClientContent$LiveStreamPackage p1,FeedLogCtx p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_LIVE_BOTTOM_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("bty_name", p0.getType().getLogName());
       JsonObject jsonObject1 = p0.b();
       if (jsonObject1 != null) {
          jsonObject.G("extra_info", jsonObject1);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p2).setIsRealTime(false));
       return;
    }
    public static void b(LiveLiteBottomBarService$a p0,ClientContent$LiveStreamPackage p1,FeedLogCtx p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_LIVE_BOTTOM_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("bty_name", p0.getType().getLogName());
       JsonObject jsonObject1 = p0.d();
       if (jsonObject1 != null) {
          jsonObject.G("extra_info", jsonObject1);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setFeedLogCtx(p2).setContentPackage(uContentPack));
       return;
    }
}
