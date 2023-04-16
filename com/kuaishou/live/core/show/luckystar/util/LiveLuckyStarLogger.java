package com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import com.google.common.base.Optional;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;

public class LiveLuckyStarLogger	// class@000cf7
{

    public void LiveLuckyStarLogger(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveLuckyStarLogger.class, "27")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ACTIVITY_AGAIN_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveLuckyStarLogger.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ACTIVITY_INSTRUCTION_BUTTON";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,String p1,LiveLuckyStarLogger$StatusValue p2,int p3,String p4,Optional p5){
       LiveLuckyStarLogger liveLuckySta = LiveLuckyStarLogger.class;
       if (PatchProxy.isSupport(liveLuckySta)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, liveLuckySta, "16")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_LOTTERY_ACTIVE_PANEL";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("is_participate", Integer.valueOf(p2.getValue()));
       jsonObject.c0("participate_type", p4);
       if (p5.isPresent()) {
          jsonObject.c0("popup_type", p5.get());
       }
       uElementPack.params = jsonObject.toString();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p3);
       uContentWrap.moreInfoPackage = moreInfoPack;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveLuckyStarLogger.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LUCKYSTAR_THINK_ABOUT_AGAIN_SUBCARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveLuckyStarLogger.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LUCKYSTAR_CONTINUE_LAUNCH_SUBCARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0,int p1){
       LiveLuckyStarLogger liveLuckySta = LiveLuckyStarLogger.class;
       if (PatchProxy.isSupport(liveLuckySta) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, liveLuckySta, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LUCKYSTAR_IMPORTANT_REMIND_CARD";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = String.valueOf(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void g(ClientContent$LiveStreamPackage p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveLuckyStarLogger.class, "24")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_DRAWING_POPUP";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = TextUtils.k(p1);
       moreInfoPack.type = String.valueOf(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.H("", 1, uElementPack, uContentPack, new ClientContentWrapper$ContentWrapper());
       return;
    }
    public static void h(ClientContent$LiveStreamPackage p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveLuckyStarLogger.class, "23")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_DRAWING_POPUP";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = TextUtils.k(p1);
       moreInfoPack.type = String.valueOf(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void i(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveLuckyStarLogger.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_HISTORY_ACTIVE_ITEM";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void j(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveLuckyStarLogger.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_LIST";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void k(ClientContent$LiveStreamPackage p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, LiveLuckyStarLogger.class, "18")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_PARTICIPATE_ACTIVE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("participate_type", p3);
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       uContentWrap.moreInfoPackage = moreInfoPack;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void l(ClientContent$LiveStreamPackage p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, LiveLuckyStarLogger.class, "17")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_PARTICIPATE_ACTIVE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("participate_type", p3);
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       uContentWrap.moreInfoPackage = moreInfoPack;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void m(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveLuckyStarLogger.class, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_LOTTERY_RESULT_PANEL_AVATAR";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(p2);
       uContentPack.userPackage = userPackage;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void n(ClientContent$LiveStreamPackage p0,String p1,int p2,Integer p3,String p4){
       LiveLuckyStarLogger liveLuckySta = LiveLuckyStarLogger.class;
       if (PatchProxy.isSupport(liveLuckySta)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, liveLuckySta, "20")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_LOTTERY_RESULT_PANEL";
       JsonObject jsonObject = new JsonObject();
       if (p3.intValue()) {
          jsonObject.a0("win_type", p3);
       }
       jsonObject.c0("btn_type", p4);
       uElementPack.params = jsonObject.toString();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.G("", 9, uElementPack, uContentPack);
       return;
    }
    public static void o(ClientContent$LiveStreamPackage p0,String p1,int p2,Integer p3){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, LiveLuckyStarLogger.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_LOTTERY_RESULT_PANEL";
       JsonObject jsonObject = new JsonObject();
       if (p3.intValue()) {
          jsonObject.a0("win_type", p3);
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void p(ClientContent$LiveStreamPackage p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(LiveLuckyStarLogger.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, LiveLuckyStarLogger.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_INITIATE_ACTIVE_BUTTON";
       JsonObject jsonObject = new JsonObject();
       String str = "TRUE";
       String str1 = (p2)? str: "FALSE";
       jsonObject.c0("if_picture", str1);
       if (!p3) {
          str = "FALSE";
       }
       jsonObject.c0("if_real", str);
       uElementPack.params = jsonObject.toString();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = String.valueOf(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.moreInfoPackage = moreInfoPack;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void q(ClientContent$LiveStreamPackage p0,KwaiException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveLuckyStarLogger.class, "9")) {
          return;
       }
       h$b uob = h$b.e(7, "LIVE_LUCKYSTAR_INITIATE_ACTIVE");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uob.h(uContentPack);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = p1.mErrorCode;
       resultPackag.message = p1.mErrorMessage;
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static void r(ClientContent$LiveStreamPackage p0,String p1,int p2,boolean p3,boolean p4){
       LiveLuckyStarLogger liveLuckySta = LiveLuckyStarLogger.class;
       if (PatchProxy.isSupport(liveLuckySta)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, liveLuckySta, "8")) {
             return;
          }
       }
       h$b uob = h$b.e(7, "LIVE_LUCKYSTAR_INITIATE_ACTIVE");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       String str = "TRUE";
       String str1 = (p3)? str: "FALSE";
       jsonObject.c0("if_picture", str1);
       if (!p4) {
          str = "FALSE";
       }
       jsonObject.c0("if_real", str);
       uElementPack.params = jsonObject.toString();
       uob.k(uElementPack);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       uContentPack.moreInfoPackage = moreInfoPack;
       uob.h(uContentPack);
       u1.r0(uob);
       return;
    }
}
