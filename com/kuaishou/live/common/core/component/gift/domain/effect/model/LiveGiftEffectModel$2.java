package com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.LiveGiftEffectModel;
import java.lang.Object;
import java.lang.String;
import di1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftEffectModel$2 implements Model$a	// class@0011b0
{
    public final LiveGiftEffectModel b;

    public void LiveGiftEffectModel$2(LiveGiftEffectModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectModel$2.class, "1")) {
       }else {
          a.p(p0, "source");
          this.b.d("guestModel", p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectModel$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}