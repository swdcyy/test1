package oj1.b;
import om1.a;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import lm1.d;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import lm1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import lm1.f;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import lm1.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import lm1.g;
import com.yxcorp.gifshow.log.model.CommonParams;
import q2b.h$b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import k2b.u1;
import lj1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;

public final class b	// class@003504
{
    public final a a;
    public final i b;

    public void b(a p0,i p1){
       a.p(p0, "sendGiftTraceService");
       a.p(p1, "logProvider");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(boolean p0,boolean p1,String p2,String p3,String p4,String p5,Map p6,LiveGiftSortType p7){
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),p2,p3,p4,p5,p6,p7};
          Object obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          JSONObject jSONObject = new JSONObject().put("is_normal_live", p0).put("is_slide", p1).put("gift_token", p3).put("voice_party_pk_id", p2).put("gift_llsid", p4).put("extra_info", p5);
          if (p7 != null) {
             jSONObject.put("type", p7.getType());
          }
          if (p6 != null) {
             Iterator iterator = p6.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                jSONObject.put(TextUtils.k(uEntry.getKey()), uEntry.getValue());
             }
          }
          str = jSONObject.toString();
       }catch(org.json.JSONException e5){
          b.I(LiveLogTag.GIFT, "LiveGiftLogger createElementPackageParams failed", e5);
          str = "";
       }
       return str;
    }
    public final ClientContent$UserPackage b(String p0){
       ClientContent$UserPackage obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = p0;
       return obj;
    }
    public final void c(int p0,String p1,boolean p2,LiveGiftSortType p3,boolean p4,d p5){
       e uoe1;
       ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn;
       d b;
       ClientContent$GiftPackage giftPackage;
       ClientContent$UserPackage userPackage;
       c c;
       String str2;
       String str3;
       Object obj = this;
       object oobject = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       boolean i = 6;
       int i1 = 2;
       boolean i2 = 4;
       boolean i3 = 5;
       boolean i4 = 3;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i];
          objArray[i6] = Integer.valueOf(p0);
          objArray[i5] = p1;
          objArray[i1] = Boolean.valueOf(p2);
          objArray[i4] = p3;
          objArray[i2] = Boolean.valueOf(p4);
          objArray[i3] = oobject;
          if (PatchProxy.applyVoid(objArray, obj, uob, "2")) {
             return;
          }
       }
       a.p(oobject, "loggerInfo");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = obj.b.mj();
       e uoe = p5.a();
       if (uoe != null) {
          uoe = uoe.a;
          if (uoe != null) {
             uoe1 = p5.a();
             a.m(uoe1);
             int i7 = uoe1.c + i5;
             if (PatchProxy.isSupport(uob)) {
                uBatchMoreIn = PatchProxy.applyTwoRefs(Integer.valueOf(i7), uoe, obj, uob, "4");
                if (uBatchMoreIn != patchProxyRe) {
                label_008b :
                   uContentPack.batchMoreInfoPackage = uBatchMoreIn;
                }
             }
             uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
             ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
             moreInfoPack.index = String.valueOf(i7);
             moreInfoPack.type = uoe;
             ClientContent$MoreInfoPackageV2[] moreInfoPack1 = new ClientContent$MoreInfoPackageV2[i5];
             moreInfoPack1[i6] = moreInfoPack;
             uBatchMoreIn.moreInfoPackage = moreInfoPack1;
             goto label_008b ;
          }
       }
       f uof = p5.b();
       uoe1 = p5.a();
       b = oobject.b;
       Gift gift = (uof != null)? uof.c(): null;
       int i8 = (uof != null)? uof.d(): 1;
       i = (uof != null && uof.f == i5)? true: false;
       i3 = (uof != null && uof.d == i5)? true: false;
       uoe1 = (uoe1 != null)? uoe1.b: 0;
       int i9 = (uof != null)? uof.i(): 0;
       int i10 = (uof != null)? uof.b(): 0;
       i2 = (uof != null && uof.e == i5)? true: false;
       i4 = (uof != null && uof.i == i5)? true: false;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray1 = new Object[9];
          objArray1[i6] = gift;
          objArray1[i5] = Integer.valueOf(i8);
          objArray1[2] = Boolean.valueOf(i);
          objArray1[3] = Boolean.valueOf(i3);
          objArray1[4] = Integer.valueOf(uoe1);
          objArray1[5] = Integer.valueOf(i9);
          objArray1[6] = Integer.valueOf(i10);
          objArray1[7] = Boolean.valueOf(i2);
          objArray1[8] = Boolean.valueOf(i4);
          giftPackage = PatchProxy.apply(objArray1, obj, uob, "6");
          if (giftPackage != patchProxyRe) {
          }else {
          label_013b :
             giftPackage = new ClientContent$GiftPackage();
             if (gift != null) {
                giftPackage.identity = String.valueOf(gift.mId);
                giftPackage.magicFaceId = gift.mMagicFaceId;
                i5 = i8;
                giftPackage.totalCount = i5;
                giftPackage.toAnchor = i;
                giftPackage.isComboSend = i3;
                giftPackage.position = uoe1 + 1;
                giftPackage.sourceType = i9;
                giftPackage.giftEntryType = i10;
                giftPackage.isDrawingGift = i4;
                giftPackage.isPacketGift = i2;
                giftPackage.totalCount = i5;
             }
          }
       }else {
          goto label_013b ;
       }
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveStreamPackage = obj.b.a();
       if (uof != null) {
          UserInfo userInfo = uof.h();
          if (userInfo != null) {
             userInfo = userInfo.mId;
             if (userInfo != null) {
                userPackage = obj.b(userInfo);
             label_0186 :
                uContentPack.userPackage = userPackage;
                uContentPack.liveVoicePartyPackage = obj.b.b4();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                HashMap hashMap = new HashMap();
                if (b != null) {
                   c = b.c;
                   if (c != null) {
                      hashMap.putAll(c);
                   }
                }
                if (b != null) {
                   c = b.d;
                   if (c != null) {
                      hashMap.putAll(c);
                   }
                }
                String str = "";
                if (uof != null) {
                   String str1 = uof.f();
                   if (str1 != null) {
                      str2 = str1;
                   label_01b9 :
                      if (uof != null) {
                         str1 = uof.e();
                         if (str1 != null) {
                            str3 = str1;
                         label_01c4 :
                            c uoc = (b != null)? b.e: null;
                            uElementPack.params = this.a(p4, p2, p1, str2, str3, uoc, hashMap, p3);
                            d d = oobject.d;
                            ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                            g c1 = (d != null)? d.c: 0;
                            resultPackag.code = c1;
                            g d1 = (d != null)? d.d: null;
                            resultPackag.message = d1;
                            long l = (b != null)? b.a(): 0;
                            resultPackag.timeCost = l;
                            CommonParams uCommonParam = new CommonParams();
                            g h$b d2 = (d != null)? d.e: null;
                            uCommonParam.mCsLogCorrelateInfo = d2;
                            d2 = h$b.e(p0, "LIVE_SENT_GIFT");
                            d2.t(3);
                            d2.h(uContentPack);
                            d2.q(resultPackag);
                            d2.k(uElementPack);
                            String str4 = (b != null)? b.b(): null;
                            d2.r(str4);
                            d2.g(uCommonParam);
                            d2.l(obj.b.c0());
                            u1.p0("702408", obj.b.getPage(), d2);
                            return;
                         }
                      }
                      str3 = str;
                      goto label_01c4 ;
                   }
                }
                str2 = str;
                goto label_01b9 ;
             }
          }
       }
       userPackage = null;
       goto label_0186 ;
    }
    public final void d(b p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, b.class, "7")) {
          return;
       }
       a.p(p0, "params");
       a.p(p1, "action");
       a.p(p2, "message");
       LiveSendGiftBaseTraceInfo liveSendGift = p0.l();
       if (liveSendGift != null) {
          liveSendGift.j(p0.d());
          this.a.yk(liveSendGift).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }
       return;
    }
}
