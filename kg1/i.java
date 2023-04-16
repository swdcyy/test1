package kg1.i;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public class i	// class@002d34
{

    public void i(){
       super();
    }
    public static ClientContent$IMGroupSessionPackage a(String p0){
       ClientContent$IMGroupSessionPackage obj = PatchProxy.applyOneRefs(p0, null, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$IMGroupSessionPackage();
       obj.ownerId = p0;
       return obj;
    }
    public static void b(e0 p0,ClientContent$LiveStreamPackage p1,int p2,long p3,String p4,String p5,boolean p6,JsonElement p7,FeedLogCtx p8){
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       object oobject2 = p4;
       object oobject3 = p7;
       object oobject4 = p8;
       i oi = i.class;
       ClientEvent$ResultPackage resultPackag = null;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = oobject2;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject3;
          objArray[8] = oobject4;
          if (PatchProxy.applyVoid(objArray, resultPackag, oi, "4")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject1;
       uContentPack.imGroupSessionPackage = i.a(p5);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("source", oobject2);
       oi3.a("is_slide", Boolean.valueOf(p6));
       oi3.a("is_normal_live", Boolean.TRUE);
       oi3.d("red_pack_fans_group_source", "GIFT_PANEL");
       uElementPack.params = oi3.e();
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mCsLogCorrelateInfo = oobject3;
       if (i == 7 || i == 8) {
          resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = p3;
       }
       uElementPack.action2 = "JOIN_FANS_GROUP";
       h$b uob = h$b.e(p2, "JOIN_FANS_GROUP");
       uob.k(uElementPack);
       uob.g(uCommonParam);
       uob.q(resultPackag);
       uob.h(uContentPack);
       uob.l(oobject4);
       u1.p0("2627284", p0, uob);
       return;
    }
    public static void c(e0 p0,boolean p1,int p2,String p3,ClientContent$LiveStreamPackage p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oi, "2")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_ICON_CLICK";
       i3 oi3 = i3.f();
       String str = (p1)? "LEFT_TOP": "RIGHT_BOTTOM";
       oi3.d("icon_position", str);
       oi3.c("if_fans", Integer.valueOf(p2));
       oi3.d("name", p3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p4;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void d(e0 p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_ICON_CLICK";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.imGroupSessionPackage = i.a(p2);
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void e(e0 p0,ClientContent$LiveStreamPackage p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, i.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_GUIDE_FOLLOW_POPUP";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       i3 oi3 = i3.f();
       String str = (p2)? "FOLLOW": "CANCEL";
       oi3.d("btn_type", str);
       uElementPack.params = oi3.e();
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_JOIN_TOO_BUTTON_CLICK";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void g(String p0,String p1,ClientContent$LiveStreamPackage p2,boolean p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, i.class, "15")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_SHARE_PANEL";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p0);
       oi3.d("source", p1);
       p0 = (p3)? "1": "0";
       oi3.d("type", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p2;
       u1.a0(uClickEvent);
       return;
    }
    public static void h(e0 p0,boolean p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, i.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_ICON_SHOW";
       i3 oi3 = i3.f();
       String str = (p1)? "LEFT_TOP": "RIGHT_BOTTOM";
       oi3.d("icon_position", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.C0("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void i(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_PANEL_CARD";
       i3 oi3 = i3.f();
       oi3.d("source", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.imGroupSessionPackage = i.a(p1);
       u1.v0(9, uElementPack, uContentPack, null);
       return;
    }
    public static void j(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_JOIN_TOO_BUTTON_SHOW";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.v0(6, uElementPack, uContentPack, null);
       return;
    }
}
