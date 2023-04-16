package com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.multiline.model.LiveLineExtraInfo$ExtraInfoUserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import oq1.b;
import oq1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger$PanelSource;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.lang.Boolean;

public class LiveMultiLineLogger	// class@0014ea
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       LiveMultiLineLogger.a = hashMap;
       hashMap.put(Integer.valueOf(3), "FRIEND");
       hashMap.put(Integer.valueOf(4), "RECO");
       hashMap.put(Integer.valueOf(5), "SEARCH");
    }
    public void LiveMultiLineLogger(){
       super();
    }
    public static void A(){
       if (PatchProxy.applyVoid(null, null, LiveMultiLineLogger.class, "2")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_ONLINE_CARD";
       i3 oi3 = i3.f();
       oi3.d("btn_type", "SEARCH");
       uElementPack.params = oi3.e();
       u1.a0(uClickEvent);
       return;
    }
    public static String a(a$a p0,Map p1){
       i3 obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveMultiLineLogger.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("biz_session_id", p0.a);
       obj.d("biz_type", p0.b);
       obj.d("chat_id", p0.c);
       obj.d("session_id", p0.d);
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             obj.d(key, uEntry.getValue());
          }
       }
       return obj.e();
    }
    public static List b(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogger.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveLineExtraInfo$ExtraInfoUserInfo uExtraInfoUs = iterator.next();
          if (!(QCurrentUser.me().getId()).equals(uExtraInfoUs.mUserId)) {
             obj.add(uExtraInfoUs);
          }
       }
       return obj;
    }
    public static ClientContent$BatchUserPackage c(List p0){
       ClientContent$BatchUserPackage obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogger.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$BatchUserPackage();
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[p0.size()];
       int i = 0;
       while (i < p0.size()) {
          a uoa = p0.get(i);
          if (uoa != null) {
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = String.valueOf(uoa.h.userId);
             userPackageA[i] = userPackage;
          }
          i = i + 1;
       }
       obj.userPackage = userPackageA;
       return obj;
    }
    public static ClientContent$BatchUserPackage d(List p0){
       ClientContent$BatchUserPackage obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogger.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$BatchUserPackage();
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[p0.size()];
       int i = 0;
       while (i < p0.size()) {
          LiveLineExtraInfo$ExtraInfoUserInfo uExtraInfoUs = p0.get(i);
          if (uExtraInfoUs != null) {
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = uExtraInfoUs.mUserId;
             userPackageA[i] = userPackage;
          }
          i = i + 1;
       }
       obj.userPackage = userPackageA;
       return obj;
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.n(p0, "FRIEND_INVITE")) {
          return "PK_FRIEND_PANEL";
       }
       if (TextUtils.n(p0, "RECOMMEND_INVITE")) {
          return "PK_FRIEND_RECO_PANEL";
       }
       return "";
    }
    public static void f(e0 p0,ClientContent$LiveStreamPackage p1,String p2,String p3,b p4){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       ClientContent$LivePkPackage obj = null;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, liveMultiLin, "25")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_NICK_AVATAT_BUTTON";
       uElementPack.params = c.a(p4, obj);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       obj = new ClientContent$LivePkPackage();
       uContentPack.livePkPackage = obj;
       obj.opponentUserId = p2;
       obj.pkId = p3;
       uContentPack.liveStreamPackage = p1;
       if (!q.f(p4.b())) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p4.b());
       }
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void g(e0 p0,ClientContent$LiveStreamPackage p1,int p2,String p3,List p4,String p5,String p6,String p7,int p8){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "21")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_ONLINE_END_ADVANCE_SUBCARD";
       i3 oi3 = i3.f();
       oi3.c("btn_type", Integer.valueOf(p2));
       oi3.d("status", p3);
       oi3.d("biz_session_id", p7);
       oi3.c("biz_type", Integer.valueOf(2));
       oi3.d("chat_id", p5);
       oi3.d("session_id", p6);
       oi3.c("chat_mode", Integer.valueOf(p8));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.moreInfoPackage = new ClientContent$MoreInfoPackageV2();
       i3 oi31 = i3.f();
       oi31.d("id", p5);
       p5.params = oi31.e();
       uContentPack.liveStreamPackage = p1;
       if (!q.f(p4)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p4);
       }
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void h(e0 p0,ClientContent$LiveStreamPackage p1,String p2,List p3,String p4,String p5,String p6,int p7){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "20")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_ONLINE_END_ADVANCE_CARD";
       i3 oi3 = i3.f();
       oi3.d("status", p2);
       oi3.d("biz_session_id", p6);
       oi3.c("biz_type", Integer.valueOf(2));
       oi3.d("chat_id", p4);
       oi3.d("session_id", p5);
       oi3.c("chat_mode", Integer.valueOf(p7));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.moreInfoPackage = new ClientContent$MoreInfoPackageV2();
       i3 oi31 = i3.f();
       oi31.d("id", p4);
       p4.params = oi31.e();
       uContentPack.liveStreamPackage = p1;
       if (!q.f(p3)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p3);
       }
       u1.C0("", p0, 9, uElementPack, uContentPack);
       return;
    }
    public static void i(ClientContent$LiveStreamPackage p0,Map p1,int p2,int p3,int p4){
       String str;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport(LiveMultiLineLogger.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, LiveMultiLineLogger.class, "39")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LINE_CHAT_INVITE";
       if (PatchProxy.isSupport(LiveMultiLineLogger.class)) {
          str = PatchProxy.applyFourRefs(p1, Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), null, LiveMultiLineLogger.class, "40");
          if (str != PatchProxyResult.class) {
          label_00dd :
             uElementPack.params = str;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = oobject;
             h$b uob = h$b.e(8, "LIVE_LINE_CHAT_INVITE");
             uob.k(uElementPack);
             uob.h(uContentPack);
             u1.r0(uob);
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("invite_type", LiveMultiLineLogger.a.get(Integer.valueOf(p2)));
       jsonObject.a0("fail_reason", Integer.valueOf(p3));
       if (p3 == 6 && p4 != -1) {
          jsonObject.a0("error_code", Integer.valueOf(p4));
       }
       if (!p1.isEmpty() && (!PatchProxy.applyVoidTwoRefs(jsonObject, p1, null, LiveMultiLineLogger.class, "41") && !q.h(p1))) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String str1 = uEntry.getValue().toString();
             if (!TextUtils.x(key) && !TextUtils.x(str1)) {
                jsonObject.c0(key, str1);
             }
          }
       }
       str = jsonObject.toString();
       goto label_00dd ;
    }
    public static void j(e0 p0,ClientContent$LiveStreamPackage p1,String p2,String p3,String p4,List p5){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "24")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_ONLINE_FUNCTION_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       oi3 = i3.f();
       oi3.d("opponent_user_id", p3);
       oi3.d("id", p4);
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.params = oi3.toString();
       uContentPack.liveStreamPackage = p1;
       if (!q.f(p5)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p5);
       }
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void k(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveMultiLineLogger.class, "35")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "MORE_ONLINE_NOTICE_TOAST";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.g0(showEvent);
       return;
    }
    public static void l(ClientContent$LiveStreamPackage p0,a$a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveMultiLineLogger.class, "34")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = LiveMultiLineLogger.a(p1, ImmutableMap.of("btn_type", p2));
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "MORE_ONLINE_END_POPUP";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
    public static void m(ClientContent$LiveStreamPackage p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveMultiLineLogger.class, "33")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "MORE_ONLINE_END_POPUP";
       uElementPack.params = LiveMultiLineLogger.a(p1, null);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.g0(showEvent);
       return;
    }
    public static void n(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3,int p4){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "4")) {
             return;
          }
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_ONLINE_CARD_INVITE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.type = p2;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       userPackage.identity = p1;
       userPackage.index = p4;
       uContentPack.liveStreamPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
    public static void o(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3,int p4){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "3")) {
             return;
          }
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_ONLINE_CARD_INVITE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.type = p2;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       userPackage.identity = p1;
       userPackage.index = p4;
       uContentPack.liveStreamPackage = p0;
       u1.g0(showEvent);
       return;
    }
    public static void p(){
       if (PatchProxy.applyVoid(null, null, LiveMultiLineLogger.class, "1")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_ONLINE_CARD";
       u1.g0(showEvent);
       return;
    }
    public static void q(ClientContent$LiveStreamPackage p0,List p1,String p2,LiveMultiLineLogger$PanelSource p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, LiveMultiLineLogger.class, "13")) {
          return;
       }
       String str = "ONLINE_ING_CARD";
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{str,p0,p1,p2,p3};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "11")) {
          label_0076 :
             return;
          }
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       oi3.d("btn_type", p2);
       if (p3 != null) {
          oi3.d("panel_source", p3.toString());
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!q.f(p1)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p1);
       }
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       goto label_0076 ;
    }
    public static void r(ClientContent$LiveStreamPackage p0,List p1,int p2){
       if (PatchProxy.isSupport(LiveMultiLineLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveMultiLineLogger.class, "9")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "ONLINE_ING_SWTICH_BIZ_ITEM";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!q.f(p1)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p1);
       }
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       return;
    }
    public static void s(ClientContent$LiveStreamPackage p0,List p1,int p2){
       if (PatchProxy.isSupport(LiveMultiLineLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveMultiLineLogger.class, "10")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "ONLINE_ING_SWTICH_BIZ_ITEM";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!q.f(p1)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p1);
       }
       showEvent.contentPackage = uContentPack;
       u1.g0(showEvent);
       return;
    }
    public static void t(ClientContent$LiveStreamPackage p0,List p1,LiveMultiLineLogger$PanelSource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveMultiLineLogger.class, "6")) {
          return;
       }
       String str = "ONLINE_ING_CARD";
       if (!PatchProxy.applyVoidFourRefs(str, p0, p1, p2, null, LiveMultiLineLogger.class, "8")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          showEvent.elementPackage = uElementPack;
          uElementPack.action2 = str;
          i3 oi3 = i3.f();
          oi3.d("panel_source", p2.toString());
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = p0;
          if (!q.f(p1)) {
             uContentPack.batchUserPackage = LiveMultiLineLogger.c(p1);
          }
          showEvent.contentPackage = uContentPack;
          u1.g0(showEvent);
       }
       return;
    }
    public static void u(ClientContent$LiveStreamPackage p0,String p1,List p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, LiveMultiLineLogger.class, "19")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_JOIN_ONLINE_POPUP";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       userPackage.identity = p1;
       if (!q.f(p2)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p2);
       }
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       return;
    }
    public static void v(ClientContent$LiveStreamPackage p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveMultiLineLogger.class, "18")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "INVITE_JOIN_ONLINE_POPUP";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       userPackage.identity = p1;
       if (!q.f(p2)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.c(p2);
       }
       showEvent.contentPackage = uContentPack;
       u1.g0(showEvent);
       return;
    }
    public static void w(ClientContent$LiveStreamPackage p0,List p1,String p2,String p3,int p4,int p5){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "16")) {
             return;
          }
       }
       ClickMetaData uClickMetaDa = new ClickMetaData();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ONLINE_INVITED_POPUP";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p3);
       oi3.c("source", Integer.valueOf(p4));
       oi3.c("chat_type", Integer.valueOf(p5));
       oi3.d("notice_text", p2);
       uElementPack.params = oi3.e();
       uClickMetaDa.setElementPackage(uElementPack);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!q.f(p1)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.d(LiveMultiLineLogger.b(p1));
       }
       uClickMetaDa.setContentPackage(uContentPack);
       u1.B(uClickMetaDa);
       return;
    }
    public static void x(ClientContent$LiveStreamPackage p0,List p1,String p2,int p3,int p4){
       LiveMultiLineLogger liveMultiLin = LiveMultiLineLogger.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, liveMultiLin, "15")) {
             return;
          }
       }
       ShowMetaData showMetaData = new ShowMetaData();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ONLINE_INVITED_POPUP";
       i3 oi3 = i3.f();
       oi3.c("source", Integer.valueOf(p3));
       oi3.c("chat_type", Integer.valueOf(p4));
       oi3.d("notice_text", p2);
       uElementPack.params = oi3.e();
       showMetaData.setElementPackage(uElementPack);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!q.f(p1)) {
          uContentPack.batchUserPackage = LiveMultiLineLogger.d(LiveMultiLineLogger.b(p1));
       }
       showMetaData.setContentPackage(uContentPack);
       u1.B0(showMetaData);
       return;
    }
    public static void y(boolean p0,e0 p1,ClientContent$LiveStreamPackage p2,a$a p3){
       if (PatchProxy.isSupport(LiveMultiLineLogger.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, null, LiveMultiLineLogger.class, "36")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_EMPTY_GUIDE_CARD";
       String str = (p0)? "INVITE": "EMPTY";
       uElementPack.params = LiveMultiLineLogger.a(p3, ImmutableMap.of("btn_type", str));
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.L("", p1, 1, uElementPack, uContentPack);
       return;
    }
    public static void z(e0 p0,ClientContent$LiveStreamPackage p1,a$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveMultiLineLogger.class, "37")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_EMPTY_GUIDE_CARD";
       uElementPack.params = LiveMultiLineLogger.a(p2, null);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.C0("", p0, 9, uElementPack, uContentPack);
       return;
    }
}
