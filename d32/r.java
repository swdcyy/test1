package d32.r;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import java.lang.Iterable;
import qk.m;
import d32.q;
import ok.h;
import java.util.ArrayList;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d32.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.lang.Boolean;
import java.util.List;
import d32.p;

public class r	// class@002439
{

    public void r(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0,ClientContent$LiveVoicePartyPackageV2 p1,LiveAnnounceMessage p2){
       ClientContent$ContentPackage obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, r.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       if (p1 != null) {
          obj.liveVoicePartyPackage = p1;
       }
       if (!q.f(p2.mLabelList)) {
          ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
          obj.batchMoreInfoPackage = uBatchMoreIn;
          ArrayList uArrayList = new ArrayList();
          m.s(p2.mLabelList).F(q.b).n(uArrayList);
          ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[0];
          uBatchMoreIn.moreInfoPackage = uArrayList.toArray(moreInfoPack);
       }
       ClientContent$MoreInfoPackageV2 moreInfoPack1 = new ClientContent$MoreInfoPackageV2();
       obj.moreInfoPackage = moreInfoPack1;
       moreInfoPack1.name = p2.mActionType;
       return obj;
    }
    public static String b(LiveAnnounceMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0.mBizType)) {
          return p0.mBizType;
       }
       return "INTRO_NOTICE";
    }
    public static void c(String p0,c p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, r.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ABANDON_EDIT_POPUP";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p1.b());
       jsonObject.c0("btn_type", p0);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p2;
       liveStreamPa.liveStreamId = p3;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void d(c p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ABANDON_EDIT_POPUP";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p0.b());
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p1;
       liveStreamPa.liveStreamId = p2;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0,ClientContent$LiveVoicePartyPackageV2 p1,LiveAnnounceMessage p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, r.class, "9")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("biz_type", r.b(p2));
       oi3.d("clk_area", p3);
       oi3.c("notice_id", Long.valueOf(p2.mAnnounceId));
       oi3.d("business_params", p2.mBusinessParams);
       LiveCommentLogger.c(r.a(p0, p1, p2), oi3.toString());
       return;
    }
    public static void f(c p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, r.class, "15")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_CARD";
       i3 oi3 = i3.f();
       oi3.c("name", Integer.valueOf(p1));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p2;
       liveStreamPa.liveStreamId = p3;
       u1.a0(uClickEvent);
       return;
    }
    public static void g(c p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "14")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_CARD";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p0.b());
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p1;
       liveStreamPa.liveStreamId = p2;
       u1.g0(showEvent);
       return;
    }
    public static void h(c p0,boolean p1,String p2,String p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, null, r.class, "18")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_ORDER_ENTRY_BUTTON";
       i3 oi3 = i3.f();
       oi3.a("status", Boolean.valueOf(p1));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p2;
       liveStreamPa.liveStreamId = TextUtils.k(p3);
       u1.a0(uClickEvent);
       return;
    }
    public static void i(c p0,boolean p1,String p2,String p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, null, r.class, "17")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_ORDER_ENTRY_BUTTON";
       i3 oi3 = i3.f();
       oi3.a("status", Boolean.valueOf(p1));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p2;
       liveStreamPa.liveStreamId = TextUtils.k(p3);
       u1.g0(showEvent);
       return;
    }
    public static void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "13")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_CALL_BOARD_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p0;
       liveStreamPa.liveStreamId = p1;
       u1.a0(uClickEvent);
       return;
    }
    public static void k(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "12")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_CALL_BOARD_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p0;
       liveStreamPa.liveStreamId = p1;
       u1.g0(showEvent);
       return;
    }
    public static void l(c p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "4")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_ORDER_CAROUSEL_IMAGE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p0.b());
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p1;
       liveStreamPa.liveStreamId = p2;
       u1.a0(uClickEvent);
       return;
    }
    public static void m(c p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "3")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_ORDER_CAROUSEL_IMAGE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p0.b());
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p1;
       liveStreamPa.liveStreamId = p2;
       u1.g0(showEvent);
       return;
    }
    public static void n(c p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "7")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("open_source", p0.b());
       uElementPack.params = jsonObject.toString();
       uElementPack.action2 = "SELECT_LABEL_PANEL_CARD_FINISH_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
       uContentPack.batchMoreInfoPackage = uBatchMoreIn;
       ArrayList uArrayList = new ArrayList();
       m.s(p1).F(p.b).n(uArrayList);
       ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[0];
       uBatchMoreIn.moreInfoPackage = uArrayList.toArray(moreInfoPack);
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       return;
    }
    public static void o(c p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "6")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("preview_id", TextUtils.k(p1));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.toString();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_PREVIEW_CARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p2;
       u1.a0(uClickEvent);
       return;
    }
    public static void p(c p0,String p1,String p2,long p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, r.class, "16")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("notice_id", Long.valueOf(p3));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.toString();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INTRODUCE_ORDER_UPDATE_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = p1;
       liveStreamPa.liveStreamId = p2;
       u1.a0(uClickEvent);
       return;
    }
    public static void q(c p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, r.class, "5")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("preview_id", TextUtils.k(p1));
       oi3.d("open_source", p0.b());
       uElementPack.params = oi3.toString();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_PREVIEW_CARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p2;
       u1.g0(showEvent);
       return;
    }
}
