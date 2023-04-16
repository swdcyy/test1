package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$f;
import lf3.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveOverRoomMessageV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import nx0.h;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import q2b.h$b;
import kotlin.jvm.internal.a;
import k2b.e0;
import k2b.u1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import java.util.BitSet;
import com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfo;
import kx0.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import d61.v;
import java.lang.Long;
import ekd.j;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Random;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.b;
import java.lang.Runnable;
import e93.f;
import lf3.f;

public final class a$f implements g	// class@000a5d
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       boolean b2;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$f.class, "1")) {
       }else {
          LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
          String str = "LiveAudienceOverRoomV2Model";
          lIVE_OVER_RO.appendTag(str);
          b.S(lIVE_OVER_RO, "receive SCLiveOverRoomMessage", "message", obj1);
          SCLiveOverRoomMessageV2 bizType = obj1.bizType;
          h oh = h.class;
          List list = null;
          b = true;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(bizType), list, oh, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_BROADCAST_ACCEPT_MESSAGE";
             i3 oi3 = i3.f();
             oi3.c("biz_type", Integer.valueOf(bizType));
             oi3.c("channel", Integer.valueOf(3));
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(b, "LIVE_BROADCAST_ACCEPT_MESSAGE");
             a.o(uob, "builder");
             uob.k(uElementPack);
             u1.p0("", list, uob);
          }
          a$f b1 = obj.b;
          a.o(obj1, "it");
          Objects.requireNonNull(b1);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a obj2 = PatchProxy.applyOneRefs(obj1, b1, a.class, "16");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(obj1.displayInfo == null){
             lIVE_OVER_RO.appendTag(str);
             b.P(lIVE_OVER_RO, "filter SCLiveOverRoomMessageV2, displayInfo is null");
          }else if(b1.c != null){
             lIVE_OVER_RO.appendTag(str);
             b.P(lIVE_OVER_RO, "filter SCLiveOverRoomMessageV2, disableOverRoomMessage is true");
             h.c(obj1.bizType, "BUSINESS_LOGIC2D");
          }else if(a.g(b1.m.getValue(), Boolean.TRUE)){
             lIVE_OVER_RO.appendTag(str);
             b.P(lIVE_OVER_RO, "filter SCLiveOverRoomMessageV2, live room status disabled");
             if (b1.l.get(b)) {
                h.c(obj1.bizType, "BACKGROUND");
             }else if(b1.l.get(2)){
                h.c(obj1.bizType, "FULL_SCREEN");
             }else if(b1.l.get(5)){
                h.c(obj1.bizType, "GZONE_PURE_MODE");
             }
          }else {
             obj2 = b1.k;
             Integer integer = Integer.valueOf(obj1.bizType);
             LiveOverRoomMessageDisplayInfo toLiveStream = obj1.displayInfo.toLiveStreamId;
             Objects.requireNonNull(obj2);
             Object obj3 = PatchProxy.applyTwoRefs(integer, toLiveStream, obj2, a.class, "4");
             if (obj3 != patchProxyRe) {
                b2 = obj3.booleanValue();
             }else if(!obj2.a(integer) || (obj2.a == null && (!CollectionsKt___CollectionsKt.H1(obj2.b, toLiveStream) && obj2.c < obj2.d))){
                b2 = true;
             }else {
                b2 = false;
             }
             if (!b2) {
                lIVE_OVER_RO.appendTag(str);
                b.P(lIVE_OVER_RO, "filter SCLiveOverRoomMessageV2, highValueOverRoomFrequency disallow");
                h.c(obj1.bizType, "BUSINESS_HIGH_VALUE_FREQUENCY");
             }else {
                LiveStreamFeedWrapper liveStreamFe = b1.r.r5();
                String str1 = "feedService\n        .liveStreamFeedWrapper";
                a.o(liveStreamFe, str1);
                String str2 = "BUSINESS_LOGIC2A";
                if (TextUtils.n(obj1.displayInfo.toLiveStreamId, liveStreamFe.getLiveStreamId())) {
                   lIVE_OVER_RO.appendTag(str);
                   b.P(lIVE_OVER_RO, "filter SCLiveOverRoomMessageV2, in same live room");
                   h.c(obj1.bizType, str2);
                }else {
                   SCLiveOverRoomMessageV2 disableAutho = obj1.disableAuthor;
                   if (disableAutho != null) {
                      list = ArraysKt___ArraysKt.ty(disableAutho);
                   }
                   if (list != null) {
                      LiveStreamFeedWrapper liveStreamFe1 = b1.r.r5();
                      a.o(liveStreamFe1, str1);
                      if (list.contains(Long.valueOf(v.f(liveStreamFe1.getUserId(), 0))) == b) {
                         b.c0(LiveLogTag.LIVE_BROADCAST_BANNER_MESSAGE, "filter SCLiveOverRoomMessageV2, current anchor is in disable anchor list!", "disableAnchorList", list);
                         h.c(obj1.bizType, str2);
                      }
                   }
                   List list1 = j.b(obj1.disableLiveStreamType);
                   obj2 = b1.d;
                   if (obj2 != null) {
                      list1.retainAll(obj2);
                   }
                   if (!q.f(list1)) {
                      b.d0(LiveLogTag.LIVE_BROADCAST_BANNER_MESSAGE, "filter SCLiveOverRoomMessageV2, current liveStreamType is in disable liveStreamType list!", "disableLiveStreamTypeList", j.b(obj1.disableLiveStreamType), "currentLiveStreamTypeList", b1.d);
                      h.c(obj1.bizType, "BUSINESS_LOGIC2L");
                   }else {
                      list1 = j.b(obj1.onlyEnableLiveStreamType);
                      if (!q.f(list1)) {
                         obj2 = b1.d;
                         if (obj2 != null) {
                            list1.retainAll(obj2);
                         }
                         if (q.f(list1)) {
                            b.d0(LiveLogTag.LIVE_BROADCAST_BANNER_MESSAGE, "filter SCLiveOverRoomMessageV2, current liveStreamType not is in only enable liveStreamType list!", "onlyEnableLiveStreamTypeList", j.b(obj1.onlyEnableLiveStreamType), "currentLiveStreamTypeList", b1.d);
                            h.c(obj1.bizType, "BUSINESS_LOGIC2LW");
                         }
                      }
                   }
                }
             }
          }
          b = false;
          if (b) {
             b.S(lIVE_OVER_RO.appendTag(str), "ready to parse and enqueue", "delayTimes", Long.valueOf(obj1.delayTimeMs));
             if (obj1.delayTimeMs > 0) {
                f.k("enqueueOverRoomMessage", new b(obj, obj1), obj.b, (long)new Random().nextInt((int)obj1.delayTimeMs));
             }else {
                obj.b.b(obj1);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
