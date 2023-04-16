package com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import gm1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import mi1.a;
import fi1.a;
import ei1.a;
import h03.a;
import or5.d;
import qx1.a;
import om1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$b;
import ei1.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel$2;

public final class LiveGiftEffectModel extends Model	// class@0011b2
{
    public final List i;
    public LiveGiftEffectSelfMockModel j;
    public LiveGiftEffectGuestModel k;
    public final boolean l;
    public final boolean m;
    public final c n;
    public final LiveGiftSendModel o;
    public final a p;
    public final a q;
    public final a r;
    public final a s;
    public final d t;
    public final a u;
    public final e v;
    public static final LiveGiftEffectModel$a w;

    static {
       LiveGiftEffectModel.w = new LiveGiftEffectModel$a(null);
    }
    public void LiveGiftEffectModel(LifecycleOwner p0,boolean p1,boolean p2,c p3,LiveGiftSendModel p4,a p5,a p6,a p7,a p8,d p9,a p10,e p11){
       LiveGiftEffectLogTag this;
       LifecycleOwner lifecycleOwn;
       LiveGiftEffectModel liveGiftEffe = this;
       boolean b = p1;
       boolean b1 = p2;
       Object obj = p3;
       LiveGiftEffectLogTag obj1 = p4;
       Object obj2 = p5;
       Object obj3 = p6;
       Object obj4 = p8;
       Object obj5 = p9;
       a.p(p0, "lifecycleOwner");
       a.p(obj, "giftFeedPushModel");
       a.p(obj1, "giftSendModel");
       a.p(obj2, "giftMessageTransformer");
       a.p(obj3, "giftMessageChecker");
       a.p(obj4, "effectEngineService");
       a.p(obj5, "audienceInfoManager");
       a.p(p10, "serverSignalBlockManager");
       a.p(p11, "sendGiftTracer");
       Object obj6 = obj5;
       super("LiveGiftEffectMockModel", null, false, 0, 14, 0);
       liveGiftEffe.l = b;
       liveGiftEffe.m = b1;
       liveGiftEffe.n = obj;
       liveGiftEffe.o = obj1;
       liveGiftEffe.p = obj2;
       liveGiftEffe.q = obj3;
       liveGiftEffe.r = p7;
       liveGiftEffe.s = obj4;
       liveGiftEffe.t = obj6;
       liveGiftEffe.u = p10;
       liveGiftEffe.v = p11;
       this = LiveGiftEffectLogTag.LIVE_GIFT_EFFECT;
       this.appendTag("LiveGiftEffectMockModel");
       LiveGiftEffectLogTag liveGiftEffe1 = this;
       liveGiftEffe.i = liveGiftEffe1;
       if (!b1) {
          lifecycleOwn = p0;
          obj1 = liveGiftEffe1;
          LiveGiftEffectSelfMockModel liveGiftEffe2 = new LiveGiftEffectSelfMockModel(lifecycleOwn, p4, p5, p6, p7, p9);
          liveGiftEffe.j = b1;
          b1.b(lifecycleOwn, new LiveGiftEffectModel$1(liveGiftEffe));
       }else {
          lifecycleOwn = p0;
          obj1 = liveGiftEffe1;
          b.P(obj1, "[LiveGiftEffectModel][disableMockSelf]");
       }
       if (!b) {
          b uob = PatchProxy.apply(null, liveGiftEffe, LiveGiftEffectModel.class, "2");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b(liveGiftEffe);
          }
          LiveGiftEffectGuestModel liveGiftEffe3 = new LiveGiftEffectGuestModel(p0, p3, p6, p7, uob, p8, p10, p11);
          liveGiftEffe.k = new LiveGiftEffectModel$1(liveGiftEffe);
          new LiveGiftEffectModel$1(liveGiftEffe).b(lifecycleOwn, new LiveGiftEffectModel$2(liveGiftEffe));
       }else {
          b.P(obj1, "[LiveGiftEffectModel][disableGuestEffect]");
       }
       return;
    }
}
