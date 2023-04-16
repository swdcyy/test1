package co2.q1;
import java.lang.Object;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import java.util.Map;
import java.util.Collections;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendGiftDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import q2b.h$b;
import k2b.u1;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.e0;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import ss2.f;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import java.lang.Long;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import z12.x;
import java.lang.Boolean;
import xs2.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import mw2.e;
import d61.h0;

public final class q1	// class@0005a8
{

    public void q1(){
       super();
    }
    public static void A(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "57")) {
          return;
       }
       n.q("VOICE_PARTY_SELECT_PHOTO_002", n.g(p0), null, p1);
       return;
    }
    public static void B(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "64")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x774a;
       uElementPack.name = String.valueOf(p2);
       n.o(0x774a, n.g(p0), uElementPack, p1);
       return;
    }
    public static void C(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "65")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x774a;
       uElementPack.name = String.valueOf(p2);
       n.u(0x774a, n.g(p0), uElementPack, p1);
       return;
    }
    public static void D(Gift p0,int p1,int p2,int p3,ClientContent$LiveStreamPackage p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "35")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_SEND_GIFT_ALL";
       uElementPack.params = a.a.q(Collections.singletonMap("style", Integer.valueOf(p1)));
       ClientTaskDetail$SendGiftDetailPackage sendGiftDeta = new ClientTaskDetail$SendGiftDetailPackage();
       sendGiftDeta.count = p2;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.sendGiftDetailPackage = sendGiftDeta;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          uContentPack.giftPackage = giftPackage;
          giftPackage.identity = String.valueOf(p0.mId);
          giftPackage.type = (int)p0.mGiftType;
       }
       if (p4 != null) {
          uContentPack.liveStreamPackage = p4;
       }
       h$b uob = h$b.e(7, "VOICE_PARTY_SEND_GIFT_ALL");
       uob.k(uElementPack);
       uob.h(uContentPack);
       uob.s(taskDetailPa);
       u1.r0(uob);
       return;
    }
    public static void E(f2 p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, q1.class, "50")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("live_type", p2);
       uElementPack.params = oi3.e();
       n.q("VOICE_PARTY_CLOSE_CLOSE_ROOM", n.g(p0), uElementPack, p1);
       return;
    }
    public static void F(f2 p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, q1.class, "48")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("live_type", p2);
       uElementPack.params = oi3.e();
       n.q("VOICE_PARTY_CLOSE_TRAN_01", n.g(p0), uElementPack, p1);
       return;
    }
    public static void G(f2 p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, q1.class, "49")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("live_type", p2);
       uElementPack.params = oi3.e();
       n.v("VOICE_PARTY_CLOSE_TRAN_01", n.g(p0), uElementPack, p1, null);
       return;
    }
    public static void a(e0 p0,f2 p1,ClientContent$LiveStreamPackage p2,VoicePartyMicSeatData p3,int p4,int p5){
       Object[] objArray;
       q1 oq1 = q1.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       int i6 = 6;
       if (PatchProxy.isSupport(oq1)) {
          objArray = new Object[i6];
          objArray[i5] = p0;
          objArray[i4] = p1;
          objArray[i3] = p2;
          objArray[i2] = null;
          objArray[i1] = Integer.valueOf(p4);
          objArray[i] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, null, oq1, "11")) {
             return;
          }
       }
       if (PatchProxy.isSupport(oq1)) {
          objArray = new Object[i6];
          objArray[i5] = p0;
          objArray[i4] = p1;
          objArray[i3] = p2;
          objArray[i2] = null;
          objArray[i1] = Integer.valueOf(p4);
          objArray[i] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, null, oq1, "10")) {
          label_0083 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("apply_mic_way", Integer.valueOf(p4));
       jsonObject.a0("status", Integer.valueOf(p5));
       uElementPack.params = jsonObject.toString();
       n.s(p0, "APPLY_MIC", n.k(p1, null), uElementPack, p2, null, null);
       goto label_0083 ;
    }
    public static void b(int p0,f2 p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, q1.class, "47")) {
          return;
       }
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(p1);
       liveVoicePar.leaveVoicePartyReason = p0;
       n.x(10, 1865, liveVoicePar, p2);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "20")) {
          return;
       }
       n.q("VOICE_PARTY_MIC_FACE_ENTRANCE_CLICK", n.g(p1), null, p0);
       return;
    }
    public static void d(long p0,ClientContent$LiveStreamPackage p1,f2 p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, null, q1.class, "22")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("emoji_id", Long.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       n.v("VOICE_PARTY_MIC_FACE_SHOW", n.g(p2), uElementPack, p1, null);
       return;
    }
    public static void e(f2 p0,ClientContent$LiveStreamPackage p1,f p2,int p3,Activity p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "16")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_CONTRIBUTION_LIST_ENTRANCE";
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(p3));
       uElementPack.params = oi3.e();
       n.r("VOICE_PARTY_CONTRIBUTION_LIST_ENTRANCE", n.k(p0, p2), uElementPack, p1, x.p(p4));
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, q1.class, "70")) {
          return;
       }
       n.q("OPEN_KTV_AFFIRM", null, null, p0);
       return;
    }
    public static void g(f2 p0,int p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, q1.class, "89")) {
          return;
       }
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(p0);
       liveVoicePar.leaveKtvReason = p1;
       n.x(10, 0x77a2, liveVoicePar, p2);
       return;
    }
    public static void h(f2 p0,ClientContent$LiveStreamPackage p1,boolean p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, q1.class, "90")) {
          return;
       }
       int i = (p2)? 7: 8;
       n.x(i, 0x7890, n.g(p0), p1);
       return;
    }
    public static void i(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "76")) {
          return;
       }
       n.o(0x779f, n.g(p0), null, p1);
       return;
    }
    public static void j(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "75")) {
          return;
       }
       n.u(0x779e, n.g(p0), null, p1);
       return;
    }
    public static void k(f2 p0,ClientContent$LiveStreamPackage p1,boolean p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, q1.class, "84")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       int i = (p2)? 1: 2;
       jsonObject.a0("tab_name", Integer.valueOf(i));
       uElementPack.params = jsonObject.toString();
       n.p(0x77b0, n.g(p0), uElementPack, p1, null, n.e(p0));
       return;
    }
    public static void l(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "77")) {
          return;
       }
       n.u(0x77a0, n.g(p0), null, p1);
       return;
    }
    public static void m(int p0){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, oq1, "97")) {
          return;
       }
       h$b uob = h$b.e(7, "WHY_DID_YOU_CUT_MY_SING");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("reason", Integer.valueOf(p0));
       uElementPack.params = jsonObject.toString();
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
    public static void n(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "78")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       int i = (p0 != null && p0.N())? 1: 0;
       oi3.c("if_song", Integer.valueOf(i));
       oi3.c("position", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       n.o(0x77a1, n.g(p0), uElementPack, p1);
       return;
    }
    public static void o(e0 p0,f2 p1,int p2,ClientContent$LiveStreamPackage p3,m p4){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oq1, "59")) {
             return;
          }
       }
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = n.h(p1);
       liveVoicePar.leaveVoicePartyReason = p2;
       if (p4 != null) {
          p4.b(liveVoicePar);
       }
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = System.currentTimeMillis() - p1.j();
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "EXIT_VOICE_PARTY_ROOM timeCost: "+resultPackag.timeCost);
       int i = 10;
       n$a uoa = new n$a();
       uoa.h(liveVoicePar);
       uoa.f(p3);
       uoa.i(resultPackag);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(i), Integer.valueOf(0x7639), uoa, null, n.class, "18")) {
          h$b uob = h$b.d(i, 0x7639);
          uob.k(uoa.c());
          uob.i(uoa.b());
          uob.h(uoa.a());
          uob.q(uoa.d());
          u1.p0("", p0, uob);
       }
       return;
    }
    public static void p(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "95")) {
          return;
       }
       n.q("VOICE_PARTY_SCREEN_CHOOSE", n.g(p0), null, p1);
       return;
    }
    public static void q(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "96")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       n.v("VOICE_PARTY_SCREEN_CHOOSE", n.g(p0), null, p1, null);
       return;
    }
    public static void r(ClientContent$LiveStreamPackage p0,f2 p1,f p2,long p3){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, q1.class, "6")) {
          return;
       }
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.k(p1, p2);
       liveVoicePar.micSetDuration = p3;
       h$b uob = h$b.e(7, "VOICE_PARTY_SET_MIC_STATUS");
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = liveVoicePar;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.liveVoicePartyTheaterPackage = e.b(p1);
       uob.i(uContentWrap);
       uob.h(uContentPack);
       u1.r0(uob);
       return;
    }
    public static void s(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "55")) {
          return;
       }
       n.q("VOICE_PARTY_SELECT_ALBUM_001", n.g(p0), null, p1);
       return;
    }
    public static void t(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "54")) {
          return;
       }
       n.v("VOICE_PARTY_SELECT_ALBUM_001", n.g(p0), null, p1, null);
       return;
    }
    public static void u(e0 p0,ClientContent$LiveStreamPackage p1,f2 p2,VoicePartyMicSeatData p3,String p4,int p5){
       q1 oq1 = q1.class;
       if (PatchProxy.isSupport(oq1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, oq1, "9")) {
             return;
          }
       }
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(p4);
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.j(p2, p3);
       liveVoicePar.inviteMicChannel = p5;
       n.s(p0, "VOICEPARTY_INVITE_MIC", liveVoicePar, null, p1, userPackage, null);
       return;
    }
    public static void v(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "62")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7749;
       uElementPack.name = String.valueOf(p2);
       n.o(0x7749, n.g(p0), uElementPack, p1);
       return;
    }
    public static void w(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(q1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, q1.class, "63")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7749;
       uElementPack.name = String.valueOf(p2);
       n.u(0x7749, n.g(p0), uElementPack, p1);
       return;
    }
    public static void x(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, q1.class, "44")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x75ed;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void y(ClientContent$LiveStreamPackage p0,f2 p1,f p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, q1.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("keyword", p3);
       uElementPack.params = jsonObject.toString();
       n.q("VOICE_PARTY_SEARCH_BUTTON", n.k(p1, p2), uElementPack, p0);
       return;
    }
    public static void z(f2 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q1.class, "56")) {
          return;
       }
       n.q("VOICE_PARTY_BACKGROUND_ALBUM", n.g(p0), null, p1);
       return;
    }
}
