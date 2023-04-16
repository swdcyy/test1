package com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import com.yxcorp.gifshow.models.Gift;
import org.json.JSONObject;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import vg2.a;
import org.json.JSONException;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import java.lang.Throwable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.retrofit.model.KwaiException;
import zb6.a;
import q2b.h$b;

public class LiveFellowRedPacketLogger	// class@000e4d
{

    public void LiveFellowRedPacketLogger(){
       super();
    }
    public static String a(ClientContent$LiveStreamPackage p0,int p1){
       i3 obj;
       LiveFellowRedPacketLogger liveFellowRe = LiveFellowRedPacketLogger.class;
       if (PatchProxy.isSupport(liveFellowRe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, liveFellowRe, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("anchor_user_id", p0.anchorUserId);
       obj.d("live_stream_id", p0.liveStreamId);
       if (p1 > 0) {
          obj.c("amount", Integer.valueOf(p1));
       }
       return obj.e();
    }
    public static ClientContent$BatchMoreInfoPackageV2 b(LiveGiftPackage p0){
       ClientContent$BatchMoreInfoPackageV2 obj = PatchProxy.applyOneRefs(p0, null, LiveFellowRedPacketLogger.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$BatchMoreInfoPackageV2();
       if (p0 != null && !q.f(p0.mGiftInfos)) {
          p0 = p0.mGiftInfos;
          ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[p0.size()];
          for (int i = 0; i < p0.size(); i = i + 1) {
             ClientContent$MoreInfoPackageV2 moreInfoPack1 = new ClientContent$MoreInfoPackageV2();
             LiveGiftPackage$GiftInfo giftInfo = p0.get(i);
             if (giftInfo != null) {
                LiveGiftPackage$GiftInfo mGift = giftInfo.mGift;
                String str = (mGift == null)? "": String.valueOf(mGift.mId);
                moreInfoPack1.id = str;
                moreInfoPack1.vlaue = String.valueOf(giftInfo.mGiftCount);
             }
             moreInfoPack[i] = moreInfoPack1;
          }
          obj.moreInfoPackage = moreInfoPack;
       }
       return obj;
    }
    public static String c(LiveGiftPackage p0,int p1){
       JSONObject obj;
       LiveFellowRedPacketLogger liveFellowRe = LiveFellowRedPacketLogger.class;
       if (PatchProxy.isSupport(liveFellowRe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, liveFellowRe, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          String str = "gift_count";
          String str1 = "";
          String str2 = (p0 == null)? str1: Integer.valueOf(p0.mTotalKsCoin);
          obj.put(str, str2);
          if (p0 != null) {
             str1 = Integer.valueOf(p0.mGiftPackageId);
          }
          obj.put("group_id", str1);
          obj.put("index", p1);
          return e0.toString();
       }catch(org.json.JSONException e0){
       }
    }
    public static void d(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3){
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, LiveFellowRedPacketLogger.class, "18")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_RED_PACKET_RECODE_TAB";
       i3 oi3 = i3.f();
       String str = (!p3)? "SEND": "RECEIVE";
       oi3.d("tab_name", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void e(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3){
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, LiveFellowRedPacketLogger.class, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_RED_PACKET_POPUP";
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(p3));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0,a p1,int p2){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class) && PatchProxy.applyVoidThreeRefs(p0, null, Integer.valueOf(p2), null, LiveFellowRedPacketLogger.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RED_PACK_REMIND_POPUP";
       try{
          jSONObject = new JSONObject();
          jSONObject.put("button_index", p2);
       }catch(org.json.JSONException e8){
          e8.getMessage();
       }
       uElementPack.params = jSONObject.toString();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.redPackage = new ClientContent$RedPackPackage();
       uContentPack.batchMoreInfoPackage = new ClientContent$BatchMoreInfoPackageV2();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void g(ClientContent$LiveStreamPackage p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, null, LiveFellowRedPacketLogger.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RED_PACK_REMIND_POPUP";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.batchMoreInfoPackage = new ClientContent$BatchMoreInfoPackageV2();
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void h(ClientContent$LiveStreamPackage p0,int p1,String p2){
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, LiveFellowRedPacketLogger.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUDIENCE_RED_PACKET_TOAST";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("error_code", String.valueOf(p1));
          jSONObject.put("toast", p2);
          e0.params = jSONObject.toString();
          u1.u0(9, e0, uContentPack);
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public static void i(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveFellowRedPacketLogger.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUDIENCE_RED_PACKET_ICON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       u1.C0("", p0, 9, uElementPack, uContentPack);
       return;
    }
    public static void j(ClientContent$LiveStreamPackage p0,int p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, LiveFellowRedPacketLogger.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_RED_PACKET_RESULT";
       uElementPack.params = LiveFellowRedPacketLogger.a(p0, p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = -1;
       if (p3 instanceof KwaiException) {
          resultPackag.code = p3.mErrorCode;
       }else if(p3 != null){
          resultPackag.message = a.i(p3);
       }
       h$b uob = h$b.e(p2, "SEND_RED_PACKET_RESULT");
       uob.k(uElementPack);
       uob.h(uContentPack);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
}
