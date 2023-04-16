package j01.m$a;
import j01.m$b;
import j01.m;
import java.lang.Object;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import w91.a;
import com.kwai.robust.PatchProxyResult;
import j01.i0;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.h;
import lnc.i3;
import mk1.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
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
import android.os.SystemClock;
import k2b.u1;
import java.lang.Number;
import mk1.w;
import com.kuaishou.android.live.log.LiveLogTag;
import android.util.SparseArray;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import hg2.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wy0.f;
import java.lang.Long;
import lm1.e;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lm1.c;
import xz0.b;
import ok.x;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import brd.t;
import qj1.h;
import erd.o;
import cjd.e;
import wy0.e;
import lp3.i;
import k01.a;
import com.kuaishou.live.audience.component.gift.a;
import erd.g;
import crd.b;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.kuaishou.common.encryption.model.SendingGiftParam$b;
import com.kuaishou.common.encryption.model.SendingGiftParam;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import nl9.r;
import com.kuaishou.common.encryption.model.enums.GiftUserSource;
import java.lang.Enum;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.a$a;
import j01.o;
import j01.l;
import j01.k;
import j01.n;
import wo1.a;

public class m$a implements m$b	// class@002a01
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(i p0,int p1,Gift p2,int p3,boolean p4){
       i0 obj2;
       GiftMessage giftMessage;
       m om1;
       a uoa2;
       String str4;
       int i8;
       m$a uoa3;
       i0 q;
       c uoc;
       i oi;
       e uoe;
       e uoe1;
       e uoe2;
       a uoa4;
       object oobject2;
       e uoe3;
       HashMap hashMap;
       String str5;
       a uoa5;
       m t1;
       String str6;
       Object[] objArray4;
       String str7;
       k ok;
       Gift gift;
       k ok1;
       n on;
       n on1;
       SendingGiftParam$b uob;
       PatchProxyResult obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       int i1 = p3;
       m$a uoa = m$a.class;
       int i2 = 0;
       int i3 = 4;
       int i4 = 1;
       int i5 = 2;
       int i6 = 5;
       int i7 = 3;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i6];
          objArray[i2] = oobject;
          objArray[i4] = Integer.valueOf(p1);
          objArray[i5] = oobject1;
          objArray[i7] = Integer.valueOf(p3);
          objArray[i3] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       m$a a = obj.a;
       Objects.requireNonNull(a);
       a uoa1 = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       String str = "3";
       if (PatchProxy.isSupport(om)) {
          Object[] objArray1 = new Object[i6];
          objArray1[i2] = oobject;
          objArray1[i4] = Integer.valueOf(p1);
          objArray1[i5] = oobject1;
          objArray1[i7] = Integer.valueOf(p3);
          objArray1[4] = Boolean.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray1, a, om, str)) {
          label_006e :
             String str1 = a.q.O(p0.c());
             i3 oi3 = i3.f();
             oi3.d("paySource", a.p.s);
             oi3.d("exp_tag", e0.a(a.t.c));
             oi3.d("expTagList", e0.b());
             oi3.d("recoGiftLlsid", str1);
             if (!TextUtils.isEmpty(p0.a())) {
                oi3.d("creditExchangeId", p0.a());
             }
             FeedLogCtx uFeedLogCtx = a.t.b().t5().a(i.class).c0();
             if (uFeedLogCtx != null) {
                oi3.d("interStid", uFeedLogCtx.stidContainer);
             }
             oi3.d("commonStid", b.a(0x4b316083).i(a.t.R().t0().o(), null));
             String str2 = oi3.toString();
             long l = SystemClock.elapsedRealtime();
             String str3 = u1.f();
             String obj1 = PatchProxy.applyOneRefs(oobject1, a, om, "10");
             i7 = (obj1 != patchProxyRe)? obj1.intValue(): w.i(a.p, a.q, oobject1);
             i6 = i7;
             obj1 = a.P8(i);
             i4 = 8;
             if (PatchProxy.isSupport(om)) {
                Object[] objArray2 = new Object[i4];
                objArray2[0] = str3;
                objArray2[1] = oobject1;
                objArray2[2] = Integer.valueOf(p3);
                objArray2[3] = Integer.valueOf(i6);
                objArray2[4] = Boolean.valueOf(p4);
                objArray2[5] = str2;
                objArray2[6] = obj1;
                objArray2[7] = str1;
                if (PatchProxy.applyVoid(objArray2, a, om, "5")) {
                label_0193 :
                   if (PatchProxy.isSupport(om)) {
                      obj2 = PatchProxy.applyTwoRefs(oobject1, Integer.valueOf(p3), a, om, "6");
                      if (obj2 != patchProxyRe) {
                         giftMessage = obj2;
                         obj = patchProxyRe;
                         om1 = om;
                         uoa2 = uoa1;
                         str4 = str2;
                         i8 = 3;
                         uoa3 = a;
                      label_01f4 :
                         if (oobject1.mCanCombo != null) {
                            uoa3.t.z2.hm((long)(oobject1.mPrice * i1));
                         }else {
                            uoa3.t.z2.Nh((long)(oobject1.mPrice * i1));
                         }
                         int i9 = 9;
                         if (p2.isNebulaCreditGift()) {
                            m u = uoa3.u;
                            m t = uoa3.t;
                            q = uoa3.q;
                            Activity activity = uoa3.getActivity();
                            obj2 = uoa3.p;
                            i0 s = uoa3.s;
                            h h = uoa3.q.H;
                            f uof = f.class;
                            if (PatchProxy.isSupport(uof)) {
                               Object[] objArray3 = new Object[15];
                               objArray3[0] = oobject;
                               objArray3[1] = u;
                               objArray3[2] = t;
                               objArray3[i8] = q;
                               objArray3[4] = activity;
                               objArray3[5] = obj2;
                               objArray3[6] = s;
                               objArray3[7] = giftMessage;
                               objArray3[8] = oobject1;
                               objArray3[i9] = Integer.valueOf(p3);
                               objArray3[10] = str3;
                               objArray3[11] = Boolean.valueOf(p4);
                               objArray3[12] = Long.valueOf(l);
                               objArray3[13] = Integer.valueOf(i6);
                               objArray3[14] = Integer.valueOf(h);
                               if (!PatchProxy.applyVoid(objArray3, null, uof, str)) {
                               }
                            }else {
                            }
                         }else {
                            int i10 = i6;
                            if (PatchProxy.isSupport(om1)) {
                               objArray1 = new Object[10];
                               oobject2 = p0;
                               objArray1[0] = oobject2;
                               objArray1[1] = giftMessage;
                               objArray1[2] = str4;
                               oobject1 = p2;
                               objArray1[i8] = oobject1;
                               objArray1[4] = Integer.valueOf(p1);
                               objArray1[5] = Integer.valueOf(p3);
                               objArray1[6] = str3;
                               objArray1[7] = Boolean.valueOf(p4);
                               objArray1[8] = Long.valueOf(l);
                               objArray1[i9] = Integer.valueOf(i10);
                               om = om1;
                               if (!PatchProxy.applyVoid(objArray1, uoa3, om, "7")) {
                               }
                            }else {
                               oobject2 = p0;
                               oobject1 = p2;
                               om = om1;
                            }
                         }
                      }
                   }
                   obj2 = a.q;
                   Integer integer = obj2.I.get(obj2.H);
                   if (integer == null) {
                      integer = Integer.valueOf(0);
                      u1.R("gift_combo_value_error", "httpSendGiftToAncHor getComboValue null", 3);
                   }else {
                      Gift gift1 = 3;
                   }
                   str4 = str2;
                   om1 = om;
                   uoa2 = uoa1;
                   uoa3 = a;
                   obj = patchProxyRe;
                   i8 = 3;
                   giftMessage = GiftMessage.createSelfGiftMessage(oobject1.mId, oobject1.mGiftType, p3, integer.intValue(), a.q.H);
                   goto label_01f4 ;
                }
             }
             q = a.q;
             b.h0(LiveLogTag.GIFT, "LiveAudienceGiftBoxsendGiftStart", ImmutableMap.of("taskSessionId", str3, "giftId", String.valueOf(oobject1.mId), "giftCount", String.valueOf(p3), "giftComboCount", String.valueOf(q.I.get(q.H)), "giftIndex", String.valueOf(i6), "logExtraInfo", str2));
             goto label_0193 ;
          }
       }else {
          goto label_006e ;
       }
    label_0505 :
       a0 w2 = this.a.t.W2;
       if (w2 != null) {
          w2.a();
       }
       return;
    }
}
