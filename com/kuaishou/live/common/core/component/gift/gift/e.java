package com.kuaishou.live.common.core.component.gift.gift.e;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import eg1.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import ca1.a;
import da1.a;
import java.util.List;
import pp.a;
import java.lang.Long;
import q87.c;
import com.kuaishou.live.common.core.component.gift.gift.l$c;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.gift.gift.a;
import ok.o;
import com.kuaishou.live.common.core.component.gift.gift.g;
import ok.h;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.gift.gift.h;
import lp3.c;
import lp3.i;
import ik1.m;
import ik1.n;
import ik1.b;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.gift.b;
import ik1.c;
import ik1.k;
import java.util.Iterator;
import lm1.h;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import va1.a0;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kwai.robust.PatchProxyResult;
import java.util.BitSet;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kwai.framework.model.user.UserInfo;
import sg1.c;
import p91.m;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ik1.o;
import ik1.l;
import ik1.h;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import lf3.f;

public final class e implements g	// class@0012a0
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       QLiveMessage mLiveAudienc;
       boolean b1;
       i e;
       e b = this.b;
       LiveStreamMessages$SCFeedPush obj = p0;
       Objects.requireNonNull(b);
       e uoe = e.class;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, oi, "6")) {
       }else {
          List list = b.L.c(obj).a();
          Object[] objArray = new Object[]{"cost",Long.valueOf((SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()))};
          a.C().s("ks://LiveGiftPart", "onFeedReceived_resolveData", objArray);
          long l = SystemClock.elapsedRealtime();
          b.H.a(list);
          if (!PatchProxy.applyVoidOneRefs(list, b, oi, "8")) {
             ArrayList uArrayList3 = new ArrayList();
             m.s(list).p(a.b).F(g.b).n(uArrayList3);
             if (!q.f(uArrayList3)) {
                uArrayList3 = new ArrayList();
                m.s(uArrayList3).F(h.b).n(uArrayList3);
                if (!PatchProxy.applyVoidOneRefs(uArrayList3, b, oi, "30")) {
                   e uoe2 = b.F.a(uoe);
                   ArrayList uArrayList4 = new ArrayList();
                   m.s(uArrayList3).p(new m(b)).p(new n(b)).F(new b(b)).n(uArrayList4);
                   if (!q.f(uArrayList4)) {
                      uoe2.H0(uArrayList4);
                   }
                }
             }
          }
          obj = obj.needReportGiftFeed;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(list, Boolean.valueOf(obj), b, oi, "9")) {
             ArrayList uArrayList = new ArrayList();
             m.s(list).p(b.b).p(new c(b)).F(new k(b, obj)).n(uArrayList);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, b, oi, "12")) {
                ArrayList uArrayList2 = new ArrayList();
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   h oh = iterator1.next();
                   QLiveMessage qLiveMessage1 = oh.b();
                   if (a0.g(qLiveMessage1)) {
                      if (qLiveMessage1 != null) {
                         mLiveAudienc = qLiveMessage1.mLiveAudienceState;
                         if (mLiveAudienc != null) {
                            LiveAudienceState livePrivileg = mLiveAudienc.livePrivilegeState;
                            if (livePrivileg != null) {
                               b.x = e0.i(livePrivileg.avatarFrame);
                               b.y = e0.i(qLiveMessage1.mLiveAudienceState.livePrivilegeState.avatarFrameAnimation);
                            }
                         }
                         CDNUrl[] uCDNUrlArray = null;
                         b.x = uCDNUrlArray;
                         b.y = uCDNUrlArray;
                      }else {
                         b.Z8(oh, 501, "[LiveGiftFeedBasePresenter][handleSlotGiftMessages]gift message is null");
                      }
                      b.Z8(oh, 505, "[LiveGiftFeedBasePresenter][handleSlotGiftMessages]self slot message");
                   }else {
                      Object obj1 = PatchProxy.applyOneRefs(oh, b, oi, "18");
                      if (obj1 != PatchProxyResult.class) {
                         b1 = obj1.booleanValue();
                      }else {
                         GiftMessage giftMessage = oh.b();
                         if (!a0.h(giftMessage, true)) {
                            if (a0.d(giftMessage)) {
                               if (b.w != null) {
                                  b.Z8(oh, 502, "[LiveGiftFeedBasePresenter][shouldFilterGiftForSlot]drawing gift disable slot");
                               }
                               e = b.w;
                            }else if(b.z.cardinality()){
                               b.Z8(oh, 503, "[LiveGiftFeedBasePresenter][shouldFilterGiftForSlot]disable solt");
                            }
                            if (b.z.cardinality()) {
                               e = 1;
                            }
                         }
                         e = null;
                      }
                      if (b1 == null) {
                         if (qLiveMessage1.mIsDrawingGift == null) {
                            uArrayList2.add(oh);
                         }else if(qLiveMessage1.mDrawingGift != null){
                            uArrayList2.add(oh);
                         }else {
                            b.Z8(oh, 504, "[LiveGiftFeedBasePresenter][handleSlotGiftMessages]drawingGift is null");
                         }
                         if (!a0.d(qLiveMessage1) && !qLiveMessage1 instanceof LiveGiftToAudienceMessage) {
                            if (b.s.size() > 100) {
                               b.s.remove(0);
                            }
                            b.s.add(qLiveMessage1);
                         }
                         e = b.E;
                         if (e != null) {
                            qLiveMessage1.mShouldDisplayFriendTagInGiftSlot = e.Ml(qLiveMessage1.mUser.mEncryptedUserId);
                         }
                      }
                      PatchProxyResult patchProxyRe = 1;
                   }
                   mLiveAudienc = null;
                }
                if (b.t == null && (b.B.e() && !uArrayList2.isEmpty())) {
                   b.t = true;
                }
             label_0212 :
                b.P8(uArrayList2);
             }
             if (!PatchProxy.applyVoidOneRefs(uArrayList, b, oi, "13")) {
                if (b.F.b()) {
                   b.P(LiveLogTag.GIFT.appendTag("LiveGiftFeedBasePresenter"), "[showMagicGiftEffects]mLiveServiceManager isCleared");
                }else {
                   e uoe1 = b.F.a(uoe);
                   ArrayList uArrayList1 = new ArrayList();
                   m.s(uArrayList).p(new o(b)).p(new l(b)).F(new h(b)).n(uArrayList1);
                   if (!q.f(uArrayList1)) {
                      uoe1.H0(uArrayList1);
                   }
                }
             }
          }
       label_026c :
          if (!PatchProxy.applyVoidOneRefs(list, b, oi, "7")) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                QLiveMessage qLiveMessage = iterator.next();
                if (qLiveMessage instanceof GrabRedPacketMessage) {
                   qLiveMessage.cast().mIsPusher = b.B.e();
                }
             }
          }
          Object[] objArray1 = new Object[]{"cost",Long.valueOf((SystemClock.elapsedRealtime() - l))};
          a.C().s("ks://LiveGiftPart", "onFeedReceived_dispatchGift", objArray1);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
