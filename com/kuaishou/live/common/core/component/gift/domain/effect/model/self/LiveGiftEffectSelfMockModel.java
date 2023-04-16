package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import mi1.a;
import fi1.a;
import ei1.a;
import or5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import java.util.List;
import pp.c;
import crd.a;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s00.b$a;
import s00.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import crd.b;
import rm1.b;
import rm1.b$a;
import lj1.d;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.model.response.WalletResponse;
import lj1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import rm1.d;
import java.util.Objects;
import rm1.d$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ai1.d;
import ai1.c;
import xp5.g;
import com.yxcorp.gifshow.model.response.WalletResponse$ExtraInfo;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$c;
import erd.g;
import di1.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public final class LiveGiftEffectSelfMockModel extends Model	// class@0011bf
{
    public final List i;
    public final int j;
    public a k;
    public CopyOnWriteArraySet l;
    public final LiveGiftSendModel m;
    public final a n;
    public final a o;
    public final a p;
    public final d q;
    public static final LiveGiftEffectSelfMockModel$a r;

    static {
       LiveGiftEffectSelfMockModel.r = new LiveGiftEffectSelfMockModel$a(null);
    }
    public void LiveGiftEffectSelfMockModel(LifecycleOwner p0,LiveGiftSendModel p1,a p2,a p3,a p4,d p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "giftSendModel");
       a.p(p2, "giftMessageTransformer");
       a.p(p3, "giftMessageChecker");
       a.p(p5, "audienceInfoManager");
       super("LiveGiftEffectSelfModel", null, false, false, 14, null);
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.i = LiveGiftEffectLogTag.LIVE_GIFT_EFFECT.appendTag("LiveGiftEffectSelfModel");
       this.j = 1;
       this.k = new a();
       this.l = new CopyOnWriteArraySet();
       p1.b(p0, new LiveGiftEffectSelfMockModel$1(this));
    }
    public final void e(String p0,String p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectSelfMockModel.class, "6")) {
          return;
       }
       try{
          byte[] uobyteArray = b.a().a(p0);
          if (uobyteArray != null) {
             int i = (!uobyteArray.length)? 1: 0;
             if (i ^ 1) {
                p2.invoke(uobyteArray);
                return;
             }
          }
       }catch(java.lang.Exception e0){
          b.r(this.i, "handleGiftFeedByteArrayError : "+p1);
       }
       return;
    }
    public final void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectSelfMockModel.class, "10")) {
          return;
       }
       if (b.c.a() && p0 != null) {
          this.k.a(p0);
       }
       return;
    }
    public final void g(d p0){
       d$a a;
       boolean b;
       LiveGiftEffectSelfMockModel liveGiftEffe = LiveGiftEffectSelfMockModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftEffe, "3")) {
          return;
       }
       GiftMessage giftMessage = p0.a();
       if (giftMessage != null) {
          WalletResponse walletRespon = p0.d();
          if (walletRespon != null) {
             LiveSendGiftBaseTraceInfo liveSendGift = p0.b().l();
             Object[] objArray = null;
             if (liveSendGift == null) {
                a = d.a;
                liveGiftEffe = this.i;
                a.o(liveGiftEffe, "logTag");
                Objects.requireNonNull(a);
                d$a uoa = d$a.class;
                if (!PatchProxy.applyVoidTwoRefs(liveGiftEffe, "[LiveGiftEffectSelfMockModel][requestMockSelfGiftEffect]traceInfo is null", a, uoa, "2")) {
                   a.p(liveGiftEffe, "tags");
                   a.p("[LiveGiftEffectSelfMockModel][requestMockSelfGiftEffect]traceInfo is null", "errorMessage");
                   if (!TextUtils.x("[LiveGiftEffectSelfMockModel][requestMockSelfGiftEffect]traceInfo is null")) {
                      a = PatchProxy.apply(objArray, a, uoa, "1");
                      if (a != PatchProxyResult.class) {
                         b = a.booleanValue();
                      }else {
                         c uoc = a.a();
                         a.o(uoc, "AppEnv.get\(\)");
                         b = (uoc.c() && SystemUtil.J())? true: false;
                      }
                      if (!b) {
                         b.r(liveGiftEffe, "[LiveGiftEffectSelfMockModel][requestMockSelfGiftEffect]traceInfo is null");
                      }else {
                         throw new RuntimeException("[LiveGiftEffectSelfMockModel][requestMockSelfGiftEffect]traceInfo is null");
                      }
                   }
                }
                return;
             }else {
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = objArray;
                d uod = c.b();
                String liveStreamId = this.q.getLiveStreamId();
                String str = String.valueOf(giftMessage.mComboKey);
                GiftMessage mComboCount = giftMessage.mComboCount;
                WalletResponse mGiftSentInf = walletRespon.mGiftSentInfo;
                WalletResponse mExtraInfo = walletRespon.mExtraInfo;
                if (mExtraInfo != null) {
                   objArray = mExtraInfo.mSendGiftExtraInfo;
                }
                b uob = uod.b(liveStreamId, str, mComboCount, mGiftSentInf, objArray).map(new e()).subscribe(new LiveGiftEffectSelfMockModel$b(this, liveSendGift, objectRef), new LiveGiftEffectSelfMockModel$c(this, liveSendGift, objectRef));
                objectRef.element = uob;
                a.o(uob, "disposable");
                if (!PatchProxy.applyVoidOneRefs(uob, this, liveGiftEffe, "9")) {
                   this.k.c(uob);
                }
             }
          }
       }
       return;
    }
    public final void h(GiftMessage p0,String p1,LiveSendGiftBaseTraceInfo p2){
       LiveGiftEffectSelfMockModel tp;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectSelfMockModel.class, "7")) {
          return;
       }
       a.p(p0, "giftMessage");
       a.p(p1, "source");
       a.p(p2, "traceInfo");
       int i = this.o.a(p0);
       if (i != 1) {
          tp = this.p;
          if (tp != null) {
             tp.b(p2, true, this.j, i, p1);
          }
          return;
       }else {
          LiveGiftEffectSelfMockModel tj = this.j;
          a uoa = new a(null, p0, null, tj);
          tp = this.p;
          if (tp != null) {
             tp.b(p2, true, tj, 1, p1);
          }
          this.l.add(p0.mMergeKey);
          this.d(p1, uoa);
          return;
       }
    }
}
