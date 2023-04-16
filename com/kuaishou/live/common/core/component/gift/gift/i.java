package com.kuaishou.live.common.core.component.gift.gift.i;
import im8.g;
import k51.c;
import java.util.ArrayList;
import java.util.BitSet;
import bm1.b;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.common.core.component.gift.gift.i$a;
import com.kuaishou.live.common.core.component.gift.gift.i$b;
import ik1.d;
import ik1.e;
import ik1.f;
import com.kuaishou.live.common.core.component.gift.gift.e;
import com.kuaishou.live.common.core.component.gift.gift.i$c;
import ik1.g;
import com.kuaishou.live.common.core.component.gift.gift.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ry1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i81.g;
import lp3.c;
import lp3.i;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.n;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import lnc.a1;
import wj1.d;
import wj1.c;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.DrawingGiftDisplayView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$o;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ik1.f0;
import p91.m;
import da1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceDisable;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRenderingMagicFaceEnable;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import kq5.b;
import androidx.fragment.app.c$b;
import gq5.c;
import gq5.f;
import w51.a;
import java.lang.Integer;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import brd.t;
import ik1.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ik1.i;
import ekd.k1;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.gift.gift.f;
import ok.h;
import java.util.Collection;
import java.util.Iterator;
import lm1.h;
import java.lang.StringBuilder;
import f61.b;
import android.app.Activity;
import d61.y;
import ug1.t0;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import ug1.f;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$m;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import sz2.g;
import mi1.b;
import com.kuaishou.live.basic.model.StreamType;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import xp5.i;
import fg1.a;
import lm1.i;
import km1.b;
import pm1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import java.lang.Long;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import ik1.f0$a;
import java.lang.System;
import java.util.Set;
import android.view.View;
import ekd.m1;
import ik1.t;
import java.util.HashMap;
import sg1.c;
import dg1.a;
import com.kuaishou.live.common.core.component.gift.gift.l$c;
import hx1.a;
import qx1.a;

public abstract class i extends c implements g	// class@0012a7
{
    public final List A;
    public m B;
    public a C;
    public b D;
    public c E;
    public i F;
    public a G;
    public l$c H;
    public f I;
    public a J;
    public a K;
    public a L;
    public Set M;
    public a N;
    public i O;
    public b0 P;
    public final c$b Q;
    public final g R;
    public final g S;
    public final g T;
    public final g U;
    public final g V;
    public final c W;
    public GiftAnimContainerView p;
    public ListView q;
    public DrawingGiftDisplayView r;
    public final List s;
    public boolean t;
    public boolean u;
    public f0 v;
    public boolean w;
    public CDNUrl[] x;
    public CDNUrl[] y;
    public final BitSet z;
    public static String sLivePresenterClassName = "LiveGiftFeedBasePresenter";

    public void i(){
       super();
       this.s = new ArrayList();
       this.x = null;
       this.y = null;
       this.z = new BitSet();
       this.A = new ArrayList();
       this.D = new b();
       this.M = new CopyOnWriteArraySet();
       this.P = new i$a(this);
       this.Q = new i$b(this);
       this.R = new d(this);
       this.S = new e(this);
       this.T = new f(this);
       this.U = new e(this);
       this.V = new i$c(this);
       this.W = new g(this);
       this.U7(new l());
    }
    public void E8(){
       boolean b;
       int i;
       b uob = b.class;
       b uob1 = b.class;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       i tD = this.D;
       i tB = this.B;
       i tp = this.p;
       i tr = this.r;
       i tq = this.q;
       b = this.F.a(g.class).R6();
       Objects.requireNonNull(tD);
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray1 = new Object[]{tB,tp,tr,tq,Boolean.valueOf(b)};
          if (PatchProxy.applyVoid(objArray1, tD, uob1, "1")) {
          label_00a5 :
             this.v = new f0(this.B);
             if (!PatchProxy.applyVoid(objArray, this, oi, "5")) {
                this.L = a.b();
                this.C.u0(326, LiveStreamMessages$SCRenderingMagicFaceDisable.class, this.R);
                this.C.u0(327, LiveStreamMessages$SCRenderingMagicFaceEnable.class, this.S);
                this.C.u0(310, LiveStreamMessages$SCFeedPush.class, this.U);
                this.C.u0(300, LiveStreamMessages$SCEnterRoomAck.class, this.T);
                this.C.u0(1083, SCLiveGiftTitleChangeInfo.class, this.V);
             }
             if (this.B.k() != null) {
                this.B.k().c(this.Q);
             }
             if (!this.B.e()) {
                oi = this.I;
                if (oi != null) {
                   oi.k(this.W);
                }
             }
             if (a.D()) {
                oi = this.D;
                i = 8;
                Objects.requireNonNull(oi);
                if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), oi, uob1, "4")) {
                   oi.b.setVisibility(i);
                }
             }
             if (this.B.u5() == LiveSceneType.Audience) {
                this.X7(this.F.a(uob).T3().subscribe(new j(this), Functions.d()));
                this.X7(this.F.a(uob).W().subscribe(new i(this), Functions.d()));
             }
             return;
          }
       }
       tD.a = tB;
       tD.b = tp;
       tD.c = tr;
       tD.d = tq;
       n on = new n();
       tD.e = on;
       tD.d.setAdapter(on);
       if (!b) {
          tD.b.getLayoutParams().height = a1.d(0x7f070778);
       }
       tD.b.setGiftAnimConfigurator(tD.b());
       tD.b.setDrawingGiftDisplayView(tD.c);
       tD.b.setOnItemLogListener(tD.j);
       Objects.requireNonNull(tD.b());
       Boolean fALSE = Boolean.FALSE;
       b.e0(LiveLogTag.GIFT, "LiveGiftFeedBasePresenter", "giftSlotV2", fALSE, "bgEffect", fALSE, "iconClickable", Boolean.TRUE);
       goto label_00a5 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       if (this.B.k() != null) {
          this.B.k().a(this.Q);
       }
       if (!this.B.e()) {
          i tI = this.I;
          if (tI != null) {
             tI.l(this.W);
          }
       }
       this.C.o(326, this.R);
       this.C.o(327, this.S);
       this.C.o(310, this.U);
       this.C.o(300, this.T);
       this.C.o(1083, this.V);
       this.clear();
       k1.n("LiveGiftFeedBasePresenter");
       return;
    }
    public final void P8(List p0){
       Iterator iterator;
       int i;
       boolean b;
       ArrayList obj3;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "28")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(p0).F(f.b).n(uArrayList);
       if (a.D()) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             this.Z8(iterator.next(), 511, "[LiveGiftFeedBasePresenter][addToGiftAnimContainerView]close gift container");
          }
          return;
       }else if(uArrayList.isEmpty()){
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             this.Z8(iterator.next(), 508, "[LiveGiftFeedBasePresenter][addToGiftAnimContainerView]message:"+uArrayList);
          }
          return;
       }else {
          Object[] objArray = null;
          t0 obj = PatchProxy.apply(objArray, this, oi, "29");
          i = 0;
          int i1 = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             b = b.b();
             boolean b3 = y.d(this.getActivity());
             i tI = this.I;
             tI = (tI != null && !tI.m())? 1: 0;
             int i5 = this.B.e() ^ i1;
             String str2 = (i5 && (!b && (b3 && tI)))? 1: null;
             obj3 = (i5 && (b && (b3 && !this.S8())))? 1: 0;
             if (str2 || obj3) {
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                this.Z8(iterator.next(), 512, "[LiveGiftFeedBasePresenter][handleSlotGiftMessages]hide gift container");
             }
             return;
          }else {
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                this.Z8(iterator.next(), i1, "[LiveGiftFeedBasePresenter][handleSlotGiftMessages]slot success");
             }
             i tD = this.D;
             Objects.requireNonNull(tD);
             String str = "3";
             if (!PatchProxy.applyVoidOneRefs(uArrayList, tD, b.class, str)) {
                b b1 = tD.b;
                Objects.requireNonNull(b1);
                obj = t0.class;
                if (!PatchProxy.applyVoidOneRefs(uArrayList, b1, GiftAnimContainerView.class, "16") && !uArrayList.isEmpty()) {
                   b1.p();
                   Iterator iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      GiftMessage giftMessage = iterator1.next();
                      if (!b1.r(giftMessage) && giftMessage.mSlotPos < 2) {
                         continue ;
                      }else if(b1.h.h()){
                         giftMessage.mSlotPos = 3;
                      }
                      Iterator iterator2 = b1.c.iterator();
                      while (iterator2.hasNext()) {
                         GiftMessage giftMessage1 = iterator2.next();
                         if (!(giftMessage1.mMergeKey).equals(giftMessage.mMergeKey)) {
                            continue ;
                         }else {
                            GiftMessage mRank = giftMessage1.mRank;
                            GiftMessage mRank1 = giftMessage.mRank;
                            if (mRank < mRank1) {
                               giftMessage1.mRank = mRank1;
                            }else {
                               giftMessage.mRank = mRank;
                            }
                            mRank = giftMessage1.mExpireDate;
                            GiftMessage mExpireDate = giftMessage.mExpireDate;
                            if (mRank - mExpireDate < 0) {
                               giftMessage1.mExpireDate = mExpireDate;
                            }else {
                               giftMessage.mExpireDate = mRank;
                            }
                            QLiveMessage mTime = giftMessage1.mTime;
                            QLiveMessage mTime1 = giftMessage.mTime;
                            if (mTime - mTime1 > 0) {
                               giftMessage1.mTime = mTime1;
                            }else {
                               giftMessage.mTime = mTime;
                               continue ;
                            }
                         }
                      }
                      b1.c.add(giftMessage);
                   }
                   Collections.sort(b1.c, new f(b1));
                   Object obj1 = PatchProxy.apply(objArray, objArray, obj, "1");
                   String str1 = "SOURCE_LIVE";
                   int b2 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().u(str1).d("enableLimitGiftSlotQueueLength", i);
                   if (b2) {
                      b2 = b1.c.size();
                      LiveLogTag obj2 = PatchProxy.apply(objArray, objArray, obj, str);
                      int i2 = 4000;
                      if (obj2 != patchProxyRe) {
                         i2 = obj2.intValue();
                      }else {
                         i1 = a.t().u(str1).a("slotQueueTrimThreshold", i2);
                         if (i1 > 0) {
                            i2 = i1;
                         }
                      }
                      if (b2 > i2) {
                         obj3 = PatchProxy.apply(objArray, objArray, obj, "2");
                         int i3 = 3000;
                         if (obj3 != patchProxyRe) {
                            i3 = obj3.intValue();
                         }else {
                            int i4 = a.t().u(str1).a("slotQueueMaxLength", i3);
                            if (i4 > 0) {
                               i3 = i4;
                            }
                         }
                         LiveLogTag gIFT = LiveLogTag.GIFT;
                         gIFT.appendTag("GiftAnimContainerView");
                         obj2 = gIFT;
                         b.T(obj2, "trim slot Queue", "current size", Integer.valueOf(b1.c.size()), "trim size", Integer.valueOf(i3));
                         GiftAnimContainerView c = b1.c;
                         if (c == null) {
                            list = Collections.emptyList();
                         }else {
                            b = c.size();
                            if (i3 >= 0 && (i3 > b || i3 < 0)) {
                               list = Collections.emptyList();
                            }else {
                               obj3 = new ArrayList();
                               for (; i < i3; i = i + 1) {
                                  obj3.add(c.get(i));
                               }
                               list = obj3;
                            }
                         }
                         b1.c = list;
                      }
                   }
                   b1.p.a();
                }
             }
          }
       }
    }
    public final h R8(h p0){
       GiftMessage obj = PatchProxy.applyOneRefs(p0, this, i.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.b();
       obj.mGiftSlotSelfAvatarRingImageUrls = this.x;
       obj.mGiftSlotSelfAvatarRingDynamicImageUrls = this.y;
       return p0;
    }
    public boolean S8(){
       return false;
    }
    public boolean V8(h p0){
       BroadcastGiftMessage obj = PatchProxy.applyOneRefs(p0, this, i.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.b();
       String str = "[LiveGiftFeedBasePresenter][isLegalBroadcastGiftMessage]message:";
       if (obj != null && g.e(obj.mMagicFaceId)) {
          this.Y8(obj.mMagicFaceId);
          if (obj.mDisplayAnimation == null) {
             this.X8(p0, 609, str+obj);
          }
          return obj.mDisplayAnimation;
       }else {
          this.X8(p0, 602, str+obj);
          return false;
       }
    }
    public boolean W8(h p0){
       int b;
       GiftMessage obj = PatchProxy.applyOneRefs(p0, this, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.b();
       if (obj != null && b.b(obj)) {
          this.Y8(obj.mMagicFaceId);
       }
       b = this.B.e();
       boolean b1 = (this.B.B0() == StreamType.AUDIO.toInt())? true: false;
       boolean b2 = (this.B.A0() != null && (this.B.A0().r2(AnchorBizRelation.VOICE_PARTY) || this.B.A0().r2(AudienceBizRelation.VOICE_PARTY)))? true: false;
       b = a.b(obj, this.O, b2, b, b1);
       if (b != 1) {
          this.X8(p0, b, "[LiveGiftFeedBasePresenter][isLegalMagicGiftMessage] message:"+obj);
          return false;
       }else {
          return true;
       }
    }
    public void X8(h p0,int p1,String p2){
       String str;
       String str1;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, i.class, "35")) {
          return;
       }
       i oi = p0.a();
       if (oi == null) {
          b.P(b.a, "[LiveGiftFeedBasePresenter][logEffectMockResult]context is null");
          return;
       }else if(this.F.b()){
          b.P(b.a, "[LiveGiftFeedBasePresenter][logEffectMockResult]service manager cleared");
          return;
       }else if(!p0.d()){
          b.P(b.a, "[LiveGiftFeedBasePresenter][logEffectMockResult]isNeedReportGiftFeed false");
          return;
       }else if(p0.c() == 2){
          str = "SENDING_GIFT";
          str1 = "CLIENT_MOCK_RESULT";
       }else if(p0.c() == 1){
          str = "AFTER_SEND_GIFT";
          str1 = "CLIENT_HANDLE_FEED_PUSH";
       }else {
          str = "[LiveGiftFeedBasePresenter][logEffectMockResult]unknown source:"+p0.c();
          if (!SystemUtil.I()) {
             b.r(b.a, str);
             return;
          }else {
             throw new RuntimeException(str);
          }
       }
       b uob = new b(oi.e(), str, str1);
       uob.g(p1, p2);
       this.K.Ia(uob);
       return;
    }
    public final void Y8(long p0){
       int i;
       f0$a uoa;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi, "17")) {
          return;
       }
       i = 1;
       boolean b = (e.b().he().g(String.valueOf(p0)) != null)? true: false;
       i tv = this.v;
       String str = String.valueOf(p0);
       Objects.requireNonNull(tv);
       f0 uof0 = f0.class;
       if (!PatchProxy.isSupport(uof0) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(b), tv, uof0, "2")) {
          if (tv.c.get(str) == null) {
             tv.c.put(str, new f0$a());
          }
          if (b) {
             uoa = tv.c.get(str);
             uoa.a = uoa.a + i;
          }else {
             uoa = tv.c.get(str);
             uoa.b = uoa.b + i;
          }
          uoa = System.currentTimeMillis();
          if ((uoa - tv.a) - 0x927c0 <= 0) {
             i = 0;
          }
          if (i) {
             tv.b();
             tv.a = uoa;
          }
       }
       return;
    }
    public final void Z8(h p0,int p1,String p2){
       String str;
       String str1;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, i.class, "36")) {
          return;
       }
       i oi = p0.a();
       if (oi == null) {
          b.P(b.a, "[LiveGiftFeedBasePresenter][logSlotMockResult]context is null");
          return;
       }else if(this.F.b()){
          b.P(b.a, "[LiveGiftFeedBasePresenter][logSlotMockResult]service manager cleared");
          return;
       }else if(!p0.d()){
          b.P(b.a, "[LiveGiftFeedBasePresenter][logSlotMockResult]isNeedReportGiftFeed false");
          return;
       }else if(p0.c() == 2){
          str = "SENDING_GIFT";
          str1 = "CLIENT_MOCK_RESULT";
       }else if(p0.c() == 1){
          str = "AFTER_SEND_GIFT";
          str1 = "CLIENT_HANDLE_FEED_PUSH";
       }else {
          str = "[LiveGiftFeedBasePresenter][logSlotMockResult]unknown source:"+p0.c();
          if (!SystemUtil.I()) {
             b.r(b.a, str);
             return;
          }else {
             throw new RuntimeException(str);
          }
       }
       b uob = new b(oi.e(), str, str1);
       uob.h(p1, p2);
       this.K.k8(uob);
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, i.class, "27")) {
          return;
       }
       if (!this.B.e() && y.d(this.getActivity())) {
          i tI = this.I;
          if (tI != null) {
             if (!tI.m()) {
                this.I.q(false);
             }else {
                this.I.t();
             }
          }
       }
       return;
    }
    public void b9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "38")) {
          return;
       }
       i tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidOneRefs(p0, tD, b.class, "18")) {
          Objects.requireNonNull(tD.b());
       }
       return;
    }
    public void c9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "39")) {
          return;
       }
       i tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidOneRefs(p0, tD, b.class, "19")) {
          tD.b().a = p0;
       }
       return;
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "19")) {
          return;
       }
       i tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(objArray, tD, b.class, "2")) {
          tD.b.j();
          tD.f.clear();
          tD.g = false;
       }
       this.s.clear();
       this.A.clear();
       this.z.clear();
       this.w = false;
       this.u = false;
       this.M.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1092);
       this.r = m1.f(p0, 0x7f0a0c44);
       this.q = m1.f(p0, 0x7f0a2fe4);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new t());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.B = this.r8("LIVE_BASIC_CONTEXT");
       this.C = this.r8("LIVE_LONG_CONNECTION");
       this.E = this.t8("LIVE_FRIEND_SERVICE");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.F = oi;
       this.G = oi.a(a.class);
       this.H = this.q8(l$c.class);
       this.I = this.s8(f.class);
       this.J = this.s8(a.class);
       this.K = this.F.a(a.class);
       this.N = this.F.a(a.class);
       this.O = this.F.a(i.class);
       return;
    }
}
