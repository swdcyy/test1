package com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import xp5.i;
import or5.d;
import qx1.a;
import h03.a;
import gm1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import om1.e;
import fi1.a;
import mi1.a;
import bi1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import java.util.List;
import pp.c;
import ci1.b;
import hi1.u;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager$b;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel;
import ei1.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import crd.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel;
import py2.a;
import hi1.i;

public final class LiveGiftEffectManager extends LifecycleManager	// class@001191
{
    public final List c;
    public LiveGiftEffectModel d;
    public final b e;
    public final i f;
    public final a g;
    public final i h;
    public final d i;
    public final a j;
    public static final LiveGiftEffectManager$a k;

    static {
       LiveGiftEffectManager.k = new LiveGiftEffectManager$a(null);
    }
    public void LiveGiftEffectManager(LifecycleOwner p0,i p1,d p2,a p3,a p4,c p5,LiveGiftSendModel p6,e p7,a p8,a p9,a p10){
       LiveGiftEffectManager liveGiftEffe = this;
       Object obj = p0;
       List obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p4;
       Object obj4 = p7;
       Object obj5 = p10;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "logPackageProvider");
       a.p(obj2, "audienceInfoManager");
       Object obj6 = p3;
       a.p(obj6, "serverSignalBlockManager");
       a.p(obj3, "effectEngineService");
       Object obj7 = p5;
       a.p(obj7, "giftFeedPushModel");
       Object obj8 = p6;
       a.p(obj8, "giftSendModel");
       a.p(obj4, "sendGiftTracer");
       Object obj9 = p8;
       a.p(obj9, "giftMessageChecker");
       Object obj10 = p9;
       a.p(obj10, "giftMessageTransformer");
       a.p(obj5, "config");
       super(p0);
       liveGiftEffe.h = obj1;
       liveGiftEffe.i = obj2;
       liveGiftEffe.j = obj3;
       obj1 = LiveGiftEffectLogTag.LIVE_GIFT_EFFECT.appendTag("LiveGiftEffectManager");
       liveGiftEffe.c = obj1;
       b uob = new b(obj4);
       liveGiftEffe.e = uob;
       liveGiftEffe.f = new u();
       b.P(obj1, "[init]config:"+obj5);
       liveGiftEffe.g = new LiveGiftEffectManager$b(liveGiftEffe);
       LiveGiftEffectModel liveGiftEffe1 = new LiveGiftEffectModel(p0, obj5.b, obj5.a, obj7, obj8, obj10, obj9, uob, obj3, obj2, obj6, obj4);
       liveGiftEffe.d = v15;
       v15.b(obj, new LiveGiftEffectManager$1(liveGiftEffe));
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveGiftEffectManager td = this.d;
       if (td == null) {
          a.S("effectModel");
       }
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, LiveGiftEffectModel.class, "1")) {
          LiveGiftEffectModel j = td.j;
          if (j != null && !PatchProxy.applyVoid(null, j, LiveGiftEffectSelfMockModel.class, "1")) {
             j.k.dispose();
          }
          LiveGiftEffectModel k = td.k;
          if (k != null && !PatchProxy.applyVoid(null, k, LiveGiftEffectGuestModel.class, "1")) {
             k.q.b(k.l);
          }
       }
    label_004f :
       this.f.release();
       return;
    }
}
