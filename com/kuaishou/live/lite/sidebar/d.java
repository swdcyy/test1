package com.kuaishou.live.lite.sidebar.d;
import java.util.Random;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.util.Arrays;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class d	// class@000b49
{
    public static final boolean a;

    static {
       boolean b = true;
       if (new Random().nextInt(100) < b) {
       }else {
          b = false;
       }
       d.a = b;
    }
    public void d(){
       super();
    }
    public static void a(JsonObject p0,String p1,ClientContent$LiveStreamPackage p2,FeedLogCtx p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_LIVE_SIDE_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("bty_name", p1);
       if (p0 != null) {
          jsonObject.G("extra_info", p0);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p3).setIsRealTime(false));
       return;
    }
    public static void b(int p0,String p1,CDNUrl[] p2,String p3,String p4,long p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uod, "6")) {
             return;
          }
       }
       if (!d.a) {
          return;
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("biz", Integer.valueOf(p0));
          if (!p1.equals("START")) {
             jsonObject.a0("cost", Long.valueOf(p5));
          }
          jsonObject.c0("status", p1);
          jsonObject.c0("urls", Arrays.toString(p2));
          jsonObject.c0("sessionId", p3);
          if (!TextUtils.x(p4)) {
             jsonObject.c0("errorMsg", p4);
          }
          u1.R("LITE_SIDE_BAR_ICON_DOWNLOAD", jsonObject.toString(), 3);
          return;
       }
    }
    public static void c(String p0,JsonObject p1,ClientContent$LiveStreamPackage p2,FeedLogCtx p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LITE_LIVE_SIDE_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("bty_name", p0);
       if (p1 != null) {
          jsonObject.G("extra_info", p1);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setFeedLogCtx(p3).setContentPackage(uContentPack));
       return;
    }
}
