package com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lm1.i;
import kotlin.jvm.internal.a;
import yc1.b;
import com.kwai.framework.model.user.QCurrentUser;
import lm1.f;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kwai.framework.model.user.UserInfo;
import lm1.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import ad5.a;
import hc1.a;
import lp3.c;
import lp3.e;
import java.lang.StringBuilder;
import ik1.i0;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.d;
import lm1.c;
import w91.a;
import java.util.Map;
import lm1.g;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import yc1.a;
import k2b.e0;
import ty1.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import java.lang.Throwable;
import android.os.SystemClock;
import yc1.c;
import yc1.d;
import nc1.k;

public final class LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 extends Lambda implements a	// class@000ff5
{
    public final Gift $gift;
    public final LiveAudienceSendGiftInfo $info;
    public final b this$0;

    public void LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1(b p0,LiveAudienceSendGiftInfo p1,Gift p2){
       this.this$0 = p0;
       this.$info = p1;
       this.$gift = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveCommentNoticeBaseInfo mNoticeType;
       LiveCommentNoticeBaseInfo mBizId;
       Object[] objArray2;
       int b;
       String str1;
       e0 page;
       b g;
       Object[] objArray3;
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 uocreateBubb1;
       ClientContent$LiveStreamPackage liveStreamPa;
       Gift mId;
       int i5;
       String str2;
       long l;
       String str3;
       LiveStreamFeed liveStreamFe;
       FeedLogCtx uFeedLogCtx;
       e uoe;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$GiftPackage giftPackage;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       Object obj = this;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, obj, LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1.class, str)) {
          return;
       }
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 this$0 = obj.this$0;
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 $info = obj.$info;
       Objects.requireNonNull(this$0);
       Object[] objArray1 = 4;
       int i = 3;
       int i1 = 2;
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 uocreateBubb = 5;
       int i2 = 0;
       if (!PatchProxy.applyVoidOneRefs($info, this$0, b.class, "5")) {
          Integer giftId = $info.getGiftId();
          if (giftId != null) {
             int i6 = giftId.intValue();
             ClientContent$LiveStreamPackage liveStreamPa1 = this$0.b.a();
             mBizId = $info.mNoticeType;
             mNoticeType = $info.mBizId;
             String str5 = this$0.e($info);
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray4 = new Object[uocreateBubb];
                objArray4[i2] = liveStreamPa1;
                objArray4[1] = Integer.valueOf(mBizId);
                objArray4[i1] = Integer.valueOf(i6);
                objArray4[i] = mNoticeType;
                objArray4[objArray1] = str5;
                if (!PatchProxy.applyVoid(objArray4, objArray, uoa, "15")) {
                }
             }else {
             }
          }
       }
       b.Z(LiveLogTag.LIVE_BUBBLE_NOTICE, "[LiveAudienceSendGiftHandler][createBubbleItem]£ºÇ¿ÌáÐÑËÍÀñµã»÷");
       i oi = obj.this$0.d(obj.$gift);
       int i3 = 1;
       i oi1 = oi;
       obj.this$0.f(oi1, "PRE_SEND_GIFT", "CLIENT_COMMENT_NOTICE_GIFT_CLICK", "[LiveAudienceSendGiftHandler][createBubbleItem] :comment notice gift click ", i3);
       obj.this$0.f(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceSendGiftHandler][createBubbleItem] :comment notice gift click ", i3);
       b d = obj.this$0.d;
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 $gift = obj.$gift;
       String giftToken = obj.$info.getGiftToken();
       int giftCount = obj.$info.getGiftCount();
       LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1 $info1 = obj.$info;
       mNoticeType = $info1.mNoticeType;
       mBizId = $info1.mBizId;
       a.o(mBizId, "info.mBizId");
       Objects.requireNonNull(d);
       int i4 = 6;
       if (PatchProxy.isSupport(b.class)) {
          objArray1 = new Object[i4];
          objArray1[i2] = oi;
          objArray1[1] = $gift;
          objArray1[i1] = giftToken;
          objArray1[i] = Integer.valueOf(giftCount);
          objArray1[4] = Integer.valueOf(mNoticeType);
          objArray1[5] = mBizId;
          if (!PatchProxy.applyVoid(objArray1, d, b.class, str)) {
          label_0112 :
             a.p(oi, "liveGiftSendContext");
             a.p($gift, "gift");
             a.p(mBizId, "bizId");
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (!qCurrentUser.isLogined()) {
                d.b(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceSendGiftHandler][createBubbleItem] :show send gift comment notice gift  ", 0x18705);
             }else {
                User user = d.f.I();
                if (user == null) {
                   user = new User();
                }
                f uof = new f(UserInfo.convertFromQUser(user), $gift, giftToken, false, false, true, 49, 14, false, giftCount, "", null);
                oi.g(objArray1);
                if (PatchProxy.isSupport(b.class)) {
                   objArray2 = new Object[i4];
                   objArray2[i2] = oi;
                   objArray2[1] = $gift;
                   objArray2[i1] = giftToken;
                   objArray2[i] = Integer.valueOf(giftCount);
                   objArray2[4] = Integer.valueOf(14);
                   objArray2[5] = Integer.valueOf(49);
                   c obj1 = PatchProxy.apply(objArray2, d, b.class, "2");
                   if (obj1 != PatchProxyResult.class) {
                      b = obj1.booleanValue();
                      str1 = giftToken;
                      i2 = 0;
                   }else {
                   label_01af :
                      b = $gift.mPrice * giftCount;
                      c obj2 = b.a(0x4c90014d);
                      String str4 = "Singleton.get\(PaymentManager::class.java\)";
                      a.o(obj2, str4);
                      str1 = giftToken;
                      long l1 = obj2.q();
                      long l2 = (long)b;
                      if (l1 - l2 < 0) {
                         Object obj3 = b.a(0x4c90014d);
                         a.o(obj3, str4);
                         d.h.a(a.class).Na((l2 - obj3.q()));
                         d.b(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveCommentNoticeSendGiftProxy][checkDeposit]current:"+l1+",need:"+b, 0x1870a);
                         obj2 = d.h.a(i0.class);
                         a.o(obj2, "serviceManager.getServic¡­esultService::class.java\)");
                         b uob = new b(d.a.a().liveStreamId, GiftMessage.createSelfGiftMessage($gift, giftCount), $gift, giftCount, false, true, 14);
                         c uoc1 = d.h.a(a.class);
                         a.o(uoc1, "serviceManager.getServic¡­:class\n            .java\)");
                         c uoc = new c("", 0, null, uoc1.d6(), null);
                         g og = new g(null, null, 0x1870a, "", null);
                         uoe = null;
                         b.q = new d(oi.b(), l1, uoe, uoc1);
                         obj2.G4(b);
                         b = false;
                      }else {
                         uoe = 0;
                         b = true;
                      }
                   }
                }else {
                   goto label_01af ;
                }
                if (b) {
                   if (PatchProxy.isSupport(b.class)) {
                      objArray2 = new Object[]{$gift,str1,Integer.valueOf(giftCount),Integer.valueOf(mNoticeType),mBizId,oi,Integer.valueOf(14),Integer.valueOf(49)};
                      if (!PatchProxy.applyVoid(objArray2, d, b.class, "3")) {
                      }
                   }else {
                   }
                }
             }
          }
       }else {
          goto label_0112 ;
       }
       obj.this$0.e.a(k.class).D6();
       return;
    }
}
