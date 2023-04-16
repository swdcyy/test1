package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$onCreate$2;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sq1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.CallableReference;
import java.lang.Long;

public final class LiveAudienceMultiLineGiftBattleController$onCreate$2 extends FunctionReferenceImpl implements a	// class@001565
{

    public void LiveAudienceMultiLineGiftBattleController$onCreate$2(a p0){
       super(0, p0, a.class, "getServerTimeMs", "getServerTimeMs\(\)J", 0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$onCreate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.receiver.d();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
