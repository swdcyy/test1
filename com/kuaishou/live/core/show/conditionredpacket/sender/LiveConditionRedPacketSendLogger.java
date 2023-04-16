package com.kuaishou.live.core.show.conditionredpacket.sender.LiveConditionRedPacketSendLogger;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.util.List;
import java.lang.Throwable;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.conditionredpacket.sender.a;
import ok.h;
import java.util.ArrayList;
import java.util.Collection;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import zb6.a;
import com.yxcorp.retrofit.model.KwaiException;
import k2b.u1;

public class LiveConditionRedPacketSendLogger	// class@000ac4
{

    public void LiveConditionRedPacketSendLogger(){
       super();
    }
    public static void a(e0 p0,int p1,ClientContent$LiveStreamPackage p2,int p3,String p4,int p5,int p6,int p7,String p8,long p9,int p10,List p11,Throwable p12,int p13,JsonElement p14,String p15,FeedLogCtx p16){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p12;
       object oobject4 = p14;
       object oobject5 = p15;
       object oobject6 = p16;
       LiveConditionRedPacketSendLogger liveConditio = LiveConditionRedPacketSendLogger.class;
       int i = 1;
       if (PatchProxy.isSupport(liveConditio)) {
          Object[] objArray = new Object[17];
          objArray[0] = oobject;
          objArray[i] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = oobject2;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          objArray[9] = Long.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = p11;
          objArray[12] = oobject3;
          objArray[13] = Integer.valueOf(p13);
          objArray[14] = oobject4;
          objArray[15] = oobject5;
          objArray[16] = oobject6;
          if (PatchProxy.applyVoid(objArray, null, liveConditio, "5")) {
             return;
          }
       }
       ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
       redPackPacka.redPackType = p3;
       redPackPacka.redPackTime = (long)p5;
       redPackPacka.redPackCount = p6;
       redPackPacka.redPackId = TextUtils.k(p8);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = oobject5;
       i3 oi3 = i3.f();
       oi3.d("source", oobject2);
       oi3.c("red_count", Integer.valueOf(p7));
       oi3.c("index", Integer.valueOf((p1 + 1)));
       oi3.c("group_id", Integer.valueOf(p13));
       uElementPack.params = oi3.e();
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mCsLogCorrelateInfo = oobject4;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject1;
       uContentPack.redPackage = redPackPacka;
       if (p11 != null) {
          ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
          ArrayList uArrayList = new ArrayList();
          m.s(p11).F(a.b).n(uArrayList);
          ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[0];
          uBatchMoreIn.moreInfoPackage = uArrayList.toArray(moreInfoPack);
          uContentPack.batchMoreInfoPackage = uBatchMoreIn;
       }
       h$b uob = h$b.e(p10, oobject5);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = -1;
       if (oobject3 != null) {
          resultPackag.message = a.i(p12);
       }
       if (oobject3 instanceof KwaiException) {
          resultPackag.code = oobject3.mErrorCode;
       }
       resultPackag.timeCost = p9;
       uob.h(uContentPack);
       uob.q(resultPackag);
       uob.g(uCommonParam);
       uob.k(uElementPack);
       if (oobject5.equals("DRAW_PRIZE_ROLL_SEND_AUDIENCE")) {
          uob.l(oobject6);
       }
       u1.p0("", p0, uob);
       return;
    }
}
