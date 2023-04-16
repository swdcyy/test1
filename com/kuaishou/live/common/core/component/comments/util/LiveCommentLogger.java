package com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger$LongClickMessageType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class LiveCommentLogger	// class@0010d0
{

    public void LiveCommentLogger(){
       super();
    }
    public static void a(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_FEED_FOLLOW_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void b(String p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_COMMON_DOUBLE_CLICK";
       i3 oi3 = i3.f();
       oi3.d("trigger_effect", p0);
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void c(ClientContent$ContentPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "11")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_COMMENT_INTRODUCE_MESSAGE";
       uElementPack.params = p1;
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.contentPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
    public static void d(ClientContent$ContentPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "10")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_COMMENT_INTRODUCE_MESSAGE";
       uElementPack.params = p1;
       showEvent.elementPackage = uElementPack;
       showEvent.contentPackage = p0;
       u1.g0(showEvent);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0,LiveCommentLogger$LongClickMessageType p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, LiveCommentLogger.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PRESS_LIVE_COMMENT";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p1.name();
       moreInfoPack.vlaue = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       if (!TextUtils.x(p3)) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = h0.a(p3);
          uContentPack.userPackage = userPackage;
       }
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(String p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LONG_PRESS_NICKNAME";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("is_comment", p0);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void g(String p0,int p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(LiveCommentLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, LiveCommentLogger.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LONG_PRESS_NICKNAME_DIALOG_SUBCARD";
       if (p2.isAnchor != null) {
          uElementPack.action2 = "LONG_PRESS_NICKNAME_DIALOG_CARD";
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("btn_type", p0);
       jsonObject.a0("comment_type", Integer.valueOf(p1));
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public static void h(ClientContent$LiveStreamPackage p0,QLiveMessage p1,boolean p2){
       if (PatchProxy.isSupport(LiveCommentLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, LiveCommentLogger.class, "12")) {
          return;
       }
       if (p1 instanceof RichTextMessageOld) {
          RichTextMessageOld type = p1.type;
          if (type != 38 && type != 39) {
             return;
          }else {
             ShowMetaData showMetaData = new ShowMetaData();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = p0;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FEED_COMMENT_AREA_SYSTEM_MESSAGE_BUBBLE";
             i3 oi3 = i3.f();
             String str = (p2)? "RECEIVE_LIMIT": "PAY_LIMIT";
             oi3.d("biz_type", str);
             uElementPack.params = oi3.e();
             showMetaData.setElementPackage(uElementPack);
             showMetaData.setContentPackage(uContentPack);
             u1.B0(showMetaData);
          }
       }
       return;
    }
    public static void i(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveCommentLogger.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_RICH_TEXT_BUTTON_CARD";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("trace_message", TextUtils.k(p1));
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
