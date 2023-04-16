package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$c;
import pr1.g$e;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import pr1.d;
import z1.a;
import oh3.a;

public final class LiveMultiLineGiftBattleModel$c implements g$e	// class@00156d
{
    public final LiveMultiLineGiftBattleModel a;

    public void LiveMultiLineGiftBattleModel$c(LiveMultiLineGiftBattleModel p0){
       this.a = p0;
       super();
    }
    public void a(LiveMultiLineGiftBattleState p0,LiveMultiLineGiftBattleState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLineGiftBattleModel$c.class, "1")) {
          return;
       }
       a.p(p0, "fromState");
       a.p(p1, "toState");
       LiveMultiLineGiftBattleModel$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p1, ta, LiveMultiLineGiftBattleModel.class, "11")) {
          ta.Q(new d(ta, p1));
       }
       return;
    }
}
