package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$mEffectRenderListener$1;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import pz2.i;
import pz2.e;
import java.lang.IllegalStateException;

public final class LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1 extends SuspendLambda implements p	// class@0010e2
{
    public int label;
    public k0 p$;
    public final LiveMultiMagicEffectManager$mEffectRenderListener$1 this$0;

    public void LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1(LiveMultiMagicEffectManager$mEffectRenderListener$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0.a.a;
       if (p0 != null) {
          p0.e(null);
       }
       p0.a = null;
       p0.b = null;
       return l1.a;
    }
}
