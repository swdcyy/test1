package com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$c;
import py2.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.guest.LiveGiftEffectGuestModel$b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import mi1.b;
import java.util.Objects;
import mi1.b$a;
import di1.a;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class LiveGiftEffectGuestModel$c implements a	// class@0011b6
{
    public final LiveGiftEffectGuestModel b;

    public void LiveGiftEffectGuestModel$c(LiveGiftEffectGuestModel p0){
       this.b = p0;
       super();
    }
    public boolean L3(LiveCommonEffectInfo p0){
       b$a a;
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, LiveGiftEffectGuestModel$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "commonEffectInfo";
       a.p(p0, obj);
       if (this.b.p.a(p0.mergeKey)) {
          b.P(this.b.i, "[commonEffectConsumer][effect hasMocked]");
          return true;
       }else {
          a = b.a;
          Objects.requireNonNull(a);
          Object obj1 = PatchProxy.applyOneRefs(p0, a, b$a.class, "6");
          b = false;
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             a.p(p0, obj);
             LiveCommonEffectInfo effectBiz = p0.effectBiz;
             b1 = (effectBiz != 2 && (effectBiz == 3 || effectBiz == 4))? true: false;
          }
          if (b1) {
             b.P(this.b.i, "[commonEffectConsumer][effect isGiftEffectInfo]");
             LiveGiftEffectGuestModel$c tb = this.b;
             tb.d("commonEffectConsumer", new a(p0, null, null, tb.k));
             return true;
          }else {
             return b;
          }
       }
    }
}
