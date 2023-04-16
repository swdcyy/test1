package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lj1.d;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftEffectSelfMockModel$1 implements Model$a	// class@0011b8
{
    public final LiveGiftEffectSelfMockModel b;

    public void LiveGiftEffectSelfMockModel$1(LiveGiftEffectSelfMockModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectSelfMockModel$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null && p2.e()) {
             d uod = p2.c();
             if (uod != null) {
                this.b.g(uod);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectSelfMockModel$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
