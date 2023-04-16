package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$release$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
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
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$a;
import java.util.Set;
import pz2.e;
import java.util.concurrent.CancellationException;
import ftd.l0;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import java.lang.IllegalStateException;

public final class LiveMultiMagicEffectManager$release$1 extends SuspendLambda implements p	// class@0010e4
{
    public int label;
    public k0 p$;
    public final LiveMultiMagicEffectManager this$0;

    public void LiveMultiMagicEffectManager$release$1(LiveMultiMagicEffectManager p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LiveMultiMagicEffectManager$release$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$release$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiMagicEffectManager$release$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$release$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       e obj = PatchProxy.applyOneRefs(p0, this, LiveMultiMagicEffectManager$release$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       LiveMultiMagicEffectManager.k.b("release");
       this.this$0.d.clear();
       p0 = this.this$0.a;
       if (p0 != null) {
          p0.release();
       }
       obj = null;
       p0.a = obj;
       p0.b = obj;
       try{
          l0.f(this.this$0.f, obj, 1, obj);
       }catch(java.lang.Exception e4){
          LiveMultiMagicEffectManager.k.a("[release]e:"+Log.getStackTraceString(e4));
       }
       return l1.a;
    }
}
