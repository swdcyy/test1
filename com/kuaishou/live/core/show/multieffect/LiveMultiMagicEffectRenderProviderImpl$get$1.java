package com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl$get$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.core.show.multieffect.LiveMultiMagicEffectRenderProviderImpl;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiMagicEffectRenderProviderImpl$get$1 extends ContinuationImpl	// class@000d20
{
    public int I$0;
    public Object L$0;
    public int label;
    public Object result;
    public final LiveMultiMagicEffectRenderProviderImpl this$0;

    public void LiveMultiMagicEffectRenderProviderImpl$get$1(LiveMultiMagicEffectRenderProviderImpl p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiMagicEffectRenderProviderImpl$get$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(0, this);
    }
}
