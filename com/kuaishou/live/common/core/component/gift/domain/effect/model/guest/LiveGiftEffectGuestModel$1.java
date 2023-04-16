package com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import gm1.d;
import gm1.a;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.e;
import mi1.b;
import mi1.b$a;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$b;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import fi1.a;
import ei1.a;
import java.lang.StringBuilder;
import di1.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import fk1.a;
import qx1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftEffectGuestModel$1 implements Model$a	// class@0011b3
{
    public final LiveGiftEffectGuestModel b;

    public void LiveGiftEffectGuestModel$1(LiveGiftEffectGuestModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       PatchProxyResult this;
       b$a a;
       String this1;
       Iterator iterator1;
       String str4;
       LiveCommonEffectInfo this2;
       PatchProxyResult patchProxyRe;
       LiveGiftEffectGuestModel o;
       boolean b1;
       String str6;
       LiveStreamMessages$SCFeedPush sCFeedPush;
       Object obj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, obj, this, LiveGiftEffectGuestModel$1.class, "1")) {
       }else {
          String str = "source";
          a.p(p0, str);
          if (obj) {
             LiveGiftEffectGuestModel$1 b = this.b;
             Objects.requireNonNull(b);
             this = PatchProxyResult.class;
             if (!PatchProxy.applyVoidOneRefs(obj, b, LiveGiftEffectGuestModel.class, "2")) {
                d uod = b.j.b(obj);
                if (uod != null) {
                   a.o(uod, "mGiftDataBundleConverter\x20\x02ssage\(feedPush\) ?: return\x00");
                   Iterator iterator = uod.a().iterator();
                   while (iterator.hasNext()) {
                      QLiveMessage qLiveMessage = iterator.next();
                      if (qLiveMessage != null) {
                         b.S(b.i, "[handleGiftFeedPush]", "message", qLiveMessage);
                         LiveSendGiftBaseTraceInfo liveSendGift = b.s.Ig(qLiveMessage.mId);
                         LiveGiftEffectGuestModel p = b.p;
                         a = b.a;
                         Objects.requireNonNull(a);
                         BroadcastGiftMessage uBroadcastGi = PatchProxy.applyOneRefs(qLiveMessage, a, b$a.class, "4");
                         String str1 = "giftMessage";
                         LiveGiftEffectGuestModel liveGiftEffe = null;
                         if (uBroadcastGi != this) {
                         }else {
                            a.p(qLiveMessage, str1);
                            if (qLiveMessage instanceof BroadcastGiftMessage) {
                               uBroadcastGi = qLiveMessage.mMergeKey;
                            }else if(qLiveMessage instanceof GiftMessage){
                               uBroadcastGi = qLiveMessage.mMergeKey;
                            }else {
                               uBroadcastGi = liveGiftEffe;
                            }
                         }
                         if (p.a(uBroadcastGi)) {
                            b.P(b.i, "[handleGiftFeedPush][effect hasMocked]");
                            break ;
                         }else {
                            String str2 = "traceInfo";
                            if (qLiveMessage instanceof BroadcastGiftMessage) {
                               QLiveMessage qLiveMessage1 = qLiveMessage;
                               Objects.requireNonNull(liveSendGift);
                               if (PatchProxy.applyOneRefs(qLiveMessage1, liveSendGift, LiveSendGiftBaseTraceInfo.class, "7") != this) {
                               }else {
                                  liveSendGift.w(qLiveMessage1.mGiftId);
                                  liveSendGift.v(String.valueOf(qLiveMessage1.mMagicFaceId));
                                  liveSendGift.p(qLiveMessage1.mCount);
                                  UserInfo user = qLiveMessage1.getUser();
                                  if (user != null) {
                                     liveSendGift.C(user.mId);
                                  }else {
                                     liveSendGift.C("");
                                  }
                               }
                               String str3 = "LiveGiftEffectGuestModel[handleGiftFeedPush][BroadcastGiftMessage]";
                               a.o(liveSendGift, str2);
                               LiveGiftEffectGuestModel liveGiftEffe1 = null;
                               if (PatchProxy.isSupport(LiveGiftEffectGuestModel.class)) {
                                  this1 = str3;
                                  iterator1 = iterator;
                                  str4 = str2;
                                  p1 = this;
                                  this2 = liveGiftEffe;
                                  if (PatchProxy.applyVoidFourRefs(qLiveMessage1, str3, liveSendGift, Boolean.FALSE, b, LiveGiftEffectGuestModel.class, "5")) {
                                  label_023f :
                                     patchProxyRe = p1;
                                  }
                               }else {
                                  p1 = this;
                                  iterator1 = iterator;
                                  this1 = str3;
                                  str4 = str2;
                                  this2 = liveGiftEffe;
                               }
                               a.p(qLiveMessage1, "broadcastGiftMessage");
                               a.p(this1, str);
                               a.p(liveSendGift, str4);
                               int i = b.n.b(qLiveMessage1);
                               if (i != 1) {
                                  o = b.o;
                                  if (o != null) {
                                     qLiveMessage = qLiveMessage1;
                                     o.b(liveSendGift, liveGiftEffe1, b.k, i, this1);
                                  }else {
                                     qLiveMessage = qLiveMessage1;
                                  }
                                  b.P(b.i, "[showBroadcastGiftEffect]: filter illegal gift "+qLiveMessage);
                                  goto label_023f ;
                               }else {
                                  liveGiftEffe = b.k;
                                  a uoa = new a(this2, this2, qLiveMessage1, liveGiftEffe);
                                  o = b.o;
                                  if (o != null) {
                                     o.b(liveSendGift, false, liveGiftEffe, 1, this1);
                                  }
                                  b.d(this1, uoa);
                                  goto label_023f ;
                               }
                            }else {
                               p1 = this;
                               iterator1 = iterator;
                               str4 = str2;
                               if (qLiveMessage instanceof GiftMessage) {
                                  QLiveMessage qLiveMessage2 = qLiveMessage;
                                  liveSendGift.i(qLiveMessage2);
                                  if (!a.d(qLiveMessage)) {
                                     b.P(b.i, "[handleGiftFeedPush][not SlotGiftMessage]");
                                     break ;
                                  }else {
                                     LiveStreamMessages$SCFeedPush needReportGi = obj.needReportGiftFeed;
                                     Object obj1 = PatchProxy.applyOneRefs(qLiveMessage2, b, LiveGiftEffectGuestModel.class, "3");
                                     PatchProxyResult patchProxyRe1 = p1;
                                     if (obj1 != patchProxyRe1) {
                                        b1 = obj1.booleanValue();
                                     }else {
                                        a.p(qLiveMessage2, str1);
                                        b1 = (b.r.g6(5, String.valueOf(qLiveMessage2.mGiftId)))? true: false;
                                     }
                                     if (b1) {
                                        b.P(b.i, "handleGiftFeedPush block");
                                        o = b.o;
                                        if (o != null) {
                                           a.o(liveSendGift, str4);
                                           o.b(liveSendGift, needReportGi, b.k, 617, "LiveGiftEffectGuestModel[handleGiftFeedPush][serverSignalBlockService block]");
                                           break ;
                                        }
                                     }else {
                                        String str5 = "LiveGiftEffectGuestModel[handleGiftFeedPush][GiftMessage]";
                                        a.o(liveSendGift, str4);
                                        if (PatchProxy.isSupport(LiveGiftEffectGuestModel.class)) {
                                           str6 = str5;
                                           patchProxyRe = patchProxyRe1;
                                           sCFeedPush = needReportGi;
                                           if (!PatchProxy.applyVoidFourRefs(qLiveMessage2, str5, liveSendGift, Boolean.valueOf(needReportGi), b, LiveGiftEffectGuestModel.class, "4")) {
                                           }
                                        }else {
                                           str6 = str5;
                                           patchProxyRe = patchProxyRe1;
                                           sCFeedPush = needReportGi;
                                        }
                                     }
                                  }
                               }else {
                                  goto label_023f ;
                               }
                            }
                            iterator = iterator1;
                            this = patchProxyRe;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectGuestModel$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
