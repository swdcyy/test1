package com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import gm1.c;
import fi1.a;
import ei1.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$b;
import h03.a;
import qx1.a;
import om1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.log.LiveGiftEffectLogTag;
import java.util.List;
import pp.c;
import gm1.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$c;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import py2.a;

public final class LiveGiftEffectGuestModel extends Model	// class@0011b7
{
    public final List i;
    public final a j;
    public final int k;
    public final a l;
    public final c m;
    public final a n;
    public final a o;
    public final LiveGiftEffectGuestModel$b p;
    public final a q;
    public final a r;
    public final e s;
    public static final LiveGiftEffectGuestModel$a t;

    static {
       LiveGiftEffectGuestModel.t = new LiveGiftEffectGuestModel$a(null);
    }
    public void LiveGiftEffectGuestModel(LifecycleOwner p0,c p1,a p2,a p3,LiveGiftEffectGuestModel$b p4,a p5,a p6,e p7){
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p4;
       Object obj4 = p5;
       Object obj5 = p6;
       Object obj6 = p7;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "giftFeedPushModel");
       a.p(obj2, "giftMessageChecker");
       a.p(obj3, "effectMockedJudge");
       a.p(obj4, "effectEngineService");
       a.p(obj5, "serverSignalBlockManager");
       a.p(obj6, "sendGiftTracer");
       super("LiveGiftEffectGuestModel", null, false, false, 14, null);
       i.m = obj1;
       i.n = obj2;
       i.o = p3;
       i.p = obj3;
       i.q = obj4;
       i.r = obj5;
       i.s = obj6;
       i.i = LiveGiftEffectLogTag.LIVE_GIFT_EFFECT.appendTag("LiveGiftEffectGuestModel");
       i.j = new a();
       i.k = 2;
       LiveGiftEffectGuestModel$c uoc = new LiveGiftEffectGuestModel$c(this);
       i.l = uoc;
       obj1.b(obj, new LiveGiftEffectGuestModel$1(this));
       obj4.a(uoc);
    }
}
