package com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate$addComponent$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate$addComponent$2$a;

public final class LiteBottomBubbleAreaMountDelegate$addComponent$2 extends Lambda implements l	// class@00169c
{
    public static final LiteBottomBubbleAreaMountDelegate$addComponent$2 INSTANCE;

    static {
       LiteBottomBubbleAreaMountDelegate$addComponent$2.INSTANCE = new LiteBottomBubbleAreaMountDelegate$addComponent$2();
    }
    public void LiteBottomBubbleAreaMountDelegate$addComponent$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiteBottomBubbleAreaMountDelegate$addComponent$2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LiteBottomBubbleAreaMountDelegate$addComponent$2$a();
    }
}
