package com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import gm1.d;
import gm1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.a;
import ok.o;
import bk1.b;
import bk1.a;
import ok.h;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.StringBuilder;
import om1.e;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public class LiveGiftSlotModel$2 implements Model$a	// class@001273
{
    public final LiveGiftSlotModel b;

    public void LiveGiftSlotModel$2(LiveGiftSlotModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotModel$2.class, "1")) {
       }else if(p2 != null){
          LiveGiftSlotModel$2 tb = this.b;
          Objects.requireNonNull(tb);
          p1 = LiveGiftSlotModel.class;
          if (!PatchProxy.applyVoidOneRefs(p2, tb, p1, "5")) {
             p2 = tb.i.b(p2);
             if (p2 == null) {
                b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotModel][handleFeedPushGiftSlot]:liveFeedBundle error ");
             }else {
                p2 = p2.a();
                if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(p2, Boolean.FALSE, tb, p1, "6")) {
                   if (q.f(p2)) {
                      b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotModel][handleGiftMessage]:liveStreamFeeds is null");
                   }else {
                      ArrayList uArrayList = new ArrayList();
                      m.s(p2).p(a.b).p(new b(tb)).F(new a(tb)).n(uArrayList);
                      if (!q.f(uArrayList) && (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(uArrayList, Boolean.FALSE, tb, p1, "4"))) {
                         p2 = new ArrayList();
                         Iterator iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            int i = iterator.next();
                            if (a.c(i, true)) {
                               QLiveMessage mLiveAudienc = i.mLiveAudienceState;
                               if (mLiveAudienc != null) {
                                  LiveAudienceState livePrivileg = mLiveAudienc.livePrivilegeState;
                                  if (livePrivileg != null) {
                                     tb.n = e0.i(livePrivileg.avatarFrame);
                                     tb.o = e0.i(i.mLiveAudienceState.livePrivilegeState.avatarFrameAnimation);
                                  }
                               }
                               CDNUrl[] uCDNUrlArray = null;
                               tb.n = uCDNUrlArray;
                               tb.o = uCDNUrlArray;
                            }
                            if (PatchProxy.isSupport(p1)) {
                               Gift obj = PatchProxy.applyTwoRefs(i, Boolean.FALSE, tb, p1, "8");
                               if (obj != PatchProxyResult.class) {
                                  b = obj.booleanValue();
                               }else {
                               label_00f2 :
                                  b = false;
                                  if (a.c(i, b)) {
                                     tb.e(false, i.traceInfo, "AFTER_SEND_GIFT", "CLIENT_HANDLE_FEED_PUSH", "[LiveGiftSlotModel][shouldFilterGiftForSlot]self slot message", 505);
                                  }else if(i.mSlotPos <= true){
                                     tb.e(false, i.traceInfo, "AFTER_SEND_GIFT", "CLIENT_HANDLE_FEED_PUSH", "[LiveGiftSlotModel][shouldFilterGiftForSlot]不支持在槽位展示", 508);
                                  }else if(i.mDrawingGift != null || i.mIsDrawingGift != null){
                                  label_0126 :
                                     if (b) {
                                        continue ;
                                     }else {
                                        obj = a.a(i.mGiftId);
                                        if (obj == null) {
                                           tb.e(false, i.traceInfo, "AFTER_SEND_GIFT", "CLIENT_HANDLE_FEED_PUSH", "[LiveGiftSlotModel][handleFeedPushGiftMessages]gift is null, gift id:"+i.mGiftId, 603);
                                        }else if(a.c(i, true)){
                                           i.mSlotPos = 2;
                                        }
                                        i.mGift = obj;
                                        LiveSendGiftBaseTraceInfo liveSendGift = tb.k.o6();
                                        i.traceInfo = liveSendGift;
                                        tb.e(0, liveSendGift, "AFTER_SEND_GIFT", "CLIENT_HANDLE_FEED_PUSH", "[LiveGiftSlotModel][handleFeedPushGiftMessages]feed giftSlot success", 1);
                                        p2.add(i);
                                     }
                                  }
                                  b = true;
                                  goto label_0126 ;
                               }
                            }else {
                               goto label_00f2 ;
                            }
                         }
                         tb.d("[LiveGiftSlotModel]", p2);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
    }
}
