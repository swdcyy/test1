package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$stateMachineLazy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import pr1.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleState;
import pr1.g$e;

public final class LiveMultiLineGiftBattleModel$stateMachineLazy$1 extends Lambda implements a	// class@00156e
{
    public final LiveMultiLineGiftBattleModel this$0;

    public void LiveMultiLineGiftBattleModel$stateMachineLazy$1(LiveMultiLineGiftBattleModel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineGiftBattleModel$stateMachineLazy$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(LiveMultiLineGiftBattleState.IDLE, this.this$0.i);
    }
}
