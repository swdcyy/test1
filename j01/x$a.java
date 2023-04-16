package j01.x$a;
import j01.x$b;
import j01.x;
import java.lang.Object;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.common.encryption.model.BatchSendingGiftParam$b;
import com.kuaishou.common.encryption.model.BatchSendingGiftParam;
import com.kuaishou.common.encryption.model.BatchSendingGiftParam$SendInfo;
import java.lang.Long;
import com.kuaishou.common.encryption.model.a$a;
import java.util.ArrayList;
import java.util.List;
import j01.i0;
import mk1.h;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.common.encryption.model.a;
import java.lang.System;
import tkd.b;
import tkd.d;
import nl9.r;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.common.encryption.model.enums.GiftUserSource;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.util.HashMap;
import d61.e0;
import java.lang.CharSequence;
import android.text.TextUtils;
import fq5.b;
import p91.m;
import lp3.e;
import xp5.i;
import lp3.c;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mk1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import fg6.a;
import com.google.gson.Gson;
import android.os.SystemClock;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mk1.b0;
import bl1.a;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import ik1.h0;
import mk1.w;
import com.kuaishou.live.basic.model.QLiveMessage;
import z12.e;
import ad5.b;
import ad5.a;
import brd.t;
import j01.w;
import erd.o;
import qj1.h;
import j01.v;
import erd.g;
import j01.u;
import j01.y;
import crd.b;

public class x$a implements x$b	// class@002a0e
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public void a(i p0,int p1,Gift p2,int p3,UserInfo p4,boolean p5){
       Object[] objArray;
       x$a obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       x$a uoa = x$a.class;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 6;
       int i6 = 1;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i5];
          objArray[0] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i4] = oobject1;
          objArray[i3] = Integer.valueOf(p3);
          objArray[i2] = oobject2;
          objArray[i1] = Boolean.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       x$a a = obj.a;
       Objects.requireNonNull(a);
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          objArray = new Object[i5];
          objArray[0] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i4] = oobject1;
          objArray[i3] = Integer.valueOf(p3);
          objArray[i2] = oobject2;
          objArray[i1] = Boolean.valueOf(p5);
          if (!PatchProxy.applyVoid(objArray, a, ox, "3")) {
          label_006e :
             if (oobject2 == null) {
                b.B(a.t, "httpSendGiftToAudience : send to audience but receiver is null !");
             }else {
                BatchSendingGiftParam$b uob = BatchSendingGiftParam.newBuilder();
                BatchSendingGiftParam$SendInfo sendInfo = new BatchSendingGiftParam$SendInfo(oobject1.mId, Long.parseLong(oobject2.mId), p3);
                _monitor_enter(uob);
                a$a a1 = uob.a;
                if (a1.sendInfoList == null) {
                   a1.sendInfoList = new ArrayList();
                }
                uob.a.sendInfoList.add(sendInfo);
                _monitor_exit(uob);
                uob.a.liveStreamId = a.getLiveStreamId();
                uob.a.comboKey = String.valueOf(a.q.H);
                uob.a.visitorId = Long.parseLong(QCurrentUser.ME.getId());
                uob.a.seqId = System.currentTimeMillis();
                uob.a.clientTimestamp = System.currentTimeMillis();
                uob.a.giftToken = a.P8(i);
                if (d.a(0x691527a8).OB(a.u.c)) {
                   uob.b(GiftUserSource.LIVE_FANS_TOP.ordinal());
                }else {
                   uob.b(GiftUserSource.DEFAULT.ordinal());
                }
                String str = a.q.O(p0.c());
                HashMap hashMap = new HashMap();
                hashMap.put("exp_tag", e0.a(a.u.c));
                hashMap.put("expTagList", e0.b());
                hashMap.put("recoGiftLlsid", str);
                if (!TextUtils.isEmpty(p0.a())) {
                   hashMap.put("creditExchangeId", p0.a());
                }
                FeedLogCtx uFeedLogCtx = a.u.b().t5().a(i.class).c0();
                if (uFeedLogCtx != null) {
                   hashMap.put("interStid", uFeedLogCtx.stidContainer);
                }
                hashMap.put("commonStid", b.a(0x4b316083).i(a.u.R().t0().o(), null));
                String str1 = a.p.h();
                if (!TextUtils.isEmpty(str1)) {
                   uob.a.scene = str1;
                   hashMap.put("scene", str1);
                   b.c0(LiveLogTag.LIVE_GUEST_ACTIVITY, "httpSendGiftToAudience append scene,", "scene", str1);
                }
                uob.a.logExtraInfo = a.a.q(hashMap);
                a uoa1 = uob.a();
                long l = SystemClock.elapsedRealtime();
                String str2 = u1.f();
                i0 obj1 = PatchProxy.applyOneRefs(oobject1, a, ox, "11");
                int i7 = (obj1 != PatchProxyResult.class)? obj1.intValue(): a.q.o.B2(oobject1).a;
                LiveGiftToAudienceMessage liveGiftToAu = LiveGiftToAudienceMessage.createSelfToAudienceGiftMessage(oobject1.mId, oobject1.mGiftType, p3, a.q.H, p4);
                obj1 = a.q;
                int i8 = w.e(obj1);
                Gift gift = p2;
                i4 = p3;
                String str3 = str;
                obj = a;
                h0 oh0 = new h0(liveGiftToAu, a.u.c, str2, gift, i4, i7, obj1.H, i8, 0, p4);
                String str4 = obj.P8(i);
                String[] stringArray = new String[]{uoa1.toString()};
                e.c("LiveAudienceGiftBox", "sendGiftToAudienceStart", stringArray);
                u ou = oobject2;
                uoa = obj;
                u ou1 = oobject2;
                ou = new u(uoa, liveGiftToAu, v22, p0, gift, i4, p4, l, p5, str4, str3);
                y oy = oobject2;
                y oy1 = oobject2;
                oy = new y(uoa, p2, p0, v22, l, p5, str4, str3, liveGiftToAu, p3, p4);
                d.a(0x630bc993).d1().x(uoa1.toJson()).flatMap(new w(obj, oobject)).retryWhen(new h()).doOnNext(v.b).subscribe(ou1, oy1);
             }
          }
       }else {
          goto label_006e ;
       }
       return;
    }
}
